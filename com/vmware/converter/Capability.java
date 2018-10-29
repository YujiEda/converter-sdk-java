/**
 * Capability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class Capability  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean provisioningSupported;

    private boolean multiHostSupported;

    private boolean userShellAccessSupported;

    private com.vmware.converter.EVCMode[] supportedEVCMode;

    private java.lang.Boolean networkBackupAndRestoreSupported;

    public Capability() {
    }

    public Capability(
           boolean provisioningSupported,
           boolean multiHostSupported,
           boolean userShellAccessSupported,
           com.vmware.converter.EVCMode[] supportedEVCMode,
           java.lang.Boolean networkBackupAndRestoreSupported) {
        this.provisioningSupported = provisioningSupported;
        this.multiHostSupported = multiHostSupported;
        this.userShellAccessSupported = userShellAccessSupported;
        this.supportedEVCMode = supportedEVCMode;
        this.networkBackupAndRestoreSupported = networkBackupAndRestoreSupported;
    }


    /**
     * Gets the provisioningSupported value for this Capability.
     * 
     * @return provisioningSupported
     */
    public boolean isProvisioningSupported() {
        return provisioningSupported;
    }


    /**
     * Sets the provisioningSupported value for this Capability.
     * 
     * @param provisioningSupported
     */
    public void setProvisioningSupported(boolean provisioningSupported) {
        this.provisioningSupported = provisioningSupported;
    }


    /**
     * Gets the multiHostSupported value for this Capability.
     * 
     * @return multiHostSupported
     */
    public boolean isMultiHostSupported() {
        return multiHostSupported;
    }


    /**
     * Sets the multiHostSupported value for this Capability.
     * 
     * @param multiHostSupported
     */
    public void setMultiHostSupported(boolean multiHostSupported) {
        this.multiHostSupported = multiHostSupported;
    }


    /**
     * Gets the userShellAccessSupported value for this Capability.
     * 
     * @return userShellAccessSupported
     */
    public boolean isUserShellAccessSupported() {
        return userShellAccessSupported;
    }


    /**
     * Sets the userShellAccessSupported value for this Capability.
     * 
     * @param userShellAccessSupported
     */
    public void setUserShellAccessSupported(boolean userShellAccessSupported) {
        this.userShellAccessSupported = userShellAccessSupported;
    }


    /**
     * Gets the supportedEVCMode value for this Capability.
     * 
     * @return supportedEVCMode
     */
    public com.vmware.converter.EVCMode[] getSupportedEVCMode() {
        return supportedEVCMode;
    }


    /**
     * Sets the supportedEVCMode value for this Capability.
     * 
     * @param supportedEVCMode
     */
    public void setSupportedEVCMode(com.vmware.converter.EVCMode[] supportedEVCMode) {
        this.supportedEVCMode = supportedEVCMode;
    }

    public com.vmware.converter.EVCMode getSupportedEVCMode(int i) {
        return this.supportedEVCMode[i];
    }

    public void setSupportedEVCMode(int i, com.vmware.converter.EVCMode _value) {
        this.supportedEVCMode[i] = _value;
    }


    /**
     * Gets the networkBackupAndRestoreSupported value for this Capability.
     * 
     * @return networkBackupAndRestoreSupported
     */
    public java.lang.Boolean getNetworkBackupAndRestoreSupported() {
        return networkBackupAndRestoreSupported;
    }


    /**
     * Sets the networkBackupAndRestoreSupported value for this Capability.
     * 
     * @param networkBackupAndRestoreSupported
     */
    public void setNetworkBackupAndRestoreSupported(java.lang.Boolean networkBackupAndRestoreSupported) {
        this.networkBackupAndRestoreSupported = networkBackupAndRestoreSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Capability)) return false;
        Capability other = (Capability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.provisioningSupported == other.isProvisioningSupported() &&
            this.multiHostSupported == other.isMultiHostSupported() &&
            this.userShellAccessSupported == other.isUserShellAccessSupported() &&
            ((this.supportedEVCMode==null && other.getSupportedEVCMode()==null) || 
             (this.supportedEVCMode!=null &&
              java.util.Arrays.equals(this.supportedEVCMode, other.getSupportedEVCMode()))) &&
            ((this.networkBackupAndRestoreSupported==null && other.getNetworkBackupAndRestoreSupported()==null) || 
             (this.networkBackupAndRestoreSupported!=null &&
              this.networkBackupAndRestoreSupported.equals(other.getNetworkBackupAndRestoreSupported())));
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
        _hashCode += (isProvisioningSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMultiHostSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUserShellAccessSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSupportedEVCMode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedEVCMode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedEVCMode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkBackupAndRestoreSupported() != null) {
            _hashCode += getNetworkBackupAndRestoreSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Capability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Capability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "provisioningSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiHostSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multiHostSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userShellAccessSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userShellAccessSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedEVCMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedEVCMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkBackupAndRestoreSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkBackupAndRestoreSupported"));
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
