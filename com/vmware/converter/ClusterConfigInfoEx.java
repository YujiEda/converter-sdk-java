/**
 * ClusterConfigInfoEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterConfigInfoEx  extends com.vmware.converter.ComputeResourceConfigInfo  implements java.io.Serializable {
    private com.vmware.converter.ClusterDasConfigInfo dasConfig;

    private com.vmware.converter.ClusterDasVmConfigInfo[] dasVmConfig;

    private com.vmware.converter.ClusterDrsConfigInfo drsConfig;

    private com.vmware.converter.ClusterDrsVmConfigInfo[] drsVmConfig;

    private com.vmware.converter.ClusterRuleInfo[] rule;

    private com.vmware.converter.ClusterDpmConfigInfo dpmConfigInfo;

    private com.vmware.converter.ClusterDpmHostConfigInfo[] dpmHostConfig;

    private com.vmware.converter.VsanClusterConfigInfo vsanConfigInfo;

    private com.vmware.converter.VsanHostConfigInfo[] vsanHostConfig;

    private com.vmware.converter.ClusterGroupInfo[] group;

    public ClusterConfigInfoEx() {
    }

    public ClusterConfigInfoEx(
           java.lang.String vmSwapPlacement,
           java.lang.Boolean spbmEnabled,
           java.lang.String defaultHardwareVersionKey,
           com.vmware.converter.ClusterDasConfigInfo dasConfig,
           com.vmware.converter.ClusterDasVmConfigInfo[] dasVmConfig,
           com.vmware.converter.ClusterDrsConfigInfo drsConfig,
           com.vmware.converter.ClusterDrsVmConfigInfo[] drsVmConfig,
           com.vmware.converter.ClusterRuleInfo[] rule,
           com.vmware.converter.ClusterDpmConfigInfo dpmConfigInfo,
           com.vmware.converter.ClusterDpmHostConfigInfo[] dpmHostConfig,
           com.vmware.converter.VsanClusterConfigInfo vsanConfigInfo,
           com.vmware.converter.VsanHostConfigInfo[] vsanHostConfig,
           com.vmware.converter.ClusterGroupInfo[] group) {
        super(
            vmSwapPlacement,
            spbmEnabled,
            defaultHardwareVersionKey);
        this.dasConfig = dasConfig;
        this.dasVmConfig = dasVmConfig;
        this.drsConfig = drsConfig;
        this.drsVmConfig = drsVmConfig;
        this.rule = rule;
        this.dpmConfigInfo = dpmConfigInfo;
        this.dpmHostConfig = dpmHostConfig;
        this.vsanConfigInfo = vsanConfigInfo;
        this.vsanHostConfig = vsanHostConfig;
        this.group = group;
    }


    /**
     * Gets the dasConfig value for this ClusterConfigInfoEx.
     * 
     * @return dasConfig
     */
    public com.vmware.converter.ClusterDasConfigInfo getDasConfig() {
        return dasConfig;
    }


    /**
     * Sets the dasConfig value for this ClusterConfigInfoEx.
     * 
     * @param dasConfig
     */
    public void setDasConfig(com.vmware.converter.ClusterDasConfigInfo dasConfig) {
        this.dasConfig = dasConfig;
    }


    /**
     * Gets the dasVmConfig value for this ClusterConfigInfoEx.
     * 
     * @return dasVmConfig
     */
    public com.vmware.converter.ClusterDasVmConfigInfo[] getDasVmConfig() {
        return dasVmConfig;
    }


    /**
     * Sets the dasVmConfig value for this ClusterConfigInfoEx.
     * 
     * @param dasVmConfig
     */
    public void setDasVmConfig(com.vmware.converter.ClusterDasVmConfigInfo[] dasVmConfig) {
        this.dasVmConfig = dasVmConfig;
    }

    public com.vmware.converter.ClusterDasVmConfigInfo getDasVmConfig(int i) {
        return this.dasVmConfig[i];
    }

    public void setDasVmConfig(int i, com.vmware.converter.ClusterDasVmConfigInfo _value) {
        this.dasVmConfig[i] = _value;
    }


    /**
     * Gets the drsConfig value for this ClusterConfigInfoEx.
     * 
     * @return drsConfig
     */
    public com.vmware.converter.ClusterDrsConfigInfo getDrsConfig() {
        return drsConfig;
    }


    /**
     * Sets the drsConfig value for this ClusterConfigInfoEx.
     * 
     * @param drsConfig
     */
    public void setDrsConfig(com.vmware.converter.ClusterDrsConfigInfo drsConfig) {
        this.drsConfig = drsConfig;
    }


    /**
     * Gets the drsVmConfig value for this ClusterConfigInfoEx.
     * 
     * @return drsVmConfig
     */
    public com.vmware.converter.ClusterDrsVmConfigInfo[] getDrsVmConfig() {
        return drsVmConfig;
    }


    /**
     * Sets the drsVmConfig value for this ClusterConfigInfoEx.
     * 
     * @param drsVmConfig
     */
    public void setDrsVmConfig(com.vmware.converter.ClusterDrsVmConfigInfo[] drsVmConfig) {
        this.drsVmConfig = drsVmConfig;
    }

    public com.vmware.converter.ClusterDrsVmConfigInfo getDrsVmConfig(int i) {
        return this.drsVmConfig[i];
    }

    public void setDrsVmConfig(int i, com.vmware.converter.ClusterDrsVmConfigInfo _value) {
        this.drsVmConfig[i] = _value;
    }


    /**
     * Gets the rule value for this ClusterConfigInfoEx.
     * 
     * @return rule
     */
    public com.vmware.converter.ClusterRuleInfo[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this ClusterConfigInfoEx.
     * 
     * @param rule
     */
    public void setRule(com.vmware.converter.ClusterRuleInfo[] rule) {
        this.rule = rule;
    }

    public com.vmware.converter.ClusterRuleInfo getRule(int i) {
        return this.rule[i];
    }

    public void setRule(int i, com.vmware.converter.ClusterRuleInfo _value) {
        this.rule[i] = _value;
    }


    /**
     * Gets the dpmConfigInfo value for this ClusterConfigInfoEx.
     * 
     * @return dpmConfigInfo
     */
    public com.vmware.converter.ClusterDpmConfigInfo getDpmConfigInfo() {
        return dpmConfigInfo;
    }


    /**
     * Sets the dpmConfigInfo value for this ClusterConfigInfoEx.
     * 
     * @param dpmConfigInfo
     */
    public void setDpmConfigInfo(com.vmware.converter.ClusterDpmConfigInfo dpmConfigInfo) {
        this.dpmConfigInfo = dpmConfigInfo;
    }


    /**
     * Gets the dpmHostConfig value for this ClusterConfigInfoEx.
     * 
     * @return dpmHostConfig
     */
    public com.vmware.converter.ClusterDpmHostConfigInfo[] getDpmHostConfig() {
        return dpmHostConfig;
    }


    /**
     * Sets the dpmHostConfig value for this ClusterConfigInfoEx.
     * 
     * @param dpmHostConfig
     */
    public void setDpmHostConfig(com.vmware.converter.ClusterDpmHostConfigInfo[] dpmHostConfig) {
        this.dpmHostConfig = dpmHostConfig;
    }

    public com.vmware.converter.ClusterDpmHostConfigInfo getDpmHostConfig(int i) {
        return this.dpmHostConfig[i];
    }

    public void setDpmHostConfig(int i, com.vmware.converter.ClusterDpmHostConfigInfo _value) {
        this.dpmHostConfig[i] = _value;
    }


    /**
     * Gets the vsanConfigInfo value for this ClusterConfigInfoEx.
     * 
     * @return vsanConfigInfo
     */
    public com.vmware.converter.VsanClusterConfigInfo getVsanConfigInfo() {
        return vsanConfigInfo;
    }


    /**
     * Sets the vsanConfigInfo value for this ClusterConfigInfoEx.
     * 
     * @param vsanConfigInfo
     */
    public void setVsanConfigInfo(com.vmware.converter.VsanClusterConfigInfo vsanConfigInfo) {
        this.vsanConfigInfo = vsanConfigInfo;
    }


    /**
     * Gets the vsanHostConfig value for this ClusterConfigInfoEx.
     * 
     * @return vsanHostConfig
     */
    public com.vmware.converter.VsanHostConfigInfo[] getVsanHostConfig() {
        return vsanHostConfig;
    }


    /**
     * Sets the vsanHostConfig value for this ClusterConfigInfoEx.
     * 
     * @param vsanHostConfig
     */
    public void setVsanHostConfig(com.vmware.converter.VsanHostConfigInfo[] vsanHostConfig) {
        this.vsanHostConfig = vsanHostConfig;
    }

    public com.vmware.converter.VsanHostConfigInfo getVsanHostConfig(int i) {
        return this.vsanHostConfig[i];
    }

    public void setVsanHostConfig(int i, com.vmware.converter.VsanHostConfigInfo _value) {
        this.vsanHostConfig[i] = _value;
    }


    /**
     * Gets the group value for this ClusterConfigInfoEx.
     * 
     * @return group
     */
    public com.vmware.converter.ClusterGroupInfo[] getGroup() {
        return group;
    }


    /**
     * Sets the group value for this ClusterConfigInfoEx.
     * 
     * @param group
     */
    public void setGroup(com.vmware.converter.ClusterGroupInfo[] group) {
        this.group = group;
    }

    public com.vmware.converter.ClusterGroupInfo getGroup(int i) {
        return this.group[i];
    }

    public void setGroup(int i, com.vmware.converter.ClusterGroupInfo _value) {
        this.group[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterConfigInfoEx)) return false;
        ClusterConfigInfoEx other = (ClusterConfigInfoEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dasConfig==null && other.getDasConfig()==null) || 
             (this.dasConfig!=null &&
              this.dasConfig.equals(other.getDasConfig()))) &&
            ((this.dasVmConfig==null && other.getDasVmConfig()==null) || 
             (this.dasVmConfig!=null &&
              java.util.Arrays.equals(this.dasVmConfig, other.getDasVmConfig()))) &&
            ((this.drsConfig==null && other.getDrsConfig()==null) || 
             (this.drsConfig!=null &&
              this.drsConfig.equals(other.getDrsConfig()))) &&
            ((this.drsVmConfig==null && other.getDrsVmConfig()==null) || 
             (this.drsVmConfig!=null &&
              java.util.Arrays.equals(this.drsVmConfig, other.getDrsVmConfig()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.dpmConfigInfo==null && other.getDpmConfigInfo()==null) || 
             (this.dpmConfigInfo!=null &&
              this.dpmConfigInfo.equals(other.getDpmConfigInfo()))) &&
            ((this.dpmHostConfig==null && other.getDpmHostConfig()==null) || 
             (this.dpmHostConfig!=null &&
              java.util.Arrays.equals(this.dpmHostConfig, other.getDpmHostConfig()))) &&
            ((this.vsanConfigInfo==null && other.getVsanConfigInfo()==null) || 
             (this.vsanConfigInfo!=null &&
              this.vsanConfigInfo.equals(other.getVsanConfigInfo()))) &&
            ((this.vsanHostConfig==null && other.getVsanHostConfig()==null) || 
             (this.vsanHostConfig!=null &&
              java.util.Arrays.equals(this.vsanHostConfig, other.getVsanHostConfig()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              java.util.Arrays.equals(this.group, other.getGroup())));
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
        if (getDasConfig() != null) {
            _hashCode += getDasConfig().hashCode();
        }
        if (getDasVmConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDasVmConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDasVmConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrsConfig() != null) {
            _hashCode += getDrsConfig().hashCode();
        }
        if (getDrsVmConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrsVmConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrsVmConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getDpmConfigInfo() != null) {
            _hashCode += getDpmConfigInfo().hashCode();
        }
        if (getDpmHostConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDpmHostConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDpmHostConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsanConfigInfo() != null) {
            _hashCode += getVsanConfigInfo().hashCode();
        }
        if (getVsanHostConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterConfigInfoEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterConfigInfoEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasVmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasVmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasVmConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "drsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drsVmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "drsVmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsVmConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpmConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dpmConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDpmConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpmHostConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dpmHostConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDpmHostConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanClusterConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanHostConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterGroupInfo"));
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
