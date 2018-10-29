/**
 * ClusterConfigSpecEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterConfigSpecEx  extends com.vmware.converter.ComputeResourceConfigSpec  implements java.io.Serializable {
    private com.vmware.converter.ClusterDasConfigInfo dasConfig;

    private com.vmware.converter.ClusterDasVmConfigSpec[] dasVmConfigSpec;

    private com.vmware.converter.ClusterDrsConfigInfo drsConfig;

    private com.vmware.converter.ClusterDrsVmConfigSpec[] drsVmConfigSpec;

    private com.vmware.converter.ClusterRuleSpec[] rulesSpec;

    private com.vmware.converter.ClusterDpmConfigInfo dpmConfig;

    private com.vmware.converter.ClusterDpmHostConfigSpec[] dpmHostConfigSpec;

    private com.vmware.converter.VsanClusterConfigInfo vsanConfig;

    private com.vmware.converter.VsanHostConfigInfo[] vsanHostConfigSpec;

    private com.vmware.converter.ClusterGroupSpec[] groupSpec;

    public ClusterConfigSpecEx() {
    }

    public ClusterConfigSpecEx(
           java.lang.String vmSwapPlacement,
           java.lang.Boolean spbmEnabled,
           java.lang.String defaultHardwareVersionKey,
           com.vmware.converter.ClusterDasConfigInfo dasConfig,
           com.vmware.converter.ClusterDasVmConfigSpec[] dasVmConfigSpec,
           com.vmware.converter.ClusterDrsConfigInfo drsConfig,
           com.vmware.converter.ClusterDrsVmConfigSpec[] drsVmConfigSpec,
           com.vmware.converter.ClusterRuleSpec[] rulesSpec,
           com.vmware.converter.ClusterDpmConfigInfo dpmConfig,
           com.vmware.converter.ClusterDpmHostConfigSpec[] dpmHostConfigSpec,
           com.vmware.converter.VsanClusterConfigInfo vsanConfig,
           com.vmware.converter.VsanHostConfigInfo[] vsanHostConfigSpec,
           com.vmware.converter.ClusterGroupSpec[] groupSpec) {
        super(
            vmSwapPlacement,
            spbmEnabled,
            defaultHardwareVersionKey);
        this.dasConfig = dasConfig;
        this.dasVmConfigSpec = dasVmConfigSpec;
        this.drsConfig = drsConfig;
        this.drsVmConfigSpec = drsVmConfigSpec;
        this.rulesSpec = rulesSpec;
        this.dpmConfig = dpmConfig;
        this.dpmHostConfigSpec = dpmHostConfigSpec;
        this.vsanConfig = vsanConfig;
        this.vsanHostConfigSpec = vsanHostConfigSpec;
        this.groupSpec = groupSpec;
    }


    /**
     * Gets the dasConfig value for this ClusterConfigSpecEx.
     * 
     * @return dasConfig
     */
    public com.vmware.converter.ClusterDasConfigInfo getDasConfig() {
        return dasConfig;
    }


    /**
     * Sets the dasConfig value for this ClusterConfigSpecEx.
     * 
     * @param dasConfig
     */
    public void setDasConfig(com.vmware.converter.ClusterDasConfigInfo dasConfig) {
        this.dasConfig = dasConfig;
    }


    /**
     * Gets the dasVmConfigSpec value for this ClusterConfigSpecEx.
     * 
     * @return dasVmConfigSpec
     */
    public com.vmware.converter.ClusterDasVmConfigSpec[] getDasVmConfigSpec() {
        return dasVmConfigSpec;
    }


    /**
     * Sets the dasVmConfigSpec value for this ClusterConfigSpecEx.
     * 
     * @param dasVmConfigSpec
     */
    public void setDasVmConfigSpec(com.vmware.converter.ClusterDasVmConfigSpec[] dasVmConfigSpec) {
        this.dasVmConfigSpec = dasVmConfigSpec;
    }

    public com.vmware.converter.ClusterDasVmConfigSpec getDasVmConfigSpec(int i) {
        return this.dasVmConfigSpec[i];
    }

    public void setDasVmConfigSpec(int i, com.vmware.converter.ClusterDasVmConfigSpec _value) {
        this.dasVmConfigSpec[i] = _value;
    }


    /**
     * Gets the drsConfig value for this ClusterConfigSpecEx.
     * 
     * @return drsConfig
     */
    public com.vmware.converter.ClusterDrsConfigInfo getDrsConfig() {
        return drsConfig;
    }


    /**
     * Sets the drsConfig value for this ClusterConfigSpecEx.
     * 
     * @param drsConfig
     */
    public void setDrsConfig(com.vmware.converter.ClusterDrsConfigInfo drsConfig) {
        this.drsConfig = drsConfig;
    }


    /**
     * Gets the drsVmConfigSpec value for this ClusterConfigSpecEx.
     * 
     * @return drsVmConfigSpec
     */
    public com.vmware.converter.ClusterDrsVmConfigSpec[] getDrsVmConfigSpec() {
        return drsVmConfigSpec;
    }


    /**
     * Sets the drsVmConfigSpec value for this ClusterConfigSpecEx.
     * 
     * @param drsVmConfigSpec
     */
    public void setDrsVmConfigSpec(com.vmware.converter.ClusterDrsVmConfigSpec[] drsVmConfigSpec) {
        this.drsVmConfigSpec = drsVmConfigSpec;
    }

    public com.vmware.converter.ClusterDrsVmConfigSpec getDrsVmConfigSpec(int i) {
        return this.drsVmConfigSpec[i];
    }

    public void setDrsVmConfigSpec(int i, com.vmware.converter.ClusterDrsVmConfigSpec _value) {
        this.drsVmConfigSpec[i] = _value;
    }


    /**
     * Gets the rulesSpec value for this ClusterConfigSpecEx.
     * 
     * @return rulesSpec
     */
    public com.vmware.converter.ClusterRuleSpec[] getRulesSpec() {
        return rulesSpec;
    }


    /**
     * Sets the rulesSpec value for this ClusterConfigSpecEx.
     * 
     * @param rulesSpec
     */
    public void setRulesSpec(com.vmware.converter.ClusterRuleSpec[] rulesSpec) {
        this.rulesSpec = rulesSpec;
    }

    public com.vmware.converter.ClusterRuleSpec getRulesSpec(int i) {
        return this.rulesSpec[i];
    }

    public void setRulesSpec(int i, com.vmware.converter.ClusterRuleSpec _value) {
        this.rulesSpec[i] = _value;
    }


    /**
     * Gets the dpmConfig value for this ClusterConfigSpecEx.
     * 
     * @return dpmConfig
     */
    public com.vmware.converter.ClusterDpmConfigInfo getDpmConfig() {
        return dpmConfig;
    }


    /**
     * Sets the dpmConfig value for this ClusterConfigSpecEx.
     * 
     * @param dpmConfig
     */
    public void setDpmConfig(com.vmware.converter.ClusterDpmConfigInfo dpmConfig) {
        this.dpmConfig = dpmConfig;
    }


    /**
     * Gets the dpmHostConfigSpec value for this ClusterConfigSpecEx.
     * 
     * @return dpmHostConfigSpec
     */
    public com.vmware.converter.ClusterDpmHostConfigSpec[] getDpmHostConfigSpec() {
        return dpmHostConfigSpec;
    }


    /**
     * Sets the dpmHostConfigSpec value for this ClusterConfigSpecEx.
     * 
     * @param dpmHostConfigSpec
     */
    public void setDpmHostConfigSpec(com.vmware.converter.ClusterDpmHostConfigSpec[] dpmHostConfigSpec) {
        this.dpmHostConfigSpec = dpmHostConfigSpec;
    }

    public com.vmware.converter.ClusterDpmHostConfigSpec getDpmHostConfigSpec(int i) {
        return this.dpmHostConfigSpec[i];
    }

    public void setDpmHostConfigSpec(int i, com.vmware.converter.ClusterDpmHostConfigSpec _value) {
        this.dpmHostConfigSpec[i] = _value;
    }


    /**
     * Gets the vsanConfig value for this ClusterConfigSpecEx.
     * 
     * @return vsanConfig
     */
    public com.vmware.converter.VsanClusterConfigInfo getVsanConfig() {
        return vsanConfig;
    }


    /**
     * Sets the vsanConfig value for this ClusterConfigSpecEx.
     * 
     * @param vsanConfig
     */
    public void setVsanConfig(com.vmware.converter.VsanClusterConfigInfo vsanConfig) {
        this.vsanConfig = vsanConfig;
    }


    /**
     * Gets the vsanHostConfigSpec value for this ClusterConfigSpecEx.
     * 
     * @return vsanHostConfigSpec
     */
    public com.vmware.converter.VsanHostConfigInfo[] getVsanHostConfigSpec() {
        return vsanHostConfigSpec;
    }


    /**
     * Sets the vsanHostConfigSpec value for this ClusterConfigSpecEx.
     * 
     * @param vsanHostConfigSpec
     */
    public void setVsanHostConfigSpec(com.vmware.converter.VsanHostConfigInfo[] vsanHostConfigSpec) {
        this.vsanHostConfigSpec = vsanHostConfigSpec;
    }

    public com.vmware.converter.VsanHostConfigInfo getVsanHostConfigSpec(int i) {
        return this.vsanHostConfigSpec[i];
    }

    public void setVsanHostConfigSpec(int i, com.vmware.converter.VsanHostConfigInfo _value) {
        this.vsanHostConfigSpec[i] = _value;
    }


    /**
     * Gets the groupSpec value for this ClusterConfigSpecEx.
     * 
     * @return groupSpec
     */
    public com.vmware.converter.ClusterGroupSpec[] getGroupSpec() {
        return groupSpec;
    }


    /**
     * Sets the groupSpec value for this ClusterConfigSpecEx.
     * 
     * @param groupSpec
     */
    public void setGroupSpec(com.vmware.converter.ClusterGroupSpec[] groupSpec) {
        this.groupSpec = groupSpec;
    }

    public com.vmware.converter.ClusterGroupSpec getGroupSpec(int i) {
        return this.groupSpec[i];
    }

    public void setGroupSpec(int i, com.vmware.converter.ClusterGroupSpec _value) {
        this.groupSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterConfigSpecEx)) return false;
        ClusterConfigSpecEx other = (ClusterConfigSpecEx) obj;
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
            ((this.dasVmConfigSpec==null && other.getDasVmConfigSpec()==null) || 
             (this.dasVmConfigSpec!=null &&
              java.util.Arrays.equals(this.dasVmConfigSpec, other.getDasVmConfigSpec()))) &&
            ((this.drsConfig==null && other.getDrsConfig()==null) || 
             (this.drsConfig!=null &&
              this.drsConfig.equals(other.getDrsConfig()))) &&
            ((this.drsVmConfigSpec==null && other.getDrsVmConfigSpec()==null) || 
             (this.drsVmConfigSpec!=null &&
              java.util.Arrays.equals(this.drsVmConfigSpec, other.getDrsVmConfigSpec()))) &&
            ((this.rulesSpec==null && other.getRulesSpec()==null) || 
             (this.rulesSpec!=null &&
              java.util.Arrays.equals(this.rulesSpec, other.getRulesSpec()))) &&
            ((this.dpmConfig==null && other.getDpmConfig()==null) || 
             (this.dpmConfig!=null &&
              this.dpmConfig.equals(other.getDpmConfig()))) &&
            ((this.dpmHostConfigSpec==null && other.getDpmHostConfigSpec()==null) || 
             (this.dpmHostConfigSpec!=null &&
              java.util.Arrays.equals(this.dpmHostConfigSpec, other.getDpmHostConfigSpec()))) &&
            ((this.vsanConfig==null && other.getVsanConfig()==null) || 
             (this.vsanConfig!=null &&
              this.vsanConfig.equals(other.getVsanConfig()))) &&
            ((this.vsanHostConfigSpec==null && other.getVsanHostConfigSpec()==null) || 
             (this.vsanHostConfigSpec!=null &&
              java.util.Arrays.equals(this.vsanHostConfigSpec, other.getVsanHostConfigSpec()))) &&
            ((this.groupSpec==null && other.getGroupSpec()==null) || 
             (this.groupSpec!=null &&
              java.util.Arrays.equals(this.groupSpec, other.getGroupSpec())));
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
        if (getDasVmConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDasVmConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDasVmConfigSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrsConfig() != null) {
            _hashCode += getDrsConfig().hashCode();
        }
        if (getDrsVmConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrsVmConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrsVmConfigSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRulesSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRulesSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRulesSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDpmConfig() != null) {
            _hashCode += getDpmConfig().hashCode();
        }
        if (getDpmHostConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDpmHostConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDpmHostConfigSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsanConfig() != null) {
            _hashCode += getVsanConfig().hashCode();
        }
        if (getVsanHostConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostConfigSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterConfigSpecEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterConfigSpecEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasVmConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasVmConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasVmConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "drsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drsVmConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "drsVmConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsVmConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rulesSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rulesSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dpmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDpmConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpmHostConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dpmHostConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDpmHostConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanClusterConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanHostConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "groupSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterGroupSpec"));
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
