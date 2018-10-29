/**
 * ArrayOfPerfMetricSeriesCSV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfPerfMetricSeriesCSV  implements java.io.Serializable {
    private com.vmware.converter.PerfMetricSeriesCSV[] perfMetricSeriesCSV;

    public ArrayOfPerfMetricSeriesCSV() {
    }

    public ArrayOfPerfMetricSeriesCSV(
           com.vmware.converter.PerfMetricSeriesCSV[] perfMetricSeriesCSV) {
           this.perfMetricSeriesCSV = perfMetricSeriesCSV;
    }


    /**
     * Gets the perfMetricSeriesCSV value for this ArrayOfPerfMetricSeriesCSV.
     * 
     * @return perfMetricSeriesCSV
     */
    public com.vmware.converter.PerfMetricSeriesCSV[] getPerfMetricSeriesCSV() {
        return perfMetricSeriesCSV;
    }


    /**
     * Sets the perfMetricSeriesCSV value for this ArrayOfPerfMetricSeriesCSV.
     * 
     * @param perfMetricSeriesCSV
     */
    public void setPerfMetricSeriesCSV(com.vmware.converter.PerfMetricSeriesCSV[] perfMetricSeriesCSV) {
        this.perfMetricSeriesCSV = perfMetricSeriesCSV;
    }

    public com.vmware.converter.PerfMetricSeriesCSV getPerfMetricSeriesCSV(int i) {
        return this.perfMetricSeriesCSV[i];
    }

    public void setPerfMetricSeriesCSV(int i, com.vmware.converter.PerfMetricSeriesCSV _value) {
        this.perfMetricSeriesCSV[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPerfMetricSeriesCSV)) return false;
        ArrayOfPerfMetricSeriesCSV other = (ArrayOfPerfMetricSeriesCSV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.perfMetricSeriesCSV==null && other.getPerfMetricSeriesCSV()==null) || 
             (this.perfMetricSeriesCSV!=null &&
              java.util.Arrays.equals(this.perfMetricSeriesCSV, other.getPerfMetricSeriesCSV())));
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
        if (getPerfMetricSeriesCSV() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerfMetricSeriesCSV());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerfMetricSeriesCSV(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPerfMetricSeriesCSV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPerfMetricSeriesCSV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfMetricSeriesCSV");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PerfMetricSeriesCSV"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfMetricSeriesCSV"));
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
