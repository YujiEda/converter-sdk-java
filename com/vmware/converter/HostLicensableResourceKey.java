/**
 * HostLicensableResourceKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostLicensableResourceKey implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostLicensableResourceKey(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _numCpuPackages = "numCpuPackages";
    public static final java.lang.String _numCpuCores = "numCpuCores";
    public static final java.lang.String _memorySize = "memorySize";
    public static final java.lang.String _memoryForVms = "memoryForVms";
    public static final java.lang.String _numVmsStarted = "numVmsStarted";
    public static final java.lang.String _numVmsStarting = "numVmsStarting";
    public static final HostLicensableResourceKey numCpuPackages = new HostLicensableResourceKey(_numCpuPackages);
    public static final HostLicensableResourceKey numCpuCores = new HostLicensableResourceKey(_numCpuCores);
    public static final HostLicensableResourceKey memorySize = new HostLicensableResourceKey(_memorySize);
    public static final HostLicensableResourceKey memoryForVms = new HostLicensableResourceKey(_memoryForVms);
    public static final HostLicensableResourceKey numVmsStarted = new HostLicensableResourceKey(_numVmsStarted);
    public static final HostLicensableResourceKey numVmsStarting = new HostLicensableResourceKey(_numVmsStarting);
    public java.lang.String getValue() { return _value_;}
    public static HostLicensableResourceKey fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostLicensableResourceKey enumeration = (HostLicensableResourceKey)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostLicensableResourceKey fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostLicensableResourceKey.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLicensableResourceKey"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
