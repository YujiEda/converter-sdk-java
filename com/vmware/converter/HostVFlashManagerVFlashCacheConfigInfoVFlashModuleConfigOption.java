/**
 * HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vFlashModule;

    private java.lang.String vFlashModuleVersion;

    private java.lang.String minSupportedModuleVersion;

    private com.vmware.converter.ChoiceOption cacheConsistencyType;

    private com.vmware.converter.ChoiceOption cacheMode;

    private com.vmware.converter.LongOption blockSizeInKBOption;

    private com.vmware.converter.LongOption reservationInMBOption;

    private long maxDiskSizeInKB;

    public HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption() {
    }

    public HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption(
           java.lang.String vFlashModule,
           java.lang.String vFlashModuleVersion,
           java.lang.String minSupportedModuleVersion,
           com.vmware.converter.ChoiceOption cacheConsistencyType,
           com.vmware.converter.ChoiceOption cacheMode,
           com.vmware.converter.LongOption blockSizeInKBOption,
           com.vmware.converter.LongOption reservationInMBOption,
           long maxDiskSizeInKB) {
        this.vFlashModule = vFlashModule;
        this.vFlashModuleVersion = vFlashModuleVersion;
        this.minSupportedModuleVersion = minSupportedModuleVersion;
        this.cacheConsistencyType = cacheConsistencyType;
        this.cacheMode = cacheMode;
        this.blockSizeInKBOption = blockSizeInKBOption;
        this.reservationInMBOption = reservationInMBOption;
        this.maxDiskSizeInKB = maxDiskSizeInKB;
    }


    /**
     * Gets the vFlashModule value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @return vFlashModule
     */
    public java.lang.String getVFlashModule() {
        return vFlashModule;
    }


    /**
     * Sets the vFlashModule value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @param vFlashModule
     */
    public void setVFlashModule(java.lang.String vFlashModule) {
        this.vFlashModule = vFlashModule;
    }


    /**
     * Gets the vFlashModuleVersion value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @return vFlashModuleVersion
     */
    public java.lang.String getVFlashModuleVersion() {
        return vFlashModuleVersion;
    }


    /**
     * Sets the vFlashModuleVersion value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @param vFlashModuleVersion
     */
    public void setVFlashModuleVersion(java.lang.String vFlashModuleVersion) {
        this.vFlashModuleVersion = vFlashModuleVersion;
    }


    /**
     * Gets the minSupportedModuleVersion value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @return minSupportedModuleVersion
     */
    public java.lang.String getMinSupportedModuleVersion() {
        return minSupportedModuleVersion;
    }


    /**
     * Sets the minSupportedModuleVersion value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @param minSupportedModuleVersion
     */
    public void setMinSupportedModuleVersion(java.lang.String minSupportedModuleVersion) {
        this.minSupportedModuleVersion = minSupportedModuleVersion;
    }


    /**
     * Gets the cacheConsistencyType value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @return cacheConsistencyType
     */
    public com.vmware.converter.ChoiceOption getCacheConsistencyType() {
        return cacheConsistencyType;
    }


    /**
     * Sets the cacheConsistencyType value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @param cacheConsistencyType
     */
    public void setCacheConsistencyType(com.vmware.converter.ChoiceOption cacheConsistencyType) {
        this.cacheConsistencyType = cacheConsistencyType;
    }


    /**
     * Gets the cacheMode value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @return cacheMode
     */
    public com.vmware.converter.ChoiceOption getCacheMode() {
        return cacheMode;
    }


    /**
     * Sets the cacheMode value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @param cacheMode
     */
    public void setCacheMode(com.vmware.converter.ChoiceOption cacheMode) {
        this.cacheMode = cacheMode;
    }


    /**
     * Gets the blockSizeInKBOption value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @return blockSizeInKBOption
     */
    public com.vmware.converter.LongOption getBlockSizeInKBOption() {
        return blockSizeInKBOption;
    }


    /**
     * Sets the blockSizeInKBOption value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @param blockSizeInKBOption
     */
    public void setBlockSizeInKBOption(com.vmware.converter.LongOption blockSizeInKBOption) {
        this.blockSizeInKBOption = blockSizeInKBOption;
    }


    /**
     * Gets the reservationInMBOption value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @return reservationInMBOption
     */
    public com.vmware.converter.LongOption getReservationInMBOption() {
        return reservationInMBOption;
    }


    /**
     * Sets the reservationInMBOption value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @param reservationInMBOption
     */
    public void setReservationInMBOption(com.vmware.converter.LongOption reservationInMBOption) {
        this.reservationInMBOption = reservationInMBOption;
    }


    /**
     * Gets the maxDiskSizeInKB value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @return maxDiskSizeInKB
     */
    public long getMaxDiskSizeInKB() {
        return maxDiskSizeInKB;
    }


    /**
     * Sets the maxDiskSizeInKB value for this HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.
     * 
     * @param maxDiskSizeInKB
     */
    public void setMaxDiskSizeInKB(long maxDiskSizeInKB) {
        this.maxDiskSizeInKB = maxDiskSizeInKB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption)) return false;
        HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption other = (HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vFlashModule==null && other.getVFlashModule()==null) || 
             (this.vFlashModule!=null &&
              this.vFlashModule.equals(other.getVFlashModule()))) &&
            ((this.vFlashModuleVersion==null && other.getVFlashModuleVersion()==null) || 
             (this.vFlashModuleVersion!=null &&
              this.vFlashModuleVersion.equals(other.getVFlashModuleVersion()))) &&
            ((this.minSupportedModuleVersion==null && other.getMinSupportedModuleVersion()==null) || 
             (this.minSupportedModuleVersion!=null &&
              this.minSupportedModuleVersion.equals(other.getMinSupportedModuleVersion()))) &&
            ((this.cacheConsistencyType==null && other.getCacheConsistencyType()==null) || 
             (this.cacheConsistencyType!=null &&
              this.cacheConsistencyType.equals(other.getCacheConsistencyType()))) &&
            ((this.cacheMode==null && other.getCacheMode()==null) || 
             (this.cacheMode!=null &&
              this.cacheMode.equals(other.getCacheMode()))) &&
            ((this.blockSizeInKBOption==null && other.getBlockSizeInKBOption()==null) || 
             (this.blockSizeInKBOption!=null &&
              this.blockSizeInKBOption.equals(other.getBlockSizeInKBOption()))) &&
            ((this.reservationInMBOption==null && other.getReservationInMBOption()==null) || 
             (this.reservationInMBOption!=null &&
              this.reservationInMBOption.equals(other.getReservationInMBOption()))) &&
            this.maxDiskSizeInKB == other.getMaxDiskSizeInKB();
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
        if (getVFlashModule() != null) {
            _hashCode += getVFlashModule().hashCode();
        }
        if (getVFlashModuleVersion() != null) {
            _hashCode += getVFlashModuleVersion().hashCode();
        }
        if (getMinSupportedModuleVersion() != null) {
            _hashCode += getMinSupportedModuleVersion().hashCode();
        }
        if (getCacheConsistencyType() != null) {
            _hashCode += getCacheConsistencyType().hashCode();
        }
        if (getCacheMode() != null) {
            _hashCode += getCacheMode().hashCode();
        }
        if (getBlockSizeInKBOption() != null) {
            _hashCode += getBlockSizeInKBOption().hashCode();
        }
        if (getReservationInMBOption() != null) {
            _hashCode += getReservationInMBOption().hashCode();
        }
        _hashCode += new Long(getMaxDiskSizeInKB()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashModule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashModuleVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashModuleVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSupportedModuleVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "minSupportedModuleVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheConsistencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cacheConsistencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cacheMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockSizeInKBOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blockSizeInKBOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationInMBOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationInMBOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDiskSizeInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxDiskSizeInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
