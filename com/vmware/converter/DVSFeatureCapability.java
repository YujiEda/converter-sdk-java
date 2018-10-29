/**
 * DVSFeatureCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSFeatureCapability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean networkResourceManagementSupported;

    private boolean vmDirectPathGen2Supported;

    private java.lang.String[] nicTeamingPolicy;

    private java.lang.Integer networkResourcePoolHighShareValue;

    private com.vmware.converter.DVSNetworkResourceManagementCapability networkResourceManagementCapability;

    private com.vmware.converter.DVSHealthCheckCapability healthCheckCapability;

    private com.vmware.converter.DVSRollbackCapability rollbackCapability;

    private com.vmware.converter.DVSBackupRestoreCapability backupRestoreCapability;

    private java.lang.Boolean networkFilterSupported;

    public DVSFeatureCapability() {
    }

    public DVSFeatureCapability(
           boolean networkResourceManagementSupported,
           boolean vmDirectPathGen2Supported,
           java.lang.String[] nicTeamingPolicy,
           java.lang.Integer networkResourcePoolHighShareValue,
           com.vmware.converter.DVSNetworkResourceManagementCapability networkResourceManagementCapability,
           com.vmware.converter.DVSHealthCheckCapability healthCheckCapability,
           com.vmware.converter.DVSRollbackCapability rollbackCapability,
           com.vmware.converter.DVSBackupRestoreCapability backupRestoreCapability,
           java.lang.Boolean networkFilterSupported) {
        this.networkResourceManagementSupported = networkResourceManagementSupported;
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
        this.nicTeamingPolicy = nicTeamingPolicy;
        this.networkResourcePoolHighShareValue = networkResourcePoolHighShareValue;
        this.networkResourceManagementCapability = networkResourceManagementCapability;
        this.healthCheckCapability = healthCheckCapability;
        this.rollbackCapability = rollbackCapability;
        this.backupRestoreCapability = backupRestoreCapability;
        this.networkFilterSupported = networkFilterSupported;
    }


    /**
     * Gets the networkResourceManagementSupported value for this DVSFeatureCapability.
     * 
     * @return networkResourceManagementSupported
     */
    public boolean isNetworkResourceManagementSupported() {
        return networkResourceManagementSupported;
    }


    /**
     * Sets the networkResourceManagementSupported value for this DVSFeatureCapability.
     * 
     * @param networkResourceManagementSupported
     */
    public void setNetworkResourceManagementSupported(boolean networkResourceManagementSupported) {
        this.networkResourceManagementSupported = networkResourceManagementSupported;
    }


    /**
     * Gets the vmDirectPathGen2Supported value for this DVSFeatureCapability.
     * 
     * @return vmDirectPathGen2Supported
     */
    public boolean isVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }


    /**
     * Sets the vmDirectPathGen2Supported value for this DVSFeatureCapability.
     * 
     * @param vmDirectPathGen2Supported
     */
    public void setVmDirectPathGen2Supported(boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }


    /**
     * Gets the nicTeamingPolicy value for this DVSFeatureCapability.
     * 
     * @return nicTeamingPolicy
     */
    public java.lang.String[] getNicTeamingPolicy() {
        return nicTeamingPolicy;
    }


    /**
     * Sets the nicTeamingPolicy value for this DVSFeatureCapability.
     * 
     * @param nicTeamingPolicy
     */
    public void setNicTeamingPolicy(java.lang.String[] nicTeamingPolicy) {
        this.nicTeamingPolicy = nicTeamingPolicy;
    }

    public java.lang.String getNicTeamingPolicy(int i) {
        return this.nicTeamingPolicy[i];
    }

    public void setNicTeamingPolicy(int i, java.lang.String _value) {
        this.nicTeamingPolicy[i] = _value;
    }


    /**
     * Gets the networkResourcePoolHighShareValue value for this DVSFeatureCapability.
     * 
     * @return networkResourcePoolHighShareValue
     */
    public java.lang.Integer getNetworkResourcePoolHighShareValue() {
        return networkResourcePoolHighShareValue;
    }


    /**
     * Sets the networkResourcePoolHighShareValue value for this DVSFeatureCapability.
     * 
     * @param networkResourcePoolHighShareValue
     */
    public void setNetworkResourcePoolHighShareValue(java.lang.Integer networkResourcePoolHighShareValue) {
        this.networkResourcePoolHighShareValue = networkResourcePoolHighShareValue;
    }


    /**
     * Gets the networkResourceManagementCapability value for this DVSFeatureCapability.
     * 
     * @return networkResourceManagementCapability
     */
    public com.vmware.converter.DVSNetworkResourceManagementCapability getNetworkResourceManagementCapability() {
        return networkResourceManagementCapability;
    }


    /**
     * Sets the networkResourceManagementCapability value for this DVSFeatureCapability.
     * 
     * @param networkResourceManagementCapability
     */
    public void setNetworkResourceManagementCapability(com.vmware.converter.DVSNetworkResourceManagementCapability networkResourceManagementCapability) {
        this.networkResourceManagementCapability = networkResourceManagementCapability;
    }


    /**
     * Gets the healthCheckCapability value for this DVSFeatureCapability.
     * 
     * @return healthCheckCapability
     */
    public com.vmware.converter.DVSHealthCheckCapability getHealthCheckCapability() {
        return healthCheckCapability;
    }


    /**
     * Sets the healthCheckCapability value for this DVSFeatureCapability.
     * 
     * @param healthCheckCapability
     */
    public void setHealthCheckCapability(com.vmware.converter.DVSHealthCheckCapability healthCheckCapability) {
        this.healthCheckCapability = healthCheckCapability;
    }


    /**
     * Gets the rollbackCapability value for this DVSFeatureCapability.
     * 
     * @return rollbackCapability
     */
    public com.vmware.converter.DVSRollbackCapability getRollbackCapability() {
        return rollbackCapability;
    }


    /**
     * Sets the rollbackCapability value for this DVSFeatureCapability.
     * 
     * @param rollbackCapability
     */
    public void setRollbackCapability(com.vmware.converter.DVSRollbackCapability rollbackCapability) {
        this.rollbackCapability = rollbackCapability;
    }


    /**
     * Gets the backupRestoreCapability value for this DVSFeatureCapability.
     * 
     * @return backupRestoreCapability
     */
    public com.vmware.converter.DVSBackupRestoreCapability getBackupRestoreCapability() {
        return backupRestoreCapability;
    }


    /**
     * Sets the backupRestoreCapability value for this DVSFeatureCapability.
     * 
     * @param backupRestoreCapability
     */
    public void setBackupRestoreCapability(com.vmware.converter.DVSBackupRestoreCapability backupRestoreCapability) {
        this.backupRestoreCapability = backupRestoreCapability;
    }


    /**
     * Gets the networkFilterSupported value for this DVSFeatureCapability.
     * 
     * @return networkFilterSupported
     */
    public java.lang.Boolean getNetworkFilterSupported() {
        return networkFilterSupported;
    }


    /**
     * Sets the networkFilterSupported value for this DVSFeatureCapability.
     * 
     * @param networkFilterSupported
     */
    public void setNetworkFilterSupported(java.lang.Boolean networkFilterSupported) {
        this.networkFilterSupported = networkFilterSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSFeatureCapability)) return false;
        DVSFeatureCapability other = (DVSFeatureCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.networkResourceManagementSupported == other.isNetworkResourceManagementSupported() &&
            this.vmDirectPathGen2Supported == other.isVmDirectPathGen2Supported() &&
            ((this.nicTeamingPolicy==null && other.getNicTeamingPolicy()==null) || 
             (this.nicTeamingPolicy!=null &&
              java.util.Arrays.equals(this.nicTeamingPolicy, other.getNicTeamingPolicy()))) &&
            ((this.networkResourcePoolHighShareValue==null && other.getNetworkResourcePoolHighShareValue()==null) || 
             (this.networkResourcePoolHighShareValue!=null &&
              this.networkResourcePoolHighShareValue.equals(other.getNetworkResourcePoolHighShareValue()))) &&
            ((this.networkResourceManagementCapability==null && other.getNetworkResourceManagementCapability()==null) || 
             (this.networkResourceManagementCapability!=null &&
              this.networkResourceManagementCapability.equals(other.getNetworkResourceManagementCapability()))) &&
            ((this.healthCheckCapability==null && other.getHealthCheckCapability()==null) || 
             (this.healthCheckCapability!=null &&
              this.healthCheckCapability.equals(other.getHealthCheckCapability()))) &&
            ((this.rollbackCapability==null && other.getRollbackCapability()==null) || 
             (this.rollbackCapability!=null &&
              this.rollbackCapability.equals(other.getRollbackCapability()))) &&
            ((this.backupRestoreCapability==null && other.getBackupRestoreCapability()==null) || 
             (this.backupRestoreCapability!=null &&
              this.backupRestoreCapability.equals(other.getBackupRestoreCapability()))) &&
            ((this.networkFilterSupported==null && other.getNetworkFilterSupported()==null) || 
             (this.networkFilterSupported!=null &&
              this.networkFilterSupported.equals(other.getNetworkFilterSupported())));
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
        _hashCode += (isNetworkResourceManagementSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVmDirectPathGen2Supported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNicTeamingPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNicTeamingPolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNicTeamingPolicy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkResourcePoolHighShareValue() != null) {
            _hashCode += getNetworkResourcePoolHighShareValue().hashCode();
        }
        if (getNetworkResourceManagementCapability() != null) {
            _hashCode += getNetworkResourceManagementCapability().hashCode();
        }
        if (getHealthCheckCapability() != null) {
            _hashCode += getHealthCheckCapability().hashCode();
        }
        if (getRollbackCapability() != null) {
            _hashCode += getRollbackCapability().hashCode();
        }
        if (getBackupRestoreCapability() != null) {
            _hashCode += getBackupRestoreCapability().hashCode();
        }
        if (getNetworkFilterSupported() != null) {
            _hashCode += getNetworkFilterSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSFeatureCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSFeatureCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourceManagementSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourceManagementSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2Supported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2Supported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicTeamingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicTeamingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourcePoolHighShareValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourcePoolHighShareValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourceManagementCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourceManagementCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSNetworkResourceManagementCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCheckCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthCheckCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSHealthCheckCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollbackCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rollbackCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSRollbackCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupRestoreCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backupRestoreCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSBackupRestoreCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkFilterSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkFilterSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
