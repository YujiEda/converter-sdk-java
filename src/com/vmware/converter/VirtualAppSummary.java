/**
 * VirtualAppSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualAppSummary  extends com.vmware.converter.ResourcePoolSummary  implements java.io.Serializable {
    private com.vmware.converter.VAppProductInfo product;

    private com.vmware.converter.VirtualAppVAppState vAppState;

    private java.lang.Boolean suspended;

    private java.lang.Boolean installBootRequired;

    private java.lang.String instanceUuid;

    public VirtualAppSummary() {
    }

    public VirtualAppSummary(
           java.lang.String name,
           com.vmware.converter.ResourceConfigSpec config,
           com.vmware.converter.ResourcePoolRuntimeInfo runtime,
           com.vmware.converter.ResourcePoolQuickStats quickStats,
           java.lang.Integer configuredMemoryMB,
           com.vmware.converter.VAppProductInfo product,
           com.vmware.converter.VirtualAppVAppState vAppState,
           java.lang.Boolean suspended,
           java.lang.Boolean installBootRequired,
           java.lang.String instanceUuid) {
        super(
            name,
            config,
            runtime,
            quickStats,
            configuredMemoryMB);
        this.product = product;
        this.vAppState = vAppState;
        this.suspended = suspended;
        this.installBootRequired = installBootRequired;
        this.instanceUuid = instanceUuid;
    }


    /**
     * Gets the product value for this VirtualAppSummary.
     * 
     * @return product
     */
    public com.vmware.converter.VAppProductInfo getProduct() {
        return product;
    }


    /**
     * Sets the product value for this VirtualAppSummary.
     * 
     * @param product
     */
    public void setProduct(com.vmware.converter.VAppProductInfo product) {
        this.product = product;
    }


    /**
     * Gets the vAppState value for this VirtualAppSummary.
     * 
     * @return vAppState
     */
    public com.vmware.converter.VirtualAppVAppState getVAppState() {
        return vAppState;
    }


    /**
     * Sets the vAppState value for this VirtualAppSummary.
     * 
     * @param vAppState
     */
    public void setVAppState(com.vmware.converter.VirtualAppVAppState vAppState) {
        this.vAppState = vAppState;
    }


    /**
     * Gets the suspended value for this VirtualAppSummary.
     * 
     * @return suspended
     */
    public java.lang.Boolean getSuspended() {
        return suspended;
    }


    /**
     * Sets the suspended value for this VirtualAppSummary.
     * 
     * @param suspended
     */
    public void setSuspended(java.lang.Boolean suspended) {
        this.suspended = suspended;
    }


    /**
     * Gets the installBootRequired value for this VirtualAppSummary.
     * 
     * @return installBootRequired
     */
    public java.lang.Boolean getInstallBootRequired() {
        return installBootRequired;
    }


    /**
     * Sets the installBootRequired value for this VirtualAppSummary.
     * 
     * @param installBootRequired
     */
    public void setInstallBootRequired(java.lang.Boolean installBootRequired) {
        this.installBootRequired = installBootRequired;
    }


    /**
     * Gets the instanceUuid value for this VirtualAppSummary.
     * 
     * @return instanceUuid
     */
    public java.lang.String getInstanceUuid() {
        return instanceUuid;
    }


    /**
     * Sets the instanceUuid value for this VirtualAppSummary.
     * 
     * @param instanceUuid
     */
    public void setInstanceUuid(java.lang.String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualAppSummary)) return false;
        VirtualAppSummary other = (VirtualAppSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.vAppState==null && other.getVAppState()==null) || 
             (this.vAppState!=null &&
              this.vAppState.equals(other.getVAppState()))) &&
            ((this.suspended==null && other.getSuspended()==null) || 
             (this.suspended!=null &&
              this.suspended.equals(other.getSuspended()))) &&
            ((this.installBootRequired==null && other.getInstallBootRequired()==null) || 
             (this.installBootRequired!=null &&
              this.installBootRequired.equals(other.getInstallBootRequired()))) &&
            ((this.instanceUuid==null && other.getInstanceUuid()==null) || 
             (this.instanceUuid!=null &&
              this.instanceUuid.equals(other.getInstanceUuid())));
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getVAppState() != null) {
            _hashCode += getVAppState().hashCode();
        }
        if (getSuspended() != null) {
            _hashCode += getSuspended().hashCode();
        }
        if (getInstallBootRequired() != null) {
            _hashCode += getInstallBootRequired().hashCode();
        }
        if (getInstanceUuid() != null) {
            _hashCode += getInstanceUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualAppSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualAppSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppProductInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vAppState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualAppVAppState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "suspended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installBootRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "installBootRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
