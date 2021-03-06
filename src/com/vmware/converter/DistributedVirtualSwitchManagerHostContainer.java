/**
 * DistributedVirtualSwitchManagerHostContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchManagerHostContainer  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference container;

    private boolean recursive;

    public DistributedVirtualSwitchManagerHostContainer() {
    }

    public DistributedVirtualSwitchManagerHostContainer(
           com.vmware.converter.ManagedObjectReference container,
           boolean recursive) {
        this.container = container;
        this.recursive = recursive;
    }


    /**
     * Gets the container value for this DistributedVirtualSwitchManagerHostContainer.
     * 
     * @return container
     */
    public com.vmware.converter.ManagedObjectReference getContainer() {
        return container;
    }


    /**
     * Sets the container value for this DistributedVirtualSwitchManagerHostContainer.
     * 
     * @param container
     */
    public void setContainer(com.vmware.converter.ManagedObjectReference container) {
        this.container = container;
    }


    /**
     * Gets the recursive value for this DistributedVirtualSwitchManagerHostContainer.
     * 
     * @return recursive
     */
    public boolean isRecursive() {
        return recursive;
    }


    /**
     * Sets the recursive value for this DistributedVirtualSwitchManagerHostContainer.
     * 
     * @param recursive
     */
    public void setRecursive(boolean recursive) {
        this.recursive = recursive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchManagerHostContainer)) return false;
        DistributedVirtualSwitchManagerHostContainer other = (DistributedVirtualSwitchManagerHostContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.container==null && other.getContainer()==null) || 
             (this.container!=null &&
              this.container.equals(other.getContainer()))) &&
            this.recursive == other.isRecursive();
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
        if (getContainer() != null) {
            _hashCode += getContainer().hashCode();
        }
        _hashCode += (isRecursive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchManagerHostContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerHostContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("container");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "container"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recursive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
