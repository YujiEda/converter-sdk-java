/**
 * ConverterAgentInternalDeviceMappingResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalDeviceMappingResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineConfigSpec config;

    private com.vmware.converter.ConverterAgentInternalDeviceMappingAlert[] alerts;

    private com.vmware.converter.ConverterAgentInternalTargetStorageLayout targetStorageLayout;

    public ConverterAgentInternalDeviceMappingResult() {
    }

    public ConverterAgentInternalDeviceMappingResult(
           com.vmware.converter.VirtualMachineConfigSpec config,
           com.vmware.converter.ConverterAgentInternalDeviceMappingAlert[] alerts,
           com.vmware.converter.ConverterAgentInternalTargetStorageLayout targetStorageLayout) {
        this.config = config;
        this.alerts = alerts;
        this.targetStorageLayout = targetStorageLayout;
    }


    /**
     * Gets the config value for this ConverterAgentInternalDeviceMappingResult.
     * 
     * @return config
     */
    public com.vmware.converter.VirtualMachineConfigSpec getConfig() {
        return config;
    }


    /**
     * Sets the config value for this ConverterAgentInternalDeviceMappingResult.
     * 
     * @param config
     */
    public void setConfig(com.vmware.converter.VirtualMachineConfigSpec config) {
        this.config = config;
    }


    /**
     * Gets the alerts value for this ConverterAgentInternalDeviceMappingResult.
     * 
     * @return alerts
     */
    public com.vmware.converter.ConverterAgentInternalDeviceMappingAlert[] getAlerts() {
        return alerts;
    }


    /**
     * Sets the alerts value for this ConverterAgentInternalDeviceMappingResult.
     * 
     * @param alerts
     */
    public void setAlerts(com.vmware.converter.ConverterAgentInternalDeviceMappingAlert[] alerts) {
        this.alerts = alerts;
    }

    public com.vmware.converter.ConverterAgentInternalDeviceMappingAlert getAlerts(int i) {
        return this.alerts[i];
    }

    public void setAlerts(int i, com.vmware.converter.ConverterAgentInternalDeviceMappingAlert _value) {
        this.alerts[i] = _value;
    }


    /**
     * Gets the targetStorageLayout value for this ConverterAgentInternalDeviceMappingResult.
     * 
     * @return targetStorageLayout
     */
    public com.vmware.converter.ConverterAgentInternalTargetStorageLayout getTargetStorageLayout() {
        return targetStorageLayout;
    }


    /**
     * Sets the targetStorageLayout value for this ConverterAgentInternalDeviceMappingResult.
     * 
     * @param targetStorageLayout
     */
    public void setTargetStorageLayout(com.vmware.converter.ConverterAgentInternalTargetStorageLayout targetStorageLayout) {
        this.targetStorageLayout = targetStorageLayout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalDeviceMappingResult)) return false;
        ConverterAgentInternalDeviceMappingResult other = (ConverterAgentInternalDeviceMappingResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              this.config.equals(other.getConfig()))) &&
            ((this.alerts==null && other.getAlerts()==null) || 
             (this.alerts!=null &&
              java.util.Arrays.equals(this.alerts, other.getAlerts()))) &&
            ((this.targetStorageLayout==null && other.getTargetStorageLayout()==null) || 
             (this.targetStorageLayout!=null &&
              this.targetStorageLayout.equals(other.getTargetStorageLayout())));
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
        if (getConfig() != null) {
            _hashCode += getConfig().hashCode();
        }
        if (getAlerts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlerts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlerts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetStorageLayout() != null) {
            _hashCode += getTargetStorageLayout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalDeviceMappingResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDeviceMappingResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alerts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "alerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDeviceMappingAlert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetStorageLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetStorageLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalTargetStorageLayout"));
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
