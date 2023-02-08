package net.rossonet.pmos.client3;

import java.rmi.RemoteException;
import java.util.logging.Logger;

import org.apache.axis2.AxisFault;
import org.rossonet.utils.LogHelper;

import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AddCaseNoteRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AddCaseNoteResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AssignUserToDepartmentRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AssignUserToGroupRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CancelCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CancelCaseResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CaseListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CaseListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ClaimCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ClaimCaseResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateDepartmentRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateDepartmentResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateGroupRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateGroupResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateUserRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateUserResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DeleteCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DeleteCaseResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DepartmentListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DepartmentListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ExecuteTriggerRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseInfoRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseInfoResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseNotesRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseNotesResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesNamesRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesNamesResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GroupListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GroupListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InformationUserRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InformationUserResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentProcessListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentProcessListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.Login;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.LoginResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseImpersonateRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseImpersonateResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.OutputDocumentListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.OutputDocumentListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PauseCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PauseCaseResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ProcessListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ProcessListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ReassignCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RemoveDocumentRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RemoveDocumentResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RemoveUserFromGroupRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RoleListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RoleListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RouteCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RouteCaseResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.SendMessageRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.SendVariablesRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskCaseResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TriggerListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TriggerListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnassignedCaseListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnassignedCaseListResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnpauseCaseRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnpauseCaseResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UpdateUserRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UpdateUserResponse;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UserListRequest;
import net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UserListResponse;

