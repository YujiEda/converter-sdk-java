/**
 * ConverterNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterNetworkInfoNicInfo[] nic;

    public ConverterNetworkInfo() {
    }

    public ConverterNetworkInfo(
           com.vmware.converter.ConverterNetworkInfoNicInfo[] nic) {
        this.nic = nic;
    }


    /**
     * Gets the nic value for this ConverterNetworkInfo.
     * 
     * @return nic
     */
    public com.vmware.converter.ConverterNetworkInfoNicInfo[] getNic() {
        return nic;
    }


    /**
     * Sets the nic value for this ConverterNetworkInfo.
     * 
     * @param nic
     */
    public void setNic(com.vmware.converter.ConverterNetworkInfoNicInfo[] nic) {
        this.nic = nic;
    }

    public com.vmware.converter.ConverterNetworkInfoNicInfo getNic(int i) {
        return this.nic[i];
    }

    public void setNic(int i, com.vmware.converter.ConverterNetworkInfoNicInfo _value) {
        this.nic[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNetworkInfo)) return false;
        ConverterNetworkInfo other = (ConverterNetworkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nic==null && other.getNic()==null) || 
             (this.nic!=null &&
              java.util.Arrays.equals(this.nic, other.getNic())));
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
        if (getNic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNic(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterNetworkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkInfoNicInfo"));
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
