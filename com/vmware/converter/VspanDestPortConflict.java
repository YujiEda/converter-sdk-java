/**
 * VspanDestPortConflict.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VspanDestPortConflict  extends com.vmware.converter.DvsFault  implements java.io.Serializable {
    private java.lang.String vspanSessionKey1;

    private java.lang.String vspanSessionKey2;

    private java.lang.String portKey;

    public VspanDestPortConflict() {
    }

    public VspanDestPortConflict(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String vspanSessionKey1,
           java.lang.String vspanSessionKey2,
           java.lang.String portKey) {
        super(
            faultCause,
            faultMessage);
        this.vspanSessionKey1 = vspanSessionKey1;
        this.vspanSessionKey2 = vspanSessionKey2;
        this.portKey = portKey;
    }


    /**
     * Gets the vspanSessionKey1 value for this VspanDestPortConflict.
     * 
     * @return vspanSessionKey1
     */
    public java.lang.String getVspanSessionKey1() {
        return vspanSessionKey1;
    }


    /**
     * Sets the vspanSessionKey1 value for this VspanDestPortConflict.
     * 
     * @param vspanSessionKey1
     */
    public void setVspanSessionKey1(java.lang.String vspanSessionKey1) {
        this.vspanSessionKey1 = vspanSessionKey1;
    }


    /**
     * Gets the vspanSessionKey2 value for this VspanDestPortConflict.
     * 
     * @return vspanSessionKey2
     */
    public java.lang.String getVspanSessionKey2() {
        return vspanSessionKey2;
    }


    /**
     * Sets the vspanSessionKey2 value for this VspanDestPortConflict.
     * 
     * @param vspanSessionKey2
     */
    public void setVspanSessionKey2(java.lang.String vspanSessionKey2) {
        this.vspanSessionKey2 = vspanSessionKey2;
    }


    /**
     * Gets the portKey value for this VspanDestPortConflict.
     * 
     * @return portKey
     */
    public java.lang.String getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this VspanDestPortConflict.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String portKey) {
        this.portKey = portKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VspanDestPortConflict)) return false;
        VspanDestPortConflict other = (VspanDestPortConflict) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vspanSessionKey1==null && other.getVspanSessionKey1()==null) || 
             (this.vspanSessionKey1!=null &&
              this.vspanSessionKey1.equals(other.getVspanSessionKey1()))) &&
            ((this.vspanSessionKey2==null && other.getVspanSessionKey2()==null) || 
             (this.vspanSessionKey2!=null &&
              this.vspanSessionKey2.equals(other.getVspanSessionKey2()))) &&
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
        if (getVspanSessionKey1() != null) {
            _hashCode += getVspanSessionKey1().hashCode();
        }
        if (getVspanSessionKey2() != null) {
            _hashCode += getVspanSessionKey2().hashCode();
        }
        if (getPortKey() != null) {
            _hashCode += getPortKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VspanDestPortConflict.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VspanDestPortConflict"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vspanSessionKey1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vspanSessionKey1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vspanSessionKey2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vspanSessionKey2"));
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
