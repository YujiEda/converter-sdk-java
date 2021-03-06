/**
 * ConverterAgentCustomizeRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentCustomizeRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ConverterComputerSpec target;

    private com.vmware.converter.ConverterParamsAgentCustomizationParams customizationParams;

    private com.vmware.converter.ConverterParamsAgentCloningParams cloningParams;

    private com.vmware.converter.ConverterConversionRuntimeEnvironmentInfo envInfo;

    public ConverterAgentCustomizeRequestType() {
    }

    public ConverterAgentCustomizeRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ConverterComputerSpec target,
           com.vmware.converter.ConverterParamsAgentCustomizationParams customizationParams,
           com.vmware.converter.ConverterParamsAgentCloningParams cloningParams,
           com.vmware.converter.ConverterConversionRuntimeEnvironmentInfo envInfo) {
           this._this = _this;
           this.target = target;
           this.customizationParams = customizationParams;
           this.cloningParams = cloningParams;
           this.envInfo = envInfo;
    }


    /**
     * Gets the _this value for this ConverterAgentCustomizeRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterAgentCustomizeRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the target value for this ConverterAgentCustomizeRequestType.
     * 
     * @return target
     */
    public com.vmware.converter.ConverterComputerSpec getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ConverterAgentCustomizeRequestType.
     * 
     * @param target
     */
    public void setTarget(com.vmware.converter.ConverterComputerSpec target) {
        this.target = target;
    }


    /**
     * Gets the customizationParams value for this ConverterAgentCustomizeRequestType.
     * 
     * @return customizationParams
     */
    public com.vmware.converter.ConverterParamsAgentCustomizationParams getCustomizationParams() {
        return customizationParams;
    }


    /**
     * Sets the customizationParams value for this ConverterAgentCustomizeRequestType.
     * 
     * @param customizationParams
     */
    public void setCustomizationParams(com.vmware.converter.ConverterParamsAgentCustomizationParams customizationParams) {
        this.customizationParams = customizationParams;
    }


    /**
     * Gets the cloningParams value for this ConverterAgentCustomizeRequestType.
     * 
     * @return cloningParams
     */
    public com.vmware.converter.ConverterParamsAgentCloningParams getCloningParams() {
        return cloningParams;
    }


    /**
     * Sets the cloningParams value for this ConverterAgentCustomizeRequestType.
     * 
     * @param cloningParams
     */
    public void setCloningParams(com.vmware.converter.ConverterParamsAgentCloningParams cloningParams) {
        this.cloningParams = cloningParams;
    }


    /**
     * Gets the envInfo value for this ConverterAgentCustomizeRequestType.
     * 
     * @return envInfo
     */
    public com.vmware.converter.ConverterConversionRuntimeEnvironmentInfo getEnvInfo() {
        return envInfo;
    }


    /**
     * Sets the envInfo value for this ConverterAgentCustomizeRequestType.
     * 
     * @param envInfo
     */
    public void setEnvInfo(com.vmware.converter.ConverterConversionRuntimeEnvironmentInfo envInfo) {
        this.envInfo = envInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentCustomizeRequestType)) return false;
        ConverterAgentCustomizeRequestType other = (ConverterAgentCustomizeRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.customizationParams==null && other.getCustomizationParams()==null) || 
             (this.customizationParams!=null &&
              this.customizationParams.equals(other.getCustomizationParams()))) &&
            ((this.cloningParams==null && other.getCloningParams()==null) || 
             (this.cloningParams!=null &&
              this.cloningParams.equals(other.getCloningParams()))) &&
            ((this.envInfo==null && other.getEnvInfo()==null) || 
             (this.envInfo!=null &&
              this.envInfo.equals(other.getEnvInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getCustomizationParams() != null) {
            _hashCode += getCustomizationParams().hashCode();
        }
        if (getCloningParams() != null) {
            _hashCode += getCloningParams().hashCode();
        }
        if (getEnvInfo() != null) {
            _hashCode += getEnvInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentCustomizeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentCustomizeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizationParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "customizationParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsAgentCustomizationParams"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloningParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cloningParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterParamsAgentCloningParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "envInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterConversionRuntimeEnvironmentInfo"));
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
