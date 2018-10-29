/**
 * DVPortgroupSelection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVPortgroupSelection  extends com.vmware.converter.SelectionSet  implements java.io.Serializable {
    private java.lang.String dvsUuid;

    private java.lang.String[] portgroupKey;

    public DVPortgroupSelection() {
    }

    public DVPortgroupSelection(
           java.lang.String dvsUuid,
           java.lang.String[] portgroupKey) {
        this.dvsUuid = dvsUuid;
        this.portgroupKey = portgroupKey;
    }


    /**
     * Gets the dvsUuid value for this DVPortgroupSelection.
     * 
     * @return dvsUuid
     */
    public java.lang.String getDvsUuid() {
        return dvsUuid;
    }


    /**
     * Sets the dvsUuid value for this DVPortgroupSelection.
     * 
     * @param dvsUuid
     */
    public void setDvsUuid(java.lang.String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }


    /**
     * Gets the portgroupKey value for this DVPortgroupSelection.
     * 
     * @return portgroupKey
     */
    public java.lang.String[] getPortgroupKey() {
        return portgroupKey;
    }


    /**
     * Sets the portgroupKey value for this DVPortgroupSelection.
     * 
     * @param portgroupKey
     */
    public void setPortgroupKey(java.lang.String[] portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public java.lang.String getPortgroupKey(int i) {
        return this.portgroupKey[i];
    }

    public void setPortgroupKey(int i, java.lang.String _value) {
        this.portgroupKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVPortgroupSelection)) return false;
        DVPortgroupSelection other = (DVPortgroupSelection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dvsUuid==null && other.getDvsUuid()==null) || 
             (this.dvsUuid!=null &&
              this.dvsUuid.equals(other.getDvsUuid()))) &&
            ((this.portgroupKey==null && other.getPortgroupKey()==null) || 
             (this.portgroupKey!=null &&
              java.util.Arrays.equals(this.portgroupKey, other.getPortgroupKey())));
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
        if (getDvsUuid() != null) {
            _hashCode += getDvsUuid().hashCode();
        }
        if (getPortgroupKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortgroupKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortgroupKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVPortgroupSelection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortgroupSelection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
