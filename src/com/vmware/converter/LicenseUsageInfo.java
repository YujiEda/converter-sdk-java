/**
 * LicenseUsageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class LicenseUsageInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.LicenseSource source;

    private boolean sourceAvailable;

    private com.vmware.converter.LicenseReservationInfo[] reservationInfo;

    private com.vmware.converter.LicenseFeatureInfo[] featureInfo;

    public LicenseUsageInfo() {
    }

    public LicenseUsageInfo(
           com.vmware.converter.LicenseSource source,
           boolean sourceAvailable,
           com.vmware.converter.LicenseReservationInfo[] reservationInfo,
           com.vmware.converter.LicenseFeatureInfo[] featureInfo) {
        this.source = source;
        this.sourceAvailable = sourceAvailable;
        this.reservationInfo = reservationInfo;
        this.featureInfo = featureInfo;
    }


    /**
     * Gets the source value for this LicenseUsageInfo.
     * 
     * @return source
     */
    public com.vmware.converter.LicenseSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this LicenseUsageInfo.
     * 
     * @param source
     */
    public void setSource(com.vmware.converter.LicenseSource source) {
        this.source = source;
    }


    /**
     * Gets the sourceAvailable value for this LicenseUsageInfo.
     * 
     * @return sourceAvailable
     */
    public boolean isSourceAvailable() {
        return sourceAvailable;
    }


    /**
     * Sets the sourceAvailable value for this LicenseUsageInfo.
     * 
     * @param sourceAvailable
     */
    public void setSourceAvailable(boolean sourceAvailable) {
        this.sourceAvailable = sourceAvailable;
    }


    /**
     * Gets the reservationInfo value for this LicenseUsageInfo.
     * 
     * @return reservationInfo
     */
    public com.vmware.converter.LicenseReservationInfo[] getReservationInfo() {
        return reservationInfo;
    }


    /**
     * Sets the reservationInfo value for this LicenseUsageInfo.
     * 
     * @param reservationInfo
     */
    public void setReservationInfo(com.vmware.converter.LicenseReservationInfo[] reservationInfo) {
        this.reservationInfo = reservationInfo;
    }

    public com.vmware.converter.LicenseReservationInfo getReservationInfo(int i) {
        return this.reservationInfo[i];
    }

    public void setReservationInfo(int i, com.vmware.converter.LicenseReservationInfo _value) {
        this.reservationInfo[i] = _value;
    }


    /**
     * Gets the featureInfo value for this LicenseUsageInfo.
     * 
     * @return featureInfo
     */
    public com.vmware.converter.LicenseFeatureInfo[] getFeatureInfo() {
        return featureInfo;
    }


    /**
     * Sets the featureInfo value for this LicenseUsageInfo.
     * 
     * @param featureInfo
     */
    public void setFeatureInfo(com.vmware.converter.LicenseFeatureInfo[] featureInfo) {
        this.featureInfo = featureInfo;
    }

    public com.vmware.converter.LicenseFeatureInfo getFeatureInfo(int i) {
        return this.featureInfo[i];
    }

    public void setFeatureInfo(int i, com.vmware.converter.LicenseFeatureInfo _value) {
        this.featureInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenseUsageInfo)) return false;
        LicenseUsageInfo other = (LicenseUsageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            this.sourceAvailable == other.isSourceAvailable() &&
            ((this.reservationInfo==null && other.getReservationInfo()==null) || 
             (this.reservationInfo!=null &&
              java.util.Arrays.equals(this.reservationInfo, other.getReservationInfo()))) &&
            ((this.featureInfo==null && other.getFeatureInfo()==null) || 
             (this.featureInfo!=null &&
              java.util.Arrays.equals(this.featureInfo, other.getFeatureInfo())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        _hashCode += (isSourceAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReservationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReservationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReservationInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatureInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureInfo(), i);
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
        new org.apache.axis.description.TypeDesc(LicenseUsageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseUsageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseSource"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseReservationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseFeatureInfo"));
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
