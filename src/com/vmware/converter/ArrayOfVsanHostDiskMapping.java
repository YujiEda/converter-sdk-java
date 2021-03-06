/**
 * ArrayOfVsanHostDiskMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanHostDiskMapping  implements java.io.Serializable {
    private com.vmware.converter.VsanHostDiskMapping[] vsanHostDiskMapping;

    public ArrayOfVsanHostDiskMapping() {
    }

    public ArrayOfVsanHostDiskMapping(
           com.vmware.converter.VsanHostDiskMapping[] vsanHostDiskMapping) {
           this.vsanHostDiskMapping = vsanHostDiskMapping;
    }


    /**
     * Gets the vsanHostDiskMapping value for this ArrayOfVsanHostDiskMapping.
     * 
     * @return vsanHostDiskMapping
     */
    public com.vmware.converter.VsanHostDiskMapping[] getVsanHostDiskMapping() {
        return vsanHostDiskMapping;
    }


    /**
     * Sets the vsanHostDiskMapping value for this ArrayOfVsanHostDiskMapping.
     * 
     * @param vsanHostDiskMapping
     */
    public void setVsanHostDiskMapping(com.vmware.converter.VsanHostDiskMapping[] vsanHostDiskMapping) {
        this.vsanHostDiskMapping = vsanHostDiskMapping;
    }

    public com.vmware.converter.VsanHostDiskMapping getVsanHostDiskMapping(int i) {
        return this.vsanHostDiskMapping[i];
    }

    public void setVsanHostDiskMapping(int i, com.vmware.converter.VsanHostDiskMapping _value) {
        this.vsanHostDiskMapping[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanHostDiskMapping)) return false;
        ArrayOfVsanHostDiskMapping other = (ArrayOfVsanHostDiskMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanHostDiskMapping==null && other.getVsanHostDiskMapping()==null) || 
             (this.vsanHostDiskMapping!=null &&
              java.util.Arrays.equals(this.vsanHostDiskMapping, other.getVsanHostDiskMapping())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVsanHostDiskMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostDiskMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostDiskMapping(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanHostDiskMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanHostDiskMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostDiskMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapping"));
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
