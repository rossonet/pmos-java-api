
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
	public ProcessMakerServiceCallbackHandler(final Object clientData) {
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
	public void receiveErroraddCaseNote(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from assignUserToDepartment operation
	 */
	public void receiveErrorassignUserToDepartment(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from assignUserToGroup operation
	 */
	public void receiveErrorassignUserToGroup(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from cancelCase operation
	 */
	public void receiveErrorcancelCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from caseList operation
	 */
	public void receiveErrorcaseList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from claimCase operation
	 */
	public void receiveErrorclaimCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from createDepartment operation
	 */
	public void receiveErrorcreateDepartment(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from createGroup operation
	 */
	public void receiveErrorcreateGroup(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from createUser operation
	 */
	public void receiveErrorcreateUser(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from deleteCase operation
	 */
	public void receiveErrordeleteCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from departmentList operation
	 */
	public void receiveErrordepartmentList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from executeTrigger operation
	 */
	public void receiveErrorexecuteTrigger(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getCaseInfo operation
	 */
	public void receiveErrorgetCaseInfo(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getCaseNotes operation
	 */
	public void receiveErrorgetCaseNotes(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getVariables operation
	 */
	public void receiveErrorgetVariables(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from getVariablesNames operation
	 */
	public void receiveErrorgetVariablesNames(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from groupList operation
	 */
	public void receiveErrorgroupList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from informationUser operation
	 */
	public void receiveErrorinformationUser(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from inputDocumentList operation
	 */
	public void receiveErrorinputDocumentList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from inputDocumentProcessList operation
	 */
	public void receiveErrorinputDocumentProcessList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from login operation
	 */
	public void receiveErrorlogin(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from newCase operation
	 */
	public void receiveErrornewCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from newCaseImpersonate operation
	 */
	public void receiveErrornewCaseImpersonate(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from outputDocumentList operation
	 */
	public void receiveErroroutputDocumentList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from pauseCase operation
	 */
	public void receiveErrorpauseCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from processList operation
	 */
	public void receiveErrorprocessList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from reassignCase operation
	 */
	public void receiveErrorreassignCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from removeDocument operation
	 */
	public void receiveErrorremoveDocument(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from removeUserFromGroup operation
	 */
	public void receiveErrorremoveUserFromGroup(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from roleList operation
	 */
	public void receiveErrorroleList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from routeCase operation
	 */
	public void receiveErrorrouteCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from sendMessage operation
	 */
	public void receiveErrorsendMessage(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from sendVariables operation
	 */
	public void receiveErrorsendVariables(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from systemInformation operation
	 */
	public void receiveErrorsystemInformation(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from taskCase operation
	 */
	public void receiveErrortaskCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from taskList operation
	 */
	public void receiveErrortaskList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from triggerList operation
	 */
	public void receiveErrortriggerList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from unassignedCaseList operation
	 */
	public void receiveErrorunassignedCaseList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from unpauseCase operation
	 */
	public void receiveErrorunpauseCase(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from updateUser operation
	 */
	public void receiveErrorupdateUser(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error
	 * response from userList operation
	 */
	public void receiveErroruserList(final java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for addCaseNote method override this
	 * method for handling normal response from addCaseNote operation
	 */
	public void receiveResultaddCaseNote(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for assignUserToDepartment method
	 * override this method for handling normal response from assignUserToDepartment
	 * operation
	 */
	public void receiveResultassignUserToDepartment(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for assignUserToGroup method override
	 * this method for handling normal response from assignUserToGroup operation
	 */
	public void receiveResultassignUserToGroup(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for cancelCase method override this
	 * method for handling normal response from cancelCase operation
	 */
	public void receiveResultcancelCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for caseList method override this
	 * method for handling normal response from caseList operation
	 */
	public void receiveResultcaseList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for claimCase method override this
	 * method for handling normal response from claimCase operation
	 */
	public void receiveResultclaimCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for createDepartment method override
	 * this method for handling normal response from createDepartment operation
	 */
	public void receiveResultcreateDepartment(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for createGroup method override this
	 * method for handling normal response from createGroup operation
	 */
	public void receiveResultcreateGroup(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for createUser method override this
	 * method for handling normal response from createUser operation
	 */
	public void receiveResultcreateUser(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for deleteCase method override this
	 * method for handling normal response from deleteCase operation
	 */
	public void receiveResultdeleteCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for departmentList method override this
	 * method for handling normal response from departmentList operation
	 */
	public void receiveResultdepartmentList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for executeTrigger method override this
	 * method for handling normal response from executeTrigger operation
	 */
	public void receiveResultexecuteTrigger(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for getCaseInfo method override this
	 * method for handling normal response from getCaseInfo operation
	 */
	public void receiveResultgetCaseInfo(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for getCaseNotes method override this
	 * method for handling normal response from getCaseNotes operation
	 */
	public void receiveResultgetCaseNotes(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for getVariables method override this
	 * method for handling normal response from getVariables operation
	 */
	public void receiveResultgetVariables(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for getVariablesNames method override
	 * this method for handling normal response from getVariablesNames operation
	 */
	public void receiveResultgetVariablesNames(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for groupList method override this
	 * method for handling normal response from groupList operation
	 */
	public void receiveResultgroupList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for informationUser method override
	 * this method for handling normal response from informationUser operation
	 */
	public void receiveResultinformationUser(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for inputDocumentList method override
	 * this method for handling normal response from inputDocumentList operation
	 */
	public void receiveResultinputDocumentList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for inputDocumentProcessList method
	 * override this method for handling normal response from
	 * inputDocumentProcessList operation
	 */
	public void receiveResultinputDocumentProcessList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for login method override this method
	 * for handling normal response from login operation
	 */
	public void receiveResultlogin(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for newCase method override this method
	 * for handling normal response from newCase operation
	 */
	public void receiveResultnewCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for newCaseImpersonate method override
	 * this method for handling normal response from newCaseImpersonate operation
	 */
	public void receiveResultnewCaseImpersonate(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for outputDocumentList method override
	 * this method for handling normal response from outputDocumentList operation
	 */
	public void receiveResultoutputDocumentList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for pauseCase method override this
	 * method for handling normal response from pauseCase operation
	 */
	public void receiveResultpauseCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for processList method override this
	 * method for handling normal response from processList operation
	 */
	public void receiveResultprocessList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for reassignCase method override this
	 * method for handling normal response from reassignCase operation
	 */
	public void receiveResultreassignCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for removeDocument method override this
	 * method for handling normal response from removeDocument operation
	 */
	public void receiveResultremoveDocument(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for removeUserFromGroup method override
	 * this method for handling normal response from removeUserFromGroup operation
	 */
	public void receiveResultremoveUserFromGroup(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for roleList method override this
	 * method for handling normal response from roleList operation
	 */
	public void receiveResultroleList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for routeCase method override this
	 * method for handling normal response from routeCase operation
	 */
	public void receiveResultrouteCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for sendMessage method override this
	 * method for handling normal response from sendMessage operation
	 */
	public void receiveResultsendMessage(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for sendVariables method override this
	 * method for handling normal response from sendVariables operation
	 */
	public void receiveResultsendVariables(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for systemInformation method override
	 * this method for handling normal response from systemInformation operation
	 */
	public void receiveResultsystemInformation(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for taskCase method override this
	 * method for handling normal response from taskCase operation
	 */
	public void receiveResulttaskCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for taskList method override this
	 * method for handling normal response from taskList operation
	 */
	public void receiveResulttaskList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for triggerList method override this
	 * method for handling normal response from triggerList operation
	 */
	public void receiveResulttriggerList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for unassignedCaseList method override
	 * this method for handling normal response from unassignedCaseList operation
	 */
	public void receiveResultunassignedCaseList(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for unpauseCase method override this
	 * method for handling normal response from unpauseCase operation
	 */
	public void receiveResultunpauseCase(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for updateUser method override this
	 * method for handling normal response from updateUser operation
	 */
	public void receiveResultupdateUser(final org.apache.axiom.om.OMElement result) {
	}

	/**
	 * auto generated Axis2 call back method for userList method override this
	 * method for handling normal response from userList operation
	 */
	public void receiveResultuserList(final org.apache.axiom.om.OMElement result) {
	}

}
