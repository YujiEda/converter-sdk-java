/**
 * VirtualCdromPassthroughBackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualCdromPassthroughBackingOption  extends com.vmware.converter.VirtualDeviceDeviceBackingOption  implements java.io.Serializable {
    private com.vmware.converter.BoolOption exclusive;

    public VirtualCdromPassthroughBackingOption() {
    }

    public VirtualCdromPassthroughBackingOption(
           java.lang.String type,
           com.vmware.converter.BoolOption autoDetectAvailable,
           com.vmware.converter.BoolOption exclusive) {
        super(
            type,
            autoDetectAvailable);
        this.exclusive = exclusive;
    }


    /**
     * Gets the exclusive value for this VirtualCdromPassthroughBackingOption.
     * 
     * @return exclusive
     */
    public com.vmware.converter.BoolOption getExclusive() {
        return exclusive;
    }


    /**
     * Sets the exclusive value for this VirtualCdromPassthroughBackingOption.
     * 
     * @param exclusive
     */
    public void setExclusive(com.vmware.converter.BoolOption exclusive) {
        this.exclusive = exclusive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualCdromPassthroughBackingOption)) return false;
        VirtualCdromPassthroughBackingOption other = (VirtualCdromPassthroughBackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.exclusive==null && other.getExclusive()==null) || 
             (this.exclusive!=null &&
              this.exclusive.equals(other.getExclusive())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getExclusive() != null) {
            _hashCode += getExclusive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualCdromPassthroughBackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualCdromPassthroughBackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "exclusive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
