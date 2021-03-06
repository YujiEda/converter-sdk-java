/**
 * ConverterQueryBootableSnapshotsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterQueryBootableSnapshotsResponse  implements java.io.Serializable {
    private com.vmware.converter.ConverterSnapshotInfo[] returnval;

    public ConverterQueryBootableSnapshotsResponse() {
    }

    public ConverterQueryBootableSnapshotsResponse(
           com.vmware.converter.ConverterSnapshotInfo[] returnval) {
           this.returnval = returnval;
    }


    /**
     * Gets the returnval value for this ConverterQueryBootableSnapshotsResponse.
     * 
     * @return returnval
     */
    public com.vmware.converter.ConverterSnapshotInfo[] getReturnval() {
        return returnval;
    }


    /**
     * Sets the returnval value for this ConverterQueryBootableSnapshotsResponse.
     * 
     * @param returnval
     */
    public void setReturnval(com.vmware.converter.ConverterSnapshotInfo[] returnval) {
        this.returnval = returnval;
    }

    public com.vmware.converter.ConverterSnapshotInfo getReturnval(int i) {
        return this.returnval[i];
    }

    public void setReturnval(int i, com.vmware.converter.ConverterSnapshotInfo _value) {
        this.returnval[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterQueryBootableSnapshotsResponse)) return false;
        ConverterQueryBootableSnapshotsResponse other = (ConverterQueryBootableSnapshotsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnval==null && other.getReturnval()==null) || 
             (this.returnval!=null &&
              java.util.Arrays.equals(this.returnval, other.getReturnval())));
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
        if (getReturnval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnval(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterQueryBootableSnapshotsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", ">ConverterQueryBootableSnapshotsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "returnval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSnapshotInfo"));
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
