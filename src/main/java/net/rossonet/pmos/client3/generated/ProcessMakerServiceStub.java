
/**
 * ProcessMakerServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package net.rossonet.pmos.client3.generated;

/*
*  ProcessMakerServiceStub java implementation
*/

public class ProcessMakerServiceStub extends org.apache.axis2.client.Stub {
	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}

	@SuppressWarnings({ "rawtypes" })
	private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	// hashmaps to keep the fault mapping
	@SuppressWarnings({ "rawtypes" })
	private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();

	@SuppressWarnings({ "rawtypes" })
	private final java.util.HashMap faultMessageMap = new java.util.HashMap();

	private final javax.xml.namespace.QName[] opNameArray = null;

	protected org.apache.axis2.description.AxisOperation[] _operations;

	/**
	 * Default Constructor
	 */
	public ProcessMakerServiceStub() throws org.apache.axis2.AxisFault {

		this("https://processi.bottegaio.net/sysdemo/en/neoclassic/services/soap2");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public ProcessMakerServiceStub(final java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Default Constructor
	 */
	public ProcessMakerServiceStub(final org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext, "https://processi.bottegaio.net/sysdemo/en/neoclassic/services/soap2");

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public ProcessMakerServiceStub(final org.apache.axis2.context.ConfigurationContext configurationContext,
			final java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public ProcessMakerServiceStub(final org.apache.axis2.context.ConfigurationContext configurationContext,
			final java.lang.String targetEndpoint, final boolean useSeparateListener)
			throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		// Set the soap version
		_serviceClient.getOptions()
				.setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#addCaseNote
	 * @param addCaseNoteRequest40
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement addCaseNote(

			final org.apache.axiom.om.OMElement addCaseNoteRequest40)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[17].getName());
			_operationClient.getOptions().setAction("urn:addCaseNote");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), addCaseNoteRequest40,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "addCaseNote")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "addCaseNoteRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "addCaseNote"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "addCaseNote"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);

						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "addCaseNote"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#assignUserToDepartment
	 * @param assignUserToDepartmentRequest48
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement assignUserToDepartment(

			final org.apache.axiom.om.OMElement assignUserToDepartmentRequest48)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[21].getName());
			_operationClient.getOptions().setAction("urn:assignUserToDepartment");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					assignUserToDepartmentRequest48,
					optimizeContent(
							new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToDepartment")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToDepartmentRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "assignUserToDepartment"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "assignUserToDepartment"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "assignUserToDepartment"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#cancelCase
	 * @param cancelCaseRequest56
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })

	public org.apache.axiom.om.OMElement cancelCase(

			final org.apache.axiom.om.OMElement cancelCaseRequest56)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[25].getName());
			_operationClient.getOptions().setAction("urn:cancelCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), cancelCaseRequest56,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "cancelCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "cancelCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cancelCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cancelCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cancelCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#caseList
	 * @param caseListRequest28
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement caseList(

			final org.apache.axiom.om.OMElement caseListRequest28)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[11].getName());
			_operationClient.getOptions().setAction("urn:caseList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), caseListRequest28,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "caseList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "caseListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "caseList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "caseList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "caseList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#claimCase
	 * @param claimCaseRequest42
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement claimCase(

			final org.apache.axiom.om.OMElement claimCaseRequest42)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[18].getName());
			_operationClient.getOptions().setAction("urn:claimCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), claimCaseRequest42,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "claimCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "claimCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "claimCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "claimCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "claimCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#createDepartment
	 * @param createDepartmentRequest38
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement createDepartment(

			final org.apache.axiom.om.OMElement createDepartmentRequest38)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[16].getName());
			_operationClient.getOptions().setAction("urn:createDepartment");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createDepartmentRequest38,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "createDepartment")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "createDepartmentRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createDepartment"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createDepartment"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createDepartment"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#createGroup
	 * @param createGroupRequest10
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement createGroup(

			final org.apache.axiom.om.OMElement createGroupRequest10)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("urn:createGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createGroupRequest10,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "createGroup")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "createGroupRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createGroup"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createGroup"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createGroup"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#createUser
	 * @param createUserRequest50
	 *
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public org.apache.axiom.om.OMElement createUser(

			final org.apache.axiom.om.OMElement createUserRequest50)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[22].getName());
			_operationClient.getOptions().setAction("urn:createUser");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createUserRequest50,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "createUser")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "createUserRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createUser"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createUser"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createUser"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#deleteCase
	 * @param deleteCaseRequest86
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement deleteCase(

			final org.apache.axiom.om.OMElement deleteCaseRequest86)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[40].getName());
			_operationClient.getOptions().setAction("urn:deleteCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), deleteCaseRequest86,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "deleteCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "deleteCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#departmentList
	 * @param departmentListRequest68
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement departmentList(

			final org.apache.axiom.om.OMElement departmentListRequest68)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[31].getName());
			_operationClient.getOptions().setAction("urn:departmentList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), departmentListRequest68,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "departmentList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "departmentListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "departmentList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "departmentList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "departmentList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#executeTrigger
	 * @param executeTriggerRequest20
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement executeTrigger(

			final org.apache.axiom.om.OMElement executeTriggerRequest20)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[7].getName());
			_operationClient.getOptions().setAction("urn:executeTrigger");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), executeTriggerRequest20,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "executeTrigger")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "executeTriggerRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "executeTrigger"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "executeTrigger"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "executeTrigger"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#getCaseInfo
	 * @param getCaseInfoRequest32
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement getCaseInfo(

			final org.apache.axiom.om.OMElement getCaseInfoRequest32)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[13].getName());
			_operationClient.getOptions().setAction("urn:getCaseInfo");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getCaseInfoRequest32,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfo")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfoRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseInfo"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseInfo"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseInfo"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#getCaseNotes
	 * @param getCaseNotesRequest54
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement getCaseNotes(

			final org.apache.axiom.om.OMElement getCaseNotesRequest54)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[24].getName());
			_operationClient.getOptions().setAction("urn:getCaseNotes");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getCaseNotesRequest54,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseNotes")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseNotesRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseNotes"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseNotes"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseNotes"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#getVariables
	 * @param getVariablesRequest60
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement getVariables(

			final org.apache.axiom.om.OMElement getVariablesRequest60)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[27].getName());
			_operationClient.getOptions().setAction("urn:getVariables");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getVariablesRequest60,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariables")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariables"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariables"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariables"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#getVariablesNames
	 * @param getVariablesNamesRequest46
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement getVariablesNames(

			final org.apache.axiom.om.OMElement getVariablesNamesRequest46)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[20].getName());
			_operationClient.getOptions().setAction("urn:getVariablesNames");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getVariablesNamesRequest46,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesNames")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesNamesRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariablesNames"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariablesNames"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariablesNames"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#groupList
	 * @param groupListRequest22
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement groupList(

			final org.apache.axiom.om.OMElement groupListRequest22)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[8].getName());
			_operationClient.getOptions().setAction("urn:groupList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), groupListRequest22,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "groupList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "groupListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "groupList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "groupList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "groupList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#informationUser
	 * @param informationUserRequest52
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement informationUser(

			final org.apache.axiom.om.OMElement informationUserRequest52)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[23].getName());
			_operationClient.getOptions().setAction("urn:informationUser");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), informationUserRequest52,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "informationUser")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "informationUserRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "informationUser"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "informationUser"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "informationUser"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#inputDocumentList
	 * @param inputDocumentListRequest70
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement inputDocumentList(

			final org.apache.axiom.om.OMElement inputDocumentListRequest70)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[32].getName());
			_operationClient.getOptions().setAction("urn:inputDocumentList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), inputDocumentListRequest70,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "inputDocumentList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "inputDocumentList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "inputDocumentList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#inputDocumentProcessList
	 * @param inputDocumentProcessListRequest16
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement inputDocumentProcessList(

			final org.apache.axiom.om.OMElement inputDocumentProcessListRequest16)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[5].getName());
			_operationClient.getOptions().setAction("urn:inputDocumentProcessList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					inputDocumentProcessListRequest16,
					optimizeContent(
							new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "inputDocumentProcessList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"inputDocumentProcessList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"inputDocumentProcessList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#login
	 * @param login66
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement login(

			final org.apache.axiom.om.OMElement login66)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[30].getName());
			_operationClient.getOptions().setAction("http://www.processmaker.com/login");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), login66,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "login")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "login"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#newCase
	 * @param newCaseRequest58
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement newCase(

			final org.apache.axiom.om.OMElement newCaseRequest58)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[26].getName());
			_operationClient.getOptions().setAction("urn:newCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), newCaseRequest58,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "newCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#newCaseImpersonate
	 * @param newCaseImpersonateRequest18
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement newCaseImpersonate(

			final org.apache.axiom.om.OMElement newCaseImpersonateRequest18)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[6].getName());
			_operationClient.getOptions().setAction("urn:newCaseImpersonate");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), newCaseImpersonateRequest18,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseImpersonate")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseImpersonateRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCaseImpersonate"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCaseImpersonate"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCaseImpersonate"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#outputDocumentList
	 * @param outputDocumentListRequest78
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement outputDocumentList(

			final org.apache.axiom.om.OMElement outputDocumentListRequest78)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[36].getName());
			_operationClient.getOptions().setAction("urn:outputDocumentList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), outputDocumentListRequest78,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "outputDocumentList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "outputDocumentList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "outputDocumentList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#pauseCase
	 * @param pauseCaseRequest34
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement pauseCase(

			final org.apache.axiom.om.OMElement pauseCaseRequest34)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[14].getName());
			_operationClient.getOptions().setAction("urn:pauseCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), pauseCaseRequest34,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "pauseCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "pauseCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "pauseCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "pauseCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "pauseCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#processList
	 * @param processListRequest8
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement processList(

			final org.apache.axiom.om.OMElement processListRequest8)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("urn:processList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), processListRequest8,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "processList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "processListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "processList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "processList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "processList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#reassignCase
	 * @param reassignCaseRequest84
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement reassignCase(

			final org.apache.axiom.om.OMElement reassignCaseRequest84)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[39].getName());
			_operationClient.getOptions().setAction("urn:reassignCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), reassignCaseRequest84,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "reassignCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "reassignCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "reassignCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "reassignCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "reassignCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#removeDocument
	 * @param removeDocumentRequest26
	 *
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement removeDocument(

			final org.apache.axiom.om.OMElement removeDocumentRequest26)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[10].getName());
			_operationClient.getOptions().setAction("urn:removeDocument");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), removeDocumentRequest26,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "removeDocument")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "removeDocumentRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeDocument"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeDocument"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeDocument"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#removeUserFromGroup
	 * @param removeUserFromGroupRequest64
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement removeUserFromGroup(

			final org.apache.axiom.om.OMElement removeUserFromGroupRequest64)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[29].getName());
			_operationClient.getOptions().setAction("urn:removeUserFromGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					removeUserFromGroupRequest64,
					optimizeContent(
							new javax.xml.namespace.QName("http://www.processmaker.com", "removeUserFromGroup")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "removeUserFromGroupRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeUserFromGroup"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeUserFromGroup"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeUserFromGroup"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#roleList
	 * @param roleListRequest24
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement roleList(

			final org.apache.axiom.om.OMElement roleListRequest24)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[9].getName());
			_operationClient.getOptions().setAction("urn:roleList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), roleListRequest24,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "roleList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "roleListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "roleList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "roleList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "roleList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#routeCase
	 * @param routeCaseRequest30
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement routeCase(

			final org.apache.axiom.om.OMElement routeCaseRequest30)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[12].getName());
			_operationClient.getOptions().setAction("urn:routeCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), routeCaseRequest30,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "routeCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "routeCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "routeCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "routeCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "routeCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#sendMessage
	 * @param sendMessageRequest14
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement sendMessage(

			final org.apache.axiom.om.OMElement sendMessageRequest14)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction("urn:sendMessage");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), sendMessageRequest14,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "sendMessage")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "sendMessageRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendMessage"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendMessage"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendMessage"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#sendVariables
	 * @param sendVariablesRequest6
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement sendVariables(

			final org.apache.axiom.om.OMElement sendVariablesRequest6)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("urn:sendVariables");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), sendVariablesRequest6,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "sendVariables")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "sendVariablesRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendVariables"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendVariables"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendVariables"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startaddCaseNote
	 * @param addCaseNoteRequest40
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startaddCaseNote(

			final org.apache.axiom.om.OMElement addCaseNoteRequest40,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[17].getName());
		_operationClient.getOptions().setAction("urn:addCaseNote");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), addCaseNoteRequest40,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "addCaseNote")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "addCaseNoteRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroraddCaseNote(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "addCaseNote"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"addCaseNote"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "addCaseNote"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroraddCaseNote(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroraddCaseNote(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroraddCaseNote(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroraddCaseNote(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroraddCaseNote(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroraddCaseNote(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroraddCaseNote(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroraddCaseNote(f);
							}
						} else {
							callback.receiveErroraddCaseNote(f);
						}
					} else {
						callback.receiveErroraddCaseNote(f);
					}
				} else {
					callback.receiveErroraddCaseNote(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultaddCaseNote((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErroraddCaseNote(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[17].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[17].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startassignUserToDepartment
	 * @param assignUserToDepartmentRequest48
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startassignUserToDepartment(

			final org.apache.axiom.om.OMElement assignUserToDepartmentRequest48,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[21].getName());
		_operationClient.getOptions().setAction("urn:assignUserToDepartment");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), assignUserToDepartmentRequest48,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToDepartment")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToDepartmentRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorassignUserToDepartment(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "assignUserToDepartment"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"assignUserToDepartment"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"assignUserToDepartment"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorassignUserToDepartment(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToDepartment(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToDepartment(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToDepartment(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToDepartment(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToDepartment(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToDepartment(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToDepartment(f);
							}
						} else {
							callback.receiveErrorassignUserToDepartment(f);
						}
					} else {
						callback.receiveErrorassignUserToDepartment(f);
					}
				} else {
					callback.receiveErrorassignUserToDepartment(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultassignUserToDepartment((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorassignUserToDepartment(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[21].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[21].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startassignUserToGroup
	 * @param assignUserToGroupRequest44
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startassignUserToGroup(

			final org.apache.axiom.om.OMElement assignUserToGroupRequest44,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[19].getName());
		_operationClient.getOptions().setAction("urn:assignUserToGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), assignUserToGroupRequest44,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToGroup")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToGroupRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorassignUserToGroup(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "assignUserToGroup"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"assignUserToGroup"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"assignUserToGroup"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorassignUserToGroup(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToGroup(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToGroup(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToGroup(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToGroup(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToGroup(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToGroup(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorassignUserToGroup(f);
							}
						} else {
							callback.receiveErrorassignUserToGroup(f);
						}
					} else {
						callback.receiveErrorassignUserToGroup(f);
					}
				} else {
					callback.receiveErrorassignUserToGroup(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultassignUserToGroup((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorassignUserToGroup(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[19].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[19].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startcancelCase
	 * @param cancelCaseRequest56
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startcancelCase(

			final org.apache.axiom.om.OMElement cancelCaseRequest56,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[25].getName());
		_operationClient.getOptions().setAction("urn:cancelCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), cancelCaseRequest56,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "cancelCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "cancelCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcancelCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cancelCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"cancelCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "cancelCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorcancelCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelCase(f);
							}
						} else {
							callback.receiveErrorcancelCase(f);
						}
					} else {
						callback.receiveErrorcancelCase(f);
					}
				} else {
					callback.receiveErrorcancelCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultcancelCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorcancelCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[25].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[25].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startcaseList
	 * @param caseListRequest28
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startcaseList(

			final org.apache.axiom.om.OMElement caseListRequest28,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[11].getName());
		_operationClient.getOptions().setAction("urn:caseList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), caseListRequest28,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "caseList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "caseListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcaseList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "caseList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "caseList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "caseList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorcaseList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcaseList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcaseList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcaseList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcaseList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcaseList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcaseList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcaseList(f);
							}
						} else {
							callback.receiveErrorcaseList(f);
						}
					} else {
						callback.receiveErrorcaseList(f);
					}
				} else {
					callback.receiveErrorcaseList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultcaseList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorcaseList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[11].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[11].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startclaimCase
	 * @param claimCaseRequest42
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startclaimCase(

			final org.apache.axiom.om.OMElement claimCaseRequest42,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[18].getName());
		_operationClient.getOptions().setAction("urn:claimCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), claimCaseRequest42,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "claimCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "claimCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorclaimCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "claimCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "claimCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "claimCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorclaimCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorclaimCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorclaimCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorclaimCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorclaimCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorclaimCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorclaimCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorclaimCase(f);
							}
						} else {
							callback.receiveErrorclaimCase(f);
						}
					} else {
						callback.receiveErrorclaimCase(f);
					}
				} else {
					callback.receiveErrorclaimCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultclaimCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorclaimCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[18].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[18].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startcreateDepartment
	 * @param createDepartmentRequest38
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startcreateDepartment(

			final org.apache.axiom.om.OMElement createDepartmentRequest38,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[16].getName());
		_operationClient.getOptions().setAction("urn:createDepartment");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createDepartmentRequest38,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "createDepartment")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "createDepartmentRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcreateDepartment(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createDepartment"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"createDepartment"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"createDepartment"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorcreateDepartment(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateDepartment(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateDepartment(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateDepartment(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateDepartment(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateDepartment(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateDepartment(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateDepartment(f);
							}
						} else {
							callback.receiveErrorcreateDepartment(f);
						}
					} else {
						callback.receiveErrorcreateDepartment(f);
					}
				} else {
					callback.receiveErrorcreateDepartment(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultcreateDepartment((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorcreateDepartment(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[16].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[16].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startcreateGroup
	 * @param createGroupRequest10
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startcreateGroup(

			final org.apache.axiom.om.OMElement createGroupRequest10,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("urn:createGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createGroupRequest10,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "createGroup")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "createGroupRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcreateGroup(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createGroup"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"createGroup"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createGroup"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorcreateGroup(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateGroup(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateGroup(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateGroup(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateGroup(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateGroup(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateGroup(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateGroup(f);
							}
						} else {
							callback.receiveErrorcreateGroup(f);
						}
					} else {
						callback.receiveErrorcreateGroup(f);
					}
				} else {
					callback.receiveErrorcreateGroup(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultcreateGroup((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorcreateGroup(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startcreateUser
	 * @param createUserRequest50
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startcreateUser(

			final org.apache.axiom.om.OMElement createUserRequest50,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[22].getName());
		_operationClient.getOptions().setAction("urn:createUser");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createUserRequest50,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "createUser")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "createUserRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcreateUser(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createUser"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"createUser"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "createUser"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorcreateUser(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateUser(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateUser(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateUser(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateUser(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateUser(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateUser(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateUser(f);
							}
						} else {
							callback.receiveErrorcreateUser(f);
						}
					} else {
						callback.receiveErrorcreateUser(f);
					}
				} else {
					callback.receiveErrorcreateUser(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultcreateUser((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorcreateUser(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[22].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[22].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startdeleteCase
	 * @param deleteCaseRequest86
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startdeleteCase(

			final org.apache.axiom.om.OMElement deleteCaseRequest86,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[40].getName());
		_operationClient.getOptions().setAction("urn:deleteCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), deleteCaseRequest86,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "deleteCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "deleteCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrordeleteCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"deleteCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "deleteCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrordeleteCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordeleteCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordeleteCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordeleteCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordeleteCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordeleteCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordeleteCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordeleteCase(f);
							}
						} else {
							callback.receiveErrordeleteCase(f);
						}
					} else {
						callback.receiveErrordeleteCase(f);
					}
				} else {
					callback.receiveErrordeleteCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultdeleteCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrordeleteCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[40].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[40].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startdepartmentList
	 * @param departmentListRequest68
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startdepartmentList(

			final org.apache.axiom.om.OMElement departmentListRequest68,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[31].getName());
		_operationClient.getOptions().setAction("urn:departmentList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), departmentListRequest68,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "departmentList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "departmentListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrordepartmentList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "departmentList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"departmentList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "departmentList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrordepartmentList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordepartmentList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordepartmentList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordepartmentList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordepartmentList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordepartmentList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordepartmentList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrordepartmentList(f);
							}
						} else {
							callback.receiveErrordepartmentList(f);
						}
					} else {
						callback.receiveErrordepartmentList(f);
					}
				} else {
					callback.receiveErrordepartmentList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultdepartmentList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrordepartmentList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[31].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[31].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startexecuteTrigger
	 * @param executeTriggerRequest20
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startexecuteTrigger(

			final org.apache.axiom.om.OMElement executeTriggerRequest20,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[7].getName());
		_operationClient.getOptions().setAction("urn:executeTrigger");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), executeTriggerRequest20,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "executeTrigger")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "executeTriggerRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorexecuteTrigger(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "executeTrigger"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"executeTrigger"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "executeTrigger"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorexecuteTrigger(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorexecuteTrigger(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorexecuteTrigger(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorexecuteTrigger(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorexecuteTrigger(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorexecuteTrigger(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorexecuteTrigger(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorexecuteTrigger(f);
							}
						} else {
							callback.receiveErrorexecuteTrigger(f);
						}
					} else {
						callback.receiveErrorexecuteTrigger(f);
					}
				} else {
					callback.receiveErrorexecuteTrigger(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultexecuteTrigger((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorexecuteTrigger(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[7].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[7].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startgetCaseInfo
	 * @param getCaseInfoRequest32
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startgetCaseInfo(

			final org.apache.axiom.om.OMElement getCaseInfoRequest32,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[13].getName());
		_operationClient.getOptions().setAction("urn:getCaseInfo");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getCaseInfoRequest32,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfo")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfoRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetCaseInfo(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseInfo"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getCaseInfo"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseInfo"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorgetCaseInfo(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseInfo(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseInfo(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseInfo(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseInfo(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseInfo(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseInfo(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseInfo(f);
							}
						} else {
							callback.receiveErrorgetCaseInfo(f);
						}
					} else {
						callback.receiveErrorgetCaseInfo(f);
					}
				} else {
					callback.receiveErrorgetCaseInfo(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultgetCaseInfo((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetCaseInfo(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[13].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[13].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startgetCaseNotes
	 * @param getCaseNotesRequest54
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startgetCaseNotes(

			final org.apache.axiom.om.OMElement getCaseNotesRequest54,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[24].getName());
		_operationClient.getOptions().setAction("urn:getCaseNotes");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getCaseNotesRequest54,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseNotes")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseNotesRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetCaseNotes(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseNotes"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getCaseNotes"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCaseNotes"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorgetCaseNotes(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseNotes(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseNotes(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseNotes(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseNotes(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseNotes(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseNotes(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetCaseNotes(f);
							}
						} else {
							callback.receiveErrorgetCaseNotes(f);
						}
					} else {
						callback.receiveErrorgetCaseNotes(f);
					}
				} else {
					callback.receiveErrorgetCaseNotes(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultgetCaseNotes((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetCaseNotes(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[24].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[24].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startgetVariables
	 * @param getVariablesRequest60
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startgetVariables(

			final org.apache.axiom.om.OMElement getVariablesRequest60,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[27].getName());
		_operationClient.getOptions().setAction("urn:getVariables");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getVariablesRequest60,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariables")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetVariables(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariables"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getVariables"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariables"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorgetVariables(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariables(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariables(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariables(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariables(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariables(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariables(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariables(f);
							}
						} else {
							callback.receiveErrorgetVariables(f);
						}
					} else {
						callback.receiveErrorgetVariables(f);
					}
				} else {
					callback.receiveErrorgetVariables(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultgetVariables((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetVariables(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[27].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[27].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startgetVariablesNames
	 * @param getVariablesNamesRequest46
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startgetVariablesNames(

			final org.apache.axiom.om.OMElement getVariablesNamesRequest46,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[20].getName());
		_operationClient.getOptions().setAction("urn:getVariablesNames");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getVariablesNamesRequest46,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesNames")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesNamesRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetVariablesNames(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getVariablesNames"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getVariablesNames"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getVariablesNames"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorgetVariablesNames(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariablesNames(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariablesNames(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariablesNames(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariablesNames(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariablesNames(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariablesNames(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetVariablesNames(f);
							}
						} else {
							callback.receiveErrorgetVariablesNames(f);
						}
					} else {
						callback.receiveErrorgetVariablesNames(f);
					}
				} else {
					callback.receiveErrorgetVariablesNames(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultgetVariablesNames((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetVariablesNames(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[20].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[20].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startgroupList
	 * @param groupListRequest22
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startgroupList(

			final org.apache.axiom.om.OMElement groupListRequest22,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[8].getName());
		_operationClient.getOptions().setAction("urn:groupList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), groupListRequest22,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "groupList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "groupListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgroupList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "groupList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "groupList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "groupList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorgroupList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgroupList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgroupList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgroupList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgroupList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgroupList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgroupList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgroupList(f);
							}
						} else {
							callback.receiveErrorgroupList(f);
						}
					} else {
						callback.receiveErrorgroupList(f);
					}
				} else {
					callback.receiveErrorgroupList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultgroupList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorgroupList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[8].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[8].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startinformationUser
	 * @param informationUserRequest52
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startinformationUser(

			final org.apache.axiom.om.OMElement informationUserRequest52,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[23].getName());
		_operationClient.getOptions().setAction("urn:informationUser");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), informationUserRequest52,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "informationUser")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "informationUserRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorinformationUser(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "informationUser"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"informationUser"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"informationUser"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorinformationUser(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinformationUser(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinformationUser(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinformationUser(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinformationUser(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinformationUser(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinformationUser(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinformationUser(f);
							}
						} else {
							callback.receiveErrorinformationUser(f);
						}
					} else {
						callback.receiveErrorinformationUser(f);
					}
				} else {
					callback.receiveErrorinformationUser(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultinformationUser((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorinformationUser(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[23].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[23].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startinputDocumentList
	 * @param inputDocumentListRequest70
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startinputDocumentList(

			final org.apache.axiom.om.OMElement inputDocumentListRequest70,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[32].getName());
		_operationClient.getOptions().setAction("urn:inputDocumentList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), inputDocumentListRequest70,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorinputDocumentList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "inputDocumentList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"inputDocumentList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"inputDocumentList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorinputDocumentList(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentList(f);
							}
						} else {
							callback.receiveErrorinputDocumentList(f);
						}
					} else {
						callback.receiveErrorinputDocumentList(f);
					}
				} else {
					callback.receiveErrorinputDocumentList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultinputDocumentList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorinputDocumentList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[32].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[32].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startinputDocumentProcessList
	 * @param inputDocumentProcessListRequest16
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startinputDocumentProcessList(

			final org.apache.axiom.om.OMElement inputDocumentProcessListRequest16,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[5].getName());
		_operationClient.getOptions().setAction("urn:inputDocumentProcessList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				inputDocumentProcessListRequest16,
				optimizeContent(
						new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorinputDocumentProcessList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "inputDocumentProcessList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"inputDocumentProcessList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"inputDocumentProcessList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorinputDocumentProcessList(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentProcessList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentProcessList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentProcessList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentProcessList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentProcessList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentProcessList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorinputDocumentProcessList(f);
							}
						} else {
							callback.receiveErrorinputDocumentProcessList(f);
						}
					} else {
						callback.receiveErrorinputDocumentProcessList(f);
					}
				} else {
					callback.receiveErrorinputDocumentProcessList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultinputDocumentProcessList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorinputDocumentProcessList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[5].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[5].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startlogin
	 * @param login66
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startlogin(

			final org.apache.axiom.om.OMElement login66,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[30].getName());
		_operationClient.getOptions().setAction("http://www.processmaker.com/login");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), login66,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "login")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "login"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorlogin(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap
								.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "login"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorlogin(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogin(f);
							}
						} else {
							callback.receiveErrorlogin(f);
						}
					} else {
						callback.receiveErrorlogin(f);
					}
				} else {
					callback.receiveErrorlogin(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultlogin((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorlogin(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[30].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[30].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startnewCase
	 * @param newCaseRequest58
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startnewCase(

			final org.apache.axiom.om.OMElement newCaseRequest58,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[26].getName());
		_operationClient.getOptions().setAction("urn:newCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), newCaseRequest58,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "newCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrornewCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap
								.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrornewCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCase(f);
							}
						} else {
							callback.receiveErrornewCase(f);
						}
					} else {
						callback.receiveErrornewCase(f);
					}
				} else {
					callback.receiveErrornewCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultnewCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrornewCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[26].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[26].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startnewCaseImpersonate
	 * @param newCaseImpersonateRequest18
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startnewCaseImpersonate(

			final org.apache.axiom.om.OMElement newCaseImpersonateRequest18,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[6].getName());
		_operationClient.getOptions().setAction("urn:newCaseImpersonate");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), newCaseImpersonateRequest18,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseImpersonate")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseImpersonateRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrornewCaseImpersonate(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "newCaseImpersonate"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"newCaseImpersonate"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"newCaseImpersonate"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrornewCaseImpersonate(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCaseImpersonate(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCaseImpersonate(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCaseImpersonate(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCaseImpersonate(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCaseImpersonate(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCaseImpersonate(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrornewCaseImpersonate(f);
							}
						} else {
							callback.receiveErrornewCaseImpersonate(f);
						}
					} else {
						callback.receiveErrornewCaseImpersonate(f);
					}
				} else {
					callback.receiveErrornewCaseImpersonate(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultnewCaseImpersonate((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrornewCaseImpersonate(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[6].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[6].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startoutputDocumentList
	 * @param outputDocumentListRequest78
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startoutputDocumentList(

			final org.apache.axiom.om.OMElement outputDocumentListRequest78,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[36].getName());
		_operationClient.getOptions().setAction("urn:outputDocumentList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), outputDocumentListRequest78,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroroutputDocumentList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "outputDocumentList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"outputDocumentList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"outputDocumentList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroroutputDocumentList(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroroutputDocumentList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroroutputDocumentList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroroutputDocumentList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroroutputDocumentList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroroutputDocumentList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroroutputDocumentList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroroutputDocumentList(f);
							}
						} else {
							callback.receiveErroroutputDocumentList(f);
						}
					} else {
						callback.receiveErroroutputDocumentList(f);
					}
				} else {
					callback.receiveErroroutputDocumentList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultoutputDocumentList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErroroutputDocumentList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[36].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[36].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startpauseCase
	 * @param pauseCaseRequest34
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startpauseCase(

			final org.apache.axiom.om.OMElement pauseCaseRequest34,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[14].getName());
		_operationClient.getOptions().setAction("urn:pauseCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), pauseCaseRequest34,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "pauseCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "pauseCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorpauseCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "pauseCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "pauseCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "pauseCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorpauseCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorpauseCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorpauseCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorpauseCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorpauseCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorpauseCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorpauseCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorpauseCase(f);
							}
						} else {
							callback.receiveErrorpauseCase(f);
						}
					} else {
						callback.receiveErrorpauseCase(f);
					}
				} else {
					callback.receiveErrorpauseCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultpauseCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorpauseCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[14].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[14].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startprocessList
	 * @param processListRequest8
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startprocessList(

			final org.apache.axiom.om.OMElement processListRequest8,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("urn:processList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), processListRequest8,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "processList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "processListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorprocessList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "processList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"processList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "processList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorprocessList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorprocessList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorprocessList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorprocessList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorprocessList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorprocessList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorprocessList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorprocessList(f);
							}
						} else {
							callback.receiveErrorprocessList(f);
						}
					} else {
						callback.receiveErrorprocessList(f);
					}
				} else {
					callback.receiveErrorprocessList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultprocessList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorprocessList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startreassignCase
	 * @param reassignCaseRequest84
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startreassignCase(

			final org.apache.axiom.om.OMElement reassignCaseRequest84,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[39].getName());
		_operationClient.getOptions().setAction("urn:reassignCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), reassignCaseRequest84,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "reassignCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "reassignCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorreassignCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "reassignCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"reassignCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "reassignCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorreassignCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorreassignCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorreassignCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorreassignCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorreassignCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorreassignCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorreassignCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorreassignCase(f);
							}
						} else {
							callback.receiveErrorreassignCase(f);
						}
					} else {
						callback.receiveErrorreassignCase(f);
					}
				} else {
					callback.receiveErrorreassignCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultreassignCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorreassignCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[39].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[39].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startremoveDocument
	 * @param removeDocumentRequest26
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startremoveDocument(

			final org.apache.axiom.om.OMElement removeDocumentRequest26,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[10].getName());
		_operationClient.getOptions().setAction("urn:removeDocument");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), removeDocumentRequest26,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "removeDocument")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "removeDocumentRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorremoveDocument(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeDocument"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"removeDocument"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeDocument"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorremoveDocument(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveDocument(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveDocument(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveDocument(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveDocument(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveDocument(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveDocument(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveDocument(f);
							}
						} else {
							callback.receiveErrorremoveDocument(f);
						}
					} else {
						callback.receiveErrorremoveDocument(f);
					}
				} else {
					callback.receiveErrorremoveDocument(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultremoveDocument((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorremoveDocument(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[10].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[10].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startremoveUserFromGroup
	 * @param removeUserFromGroupRequest64
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startremoveUserFromGroup(

			final org.apache.axiom.om.OMElement removeUserFromGroupRequest64,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[29].getName());
		_operationClient.getOptions().setAction("urn:removeUserFromGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), removeUserFromGroupRequest64,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "removeUserFromGroup")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "removeUserFromGroupRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorremoveUserFromGroup(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "removeUserFromGroup"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"removeUserFromGroup"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"removeUserFromGroup"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorremoveUserFromGroup(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveUserFromGroup(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveUserFromGroup(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveUserFromGroup(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveUserFromGroup(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveUserFromGroup(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveUserFromGroup(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorremoveUserFromGroup(f);
							}
						} else {
							callback.receiveErrorremoveUserFromGroup(f);
						}
					} else {
						callback.receiveErrorremoveUserFromGroup(f);
					}
				} else {
					callback.receiveErrorremoveUserFromGroup(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultremoveUserFromGroup((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorremoveUserFromGroup(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[29].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[29].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startroleList
	 * @param roleListRequest24
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startroleList(

			final org.apache.axiom.om.OMElement roleListRequest24,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[9].getName());
		_operationClient.getOptions().setAction("urn:roleList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), roleListRequest24,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "roleList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "roleListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorroleList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "roleList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "roleList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "roleList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorroleList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorroleList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorroleList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorroleList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorroleList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorroleList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorroleList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorroleList(f);
							}
						} else {
							callback.receiveErrorroleList(f);
						}
					} else {
						callback.receiveErrorroleList(f);
					}
				} else {
					callback.receiveErrorroleList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultroleList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorroleList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[9].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[9].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startrouteCase
	 * @param routeCaseRequest30
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startrouteCase(

			final org.apache.axiom.om.OMElement routeCaseRequest30,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[12].getName());
		_operationClient.getOptions().setAction("urn:routeCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), routeCaseRequest30,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "routeCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "routeCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorrouteCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "routeCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "routeCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "routeCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorrouteCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorrouteCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorrouteCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorrouteCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorrouteCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorrouteCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorrouteCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorrouteCase(f);
							}
						} else {
							callback.receiveErrorrouteCase(f);
						}
					} else {
						callback.receiveErrorrouteCase(f);
					}
				} else {
					callback.receiveErrorrouteCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultrouteCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorrouteCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[12].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[12].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startsendMessage
	 * @param sendMessageRequest14
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startsendMessage(

			final org.apache.axiom.om.OMElement sendMessageRequest14,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction("urn:sendMessage");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), sendMessageRequest14,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "sendMessage")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "sendMessageRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorsendMessage(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendMessage"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"sendMessage"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendMessage"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorsendMessage(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendMessage(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendMessage(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendMessage(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendMessage(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendMessage(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendMessage(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendMessage(f);
							}
						} else {
							callback.receiveErrorsendMessage(f);
						}
					} else {
						callback.receiveErrorsendMessage(f);
					}
				} else {
					callback.receiveErrorsendMessage(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultsendMessage((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorsendMessage(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startsendVariables
	 * @param sendVariablesRequest6
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startsendVariables(

			final org.apache.axiom.om.OMElement sendVariablesRequest6,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("urn:sendVariables");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), sendVariablesRequest6,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "sendVariables")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "sendVariablesRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorsendVariables(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendVariables"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"sendVariables"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "sendVariables"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorsendVariables(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendVariables(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendVariables(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendVariables(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendVariables(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendVariables(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendVariables(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsendVariables(f);
							}
						} else {
							callback.receiveErrorsendVariables(f);
						}
					} else {
						callback.receiveErrorsendVariables(f);
					}
				} else {
					callback.receiveErrorsendVariables(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultsendVariables((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorsendVariables(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startsystemInformation
	 * @param systemInformationRequest80
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startsystemInformation(

			final org.apache.axiom.om.OMElement systemInformationRequest80,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[37].getName());
		_operationClient.getOptions().setAction("urn:systemInformation");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), systemInformationRequest80,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "systemInformation")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "systemInformationRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorsystemInformation(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "systemInformation"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"systemInformation"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"systemInformation"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorsystemInformation(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsystemInformation(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsystemInformation(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsystemInformation(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsystemInformation(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsystemInformation(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsystemInformation(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsystemInformation(f);
							}
						} else {
							callback.receiveErrorsystemInformation(f);
						}
					} else {
						callback.receiveErrorsystemInformation(f);
					}
				} else {
					callback.receiveErrorsystemInformation(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultsystemInformation((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorsystemInformation(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[37].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[37].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#starttaskCase
	 * @param taskCaseRequest72
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void starttaskCase(

			final org.apache.axiom.om.OMElement taskCaseRequest72,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[33].getName());
		_operationClient.getOptions().setAction("urn:taskCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), taskCaseRequest72,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "taskCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "taskCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrortaskCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrortaskCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskCase(f);
							}
						} else {
							callback.receiveErrortaskCase(f);
						}
					} else {
						callback.receiveErrortaskCase(f);
					}
				} else {
					callback.receiveErrortaskCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResulttaskCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrortaskCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[33].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[33].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#starttaskList
	 * @param taskListRequest62
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void starttaskList(

			final org.apache.axiom.om.OMElement taskListRequest62,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[28].getName());
		_operationClient.getOptions().setAction("urn:taskList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), taskListRequest62,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "taskList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "taskListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrortaskList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrortaskList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortaskList(f);
							}
						} else {
							callback.receiveErrortaskList(f);
						}
					} else {
						callback.receiveErrortaskList(f);
					}
				} else {
					callback.receiveErrortaskList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResulttaskList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrortaskList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[28].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[28].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#starttriggerList
	 * @param triggerListRequest76
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void starttriggerList(

			final org.apache.axiom.om.OMElement triggerListRequest76,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[35].getName());
		_operationClient.getOptions().setAction("urn:triggerList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), triggerListRequest76,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "triggerList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "triggerListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrortriggerList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "triggerList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"triggerList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "triggerList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrortriggerList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortriggerList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortriggerList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortriggerList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortriggerList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortriggerList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortriggerList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrortriggerList(f);
							}
						} else {
							callback.receiveErrortriggerList(f);
						}
					} else {
						callback.receiveErrortriggerList(f);
					}
				} else {
					callback.receiveErrortriggerList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResulttriggerList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrortriggerList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[35].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[35].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startunassignedCaseList
	 * @param unassignedCaseListRequest82
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startunassignedCaseList(

			final org.apache.axiom.om.OMElement unassignedCaseListRequest82,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[38].getName());
		_operationClient.getOptions().setAction("urn:unassignedCaseList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), unassignedCaseListRequest82,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorunassignedCaseList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unassignedCaseList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"unassignedCaseList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"unassignedCaseList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorunassignedCaseList(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunassignedCaseList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunassignedCaseList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunassignedCaseList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunassignedCaseList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunassignedCaseList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunassignedCaseList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunassignedCaseList(f);
							}
						} else {
							callback.receiveErrorunassignedCaseList(f);
						}
					} else {
						callback.receiveErrorunassignedCaseList(f);
					}
				} else {
					callback.receiveErrorunassignedCaseList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultunassignedCaseList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorunassignedCaseList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[38].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[38].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startunpauseCase
	 * @param unpauseCaseRequest36
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startunpauseCase(

			final org.apache.axiom.om.OMElement unpauseCaseRequest36,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[15].getName());
		_operationClient.getOptions().setAction("urn:unpauseCase");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), unpauseCaseRequest36,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "unpauseCase")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "unpauseCaseRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorunpauseCase(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unpauseCase"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"unpauseCase"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unpauseCase"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorunpauseCase(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunpauseCase(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunpauseCase(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunpauseCase(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunpauseCase(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunpauseCase(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunpauseCase(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorunpauseCase(f);
							}
						} else {
							callback.receiveErrorunpauseCase(f);
						}
					} else {
						callback.receiveErrorunpauseCase(f);
					}
				} else {
					callback.receiveErrorunpauseCase(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultunpauseCase((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorunpauseCase(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[15].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[15].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startupdateUser
	 * @param updateUserRequest12
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startupdateUser(

			final org.apache.axiom.om.OMElement updateUserRequest12,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("urn:updateUser");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateUserRequest12,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "updateUser")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "updateUserRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorupdateUser(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateUser"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"updateUser"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateUser"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErrorupdateUser(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorupdateUser(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorupdateUser(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorupdateUser(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorupdateUser(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorupdateUser(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorupdateUser(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorupdateUser(f);
							}
						} else {
							callback.receiveErrorupdateUser(f);
						}
					} else {
						callback.receiveErrorupdateUser(f);
					}
				} else {
					callback.receiveErrorupdateUser(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultupdateUser((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErrorupdateUser(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#startuserList
	 * @param userListRequest74
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void startuserList(

			final org.apache.axiom.om.OMElement userListRequest74,

			final net.rossonet.pmos.client3.generated.ProcessMakerServiceCallbackHandler callback)

			throws java.rmi.RemoteException {

		final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[34].getName());
		_operationClient.getOptions().setAction("urn:userList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), userListRequest74,
				optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "userList")),
				new javax.xml.namespace.QName("http://www.processmaker.com", "userListRequest"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			@Override
			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (final org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroruserList(axisFault);
				}
			}

			@Override
			public void onError(final java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					final org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "userList"))) {
							// make the fault by reflection
							try {
								final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "userList"));
								final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								final java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								final java.lang.Exception ex = (java.lang.Exception) constructor
										.newInstance(f.getMessage());
								// message class
								final java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "userList"));
								final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								final java.lang.Object messageObject = fromOM(faultElt, messageClass);
								final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroruserList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (final java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroruserList(f);
							} catch (final java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroruserList(f);
							} catch (final java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroruserList(f);
							} catch (final java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroruserList(f);
							} catch (final java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroruserList(f);
							} catch (final java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroruserList(f);
							} catch (final org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErroruserList(f);
							}
						} else {
							callback.receiveErroruserList(f);
						}
					} else {
						callback.receiveErroruserList(f);
					}
				} else {
					callback.receiveErroruserList(error);
				}
			}

			@Override
			public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
				final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			@Override
			public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
				try {
					final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					final java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							org.apache.axiom.om.OMElement.class);
					callback.receiveResultuserList((org.apache.axiom.om.OMElement) object);

				} catch (final org.apache.axis2.AxisFault e) {
					callback.receiveErroruserList(e);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[34].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[34].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#systemInformation
	 * @param systemInformationRequest80
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement systemInformation(

			final org.apache.axiom.om.OMElement systemInformationRequest80)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[37].getName());
			_operationClient.getOptions().setAction("urn:systemInformation");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), systemInformationRequest80,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "systemInformation")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "systemInformationRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "systemInformation"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "systemInformation"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "systemInformation"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#taskCase
	 * @param taskCaseRequest72
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement taskCase(

			final org.apache.axiom.om.OMElement taskCaseRequest72)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[33].getName());
			_operationClient.getOptions().setAction("urn:taskCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), taskCaseRequest72,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "taskCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "taskCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#taskList
	 * @param taskListRequest62
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement taskList(

			final org.apache.axiom.om.OMElement taskListRequest62)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[28].getName());
			_operationClient.getOptions().setAction("urn:taskList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), taskListRequest62,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "taskList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "taskListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "taskList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#triggerList
	 * @param triggerListRequest76
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement triggerList(

			final org.apache.axiom.om.OMElement triggerListRequest76)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[35].getName());
			_operationClient.getOptions().setAction("urn:triggerList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), triggerListRequest76,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "triggerList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "triggerListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "triggerList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "triggerList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "triggerList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#unassignedCaseList
	 * @param unassignedCaseListRequest82
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement unassignedCaseList(

			final org.apache.axiom.om.OMElement unassignedCaseListRequest82)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[38].getName());
			_operationClient.getOptions().setAction("urn:unassignedCaseList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), unassignedCaseListRequest82,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unassignedCaseList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unassignedCaseList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unassignedCaseList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#unpauseCase
	 * @param unpauseCaseRequest36
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement unpauseCase(

			final org.apache.axiom.om.OMElement unpauseCaseRequest36)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[15].getName());
			_operationClient.getOptions().setAction("urn:unpauseCase");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), unpauseCaseRequest36,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "unpauseCase")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "unpauseCaseRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unpauseCase"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unpauseCase"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "unpauseCase"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#updateUser
	 * @param updateUserRequest12
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement updateUser(

			final org.apache.axiom.om.OMElement updateUserRequest12)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction("urn:updateUser");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateUserRequest12,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "updateUser")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "updateUserRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateUser"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateUser"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "updateUser"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#userList
	 * @param userListRequest74
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public org.apache.axiom.om.OMElement userList(

			final org.apache.axiom.om.OMElement userListRequest74)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[34].getName());
			_operationClient.getOptions().setAction("urn:userList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), userListRequest74,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "userList")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "userListRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "userList"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "userList"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "userList"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	// https://processi.bottegaio.net/sysdemo/en/neoclassic/services/soap2
	@SuppressWarnings({ "rawtypes" })
	private org.apache.axiom.om.OMElement fromOM(final org.apache.axiom.om.OMElement param, final java.lang.Class type)
			throws org.apache.axis2.AxisFault {
		return param;
	}

	private boolean optimizeContent(final javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("ProcessMakerService" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[41];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "sendVariables"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "processList"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "createGroup"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "updateUser"));
		_service.addOperation(__operation);

		_operations[3] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "sendMessage"));
		_service.addOperation(__operation);

		_operations[4] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessList"));
		_service.addOperation(__operation);

		_operations[5] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseImpersonate"));
		_service.addOperation(__operation);

		_operations[6] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "executeTrigger"));
		_service.addOperation(__operation);

		_operations[7] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "groupList"));
		_service.addOperation(__operation);

		_operations[8] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "roleList"));
		_service.addOperation(__operation);

		_operations[9] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "removeDocument"));
		_service.addOperation(__operation);

		_operations[10] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseList"));
		_service.addOperation(__operation);

		_operations[11] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "routeCase"));
		_service.addOperation(__operation);

		_operations[12] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfo"));
		_service.addOperation(__operation);

		_operations[13] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "pauseCase"));
		_service.addOperation(__operation);

		_operations[14] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "unpauseCase"));
		_service.addOperation(__operation);

		_operations[15] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "createDepartment"));
		_service.addOperation(__operation);

		_operations[16] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "addCaseNote"));
		_service.addOperation(__operation);

		_operations[17] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "claimCase"));
		_service.addOperation(__operation);

		_operations[18] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToGroup"));
		_service.addOperation(__operation);

		_operations[19] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesNames"));
		_service.addOperation(__operation);

		_operations[20] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToDepartment"));
		_service.addOperation(__operation);

		_operations[21] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "createUser"));
		_service.addOperation(__operation);

		_operations[22] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "informationUser"));
		_service.addOperation(__operation);

		_operations[23] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseNotes"));
		_service.addOperation(__operation);

		_operations[24] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "cancelCase"));
		_service.addOperation(__operation);

		_operations[25] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "newCase"));
		_service.addOperation(__operation);

		_operations[26] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariables"));
		_service.addOperation(__operation);

		_operations[27] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskList"));
		_service.addOperation(__operation);

		_operations[28] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "removeUserFromGroup"));
		_service.addOperation(__operation);

		_operations[29] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "login"));
		_service.addOperation(__operation);

		_operations[30] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "departmentList"));
		_service.addOperation(__operation);

		_operations[31] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentList"));
		_service.addOperation(__operation);

		_operations[32] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskCase"));
		_service.addOperation(__operation);

		_operations[33] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "userList"));
		_service.addOperation(__operation);

		_operations[34] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "triggerList"));
		_service.addOperation(__operation);

		_operations[35] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentList"));
		_service.addOperation(__operation);

		_operations[36] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "systemInformation"));
		_service.addOperation(__operation);

		_operations[37] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseList"));
		_service.addOperation(__operation);

		_operations[38] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "reassignCase"));
		_service.addOperation(__operation);

		_operations[39] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://www.processmaker.com", "deleteCase"));
		_service.addOperation(__operation);

		_operations[40] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * get the default envelope
	 */
	@SuppressWarnings({ "unused" })
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory)
			throws org.apache.axis2.AxisFault {
		return factory.getDefaultEnvelope();
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory,
			final org.apache.axiom.om.OMElement param, final boolean optimizeContent,
			final javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {
		final org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
		envelope.getBody().addChild(param);
		return envelope;
	}

	@SuppressWarnings({ "unused" })
	private org.apache.axiom.om.OMElement toOM(final org.apache.axiom.om.OMElement param, final boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		return param;
	}

	/**
	 * Auto generated method signature
	 *
	 * @see net.rossonet.pmos.client.ProcessMakerService#assignUserToGroup
	 * @param assignUserToGroupRequest44
	 *
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	org.apache.axiom.om.OMElement assignUserToGroup(

			final org.apache.axiom.om.OMElement assignUserToGroupRequest44)

			throws java.rmi.RemoteException

	{
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
		try {
			final org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[19].getName());
			_operationClient.getOptions().setAction("urn:assignUserToGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), assignUserToGroupRequest44,
					optimizeContent(new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToGroup")),
					new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToGroupRequest"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			final org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			final org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			final java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					org.apache.axiom.om.OMElement.class);

			return (org.apache.axiom.om.OMElement) object;

		} catch (final org.apache.axis2.AxisFault f) {

			final org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "assignUserToGroup"))) {
					// make the fault by reflection
					try {
						final java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "assignUserToGroup"));
						final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						final java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						final java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "assignUserToGroup"));
						final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						final java.lang.Object messageObject = fromOM(faultElt, messageClass);
						final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (final java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (final java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

}
