/**
 * PatchSuperseded.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PatchSuperseded  extends com.vmware.converter.PatchNotApplicable  implements java.io.Serializable {
    private java.lang.String[] supersede;

    public PatchSuperseded() {
    }

    public PatchSuperseded(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String patchID,
           java.lang.String[] supersede) {
        super(
            faultCause,
            faultMessage,
            patchID);
        this.supersede = supersede;
    }


    /**
     * Gets the supersede value for this PatchSuperseded.
     * 
     * @return supersede
     */
    public java.lang.String[] getSupersede() {
        return supersede;
    }


    /**
     * Sets the supersede value for this PatchSuperseded.
     * 
     * @param supersede
     */
    public void setSupersede(java.lang.String[] supersede) {
        this.supersede = supersede;
    }

    public java.lang.String getSupersede(int i) {
        return this.supersede[i];
    }

    public void setSupersede(int i, java.lang.String _value) {
        this.supersede[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatchSuperseded)) return false;
        PatchSuperseded other = (PatchSuperseded) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.supersede==null && other.getSupersede()==null) || 
             (this.supersede!=null &&
              java.util.Arrays.equals(this.supersede, other.getSupersede())));
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
        if (getSupersede() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupersede());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupersede(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatchSuperseded.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PatchSuperseded"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supersede");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supersede"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
