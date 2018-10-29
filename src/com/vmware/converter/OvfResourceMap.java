/**
 * OvfResourceMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfResourceMap  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String source;

    private com.vmware.converter.ManagedObjectReference parent;

    private com.vmware.converter.ResourceConfigSpec resourceSpec;

    private com.vmware.converter.ManagedObjectReference datastore;

    public OvfResourceMap() {
    }

    public OvfResourceMap(
           java.lang.String source,
           com.vmware.converter.ManagedObjectReference parent,
           com.vmware.converter.ResourceConfigSpec resourceSpec,
           com.vmware.converter.ManagedObjectReference datastore) {
        this.source = source;
        this.parent = parent;
        this.resourceSpec = resourceSpec;
        this.datastore = datastore;
    }


    /**
     * Gets the source value for this OvfResourceMap.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this OvfResourceMap.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the parent value for this OvfResourceMap.
     * 
     * @return parent
     */
    public com.vmware.converter.ManagedObjectReference getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this OvfResourceMap.
     * 
     * @param parent
     */
    public void setParent(com.vmware.converter.ManagedObjectReference parent) {
        this.parent = parent;
    }


    /**
     * Gets the resourceSpec value for this OvfResourceMap.
     * 
     * @return resourceSpec
     */
    public com.vmware.converter.ResourceConfigSpec getResourceSpec() {
        return resourceSpec;
    }


    /**
     * Sets the resourceSpec value for this OvfResourceMap.
     * 
     * @param resourceSpec
     */
    public void setResourceSpec(com.vmware.converter.ResourceConfigSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }


    /**
     * Gets the datastore value for this OvfResourceMap.
     * 
     * @return datastore
     */
    public com.vmware.converter.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this OvfResourceMap.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfResourceMap)) return false;
        OvfResourceMap other = (OvfResourceMap) obj;
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
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore())));
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
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfResourceMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfResourceMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
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
