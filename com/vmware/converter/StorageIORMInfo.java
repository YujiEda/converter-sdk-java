/**
 * StorageIORMInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageIORMInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean enabled;

    private java.lang.String congestionThresholdMode;

    private int congestionThreshold;

    private java.lang.Integer percentOfPeakThroughput;

    private java.lang.Boolean statsCollectionEnabled;

    private java.lang.Boolean reservationEnabled;

    private java.lang.Boolean statsAggregationDisabled;

    private java.lang.Integer reservableIopsThreshold;

    public StorageIORMInfo() {
    }

    public StorageIORMInfo(
           boolean enabled,
           java.lang.String congestionThresholdMode,
           int congestionThreshold,
           java.lang.Integer percentOfPeakThroughput,
           java.lang.Boolean statsCollectionEnabled,
           java.lang.Boolean reservationEnabled,
           java.lang.Boolean statsAggregationDisabled,
           java.lang.Integer reservableIopsThreshold) {
        this.enabled = enabled;
        this.congestionThresholdMode = congestionThresholdMode;
        this.congestionThreshold = congestionThreshold;
        this.percentOfPeakThroughput = percentOfPeakThroughput;
        this.statsCollectionEnabled = statsCollectionEnabled;
        this.reservationEnabled = reservationEnabled;
        this.statsAggregationDisabled = statsAggregationDisabled;
        this.reservableIopsThreshold = reservableIopsThreshold;
    }


    /**
     * Gets the enabled value for this StorageIORMInfo.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this StorageIORMInfo.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the congestionThresholdMode value for this StorageIORMInfo.
     * 
     * @return congestionThresholdMode
     */
    public java.lang.String getCongestionThresholdMode() {
        return congestionThresholdMode;
    }


    /**
     * Sets the congestionThresholdMode value for this StorageIORMInfo.
     * 
     * @param congestionThresholdMode
     */
    public void setCongestionThresholdMode(java.lang.String congestionThresholdMode) {
        this.congestionThresholdMode = congestionThresholdMode;
    }


    /**
     * Gets the congestionThreshold value for this StorageIORMInfo.
     * 
     * @return congestionThreshold
     */
    public int getCongestionThreshold() {
        return congestionThreshold;
    }


    /**
     * Sets the congestionThreshold value for this StorageIORMInfo.
     * 
     * @param congestionThreshold
     */
    public void setCongestionThreshold(int congestionThreshold) {
        this.congestionThreshold = congestionThreshold;
    }


    /**
     * Gets the percentOfPeakThroughput value for this StorageIORMInfo.
     * 
     * @return percentOfPeakThroughput
     */
    public java.lang.Integer getPercentOfPeakThroughput() {
        return percentOfPeakThroughput;
    }


    /**
     * Sets the percentOfPeakThroughput value for this StorageIORMInfo.
     * 
     * @param percentOfPeakThroughput
     */
    public void setPercentOfPeakThroughput(java.lang.Integer percentOfPeakThroughput) {
        this.percentOfPeakThroughput = percentOfPeakThroughput;
    }


    /**
     * Gets the statsCollectionEnabled value for this StorageIORMInfo.
     * 
     * @return statsCollectionEnabled
     */
    public java.lang.Boolean getStatsCollectionEnabled() {
        return statsCollectionEnabled;
    }


    /**
     * Sets the statsCollectionEnabled value for this StorageIORMInfo.
     * 
     * @param statsCollectionEnabled
     */
    public void setStatsCollectionEnabled(java.lang.Boolean statsCollectionEnabled) {
        this.statsCollectionEnabled = statsCollectionEnabled;
    }


    /**
     * Gets the reservationEnabled value for this StorageIORMInfo.
     * 
     * @return reservationEnabled
     */
    public java.lang.Boolean getReservationEnabled() {
        return reservationEnabled;
    }


    /**
     * Sets the reservationEnabled value for this StorageIORMInfo.
     * 
     * @param reservationEnabled
     */
    public void setReservationEnabled(java.lang.Boolean reservationEnabled) {
        this.reservationEnabled = reservationEnabled;
    }


    /**
     * Gets the statsAggregationDisabled value for this StorageIORMInfo.
     * 
     * @return statsAggregationDisabled
     */
    public java.lang.Boolean getStatsAggregationDisabled() {
        return statsAggregationDisabled;
    }


    /**
     * Sets the statsAggregationDisabled value for this StorageIORMInfo.
     * 
     * @param statsAggregationDisabled
     */
    public void setStatsAggregationDisabled(java.lang.Boolean statsAggregationDisabled) {
        this.statsAggregationDisabled = statsAggregationDisabled;
    }


    /**
     * Gets the reservableIopsThreshold value for this StorageIORMInfo.
     * 
     * @return reservableIopsThreshold
     */
    public java.lang.Integer getReservableIopsThreshold() {
        return reservableIopsThreshold;
    }


    /**
     * Sets the reservableIopsThreshold value for this StorageIORMInfo.
     * 
     * @param reservableIopsThreshold
     */
    public void setReservableIopsThreshold(java.lang.Integer reservableIopsThreshold) {
        this.reservableIopsThreshold = reservableIopsThreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageIORMInfo)) return false;
        StorageIORMInfo other = (StorageIORMInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.enabled == other.isEnabled() &&
            ((this.congestionThresholdMode==null && other.getCongestionThresholdMode()==null) || 
             (this.congestionThresholdMode!=null &&
              this.congestionThresholdMode.equals(other.getCongestionThresholdMode()))) &&
            this.congestionThreshold == other.getCongestionThreshold() &&
            ((this.percentOfPeakThroughput==null && other.getPercentOfPeakThroughput()==null) || 
             (this.percentOfPeakThroughput!=null &&
              this.percentOfPeakThroughput.equals(other.getPercentOfPeakThroughput()))) &&
            ((this.statsCollectionEnabled==null && other.getStatsCollectionEnabled()==null) || 
             (this.statsCollectionEnabled!=null &&
              this.statsCollectionEnabled.equals(other.getStatsCollectionEnabled()))) &&
            ((this.reservationEnabled==null && other.getReservationEnabled()==null) || 
             (this.reservationEnabled!=null &&
              this.reservationEnabled.equals(other.getReservationEnabled()))) &&
            ((this.statsAggregationDisabled==null && other.getStatsAggregationDisabled()==null) || 
             (this.statsAggregationDisabled!=null &&
              this.statsAggregationDisabled.equals(other.getStatsAggregationDisabled()))) &&
            ((this.reservableIopsThreshold==null && other.getReservableIopsThreshold()==null) || 
             (this.reservableIopsThreshold!=null &&
              this.reservableIopsThreshold.equals(other.getReservableIopsThreshold())));
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
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCongestionThresholdMode() != null) {
            _hashCode += getCongestionThresholdMode().hashCode();
        }
        _hashCode += getCongestionThreshold();
        if (getPercentOfPeakThroughput() != null) {
            _hashCode += getPercentOfPeakThroughput().hashCode();
        }
        if (getStatsCollectionEnabled() != null) {
            _hashCode += getStatsCollectionEnabled().hashCode();
        }
        if (getReservationEnabled() != null) {
            _hashCode += getReservationEnabled().hashCode();
        }
        if (getStatsAggregationDisabled() != null) {
            _hashCode += getStatsAggregationDisabled().hashCode();
        }
        if (getReservableIopsThreshold() != null) {
            _hashCode += getReservableIopsThreshold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageIORMInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageIORMInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionThresholdMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "congestionThresholdMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "congestionThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOfPeakThroughput");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "percentOfPeakThroughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsCollectionEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "statsCollectionEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsAggregationDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "statsAggregationDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservableIopsThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservableIopsThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
