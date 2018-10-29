/**
 * SharesOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class SharesOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.IntOption sharesOption;

    private com.vmware.converter.SharesLevel defaultLevel;

    public SharesOption() {
    }

    public SharesOption(
           com.vmware.converter.IntOption sharesOption,
           com.vmware.converter.SharesLevel defaultLevel) {
        this.sharesOption = sharesOption;
        this.defaultLevel = defaultLevel;
    }


    /**
     * Gets the sharesOption value for this SharesOption.
     * 
     * @return sharesOption
     */
    public com.vmware.converter.IntOption getSharesOption() {
        return sharesOption;
    }


    /**
     * Sets the sharesOption value for this SharesOption.
     * 
     * @param sharesOption
     */
    public void setSharesOption(com.vmware.converter.IntOption sharesOption) {
        this.sharesOption = sharesOption;
    }


    /**
     * Gets the defaultLevel value for this SharesOption.
     * 
     * @return defaultLevel
     */
    public com.vmware.converter.SharesLevel getDefaultLevel() {
        return defaultLevel;
    }


    /**
     * Sets the defaultLevel value for this SharesOption.
     * 
     * @param defaultLevel
     */
    public void setDefaultLevel(com.vmware.converter.SharesLevel defaultLevel) {
        this.defaultLevel = defaultLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharesOption)) return false;
        SharesOption other = (SharesOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sharesOption==null && other.getSharesOption()==null) || 
             (this.sharesOption!=null &&
              this.sharesOption.equals(other.getSharesOption()))) &&
            ((this.defaultLevel==null && other.getDefaultLevel()==null) || 
             (this.defaultLevel!=null &&
              this.defaultLevel.equals(other.getDefaultLevel())));
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
        if (getSharesOption() != null) {
            _hashCode += getSharesOption().hashCode();
        }
        if (getDefaultLevel() != null) {
            _hashCode += getDefaultLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharesOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SharesOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharesOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sharesOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SharesLevel"));
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
