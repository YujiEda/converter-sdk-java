/**
 * IscsiDependencyEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IscsiDependencyEntity  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String pnicDevice;

    private java.lang.String vnicDevice;

    private java.lang.String vmhbaName;

    public IscsiDependencyEntity() {
    }

    public IscsiDependencyEntity(
           java.lang.String pnicDevice,
           java.lang.String vnicDevice,
           java.lang.String vmhbaName) {
        this.pnicDevice = pnicDevice;
        this.vnicDevice = vnicDevice;
        this.vmhbaName = vmhbaName;
    }


    /**
     * Gets the pnicDevice value for this IscsiDependencyEntity.
     * 
     * @return pnicDevice
     */
    public java.lang.String getPnicDevice() {
        return pnicDevice;
    }


    /**
     * Sets the pnicDevice value for this IscsiDependencyEntity.
     * 
     * @param pnicDevice
     */
    public void setPnicDevice(java.lang.String pnicDevice) {
        this.pnicDevice = pnicDevice;
    }


    /**
     * Gets the vnicDevice value for this IscsiDependencyEntity.
     * 
     * @return vnicDevice
     */
    public java.lang.String getVnicDevice() {
        return vnicDevice;
    }


    /**
     * Sets the vnicDevice value for this IscsiDependencyEntity.
     * 
     * @param vnicDevice
     */
    public void setVnicDevice(java.lang.String vnicDevice) {
        this.vnicDevice = vnicDevice;
    }


    /**
     * Gets the vmhbaName value for this IscsiDependencyEntity.
     * 
     * @return vmhbaName
     */
    public java.lang.String getVmhbaName() {
        return vmhbaName;
    }


    /**
     * Sets the vmhbaName value for this IscsiDependencyEntity.
     * 
     * @param vmhbaName
     */
    public void setVmhbaName(java.lang.String vmhbaName) {
        this.vmhbaName = vmhbaName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IscsiDependencyEntity)) return false;
        IscsiDependencyEntity other = (IscsiDependencyEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pnicDevice==null && other.getPnicDevice()==null) || 
             (this.pnicDevice!=null &&
              this.pnicDevice.equals(other.getPnicDevice()))) &&
            ((this.vnicDevice==null && other.getVnicDevice()==null) || 
             (this.vnicDevice!=null &&
              this.vnicDevice.equals(other.getVnicDevice()))) &&
            ((this.vmhbaName==null && other.getVmhbaName()==null) || 
             (this.vmhbaName!=null &&
              this.vmhbaName.equals(other.getVmhbaName())));
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
        if (getPnicDevice() != null) {
            _hashCode += getPnicDevice().hashCode();
        }
        if (getVnicDevice() != null) {
            _hashCode += getVnicDevice().hashCode();
        }
        if (getVmhbaName() != null) {
            _hashCode += getVmhbaName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IscsiDependencyEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiDependencyEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmhbaName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmhbaName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
