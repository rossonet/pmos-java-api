package org.rossonet.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

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

@TestMethodOrder(OrderAnnotation.class)
public class MainTest {

	private static final Logger logger = Logger.getLogger(MainTest.class.getName());

	@AfterEach
	public void cleanTestsContext() throws Exception {
		logger.info("test completed");
	}

	private PmosClient3 connect() throws ProcessMakerClient3Exception {
		final String endpoint = System.getenv("PMOS_ENDPOINT");
		final PmosClient3 client = PmosClient3.getNewClient(endpoint, "demo");
		final String username = System.getenv("PMOS_USERNAME");
		System.out.println("try username " + username + " at " + endpoint);
		client.connect(username, System.getenv("PMOS_PASSWORD"));
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
