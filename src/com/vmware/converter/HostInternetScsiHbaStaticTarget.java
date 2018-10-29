/**
 * HostInternetScsiHbaStaticTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostInternetScsiHbaStaticTarget  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.Integer port;

    private java.lang.String iScsiName;

    private java.lang.String discoveryMethod;

    private com.vmware.converter.HostInternetScsiHbaAuthenticationProperties authenticationProperties;

    private com.vmware.converter.HostInternetScsiHbaDigestProperties digestProperties;

    private com.vmware.converter.OptionDef[] supportedAdvancedOptions;

    private com.vmware.converter.HostInternetScsiHbaParamValue[] advancedOptions;

    private java.lang.String parent;

    public HostInternetScsiHbaStaticTarget() {
    }

    public HostInternetScsiHbaStaticTarget(
           java.lang.String address,
           java.lang.Integer port,
           java.lang.String iScsiName,
           java.lang.String discoveryMethod,
           com.vmware.converter.HostInternetScsiHbaAuthenticationProperties authenticationProperties,
           com.vmware.converter.HostInternetScsiHbaDigestProperties digestProperties,
           com.vmware.converter.OptionDef[] supportedAdvancedOptions,
           com.vmware.converter.HostInternetScsiHbaParamValue[] advancedOptions,
           java.lang.String parent) {
        this.address = address;
        this.port = port;
        this.iScsiName = iScsiName;
        this.discoveryMethod = discoveryMethod;
        this.authenticationProperties = authenticationProperties;
        this.digestProperties = digestProperties;
        this.supportedAdvancedOptions = supportedAdvancedOptions;
        this.advancedOptions = advancedOptions;
        this.parent = parent;
    }


    /**
     * Gets the address value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the port value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the iScsiName value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return iScsiName
     */
    public java.lang.String getIScsiName() {
        return iScsiName;
    }


    /**
     * Sets the iScsiName value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param iScsiName
     */
    public void setIScsiName(java.lang.String iScsiName) {
        this.iScsiName = iScsiName;
    }


    /**
     * Gets the discoveryMethod value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return discoveryMethod
     */
    public java.lang.String getDiscoveryMethod() {
        return discoveryMethod;
    }


    /**
     * Sets the discoveryMethod value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param discoveryMethod
     */
    public void setDiscoveryMethod(java.lang.String discoveryMethod) {
        this.discoveryMethod = discoveryMethod;
    }


    /**
     * Gets the authenticationProperties value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return authenticationProperties
     */
    public com.vmware.converter.HostInternetScsiHbaAuthenticationProperties getAuthenticationProperties() {
        return authenticationProperties;
    }


    /**
     * Sets the authenticationProperties value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param authenticationProperties
     */
    public void setAuthenticationProperties(com.vmware.converter.HostInternetScsiHbaAuthenticationProperties authenticationProperties) {
        this.authenticationProperties = authenticationProperties;
    }


    /**
     * Gets the digestProperties value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return digestProperties
     */
    public com.vmware.converter.HostInternetScsiHbaDigestProperties getDigestProperties() {
        return digestProperties;
    }


    /**
     * Sets the digestProperties value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param digestProperties
     */
    public void setDigestProperties(com.vmware.converter.HostInternetScsiHbaDigestProperties digestProperties) {
        this.digestProperties = digestProperties;
    }


    /**
     * Gets the supportedAdvancedOptions value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return supportedAdvancedOptions
     */
    public com.vmware.converter.OptionDef[] getSupportedAdvancedOptions() {
        return supportedAdvancedOptions;
    }


    /**
     * Sets the supportedAdvancedOptions value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param supportedAdvancedOptions
     */
    public void setSupportedAdvancedOptions(com.vmware.converter.OptionDef[] supportedAdvancedOptions) {
        this.supportedAdvancedOptions = supportedAdvancedOptions;
    }

    public com.vmware.converter.OptionDef getSupportedAdvancedOptions(int i) {
        return this.supportedAdvancedOptions[i];
    }

    public void setSupportedAdvancedOptions(int i, com.vmware.converter.OptionDef _value) {
        this.supportedAdvancedOptions[i] = _value;
    }


    /**
     * Gets the advancedOptions value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return advancedOptions
     */
    public com.vmware.converter.HostInternetScsiHbaParamValue[] getAdvancedOptions() {
        return advancedOptions;
    }


    /**
     * Sets the advancedOptions value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param advancedOptions
     */
    public void setAdvancedOptions(com.vmware.converter.HostInternetScsiHbaParamValue[] advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    public com.vmware.converter.HostInternetScsiHbaParamValue getAdvancedOptions(int i) {
        return this.advancedOptions[i];
    }

    public void setAdvancedOptions(int i, com.vmware.converter.HostInternetScsiHbaParamValue _value) {
        this.advancedOptions[i] = _value;
    }


    /**
     * Gets the parent value for this HostInternetScsiHbaStaticTarget.
     * 
     * @return parent
     */
    public java.lang.String getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this HostInternetScsiHbaStaticTarget.
     * 
     * @param parent
     */
    public void setParent(java.lang.String parent) {
        this.parent = parent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaStaticTarget)) return false;
        HostInternetScsiHbaStaticTarget other = (HostInternetScsiHbaStaticTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.iScsiName==null && other.getIScsiName()==null) || 
             (this.iScsiName!=null &&
              this.iScsiName.equals(other.getIScsiName()))) &&
            ((this.discoveryMethod==null && other.getDiscoveryMethod()==null) || 
             (this.discoveryMethod!=null &&
              this.discoveryMethod.equals(other.getDiscoveryMethod()))) &&
            ((this.authenticationProperties==null && other.getAuthenticationProperties()==null) || 
             (this.authenticationProperties!=null &&
              this.authenticationProperties.equals(other.getAuthenticationProperties()))) &&
            ((this.digestProperties==null && other.getDigestProperties()==null) || 
             (this.digestProperties!=null &&
              this.digestProperties.equals(other.getDigestProperties()))) &&
            ((this.supportedAdvancedOptions==null && other.getSupportedAdvancedOptions()==null) || 
             (this.supportedAdvancedOptions!=null &&
              java.util.Arrays.equals(this.supportedAdvancedOptions, other.getSupportedAdvancedOptions()))) &&
            ((this.advancedOptions==null && other.getAdvancedOptions()==null) || 
             (this.advancedOptions!=null &&
              java.util.Arrays.equals(this.advancedOptions, other.getAdvancedOptions()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getIScsiName() != null) {
            _hashCode += getIScsiName().hashCode();
        }
        if (getDiscoveryMethod() != null) {
            _hashCode += getDiscoveryMethod().hashCode();
        }
        if (getAuthenticationProperties() != null) {
            _hashCode += getAuthenticationProperties().hashCode();
        }
        if (getDigestProperties() != null) {
            _hashCode += getDigestProperties().hashCode();
        }
        if (getSupportedAdvancedOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedAdvancedOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedAdvancedOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdvancedOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdvancedOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdvancedOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaStaticTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaStaticTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IScsiName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iScsiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discoveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "discoveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "authenticationProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaAuthenticationProperties"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "digestProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaDigestProperties"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedAdvancedOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedAdvancedOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionDef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "advancedOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaParamValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parent"));
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
