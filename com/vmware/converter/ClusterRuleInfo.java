/**
 * ClusterRuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterRuleInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer key;

    private com.vmware.converter.ManagedEntityStatus status;

    private java.lang.Boolean enabled;

    private java.lang.String name;

    private java.lang.Boolean mandatory;

    private java.lang.Boolean userCreated;

    private java.lang.Boolean inCompliance;

    private java.lang.String ruleUuid;

    public ClusterRuleInfo() {
    }

    public ClusterRuleInfo(
           java.lang.Integer key,
           com.vmware.converter.ManagedEntityStatus status,
           java.lang.Boolean enabled,
           java.lang.String name,
           java.lang.Boolean mandatory,
           java.lang.Boolean userCreated,
           java.lang.Boolean inCompliance,
           java.lang.String ruleUuid) {
        this.key = key;
        this.status = status;
        this.enabled = enabled;
        this.name = name;
        this.mandatory = mandatory;
        this.userCreated = userCreated;
        this.inCompliance = inCompliance;
        this.ruleUuid = ruleUuid;
    }


    /**
     * Gets the key value for this ClusterRuleInfo.
     * 
     * @return key
     */
    public java.lang.Integer getKey() {
        return key;
    }


    /**
     * Sets the key value for this ClusterRuleInfo.
     * 
     * @param key
     */
    public void setKey(java.lang.Integer key) {
        this.key = key;
    }


    /**
     * Gets the status value for this ClusterRuleInfo.
     * 
     * @return status
     */
    public com.vmware.converter.ManagedEntityStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ClusterRuleInfo.
     * 
     * @param status
     */
    public void setStatus(com.vmware.converter.ManagedEntityStatus status) {
        this.status = status;
    }


    /**
     * Gets the enabled value for this ClusterRuleInfo.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this ClusterRuleInfo.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the name value for this ClusterRuleInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ClusterRuleInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the mandatory value for this ClusterRuleInfo.
     * 
     * @return mandatory
     */
    public java.lang.Boolean getMandatory() {
        return mandatory;
    }


    /**
     * Sets the mandatory value for this ClusterRuleInfo.
     * 
     * @param mandatory
     */
    public void setMandatory(java.lang.Boolean mandatory) {
        this.mandatory = mandatory;
    }


    /**
     * Gets the userCreated value for this ClusterRuleInfo.
     * 
     * @return userCreated
     */
    public java.lang.Boolean getUserCreated() {
        return userCreated;
    }


    /**
     * Sets the userCreated value for this ClusterRuleInfo.
     * 
     * @param userCreated
     */
    public void setUserCreated(java.lang.Boolean userCreated) {
        this.userCreated = userCreated;
    }


    /**
     * Gets the inCompliance value for this ClusterRuleInfo.
     * 
     * @return inCompliance
     */
    public java.lang.Boolean getInCompliance() {
        return inCompliance;
    }


    /**
     * Sets the inCompliance value for this ClusterRuleInfo.
     * 
     * @param inCompliance
     */
    public void setInCompliance(java.lang.Boolean inCompliance) {
        this.inCompliance = inCompliance;
    }


    /**
     * Gets the ruleUuid value for this ClusterRuleInfo.
     * 
     * @return ruleUuid
     */
    public java.lang.String getRuleUuid() {
        return ruleUuid;
    }


    /**
     * Sets the ruleUuid value for this ClusterRuleInfo.
     * 
     * @param ruleUuid
     */
    public void setRuleUuid(java.lang.String ruleUuid) {
        this.ruleUuid = ruleUuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterRuleInfo)) return false;
        ClusterRuleInfo other = (ClusterRuleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.mandatory==null && other.getMandatory()==null) || 
             (this.mandatory!=null &&
              this.mandatory.equals(other.getMandatory()))) &&
            ((this.userCreated==null && other.getUserCreated()==null) || 
             (this.userCreated!=null &&
              this.userCreated.equals(other.getUserCreated()))) &&
            ((this.inCompliance==null && other.getInCompliance()==null) || 
             (this.inCompliance!=null &&
              this.inCompliance.equals(other.getInCompliance()))) &&
            ((this.ruleUuid==null && other.getRuleUuid()==null) || 
             (this.ruleUuid!=null &&
              this.ruleUuid.equals(other.getRuleUuid())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getMandatory() != null) {
            _hashCode += getMandatory().hashCode();
        }
        if (getUserCreated() != null) {
            _hashCode += getUserCreated().hashCode();
        }
        if (getInCompliance() != null) {
            _hashCode += getInCompliance().hashCode();
        }
        if (getRuleUuid() != null) {
            _hashCode += getRuleUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterRuleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedEntityStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inCompliance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inCompliance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ruleUuid"));
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
