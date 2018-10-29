/**
 * ConverterConfigOptionsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterConfigOptionsInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterConfigOptionsInfoOption[] configOptions;

    private com.vmware.converter.ConverterConfigOptionsInfoOption defaultOption;

    private com.vmware.converter.ConverterTargetVmSpecManagedVmLocation targetLocation;

    public ConverterConfigOptionsInfo() {
    }

    public ConverterConfigOptionsInfo(
           com.vmware.converter.ConverterConfigOptionsInfoOption[] configOptions,
           com.vmware.converter.ConverterConfigOptionsInfoOption defaultOption,
           com.vmware.converter.ConverterTargetVmSpecManagedVmLocation targetLocation) {
        this.configOptions = configOptions;
        this.defaultOption = defaultOption;
        this.targetLocation = targetLocation;
    }


    /**
     * Gets the configOptions value for this ConverterConfigOptionsInfo.
     * 
     * @return configOptions
     */
    public com.vmware.converter.ConverterConfigOptionsInfoOption[] getConfigOptions() {
        return configOptions;
    }


    /**
     * Sets the configOptions value for this ConverterConfigOptionsInfo.
     * 
     * @param configOptions
     */
    public void setConfigOptions(com.vmware.converter.ConverterConfigOptionsInfoOption[] configOptions) {
        this.configOptions = configOptions;
    }

    public com.vmware.converter.ConverterConfigOptionsInfoOption getConfigOptions(int i) {
        return this.configOptions[i];
    }

    public void setConfigOptions(int i, com.vmware.converter.ConverterConfigOptionsInfoOption _value) {
        this.configOptions[i] = _value;
    }


    /**
     * Gets the defaultOption value for this ConverterConfigOptionsInfo.
     * 
     * @return defaultOption
     */
    public com.vmware.converter.ConverterConfigOptionsInfoOption getDefaultOption() {
        return defaultOption;
    }


    /**
     * Sets the defaultOption value for this ConverterConfigOptionsInfo.
     * 
     * @param defaultOption
     */
    public void setDefaultOption(com.vmware.converter.ConverterConfigOptionsInfoOption defaultOption) {
        this.defaultOption = defaultOption;
    }


    /**
     * Gets the targetLocation value for this ConverterConfigOptionsInfo.
     * 
     * @return targetLocation
     */
    public com.vmware.converter.ConverterTargetVmSpecManagedVmLocation getTargetLocation() {
        return targetLocation;
    }


    /**
     * Sets the targetLocation value for this ConverterConfigOptionsInfo.
     * 
     * @param targetLocation
     */
    public void setTargetLocation(com.vmware.converter.ConverterTargetVmSpecManagedVmLocation targetLocation) {
        this.targetLocation = targetLocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterConfigOptionsInfo)) return false;
        ConverterConfigOptionsInfo other = (ConverterConfigOptionsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configOptions==null && other.getConfigOptions()==null) || 
             (this.configOptions!=null &&
              java.util.Arrays.equals(this.configOptions, other.getConfigOptions()))) &&
            ((this.defaultOption==null && other.getDefaultOption()==null) || 
             (this.defaultOption!=null &&
              this.defaultOption.equals(other.getDefaultOption()))) &&
            ((this.targetLocation==null && other.getTargetLocation()==null) || 
             (this.targetLocation!=null &&
              this.targetLocation.equals(other.getTargetLocation())));
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
        if (getConfigOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultOption() != null) {
            _hashCode += getDefaultOption().hashCode();
        }
        if (getTargetLocation() != null) {
            _hashCode += getTargetLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterConfigOptionsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConfigOptionsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "configOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConfigOptionsInfoOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConfigOptionsInfoOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTargetVmSpecManagedVmLocation"));
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
