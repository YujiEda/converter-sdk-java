/**
 * StorageIOAllocationOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageIOAllocationOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.LongOption limitOption;

    private com.vmware.converter.SharesOption sharesOption;

    public StorageIOAllocationOption() {
    }

    public StorageIOAllocationOption(
           com.vmware.converter.LongOption limitOption,
           com.vmware.converter.SharesOption sharesOption) {
        this.limitOption = limitOption;
        this.sharesOption = sharesOption;
    }


    /**
     * Gets the limitOption value for this StorageIOAllocationOption.
     * 
     * @return limitOption
     */
    public com.vmware.converter.LongOption getLimitOption() {
        return limitOption;
    }


    /**
     * Sets the limitOption value for this StorageIOAllocationOption.
     * 
     * @param limitOption
     */
    public void setLimitOption(com.vmware.converter.LongOption limitOption) {
        this.limitOption = limitOption;
    }


    /**
     * Gets the sharesOption value for this StorageIOAllocationOption.
     * 
     * @return sharesOption
     */
    public com.vmware.converter.SharesOption getSharesOption() {
        return sharesOption;
    }


    /**
     * Sets the sharesOption value for this StorageIOAllocationOption.
     * 
     * @param sharesOption
     */
    public void setSharesOption(com.vmware.converter.SharesOption sharesOption) {
        this.sharesOption = sharesOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageIOAllocationOption)) return false;
        StorageIOAllocationOption other = (StorageIOAllocationOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.limitOption==null && other.getLimitOption()==null) || 
             (this.limitOption!=null &&
              this.limitOption.equals(other.getLimitOption()))) &&
            ((this.sharesOption==null && other.getSharesOption()==null) || 
             (this.sharesOption!=null &&
              this.sharesOption.equals(other.getSharesOption())));
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
        if (getLimitOption() != null) {
            _hashCode += getLimitOption().hashCode();
        }
        if (getSharesOption() != null) {
            _hashCode += getSharesOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorageIOAllocationOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageIOAllocationOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "limitOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharesOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sharesOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SharesOption"));
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
