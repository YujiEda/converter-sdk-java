/**
 * ClusterDasConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDasConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enabled;

    private java.lang.String vmMonitoring;

    private java.lang.String hostMonitoring;

    private java.lang.String vmComponentProtecting;

    private java.lang.Integer failoverLevel;

    private com.vmware.converter.ClusterDasAdmissionControlPolicy admissionControlPolicy;

    private java.lang.Boolean admissionControlEnabled;

    private com.vmware.converter.ClusterDasVmSettings defaultVmSettings;

    private com.vmware.converter.OptionValue[] option;

    private com.vmware.converter.ManagedObjectReference[] heartbeatDatastore;

    private java.lang.String hBDatastoreCandidatePolicy;

    public ClusterDasConfigInfo() {
    }

    public ClusterDasConfigInfo(
           java.lang.Boolean enabled,
           java.lang.String vmMonitoring,
           java.lang.String hostMonitoring,
           java.lang.String vmComponentProtecting,
           java.lang.Integer failoverLevel,
           com.vmware.converter.ClusterDasAdmissionControlPolicy admissionControlPolicy,
           java.lang.Boolean admissionControlEnabled,
           com.vmware.converter.ClusterDasVmSettings defaultVmSettings,
           com.vmware.converter.OptionValue[] option,
           com.vmware.converter.ManagedObjectReference[] heartbeatDatastore,
           java.lang.String hBDatastoreCandidatePolicy) {
        this.enabled = enabled;
        this.vmMonitoring = vmMonitoring;
        this.hostMonitoring = hostMonitoring;
        this.vmComponentProtecting = vmComponentProtecting;
        this.failoverLevel = failoverLevel;
        this.admissionControlPolicy = admissionControlPolicy;
        this.admissionControlEnabled = admissionControlEnabled;
        this.defaultVmSettings = defaultVmSettings;
        this.option = option;
        this.heartbeatDatastore = heartbeatDatastore;
        this.hBDatastoreCandidatePolicy = hBDatastoreCandidatePolicy;
    }


    /**
     * Gets the enabled value for this ClusterDasConfigInfo.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this ClusterDasConfigInfo.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the vmMonitoring value for this ClusterDasConfigInfo.
     * 
     * @return vmMonitoring
     */
    public java.lang.String getVmMonitoring() {
        return vmMonitoring;
    }


    /**
     * Sets the vmMonitoring value for this ClusterDasConfigInfo.
     * 
     * @param vmMonitoring
     */
    public void setVmMonitoring(java.lang.String vmMonitoring) {
        this.vmMonitoring = vmMonitoring;
    }


    /**
     * Gets the hostMonitoring value for this ClusterDasConfigInfo.
     * 
     * @return hostMonitoring
     */
    public java.lang.String getHostMonitoring() {
        return hostMonitoring;
    }


    /**
     * Sets the hostMonitoring value for this ClusterDasConfigInfo.
     * 
     * @param hostMonitoring
     */
    public void setHostMonitoring(java.lang.String hostMonitoring) {
        this.hostMonitoring = hostMonitoring;
    }


    /**
     * Gets the vmComponentProtecting value for this ClusterDasConfigInfo.
     * 
     * @return vmComponentProtecting
     */
    public java.lang.String getVmComponentProtecting() {
        return vmComponentProtecting;
    }


    /**
     * Sets the vmComponentProtecting value for this ClusterDasConfigInfo.
     * 
     * @param vmComponentProtecting
     */
    public void setVmComponentProtecting(java.lang.String vmComponentProtecting) {
        this.vmComponentProtecting = vmComponentProtecting;
    }


    /**
     * Gets the failoverLevel value for this ClusterDasConfigInfo.
     * 
     * @return failoverLevel
     */
    public java.lang.Integer getFailoverLevel() {
        return failoverLevel;
    }


    /**
     * Sets the failoverLevel value for this ClusterDasConfigInfo.
     * 
     * @param failoverLevel
     */
    public void setFailoverLevel(java.lang.Integer failoverLevel) {
        this.failoverLevel = failoverLevel;
    }


    /**
     * Gets the admissionControlPolicy value for this ClusterDasConfigInfo.
     * 
     * @return admissionControlPolicy
     */
    public com.vmware.converter.ClusterDasAdmissionControlPolicy getAdmissionControlPolicy() {
        return admissionControlPolicy;
    }


    /**
     * Sets the admissionControlPolicy value for this ClusterDasConfigInfo.
     * 
     * @param admissionControlPolicy
     */
    public void setAdmissionControlPolicy(com.vmware.converter.ClusterDasAdmissionControlPolicy admissionControlPolicy) {
        this.admissionControlPolicy = admissionControlPolicy;
    }


    /**
     * Gets the admissionControlEnabled value for this ClusterDasConfigInfo.
     * 
     * @return admissionControlEnabled
     */
    public java.lang.Boolean getAdmissionControlEnabled() {
        return admissionControlEnabled;
    }


    /**
     * Sets the admissionControlEnabled value for this ClusterDasConfigInfo.
     * 
     * @param admissionControlEnabled
     */
    public void setAdmissionControlEnabled(java.lang.Boolean admissionControlEnabled) {
        this.admissionControlEnabled = admissionControlEnabled;
    }


    /**
     * Gets the defaultVmSettings value for this ClusterDasConfigInfo.
     * 
     * @return defaultVmSettings
     */
    public com.vmware.converter.ClusterDasVmSettings getDefaultVmSettings() {
        return defaultVmSettings;
    }


    /**
     * Sets the defaultVmSettings value for this ClusterDasConfigInfo.
     * 
     * @param defaultVmSettings
     */
    public void setDefaultVmSettings(com.vmware.converter.ClusterDasVmSettings defaultVmSettings) {
        this.defaultVmSettings = defaultVmSettings;
    }


    /**
     * Gets the option value for this ClusterDasConfigInfo.
     * 
     * @return option
     */
    public com.vmware.converter.OptionValue[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this ClusterDasConfigInfo.
     * 
     * @param option
     */
    public void setOption(com.vmware.converter.OptionValue[] option) {
        this.option = option;
    }

    public com.vmware.converter.OptionValue getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, com.vmware.converter.OptionValue _value) {
        this.option[i] = _value;
    }


    /**
     * Gets the heartbeatDatastore value for this ClusterDasConfigInfo.
     * 
     * @return heartbeatDatastore
     */
    public com.vmware.converter.ManagedObjectReference[] getHeartbeatDatastore() {
        return heartbeatDatastore;
    }


    /**
     * Sets the heartbeatDatastore value for this ClusterDasConfigInfo.
     * 
     * @param heartbeatDatastore
     */
    public void setHeartbeatDatastore(com.vmware.converter.ManagedObjectReference[] heartbeatDatastore) {
        this.heartbeatDatastore = heartbeatDatastore;
    }

    public com.vmware.converter.ManagedObjectReference getHeartbeatDatastore(int i) {
        return this.heartbeatDatastore[i];
    }

    public void setHeartbeatDatastore(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.heartbeatDatastore[i] = _value;
    }


    /**
     * Gets the hBDatastoreCandidatePolicy value for this ClusterDasConfigInfo.
     * 
     * @return hBDatastoreCandidatePolicy
     */
    public java.lang.String getHBDatastoreCandidatePolicy() {
        return hBDatastoreCandidatePolicy;
    }


    /**
     * Sets the hBDatastoreCandidatePolicy value for this ClusterDasConfigInfo.
     * 
     * @param hBDatastoreCandidatePolicy
     */
    public void setHBDatastoreCandidatePolicy(java.lang.String hBDatastoreCandidatePolicy) {
        this.hBDatastoreCandidatePolicy = hBDatastoreCandidatePolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasConfigInfo)) return false;
        ClusterDasConfigInfo other = (ClusterDasConfigInfo) obj;
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
            ((this.vmMonitoring==null && other.getVmMonitoring()==null) || 
             (this.vmMonitoring!=null &&
              this.vmMonitoring.equals(other.getVmMonitoring()))) &&
            ((this.hostMonitoring==null && other.getHostMonitoring()==null) || 
             (this.hostMonitoring!=null &&
              this.hostMonitoring.equals(other.getHostMonitoring()))) &&
            ((this.vmComponentProtecting==null && other.getVmComponentProtecting()==null) || 
             (this.vmComponentProtecting!=null &&
              this.vmComponentProtecting.equals(other.getVmComponentProtecting()))) &&
            ((this.failoverLevel==null && other.getFailoverLevel()==null) || 
             (this.failoverLevel!=null &&
              this.failoverLevel.equals(other.getFailoverLevel()))) &&
            ((this.admissionControlPolicy==null && other.getAdmissionControlPolicy()==null) || 
             (this.admissionControlPolicy!=null &&
              this.admissionControlPolicy.equals(other.getAdmissionControlPolicy()))) &&
            ((this.admissionControlEnabled==null && other.getAdmissionControlEnabled()==null) || 
             (this.admissionControlEnabled!=null &&
              this.admissionControlEnabled.equals(other.getAdmissionControlEnabled()))) &&
            ((this.defaultVmSettings==null && other.getDefaultVmSettings()==null) || 
             (this.defaultVmSettings!=null &&
              this.defaultVmSettings.equals(other.getDefaultVmSettings()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption()))) &&
            ((this.heartbeatDatastore==null && other.getHeartbeatDatastore()==null) || 
             (this.heartbeatDatastore!=null &&
              java.util.Arrays.equals(this.heartbeatDatastore, other.getHeartbeatDatastore()))) &&
            ((this.hBDatastoreCandidatePolicy==null && other.getHBDatastoreCandidatePolicy()==null) || 
             (this.hBDatastoreCandidatePolicy!=null &&
              this.hBDatastoreCandidatePolicy.equals(other.getHBDatastoreCandidatePolicy())));
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
        if (getVmMonitoring() != null) {
            _hashCode += getVmMonitoring().hashCode();
        }
        if (getHostMonitoring() != null) {
            _hashCode += getHostMonitoring().hashCode();
        }
        if (getVmComponentProtecting() != null) {
            _hashCode += getVmComponentProtecting().hashCode();
        }
        if (getFailoverLevel() != null) {
            _hashCode += getFailoverLevel().hashCode();
        }
        if (getAdmissionControlPolicy() != null) {
            _hashCode += getAdmissionControlPolicy().hashCode();
        }
        if (getAdmissionControlEnabled() != null) {
            _hashCode += getAdmissionControlEnabled().hashCode();
        }
        if (getDefaultVmSettings() != null) {
            _hashCode += getDefaultVmSettings().hashCode();
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
        if (getHeartbeatDatastore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeartbeatDatastore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeartbeatDatastore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHBDatastoreCandidatePolicy() != null) {
            _hashCode += getHBDatastoreCandidatePolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmMonitoring");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmMonitoring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMonitoring");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostMonitoring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmComponentProtecting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmComponentProtecting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failoverLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failoverLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admissionControlPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "admissionControlPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAdmissionControlPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admissionControlEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "admissionControlEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultVmSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultVmSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasVmSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heartbeatDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "heartbeatDatastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HBDatastoreCandidatePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hBDatastoreCandidatePolicy"));
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
