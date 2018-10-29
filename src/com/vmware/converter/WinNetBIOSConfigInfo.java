/**
 * WinNetBIOSConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class WinNetBIOSConfigInfo  extends com.vmware.converter.NetBIOSConfigInfo  implements java.io.Serializable {
    private java.lang.String primaryWINS;

    private java.lang.String secondaryWINS;

    public WinNetBIOSConfigInfo() {
    }

    public WinNetBIOSConfigInfo(
           java.lang.String mode,
           java.lang.String primaryWINS,
           java.lang.String secondaryWINS) {
        super(
            mode);
        this.primaryWINS = primaryWINS;
        this.secondaryWINS = secondaryWINS;
    }


    /**
     * Gets the primaryWINS value for this WinNetBIOSConfigInfo.
     * 
     * @return primaryWINS
     */
    public java.lang.String getPrimaryWINS() {
        return primaryWINS;
    }


    /**
     * Sets the primaryWINS value for this WinNetBIOSConfigInfo.
     * 
     * @param primaryWINS
     */
    public void setPrimaryWINS(java.lang.String primaryWINS) {
        this.primaryWINS = primaryWINS;
    }


    /**
     * Gets the secondaryWINS value for this WinNetBIOSConfigInfo.
     * 
     * @return secondaryWINS
     */
    public java.lang.String getSecondaryWINS() {
        return secondaryWINS;
    }


    /**
     * Sets the secondaryWINS value for this WinNetBIOSConfigInfo.
     * 
     * @param secondaryWINS
     */
    public void setSecondaryWINS(java.lang.String secondaryWINS) {
        this.secondaryWINS = secondaryWINS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WinNetBIOSConfigInfo)) return false;
        WinNetBIOSConfigInfo other = (WinNetBIOSConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.primaryWINS==null && other.getPrimaryWINS()==null) || 
             (this.primaryWINS!=null &&
              this.primaryWINS.equals(other.getPrimaryWINS()))) &&
            ((this.secondaryWINS==null && other.getSecondaryWINS()==null) || 
             (this.secondaryWINS!=null &&
              this.secondaryWINS.equals(other.getSecondaryWINS())));
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
        if (getPrimaryWINS() != null) {
            _hashCode += getPrimaryWINS().hashCode();
        }
        if (getSecondaryWINS() != null) {
            _hashCode += getSecondaryWINS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WinNetBIOSConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "WinNetBIOSConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryWINS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "primaryWINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryWINS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "secondaryWINS"));
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
