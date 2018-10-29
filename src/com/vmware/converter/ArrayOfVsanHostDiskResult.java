/**
 * ArrayOfVsanHostDiskResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanHostDiskResult  implements java.io.Serializable {
    private com.vmware.converter.VsanHostDiskResult[] vsanHostDiskResult;

    public ArrayOfVsanHostDiskResult() {
    }

    public ArrayOfVsanHostDiskResult(
           com.vmware.converter.VsanHostDiskResult[] vsanHostDiskResult) {
           this.vsanHostDiskResult = vsanHostDiskResult;
    }


    /**
     * Gets the vsanHostDiskResult value for this ArrayOfVsanHostDiskResult.
     * 
     * @return vsanHostDiskResult
     */
    public com.vmware.converter.VsanHostDiskResult[] getVsanHostDiskResult() {
        return vsanHostDiskResult;
    }


    /**
     * Sets the vsanHostDiskResult value for this ArrayOfVsanHostDiskResult.
     * 
     * @param vsanHostDiskResult
     */
    public void setVsanHostDiskResult(com.vmware.converter.VsanHostDiskResult[] vsanHostDiskResult) {
        this.vsanHostDiskResult = vsanHostDiskResult;
    }

    public com.vmware.converter.VsanHostDiskResult getVsanHostDiskResult(int i) {
        return this.vsanHostDiskResult[i];
    }

    public void setVsanHostDiskResult(int i, com.vmware.converter.VsanHostDiskResult _value) {
        this.vsanHostDiskResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanHostDiskResult)) return false;
        ArrayOfVsanHostDiskResult other = (ArrayOfVsanHostDiskResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanHostDiskResult==null && other.getVsanHostDiskResult()==null) || 
             (this.vsanHostDiskResult!=null &&
              java.util.Arrays.equals(this.vsanHostDiskResult, other.getVsanHostDiskResult())));
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
        if (getVsanHostDiskResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanHostDiskResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanHostDiskResult(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanHostDiskResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanHostDiskResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanHostDiskResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskResult"));
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
