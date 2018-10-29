/**
 * ConverterPropertyInfoNumCpuMismatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterPropertyInfoNumCpuMismatch  extends com.vmware.converter.ConverterPropertyInfo  implements java.io.Serializable {
    private int numCPUInSource;

    public ConverterPropertyInfoNumCpuMismatch() {
    }

    public ConverterPropertyInfoNumCpuMismatch(
           java.lang.String property,
           java.lang.String severityLevel,
           java.lang.String message,
           int numCPUInSource) {
        super(
            property,
            severityLevel,
            message);
        this.numCPUInSource = numCPUInSource;
    }


    /**
     * Gets the numCPUInSource value for this ConverterPropertyInfoNumCpuMismatch.
     * 
     * @return numCPUInSource
     */
    public int getNumCPUInSource() {
        return numCPUInSource;
    }


    /**
     * Sets the numCPUInSource value for this ConverterPropertyInfoNumCpuMismatch.
     * 
     * @param numCPUInSource
     */
    public void setNumCPUInSource(int numCPUInSource) {
        this.numCPUInSource = numCPUInSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterPropertyInfoNumCpuMismatch)) return false;
        ConverterPropertyInfoNumCpuMismatch other = (ConverterPropertyInfoNumCpuMismatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.numCPUInSource == other.getNumCPUInSource();
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
        _hashCode += getNumCPUInSource();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterPropertyInfoNumCpuMismatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterPropertyInfoNumCpuMismatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCPUInSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "numCPUInSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