/**
 * documention: https://wiki.processmaker.com/3.3/ProcessMaker_WSDL_Web_Services
 * demo server: https://processi.bottegaio.net/sys/en/neoclassic/
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class ProcessMakerClient3 implements PmosClient3 {
	private static final Logger logger = Logger.getLogger(ProcessMakerClient3.class.getName());
	private ProcessMakerServiceStub client = null;
	private final String soapEndpoint;
	private String sessionId = null;
	private final String workspace;

	private final String serverBaseUrl;

	ProcessMakerClient3(String serverBaseUrl, String workspace) {
		this.workspace = workspace;
		this.serverBaseUrl = serverBaseUrl;
		this.soapEndpoint = serverBaseUrl + "/sys" + workspace + "/en/neoclassic/services/soap2";
	}

	@Override
	public AddCaseNoteResponse addCaseNote(AddCaseNoteRequest addCaseNoteRequest) throws RemoteException {
		checkClient();
		addCaseNoteRequest.setSessionId(sessionId);
		return client.addCaseNote(addCaseNoteRequest);
	}

	@Override
	public PmResponse assignUserToDepartment(AssignUserToDepartmentRequest assignUserToDepartmentRequest)
			throws RemoteException {
		checkClient();
		assignUserToDepartmentRequest.setSessionId(sessionId);
		return client.assignUserToDepartment(assignUserToDepartmentRequest);
	}

	@Override
	public PmResponse assignUserToGroup(AssignUserToGroupRequest assignUserToGroupRequest) throws RemoteException {
		checkClient();
		assignUserToGroupRequest.setSessionId(sessionId);
		return client.assignUserToGroup(assignUserToGroupRequest);
	}

	@Override
	public CancelCaseResponse cancelCase(CancelCaseRequest cancelCaseRequest) throws RemoteException {
		checkClient();
		cancelCaseRequest.setSessionId(sessionId);
		return client.cancelCase(cancelCaseRequest);
	}

	@Override
	public CaseListResponse caseList(CaseListRequest caseListRequest) throws RemoteException {
		checkClient();
		caseListRequest.setSessionId(sessionId);
		return client.caseList(caseListRequest);
	}

	private void checkClient() throws RemoteException {
		if (client == null || sessionId == null) {
			throw new RemoteException("client disconnected");
		}
	}

	@Override
	public ClaimCaseResponse claimCase(ClaimCaseRequest claimCaseRequest) throws RemoteException {
		checkClient();
		claimCaseRequest.setSessionId(sessionId);
		return client.claimCase(claimCaseRequest);
	}

	@Override
	public void close() throws Exception {
		if (client != null) {
			disconnect();
		}

	}

	@Override
	public void connect(String username, String password) throws ProcessMakerClient3Exception {
		if (client == null) {
			try {
				client = new ProcessMakerServiceStub(soapEndpoint);
				final Login loginRequest = new Login();
				loginRequest.setUserid(username);
				loginRequest.setPassword(password);
				final LoginResponse loginResponse = login(loginRequest);
				sessionId = loginResponse.getMessage();
			} catch (final RemoteException e) {
				logger.severe(LogHelper.stackTraceToString(e));
				new ProcessMakerClient3Exception(e);
			}
		} else {
			throw new ProcessMakerClient3Exception("client already connected, please disconnect before");
		}
	}

	@Override
	public CreateDepartmentResponse createDepartment(CreateDepartmentRequest createDepartmentRequest)
			throws RemoteException {
		checkClient();
		createDepartmentRequest.setSessionId(sessionId);
		return client.createDepartment(createDepartmentRequest);
	}

	@Override
	public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) throws RemoteException {
		checkClient();
		createGroupRequest.setSessionId(sessionId);
		return client.createGroup(createGroupRequest);
	}

	@Override
	public CreateUserResponse createUser(CreateUserRequest createUserRequest) throws RemoteException {
		checkClient();
		createUserRequest.setSessionId(sessionId);
		return client.createUser(createUserRequest);
	}

	@Override
	public DeleteCaseResponse deleteCase(DeleteCaseRequest deleteCaseRequest) throws RemoteException {
		checkClient();
		deleteCaseRequest.setSessionId(sessionId);
		return client.deleteCase(deleteCaseRequest);
	}

	@Override
	public DepartmentListResponse departmentList(DepartmentListRequest departmentListRequest) throws RemoteException {
		checkClient();
		departmentListRequest.setSessionId(sessionId);
		return client.departmentList(departmentListRequest);
	}

	@Override
	public void disconnect() throws ProcessMakerClient3Exception {
		if (client != null) {
			try {
				client.cleanup();
				sessionId = null;
				client = null;
			} catch (final AxisFault e) {
				new ProcessMakerClient3Exception(e);
			}
		} else {
			throw new ProcessMakerClient3Exception("client not connected");
		}
	}

	@Override
	public PmResponse executeTrigger(ExecuteTriggerRequest executeTriggerRequest) throws RemoteException {
		checkClient();
		executeTriggerRequest.setSessionId(sessionId);
		return client.executeTrigger(executeTriggerRequest);
	}

	@Override
	public GetCaseInfoResponse getCaseInfo(GetCaseInfoRequest getCaseInfoRequest) throws RemoteException {
		checkClient();
		getCaseInfoRequest.setSessionId(sessionId);
		return client.getCaseInfo(getCaseInfoRequest);
	}

	@Override
	public GetCaseNotesResponse getCaseNotes(GetCaseNotesRequest getCaseNotesRequest) throws RemoteException {
		checkClient();
		getCaseNotesRequest.setSessionId(sessionId);
		return client.getCaseNotes(getCaseNotesRequest);
	}

	public String getSoapEndpoint() {
		return soapEndpoint;
	}

	@Override
	public String getServerBaseUrl() {
		return serverBaseUrl;
	}

	@Override
	public String getSessionId() {
		return sessionId;
	}

	@Override
	public GetVariablesResponse getVariables(GetVariablesRequest getVariablesRequest) throws RemoteException {
		checkClient();
		getVariablesRequest.setSessionId(sessionId);
		return client.getVariables(getVariablesRequest);
	}

	@Override
	public GetVariablesNamesResponse getVariablesNames(GetVariablesNamesRequest getVariablesNamesRequest)
			throws RemoteException {
		checkClient();
		getVariablesNamesRequest.setSessionId(sessionId);
		return client.getVariablesNames(getVariablesNamesRequest);
	}

	@Override
	public String getWorkspace() {
		return workspace;
	}

	@Override
	public GroupListResponse groupList(GroupListRequest groupListRequest) throws RemoteException {
		checkClient();
		groupListRequest.setSessionId(sessionId);
		return client.groupList(groupListRequest);
	}

	@Override
	public InformationUserResponse informationUser(InformationUserRequest informationUserRequest)
			throws RemoteException {
		checkClient();
		informationUserRequest.setSessionId(sessionId);
		return client.informationUser(informationUserRequest);
	}

	@Override
	public InputDocumentListResponse inputDocumentList(InputDocumentListRequest inputDocumentListRequest)
			throws RemoteException {
		checkClient();
		inputDocumentListRequest.setSessionId(sessionId);
		return client.inputDocumentList(inputDocumentListRequest);
	}

	@Override
	public InputDocumentProcessListResponse inputDocumentProcessList(
			InputDocumentProcessListRequest inputDocumentProcessListRequest) throws RemoteException {
		checkClient();
		inputDocumentProcessListRequest.setSessionId(sessionId);
		return client.inputDocumentProcessList(inputDocumentProcessListRequest);
	}

	private LoginResponse login(Login login) throws RemoteException {
		return client.login(login);
	}

	@Override
	public NewCaseResponse newCase(NewCaseRequest newCaseRequest) throws RemoteException {
		checkClient();
		newCaseRequest.setSessionId(sessionId);
		return client.newCase(newCaseRequest);
	}

	@Override
	public NewCaseImpersonateResponse newCaseImpersonate(NewCaseImpersonateRequest newCaseImpersonateRequest)
			throws RemoteException {
		checkClient();
		newCaseImpersonateRequest.setSessionId(sessionId);
		return client.newCaseImpersonate(newCaseImpersonateRequest);
	}

	@Override
	public OutputDocumentListResponse outputDocumentList(OutputDocumentListRequest outputDocumentListRequest)
			throws RemoteException {
		checkClient();
		outputDocumentListRequest.setSessionId(sessionId);
		return client.outputDocumentList(outputDocumentListRequest);
	}

	@Override
	public PauseCaseResponse pauseCase(PauseCaseRequest pauseCaseRequest) throws RemoteException {
		checkClient();
		pauseCaseRequest.setSessionId(sessionId);
		return client.pauseCase(pauseCaseRequest);
	}

	@Override
	public ProcessListResponse processList(ProcessListRequest processListRequest) throws RemoteException {
		checkClient();
		processListRequest.setSessionId(sessionId);
		return client.processList(processListRequest);
	}

	@Override
	public PmResponse reassignCase(ReassignCaseRequest reassignCaseRequest) throws RemoteException {
		checkClient();
		reassignCaseRequest.setSessionId(sessionId);
		return client.reassignCase(reassignCaseRequest);
	}

	@Override
	public RemoveDocumentResponse removeDocument(RemoveDocumentRequest removeDocumentRequest) throws RemoteException {
		checkClient();
		removeDocumentRequest.setSessionId(sessionId);
		return client.removeDocument(removeDocumentRequest);
	}

	@Override
	public PmResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest)
			throws RemoteException {
		checkClient();
		removeUserFromGroupRequest.setSessionId(sessionId);
		return client.removeUserFromGroup(removeUserFromGroupRequest);
	}

	@Override
	public RoleListResponse roleList(RoleListRequest roleListRequest) throws RemoteException {
		checkClient();
		roleListRequest.setSessionId(sessionId);
		return client.roleList(roleListRequest);
	}

	@Override
	public RouteCaseResponse routeCase(RouteCaseRequest routeCaseRequest) throws RemoteException {
		checkClient();
		routeCaseRequest.setSessionId(sessionId);
		return client.routeCase(routeCaseRequest);
	}

	@Override
	public PmResponse sendMessage(SendMessageRequest sendMessageRequest) throws RemoteException {
		checkClient();
		sendMessageRequest.setSessionId(sessionId);
		return client.sendMessage(sendMessageRequest);
	}

	@Override
	public PmResponse sendVariables(SendVariablesRequest sendVariablesRequest) throws RemoteException {
		checkClient();
		sendVariablesRequest.setSessionId(sessionId);
		return client.sendVariables(sendVariablesRequest);
	}

	@Override
	public TaskCaseResponse taskCase(TaskCaseRequest taskCaseRequest) throws RemoteException {
		checkClient();
		taskCaseRequest.setSessionId(sessionId);
		return client.taskCase(taskCaseRequest);
	}

	@Override
	public TaskListResponse taskList(TaskListRequest taskListRequest) throws RemoteException {
		checkClient();
		taskListRequest.setSessionId(sessionId);
		return client.taskList(taskListRequest);
	}

	@Override
	public TriggerListResponse triggerList(TriggerListRequest triggerListRequest) throws RemoteException {
		checkClient();
		triggerListRequest.setSessionId(sessionId);
		return client.triggerList(triggerListRequest);
	}

	@Override
	public UnassignedCaseListResponse unassignedCaseList(UnassignedCaseListRequest unassignedCaseListRequest)
			throws RemoteException {
		checkClient();
		unassignedCaseListRequest.setSessionId(sessionId);
		return client.unassignedCaseList(unassignedCaseListRequest);
	}

	@Override
	public UnpauseCaseResponse unpauseCase(UnpauseCaseRequest unpauseCaseRequest) throws RemoteException {
		checkClient();
		unpauseCaseRequest.setSessionId(sessionId);
		return client.unpauseCase(unpauseCaseRequest);
	}

	@Override
	public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) throws RemoteException {
		checkClient();
		updateUserRequest.setSessionId(sessionId);
		return client.updateUser(updateUserRequest);
	}

	@Override
	public UserListResponse userList(UserListRequest userListRequest) throws RemoteException {
		checkClient();
		userListRequest.setSessionId(sessionId);
		return client.userList(userListRequest);
	}

}
