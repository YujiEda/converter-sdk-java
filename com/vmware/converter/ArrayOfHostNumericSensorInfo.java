/**
 * ArrayOfHostNumericSensorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostNumericSensorInfo  implements java.io.Serializable {
    private com.vmware.converter.HostNumericSensorInfo[] hostNumericSensorInfo;

    public ArrayOfHostNumericSensorInfo() {
    }

    public ArrayOfHostNumericSensorInfo(
           com.vmware.converter.HostNumericSensorInfo[] hostNumericSensorInfo) {
           this.hostNumericSensorInfo = hostNumericSensorInfo;
    }


    /**
     * Gets the hostNumericSensorInfo value for this ArrayOfHostNumericSensorInfo.
     * 
     * @return hostNumericSensorInfo
     */
    public com.vmware.converter.HostNumericSensorInfo[] getHostNumericSensorInfo() {
        return hostNumericSensorInfo;
    }


    /**
     * Sets the hostNumericSensorInfo value for this ArrayOfHostNumericSensorInfo.
     * 
     * @param hostNumericSensorInfo
     */
    public void setHostNumericSensorInfo(com.vmware.converter.HostNumericSensorInfo[] hostNumericSensorInfo) {
        this.hostNumericSensorInfo = hostNumericSensorInfo;
    }

    public com.vmware.converter.HostNumericSensorInfo getHostNumericSensorInfo(int i) {
        return this.hostNumericSensorInfo[i];
    }

    public void setHostNumericSensorInfo(int i, com.vmware.converter.HostNumericSensorInfo _value) {
        this.hostNumericSensorInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostNumericSensorInfo)) return false;
        ArrayOfHostNumericSensorInfo other = (ArrayOfHostNumericSensorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostNumericSensorInfo==null && other.getHostNumericSensorInfo()==null) || 
             (this.hostNumericSensorInfo!=null &&
              java.util.Arrays.equals(this.hostNumericSensorInfo, other.getHostNumericSensorInfo())));
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
        if (getHostNumericSensorInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostNumericSensorInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostNumericSensorInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostNumericSensorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostNumericSensorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNumericSensorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostNumericSensorInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNumericSensorInfo"));
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
