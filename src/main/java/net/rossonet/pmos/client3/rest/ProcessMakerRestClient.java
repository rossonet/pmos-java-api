package net.rossonet.pmos.client3.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.rossonet.utils.LogHelper;

public class ProcessMakerRestClient {

	// Configure access here :
	// https://<server base url>/sys<workspace>/en/neoclassic/oauth2/applications

	// possibili endpoint: https://wiki.processmaker.com/3.0/REST_API_Designer

	public enum AccessScope {
		ALL("*"), EDIT_PROCESS("edit_process"), VIEW_PROCESS("view_process");

		private String scope;

		AccessScope(final String scope) {
			this.scope = scope;
		}

		public String getScope() {
			return scope;
		}
	}

	private static final Logger logger = Logger.getLogger(ProcessMakerRestClient.class.getName());

	private final String applicationId;
	private final String applicationSecret;
	private final String baseUrl;
	private long expire;
	private final String password;
	private String refreshToken;
	private final AccessScope scope;
	private String token;
	private final String username;
	private final String workspace;

	public ProcessMakerRestClient(final String baseUrl, final String workspace, final String applicationId,
			final String applicationSecret, final AccessScope scope, final String username, final String password)
			throws IOException {
		this.baseUrl = baseUrl;
		this.workspace = workspace;
		this.applicationId = applicationId;
		this.applicationSecret = applicationSecret;
		this.scope = scope;
		this.username = username;
		this.password = password;
		findTokens(false);
	}

	public JSONObject getDynaform(final String projectUid, final String dynaformUid)
			throws ParseException, IOException {
		isValid();
		final HttpGet httpGet = new HttpGet(
				baseUrl + "/api/1.0/" + workspace + "/project/" + projectUid + "/dynaform/" + dynaformUid);
		httpGet.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(httpGet)) {
			final HttpEntity entity = response.getEntity();
			final String reply = EntityUtils.toString(entity, "UTF-8");
			final JSONObject jsonObject = new JSONObject(reply);
			final String content = jsonObject.getString("dyn_content");
			jsonObject.remove("dyn_content");
			jsonObject.put("dyn_content", new JSONObject(content));
			return jsonObject;
		}
	}

	public JSONArray getDynaforms(final String projectUid) throws ParseException, IOException {
		isValid();
		final HttpGet httpGet = new HttpGet(
				baseUrl + "/api/1.0/" + workspace + "/project/" + projectUid + "/dynaforms");
		httpGet.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(httpGet)) {
			final HttpEntity entity = response.getEntity();
			final String reply = EntityUtils.toString(entity, "UTF-8");
			return new JSONArray(reply);
		}
	}

	public long getExpire() {
		return expire;
	}

	public String getProcessAsXml(final String projectUid) throws ParseException, IOException {
		isValid();
		final HttpGet httpGet = new HttpGet(baseUrl + "/api/1.0/" + workspace + "/project/" + projectUid + "/export");
		httpGet.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(httpGet)) {
			final HttpEntity entity = response.getEntity();
			final String reply = EntityUtils.toString(entity, "UTF-8");
			return reply;
		}
	}

	public boolean isValid() {
		final long time = new Date().getTime();
		if (expire - 5000 < time) {
			logger.info("refresh expired token [" + expire + "," + time + "]");
			token = null;
			try {
				findTokens(true);
			} catch (final IOException e) {
				logger.severe(LogHelper.stackTraceToString(e));
				return false;
			}
		}
		return (token != null && refreshToken != null && !token.isEmpty() && !refreshToken.isEmpty());
	}

	private void findTokens(final boolean refresh) throws IOException {
		final HttpPost httpPost = new HttpPost(baseUrl + "/" + workspace + "/oauth2/token");
		final List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("grant_type", refresh ? "refresh_token" : "password"));
		params.add(new BasicNameValuePair("client_id", applicationId));
		params.add(new BasicNameValuePair("client_secret", applicationSecret));
		if (refresh) {
			params.add(new BasicNameValuePair("refresh_token", refreshToken));
		} else {
			params.add(new BasicNameValuePair("scope", scope.getScope()));
			params.add(new BasicNameValuePair("username", username));
			params.add(new BasicNameValuePair("password", password));
		}
		final HttpEntity requestEntity = new UrlEncodedFormEntity(params);
		httpPost.setEntity(requestEntity);
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(httpPost)) {
			final HttpEntity entity = response.getEntity();
			final JSONObject jsonReply = new JSONObject(EntityUtils.toString(entity, "UTF-8"));
			token = jsonReply.getString("access_token");
			refreshToken = jsonReply.getString("refresh_token");
			expire = new Date().getTime() + (jsonReply.getInt("expires_in") * 1000);
		}
	}

}
