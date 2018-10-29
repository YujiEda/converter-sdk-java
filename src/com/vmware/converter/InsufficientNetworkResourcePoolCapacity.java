/**
 * InsufficientNetworkResourcePoolCapacity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InsufficientNetworkResourcePoolCapacity  extends com.vmware.converter.InsufficientResourcesFault  implements java.io.Serializable {
    private java.lang.String dvsName;

    private java.lang.String dvsUuid;

    private java.lang.String resourcePoolKey;

    private long available;

    private long requested;

    private java.lang.String[] device;

    public InsufficientNetworkResourcePoolCapacity() {
    }

    public InsufficientNetworkResourcePoolCapacity(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String dvsName,
           java.lang.String dvsUuid,
           java.lang.String resourcePoolKey,
           long available,
           long requested,
           java.lang.String[] device) {
        super(
            faultCause,
            faultMessage);
        this.dvsName = dvsName;
        this.dvsUuid = dvsUuid;
        this.resourcePoolKey = resourcePoolKey;
        this.available = available;
        this.requested = requested;
        this.device = device;
    }


    /**
     * Gets the dvsName value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @return dvsName
     */
    public java.lang.String getDvsName() {
        return dvsName;
    }


    /**
     * Sets the dvsName value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @param dvsName
     */
    public void setDvsName(java.lang.String dvsName) {
        this.dvsName = dvsName;
    }


    /**
     * Gets the dvsUuid value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @return dvsUuid
     */
    public java.lang.String getDvsUuid() {
        return dvsUuid;
    }


    /**
     * Sets the dvsUuid value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @param dvsUuid
     */
    public void setDvsUuid(java.lang.String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }


    /**
     * Gets the resourcePoolKey value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @return resourcePoolKey
     */
    public java.lang.String getResourcePoolKey() {
        return resourcePoolKey;
    }


    /**
     * Sets the resourcePoolKey value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @param resourcePoolKey
     */
    public void setResourcePoolKey(java.lang.String resourcePoolKey) {
        this.resourcePoolKey = resourcePoolKey;
    }


    /**
     * Gets the available value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @return available
     */
    public long getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @param available
     */
    public void setAvailable(long available) {
        this.available = available;
    }


    /**
     * Gets the requested value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @return requested
     */
    public long getRequested() {
        return requested;
    }


    /**
     * Sets the requested value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @param requested
     */
    public void setRequested(long requested) {
        this.requested = requested;
    }


    /**
     * Gets the device value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @return device
     */
    public java.lang.String[] getDevice() {
        return device;
    }


    /**
     * Sets the device value for this InsufficientNetworkResourcePoolCapacity.
     * 
     * @param device
     */
    public void setDevice(java.lang.String[] device) {
        this.device = device;
    }

    public java.lang.String getDevice(int i) {
        return this.device[i];
    }

    public void setDevice(int i, java.lang.String _value) {
        this.device[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsufficientNetworkResourcePoolCapacity)) return false;
        InsufficientNetworkResourcePoolCapacity other = (InsufficientNetworkResourcePoolCapacity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dvsName==null && other.getDvsName()==null) || 
             (this.dvsName!=null &&
              this.dvsName.equals(other.getDvsName()))) &&
            ((this.dvsUuid==null && other.getDvsUuid()==null) || 
             (this.dvsUuid!=null &&
              this.dvsUuid.equals(other.getDvsUuid()))) &&
            ((this.resourcePoolKey==null && other.getResourcePoolKey()==null) || 
             (this.resourcePoolKey!=null &&
              this.resourcePoolKey.equals(other.getResourcePoolKey()))) &&
            this.available == other.getAvailable() &&
            this.requested == other.getRequested() &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              java.util.Arrays.equals(this.device, other.getDevice())));
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
        if (getDvsName() != null) {
            _hashCode += getDvsName().hashCode();
        }
        if (getDvsUuid() != null) {
            _hashCode += getDvsUuid().hashCode();
        }
        if (getResourcePoolKey() != null) {
            _hashCode += getResourcePoolKey().hashCode();
        }
        _hashCode += new Long(getAvailable()).hashCode();
        _hashCode += new Long(getRequested()).hashCode();
        if (getDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevice(), i);
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
        new org.apache.axis.description.TypeDesc(InsufficientNetworkResourcePoolCapacity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InsufficientNetworkResourcePoolCapacity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePoolKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourcePoolKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requested");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
