/**
 * ConverterComputerOsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterComputerOsInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterComputerOsInfoOsVersion osVersion;

    private java.lang.String hostname;

    private java.lang.String activeVolumeId;

    private java.lang.String systemVolumeId;

    private com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo[] logicalVolumeInfo;

    private com.vmware.converter.ConverterReconfigPrerequisites reconfigPrerequisites;

    private com.vmware.converter.ConverterServiceInfo[] services;

    private com.vmware.converter.ConverterComputerOsInfoCapabilities capabilities;

    private com.vmware.converter.ConverterComputerOsInfoBootLoaderInfo bootLoaderInfo;

    private java.lang.String dracut;

    public ConverterComputerOsInfo() {
    }

    public ConverterComputerOsInfo(
           com.vmware.converter.ConverterComputerOsInfoOsVersion osVersion,
           java.lang.String hostname,
           java.lang.String activeVolumeId,
           java.lang.String systemVolumeId,
           com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo[] logicalVolumeInfo,
           com.vmware.converter.ConverterReconfigPrerequisites reconfigPrerequisites,
           com.vmware.converter.ConverterServiceInfo[] services,
           com.vmware.converter.ConverterComputerOsInfoCapabilities capabilities,
           com.vmware.converter.ConverterComputerOsInfoBootLoaderInfo bootLoaderInfo,
           java.lang.String dracut) {
        this.osVersion = osVersion;
        this.hostname = hostname;
        this.activeVolumeId = activeVolumeId;
        this.systemVolumeId = systemVolumeId;
        this.logicalVolumeInfo = logicalVolumeInfo;
        this.reconfigPrerequisites = reconfigPrerequisites;
        this.services = services;
        this.capabilities = capabilities;
        this.bootLoaderInfo = bootLoaderInfo;
        this.dracut = dracut;
    }


    /**
     * Gets the osVersion value for this ConverterComputerOsInfo.
     * 
     * @return osVersion
     */
    public com.vmware.converter.ConverterComputerOsInfoOsVersion getOsVersion() {
        return osVersion;
    }


    /**
     * Sets the osVersion value for this ConverterComputerOsInfo.
     * 
     * @param osVersion
     */
    public void setOsVersion(com.vmware.converter.ConverterComputerOsInfoOsVersion osVersion) {
        this.osVersion = osVersion;
    }


    /**
     * Gets the hostname value for this ConverterComputerOsInfo.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this ConverterComputerOsInfo.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the activeVolumeId value for this ConverterComputerOsInfo.
     * 
     * @return activeVolumeId
     */
    public java.lang.String getActiveVolumeId() {
        return activeVolumeId;
    }


    /**
     * Sets the activeVolumeId value for this ConverterComputerOsInfo.
     * 
     * @param activeVolumeId
     */
    public void setActiveVolumeId(java.lang.String activeVolumeId) {
        this.activeVolumeId = activeVolumeId;
    }


    /**
     * Gets the systemVolumeId value for this ConverterComputerOsInfo.
     * 
     * @return systemVolumeId
     */
    public java.lang.String getSystemVolumeId() {
        return systemVolumeId;
    }


    /**
     * Sets the systemVolumeId value for this ConverterComputerOsInfo.
     * 
     * @param systemVolumeId
     */
    public void setSystemVolumeId(java.lang.String systemVolumeId) {
        this.systemVolumeId = systemVolumeId;
    }


    /**
     * Gets the logicalVolumeInfo value for this ConverterComputerOsInfo.
     * 
     * @return logicalVolumeInfo
     */
    public com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo[] getLogicalVolumeInfo() {
        return logicalVolumeInfo;
    }


    /**
     * Sets the logicalVolumeInfo value for this ConverterComputerOsInfo.
     * 
     * @param logicalVolumeInfo
     */
    public void setLogicalVolumeInfo(com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo[] logicalVolumeInfo) {
        this.logicalVolumeInfo = logicalVolumeInfo;
    }

    public com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo getLogicalVolumeInfo(int i) {
        return this.logicalVolumeInfo[i];
    }

    public void setLogicalVolumeInfo(int i, com.vmware.converter.ConverterComputerOsInfoLogicalVolumeInfo _value) {
        this.logicalVolumeInfo[i] = _value;
    }


    /**
     * Gets the reconfigPrerequisites value for this ConverterComputerOsInfo.
     * 
     * @return reconfigPrerequisites
     */
    public com.vmware.converter.ConverterReconfigPrerequisites getReconfigPrerequisites() {
        return reconfigPrerequisites;
    }


    /**
     * Sets the reconfigPrerequisites value for this ConverterComputerOsInfo.
     * 
     * @param reconfigPrerequisites
     */
    public void setReconfigPrerequisites(com.vmware.converter.ConverterReconfigPrerequisites reconfigPrerequisites) {
        this.reconfigPrerequisites = reconfigPrerequisites;
    }


    /**
     * Gets the services value for this ConverterComputerOsInfo.
     * 
     * @return services
     */
    public com.vmware.converter.ConverterServiceInfo[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this ConverterComputerOsInfo.
     * 
     * @param services
     */
    public void setServices(com.vmware.converter.ConverterServiceInfo[] services) {
        this.services = services;
    }

    public com.vmware.converter.ConverterServiceInfo getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, com.vmware.converter.ConverterServiceInfo _value) {
        this.services[i] = _value;
    }


    /**
     * Gets the capabilities value for this ConverterComputerOsInfo.
     * 
     * @return capabilities
     */
    public com.vmware.converter.ConverterComputerOsInfoCapabilities getCapabilities() {
        return capabilities;
    }


    /**
     * Sets the capabilities value for this ConverterComputerOsInfo.
     * 
     * @param capabilities
     */
    public void setCapabilities(com.vmware.converter.ConverterComputerOsInfoCapabilities capabilities) {
        this.capabilities = capabilities;
    }


    /**
     * Gets the bootLoaderInfo value for this ConverterComputerOsInfo.
     * 
     * @return bootLoaderInfo
     */
    public com.vmware.converter.ConverterComputerOsInfoBootLoaderInfo getBootLoaderInfo() {
        return bootLoaderInfo;
    }


    /**
     * Sets the bootLoaderInfo value for this ConverterComputerOsInfo.
     * 
     * @param bootLoaderInfo
     */
    public void setBootLoaderInfo(com.vmware.converter.ConverterComputerOsInfoBootLoaderInfo bootLoaderInfo) {
        this.bootLoaderInfo = bootLoaderInfo;
    }


    /**
     * Gets the dracut value for this ConverterComputerOsInfo.
     * 
     * @return dracut
     */
    public java.lang.String getDracut() {
        return dracut;
    }


    /**
     * Sets the dracut value for this ConverterComputerOsInfo.
     * 
     * @param dracut
     */
    public void setDracut(java.lang.String dracut) {
        this.dracut = dracut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterComputerOsInfo)) return false;
        ConverterComputerOsInfo other = (ConverterComputerOsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.osVersion==null && other.getOsVersion()==null) || 
             (this.osVersion!=null &&
              this.osVersion.equals(other.getOsVersion()))) &&
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.activeVolumeId==null && other.getActiveVolumeId()==null) || 
             (this.activeVolumeId!=null &&
              this.activeVolumeId.equals(other.getActiveVolumeId()))) &&
            ((this.systemVolumeId==null && other.getSystemVolumeId()==null) || 
             (this.systemVolumeId!=null &&
              this.systemVolumeId.equals(other.getSystemVolumeId()))) &&
            ((this.logicalVolumeInfo==null && other.getLogicalVolumeInfo()==null) || 
             (this.logicalVolumeInfo!=null &&
              java.util.Arrays.equals(this.logicalVolumeInfo, other.getLogicalVolumeInfo()))) &&
            ((this.reconfigPrerequisites==null && other.getReconfigPrerequisites()==null) || 
             (this.reconfigPrerequisites!=null &&
              this.reconfigPrerequisites.equals(other.getReconfigPrerequisites()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            ((this.capabilities==null && other.getCapabilities()==null) || 
             (this.capabilities!=null &&
              this.capabilities.equals(other.getCapabilities()))) &&
            ((this.bootLoaderInfo==null && other.getBootLoaderInfo()==null) || 
             (this.bootLoaderInfo!=null &&
              this.bootLoaderInfo.equals(other.getBootLoaderInfo()))) &&
            ((this.dracut==null && other.getDracut()==null) || 
             (this.dracut!=null &&
              this.dracut.equals(other.getDracut())));
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
        if (getOsVersion() != null) {
            _hashCode += getOsVersion().hashCode();
        }
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getActiveVolumeId() != null) {
            _hashCode += getActiveVolumeId().hashCode();
        }
        if (getSystemVolumeId() != null) {
            _hashCode += getSystemVolumeId().hashCode();
        }
        if (getLogicalVolumeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogicalVolumeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogicalVolumeInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReconfigPrerequisites() != null) {
            _hashCode += getReconfigPrerequisites().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCapabilities() != null) {
            _hashCode += getCapabilities().hashCode();
        }
        if (getBootLoaderInfo() != null) {
            _hashCode += getBootLoaderInfo().hashCode();
        }
        if (getDracut() != null) {
            _hashCode += getDracut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterComputerOsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoOsVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeVolumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "activeVolumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemVolumeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "systemVolumeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalVolumeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "logicalVolumeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoLogicalVolumeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconfigPrerequisites");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "reconfigPrerequisites"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisites"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "capabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoCapabilities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootLoaderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bootLoaderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerOsInfoBootLoaderInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dracut");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "dracut"));
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
