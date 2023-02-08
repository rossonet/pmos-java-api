/**
 * ProcessMakerServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

package net.rossonet.pmos.client3.generated;

/**
 * ProcessMakerServiceCallbackHandler Callback class, Users can extend this
 * class and implement their own receiveResult and receiveError methods.
 */
public abstract class ProcessMakerServiceCallbackHandler {

	protected Object clientData;

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public ProcessMakerServiceCallbackHandler() {
		this.clientData = null;
	}

	/**
	 * User can pass in any object that needs to be accessed once the NonBlocking
	 * Web service call is finished and appropriate method of this CallBack is
	 * called.
	 * 
	 * @param clientData Object mechanism by which the user can pass in user data
	 *                   that will be avilable at the time this callback is called.
	 */
	public ProcessMakerServiceCallbackHandler(Object clientData) {
		this.clientData = clientData;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from addCaseNote operation
	 */
	public void receiveErroraddCaseNote(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from assignUserToDepartment operation
	 */
	public void receiveErrorassignUserToDepartment(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from assignUserToGroup operation
	 */
	public void receiveErrorassignUserToGroup(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from cancelCase operation
	 */
	public void receiveErrorcancelCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from caseList operation
	 */
	public void receiveErrorcaseList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from claimCase operation
	 */
	public void receiveErrorclaimCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from createDepartment operation
	 */
	public void receiveErrorcreateDepartment(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from createGroup operation
	 */
	public void receiveErrorcreateGroup(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from createUser operation
	 */
	public void receiveErrorcreateUser(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from deleteCase operation
	 */
	public void receiveErrordeleteCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from departmentList operation
	 */
	public void receiveErrordepartmentList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from executeTrigger operation
	 */
	public void receiveErrorexecuteTrigger(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getCaseInfo operation
	 */
	public void receiveErrorgetCaseInfo(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getCaseNotes operation
	 */
	public void receiveErrorgetCaseNotes(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getVariables operation
	 */
	public void receiveErrorgetVariables(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getVariablesNames operation
	 */
	public void receiveErrorgetVariablesNames(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from groupList operation
	 */
	public void receiveErrorgroupList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from informationUser operation
	 */
	public void receiveErrorinformationUser(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from inputDocumentList operation
	 */
	public void receiveErrorinputDocumentList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from inputDocumentProcessList operation
	 */
	public void receiveErrorinputDocumentProcessList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from login operation
	 */
	public void receiveErrorlogin(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from newCase operation
	 */
	public void receiveErrornewCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from newCaseImpersonate operation
	 */
	public void receiveErrornewCaseImpersonate(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from outputDocumentList operation
	 */
	public void receiveErroroutputDocumentList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from pauseCase operation
	 */
	public void receiveErrorpauseCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from processList operation
	 */
	public void receiveErrorprocessList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from reassignCase operation
	 */
	public void receiveErrorreassignCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from removeDocument operation
	 */
	public void receiveErrorremoveDocument(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from removeUserFromGroup operation
	 */
	public void receiveErrorremoveUserFromGroup(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from roleList operation
	 */
	public void receiveErrorroleList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from routeCase operation
	 */
	public void receiveErrorrouteCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from sendMessage operation
	 */
	public void receiveErrorsendMessage(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from sendVariables operation
	 */
	public void receiveErrorsendVariables(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from systemInformation operation
	 */
	public void receiveErrorsystemInformation(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from taskCase operation
	 */
	public void receiveErrortaskCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from taskList operation
	 */
	public void receiveErrortaskList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from triggerList operation
	 */
	public void receiveErrortriggerList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from unassignedCaseList operation
	 */
	public void receiveErrorunassignedCaseList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from unpauseCase operation
	 */
	public void receiveErrorunpauseCase(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from updateUser operation
	 */
	public void receiveErrorupdateUser(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from userList operation
	 */
	public void receiveErroruserList(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for addCaseNote method override this
	 * method for handling normal response from addCaseNote operation
	 */
	public void receiveResultaddCaseNote(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.AddCaseNoteResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for assignUserToDepartment method
	 * override this method for handling normal response from assignUserToDepartment
	 * operation
	 */
	public void receiveResultassignUserToDepartment(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for assignUserToGroup method override
	 * this method for handling normal response from assignUserToGroup operation
	 */
	public void receiveResultassignUserToGroup(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for cancelCase method override this
	 * method for handling normal response from cancelCase operation
	 */
	public void receiveResultcancelCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CancelCaseResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for caseList method override this
	 * method for handling normal response from caseList operation
	 */
	public void receiveResultcaseList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CaseListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for claimCase method override this
	 * method for handling normal response from claimCase operation
	 */
	public void receiveResultclaimCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ClaimCaseResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for createDepartment method override
	 * this method for handling normal response from createDepartment operation
	 */
	public void receiveResultcreateDepartment(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateDepartmentResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for createGroup method override this
	 * method for handling normal response from createGroup operation
	 */
	public void receiveResultcreateGroup(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateGroupResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for createUser method override this
	 * method for handling normal response from createUser operation
	 */
	public void receiveResultcreateUser(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.CreateUserResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for deleteCase method override this
	 * method for handling normal response from deleteCase operation
	 */
	public void receiveResultdeleteCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DeleteCaseResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for departmentList method override this
	 * method for handling normal response from departmentList operation
	 */
	public void receiveResultdepartmentList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.DepartmentListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for executeTrigger method override this
	 * method for handling normal response from executeTrigger operation
	 */
	public void receiveResultexecuteTrigger(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for getCaseInfo method override this
	 * method for handling normal response from getCaseInfo operation
	 */
	public void receiveResultgetCaseInfo(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseInfoResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for getCaseNotes method override this
	 * method for handling normal response from getCaseNotes operation
	 */
	public void receiveResultgetCaseNotes(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetCaseNotesResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for getVariables method override this
	 * method for handling normal response from getVariables operation
	 */
	public void receiveResultgetVariables(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for getVariablesNames method override
	 * this method for handling normal response from getVariablesNames operation
	 */
	public void receiveResultgetVariablesNames(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GetVariablesNamesResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for groupList method override this
	 * method for handling normal response from groupList operation
	 */
	public void receiveResultgroupList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.GroupListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for informationUser method override
	 * this method for handling normal response from informationUser operation
	 */
	public void receiveResultinformationUser(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InformationUserResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for inputDocumentList method override
	 * this method for handling normal response from inputDocumentList operation
	 */
	public void receiveResultinputDocumentList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for inputDocumentProcessList method
	 * override this method for handling normal response from
	 * inputDocumentProcessList operation
	 */
	public void receiveResultinputDocumentProcessList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.InputDocumentProcessListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for login method override this method
	 * for handling normal response from login operation
	 */
	public void receiveResultlogin(net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.LoginResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for newCase method override this method
	 * for handling normal response from newCase operation
	 */
	public void receiveResultnewCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for newCaseImpersonate method override
	 * this method for handling normal response from newCaseImpersonate operation
	 */
	public void receiveResultnewCaseImpersonate(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.NewCaseImpersonateResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for outputDocumentList method override
	 * this method for handling normal response from outputDocumentList operation
	 */
	public void receiveResultoutputDocumentList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.OutputDocumentListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for pauseCase method override this
	 * method for handling normal response from pauseCase operation
	 */
	public void receiveResultpauseCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PauseCaseResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for processList method override this
	 * method for handling normal response from processList operation
	 */
	public void receiveResultprocessList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.ProcessListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for reassignCase method override this
	 * method for handling normal response from reassignCase operation
	 */
	public void receiveResultreassignCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for removeDocument method override this
	 * method for handling normal response from removeDocument operation
	 */
	public void receiveResultremoveDocument(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RemoveDocumentResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for removeUserFromGroup method override
	 * this method for handling normal response from removeUserFromGroup operation
	 */
	public void receiveResultremoveUserFromGroup(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for roleList method override this
	 * method for handling normal response from roleList operation
	 */
	public void receiveResultroleList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RoleListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for routeCase method override this
	 * method for handling normal response from routeCase operation
	 */
	public void receiveResultrouteCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.RouteCaseResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for sendMessage method override this
	 * method for handling normal response from sendMessage operation
	 */
	public void receiveResultsendMessage(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for sendVariables method override this
	 * method for handling normal response from sendVariables operation
	 */
	public void receiveResultsendVariables(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.PmResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for systemInformation method override
	 * this method for handling normal response from systemInformation operation
	 */
	public void receiveResultsystemInformation(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.SystemInformationResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for taskCase method override this
	 * method for handling normal response from taskCase operation
	 */
	public void receiveResulttaskCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskCaseResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for taskList method override this
	 * method for handling normal response from taskList operation
	 */
	public void receiveResulttaskList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TaskListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for triggerList method override this
	 * method for handling normal response from triggerList operation
	 */
	public void receiveResulttriggerList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.TriggerListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for unassignedCaseList method override
	 * this method for handling normal response from unassignedCaseList operation
	 */
	public void receiveResultunassignedCaseList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnassignedCaseListResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for unpauseCase method override this
	 * method for handling normal response from unpauseCase operation
	 */
	public void receiveResultunpauseCase(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UnpauseCaseResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for updateUser method override this
	 * method for handling normal response from updateUser operation
	 */
	public void receiveResultupdateUser(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UpdateUserResponse result) {
	}

	/**
	 * auto generated Axis2 call back method for userList method override this
	 * method for handling normal response from userList operation
	 */
	public void receiveResultuserList(
			net.rossonet.pmos.client3.generated.ProcessMakerServiceStub.UserListResponse result) {
	}

}
