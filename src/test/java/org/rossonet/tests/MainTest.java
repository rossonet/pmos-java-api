package org.rossonet.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.jdom2.Element;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import net.rossonet.pmos.client3.PmosClient3;
import net.rossonet.pmos.client3.ProcessMakerClient3Exception;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InformationUserRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InformationUserResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InformationUserStruct;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ProcessListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ProcessListStruct;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UserListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UserListStruct;
import net.rossonet.pmos.client3.rest.ProcessMakerRestClient.AccessScope;

@TestMethodOrder(OrderAnnotation.class)
public class MainTest {

	private static final Logger logger = Logger.getLogger(MainTest.class.getName());

	@Test
	@Order(4)
	public void checkRestClient() throws Exception {
		final PmosClient3 client = connect();
		client.connectRestApi(System.getenv("PMOS_APP_ID"), System.getenv("PMOS_APP_SECRET"), AccessScope.ALL);
		client.disconnect();
	}

	@AfterEach
	public void cleanTestsContext() throws Exception {
		logger.info("test completed");
	}

	private PmosClient3 connect() throws ProcessMakerClient3Exception {
		final String endpoint = System.getenv("PMOS_ENDPOINT");
		final String username = System.getenv("PMOS_USERNAME");
		System.out.println("try username " + username + " at " + endpoint);
		final PmosClient3 client = PmosClient3.getNewClient(endpoint, "demo", username, System.getenv("PMOS_PASSWORD"));
		client.connect();
		assertNotNull(client.getSessionId());
		System.out.println("sessionId => " + client.getSessionId());
		return client;
	}

	@Test
	@Order(1)
	public void createClient() throws Exception {
		final PmosClient3 client = connect();
		client.disconnect();
	}

	@Test
	@Order(5)
	public void downloadXmlProcess() throws Exception {
		final PmosClient3 client = connect();
		client.connectRestApi(System.getenv("PMOS_APP_ID"), System.getenv("PMOS_APP_SECRET"), AccessScope.ALL);
		final ProcessListRequest processListRequest = new ProcessListRequest();
		final ProcessListStruct[] processList = client.processList(processListRequest).getProcesses();
		for (final ProcessListStruct p : processList) {
			System.out.println("+++++++++++++++++++++++++++++++++++++++");
			System.out.println(p.getGuid() + " -> " + p.getName());
			System.out.println(client.getProcessAsXml(p.getGuid()));
			for (final Element c : client.getProcessAsXmlDocument(p.getGuid()).getRootElement().getChildren()) {
				System.out.println(c.getName() + " -> " + c.getValue());
			}
		}
		client.disconnect();
	}

	@Test
	@Order(6)
	public void getDynaforms() throws Exception {
		final PmosClient3 client = connect();
		client.connectRestApi(System.getenv("PMOS_APP_ID"), System.getenv("PMOS_APP_SECRET"), AccessScope.ALL);
		final ProcessListRequest processListRequest = new ProcessListRequest();
		final ProcessListStruct[] processList = client.processList(processListRequest).getProcesses();
		for (final ProcessListStruct p : processList) {
			System.out.println("---------------------");
			System.out.println(p.getGuid() + " -> " + p.getName());
			final JSONArray dynaforms = client.getDynaforms(p.getGuid());
			System.out.println(dynaforms.toString(2));
			for (int n = 0; n < dynaforms.length(); n++) {
				final String dynUid = dynaforms.getJSONObject(n).getString("dyn_uid");
				final JSONObject dynaform = client.getDynaform(p.getGuid(), dynUid);
				System.out.println(dynaform.toString(2));
			}
		}
		client.disconnect();
	}

	@Test
	@Order(3)
	public void processList() throws Exception {
		final PmosClient3 client = connect();
		final ProcessListRequest processListRequest = new ProcessListRequest();
		final ProcessListStruct[] processList = client.processList(processListRequest).getProcesses();
		int c = 0;
		for (final ProcessListStruct p : processList) {
			System.out.println(c + ". " + p.getGuid() + " -> " + p.getName());
			c++;
		}
		assertTrue(c > 2);
		client.disconnect();
	}

	@Test
	@Order(2)
	public void userList() throws Exception {
		final PmosClient3 client = connect();
		final UserListRequest userListRequest = new UserListRequest();
		final UserListStruct[] users = client.userList(userListRequest).getUsers();
		int c = 1;
		for (final UserListStruct u : users) {
			System.out.println(c + ". " + u.getGuid() + " -> " + u.getName());
			final InformationUserRequest informationUserRequest = new InformationUserRequest();
			informationUserRequest.setUserUid(u.getGuid());
			final InformationUserResponse userInfo = client.informationUser(informationUserRequest);
			for (final InformationUserStruct i : userInfo.getInfo()) {
				System.out.print("\t" + i.getFirstname() + " " + i.getLastname() + " - ");
				System.out.println(i.getMail());
			}
			c++;
		}
		assertTrue(c > 5);
		client.disconnect();
	}

}
