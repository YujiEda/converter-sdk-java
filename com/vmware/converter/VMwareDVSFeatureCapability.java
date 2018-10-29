/**
 * VMwareDVSFeatureCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSFeatureCapability  extends com.vmware.converter.DVSFeatureCapability  implements java.io.Serializable {
    private java.lang.Boolean vspanSupported;

    private java.lang.Boolean lldpSupported;

    private java.lang.Boolean ipfixSupported;

    private com.vmware.converter.VMwareDvsIpfixCapability ipfixCapability;

    private java.lang.Boolean multicastSnoopingSupported;

    private com.vmware.converter.VMwareDVSVspanCapability vspanCapability;

    private com.vmware.converter.VMwareDvsLacpCapability lacpCapability;

    public VMwareDVSFeatureCapability() {
    }

    public VMwareDVSFeatureCapability(
           boolean networkResourceManagementSupported,
           boolean vmDirectPathGen2Supported,
           java.lang.String[] nicTeamingPolicy,
           java.lang.Integer networkResourcePoolHighShareValue,
           com.vmware.converter.DVSNetworkResourceManagementCapability networkResourceManagementCapability,
           com.vmware.converter.DVSHealthCheckCapability healthCheckCapability,
           com.vmware.converter.DVSRollbackCapability rollbackCapability,
           com.vmware.converter.DVSBackupRestoreCapability backupRestoreCapability,
           java.lang.Boolean networkFilterSupported,
           java.lang.Boolean vspanSupported,
           java.lang.Boolean lldpSupported,
           java.lang.Boolean ipfixSupported,
           com.vmware.converter.VMwareDvsIpfixCapability ipfixCapability,
           java.lang.Boolean multicastSnoopingSupported,
           com.vmware.converter.VMwareDVSVspanCapability vspanCapability,
           com.vmware.converter.VMwareDvsLacpCapability lacpCapability) {
        super(
            networkResourceManagementSupported,
            vmDirectPathGen2Supported,
            nicTeamingPolicy,
            networkResourcePoolHighShareValue,
            networkResourceManagementCapability,
            healthCheckCapability,
            rollbackCapability,
            backupRestoreCapability,
            networkFilterSupported);
        this.vspanSupported = vspanSupported;
        this.lldpSupported = lldpSupported;
        this.ipfixSupported = ipfixSupported;
        this.ipfixCapability = ipfixCapability;
        this.multicastSnoopingSupported = multicastSnoopingSupported;
        this.vspanCapability = vspanCapability;
        this.lacpCapability = lacpCapability;
    }


    /**
     * Gets the vspanSupported value for this VMwareDVSFeatureCapability.
     * 
     * @return vspanSupported
     */
    public java.lang.Boolean getVspanSupported() {
        return vspanSupported;
    }


    /**
     * Sets the vspanSupported value for this VMwareDVSFeatureCapability.
     * 
     * @param vspanSupported
     */
    public void setVspanSupported(java.lang.Boolean vspanSupported) {
        this.vspanSupported = vspanSupported;
    }


    /**
     * Gets the lldpSupported value for this VMwareDVSFeatureCapability.
     * 
     * @return lldpSupported
     */
    public java.lang.Boolean getLldpSupported() {
        return lldpSupported;
    }


    /**
     * Sets the lldpSupported value for this VMwareDVSFeatureCapability.
     * 
     * @param lldpSupported
     */
    public void setLldpSupported(java.lang.Boolean lldpSupported) {
        this.lldpSupported = lldpSupported;
    }


    /**
     * Gets the ipfixSupported value for this VMwareDVSFeatureCapability.
     * 
     * @return ipfixSupported
     */
    public java.lang.Boolean getIpfixSupported() {
        return ipfixSupported;
    }


    /**
     * Sets the ipfixSupported value for this VMwareDVSFeatureCapability.
     * 
     * @param ipfixSupported
     */
    public void setIpfixSupported(java.lang.Boolean ipfixSupported) {
        this.ipfixSupported = ipfixSupported;
    }


    /**
     * Gets the ipfixCapability value for this VMwareDVSFeatureCapability.
     * 
     * @return ipfixCapability
     */
    public com.vmware.converter.VMwareDvsIpfixCapability getIpfixCapability() {
        return ipfixCapability;
    }


    /**
     * Sets the ipfixCapability value for this VMwareDVSFeatureCapability.
     * 
     * @param ipfixCapability
     */
    public void setIpfixCapability(com.vmware.converter.VMwareDvsIpfixCapability ipfixCapability) {
        this.ipfixCapability = ipfixCapability;
    }


    /**
     * Gets the multicastSnoopingSupported value for this VMwareDVSFeatureCapability.
     * 
     * @return multicastSnoopingSupported
     */
    public java.lang.Boolean getMulticastSnoopingSupported() {
        return multicastSnoopingSupported;
    }


    /**
     * Sets the multicastSnoopingSupported value for this VMwareDVSFeatureCapability.
     * 
     * @param multicastSnoopingSupported
     */
    public void setMulticastSnoopingSupported(java.lang.Boolean multicastSnoopingSupported) {
        this.multicastSnoopingSupported = multicastSnoopingSupported;
    }


    /**
     * Gets the vspanCapability value for this VMwareDVSFeatureCapability.
     * 
     * @return vspanCapability
     */
    public com.vmware.converter.VMwareDVSVspanCapability getVspanCapability() {
        return vspanCapability;
    }


    /**
     * Sets the vspanCapability value for this VMwareDVSFeatureCapability.
     * 
     * @param vspanCapability
     */
    public void setVspanCapability(com.vmware.converter.VMwareDVSVspanCapability vspanCapability) {
        this.vspanCapability = vspanCapability;
    }


    /**
     * Gets the lacpCapability value for this VMwareDVSFeatureCapability.
     * 
     * @return lacpCapability
     */
    public com.vmware.converter.VMwareDvsLacpCapability getLacpCapability() {
        return lacpCapability;
    }


    /**
     * Sets the lacpCapability value for this VMwareDVSFeatureCapability.
     * 
     * @param lacpCapability
     */
    public void setLacpCapability(com.vmware.converter.VMwareDvsLacpCapability lacpCapability) {
        this.lacpCapability = lacpCapability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSFeatureCapability)) return false;
        VMwareDVSFeatureCapability other = (VMwareDVSFeatureCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vspanSupported==null && other.getVspanSupported()==null) || 
             (this.vspanSupported!=null &&
              this.vspanSupported.equals(other.getVspanSupported()))) &&
            ((this.lldpSupported==null && other.getLldpSupported()==null) || 
             (this.lldpSupported!=null &&
              this.lldpSupported.equals(other.getLldpSupported()))) &&
            ((this.ipfixSupported==null && other.getIpfixSupported()==null) || 
             (this.ipfixSupported!=null &&
              this.ipfixSupported.equals(other.getIpfixSupported()))) &&
            ((this.ipfixCapability==null && other.getIpfixCapability()==null) || 
             (this.ipfixCapability!=null &&
              this.ipfixCapability.equals(other.getIpfixCapability()))) &&
            ((this.multicastSnoopingSupported==null && other.getMulticastSnoopingSupported()==null) || 
             (this.multicastSnoopingSupported!=null &&
              this.multicastSnoopingSupported.equals(other.getMulticastSnoopingSupported()))) &&
            ((this.vspanCapability==null && other.getVspanCapability()==null) || 
             (this.vspanCapability!=null &&
              this.vspanCapability.equals(other.getVspanCapability()))) &&
            ((this.lacpCapability==null && other.getLacpCapability()==null) || 
             (this.lacpCapability!=null &&
              this.lacpCapability.equals(other.getLacpCapability())));
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
        if (getVspanSupported() != null) {
            _hashCode += getVspanSupported().hashCode();
        }
        if (getLldpSupported() != null) {
            _hashCode += getLldpSupported().hashCode();
        }
        if (getIpfixSupported() != null) {
            _hashCode += getIpfixSupported().hashCode();
        }
        if (getIpfixCapability() != null) {
            _hashCode += getIpfixCapability().hashCode();
        }
        if (getMulticastSnoopingSupported() != null) {
            _hashCode += getMulticastSnoopingSupported().hashCode();
        }
        if (getVspanCapability() != null) {
            _hashCode += getVspanCapability().hashCode();
        }
        if (getLacpCapability() != null) {
            _hashCode += getLacpCapability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareDVSFeatureCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSFeatureCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vspanSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vspanSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lldpSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lldpSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipfixSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipfixSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipfixCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipfixCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsIpfixCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multicastSnoopingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multicastSnoopingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vspanCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vspanCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSVspanCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lacpCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpCapability"));
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
