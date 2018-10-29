/**
 * VirtualDiskVFlashCacheConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskVFlashCacheConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vFlashModule;

    private java.lang.Long reservationInMB;

    private java.lang.String cacheConsistencyType;

    private java.lang.String cacheMode;

    private java.lang.Long blockSizeInKB;

    public VirtualDiskVFlashCacheConfigInfo() {
    }

    public VirtualDiskVFlashCacheConfigInfo(
           java.lang.String vFlashModule,
           java.lang.Long reservationInMB,
           java.lang.String cacheConsistencyType,
           java.lang.String cacheMode,
           java.lang.Long blockSizeInKB) {
        this.vFlashModule = vFlashModule;
        this.reservationInMB = reservationInMB;
        this.cacheConsistencyType = cacheConsistencyType;
        this.cacheMode = cacheMode;
        this.blockSizeInKB = blockSizeInKB;
    }


    /**
     * Gets the vFlashModule value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @return vFlashModule
     */
    public java.lang.String getVFlashModule() {
        return vFlashModule;
    }


    /**
     * Sets the vFlashModule value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @param vFlashModule
     */
    public void setVFlashModule(java.lang.String vFlashModule) {
        this.vFlashModule = vFlashModule;
    }


    /**
     * Gets the reservationInMB value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @return reservationInMB
     */
    public java.lang.Long getReservationInMB() {
        return reservationInMB;
    }


    /**
     * Sets the reservationInMB value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @param reservationInMB
     */
    public void setReservationInMB(java.lang.Long reservationInMB) {
        this.reservationInMB = reservationInMB;
    }


    /**
     * Gets the cacheConsistencyType value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @return cacheConsistencyType
     */
    public java.lang.String getCacheConsistencyType() {
        return cacheConsistencyType;
    }


    /**
     * Sets the cacheConsistencyType value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @param cacheConsistencyType
     */
    public void setCacheConsistencyType(java.lang.String cacheConsistencyType) {
        this.cacheConsistencyType = cacheConsistencyType;
    }


    /**
     * Gets the cacheMode value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @return cacheMode
     */
    public java.lang.String getCacheMode() {
        return cacheMode;
    }


    /**
     * Sets the cacheMode value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @param cacheMode
     */
    public void setCacheMode(java.lang.String cacheMode) {
        this.cacheMode = cacheMode;
    }


    /**
     * Gets the blockSizeInKB value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @return blockSizeInKB
     */
    public java.lang.Long getBlockSizeInKB() {
        return blockSizeInKB;
    }


    /**
     * Sets the blockSizeInKB value for this VirtualDiskVFlashCacheConfigInfo.
     * 
     * @param blockSizeInKB
     */
    public void setBlockSizeInKB(java.lang.Long blockSizeInKB) {
        this.blockSizeInKB = blockSizeInKB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskVFlashCacheConfigInfo)) return false;
        VirtualDiskVFlashCacheConfigInfo other = (VirtualDiskVFlashCacheConfigInfo) obj;
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
            ((this.reservationInMB==null && other.getReservationInMB()==null) || 
             (this.reservationInMB!=null &&
              this.reservationInMB.equals(other.getReservationInMB()))) &&
            ((this.cacheConsistencyType==null && other.getCacheConsistencyType()==null) || 
             (this.cacheConsistencyType!=null &&
              this.cacheConsistencyType.equals(other.getCacheConsistencyType()))) &&
            ((this.cacheMode==null && other.getCacheMode()==null) || 
             (this.cacheMode!=null &&
              this.cacheMode.equals(other.getCacheMode()))) &&
            ((this.blockSizeInKB==null && other.getBlockSizeInKB()==null) || 
             (this.blockSizeInKB!=null &&
              this.blockSizeInKB.equals(other.getBlockSizeInKB())));
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
        if (getReservationInMB() != null) {
            _hashCode += getReservationInMB().hashCode();
        }
        if (getCacheConsistencyType() != null) {
            _hashCode += getCacheConsistencyType().hashCode();
        }
        if (getCacheMode() != null) {
            _hashCode += getCacheMode().hashCode();
        }
        if (getBlockSizeInKB() != null) {
            _hashCode += getBlockSizeInKB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskVFlashCacheConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskVFlashCacheConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashModule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationInMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationInMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheConsistencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cacheConsistencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cacheMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockSizeInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blockSizeInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
