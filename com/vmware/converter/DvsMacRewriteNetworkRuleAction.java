/**
 * DvsMacRewriteNetworkRuleAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsMacRewriteNetworkRuleAction  extends com.vmware.converter.DvsNetworkRuleAction  implements java.io.Serializable {
    private java.lang.String rewriteMac;

    public DvsMacRewriteNetworkRuleAction() {
    }

    public DvsMacRewriteNetworkRuleAction(
           java.lang.String rewriteMac) {
        this.rewriteMac = rewriteMac;
    }


    /**
     * Gets the rewriteMac value for this DvsMacRewriteNetworkRuleAction.
     * 
     * @return rewriteMac
     */
    public java.lang.String getRewriteMac() {
        return rewriteMac;
    }


    /**
     * Sets the rewriteMac value for this DvsMacRewriteNetworkRuleAction.
     * 
     * @param rewriteMac
     */
    public void setRewriteMac(java.lang.String rewriteMac) {
        this.rewriteMac = rewriteMac;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsMacRewriteNetworkRuleAction)) return false;
        DvsMacRewriteNetworkRuleAction other = (DvsMacRewriteNetworkRuleAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rewriteMac==null && other.getRewriteMac()==null) || 
             (this.rewriteMac!=null &&
              this.rewriteMac.equals(other.getRewriteMac())));
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
        if (getRewriteMac() != null) {
            _hashCode += getRewriteMac().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsMacRewriteNetworkRuleAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsMacRewriteNetworkRuleAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewriteMac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rewriteMac"));
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
