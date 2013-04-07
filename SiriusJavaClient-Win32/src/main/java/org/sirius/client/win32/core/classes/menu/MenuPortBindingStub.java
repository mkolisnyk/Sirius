/**
 * MenuPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.classes.menu;

public class MenuPortBindingStub extends org.apache.axis.client.Stub implements
        org.sirius.client.win32.core.classes.menu.Menu {
    private java.util.Vector                           cachedSerClasses     = new java.util.Vector();
    private java.util.Vector                           cachedSerQNames      = new java.util.Vector();
    private java.util.Vector                           cachedSerFactories   = new java.util.Vector();
    private java.util.Vector                           cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuItemCount");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuString");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg2"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "unsignedShort"),
                org.apache.axis.types.UnsignedShort[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg3"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg4"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuInfo");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://classes.win32.server.sirius.org/", "menuinfo"),
                org.sirius.client.win32.core.types.Menuinfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubMenu");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuDefaultItem");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg2"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuItemID");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuItemInfo");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg2"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "boolean"),
                boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg3"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://classes.win32.server.sirius.org/",
                        "menuiteminfo"),
                org.sirius.client.win32.core.types.Menuiteminfo.class, false,
                false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuItemRect");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg2"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg3"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://classes.win32.server.sirius.org/", "rect"),
                org.sirius.client.win32.core.types.Rect.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsMenu");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuState");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg2"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pickItem");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg1"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg2"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "int"), int.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public MenuPortBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public MenuPortBindingStub(java.net.URL endpointURL,
            javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public MenuPortBindingStub(javax.xml.rpc.Service service)
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
                "http://classes.win32.server.sirius.org/", "dword");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Dword.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "handle");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Handle.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "hbitmap");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Hbitmap.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "hbrush");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Hbrush.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "hmenu");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Hmenu.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "integerType");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.IntegerType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "menuinfo");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Menuinfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "menuiteminfo");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Menuiteminfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "number");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Number.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "pointer");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Pointer.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "pointerType");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.PointerType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "rect");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Rect.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "structure");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Structure.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "uint");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Uint.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "ulongPTR");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.UlongPTR.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

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

    public int getMenuItemCount(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetMenuItemCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Long(arg0) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int getMenuString(long arg0, int arg1,
            org.apache.axis.types.UnsignedShort[] arg2, int arg3, int arg4)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetMenuString"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Integer(arg1),
                    arg2, new java.lang.Integer(arg3),
                    new java.lang.Integer(arg4) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public boolean getMenuInfo(long arg0,
            org.sirius.client.win32.core.types.Menuinfo arg1)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetMenuInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), arg1 });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Boolean) _resp).booleanValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils
                            .convert(_resp, boolean.class)).booleanValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public long getSubMenu(long arg0, int arg1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetSubMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Integer(arg1) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Long) _resp).longValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Long) org.apache.axis.utils.JavaUtils
                            .convert(_resp, long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int getMenuDefaultItem(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetMenuDefaultItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Integer(arg1),
                    new java.lang.Integer(arg2) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int getMenuItemID(long arg0, int arg1)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetMenuItemID"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Integer(arg1) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public boolean getMenuItemInfo(long arg0, int arg1, boolean arg2,
            org.sirius.client.win32.core.types.Menuiteminfo arg3)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetMenuItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Integer(arg1),
                    new java.lang.Boolean(arg2), arg3 });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Boolean) _resp).booleanValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils
                            .convert(_resp, boolean.class)).booleanValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public boolean getMenuItemRect(long arg0, long arg1, int arg2,
            org.sirius.client.win32.core.types.Rect arg3)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetMenuItemRect"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Long(arg1),
                    new java.lang.Integer(arg2), arg3 });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Boolean) _resp).booleanValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils
                            .convert(_resp, boolean.class)).booleanValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public boolean isMenu(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "IsMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Long(arg0) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Boolean) _resp).booleanValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils
                            .convert(_resp, boolean.class)).booleanValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int getMenuState(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "GetMenuState"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Integer(arg1),
                    new java.lang.Integer(arg2) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils
                            .convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public boolean pickItem(long arg0, long arg1, int arg2)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://classes.win32.server.sirius.org/", "pickItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Long(arg1),
                    new java.lang.Integer(arg2) });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Boolean) _resp).booleanValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils
                            .convert(_resp, boolean.class)).booleanValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
