/**
 * StorageIORMConfigOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageIORMConfigOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.BoolOption enabledOption;

    private com.vmware.converter.IntOption congestionThresholdOption;

    private com.vmware.converter.BoolOption statsCollectionEnabledOption;

    private com.vmware.converter.BoolOption reservationEnabledOption;

    public StorageIORMConfigOption() {
    }

    public StorageIORMConfigOption(
           com.vmware.converter.BoolOption enabledOption,
           com.vmware.converter.IntOption congestionThresholdOption,
           com.vmware.converter.BoolOption statsCollectionEnabledOption,
           com.vmware.converter.BoolOption reservationEnabledOption) {
        this.enabledOption = enabledOption;
        this.congestionThresholdOption = congestionThresholdOption;
        this.statsCollectionEnabledOption = statsCollectionEnabledOption;
        this.reservationEnabledOption = reservationEnabledOption;
    }


    /**
     * Gets the enabledOption value for this StorageIORMConfigOption.
     * 
     * @return enabledOption
     */
    public com.vmware.converter.BoolOption getEnabledOption() {
        return enabledOption;
    }


    /**
     * Sets the enabledOption value for this StorageIORMConfigOption.
     * 
     * @param enabledOption
     */
    public void setEnabledOption(com.vmware.converter.BoolOption enabledOption) {
        this.enabledOption = enabledOption;
    }


    /**
     * Gets the congestionThresholdOption value for this StorageIORMConfigOption.
     * 
     * @return congestionThresholdOption
     */
    public com.vmware.converter.IntOption getCongestionThresholdOption() {
        return congestionThresholdOption;
    }


    /**
     * Sets the congestionThresholdOption value for this StorageIORMConfigOption.
     * 
     * @param congestionThresholdOption
     */
    public void setCongestionThresholdOption(com.vmware.converter.IntOption congestionThresholdOption) {
        this.congestionThresholdOption = congestionThresholdOption;
    }


    /**
     * Gets the statsCollectionEnabledOption value for this StorageIORMConfigOption.
     * 
     * @return statsCollectionEnabledOption
     */
    public com.vmware.converter.BoolOption getStatsCollectionEnabledOption() {
        return statsCollectionEnabledOption;
    }


    /**
     * Sets the statsCollectionEnabledOption value for this StorageIORMConfigOption.
     * 
     * @param statsCollectionEnabledOption
     */
    public void setStatsCollectionEnabledOption(com.vmware.converter.BoolOption statsCollectionEnabledOption) {
        this.statsCollectionEnabledOption = statsCollectionEnabledOption;
    }


    /**
     * Gets the reservationEnabledOption value for this StorageIORMConfigOption.
     * 
     * @return reservationEnabledOption
     */
    public com.vmware.converter.BoolOption getReservationEnabledOption() {
        return reservationEnabledOption;
    }


    /**
     * Sets the reservationEnabledOption value for this StorageIORMConfigOption.
     * 
     * @param reservationEnabledOption
     */
    public void setReservationEnabledOption(com.vmware.converter.BoolOption reservationEnabledOption) {
        this.reservationEnabledOption = reservationEnabledOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageIORMConfigOption)) return false;
        StorageIORMConfigOption other = (StorageIORMConfigOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enabledOption==null && other.getEnabledOption()==null) || 
             (this.enabledOption!=null &&
              this.enabledOption.equals(other.getEnabledOption()))) &&
            ((this.congestionThresholdOption==null && other.getCongestionThresholdOption()==null) || 
             (this.congestionThresholdOption!=null &&
              this.congestionThresholdOption.equals(other.getCongestionThresholdOption()))) &&
            ((this.statsCollectionEnabledOption==null && other.getStatsCollectionEnabledOption()==null) || 
             (this.statsCollectionEnabledOption!=null &&
              this.statsCollectionEnabledOption.equals(other.getStatsCollectionEnabledOption()))) &&
            ((this.reservationEnabledOption==null && other.getReservationEnabledOption()==null) || 
             (this.reservationEnabledOption!=null &&
              this.reservationEnabledOption.equals(other.getReservationEnabledOption())));
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
        if (getEnabledOption() != null) {
            _hashCode += getEnabledOption().hashCode();
        }
        if (getCongestionThresholdOption() != null) {
            _hashCode += getCongestionThresholdOption().hashCode();
        }
        if (getStatsCollectionEnabledOption() != null) {
            _hashCode += getStatsCollectionEnabledOption().hashCode();
        }
        if (getReservationEnabledOption() != null) {
            _hashCode += getReservationEnabledOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageIORMConfigOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageIORMConfigOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabledOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congestionThresholdOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "congestionThresholdOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsCollectionEnabledOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "statsCollectionEnabledOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationEnabledOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationEnabledOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
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
