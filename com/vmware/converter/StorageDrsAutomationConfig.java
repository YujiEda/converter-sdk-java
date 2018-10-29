/**
 * StorageDrsAutomationConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsAutomationConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String spaceLoadBalanceAutomationMode;

    private java.lang.String ioLoadBalanceAutomationMode;

    private java.lang.String ruleEnforcementAutomationMode;

    private java.lang.String policyEnforcementAutomationMode;

    private java.lang.String vmEvacuationAutomationMode;

    public StorageDrsAutomationConfig() {
    }

    public StorageDrsAutomationConfig(
           java.lang.String spaceLoadBalanceAutomationMode,
           java.lang.String ioLoadBalanceAutomationMode,
           java.lang.String ruleEnforcementAutomationMode,
           java.lang.String policyEnforcementAutomationMode,
           java.lang.String vmEvacuationAutomationMode) {
        this.spaceLoadBalanceAutomationMode = spaceLoadBalanceAutomationMode;
        this.ioLoadBalanceAutomationMode = ioLoadBalanceAutomationMode;
        this.ruleEnforcementAutomationMode = ruleEnforcementAutomationMode;
        this.policyEnforcementAutomationMode = policyEnforcementAutomationMode;
        this.vmEvacuationAutomationMode = vmEvacuationAutomationMode;
    }


    /**
     * Gets the spaceLoadBalanceAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @return spaceLoadBalanceAutomationMode
     */
    public java.lang.String getSpaceLoadBalanceAutomationMode() {
        return spaceLoadBalanceAutomationMode;
    }


    /**
     * Sets the spaceLoadBalanceAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @param spaceLoadBalanceAutomationMode
     */
    public void setSpaceLoadBalanceAutomationMode(java.lang.String spaceLoadBalanceAutomationMode) {
        this.spaceLoadBalanceAutomationMode = spaceLoadBalanceAutomationMode;
    }


    /**
     * Gets the ioLoadBalanceAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @return ioLoadBalanceAutomationMode
     */
    public java.lang.String getIoLoadBalanceAutomationMode() {
        return ioLoadBalanceAutomationMode;
    }


    /**
     * Sets the ioLoadBalanceAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @param ioLoadBalanceAutomationMode
     */
    public void setIoLoadBalanceAutomationMode(java.lang.String ioLoadBalanceAutomationMode) {
        this.ioLoadBalanceAutomationMode = ioLoadBalanceAutomationMode;
    }


    /**
     * Gets the ruleEnforcementAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @return ruleEnforcementAutomationMode
     */
    public java.lang.String getRuleEnforcementAutomationMode() {
        return ruleEnforcementAutomationMode;
    }


    /**
     * Sets the ruleEnforcementAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @param ruleEnforcementAutomationMode
     */
    public void setRuleEnforcementAutomationMode(java.lang.String ruleEnforcementAutomationMode) {
        this.ruleEnforcementAutomationMode = ruleEnforcementAutomationMode;
    }


    /**
     * Gets the policyEnforcementAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @return policyEnforcementAutomationMode
     */
    public java.lang.String getPolicyEnforcementAutomationMode() {
        return policyEnforcementAutomationMode;
    }


    /**
     * Sets the policyEnforcementAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @param policyEnforcementAutomationMode
     */
    public void setPolicyEnforcementAutomationMode(java.lang.String policyEnforcementAutomationMode) {
        this.policyEnforcementAutomationMode = policyEnforcementAutomationMode;
    }


    /**
     * Gets the vmEvacuationAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @return vmEvacuationAutomationMode
     */
    public java.lang.String getVmEvacuationAutomationMode() {
        return vmEvacuationAutomationMode;
    }


    /**
     * Sets the vmEvacuationAutomationMode value for this StorageDrsAutomationConfig.
     * 
     * @param vmEvacuationAutomationMode
     */
    public void setVmEvacuationAutomationMode(java.lang.String vmEvacuationAutomationMode) {
        this.vmEvacuationAutomationMode = vmEvacuationAutomationMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsAutomationConfig)) return false;
        StorageDrsAutomationConfig other = (StorageDrsAutomationConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.spaceLoadBalanceAutomationMode==null && other.getSpaceLoadBalanceAutomationMode()==null) || 
             (this.spaceLoadBalanceAutomationMode!=null &&
              this.spaceLoadBalanceAutomationMode.equals(other.getSpaceLoadBalanceAutomationMode()))) &&
            ((this.ioLoadBalanceAutomationMode==null && other.getIoLoadBalanceAutomationMode()==null) || 
             (this.ioLoadBalanceAutomationMode!=null &&
              this.ioLoadBalanceAutomationMode.equals(other.getIoLoadBalanceAutomationMode()))) &&
            ((this.ruleEnforcementAutomationMode==null && other.getRuleEnforcementAutomationMode()==null) || 
             (this.ruleEnforcementAutomationMode!=null &&
              this.ruleEnforcementAutomationMode.equals(other.getRuleEnforcementAutomationMode()))) &&
            ((this.policyEnforcementAutomationMode==null && other.getPolicyEnforcementAutomationMode()==null) || 
             (this.policyEnforcementAutomationMode!=null &&
              this.policyEnforcementAutomationMode.equals(other.getPolicyEnforcementAutomationMode()))) &&
            ((this.vmEvacuationAutomationMode==null && other.getVmEvacuationAutomationMode()==null) || 
             (this.vmEvacuationAutomationMode!=null &&
              this.vmEvacuationAutomationMode.equals(other.getVmEvacuationAutomationMode())));
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
        if (getSpaceLoadBalanceAutomationMode() != null) {
            _hashCode += getSpaceLoadBalanceAutomationMode().hashCode();
        }
        if (getIoLoadBalanceAutomationMode() != null) {
            _hashCode += getIoLoadBalanceAutomationMode().hashCode();
        }
        if (getRuleEnforcementAutomationMode() != null) {
            _hashCode += getRuleEnforcementAutomationMode().hashCode();
        }
        if (getPolicyEnforcementAutomationMode() != null) {
            _hashCode += getPolicyEnforcementAutomationMode().hashCode();
        }
        if (getVmEvacuationAutomationMode() != null) {
            _hashCode += getVmEvacuationAutomationMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageDrsAutomationConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsAutomationConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceLoadBalanceAutomationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spaceLoadBalanceAutomationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioLoadBalanceAutomationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ioLoadBalanceAutomationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleEnforcementAutomationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ruleEnforcementAutomationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyEnforcementAutomationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "policyEnforcementAutomationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmEvacuationAutomationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmEvacuationAutomationMode"));
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
