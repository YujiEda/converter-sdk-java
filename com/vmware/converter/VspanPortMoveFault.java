/**
 * VspanPortMoveFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VspanPortMoveFault  extends com.vmware.converter.DvsFault  implements java.io.Serializable {
    private java.lang.String srcPortgroupName;

    private java.lang.String destPortgroupName;

    private java.lang.String portKey;

    public VspanPortMoveFault() {
    }

    public VspanPortMoveFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String srcPortgroupName,
           java.lang.String destPortgroupName,
           java.lang.String portKey) {
        super(
            faultCause,
            faultMessage);
        this.srcPortgroupName = srcPortgroupName;
        this.destPortgroupName = destPortgroupName;
        this.portKey = portKey;
    }


    /**
     * Gets the srcPortgroupName value for this VspanPortMoveFault.
     * 
     * @return srcPortgroupName
     */
    public java.lang.String getSrcPortgroupName() {
        return srcPortgroupName;
    }


    /**
     * Sets the srcPortgroupName value for this VspanPortMoveFault.
     * 
     * @param srcPortgroupName
     */
    public void setSrcPortgroupName(java.lang.String srcPortgroupName) {
        this.srcPortgroupName = srcPortgroupName;
    }


    /**
     * Gets the destPortgroupName value for this VspanPortMoveFault.
     * 
     * @return destPortgroupName
     */
    public java.lang.String getDestPortgroupName() {
        return destPortgroupName;
    }


    /**
     * Sets the destPortgroupName value for this VspanPortMoveFault.
     * 
     * @param destPortgroupName
     */
    public void setDestPortgroupName(java.lang.String destPortgroupName) {
        this.destPortgroupName = destPortgroupName;
    }


    /**
     * Gets the portKey value for this VspanPortMoveFault.
     * 
     * @return portKey
     */
    public java.lang.String getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this VspanPortMoveFault.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String portKey) {
        this.portKey = portKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VspanPortMoveFault)) return false;
        VspanPortMoveFault other = (VspanPortMoveFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.srcPortgroupName==null && other.getSrcPortgroupName()==null) || 
             (this.srcPortgroupName!=null &&
              this.srcPortgroupName.equals(other.getSrcPortgroupName()))) &&
            ((this.destPortgroupName==null && other.getDestPortgroupName()==null) || 
             (this.destPortgroupName!=null &&
              this.destPortgroupName.equals(other.getDestPortgroupName()))) &&
            ((this.portKey==null && other.getPortKey()==null) || 
             (this.portKey!=null &&
              this.portKey.equals(other.getPortKey())));
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
        if (getSrcPortgroupName() != null) {
            _hashCode += getSrcPortgroupName().hashCode();
        }
        if (getDestPortgroupName() != null) {
            _hashCode += getDestPortgroupName().hashCode();
        }
        if (getPortKey() != null) {
            _hashCode += getPortKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VspanPortMoveFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VspanPortMoveFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcPortgroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "srcPortgroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destPortgroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destPortgroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portKey"));
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
