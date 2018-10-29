/**
 * HostVirtualSwitchConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVirtualSwitchConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String changeOperation;

    private java.lang.String name;

    private com.vmware.converter.HostVirtualSwitchSpec spec;

    public HostVirtualSwitchConfig() {
    }

    public HostVirtualSwitchConfig(
           java.lang.String changeOperation,
           java.lang.String name,
           com.vmware.converter.HostVirtualSwitchSpec spec) {
        this.changeOperation = changeOperation;
        this.name = name;
        this.spec = spec;
    }


    /**
     * Gets the changeOperation value for this HostVirtualSwitchConfig.
     * 
     * @return changeOperation
     */
    public java.lang.String getChangeOperation() {
        return changeOperation;
    }


    /**
     * Sets the changeOperation value for this HostVirtualSwitchConfig.
     * 
     * @param changeOperation
     */
    public void setChangeOperation(java.lang.String changeOperation) {
        this.changeOperation = changeOperation;
    }


    /**
     * Gets the name value for this HostVirtualSwitchConfig.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostVirtualSwitchConfig.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the spec value for this HostVirtualSwitchConfig.
     * 
     * @return spec
     */
    public com.vmware.converter.HostVirtualSwitchSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this HostVirtualSwitchConfig.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.converter.HostVirtualSwitchSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualSwitchConfig)) return false;
        HostVirtualSwitchConfig other = (HostVirtualSwitchConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeOperation==null && other.getChangeOperation()==null) || 
             (this.changeOperation!=null &&
              this.changeOperation.equals(other.getChangeOperation()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec())));
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
        if (getChangeOperation() != null) {
            _hashCode += getChangeOperation().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVirtualSwitchConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchSpec"));
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
