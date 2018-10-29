/**
 * VAppConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VAppConfigInfo  extends com.vmware.converter.VmConfigInfo  implements java.io.Serializable {
    private com.vmware.converter.VAppEntityConfigInfo[] entityConfig;

    private java.lang.String annotation;

    private java.lang.String instanceUuid;

    private com.vmware.converter.ManagedByInfo managedBy;

    public VAppConfigInfo() {
    }

    public VAppConfigInfo(
           com.vmware.converter.VAppProductInfo[] product,
           com.vmware.converter.VAppPropertyInfo[] property,
           com.vmware.converter.VAppIPAssignmentInfo ipAssignment,
           java.lang.String[] eula,
           com.vmware.converter.VAppOvfSectionInfo[] ovfSection,
           java.lang.String[] ovfEnvironmentTransport,
           boolean installBootRequired,
           int installBootStopDelay,
           com.vmware.converter.VAppEntityConfigInfo[] entityConfig,
           java.lang.String annotation,
           java.lang.String instanceUuid,
           com.vmware.converter.ManagedByInfo managedBy) {
        super(
            product,
            property,
            ipAssignment,
            eula,
            ovfSection,
            ovfEnvironmentTransport,
            installBootRequired,
            installBootStopDelay);
        this.entityConfig = entityConfig;
        this.annotation = annotation;
        this.instanceUuid = instanceUuid;
        this.managedBy = managedBy;
    }


    /**
     * Gets the entityConfig value for this VAppConfigInfo.
     * 
     * @return entityConfig
     */
    public com.vmware.converter.VAppEntityConfigInfo[] getEntityConfig() {
        return entityConfig;
    }


    /**
     * Sets the entityConfig value for this VAppConfigInfo.
     * 
     * @param entityConfig
     */
    public void setEntityConfig(com.vmware.converter.VAppEntityConfigInfo[] entityConfig) {
        this.entityConfig = entityConfig;
    }

    public com.vmware.converter.VAppEntityConfigInfo getEntityConfig(int i) {
        return this.entityConfig[i];
    }

    public void setEntityConfig(int i, com.vmware.converter.VAppEntityConfigInfo _value) {
        this.entityConfig[i] = _value;
    }


    /**
     * Gets the annotation value for this VAppConfigInfo.
     * 
     * @return annotation
     */
    public java.lang.String getAnnotation() {
        return annotation;
    }


    /**
     * Sets the annotation value for this VAppConfigInfo.
     * 
     * @param annotation
     */
    public void setAnnotation(java.lang.String annotation) {
        this.annotation = annotation;
    }


    /**
     * Gets the instanceUuid value for this VAppConfigInfo.
     * 
     * @return instanceUuid
     */
    public java.lang.String getInstanceUuid() {
        return instanceUuid;
    }


    /**
     * Sets the instanceUuid value for this VAppConfigInfo.
     * 
     * @param instanceUuid
     */
    public void setInstanceUuid(java.lang.String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }


    /**
     * Gets the managedBy value for this VAppConfigInfo.
     * 
     * @return managedBy
     */
    public com.vmware.converter.ManagedByInfo getManagedBy() {
        return managedBy;
    }


    /**
     * Sets the managedBy value for this VAppConfigInfo.
     * 
     * @param managedBy
     */
    public void setManagedBy(com.vmware.converter.ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VAppConfigInfo)) return false;
        VAppConfigInfo other = (VAppConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityConfig==null && other.getEntityConfig()==null) || 
             (this.entityConfig!=null &&
              java.util.Arrays.equals(this.entityConfig, other.getEntityConfig()))) &&
            ((this.annotation==null && other.getAnnotation()==null) || 
             (this.annotation!=null &&
              this.annotation.equals(other.getAnnotation()))) &&
            ((this.instanceUuid==null && other.getInstanceUuid()==null) || 
             (this.instanceUuid!=null &&
              this.instanceUuid.equals(other.getInstanceUuid()))) &&
            ((this.managedBy==null && other.getManagedBy()==null) || 
             (this.managedBy!=null &&
              this.managedBy.equals(other.getManagedBy())));
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
        if (getEntityConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnnotation() != null) {
            _hashCode += getAnnotation().hashCode();
        }
        if (getInstanceUuid() != null) {
            _hashCode += getInstanceUuid().hashCode();
        }
        if (getManagedBy() != null) {
            _hashCode += getManagedBy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VAppConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppEntityConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "managedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedByInfo"));
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
