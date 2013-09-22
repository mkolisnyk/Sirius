/**
 * ListBoxSvcPortStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.server.win32lib.controls.listbox;

public class ListBoxSvcPortStub extends org.apache.axis.client.Stub implements
        org.sirius.server.win32lib.controls.listbox.IListBoxContract {
    private final java.util.Vector                     cachedSerClasses     = new java.util.Vector();
    private final java.util.Vector                     cachedSerQNames      = new java.util.Vector();
    private final java.util.Vector                     cachedSerFactories   = new java.util.Vector();
    private final java.util.Vector                     cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddSelectionByIndex");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "index"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddSelectionByName");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "item"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "string"),
                java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeselectAll");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemNames");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                "ArrayOfstring"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetItemNamesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemsCount");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(java.lang.Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetItemsCountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSelectedIndex");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(java.lang.Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetSelectedIndexResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSelectedItem");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetSelectedItemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSelectedItems");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                "ArrayOfstring"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetSelectedItemsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveSelectionByIndex");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "index"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveSelectionByName");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "item"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "string"),
                java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SelectByIndex");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "index"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SelectByName");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "item"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "string"),
                java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SelectAll");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName(
                        "http://listbox.controls.win32lib.server.sirius.org/",
                        "hwnd"), org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"),
                java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

    }

    public ListBoxSvcPortStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public ListBoxSvcPortStub(final java.net.URL endpointURL,
            final javax.xml.rpc.Service service)
            throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public ListBoxSvcPortStub(final javax.xml.rpc.Service service)
            throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service)
                .setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                "ArrayOfstring");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string");
        qName2 = new javax.xml.namespace.QName(
                "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                "string");
        cachedSerFactories
                .add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
                        qName, qName2));
        cachedDeserFactories
                .add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    @Override
    public void addSelectionByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/AddSelectionByIndex");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "AddSelectionByIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    hwnd, index });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public void addSelectionByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/AddSelectionByName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "AddSelectionByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    hwnd, item });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    protected org.apache.axis.client.Call createCall()
            throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses
                                .get(i);
                        javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames
                                .get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class) cachedSerFactories
                                    .get(i);
                            java.lang.Class df = (java.lang.Class) cachedDeserFactories
                                    .get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
                                    .get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
                                    .get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault(
                    "Failure trying to get the Call object", _t);
        }
    }

    @Override
    public void deselectAll(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/DeselectAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "DeselectAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { hwnd });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public java.lang.String[] getItemNames(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/GetItemNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetItemNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { hwnd });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.String[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String[]) org.apache.axis.utils.JavaUtils
                            .convert(_resp, java.lang.String[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public java.lang.Integer getItemsCount(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/GetItemsCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { hwnd });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.Integer) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_resp, java.lang.Integer.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public java.lang.Integer getSelectedIndex(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/GetSelectedIndex");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetSelectedIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { hwnd });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.Integer) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_resp, java.lang.Integer.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public java.lang.String getSelectedItem(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/GetSelectedItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetSelectedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { hwnd });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.String) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String) org.apache.axis.utils.JavaUtils
                            .convert(_resp, java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public java.lang.String[] getSelectedItems(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/GetSelectedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "GetSelectedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { hwnd });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.String[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String[]) org.apache.axis.utils.JavaUtils
                            .convert(_resp, java.lang.String[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public void removeSelectionByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/RemoveSelectionByIndex");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "RemoveSelectionByIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    hwnd, index });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public void removeSelectionByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/RemoveSelectionByName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "RemoveSelectionByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    hwnd, item });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public void selectAll(final java.lang.Integer hwnd)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/SelectAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "SelectAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { hwnd });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public void selectByIndex(final java.lang.Integer hwnd,
            final java.lang.Integer index) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/SelectByIndex");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "SelectByIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    hwnd, index });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    @Override
    public void selectByName(final java.lang.Integer hwnd,
            final java.lang.String item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://listbox.controls.win32lib.server.sirius.org/IListBoxContract/SelectByName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://listbox.controls.win32lib.server.sirius.org/",
                "SelectByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    hwnd, item });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
