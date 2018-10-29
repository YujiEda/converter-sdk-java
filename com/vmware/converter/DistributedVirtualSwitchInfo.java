/**
 * DistributedVirtualSwitchInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String switchName;

    private java.lang.String switchUuid;

    private com.vmware.converter.ManagedObjectReference distributedVirtualSwitch;

    private java.lang.Boolean networkReservationSupported;

    public DistributedVirtualSwitchInfo() {
    }

    public DistributedVirtualSwitchInfo(
           java.lang.String switchName,
           java.lang.String switchUuid,
           com.vmware.converter.ManagedObjectReference distributedVirtualSwitch,
           java.lang.Boolean networkReservationSupported) {
        this.switchName = switchName;
        this.switchUuid = switchUuid;
        this.distributedVirtualSwitch = distributedVirtualSwitch;
        this.networkReservationSupported = networkReservationSupported;
    }


    /**
     * Gets the switchName value for this DistributedVirtualSwitchInfo.
     * 
     * @return switchName
     */
    public java.lang.String getSwitchName() {
        return switchName;
    }


    /**
     * Sets the switchName value for this DistributedVirtualSwitchInfo.
     * 
     * @param switchName
     */
    public void setSwitchName(java.lang.String switchName) {
        this.switchName = switchName;
    }


    /**
     * Gets the switchUuid value for this DistributedVirtualSwitchInfo.
     * 
     * @return switchUuid
     */
    public java.lang.String getSwitchUuid() {
        return switchUuid;
    }


    /**
     * Sets the switchUuid value for this DistributedVirtualSwitchInfo.
     * 
     * @param switchUuid
     */
    public void setSwitchUuid(java.lang.String switchUuid) {
        this.switchUuid = switchUuid;
    }


    /**
     * Gets the distributedVirtualSwitch value for this DistributedVirtualSwitchInfo.
     * 
     * @return distributedVirtualSwitch
     */
    public com.vmware.converter.ManagedObjectReference getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }


    /**
     * Sets the distributedVirtualSwitch value for this DistributedVirtualSwitchInfo.
     * 
     * @param distributedVirtualSwitch
     */
    public void setDistributedVirtualSwitch(com.vmware.converter.ManagedObjectReference distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }


    /**
     * Gets the networkReservationSupported value for this DistributedVirtualSwitchInfo.
     * 
     * @return networkReservationSupported
     */
    public java.lang.Boolean getNetworkReservationSupported() {
        return networkReservationSupported;
    }


    /**
     * Sets the networkReservationSupported value for this DistributedVirtualSwitchInfo.
     * 
     * @param networkReservationSupported
     */
    public void setNetworkReservationSupported(java.lang.Boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchInfo)) return false;
        DistributedVirtualSwitchInfo other = (DistributedVirtualSwitchInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.switchName==null && other.getSwitchName()==null) || 
             (this.switchName!=null &&
              this.switchName.equals(other.getSwitchName()))) &&
            ((this.switchUuid==null && other.getSwitchUuid()==null) || 
             (this.switchUuid!=null &&
              this.switchUuid.equals(other.getSwitchUuid()))) &&
            ((this.distributedVirtualSwitch==null && other.getDistributedVirtualSwitch()==null) || 
             (this.distributedVirtualSwitch!=null &&
              this.distributedVirtualSwitch.equals(other.getDistributedVirtualSwitch()))) &&
            ((this.networkReservationSupported==null && other.getNetworkReservationSupported()==null) || 
             (this.networkReservationSupported!=null &&
              this.networkReservationSupported.equals(other.getNetworkReservationSupported())));
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
        if (getSwitchName() != null) {
            _hashCode += getSwitchName().hashCode();
        }
        if (getSwitchUuid() != null) {
            _hashCode += getSwitchUuid().hashCode();
        }
        if (getDistributedVirtualSwitch() != null) {
            _hashCode += getDistributedVirtualSwitch().hashCode();
        }
        if (getNetworkReservationSupported() != null) {
            _hashCode += getNetworkReservationSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkReservationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkReservationSupported"));
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
