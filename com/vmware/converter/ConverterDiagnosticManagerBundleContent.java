/**
 * ConverterDiagnosticManagerBundleContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDiagnosticManagerBundleContent implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterDiagnosticManagerBundleContent(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _agentLogs = "agentLogs";
    public static final java.lang.String _agentDeploymentLogs = "agentDeploymentLogs";
    public static final java.lang.String _sysinfoLogs = "sysinfoLogs";
    public static final java.lang.String _serverLogs = "serverLogs";
    public static final java.lang.String _clientLogs = "clientLogs";
    public static final java.lang.String _helperVMLogs = "helperVMLogs";
    public static final java.lang.String _workerLogs = "workerLogs";
    public static final ConverterDiagnosticManagerBundleContent agentLogs = new ConverterDiagnosticManagerBundleContent(_agentLogs);
    public static final ConverterDiagnosticManagerBundleContent agentDeploymentLogs = new ConverterDiagnosticManagerBundleContent(_agentDeploymentLogs);
    public static final ConverterDiagnosticManagerBundleContent sysinfoLogs = new ConverterDiagnosticManagerBundleContent(_sysinfoLogs);
    public static final ConverterDiagnosticManagerBundleContent serverLogs = new ConverterDiagnosticManagerBundleContent(_serverLogs);
    public static final ConverterDiagnosticManagerBundleContent clientLogs = new ConverterDiagnosticManagerBundleContent(_clientLogs);
    public static final ConverterDiagnosticManagerBundleContent helperVMLogs = new ConverterDiagnosticManagerBundleContent(_helperVMLogs);
    public static final ConverterDiagnosticManagerBundleContent workerLogs = new ConverterDiagnosticManagerBundleContent(_workerLogs);
    public java.lang.String getValue() { return _value_;}
    public static ConverterDiagnosticManagerBundleContent fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterDiagnosticManagerBundleContent enumeration = (ConverterDiagnosticManagerBundleContent)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterDiagnosticManagerBundleContent fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterDiagnosticManagerBundleContent.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiagnosticManagerBundleContent"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
