/**
 * ArrayOfHostFeatureVersionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostFeatureVersionInfo  implements java.io.Serializable {
    private com.vmware.converter.HostFeatureVersionInfo[] hostFeatureVersionInfo;

    public ArrayOfHostFeatureVersionInfo() {
    }

    public ArrayOfHostFeatureVersionInfo(
           com.vmware.converter.HostFeatureVersionInfo[] hostFeatureVersionInfo) {
           this.hostFeatureVersionInfo = hostFeatureVersionInfo;
    }


    /**
     * Gets the hostFeatureVersionInfo value for this ArrayOfHostFeatureVersionInfo.
     * 
     * @return hostFeatureVersionInfo
     */
    public com.vmware.converter.HostFeatureVersionInfo[] getHostFeatureVersionInfo() {
        return hostFeatureVersionInfo;
    }


    /**
     * Sets the hostFeatureVersionInfo value for this ArrayOfHostFeatureVersionInfo.
     * 
     * @param hostFeatureVersionInfo
     */
    public void setHostFeatureVersionInfo(com.vmware.converter.HostFeatureVersionInfo[] hostFeatureVersionInfo) {
        this.hostFeatureVersionInfo = hostFeatureVersionInfo;
    }

    public com.vmware.converter.HostFeatureVersionInfo getHostFeatureVersionInfo(int i) {
        return this.hostFeatureVersionInfo[i];
    }

    public void setHostFeatureVersionInfo(int i, com.vmware.converter.HostFeatureVersionInfo _value) {
        this.hostFeatureVersionInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostFeatureVersionInfo)) return false;
        ArrayOfHostFeatureVersionInfo other = (ArrayOfHostFeatureVersionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostFeatureVersionInfo==null && other.getHostFeatureVersionInfo()==null) || 
             (this.hostFeatureVersionInfo!=null &&
              java.util.Arrays.equals(this.hostFeatureVersionInfo, other.getHostFeatureVersionInfo())));
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
        if (getHostFeatureVersionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostFeatureVersionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostFeatureVersionInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostFeatureVersionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostFeatureVersionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostFeatureVersionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostFeatureVersionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureVersionInfo"));
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
