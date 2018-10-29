/**
 * HostGraphicsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostGraphicsInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String deviceName;

    private java.lang.String vendorName;

    private java.lang.String pciId;

    private java.lang.String graphicsType;

    private long memorySizeInKB;

    private com.vmware.converter.ManagedObjectReference[] vm;

    public HostGraphicsInfo() {
    }

    public HostGraphicsInfo(
           java.lang.String deviceName,
           java.lang.String vendorName,
           java.lang.String pciId,
           java.lang.String graphicsType,
           long memorySizeInKB,
           com.vmware.converter.ManagedObjectReference[] vm) {
        this.deviceName = deviceName;
        this.vendorName = vendorName;
        this.pciId = pciId;
        this.graphicsType = graphicsType;
        this.memorySizeInKB = memorySizeInKB;
        this.vm = vm;
    }


    /**
     * Gets the deviceName value for this HostGraphicsInfo.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this HostGraphicsInfo.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the vendorName value for this HostGraphicsInfo.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this HostGraphicsInfo.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the pciId value for this HostGraphicsInfo.
     * 
     * @return pciId
     */
    public java.lang.String getPciId() {
        return pciId;
    }


    /**
     * Sets the pciId value for this HostGraphicsInfo.
     * 
     * @param pciId
     */
    public void setPciId(java.lang.String pciId) {
        this.pciId = pciId;
    }


    /**
     * Gets the graphicsType value for this HostGraphicsInfo.
     * 
     * @return graphicsType
     */
    public java.lang.String getGraphicsType() {
        return graphicsType;
    }


    /**
     * Sets the graphicsType value for this HostGraphicsInfo.
     * 
     * @param graphicsType
     */
    public void setGraphicsType(java.lang.String graphicsType) {
        this.graphicsType = graphicsType;
    }


    /**
     * Gets the memorySizeInKB value for this HostGraphicsInfo.
     * 
     * @return memorySizeInKB
     */
    public long getMemorySizeInKB() {
        return memorySizeInKB;
    }


    /**
     * Sets the memorySizeInKB value for this HostGraphicsInfo.
     * 
     * @param memorySizeInKB
     */
    public void setMemorySizeInKB(long memorySizeInKB) {
        this.memorySizeInKB = memorySizeInKB;
    }


    /**
     * Gets the vm value for this HostGraphicsInfo.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference[] getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this HostGraphicsInfo.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference[] vm) {
        this.vm = vm;
    }

    public com.vmware.converter.ManagedObjectReference getVm(int i) {
        return this.vm[i];
    }

    public void setVm(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.vm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostGraphicsInfo)) return false;
        HostGraphicsInfo other = (HostGraphicsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.pciId==null && other.getPciId()==null) || 
             (this.pciId!=null &&
              this.pciId.equals(other.getPciId()))) &&
            ((this.graphicsType==null && other.getGraphicsType()==null) || 
             (this.graphicsType!=null &&
              this.graphicsType.equals(other.getGraphicsType()))) &&
            this.memorySizeInKB == other.getMemorySizeInKB() &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              java.util.Arrays.equals(this.vm, other.getVm())));
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
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getPciId() != null) {
            _hashCode += getPciId().hashCode();
        }
        if (getGraphicsType() != null) {
            _hashCode += getGraphicsType().hashCode();
        }
        _hashCode += new Long(getMemorySizeInKB()).hashCode();
        if (getVm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVm(), i);
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
        new org.apache.axis.description.TypeDesc(HostGraphicsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostGraphicsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pciId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pciId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphicsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "graphicsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorySizeInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memorySizeInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
