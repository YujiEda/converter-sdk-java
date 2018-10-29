/**
 * ConverterAgentInternalDiskAttachPointOrigin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalDiskAttachPointOrigin implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterAgentInternalDiskAttachPointOrigin(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FROM_CONFIG_INFO = "FROM_CONFIG_INFO";
    public static final java.lang.String _EXPLICITLY_REQUESTED = "EXPLICITLY_REQUESTED";
    public static final java.lang.String _ALLOCATED_AS_FIRST_FREE = "ALLOCATED_AS_FIRST_FREE";
    public static final java.lang.String _CHANGED_BUS_TYPE = "CHANGED_BUS_TYPE";
    public static final java.lang.String _CHANGED_INVALID_BUS_OR_UNIT = "CHANGED_INVALID_BUS_OR_UNIT";
    public static final java.lang.String _CHANGED_TO_AVOID_DUPLICATE = "CHANGED_TO_AVOID_DUPLICATE";
    public static final java.lang.String _SHIFTED_TO_MAINTAIN_BOOT_ORDER = "SHIFTED_TO_MAINTAIN_BOOT_ORDER";
    public static final ConverterAgentInternalDiskAttachPointOrigin FROM_CONFIG_INFO = new ConverterAgentInternalDiskAttachPointOrigin(_FROM_CONFIG_INFO);
    public static final ConverterAgentInternalDiskAttachPointOrigin EXPLICITLY_REQUESTED = new ConverterAgentInternalDiskAttachPointOrigin(_EXPLICITLY_REQUESTED);
    public static final ConverterAgentInternalDiskAttachPointOrigin ALLOCATED_AS_FIRST_FREE = new ConverterAgentInternalDiskAttachPointOrigin(_ALLOCATED_AS_FIRST_FREE);
    public static final ConverterAgentInternalDiskAttachPointOrigin CHANGED_BUS_TYPE = new ConverterAgentInternalDiskAttachPointOrigin(_CHANGED_BUS_TYPE);
    public static final ConverterAgentInternalDiskAttachPointOrigin CHANGED_INVALID_BUS_OR_UNIT = new ConverterAgentInternalDiskAttachPointOrigin(_CHANGED_INVALID_BUS_OR_UNIT);
    public static final ConverterAgentInternalDiskAttachPointOrigin CHANGED_TO_AVOID_DUPLICATE = new ConverterAgentInternalDiskAttachPointOrigin(_CHANGED_TO_AVOID_DUPLICATE);
    public static final ConverterAgentInternalDiskAttachPointOrigin SHIFTED_TO_MAINTAIN_BOOT_ORDER = new ConverterAgentInternalDiskAttachPointOrigin(_SHIFTED_TO_MAINTAIN_BOOT_ORDER);
    public java.lang.String getValue() { return _value_;}
    public static ConverterAgentInternalDiskAttachPointOrigin fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterAgentInternalDiskAttachPointOrigin enumeration = (ConverterAgentInternalDiskAttachPointOrigin)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterAgentInternalDiskAttachPointOrigin fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalDiskAttachPointOrigin.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskAttachPointOrigin"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
