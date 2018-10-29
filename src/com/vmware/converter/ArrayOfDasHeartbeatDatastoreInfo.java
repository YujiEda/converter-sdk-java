/**
 * ArrayOfDasHeartbeatDatastoreInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDasHeartbeatDatastoreInfo  implements java.io.Serializable {
    private com.vmware.converter.DasHeartbeatDatastoreInfo[] dasHeartbeatDatastoreInfo;

    public ArrayOfDasHeartbeatDatastoreInfo() {
    }

    public ArrayOfDasHeartbeatDatastoreInfo(
           com.vmware.converter.DasHeartbeatDatastoreInfo[] dasHeartbeatDatastoreInfo) {
           this.dasHeartbeatDatastoreInfo = dasHeartbeatDatastoreInfo;
    }


    /**
     * Gets the dasHeartbeatDatastoreInfo value for this ArrayOfDasHeartbeatDatastoreInfo.
     * 
     * @return dasHeartbeatDatastoreInfo
     */
    public com.vmware.converter.DasHeartbeatDatastoreInfo[] getDasHeartbeatDatastoreInfo() {
        return dasHeartbeatDatastoreInfo;
    }


    /**
     * Sets the dasHeartbeatDatastoreInfo value for this ArrayOfDasHeartbeatDatastoreInfo.
     * 
     * @param dasHeartbeatDatastoreInfo
     */
    public void setDasHeartbeatDatastoreInfo(com.vmware.converter.DasHeartbeatDatastoreInfo[] dasHeartbeatDatastoreInfo) {
        this.dasHeartbeatDatastoreInfo = dasHeartbeatDatastoreInfo;
    }

    public com.vmware.converter.DasHeartbeatDatastoreInfo getDasHeartbeatDatastoreInfo(int i) {
        return this.dasHeartbeatDatastoreInfo[i];
    }

    public void setDasHeartbeatDatastoreInfo(int i, com.vmware.converter.DasHeartbeatDatastoreInfo _value) {
        this.dasHeartbeatDatastoreInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDasHeartbeatDatastoreInfo)) return false;
        ArrayOfDasHeartbeatDatastoreInfo other = (ArrayOfDasHeartbeatDatastoreInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dasHeartbeatDatastoreInfo==null && other.getDasHeartbeatDatastoreInfo()==null) || 
             (this.dasHeartbeatDatastoreInfo!=null &&
              java.util.Arrays.equals(this.dasHeartbeatDatastoreInfo, other.getDasHeartbeatDatastoreInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDasHeartbeatDatastoreInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDasHeartbeatDatastoreInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDasHeartbeatDatastoreInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDasHeartbeatDatastoreInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDasHeartbeatDatastoreInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasHeartbeatDatastoreInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DasHeartbeatDatastoreInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DasHeartbeatDatastoreInfo"));
        elemField.setMinOccurs(0);
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
