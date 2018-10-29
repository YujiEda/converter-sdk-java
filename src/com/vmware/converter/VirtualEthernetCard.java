/**
 * VirtualEthernetCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualEthernetCard  extends com.vmware.converter.VirtualDevice  implements java.io.Serializable {
    private java.lang.String addressType;

    private java.lang.String macAddress;

    private java.lang.Boolean wakeOnLanEnabled;

    private com.vmware.converter.VirtualEthernetCardResourceAllocation resourceAllocation;

    private java.lang.String externalId;

    private java.lang.Boolean uptCompatibilityEnabled;

    public VirtualEthernetCard() {
    }

    public VirtualEthernetCard(
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
           java.lang.Boolean uptCompatibilityEnabled) {
        super(
            key,
            deviceInfo,
            backing,
            connectable,
            slotInfo,
            controllerKey,
            unitNumber);
        this.addressType = addressType;
        this.macAddress = macAddress;
        this.wakeOnLanEnabled = wakeOnLanEnabled;
        this.resourceAllocation = resourceAllocation;
        this.externalId = externalId;
        this.uptCompatibilityEnabled = uptCompatibilityEnabled;
    }


    /**
     * Gets the addressType value for this VirtualEthernetCard.
     * 
     * @return addressType
     */
    public java.lang.String getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this VirtualEthernetCard.
     * 
     * @param addressType
     */
    public void setAddressType(java.lang.String addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the macAddress value for this VirtualEthernetCard.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this VirtualEthernetCard.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the wakeOnLanEnabled value for this VirtualEthernetCard.
     * 
     * @return wakeOnLanEnabled
     */
    public java.lang.Boolean getWakeOnLanEnabled() {
        return wakeOnLanEnabled;
    }


    /**
     * Sets the wakeOnLanEnabled value for this VirtualEthernetCard.
     * 
     * @param wakeOnLanEnabled
     */
    public void setWakeOnLanEnabled(java.lang.Boolean wakeOnLanEnabled) {
        this.wakeOnLanEnabled = wakeOnLanEnabled;
    }


    /**
     * Gets the resourceAllocation value for this VirtualEthernetCard.
     * 
     * @return resourceAllocation
     */
    public com.vmware.converter.VirtualEthernetCardResourceAllocation getResourceAllocation() {
        return resourceAllocation;
    }


    /**
     * Sets the resourceAllocation value for this VirtualEthernetCard.
     * 
     * @param resourceAllocation
     */
    public void setResourceAllocation(com.vmware.converter.VirtualEthernetCardResourceAllocation resourceAllocation) {
        this.resourceAllocation = resourceAllocation;
    }


    /**
     * Gets the externalId value for this VirtualEthernetCard.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this VirtualEthernetCard.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the uptCompatibilityEnabled value for this VirtualEthernetCard.
     * 
     * @return uptCompatibilityEnabled
     */
    public java.lang.Boolean getUptCompatibilityEnabled() {
        return uptCompatibilityEnabled;
    }


    /**
     * Sets the uptCompatibilityEnabled value for this VirtualEthernetCard.
     * 
     * @param uptCompatibilityEnabled
     */
    public void setUptCompatibilityEnabled(java.lang.Boolean uptCompatibilityEnabled) {
        this.uptCompatibilityEnabled = uptCompatibilityEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualEthernetCard)) return false;
        VirtualEthernetCard other = (VirtualEthernetCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              this.addressType.equals(other.getAddressType()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.wakeOnLanEnabled==null && other.getWakeOnLanEnabled()==null) || 
             (this.wakeOnLanEnabled!=null &&
              this.wakeOnLanEnabled.equals(other.getWakeOnLanEnabled()))) &&
            ((this.resourceAllocation==null && other.getResourceAllocation()==null) || 
             (this.resourceAllocation!=null &&
              this.resourceAllocation.equals(other.getResourceAllocation()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.uptCompatibilityEnabled==null && other.getUptCompatibilityEnabled()==null) || 
             (this.uptCompatibilityEnabled!=null &&
              this.uptCompatibilityEnabled.equals(other.getUptCompatibilityEnabled())));
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
        if (getAddressType() != null) {
            _hashCode += getAddressType().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getWakeOnLanEnabled() != null) {
            _hashCode += getWakeOnLanEnabled().hashCode();
        }
        if (getResourceAllocation() != null) {
            _hashCode += getResourceAllocation().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getUptCompatibilityEnabled() != null) {
            _hashCode += getUptCompatibilityEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualEthernetCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualEthernetCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "addressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wakeOnLanEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wakeOnLanEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourceAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualEthernetCardResourceAllocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uptCompatibilityEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uptCompatibilityEnabled"));
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
