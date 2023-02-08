package net.rossonet.pmos.client3;

public interface PmosClient3 extends AutoCloseable {

	public static PmosClient3 getNewClient(String serverBaseUrl, String workspace) {
		return new ProcessMakerClient3(serverBaseUrl, workspace);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#addCaseNote
	 * @param addCaseNoteRequest40
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AddCaseNoteResponse addCaseNote(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AddCaseNoteRequest addCaseNoteRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#assignUserToDepartment
	 * @param assignUserToDepartmentRequest48
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse assignUserToDepartment(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AssignUserToDepartmentRequest assignUserToDepartmentRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#assignUserToGroup
	 * @param assignUserToGroupRequest44
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse assignUserToGroup(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AssignUserToGroupRequest assignUserToGroupRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#cancelCase
	 * @param cancelCaseRequest56
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CancelCaseResponse cancelCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CancelCaseRequest cancelCaseRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#caseList
	 * @param caseListRequest28
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CaseListResponse caseList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CaseListRequest caseListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#claimCase
	 * @param claimCaseRequest42
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ClaimCaseResponse claimCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ClaimCaseRequest claimCaseRequest)

			throws java.rmi.RemoteException;

	void connect(String username, String password) throws ProcessMakerClient3Exception;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#createDepartment
	 * @param createDepartmentRequest38
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateDepartmentResponse createDepartment(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateDepartmentRequest createDepartmentRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#createGroup
	 * @param createGroupRequest10
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateGroupResponse createGroup(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateGroupRequest createGroupRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#createUser
	 * @param createUserRequest50
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateUserResponse createUser(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateUserRequest createUserRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#deleteCase
	 * @param deleteCaseRequest86
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DeleteCaseResponse deleteCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DeleteCaseRequest deleteCaseRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#departmentList
	 * @param departmentListRequest68
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DepartmentListResponse departmentList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DepartmentListRequest departmentListRequest)

			throws java.rmi.RemoteException;

	void disconnect() throws ProcessMakerClient3Exception;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#executeTrigger
	 * @param executeTriggerRequest20
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse executeTrigger(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ExecuteTriggerRequest executeTriggerRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#getCaseInfo
	 * @param getCaseInfoRequest32
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseInfoResponse getCaseInfo(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseInfoRequest getCaseInfoRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#getCaseNotes
	 * @param getCaseNotesRequest54
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseNotesResponse getCaseNotes(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseNotesRequest getCaseNotesRequest)

			throws java.rmi.RemoteException;

	String getServerBaseUrl();

	String getSessionId();

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#getVariables
	 * @param getVariablesRequest60
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesResponse getVariables(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesRequest getVariablesRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#getVariablesNames
	 * @param getVariablesNamesRequest46
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesNamesResponse getVariablesNames(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesNamesRequest getVariablesNamesRequest)

			throws java.rmi.RemoteException;

	String getWorkspace();

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#groupList
	 * @param groupListRequest22
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GroupListResponse groupList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GroupListRequest groupListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#informationUser
	 * @param informationUserRequest52
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InformationUserResponse informationUser(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InformationUserRequest informationUserRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#inputDocumentList
	 * @param inputDocumentListRequest70
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentListResponse inputDocumentList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentListRequest inputDocumentListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#inputDocumentProcessList
	 * @param inputDocumentProcessListRequest16
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentProcessListResponse inputDocumentProcessList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentProcessListRequest inputDocumentProcessListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#newCase
	 * @param newCaseRequest58
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseResponse newCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseRequest newCaseRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#newCaseImpersonate
	 * @param newCaseImpersonateRequest18
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseImpersonateResponse newCaseImpersonate(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseImpersonateRequest newCaseImpersonateRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#outputDocumentList
	 * @param outputDocumentListRequest78
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.OutputDocumentListResponse outputDocumentList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.OutputDocumentListRequest outputDocumentListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#pauseCase
	 * @param pauseCaseRequest34
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PauseCaseResponse pauseCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PauseCaseRequest pauseCaseRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#processList
	 * @param processListRequest8
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ProcessListResponse processList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ProcessListRequest processListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#reassignCase
	 * @param reassignCaseRequest84
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse reassignCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ReassignCaseRequest reassignCaseRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#removeDocument
	 * @param removeDocumentRequest26
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RemoveDocumentResponse removeDocument(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RemoveDocumentRequest removeDocumentRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#removeUserFromGroup
	 * @param removeUserFromGroupRequest64
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse removeUserFromGroup(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RemoveUserFromGroupRequest removeUserFromGroupRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#roleList
	 * @param roleListRequest24
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RoleListResponse roleList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RoleListRequest roleListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#routeCase
	 * @param routeCaseRequest30
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RouteCaseResponse routeCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RouteCaseRequest routeCaseRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#sendMessage
	 * @param sendMessageRequest14
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse sendMessage(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.SendMessageRequest sendMessageRequest)

			throws java.rmi.RemoteException;

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse sendVariables(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.SendVariablesRequest sendVariablesRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#taskCase
	 * @param taskCaseRequest72
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskCaseResponse taskCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskCaseRequest taskCaseRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#taskList
	 * @param taskListRequest62
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskListResponse taskList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskListRequest taskListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#triggerList
	 * @param triggerListRequest76
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TriggerListResponse triggerList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TriggerListRequest triggerListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#unassignedCaseList
	 * @param unassignedCaseListRequest82
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnassignedCaseListResponse unassignedCaseList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnassignedCaseListRequest unassignedCaseListRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#unpauseCase
	 * @param unpauseCaseRequest36
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnpauseCaseResponse unpauseCase(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnpauseCaseRequest unpauseCaseRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#updateUser
	 * @param updateUserRequest12
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UpdateUserResponse updateUser(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UpdateUserRequest updateUserRequest)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @see net.rossonet.pmos.client3.generated.ProcessMakerService#userList
	 * @param userListRequest74
	 * 
	 */

	net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UserListResponse userList(

			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UserListRequest userListRequest)

			throws java.rmi.RemoteException;

}