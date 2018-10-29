/**
 * StorageDrsPodConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsPodConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enabled;

    private java.lang.Boolean ioLoadBalanceEnabled;

    private java.lang.String defaultVmBehavior;

    private java.lang.Integer loadBalanceInterval;

    private java.lang.Boolean defaultIntraVmAffinity;

    private com.vmware.converter.StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig;

    private com.vmware.converter.StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig;

    private com.vmware.converter.StorageDrsAutomationConfig automationOverrides;

    private com.vmware.converter.ClusterRuleSpec[] rule;

    private com.vmware.converter.StorageDrsOptionSpec[] option;

    public StorageDrsPodConfigSpec() {
    }

    public StorageDrsPodConfigSpec(
           java.lang.Boolean enabled,
           java.lang.Boolean ioLoadBalanceEnabled,
           java.lang.String defaultVmBehavior,
           java.lang.Integer loadBalanceInterval,
           java.lang.Boolean defaultIntraVmAffinity,
           com.vmware.converter.StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig,
           com.vmware.converter.StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig,
           com.vmware.converter.StorageDrsAutomationConfig automationOverrides,
           com.vmware.converter.ClusterRuleSpec[] rule,
           com.vmware.converter.StorageDrsOptionSpec[] option) {
        this.enabled = enabled;
        this.ioLoadBalanceEnabled = ioLoadBalanceEnabled;
        this.defaultVmBehavior = defaultVmBehavior;
        this.loadBalanceInterval = loadBalanceInterval;
        this.defaultIntraVmAffinity = defaultIntraVmAffinity;
        this.spaceLoadBalanceConfig = spaceLoadBalanceConfig;
        this.ioLoadBalanceConfig = ioLoadBalanceConfig;
        this.automationOverrides = automationOverrides;
        this.rule = rule;
        this.option = option;
    }


    /**
     * Gets the enabled value for this StorageDrsPodConfigSpec.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this StorageDrsPodConfigSpec.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the ioLoadBalanceEnabled value for this StorageDrsPodConfigSpec.
     * 
     * @return ioLoadBalanceEnabled
     */
    public java.lang.Boolean getIoLoadBalanceEnabled() {
        return ioLoadBalanceEnabled;
    }


    /**
     * Sets the ioLoadBalanceEnabled value for this StorageDrsPodConfigSpec.
     * 
     * @param ioLoadBalanceEnabled
     */
    public void setIoLoadBalanceEnabled(java.lang.Boolean ioLoadBalanceEnabled) {
        this.ioLoadBalanceEnabled = ioLoadBalanceEnabled;
    }


    /**
     * Gets the defaultVmBehavior value for this StorageDrsPodConfigSpec.
     * 
     * @return defaultVmBehavior
     */
    public java.lang.String getDefaultVmBehavior() {
        return defaultVmBehavior;
    }


    /**
     * Sets the defaultVmBehavior value for this StorageDrsPodConfigSpec.
     * 
     * @param defaultVmBehavior
     */
    public void setDefaultVmBehavior(java.lang.String defaultVmBehavior) {
        this.defaultVmBehavior = defaultVmBehavior;
    }


    /**
     * Gets the loadBalanceInterval value for this StorageDrsPodConfigSpec.
     * 
     * @return loadBalanceInterval
     */
    public java.lang.Integer getLoadBalanceInterval() {
        return loadBalanceInterval;
    }


    /**
     * Sets the loadBalanceInterval value for this StorageDrsPodConfigSpec.
     * 
     * @param loadBalanceInterval
     */
    public void setLoadBalanceInterval(java.lang.Integer loadBalanceInterval) {
        this.loadBalanceInterval = loadBalanceInterval;
    }


    /**
     * Gets the defaultIntraVmAffinity value for this StorageDrsPodConfigSpec.
     * 
     * @return defaultIntraVmAffinity
     */
    public java.lang.Boolean getDefaultIntraVmAffinity() {
        return defaultIntraVmAffinity;
    }


    /**
     * Sets the defaultIntraVmAffinity value for this StorageDrsPodConfigSpec.
     * 
     * @param defaultIntraVmAffinity
     */
    public void setDefaultIntraVmAffinity(java.lang.Boolean defaultIntraVmAffinity) {
        this.defaultIntraVmAffinity = defaultIntraVmAffinity;
    }


    /**
     * Gets the spaceLoadBalanceConfig value for this StorageDrsPodConfigSpec.
     * 
     * @return spaceLoadBalanceConfig
     */
    public com.vmware.converter.StorageDrsSpaceLoadBalanceConfig getSpaceLoadBalanceConfig() {
        return spaceLoadBalanceConfig;
    }


    /**
     * Sets the spaceLoadBalanceConfig value for this StorageDrsPodConfigSpec.
     * 
     * @param spaceLoadBalanceConfig
     */
    public void setSpaceLoadBalanceConfig(com.vmware.converter.StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig) {
        this.spaceLoadBalanceConfig = spaceLoadBalanceConfig;
    }


    /**
     * Gets the ioLoadBalanceConfig value for this StorageDrsPodConfigSpec.
     * 
     * @return ioLoadBalanceConfig
     */
    public com.vmware.converter.StorageDrsIoLoadBalanceConfig getIoLoadBalanceConfig() {
        return ioLoadBalanceConfig;
    }


    /**
     * Sets the ioLoadBalanceConfig value for this StorageDrsPodConfigSpec.
     * 
     * @param ioLoadBalanceConfig
     */
    public void setIoLoadBalanceConfig(com.vmware.converter.StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig) {
        this.ioLoadBalanceConfig = ioLoadBalanceConfig;
    }


    /**
     * Gets the automationOverrides value for this StorageDrsPodConfigSpec.
     * 
     * @return automationOverrides
     */
    public com.vmware.converter.StorageDrsAutomationConfig getAutomationOverrides() {
        return automationOverrides;
    }


    /**
     * Sets the automationOverrides value for this StorageDrsPodConfigSpec.
     * 
     * @param automationOverrides
     */
    public void setAutomationOverrides(com.vmware.converter.StorageDrsAutomationConfig automationOverrides) {
        this.automationOverrides = automationOverrides;
    }


    /**
     * Gets the rule value for this StorageDrsPodConfigSpec.
     * 
     * @return rule
     */
    public com.vmware.converter.ClusterRuleSpec[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this StorageDrsPodConfigSpec.
     * 
     * @param rule
     */
    public void setRule(com.vmware.converter.ClusterRuleSpec[] rule) {
        this.rule = rule;
    }

    public com.vmware.converter.ClusterRuleSpec getRule(int i) {
        return this.rule[i];
    }

    public void setRule(int i, com.vmware.converter.ClusterRuleSpec _value) {
        this.rule[i] = _value;
    }


    /**
     * Gets the option value for this StorageDrsPodConfigSpec.
     * 
     * @return option
     */
    public com.vmware.converter.StorageDrsOptionSpec[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this StorageDrsPodConfigSpec.
     * 
     * @param option
     */
    public void setOption(com.vmware.converter.StorageDrsOptionSpec[] option) {
        this.option = option;
    }

    public com.vmware.converter.StorageDrsOptionSpec getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, com.vmware.converter.StorageDrsOptionSpec _value) {
        this.option[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsPodConfigSpec)) return false;
        StorageDrsPodConfigSpec other = (StorageDrsPodConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.ioLoadBalanceEnabled==null && other.getIoLoadBalanceEnabled()==null) || 
             (this.ioLoadBalanceEnabled!=null &&
              this.ioLoadBalanceEnabled.equals(other.getIoLoadBalanceEnabled()))) &&
            ((this.defaultVmBehavior==null && other.getDefaultVmBehavior()==null) || 
             (this.defaultVmBehavior!=null &&
              this.defaultVmBehavior.equals(other.getDefaultVmBehavior()))) &&
            ((this.loadBalanceInterval==null && other.getLoadBalanceInterval()==null) || 
             (this.loadBalanceInterval!=null &&
              this.loadBalanceInterval.equals(other.getLoadBalanceInterval()))) &&
            ((this.defaultIntraVmAffinity==null && other.getDefaultIntraVmAffinity()==null) || 
             (this.defaultIntraVmAffinity!=null &&
              this.defaultIntraVmAffinity.equals(other.getDefaultIntraVmAffinity()))) &&
            ((this.spaceLoadBalanceConfig==null && other.getSpaceLoadBalanceConfig()==null) || 
             (this.spaceLoadBalanceConfig!=null &&
              this.spaceLoadBalanceConfig.equals(other.getSpaceLoadBalanceConfig()))) &&
            ((this.ioLoadBalanceConfig==null && other.getIoLoadBalanceConfig()==null) || 
             (this.ioLoadBalanceConfig!=null &&
              this.ioLoadBalanceConfig.equals(other.getIoLoadBalanceConfig()))) &&
            ((this.automationOverrides==null && other.getAutomationOverrides()==null) || 
             (this.automationOverrides!=null &&
              this.automationOverrides.equals(other.getAutomationOverrides()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption())));
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getIoLoadBalanceEnabled() != null) {
            _hashCode += getIoLoadBalanceEnabled().hashCode();
        }
        if (getDefaultVmBehavior() != null) {
            _hashCode += getDefaultVmBehavior().hashCode();
        }
        if (getLoadBalanceInterval() != null) {
            _hashCode += getLoadBalanceInterval().hashCode();
        }
        if (getDefaultIntraVmAffinity() != null) {
            _hashCode += getDefaultIntraVmAffinity().hashCode();
        }
        if (getSpaceLoadBalanceConfig() != null) {
            _hashCode += getSpaceLoadBalanceConfig().hashCode();
        }
        if (getIoLoadBalanceConfig() != null) {
            _hashCode += getIoLoadBalanceConfig().hashCode();
        }
        if (getAutomationOverrides() != null) {
            _hashCode += getAutomationOverrides().hashCode();
        }
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageDrsPodConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsPodConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioLoadBalanceEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioLoadBalanceEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultVmBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultVmBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadBalanceInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "loadBalanceInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultIntraVmAffinity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultIntraVmAffinity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceLoadBalanceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceLoadBalanceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsSpaceLoadBalanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioLoadBalanceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioLoadBalanceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsIoLoadBalanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "automationOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsAutomationConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsOptionSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
