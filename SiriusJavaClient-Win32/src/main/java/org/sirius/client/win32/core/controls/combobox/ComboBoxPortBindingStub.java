/**
 * ComboBoxPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.combobox;

public class ComboBoxPortBindingStub extends org.apache.axis.client.Stub
        implements org.sirius.client.win32.core.controls.combobox.ComboBox {
    private java.util.Vector                           cachedSerClasses     = new java.util.Vector();
    private java.util.Vector                           cachedSerQNames      = new java.util.Vector();
    private java.util.Vector                           cachedSerFactories   = new java.util.Vector();
    private java.util.Vector                           cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[21];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetEditSel");
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
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetCurSel");
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
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SelectString");
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
                        "http://www.w3.org/2001/XMLSchema", "string"),
                java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindString");
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
                        "http://www.w3.org/2001/XMLSchema", "string"),
                java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetText");
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
                        "http://www.w3.org/2001/XMLSchema", "string"),
                java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ShowDropdown");
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
                        "http://www.w3.org/2001/XMLSchema", "boolean"),
                boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEditSel");
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
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLBText");
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
                        "http://www.w3.org/2001/XMLSchema", "string"),
                java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemData");
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
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCount");
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
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindItemData");
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
                        "http://controls.classes.win32.server.sirius.org/",
                        "lparam"),
                org.sirius.client.win32.core.types.Lparam.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurSel");
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
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLBTextLen");
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
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetText");
        param = new org.apache.axis.description.ParameterDesc(
                new javax.xml.namespace.QName("", "arg0"),
                org.apache.axis.description.ParameterDesc.IN,
                new javax.xml.namespace.QName(
                        "http://www.w3.org/2001/XMLSchema", "long"),
                long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetContent");
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
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDroppedState");
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
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetItemHeight");
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
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindStringExact");
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
                        "http://www.w3.org/2001/XMLSchema", "string"),
                java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTextLength");
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
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetExtendedUI");
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
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemHeight");
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
        _operations[20] = oper;

    }

    public ComboBoxPortBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public ComboBoxPortBindingStub(java.net.URL endpointURL,
            javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public ComboBoxPortBindingStub(javax.xml.rpc.Service service)
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
                "http://controls.classes.win32.server.sirius.org/",
                "integerType");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.IntegerType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/", "longPTR");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.LongPTR.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/", "lparam");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Lparam.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/", "number");
        cachedSerQNames.add(qName);
        cls = org.sirius.client.win32.core.types.Number.class;
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

    public int setEditSel(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException {
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
                "http://controls.classes.win32.server.sirius.org/",
                "SetEditSel"));

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

    public int setCurSel(long arg0, int arg1) throws java.rmi.RemoteException {
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
                "http://controls.classes.win32.server.sirius.org/", "SetCurSel"));

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

    public int selectString(long arg0, int arg1, java.lang.String arg2)
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
                "http://controls.classes.win32.server.sirius.org/",
                "SelectString"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Long(arg0),
                            new java.lang.Integer(arg1), arg2 });

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

    public int findString(long arg0, int arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
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
                "http://controls.classes.win32.server.sirius.org/",
                "FindString"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Long(arg0),
                            new java.lang.Integer(arg1), arg2 });

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

    public void setText(long arg0, java.lang.String arg1)
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
                "http://controls.classes.win32.server.sirius.org/", "SetText"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), arg1 });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int showDropdown(long arg0, boolean arg1)
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
                "http://controls.classes.win32.server.sirius.org/",
                "ShowDropdown"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
                    new java.lang.Long(arg0), new java.lang.Boolean(arg1) });

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

    public int getEditSel(long arg0) throws java.rmi.RemoteException {
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
                "http://controls.classes.win32.server.sirius.org/",
                "GetEditSel"));

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

    public int getLBText(long arg0, int arg1, java.lang.String arg2)
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
                "http://controls.classes.win32.server.sirius.org/", "GetLBText"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Long(arg0),
                            new java.lang.Integer(arg1), arg2 });

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

    public int getItemData(long arg0, int arg1) throws java.rmi.RemoteException {
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
                "http://controls.classes.win32.server.sirius.org/",
                "GetItemData"));

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

    public int getCount(long arg0) throws java.rmi.RemoteException {
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
                "http://controls.classes.win32.server.sirius.org/", "GetCount"));

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

    public int findItemData(long arg0, int arg1,
            org.sirius.client.win32.core.types.Lparam arg2)
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
                "http://controls.classes.win32.server.sirius.org/",
                "FindItemData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Long(arg0),
                            new java.lang.Integer(arg1), arg2 });

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

    public int getCurSel(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/", "GetCurSel"));

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

    public int getLBTextLen(long arg0, int arg1)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "GetLBTextLen"));

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

    public java.lang.String getText(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/", "GetText"));

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

    public int resetContent(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "ResetContent"));

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

    public int getDroppedState(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "GetDroppedState"));

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

    public int setItemHeight(long arg0, int arg1, int arg2)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "SetItemHeight"));

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

    public int findStringExact(long arg0, int arg1, java.lang.String arg2)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "FindStringExact"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call
                    .invoke(new java.lang.Object[] { new java.lang.Long(arg0),
                            new java.lang.Integer(arg1), arg2 });

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

    public int getTextLength(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "GetTextLength"));

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

    public int getExtendedUI(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "GetExtendedUI"));

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

    public int getItemHeight(long arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
                Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
                Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName(
                "http://controls.classes.win32.server.sirius.org/",
                "GetItemHeight"));

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

}
