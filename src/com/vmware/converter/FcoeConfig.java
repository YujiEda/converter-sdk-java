/**
 * FcoeConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FcoeConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int priorityClass;

    private java.lang.String sourceMac;

    private com.vmware.converter.FcoeConfigVlanRange[] vlanRange;

    private com.vmware.converter.FcoeConfigFcoeCapabilities capabilities;

    private boolean fcoeActive;

    public FcoeConfig() {
    }

    public FcoeConfig(
           int priorityClass,
           java.lang.String sourceMac,
           com.vmware.converter.FcoeConfigVlanRange[] vlanRange,
           com.vmware.converter.FcoeConfigFcoeCapabilities capabilities,
           boolean fcoeActive) {
        this.priorityClass = priorityClass;
        this.sourceMac = sourceMac;
        this.vlanRange = vlanRange;
        this.capabilities = capabilities;
        this.fcoeActive = fcoeActive;
    }


    /**
     * Gets the priorityClass value for this FcoeConfig.
     * 
     * @return priorityClass
     */
    public int getPriorityClass() {
        return priorityClass;
    }


    /**
     * Sets the priorityClass value for this FcoeConfig.
     * 
     * @param priorityClass
     */
    public void setPriorityClass(int priorityClass) {
        this.priorityClass = priorityClass;
    }


    /**
     * Gets the sourceMac value for this FcoeConfig.
     * 
     * @return sourceMac
     */
    public java.lang.String getSourceMac() {
        return sourceMac;
    }


    /**
     * Sets the sourceMac value for this FcoeConfig.
     * 
     * @param sourceMac
     */
    public void setSourceMac(java.lang.String sourceMac) {
        this.sourceMac = sourceMac;
    }


    /**
     * Gets the vlanRange value for this FcoeConfig.
     * 
     * @return vlanRange
     */
    public com.vmware.converter.FcoeConfigVlanRange[] getVlanRange() {
        return vlanRange;
    }


    /**
     * Sets the vlanRange value for this FcoeConfig.
     * 
     * @param vlanRange
     */
    public void setVlanRange(com.vmware.converter.FcoeConfigVlanRange[] vlanRange) {
        this.vlanRange = vlanRange;
    }

    public com.vmware.converter.FcoeConfigVlanRange getVlanRange(int i) {
        return this.vlanRange[i];
    }

    public void setVlanRange(int i, com.vmware.converter.FcoeConfigVlanRange _value) {
        this.vlanRange[i] = _value;
    }


    /**
     * Gets the capabilities value for this FcoeConfig.
     * 
     * @return capabilities
     */
    public com.vmware.converter.FcoeConfigFcoeCapabilities getCapabilities() {
        return capabilities;
    }


    /**
     * Sets the capabilities value for this FcoeConfig.
     * 
     * @param capabilities
     */
    public void setCapabilities(com.vmware.converter.FcoeConfigFcoeCapabilities capabilities) {
        this.capabilities = capabilities;
    }


    /**
     * Gets the fcoeActive value for this FcoeConfig.
     * 
     * @return fcoeActive
     */
    public boolean isFcoeActive() {
        return fcoeActive;
    }


    /**
     * Sets the fcoeActive value for this FcoeConfig.
     * 
     * @param fcoeActive
     */
    public void setFcoeActive(boolean fcoeActive) {
        this.fcoeActive = fcoeActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FcoeConfig)) return false;
        FcoeConfig other = (FcoeConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.priorityClass == other.getPriorityClass() &&
            ((this.sourceMac==null && other.getSourceMac()==null) || 
             (this.sourceMac!=null &&
              this.sourceMac.equals(other.getSourceMac()))) &&
            ((this.vlanRange==null && other.getVlanRange()==null) || 
             (this.vlanRange!=null &&
              java.util.Arrays.equals(this.vlanRange, other.getVlanRange()))) &&
            ((this.capabilities==null && other.getCapabilities()==null) || 
             (this.capabilities!=null &&
              this.capabilities.equals(other.getCapabilities()))) &&
            this.fcoeActive == other.isFcoeActive();
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
        _hashCode += getPriorityClass();
        if (getSourceMac() != null) {
            _hashCode += getSourceMac().hashCode();
        }
        if (getVlanRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlanRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlanRange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCapabilities() != null) {
            _hashCode += getCapabilities().hashCode();
        }
        _hashCode += (isFcoeActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FcoeConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "priorityClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceMac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfigVlanRange"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfigFcoeCapabilities"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fcoeActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fcoeActive"));
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
