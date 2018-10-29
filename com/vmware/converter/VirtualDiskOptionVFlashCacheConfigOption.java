/**
 * VirtualDiskOptionVFlashCacheConfigOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskOptionVFlashCacheConfigOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ChoiceOption cacheConsistencyType;

    private com.vmware.converter.ChoiceOption cacheMode;

    private com.vmware.converter.LongOption reservationInMB;

    private com.vmware.converter.LongOption blockSizeInKB;

    public VirtualDiskOptionVFlashCacheConfigOption() {
    }

    public VirtualDiskOptionVFlashCacheConfigOption(
           com.vmware.converter.ChoiceOption cacheConsistencyType,
           com.vmware.converter.ChoiceOption cacheMode,
           com.vmware.converter.LongOption reservationInMB,
           com.vmware.converter.LongOption blockSizeInKB) {
        this.cacheConsistencyType = cacheConsistencyType;
        this.cacheMode = cacheMode;
        this.reservationInMB = reservationInMB;
        this.blockSizeInKB = blockSizeInKB;
    }


    /**
     * Gets the cacheConsistencyType value for this VirtualDiskOptionVFlashCacheConfigOption.
     * 
     * @return cacheConsistencyType
     */
    public com.vmware.converter.ChoiceOption getCacheConsistencyType() {
        return cacheConsistencyType;
    }


    /**
     * Sets the cacheConsistencyType value for this VirtualDiskOptionVFlashCacheConfigOption.
     * 
     * @param cacheConsistencyType
     */
    public void setCacheConsistencyType(com.vmware.converter.ChoiceOption cacheConsistencyType) {
        this.cacheConsistencyType = cacheConsistencyType;
    }


    /**
     * Gets the cacheMode value for this VirtualDiskOptionVFlashCacheConfigOption.
     * 
     * @return cacheMode
     */
    public com.vmware.converter.ChoiceOption getCacheMode() {
        return cacheMode;
    }


    /**
     * Sets the cacheMode value for this VirtualDiskOptionVFlashCacheConfigOption.
     * 
     * @param cacheMode
     */
    public void setCacheMode(com.vmware.converter.ChoiceOption cacheMode) {
        this.cacheMode = cacheMode;
    }


    /**
     * Gets the reservationInMB value for this VirtualDiskOptionVFlashCacheConfigOption.
     * 
     * @return reservationInMB
     */
    public com.vmware.converter.LongOption getReservationInMB() {
        return reservationInMB;
    }


    /**
     * Sets the reservationInMB value for this VirtualDiskOptionVFlashCacheConfigOption.
     * 
     * @param reservationInMB
     */
    public void setReservationInMB(com.vmware.converter.LongOption reservationInMB) {
        this.reservationInMB = reservationInMB;
    }


    /**
     * Gets the blockSizeInKB value for this VirtualDiskOptionVFlashCacheConfigOption.
     * 
     * @return blockSizeInKB
     */
    public com.vmware.converter.LongOption getBlockSizeInKB() {
        return blockSizeInKB;
    }


    /**
     * Sets the blockSizeInKB value for this VirtualDiskOptionVFlashCacheConfigOption.
     * 
     * @param blockSizeInKB
     */
    public void setBlockSizeInKB(com.vmware.converter.LongOption blockSizeInKB) {
        this.blockSizeInKB = blockSizeInKB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskOptionVFlashCacheConfigOption)) return false;
        VirtualDiskOptionVFlashCacheConfigOption other = (VirtualDiskOptionVFlashCacheConfigOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cacheConsistencyType==null && other.getCacheConsistencyType()==null) || 
             (this.cacheConsistencyType!=null &&
              this.cacheConsistencyType.equals(other.getCacheConsistencyType()))) &&
            ((this.cacheMode==null && other.getCacheMode()==null) || 
             (this.cacheMode!=null &&
              this.cacheMode.equals(other.getCacheMode()))) &&
            ((this.reservationInMB==null && other.getReservationInMB()==null) || 
             (this.reservationInMB!=null &&
              this.reservationInMB.equals(other.getReservationInMB()))) &&
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
        if (getCacheConsistencyType() != null) {
            _hashCode += getCacheConsistencyType().hashCode();
        }
        if (getCacheMode() != null) {
            _hashCode += getCacheMode().hashCode();
        }
        if (getReservationInMB() != null) {
            _hashCode += getReservationInMB().hashCode();
        }
        if (getBlockSizeInKB() != null) {
            _hashCode += getBlockSizeInKB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskOptionVFlashCacheConfigOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskOptionVFlashCacheConfigOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("reservationInMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationInMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockSizeInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blockSizeInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
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
