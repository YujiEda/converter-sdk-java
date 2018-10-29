/**
 * VasaProviderContainerSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VasaProviderContainerSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo;

    private java.lang.String scId;

    private boolean deleted;

    public VasaProviderContainerSpec() {
    }

    public VasaProviderContainerSpec(
           com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo,
           java.lang.String scId,
           boolean deleted) {
        this.vasaProviderInfo = vasaProviderInfo;
        this.scId = scId;
        this.deleted = deleted;
    }


    /**
     * Gets the vasaProviderInfo value for this VasaProviderContainerSpec.
     * 
     * @return vasaProviderInfo
     */
    public com.vmware.converter.VimVasaProviderInfo[] getVasaProviderInfo() {
        return vasaProviderInfo;
    }


    /**
     * Sets the vasaProviderInfo value for this VasaProviderContainerSpec.
     * 
     * @param vasaProviderInfo
     */
    public void setVasaProviderInfo(com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo) {
        this.vasaProviderInfo = vasaProviderInfo;
    }

    public com.vmware.converter.VimVasaProviderInfo getVasaProviderInfo(int i) {
        return this.vasaProviderInfo[i];
    }

    public void setVasaProviderInfo(int i, com.vmware.converter.VimVasaProviderInfo _value) {
        this.vasaProviderInfo[i] = _value;
    }


    /**
     * Gets the scId value for this VasaProviderContainerSpec.
     * 
     * @return scId
     */
    public java.lang.String getScId() {
        return scId;
    }


    /**
     * Sets the scId value for this VasaProviderContainerSpec.
     * 
     * @param scId
     */
    public void setScId(java.lang.String scId) {
        this.scId = scId;
    }


    /**
     * Gets the deleted value for this VasaProviderContainerSpec.
     * 
     * @return deleted
     */
    public boolean isDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this VasaProviderContainerSpec.
     * 
     * @param deleted
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VasaProviderContainerSpec)) return false;
        VasaProviderContainerSpec other = (VasaProviderContainerSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vasaProviderInfo==null && other.getVasaProviderInfo()==null) || 
             (this.vasaProviderInfo!=null &&
              java.util.Arrays.equals(this.vasaProviderInfo, other.getVasaProviderInfo()))) &&
            ((this.scId==null && other.getScId()==null) || 
             (this.scId!=null &&
              this.scId.equals(other.getScId()))) &&
            this.deleted == other.isDeleted();
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
        if (getVasaProviderInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVasaProviderInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVasaProviderInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScId() != null) {
            _hashCode += getScId().hashCode();
        }
        _hashCode += (isDeleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VasaProviderContainerSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VasaProviderContainerSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vasaProviderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vasaProviderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VimVasaProviderInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
