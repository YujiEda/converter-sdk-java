/**
 * HostSystemReconnectSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostSystemReconnectSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean syncState;

    public HostSystemReconnectSpec() {
    }

    public HostSystemReconnectSpec(
           java.lang.Boolean syncState) {
        this.syncState = syncState;
    }


    /**
     * Gets the syncState value for this HostSystemReconnectSpec.
     * 
     * @return syncState
     */
    public java.lang.Boolean getSyncState() {
        return syncState;
    }


    /**
     * Sets the syncState value for this HostSystemReconnectSpec.
     * 
     * @param syncState
     */
    public void setSyncState(java.lang.Boolean syncState) {
        this.syncState = syncState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostSystemReconnectSpec)) return false;
        HostSystemReconnectSpec other = (HostSystemReconnectSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.syncState==null && other.getSyncState()==null) || 
             (this.syncState!=null &&
              this.syncState.equals(other.getSyncState())));
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
        if (getSyncState() != null) {
            _hashCode += getSyncState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostSystemReconnectSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemReconnectSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "syncState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
