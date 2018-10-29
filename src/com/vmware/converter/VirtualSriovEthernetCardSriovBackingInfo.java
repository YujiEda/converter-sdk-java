/**
 * VirtualSriovEthernetCardSriovBackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualSriovEthernetCardSriovBackingInfo  extends com.vmware.converter.VirtualDeviceBackingInfo  implements java.io.Serializable {
    private com.vmware.converter.VirtualPCIPassthroughDeviceBackingInfo physicalFunctionBacking;

    private com.vmware.converter.VirtualPCIPassthroughDeviceBackingInfo virtualFunctionBacking;

    private java.lang.Integer virtualFunctionIndex;

    public VirtualSriovEthernetCardSriovBackingInfo() {
    }

    public VirtualSriovEthernetCardSriovBackingInfo(
           com.vmware.converter.VirtualPCIPassthroughDeviceBackingInfo physicalFunctionBacking,
           com.vmware.converter.VirtualPCIPassthroughDeviceBackingInfo virtualFunctionBacking,
           java.lang.Integer virtualFunctionIndex) {
        this.physicalFunctionBacking = physicalFunctionBacking;
        this.virtualFunctionBacking = virtualFunctionBacking;
        this.virtualFunctionIndex = virtualFunctionIndex;
    }


    /**
     * Gets the physicalFunctionBacking value for this VirtualSriovEthernetCardSriovBackingInfo.
     * 
     * @return physicalFunctionBacking
     */
    public com.vmware.converter.VirtualPCIPassthroughDeviceBackingInfo getPhysicalFunctionBacking() {
        return physicalFunctionBacking;
    }


    /**
     * Sets the physicalFunctionBacking value for this VirtualSriovEthernetCardSriovBackingInfo.
     * 
     * @param physicalFunctionBacking
     */
    public void setPhysicalFunctionBacking(com.vmware.converter.VirtualPCIPassthroughDeviceBackingInfo physicalFunctionBacking) {
        this.physicalFunctionBacking = physicalFunctionBacking;
    }


    /**
     * Gets the virtualFunctionBacking value for this VirtualSriovEthernetCardSriovBackingInfo.
     * 
     * @return virtualFunctionBacking
     */
    public com.vmware.converter.VirtualPCIPassthroughDeviceBackingInfo getVirtualFunctionBacking() {
        return virtualFunctionBacking;
    }


    /**
     * Sets the virtualFunctionBacking value for this VirtualSriovEthernetCardSriovBackingInfo.
     * 
     * @param virtualFunctionBacking
     */
    public void setVirtualFunctionBacking(com.vmware.converter.VirtualPCIPassthroughDeviceBackingInfo virtualFunctionBacking) {
        this.virtualFunctionBacking = virtualFunctionBacking;
    }


    /**
     * Gets the virtualFunctionIndex value for this VirtualSriovEthernetCardSriovBackingInfo.
     * 
     * @return virtualFunctionIndex
     */
    public java.lang.Integer getVirtualFunctionIndex() {
        return virtualFunctionIndex;
    }


    /**
     * Sets the virtualFunctionIndex value for this VirtualSriovEthernetCardSriovBackingInfo.
     * 
     * @param virtualFunctionIndex
     */
    public void setVirtualFunctionIndex(java.lang.Integer virtualFunctionIndex) {
        this.virtualFunctionIndex = virtualFunctionIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualSriovEthernetCardSriovBackingInfo)) return false;
        VirtualSriovEthernetCardSriovBackingInfo other = (VirtualSriovEthernetCardSriovBackingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.physicalFunctionBacking==null && other.getPhysicalFunctionBacking()==null) || 
             (this.physicalFunctionBacking!=null &&
              this.physicalFunctionBacking.equals(other.getPhysicalFunctionBacking()))) &&
            ((this.virtualFunctionBacking==null && other.getVirtualFunctionBacking()==null) || 
             (this.virtualFunctionBacking!=null &&
              this.virtualFunctionBacking.equals(other.getVirtualFunctionBacking()))) &&
            ((this.virtualFunctionIndex==null && other.getVirtualFunctionIndex()==null) || 
             (this.virtualFunctionIndex!=null &&
              this.virtualFunctionIndex.equals(other.getVirtualFunctionIndex())));
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
        if (getPhysicalFunctionBacking() != null) {
            _hashCode += getPhysicalFunctionBacking().hashCode();
        }
        if (getVirtualFunctionBacking() != null) {
            _hashCode += getVirtualFunctionBacking().hashCode();
        }
        if (getVirtualFunctionIndex() != null) {
            _hashCode += getVirtualFunctionIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualSriovEthernetCardSriovBackingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSriovEthernetCardSriovBackingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalFunctionBacking");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "physicalFunctionBacking"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualPCIPassthroughDeviceBackingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualFunctionBacking");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualFunctionBacking"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualPCIPassthroughDeviceBackingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualFunctionIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualFunctionIndex"));
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
