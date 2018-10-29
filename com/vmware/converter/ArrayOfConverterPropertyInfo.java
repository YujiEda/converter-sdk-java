/**
 * ArrayOfConverterPropertyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfConverterPropertyInfo  implements java.io.Serializable {
    private com.vmware.converter.ConverterPropertyInfo[] converterPropertyInfo;

    public ArrayOfConverterPropertyInfo() {
    }

    public ArrayOfConverterPropertyInfo(
           com.vmware.converter.ConverterPropertyInfo[] converterPropertyInfo) {
           this.converterPropertyInfo = converterPropertyInfo;
    }


    /**
     * Gets the converterPropertyInfo value for this ArrayOfConverterPropertyInfo.
     * 
     * @return converterPropertyInfo
     */
    public com.vmware.converter.ConverterPropertyInfo[] getConverterPropertyInfo() {
        return converterPropertyInfo;
    }


    /**
     * Sets the converterPropertyInfo value for this ArrayOfConverterPropertyInfo.
     * 
     * @param converterPropertyInfo
     */
    public void setConverterPropertyInfo(com.vmware.converter.ConverterPropertyInfo[] converterPropertyInfo) {
        this.converterPropertyInfo = converterPropertyInfo;
    }

    public com.vmware.converter.ConverterPropertyInfo getConverterPropertyInfo(int i) {
        return this.converterPropertyInfo[i];
    }

    public void setConverterPropertyInfo(int i, com.vmware.converter.ConverterPropertyInfo _value) {
        this.converterPropertyInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConverterPropertyInfo)) return false;
        ArrayOfConverterPropertyInfo other = (ArrayOfConverterPropertyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.converterPropertyInfo==null && other.getConverterPropertyInfo()==null) || 
             (this.converterPropertyInfo!=null &&
              java.util.Arrays.equals(this.converterPropertyInfo, other.getConverterPropertyInfo())));
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
        if (getConverterPropertyInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConverterPropertyInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConverterPropertyInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConverterPropertyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ArrayOfConverterPropertyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterPropertyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ConverterPropertyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterPropertyInfo"));
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
