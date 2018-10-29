/**
 * PhysicalNic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PhysicalNic  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String device;

    private java.lang.String pci;

    private java.lang.String driver;

    private com.vmware.converter.PhysicalNicLinkInfo linkSpeed;

    private com.vmware.converter.PhysicalNicLinkInfo[] validLinkSpecification;

    private com.vmware.converter.PhysicalNicSpec spec;

    private boolean wakeOnLanSupported;

    private java.lang.String mac;

    private com.vmware.converter.FcoeConfig fcoeConfiguration;

    private java.lang.Boolean vmDirectPathGen2Supported;

    private java.lang.String vmDirectPathGen2SupportedMode;

    private java.lang.Boolean resourcePoolSchedulerAllowed;

    private java.lang.String[] resourcePoolSchedulerDisallowedReason;

    private java.lang.Boolean autoNegotiateSupported;

    public PhysicalNic() {
    }

    public PhysicalNic(
           java.lang.String key,
           java.lang.String device,
           java.lang.String pci,
           java.lang.String driver,
           com.vmware.converter.PhysicalNicLinkInfo linkSpeed,
           com.vmware.converter.PhysicalNicLinkInfo[] validLinkSpecification,
           com.vmware.converter.PhysicalNicSpec spec,
           boolean wakeOnLanSupported,
           java.lang.String mac,
           com.vmware.converter.FcoeConfig fcoeConfiguration,
           java.lang.Boolean vmDirectPathGen2Supported,
           java.lang.String vmDirectPathGen2SupportedMode,
           java.lang.Boolean resourcePoolSchedulerAllowed,
           java.lang.String[] resourcePoolSchedulerDisallowedReason,
           java.lang.Boolean autoNegotiateSupported) {
        this.key = key;
        this.device = device;
        this.pci = pci;
        this.driver = driver;
        this.linkSpeed = linkSpeed;
        this.validLinkSpecification = validLinkSpecification;
        this.spec = spec;
        this.wakeOnLanSupported = wakeOnLanSupported;
        this.mac = mac;
        this.fcoeConfiguration = fcoeConfiguration;
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
        this.vmDirectPathGen2SupportedMode = vmDirectPathGen2SupportedMode;
        this.resourcePoolSchedulerAllowed = resourcePoolSchedulerAllowed;
        this.resourcePoolSchedulerDisallowedReason = resourcePoolSchedulerDisallowedReason;
        this.autoNegotiateSupported = autoNegotiateSupported;
    }


    /**
     * Gets the key value for this PhysicalNic.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this PhysicalNic.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the device value for this PhysicalNic.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this PhysicalNic.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the pci value for this PhysicalNic.
     * 
     * @return pci
     */
    public java.lang.String getPci() {
        return pci;
    }


    /**
     * Sets the pci value for this PhysicalNic.
     * 
     * @param pci
     */
    public void setPci(java.lang.String pci) {
        this.pci = pci;
    }


    /**
     * Gets the driver value for this PhysicalNic.
     * 
     * @return driver
     */
    public java.lang.String getDriver() {
        return driver;
    }


    /**
     * Sets the driver value for this PhysicalNic.
     * 
     * @param driver
     */
    public void setDriver(java.lang.String driver) {
        this.driver = driver;
    }


    /**
     * Gets the linkSpeed value for this PhysicalNic.
     * 
     * @return linkSpeed
     */
    public com.vmware.converter.PhysicalNicLinkInfo getLinkSpeed() {
        return linkSpeed;
    }


    /**
     * Sets the linkSpeed value for this PhysicalNic.
     * 
     * @param linkSpeed
     */
    public void setLinkSpeed(com.vmware.converter.PhysicalNicLinkInfo linkSpeed) {
        this.linkSpeed = linkSpeed;
    }


    /**
     * Gets the validLinkSpecification value for this PhysicalNic.
     * 
     * @return validLinkSpecification
     */
    public com.vmware.converter.PhysicalNicLinkInfo[] getValidLinkSpecification() {
        return validLinkSpecification;
    }


    /**
     * Sets the validLinkSpecification value for this PhysicalNic.
     * 
     * @param validLinkSpecification
     */
    public void setValidLinkSpecification(com.vmware.converter.PhysicalNicLinkInfo[] validLinkSpecification) {
        this.validLinkSpecification = validLinkSpecification;
    }

    public com.vmware.converter.PhysicalNicLinkInfo getValidLinkSpecification(int i) {
        return this.validLinkSpecification[i];
    }

    public void setValidLinkSpecification(int i, com.vmware.converter.PhysicalNicLinkInfo _value) {
        this.validLinkSpecification[i] = _value;
    }


    /**
     * Gets the spec value for this PhysicalNic.
     * 
     * @return spec
     */
    public com.vmware.converter.PhysicalNicSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this PhysicalNic.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.converter.PhysicalNicSpec spec) {
        this.spec = spec;
    }


    /**
     * Gets the wakeOnLanSupported value for this PhysicalNic.
     * 
     * @return wakeOnLanSupported
     */
    public boolean isWakeOnLanSupported() {
        return wakeOnLanSupported;
    }


    /**
     * Sets the wakeOnLanSupported value for this PhysicalNic.
     * 
     * @param wakeOnLanSupported
     */
    public void setWakeOnLanSupported(boolean wakeOnLanSupported) {
        this.wakeOnLanSupported = wakeOnLanSupported;
    }


    /**
     * Gets the mac value for this PhysicalNic.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this PhysicalNic.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the fcoeConfiguration value for this PhysicalNic.
     * 
     * @return fcoeConfiguration
     */
    public com.vmware.converter.FcoeConfig getFcoeConfiguration() {
        return fcoeConfiguration;
    }


    /**
     * Sets the fcoeConfiguration value for this PhysicalNic.
     * 
     * @param fcoeConfiguration
     */
    public void setFcoeConfiguration(com.vmware.converter.FcoeConfig fcoeConfiguration) {
        this.fcoeConfiguration = fcoeConfiguration;
    }


    /**
     * Gets the vmDirectPathGen2Supported value for this PhysicalNic.
     * 
     * @return vmDirectPathGen2Supported
     */
    public java.lang.Boolean getVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }


    /**
     * Sets the vmDirectPathGen2Supported value for this PhysicalNic.
     * 
     * @param vmDirectPathGen2Supported
     */
    public void setVmDirectPathGen2Supported(java.lang.Boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }


    /**
     * Gets the vmDirectPathGen2SupportedMode value for this PhysicalNic.
     * 
     * @return vmDirectPathGen2SupportedMode
     */
    public java.lang.String getVmDirectPathGen2SupportedMode() {
        return vmDirectPathGen2SupportedMode;
    }


    /**
     * Sets the vmDirectPathGen2SupportedMode value for this PhysicalNic.
     * 
     * @param vmDirectPathGen2SupportedMode
     */
    public void setVmDirectPathGen2SupportedMode(java.lang.String vmDirectPathGen2SupportedMode) {
        this.vmDirectPathGen2SupportedMode = vmDirectPathGen2SupportedMode;
    }


    /**
     * Gets the resourcePoolSchedulerAllowed value for this PhysicalNic.
     * 
     * @return resourcePoolSchedulerAllowed
     */
    public java.lang.Boolean getResourcePoolSchedulerAllowed() {
        return resourcePoolSchedulerAllowed;
    }


    /**
     * Sets the resourcePoolSchedulerAllowed value for this PhysicalNic.
     * 
     * @param resourcePoolSchedulerAllowed
     */
    public void setResourcePoolSchedulerAllowed(java.lang.Boolean resourcePoolSchedulerAllowed) {
        this.resourcePoolSchedulerAllowed = resourcePoolSchedulerAllowed;
    }


    /**
     * Gets the resourcePoolSchedulerDisallowedReason value for this PhysicalNic.
     * 
     * @return resourcePoolSchedulerDisallowedReason
     */
    public java.lang.String[] getResourcePoolSchedulerDisallowedReason() {
        return resourcePoolSchedulerDisallowedReason;
    }


    /**
     * Sets the resourcePoolSchedulerDisallowedReason value for this PhysicalNic.
     * 
     * @param resourcePoolSchedulerDisallowedReason
     */
    public void setResourcePoolSchedulerDisallowedReason(java.lang.String[] resourcePoolSchedulerDisallowedReason) {
        this.resourcePoolSchedulerDisallowedReason = resourcePoolSchedulerDisallowedReason;
    }

    public java.lang.String getResourcePoolSchedulerDisallowedReason(int i) {
        return this.resourcePoolSchedulerDisallowedReason[i];
    }

    public void setResourcePoolSchedulerDisallowedReason(int i, java.lang.String _value) {
        this.resourcePoolSchedulerDisallowedReason[i] = _value;
    }


    /**
     * Gets the autoNegotiateSupported value for this PhysicalNic.
     * 
     * @return autoNegotiateSupported
     */
    public java.lang.Boolean getAutoNegotiateSupported() {
        return autoNegotiateSupported;
    }


    /**
     * Sets the autoNegotiateSupported value for this PhysicalNic.
     * 
     * @param autoNegotiateSupported
     */
    public void setAutoNegotiateSupported(java.lang.Boolean autoNegotiateSupported) {
        this.autoNegotiateSupported = autoNegotiateSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhysicalNic)) return false;
        PhysicalNic other = (PhysicalNic) obj;
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
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.pci==null && other.getPci()==null) || 
             (this.pci!=null &&
              this.pci.equals(other.getPci()))) &&
            ((this.driver==null && other.getDriver()==null) || 
             (this.driver!=null &&
              this.driver.equals(other.getDriver()))) &&
            ((this.linkSpeed==null && other.getLinkSpeed()==null) || 
             (this.linkSpeed!=null &&
              this.linkSpeed.equals(other.getLinkSpeed()))) &&
            ((this.validLinkSpecification==null && other.getValidLinkSpecification()==null) || 
             (this.validLinkSpecification!=null &&
              java.util.Arrays.equals(this.validLinkSpecification, other.getValidLinkSpecification()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec()))) &&
            this.wakeOnLanSupported == other.isWakeOnLanSupported() &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this.fcoeConfiguration==null && other.getFcoeConfiguration()==null) || 
             (this.fcoeConfiguration!=null &&
              this.fcoeConfiguration.equals(other.getFcoeConfiguration()))) &&
            ((this.vmDirectPathGen2Supported==null && other.getVmDirectPathGen2Supported()==null) || 
             (this.vmDirectPathGen2Supported!=null &&
              this.vmDirectPathGen2Supported.equals(other.getVmDirectPathGen2Supported()))) &&
            ((this.vmDirectPathGen2SupportedMode==null && other.getVmDirectPathGen2SupportedMode()==null) || 
             (this.vmDirectPathGen2SupportedMode!=null &&
              this.vmDirectPathGen2SupportedMode.equals(other.getVmDirectPathGen2SupportedMode()))) &&
            ((this.resourcePoolSchedulerAllowed==null && other.getResourcePoolSchedulerAllowed()==null) || 
             (this.resourcePoolSchedulerAllowed!=null &&
              this.resourcePoolSchedulerAllowed.equals(other.getResourcePoolSchedulerAllowed()))) &&
            ((this.resourcePoolSchedulerDisallowedReason==null && other.getResourcePoolSchedulerDisallowedReason()==null) || 
             (this.resourcePoolSchedulerDisallowedReason!=null &&
              java.util.Arrays.equals(this.resourcePoolSchedulerDisallowedReason, other.getResourcePoolSchedulerDisallowedReason()))) &&
            ((this.autoNegotiateSupported==null && other.getAutoNegotiateSupported()==null) || 
             (this.autoNegotiateSupported!=null &&
              this.autoNegotiateSupported.equals(other.getAutoNegotiateSupported())));
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
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getPci() != null) {
            _hashCode += getPci().hashCode();
        }
        if (getDriver() != null) {
            _hashCode += getDriver().hashCode();
        }
        if (getLinkSpeed() != null) {
            _hashCode += getLinkSpeed().hashCode();
        }
        if (getValidLinkSpecification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidLinkSpecification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidLinkSpecification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        _hashCode += (isWakeOnLanSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (getFcoeConfiguration() != null) {
            _hashCode += getFcoeConfiguration().hashCode();
        }
        if (getVmDirectPathGen2Supported() != null) {
            _hashCode += getVmDirectPathGen2Supported().hashCode();
        }
        if (getVmDirectPathGen2SupportedMode() != null) {
            _hashCode += getVmDirectPathGen2SupportedMode().hashCode();
        }
        if (getResourcePoolSchedulerAllowed() != null) {
            _hashCode += getResourcePoolSchedulerAllowed().hashCode();
        }
        if (getResourcePoolSchedulerDisallowedReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourcePoolSchedulerDisallowedReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourcePoolSchedulerDisallowedReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoNegotiateSupported() != null) {
            _hashCode += getAutoNegotiateSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhysicalNic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pci");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pci"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "driver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "linkSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicLinkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validLinkSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "validLinkSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicLinkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wakeOnLanSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wakeOnLanSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fcoeConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fcoeConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2Supported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2Supported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2SupportedMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2SupportedMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePoolSchedulerAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourcePoolSchedulerAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePoolSchedulerDisallowedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourcePoolSchedulerDisallowedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoNegotiateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoNegotiateSupported"));
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
