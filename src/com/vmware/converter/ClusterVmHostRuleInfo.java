/**
 * ClusterVmHostRuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterVmHostRuleInfo  extends com.vmware.converter.ClusterRuleInfo  implements java.io.Serializable {
    private java.lang.String vmGroupName;

    private java.lang.String affineHostGroupName;

    private java.lang.String antiAffineHostGroupName;

    public ClusterVmHostRuleInfo() {
    }

    public ClusterVmHostRuleInfo(
           java.lang.Integer key,
           com.vmware.converter.ManagedEntityStatus status,
           java.lang.Boolean enabled,
           java.lang.String name,
           java.lang.Boolean mandatory,
           java.lang.Boolean userCreated,
           java.lang.Boolean inCompliance,
           java.lang.String ruleUuid,
           java.lang.String vmGroupName,
           java.lang.String affineHostGroupName,
           java.lang.String antiAffineHostGroupName) {
        super(
            key,
            status,
            enabled,
            name,
            mandatory,
            userCreated,
            inCompliance,
            ruleUuid);
        this.vmGroupName = vmGroupName;
        this.affineHostGroupName = affineHostGroupName;
        this.antiAffineHostGroupName = antiAffineHostGroupName;
    }


    /**
     * Gets the vmGroupName value for this ClusterVmHostRuleInfo.
     * 
     * @return vmGroupName
     */
    public java.lang.String getVmGroupName() {
        return vmGroupName;
    }


    /**
     * Sets the vmGroupName value for this ClusterVmHostRuleInfo.
     * 
     * @param vmGroupName
     */
    public void setVmGroupName(java.lang.String vmGroupName) {
        this.vmGroupName = vmGroupName;
    }


    /**
     * Gets the affineHostGroupName value for this ClusterVmHostRuleInfo.
     * 
     * @return affineHostGroupName
     */
    public java.lang.String getAffineHostGroupName() {
        return affineHostGroupName;
    }


    /**
     * Sets the affineHostGroupName value for this ClusterVmHostRuleInfo.
     * 
     * @param affineHostGroupName
     */
    public void setAffineHostGroupName(java.lang.String affineHostGroupName) {
        this.affineHostGroupName = affineHostGroupName;
    }


    /**
     * Gets the antiAffineHostGroupName value for this ClusterVmHostRuleInfo.
     * 
     * @return antiAffineHostGroupName
     */
    public java.lang.String getAntiAffineHostGroupName() {
        return antiAffineHostGroupName;
    }


    /**
     * Sets the antiAffineHostGroupName value for this ClusterVmHostRuleInfo.
     * 
     * @param antiAffineHostGroupName
     */
    public void setAntiAffineHostGroupName(java.lang.String antiAffineHostGroupName) {
        this.antiAffineHostGroupName = antiAffineHostGroupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterVmHostRuleInfo)) return false;
        ClusterVmHostRuleInfo other = (ClusterVmHostRuleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmGroupName==null && other.getVmGroupName()==null) || 
             (this.vmGroupName!=null &&
              this.vmGroupName.equals(other.getVmGroupName()))) &&
            ((this.affineHostGroupName==null && other.getAffineHostGroupName()==null) || 
             (this.affineHostGroupName!=null &&
              this.affineHostGroupName.equals(other.getAffineHostGroupName()))) &&
            ((this.antiAffineHostGroupName==null && other.getAntiAffineHostGroupName()==null) || 
             (this.antiAffineHostGroupName!=null &&
              this.antiAffineHostGroupName.equals(other.getAntiAffineHostGroupName())));
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
        if (getVmGroupName() != null) {
            _hashCode += getVmGroupName().hashCode();
        }
        if (getAffineHostGroupName() != null) {
            _hashCode += getAffineHostGroupName().hashCode();
        }
        if (getAntiAffineHostGroupName() != null) {
            _hashCode += getAntiAffineHostGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterVmHostRuleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterVmHostRuleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affineHostGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "affineHostGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiAffineHostGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "antiAffineHostGroupName"));
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
