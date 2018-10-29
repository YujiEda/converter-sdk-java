/**
 * ArrayOfLicenseReservationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfLicenseReservationInfo  implements java.io.Serializable {
    private com.vmware.converter.LicenseReservationInfo[] licenseReservationInfo;

    public ArrayOfLicenseReservationInfo() {
    }

    public ArrayOfLicenseReservationInfo(
           com.vmware.converter.LicenseReservationInfo[] licenseReservationInfo) {
           this.licenseReservationInfo = licenseReservationInfo;
    }


    /**
     * Gets the licenseReservationInfo value for this ArrayOfLicenseReservationInfo.
     * 
     * @return licenseReservationInfo
     */
    public com.vmware.converter.LicenseReservationInfo[] getLicenseReservationInfo() {
        return licenseReservationInfo;
    }


    /**
     * Sets the licenseReservationInfo value for this ArrayOfLicenseReservationInfo.
     * 
     * @param licenseReservationInfo
     */
    public void setLicenseReservationInfo(com.vmware.converter.LicenseReservationInfo[] licenseReservationInfo) {
        this.licenseReservationInfo = licenseReservationInfo;
    }

    public com.vmware.converter.LicenseReservationInfo getLicenseReservationInfo(int i) {
        return this.licenseReservationInfo[i];
    }

    public void setLicenseReservationInfo(int i, com.vmware.converter.LicenseReservationInfo _value) {
        this.licenseReservationInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfLicenseReservationInfo)) return false;
        ArrayOfLicenseReservationInfo other = (ArrayOfLicenseReservationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseReservationInfo==null && other.getLicenseReservationInfo()==null) || 
             (this.licenseReservationInfo!=null &&
              java.util.Arrays.equals(this.licenseReservationInfo, other.getLicenseReservationInfo())));
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
        if (getLicenseReservationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLicenseReservationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLicenseReservationInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfLicenseReservationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfLicenseReservationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseReservationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "LicenseReservationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseReservationInfo"));
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
