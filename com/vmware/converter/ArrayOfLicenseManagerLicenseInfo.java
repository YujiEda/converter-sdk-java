/**
 * ArrayOfLicenseManagerLicenseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfLicenseManagerLicenseInfo  implements java.io.Serializable {
    private com.vmware.converter.LicenseManagerLicenseInfo[] licenseManagerLicenseInfo;

    public ArrayOfLicenseManagerLicenseInfo() {
    }

    public ArrayOfLicenseManagerLicenseInfo(
           com.vmware.converter.LicenseManagerLicenseInfo[] licenseManagerLicenseInfo) {
           this.licenseManagerLicenseInfo = licenseManagerLicenseInfo;
    }


    /**
     * Gets the licenseManagerLicenseInfo value for this ArrayOfLicenseManagerLicenseInfo.
     * 
     * @return licenseManagerLicenseInfo
     */
    public com.vmware.converter.LicenseManagerLicenseInfo[] getLicenseManagerLicenseInfo() {
        return licenseManagerLicenseInfo;
    }


    /**
     * Sets the licenseManagerLicenseInfo value for this ArrayOfLicenseManagerLicenseInfo.
     * 
     * @param licenseManagerLicenseInfo
     */
    public void setLicenseManagerLicenseInfo(com.vmware.converter.LicenseManagerLicenseInfo[] licenseManagerLicenseInfo) {
        this.licenseManagerLicenseInfo = licenseManagerLicenseInfo;
    }

    public com.vmware.converter.LicenseManagerLicenseInfo getLicenseManagerLicenseInfo(int i) {
        return this.licenseManagerLicenseInfo[i];
    }

    public void setLicenseManagerLicenseInfo(int i, com.vmware.converter.LicenseManagerLicenseInfo _value) {
        this.licenseManagerLicenseInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfLicenseManagerLicenseInfo)) return false;
        ArrayOfLicenseManagerLicenseInfo other = (ArrayOfLicenseManagerLicenseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseManagerLicenseInfo==null && other.getLicenseManagerLicenseInfo()==null) || 
             (this.licenseManagerLicenseInfo!=null &&
              java.util.Arrays.equals(this.licenseManagerLicenseInfo, other.getLicenseManagerLicenseInfo())));
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
        if (getLicenseManagerLicenseInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLicenseManagerLicenseInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLicenseManagerLicenseInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfLicenseManagerLicenseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfLicenseManagerLicenseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseManagerLicenseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "LicenseManagerLicenseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseManagerLicenseInfo"));
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
