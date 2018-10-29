/**
 * ClusterVmComponentProtectionSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterVmComponentProtectionSettings  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vmStorageProtectionForAPD;

    private java.lang.Boolean enableAPDTimeoutForHosts;

    private java.lang.Integer vmTerminateDelayForAPDSec;

    private java.lang.String vmReactionOnAPDCleared;

    private java.lang.String vmStorageProtectionForPDL;

    public ClusterVmComponentProtectionSettings() {
    }

    public ClusterVmComponentProtectionSettings(
           java.lang.String vmStorageProtectionForAPD,
           java.lang.Boolean enableAPDTimeoutForHosts,
           java.lang.Integer vmTerminateDelayForAPDSec,
           java.lang.String vmReactionOnAPDCleared,
           java.lang.String vmStorageProtectionForPDL) {
        this.vmStorageProtectionForAPD = vmStorageProtectionForAPD;
        this.enableAPDTimeoutForHosts = enableAPDTimeoutForHosts;
        this.vmTerminateDelayForAPDSec = vmTerminateDelayForAPDSec;
        this.vmReactionOnAPDCleared = vmReactionOnAPDCleared;
        this.vmStorageProtectionForPDL = vmStorageProtectionForPDL;
    }


    /**
     * Gets the vmStorageProtectionForAPD value for this ClusterVmComponentProtectionSettings.
     * 
     * @return vmStorageProtectionForAPD
     */
    public java.lang.String getVmStorageProtectionForAPD() {
        return vmStorageProtectionForAPD;
    }


    /**
     * Sets the vmStorageProtectionForAPD value for this ClusterVmComponentProtectionSettings.
     * 
     * @param vmStorageProtectionForAPD
     */
    public void setVmStorageProtectionForAPD(java.lang.String vmStorageProtectionForAPD) {
        this.vmStorageProtectionForAPD = vmStorageProtectionForAPD;
    }


    /**
     * Gets the enableAPDTimeoutForHosts value for this ClusterVmComponentProtectionSettings.
     * 
     * @return enableAPDTimeoutForHosts
     */
    public java.lang.Boolean getEnableAPDTimeoutForHosts() {
        return enableAPDTimeoutForHosts;
    }


    /**
     * Sets the enableAPDTimeoutForHosts value for this ClusterVmComponentProtectionSettings.
     * 
     * @param enableAPDTimeoutForHosts
     */
    public void setEnableAPDTimeoutForHosts(java.lang.Boolean enableAPDTimeoutForHosts) {
        this.enableAPDTimeoutForHosts = enableAPDTimeoutForHosts;
    }


    /**
     * Gets the vmTerminateDelayForAPDSec value for this ClusterVmComponentProtectionSettings.
     * 
     * @return vmTerminateDelayForAPDSec
     */
    public java.lang.Integer getVmTerminateDelayForAPDSec() {
        return vmTerminateDelayForAPDSec;
    }


    /**
     * Sets the vmTerminateDelayForAPDSec value for this ClusterVmComponentProtectionSettings.
     * 
     * @param vmTerminateDelayForAPDSec
     */
    public void setVmTerminateDelayForAPDSec(java.lang.Integer vmTerminateDelayForAPDSec) {
        this.vmTerminateDelayForAPDSec = vmTerminateDelayForAPDSec;
    }


    /**
     * Gets the vmReactionOnAPDCleared value for this ClusterVmComponentProtectionSettings.
     * 
     * @return vmReactionOnAPDCleared
     */
    public java.lang.String getVmReactionOnAPDCleared() {
        return vmReactionOnAPDCleared;
    }


    /**
     * Sets the vmReactionOnAPDCleared value for this ClusterVmComponentProtectionSettings.
     * 
     * @param vmReactionOnAPDCleared
     */
    public void setVmReactionOnAPDCleared(java.lang.String vmReactionOnAPDCleared) {
        this.vmReactionOnAPDCleared = vmReactionOnAPDCleared;
    }


    /**
     * Gets the vmStorageProtectionForPDL value for this ClusterVmComponentProtectionSettings.
     * 
     * @return vmStorageProtectionForPDL
     */
    public java.lang.String getVmStorageProtectionForPDL() {
        return vmStorageProtectionForPDL;
    }


    /**
     * Sets the vmStorageProtectionForPDL value for this ClusterVmComponentProtectionSettings.
     * 
     * @param vmStorageProtectionForPDL
     */
    public void setVmStorageProtectionForPDL(java.lang.String vmStorageProtectionForPDL) {
        this.vmStorageProtectionForPDL = vmStorageProtectionForPDL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterVmComponentProtectionSettings)) return false;
        ClusterVmComponentProtectionSettings other = (ClusterVmComponentProtectionSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmStorageProtectionForAPD==null && other.getVmStorageProtectionForAPD()==null) || 
             (this.vmStorageProtectionForAPD!=null &&
              this.vmStorageProtectionForAPD.equals(other.getVmStorageProtectionForAPD()))) &&
            ((this.enableAPDTimeoutForHosts==null && other.getEnableAPDTimeoutForHosts()==null) || 
             (this.enableAPDTimeoutForHosts!=null &&
              this.enableAPDTimeoutForHosts.equals(other.getEnableAPDTimeoutForHosts()))) &&
            ((this.vmTerminateDelayForAPDSec==null && other.getVmTerminateDelayForAPDSec()==null) || 
             (this.vmTerminateDelayForAPDSec!=null &&
              this.vmTerminateDelayForAPDSec.equals(other.getVmTerminateDelayForAPDSec()))) &&
            ((this.vmReactionOnAPDCleared==null && other.getVmReactionOnAPDCleared()==null) || 
             (this.vmReactionOnAPDCleared!=null &&
              this.vmReactionOnAPDCleared.equals(other.getVmReactionOnAPDCleared()))) &&
            ((this.vmStorageProtectionForPDL==null && other.getVmStorageProtectionForPDL()==null) || 
             (this.vmStorageProtectionForPDL!=null &&
              this.vmStorageProtectionForPDL.equals(other.getVmStorageProtectionForPDL())));
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
        if (getVmStorageProtectionForAPD() != null) {
            _hashCode += getVmStorageProtectionForAPD().hashCode();
        }
        if (getEnableAPDTimeoutForHosts() != null) {
            _hashCode += getEnableAPDTimeoutForHosts().hashCode();
        }
        if (getVmTerminateDelayForAPDSec() != null) {
            _hashCode += getVmTerminateDelayForAPDSec().hashCode();
        }
        if (getVmReactionOnAPDCleared() != null) {
            _hashCode += getVmReactionOnAPDCleared().hashCode();
        }
        if (getVmStorageProtectionForPDL() != null) {
            _hashCode += getVmStorageProtectionForPDL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterVmComponentProtectionSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterVmComponentProtectionSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmStorageProtectionForAPD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmStorageProtectionForAPD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAPDTimeoutForHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enableAPDTimeoutForHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmTerminateDelayForAPDSec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmTerminateDelayForAPDSec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmReactionOnAPDCleared");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmReactionOnAPDCleared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmStorageProtectionForPDL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmStorageProtectionForPDL"));
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
