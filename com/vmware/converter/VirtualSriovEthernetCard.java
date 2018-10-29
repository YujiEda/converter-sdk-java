/**
 * VirtualSriovEthernetCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualSriovEthernetCard  extends com.vmware.converter.VirtualEthernetCard  implements java.io.Serializable {
    private java.lang.Boolean allowGuestOSMtuChange;

    private com.vmware.converter.VirtualSriovEthernetCardSriovBackingInfo sriovBacking;

    public VirtualSriovEthernetCard() {
    }

    public VirtualSriovEthernetCard(
           int key,
           com.vmware.converter.Description deviceInfo,
           com.vmware.converter.VirtualDeviceBackingInfo backing,
           com.vmware.converter.VirtualDeviceConnectInfo connectable,
           com.vmware.converter.VirtualDeviceBusSlotInfo slotInfo,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           java.lang.String addressType,
           java.lang.String macAddress,
           java.lang.Boolean wakeOnLanEnabled,
           com.vmware.converter.VirtualEthernetCardResourceAllocation resourceAllocation,
           java.lang.String externalId,
           java.lang.Boolean uptCompatibilityEnabled,
           java.lang.Boolean allowGuestOSMtuChange,
           com.vmware.converter.VirtualSriovEthernetCardSriovBackingInfo sriovBacking) {
        super(
            key,
            deviceInfo,
            backing,
            connectable,
            slotInfo,
            controllerKey,
            unitNumber,
            addressType,
            macAddress,
            wakeOnLanEnabled,
            resourceAllocation,
            externalId,
            uptCompatibilityEnabled);
        this.allowGuestOSMtuChange = allowGuestOSMtuChange;
        this.sriovBacking = sriovBacking;
    }


    /**
     * Gets the allowGuestOSMtuChange value for this VirtualSriovEthernetCard.
     * 
     * @return allowGuestOSMtuChange
     */
    public java.lang.Boolean getAllowGuestOSMtuChange() {
        return allowGuestOSMtuChange;
    }


    /**
     * Sets the allowGuestOSMtuChange value for this VirtualSriovEthernetCard.
     * 
     * @param allowGuestOSMtuChange
     */
    public void setAllowGuestOSMtuChange(java.lang.Boolean allowGuestOSMtuChange) {
        this.allowGuestOSMtuChange = allowGuestOSMtuChange;
    }


    /**
     * Gets the sriovBacking value for this VirtualSriovEthernetCard.
     * 
     * @return sriovBacking
     */
    public com.vmware.converter.VirtualSriovEthernetCardSriovBackingInfo getSriovBacking() {
        return sriovBacking;
    }


    /**
     * Sets the sriovBacking value for this VirtualSriovEthernetCard.
     * 
     * @param sriovBacking
     */
    public void setSriovBacking(com.vmware.converter.VirtualSriovEthernetCardSriovBackingInfo sriovBacking) {
        this.sriovBacking = sriovBacking;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualSriovEthernetCard)) return false;
        VirtualSriovEthernetCard other = (VirtualSriovEthernetCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowGuestOSMtuChange==null && other.getAllowGuestOSMtuChange()==null) || 
             (this.allowGuestOSMtuChange!=null &&
              this.allowGuestOSMtuChange.equals(other.getAllowGuestOSMtuChange()))) &&
            ((this.sriovBacking==null && other.getSriovBacking()==null) || 
             (this.sriovBacking!=null &&
              this.sriovBacking.equals(other.getSriovBacking())));
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
        if (getAllowGuestOSMtuChange() != null) {
            _hashCode += getAllowGuestOSMtuChange().hashCode();
        }
        if (getSriovBacking() != null) {
            _hashCode += getSriovBacking().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualSriovEthernetCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSriovEthernetCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowGuestOSMtuChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allowGuestOSMtuChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sriovBacking");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sriovBacking"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSriovEthernetCardSriovBackingInfo"));
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
