/**
 * DvsGreEncapNetworkRuleAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsGreEncapNetworkRuleAction  extends com.vmware.converter.DvsNetworkRuleAction  implements java.io.Serializable {
    private com.vmware.converter.SingleIp encapsulationIp;

    public DvsGreEncapNetworkRuleAction() {
    }

    public DvsGreEncapNetworkRuleAction(
           com.vmware.converter.SingleIp encapsulationIp) {
        this.encapsulationIp = encapsulationIp;
    }


    /**
     * Gets the encapsulationIp value for this DvsGreEncapNetworkRuleAction.
     * 
     * @return encapsulationIp
     */
    public com.vmware.converter.SingleIp getEncapsulationIp() {
        return encapsulationIp;
    }


    /**
     * Sets the encapsulationIp value for this DvsGreEncapNetworkRuleAction.
     * 
     * @param encapsulationIp
     */
    public void setEncapsulationIp(com.vmware.converter.SingleIp encapsulationIp) {
        this.encapsulationIp = encapsulationIp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsGreEncapNetworkRuleAction)) return false;
        DvsGreEncapNetworkRuleAction other = (DvsGreEncapNetworkRuleAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.encapsulationIp==null && other.getEncapsulationIp()==null) || 
             (this.encapsulationIp!=null &&
              this.encapsulationIp.equals(other.getEncapsulationIp())));
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
        if (getEncapsulationIp() != null) {
            _hashCode += getEncapsulationIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsGreEncapNetworkRuleAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsGreEncapNetworkRuleAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encapsulationIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "encapsulationIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SingleIp"));
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
