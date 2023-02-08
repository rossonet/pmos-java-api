package org.rossonet.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Experiments {

	@Test
	@Order(1)
	public void downloadProcessXml() throws ParseException, IOException {
		final HttpPost httpPost = new HttpPost(
				"https://processi.bottegaio.net/sysdemo/en/neoclassic/login/authentication.php");
		final List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("USR_USERNAME", System.getenv("PMOS_USERNAME")));
		params.add(new BasicNameValuePair("USR_PASSWORD", System.getenv("PMOS_PASSWORD")));
		httpPost.setHeader("Referer", "https://processi.bottegaio.net/sysdemo/en/neoclassic/login/login");
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(httpPost)) {
			for (final Header h : response.getAllHeaders()) {
				System.out.println(h.getName() + " -> " + h.getValue());
			}
		}
	}

}
