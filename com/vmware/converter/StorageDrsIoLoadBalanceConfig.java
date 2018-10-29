/**
 * StorageDrsIoLoadBalanceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsIoLoadBalanceConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer reservablePercentThreshold;

    private java.lang.Integer reservableIopsThreshold;

    private java.lang.String reservableThresholdMode;

    private java.lang.Integer ioLatencyThreshold;

    private java.lang.Integer ioLoadImbalanceThreshold;

    public StorageDrsIoLoadBalanceConfig() {
    }

    public StorageDrsIoLoadBalanceConfig(
           java.lang.Integer reservablePercentThreshold,
           java.lang.Integer reservableIopsThreshold,
           java.lang.String reservableThresholdMode,
           java.lang.Integer ioLatencyThreshold,
           java.lang.Integer ioLoadImbalanceThreshold) {
        this.reservablePercentThreshold = reservablePercentThreshold;
        this.reservableIopsThreshold = reservableIopsThreshold;
        this.reservableThresholdMode = reservableThresholdMode;
        this.ioLatencyThreshold = ioLatencyThreshold;
        this.ioLoadImbalanceThreshold = ioLoadImbalanceThreshold;
    }


    /**
     * Gets the reservablePercentThreshold value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @return reservablePercentThreshold
     */
    public java.lang.Integer getReservablePercentThreshold() {
        return reservablePercentThreshold;
    }


    /**
     * Sets the reservablePercentThreshold value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @param reservablePercentThreshold
     */
    public void setReservablePercentThreshold(java.lang.Integer reservablePercentThreshold) {
        this.reservablePercentThreshold = reservablePercentThreshold;
    }


    /**
     * Gets the reservableIopsThreshold value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @return reservableIopsThreshold
     */
    public java.lang.Integer getReservableIopsThreshold() {
        return reservableIopsThreshold;
    }


    /**
     * Sets the reservableIopsThreshold value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @param reservableIopsThreshold
     */
    public void setReservableIopsThreshold(java.lang.Integer reservableIopsThreshold) {
        this.reservableIopsThreshold = reservableIopsThreshold;
    }


    /**
     * Gets the reservableThresholdMode value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @return reservableThresholdMode
     */
    public java.lang.String getReservableThresholdMode() {
        return reservableThresholdMode;
    }


    /**
     * Sets the reservableThresholdMode value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @param reservableThresholdMode
     */
    public void setReservableThresholdMode(java.lang.String reservableThresholdMode) {
        this.reservableThresholdMode = reservableThresholdMode;
    }


    /**
     * Gets the ioLatencyThreshold value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @return ioLatencyThreshold
     */
    public java.lang.Integer getIoLatencyThreshold() {
        return ioLatencyThreshold;
    }


    /**
     * Sets the ioLatencyThreshold value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @param ioLatencyThreshold
     */
    public void setIoLatencyThreshold(java.lang.Integer ioLatencyThreshold) {
        this.ioLatencyThreshold = ioLatencyThreshold;
    }


    /**
     * Gets the ioLoadImbalanceThreshold value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @return ioLoadImbalanceThreshold
     */
    public java.lang.Integer getIoLoadImbalanceThreshold() {
        return ioLoadImbalanceThreshold;
    }


    /**
     * Sets the ioLoadImbalanceThreshold value for this StorageDrsIoLoadBalanceConfig.
     * 
     * @param ioLoadImbalanceThreshold
     */
    public void setIoLoadImbalanceThreshold(java.lang.Integer ioLoadImbalanceThreshold) {
        this.ioLoadImbalanceThreshold = ioLoadImbalanceThreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsIoLoadBalanceConfig)) return false;
        StorageDrsIoLoadBalanceConfig other = (StorageDrsIoLoadBalanceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reservablePercentThreshold==null && other.getReservablePercentThreshold()==null) || 
             (this.reservablePercentThreshold!=null &&
              this.reservablePercentThreshold.equals(other.getReservablePercentThreshold()))) &&
            ((this.reservableIopsThreshold==null && other.getReservableIopsThreshold()==null) || 
             (this.reservableIopsThreshold!=null &&
              this.reservableIopsThreshold.equals(other.getReservableIopsThreshold()))) &&
            ((this.reservableThresholdMode==null && other.getReservableThresholdMode()==null) || 
             (this.reservableThresholdMode!=null &&
              this.reservableThresholdMode.equals(other.getReservableThresholdMode()))) &&
            ((this.ioLatencyThreshold==null && other.getIoLatencyThreshold()==null) || 
             (this.ioLatencyThreshold!=null &&
              this.ioLatencyThreshold.equals(other.getIoLatencyThreshold()))) &&
            ((this.ioLoadImbalanceThreshold==null && other.getIoLoadImbalanceThreshold()==null) || 
             (this.ioLoadImbalanceThreshold!=null &&
              this.ioLoadImbalanceThreshold.equals(other.getIoLoadImbalanceThreshold())));
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
        if (getReservablePercentThreshold() != null) {
            _hashCode += getReservablePercentThreshold().hashCode();
        }
        if (getReservableIopsThreshold() != null) {
            _hashCode += getReservableIopsThreshold().hashCode();
        }
        if (getReservableThresholdMode() != null) {
            _hashCode += getReservableThresholdMode().hashCode();
        }
        if (getIoLatencyThreshold() != null) {
            _hashCode += getIoLatencyThreshold().hashCode();
        }
        if (getIoLoadImbalanceThreshold() != null) {
            _hashCode += getIoLoadImbalanceThreshold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageDrsIoLoadBalanceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsIoLoadBalanceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservablePercentThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservablePercentThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservableThresholdMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservableThresholdMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioLatencyThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioLatencyThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioLoadImbalanceThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioLoadImbalanceThreshold"));
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
