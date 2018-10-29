/**
 * DvsUpdateTagNetworkRuleAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsUpdateTagNetworkRuleAction  extends com.vmware.converter.DvsNetworkRuleAction  implements java.io.Serializable {
    private java.lang.Integer qosTag;

    private java.lang.Integer dscpTag;

    public DvsUpdateTagNetworkRuleAction() {
    }

    public DvsUpdateTagNetworkRuleAction(
           java.lang.Integer qosTag,
           java.lang.Integer dscpTag) {
        this.qosTag = qosTag;
        this.dscpTag = dscpTag;
    }


    /**
     * Gets the qosTag value for this DvsUpdateTagNetworkRuleAction.
     * 
     * @return qosTag
     */
    public java.lang.Integer getQosTag() {
        return qosTag;
    }


    /**
     * Sets the qosTag value for this DvsUpdateTagNetworkRuleAction.
     * 
     * @param qosTag
     */
    public void setQosTag(java.lang.Integer qosTag) {
        this.qosTag = qosTag;
    }


    /**
     * Gets the dscpTag value for this DvsUpdateTagNetworkRuleAction.
     * 
     * @return dscpTag
     */
    public java.lang.Integer getDscpTag() {
        return dscpTag;
    }


    /**
     * Sets the dscpTag value for this DvsUpdateTagNetworkRuleAction.
     * 
     * @param dscpTag
     */
    public void setDscpTag(java.lang.Integer dscpTag) {
        this.dscpTag = dscpTag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsUpdateTagNetworkRuleAction)) return false;
        DvsUpdateTagNetworkRuleAction other = (DvsUpdateTagNetworkRuleAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.qosTag==null && other.getQosTag()==null) || 
             (this.qosTag!=null &&
              this.qosTag.equals(other.getQosTag()))) &&
            ((this.dscpTag==null && other.getDscpTag()==null) || 
             (this.dscpTag!=null &&
              this.dscpTag.equals(other.getDscpTag())));
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
        if (getQosTag() != null) {
            _hashCode += getQosTag().hashCode();
        }
        if (getDscpTag() != null) {
            _hashCode += getDscpTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsUpdateTagNetworkRuleAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsUpdateTagNetworkRuleAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosTag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "qosTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dscpTag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dscpTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
