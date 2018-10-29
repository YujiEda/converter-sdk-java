/**
 * ConverterAgentInternalComputerOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalComputerOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean nfs;

    private java.lang.Boolean readOnlyVolumes;

    private java.lang.Boolean nonPersistentDisks;

    private java.lang.Boolean pnpDriver;

    private java.lang.String mountDir;

    private java.lang.Boolean nameJctsAfterGosDrvLtrs;

    private java.lang.Boolean useCachedIo;

    public ConverterAgentInternalComputerOptions() {
    }

    public ConverterAgentInternalComputerOptions(
           java.lang.Boolean nfs,
           java.lang.Boolean readOnlyVolumes,
           java.lang.Boolean nonPersistentDisks,
           java.lang.Boolean pnpDriver,
           java.lang.String mountDir,
           java.lang.Boolean nameJctsAfterGosDrvLtrs,
           java.lang.Boolean useCachedIo) {
        this.nfs = nfs;
        this.readOnlyVolumes = readOnlyVolumes;
        this.nonPersistentDisks = nonPersistentDisks;
        this.pnpDriver = pnpDriver;
        this.mountDir = mountDir;
        this.nameJctsAfterGosDrvLtrs = nameJctsAfterGosDrvLtrs;
        this.useCachedIo = useCachedIo;
    }


    /**
     * Gets the nfs value for this ConverterAgentInternalComputerOptions.
     * 
     * @return nfs
     */
    public java.lang.Boolean getNfs() {
        return nfs;
    }


    /**
     * Sets the nfs value for this ConverterAgentInternalComputerOptions.
     * 
     * @param nfs
     */
    public void setNfs(java.lang.Boolean nfs) {
        this.nfs = nfs;
    }


    /**
     * Gets the readOnlyVolumes value for this ConverterAgentInternalComputerOptions.
     * 
     * @return readOnlyVolumes
     */
    public java.lang.Boolean getReadOnlyVolumes() {
        return readOnlyVolumes;
    }


    /**
     * Sets the readOnlyVolumes value for this ConverterAgentInternalComputerOptions.
     * 
     * @param readOnlyVolumes
     */
    public void setReadOnlyVolumes(java.lang.Boolean readOnlyVolumes) {
        this.readOnlyVolumes = readOnlyVolumes;
    }


    /**
     * Gets the nonPersistentDisks value for this ConverterAgentInternalComputerOptions.
     * 
     * @return nonPersistentDisks
     */
    public java.lang.Boolean getNonPersistentDisks() {
        return nonPersistentDisks;
    }


    /**
     * Sets the nonPersistentDisks value for this ConverterAgentInternalComputerOptions.
     * 
     * @param nonPersistentDisks
     */
    public void setNonPersistentDisks(java.lang.Boolean nonPersistentDisks) {
        this.nonPersistentDisks = nonPersistentDisks;
    }


    /**
     * Gets the pnpDriver value for this ConverterAgentInternalComputerOptions.
     * 
     * @return pnpDriver
     */
    public java.lang.Boolean getPnpDriver() {
        return pnpDriver;
    }


    /**
     * Sets the pnpDriver value for this ConverterAgentInternalComputerOptions.
     * 
     * @param pnpDriver
     */
    public void setPnpDriver(java.lang.Boolean pnpDriver) {
        this.pnpDriver = pnpDriver;
    }


    /**
     * Gets the mountDir value for this ConverterAgentInternalComputerOptions.
     * 
     * @return mountDir
     */
    public java.lang.String getMountDir() {
        return mountDir;
    }


    /**
     * Sets the mountDir value for this ConverterAgentInternalComputerOptions.
     * 
     * @param mountDir
     */
    public void setMountDir(java.lang.String mountDir) {
        this.mountDir = mountDir;
    }


    /**
     * Gets the nameJctsAfterGosDrvLtrs value for this ConverterAgentInternalComputerOptions.
     * 
     * @return nameJctsAfterGosDrvLtrs
     */
    public java.lang.Boolean getNameJctsAfterGosDrvLtrs() {
        return nameJctsAfterGosDrvLtrs;
    }


    /**
     * Sets the nameJctsAfterGosDrvLtrs value for this ConverterAgentInternalComputerOptions.
     * 
     * @param nameJctsAfterGosDrvLtrs
     */
    public void setNameJctsAfterGosDrvLtrs(java.lang.Boolean nameJctsAfterGosDrvLtrs) {
        this.nameJctsAfterGosDrvLtrs = nameJctsAfterGosDrvLtrs;
    }


    /**
     * Gets the useCachedIo value for this ConverterAgentInternalComputerOptions.
     * 
     * @return useCachedIo
     */
    public java.lang.Boolean getUseCachedIo() {
        return useCachedIo;
    }


    /**
     * Sets the useCachedIo value for this ConverterAgentInternalComputerOptions.
     * 
     * @param useCachedIo
     */
    public void setUseCachedIo(java.lang.Boolean useCachedIo) {
        this.useCachedIo = useCachedIo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalComputerOptions)) return false;
        ConverterAgentInternalComputerOptions other = (ConverterAgentInternalComputerOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nfs==null && other.getNfs()==null) || 
             (this.nfs!=null &&
              this.nfs.equals(other.getNfs()))) &&
            ((this.readOnlyVolumes==null && other.getReadOnlyVolumes()==null) || 
             (this.readOnlyVolumes!=null &&
              this.readOnlyVolumes.equals(other.getReadOnlyVolumes()))) &&
            ((this.nonPersistentDisks==null && other.getNonPersistentDisks()==null) || 
             (this.nonPersistentDisks!=null &&
              this.nonPersistentDisks.equals(other.getNonPersistentDisks()))) &&
            ((this.pnpDriver==null && other.getPnpDriver()==null) || 
             (this.pnpDriver!=null &&
              this.pnpDriver.equals(other.getPnpDriver()))) &&
            ((this.mountDir==null && other.getMountDir()==null) || 
             (this.mountDir!=null &&
              this.mountDir.equals(other.getMountDir()))) &&
            ((this.nameJctsAfterGosDrvLtrs==null && other.getNameJctsAfterGosDrvLtrs()==null) || 
             (this.nameJctsAfterGosDrvLtrs!=null &&
              this.nameJctsAfterGosDrvLtrs.equals(other.getNameJctsAfterGosDrvLtrs()))) &&
            ((this.useCachedIo==null && other.getUseCachedIo()==null) || 
             (this.useCachedIo!=null &&
              this.useCachedIo.equals(other.getUseCachedIo())));
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
        if (getNfs() != null) {
            _hashCode += getNfs().hashCode();
        }
        if (getReadOnlyVolumes() != null) {
            _hashCode += getReadOnlyVolumes().hashCode();
        }
        if (getNonPersistentDisks() != null) {
            _hashCode += getNonPersistentDisks().hashCode();
        }
        if (getPnpDriver() != null) {
            _hashCode += getPnpDriver().hashCode();
        }
        if (getMountDir() != null) {
            _hashCode += getMountDir().hashCode();
        }
        if (getNameJctsAfterGosDrvLtrs() != null) {
            _hashCode += getNameJctsAfterGosDrvLtrs().hashCode();
        }
        if (getUseCachedIo() != null) {
            _hashCode += getUseCachedIo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalComputerOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalComputerOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnlyVolumes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "readOnlyVolumes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonPersistentDisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nonPersistentDisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnpDriver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "pnpDriver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountDir");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "mountDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameJctsAfterGosDrvLtrs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nameJctsAfterGosDrvLtrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCachedIo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "useCachedIo"));
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
