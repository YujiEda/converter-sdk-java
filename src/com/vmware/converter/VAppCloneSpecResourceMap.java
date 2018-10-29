/**
 * VAppCloneSpecResourceMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VAppCloneSpecResourceMap  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference source;

    private com.vmware.converter.ManagedObjectReference parent;

    private com.vmware.converter.ResourceConfigSpec resourceSpec;

    private com.vmware.converter.ManagedObjectReference location;

    public VAppCloneSpecResourceMap() {
    }

    public VAppCloneSpecResourceMap(
           com.vmware.converter.ManagedObjectReference source,
           com.vmware.converter.ManagedObjectReference parent,
           com.vmware.converter.ResourceConfigSpec resourceSpec,
           com.vmware.converter.ManagedObjectReference location) {
        this.source = source;
        this.parent = parent;
        this.resourceSpec = resourceSpec;
        this.location = location;
    }


    /**
     * Gets the source value for this VAppCloneSpecResourceMap.
     * 
     * @return source
     */
    public com.vmware.converter.ManagedObjectReference getSource() {
        return source;
    }


    /**
     * Sets the source value for this VAppCloneSpecResourceMap.
     * 
     * @param source
     */
    public void setSource(com.vmware.converter.ManagedObjectReference source) {
        this.source = source;
    }


    /**
     * Gets the parent value for this VAppCloneSpecResourceMap.
     * 
     * @return parent
     */
    public com.vmware.converter.ManagedObjectReference getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this VAppCloneSpecResourceMap.
     * 
     * @param parent
     */
    public void setParent(com.vmware.converter.ManagedObjectReference parent) {
        this.parent = parent;
    }


    /**
     * Gets the resourceSpec value for this VAppCloneSpecResourceMap.
     * 
     * @return resourceSpec
     */
    public com.vmware.converter.ResourceConfigSpec getResourceSpec() {
        return resourceSpec;
    }


    /**
     * Sets the resourceSpec value for this VAppCloneSpecResourceMap.
     * 
     * @param resourceSpec
     */
    public void setResourceSpec(com.vmware.converter.ResourceConfigSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }


    /**
     * Gets the location value for this VAppCloneSpecResourceMap.
     * 
     * @return location
     */
    public com.vmware.converter.ManagedObjectReference getLocation() {
        return location;
    }


    /**
     * Sets the location value for this VAppCloneSpecResourceMap.
     * 
     * @param location
     */
    public void setLocation(com.vmware.converter.ManagedObjectReference location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VAppCloneSpecResourceMap)) return false;
        VAppCloneSpecResourceMap other = (VAppCloneSpecResourceMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.resourceSpec==null && other.getResourceSpec()==null) || 
             (this.resourceSpec!=null &&
              this.resourceSpec.equals(other.getResourceSpec()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getResourceSpec() != null) {
            _hashCode += getResourceSpec().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VAppCloneSpecResourceMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppCloneSpecResourceMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourceSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
