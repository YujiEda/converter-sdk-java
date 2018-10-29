/**
 * ConverterNetworkInfoManagedNicInfoNicControllerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkInfoManagedNicInfoNicControllerType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterNetworkInfoManagedNicInfoNicControllerType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _pcnet32 = "pcnet32";
    public static final java.lang.String _vmxnet = "vmxnet";
    public static final java.lang.String _vmxnet2 = "vmxnet2";
    public static final java.lang.String _vmxnet3 = "vmxnet3";
    public static final java.lang.String _e1000 = "e1000";
    public static final java.lang.String _e1000e = "e1000e";
    public static final ConverterNetworkInfoManagedNicInfoNicControllerType pcnet32 = new ConverterNetworkInfoManagedNicInfoNicControllerType(_pcnet32);
    public static final ConverterNetworkInfoManagedNicInfoNicControllerType vmxnet = new ConverterNetworkInfoManagedNicInfoNicControllerType(_vmxnet);
    public static final ConverterNetworkInfoManagedNicInfoNicControllerType vmxnet2 = new ConverterNetworkInfoManagedNicInfoNicControllerType(_vmxnet2);
    public static final ConverterNetworkInfoManagedNicInfoNicControllerType vmxnet3 = new ConverterNetworkInfoManagedNicInfoNicControllerType(_vmxnet3);
    public static final ConverterNetworkInfoManagedNicInfoNicControllerType e1000 = new ConverterNetworkInfoManagedNicInfoNicControllerType(_e1000);
    public static final ConverterNetworkInfoManagedNicInfoNicControllerType e1000e = new ConverterNetworkInfoManagedNicInfoNicControllerType(_e1000e);
    public java.lang.String getValue() { return _value_;}
    public static ConverterNetworkInfoManagedNicInfoNicControllerType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterNetworkInfoManagedNicInfoNicControllerType enumeration = (ConverterNetworkInfoManagedNicInfoNicControllerType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterNetworkInfoManagedNicInfoNicControllerType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterNetworkInfoManagedNicInfoNicControllerType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoManagedNicInfoNicControllerType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
