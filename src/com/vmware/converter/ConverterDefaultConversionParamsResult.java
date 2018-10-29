/**
 * ConverterDefaultConversionParamsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDefaultConversionParamsResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterDefaultConversionParams defaultConversionParams;

    private com.vmware.converter.ConverterPropertyInfo[] info;

    public ConverterDefaultConversionParamsResult() {
    }

    public ConverterDefaultConversionParamsResult(
           com.vmware.converter.ConverterDefaultConversionParams defaultConversionParams,
           com.vmware.converter.ConverterPropertyInfo[] info) {
        this.defaultConversionParams = defaultConversionParams;
        this.info = info;
    }


    /**
     * Gets the defaultConversionParams value for this ConverterDefaultConversionParamsResult.
     * 
     * @return defaultConversionParams
     */
    public com.vmware.converter.ConverterDefaultConversionParams getDefaultConversionParams() {
        return defaultConversionParams;
    }


    /**
     * Sets the defaultConversionParams value for this ConverterDefaultConversionParamsResult.
     * 
     * @param defaultConversionParams
     */
    public void setDefaultConversionParams(com.vmware.converter.ConverterDefaultConversionParams defaultConversionParams) {
        this.defaultConversionParams = defaultConversionParams;
    }


    /**
     * Gets the info value for this ConverterDefaultConversionParamsResult.
     * 
     * @return info
     */
    public com.vmware.converter.ConverterPropertyInfo[] getInfo() {
        return info;
    }


    /**
     * Sets the info value for this ConverterDefaultConversionParamsResult.
     * 
     * @param info
     */
    public void setInfo(com.vmware.converter.ConverterPropertyInfo[] info) {
        this.info = info;
    }

    public com.vmware.converter.ConverterPropertyInfo getInfo(int i) {
        return this.info[i];
    }

    public void setInfo(int i, com.vmware.converter.ConverterPropertyInfo _value) {
        this.info[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterDefaultConversionParamsResult)) return false;
        ConverterDefaultConversionParamsResult other = (ConverterDefaultConversionParamsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultConversionParams==null && other.getDefaultConversionParams()==null) || 
             (this.defaultConversionParams!=null &&
              this.defaultConversionParams.equals(other.getDefaultConversionParams()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              java.util.Arrays.equals(this.info, other.getInfo())));
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
        if (getDefaultConversionParams() != null) {
            _hashCode += getDefaultConversionParams().hashCode();
        }
        if (getInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterDefaultConversionParamsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDefaultConversionParamsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultConversionParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultConversionParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDefaultConversionParams"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "info"));
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
