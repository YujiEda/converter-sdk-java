/**
 * VirtualDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDevice  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int key;

    private com.vmware.converter.Description deviceInfo;

    private com.vmware.converter.VirtualDeviceBackingInfo backing;

    private com.vmware.converter.VirtualDeviceConnectInfo connectable;

    private com.vmware.converter.VirtualDeviceBusSlotInfo slotInfo;

    private java.lang.Integer controllerKey;

    private java.lang.Integer unitNumber;

    public VirtualDevice() {
    }

    public VirtualDevice(
           int key,
           com.vmware.converter.Description deviceInfo,
           com.vmware.converter.VirtualDeviceBackingInfo backing,
           com.vmware.converter.VirtualDeviceConnectInfo connectable,
           com.vmware.converter.VirtualDeviceBusSlotInfo slotInfo,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber) {
        this.key = key;
        this.deviceInfo = deviceInfo;
        this.backing = backing;
        this.connectable = connectable;
        this.slotInfo = slotInfo;
        this.controllerKey = controllerKey;
        this.unitNumber = unitNumber;
    }


    /**
     * Gets the key value for this VirtualDevice.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this VirtualDevice.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the deviceInfo value for this VirtualDevice.
     * 
     * @return deviceInfo
     */
    public com.vmware.converter.Description getDeviceInfo() {
        return deviceInfo;
    }


    /**
     * Sets the deviceInfo value for this VirtualDevice.
     * 
     * @param deviceInfo
     */
    public void setDeviceInfo(com.vmware.converter.Description deviceInfo) {
        this.deviceInfo = deviceInfo;
    }


    /**
     * Gets the backing value for this VirtualDevice.
     * 
     * @return backing
     */
    public com.vmware.converter.VirtualDeviceBackingInfo getBacking() {
        return backing;
    }


    /**
     * Sets the backing value for this VirtualDevice.
     * 
     * @param backing
     */
    public void setBacking(com.vmware.converter.VirtualDeviceBackingInfo backing) {
        this.backing = backing;
    }


    /**
     * Gets the connectable value for this VirtualDevice.
     * 
     * @return connectable
     */
    public com.vmware.converter.VirtualDeviceConnectInfo getConnectable() {
        return connectable;
    }


    /**
     * Sets the connectable value for this VirtualDevice.
     * 
     * @param connectable
     */
    public void setConnectable(com.vmware.converter.VirtualDeviceConnectInfo connectable) {
        this.connectable = connectable;
    }


    /**
     * Gets the slotInfo value for this VirtualDevice.
     * 
     * @return slotInfo
     */
    public com.vmware.converter.VirtualDeviceBusSlotInfo getSlotInfo() {
        return slotInfo;
    }


    /**
     * Sets the slotInfo value for this VirtualDevice.
     * 
     * @param slotInfo
     */
    public void setSlotInfo(com.vmware.converter.VirtualDeviceBusSlotInfo slotInfo) {
        this.slotInfo = slotInfo;
    }


    /**
     * Gets the controllerKey value for this VirtualDevice.
     * 
     * @return controllerKey
     */
    public java.lang.Integer getControllerKey() {
        return controllerKey;
    }


    /**
     * Sets the controllerKey value for this VirtualDevice.
     * 
     * @param controllerKey
     */
    public void setControllerKey(java.lang.Integer controllerKey) {
        this.controllerKey = controllerKey;
    }


    /**
     * Gets the unitNumber value for this VirtualDevice.
     * 
     * @return unitNumber
     */
    public java.lang.Integer getUnitNumber() {
        return unitNumber;
    }


    /**
     * Sets the unitNumber value for this VirtualDevice.
     * 
     * @param unitNumber
     */
    public void setUnitNumber(java.lang.Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDevice)) return false;
        VirtualDevice other = (VirtualDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.key == other.getKey() &&
            ((this.deviceInfo==null && other.getDeviceInfo()==null) || 
             (this.deviceInfo!=null &&
              this.deviceInfo.equals(other.getDeviceInfo()))) &&
            ((this.backing==null && other.getBacking()==null) || 
             (this.backing!=null &&
              this.backing.equals(other.getBacking()))) &&
            ((this.connectable==null && other.getConnectable()==null) || 
             (this.connectable!=null &&
              this.connectable.equals(other.getConnectable()))) &&
            ((this.slotInfo==null && other.getSlotInfo()==null) || 
             (this.slotInfo!=null &&
              this.slotInfo.equals(other.getSlotInfo()))) &&
            ((this.controllerKey==null && other.getControllerKey()==null) || 
             (this.controllerKey!=null &&
              this.controllerKey.equals(other.getControllerKey()))) &&
            ((this.unitNumber==null && other.getUnitNumber()==null) || 
             (this.unitNumber!=null &&
              this.unitNumber.equals(other.getUnitNumber())));
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
        _hashCode += getKey();
        if (getDeviceInfo() != null) {
            _hashCode += getDeviceInfo().hashCode();
        }
        if (getBacking() != null) {
            _hashCode += getBacking().hashCode();
        }
        if (getConnectable() != null) {
            _hashCode += getConnectable().hashCode();
        }
        if (getSlotInfo() != null) {
            _hashCode += getSlotInfo().hashCode();
        }
        if (getControllerKey() != null) {
            _hashCode += getControllerKey().hashCode();
        }
        if (getUnitNumber() != null) {
            _hashCode += getUnitNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceBackingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connectable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConnectInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "slotInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceBusSlotInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "controllerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unitNumber"));
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
