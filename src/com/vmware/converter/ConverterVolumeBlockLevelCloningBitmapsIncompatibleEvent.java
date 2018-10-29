/**
 * ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent  extends com.vmware.converter.ConverterEvent  implements java.io.Serializable {
    private java.lang.String bitmapId1;

    private java.lang.String bitmapId2;

    public ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent() {
    }

    public ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent(
           int key,
           int chainId,
           com.vmware.converter.ConverterEventType type,
           java.util.Calendar createdTime,
           java.lang.String userName,
           java.lang.String fullMessage,
           com.vmware.converter.ManagedObjectReference job,
           java.lang.String bitmapId1,
           java.lang.String bitmapId2) {
        super(
            key,
            chainId,
            type,
            createdTime,
            userName,
            fullMessage,
            job);
        this.bitmapId1 = bitmapId1;
        this.bitmapId2 = bitmapId2;
    }


    /**
     * Gets the bitmapId1 value for this ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent.
     * 
     * @return bitmapId1
     */
    public java.lang.String getBitmapId1() {
        return bitmapId1;
    }


    /**
     * Sets the bitmapId1 value for this ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent.
     * 
     * @param bitmapId1
     */
    public void setBitmapId1(java.lang.String bitmapId1) {
        this.bitmapId1 = bitmapId1;
    }


    /**
     * Gets the bitmapId2 value for this ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent.
     * 
     * @return bitmapId2
     */
    public java.lang.String getBitmapId2() {
        return bitmapId2;
    }


    /**
     * Sets the bitmapId2 value for this ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent.
     * 
     * @param bitmapId2
     */
    public void setBitmapId2(java.lang.String bitmapId2) {
        this.bitmapId2 = bitmapId2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent)) return false;
        ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent other = (ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bitmapId1==null && other.getBitmapId1()==null) || 
             (this.bitmapId1!=null &&
              this.bitmapId1.equals(other.getBitmapId1()))) &&
            ((this.bitmapId2==null && other.getBitmapId2()==null) || 
             (this.bitmapId2!=null &&
              this.bitmapId2.equals(other.getBitmapId2())));
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
        if (getBitmapId1() != null) {
            _hashCode += getBitmapId1().hashCode();
        }
        if (getBitmapId2() != null) {
            _hashCode += getBitmapId2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterVolumeBlockLevelCloningBitmapsIncompatibleEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitmapId1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bitmapId1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitmapId2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "bitmapId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
