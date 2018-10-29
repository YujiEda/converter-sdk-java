/**
 * ConverterDefaultVMReconfigurationParamsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDefaultVMReconfigurationParamsResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterDefaultVMReconfigurationParams defaultVMReconfigurationParams;

    private com.vmware.converter.ConverterPropertyInfo[] info;

    public ConverterDefaultVMReconfigurationParamsResult() {
    }

    public ConverterDefaultVMReconfigurationParamsResult(
           com.vmware.converter.ConverterDefaultVMReconfigurationParams defaultVMReconfigurationParams,
           com.vmware.converter.ConverterPropertyInfo[] info) {
        this.defaultVMReconfigurationParams = defaultVMReconfigurationParams;
        this.info = info;
    }


    /**
     * Gets the defaultVMReconfigurationParams value for this ConverterDefaultVMReconfigurationParamsResult.
     * 
     * @return defaultVMReconfigurationParams
     */
    public com.vmware.converter.ConverterDefaultVMReconfigurationParams getDefaultVMReconfigurationParams() {
        return defaultVMReconfigurationParams;
    }


    /**
     * Sets the defaultVMReconfigurationParams value for this ConverterDefaultVMReconfigurationParamsResult.
     * 
     * @param defaultVMReconfigurationParams
     */
    public void setDefaultVMReconfigurationParams(com.vmware.converter.ConverterDefaultVMReconfigurationParams defaultVMReconfigurationParams) {
        this.defaultVMReconfigurationParams = defaultVMReconfigurationParams;
    }


    /**
     * Gets the info value for this ConverterDefaultVMReconfigurationParamsResult.
     * 
     * @return info
     */
    public com.vmware.converter.ConverterPropertyInfo[] getInfo() {
        return info;
    }


    /**
     * Sets the info value for this ConverterDefaultVMReconfigurationParamsResult.
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
        if (!(obj instanceof ConverterDefaultVMReconfigurationParamsResult)) return false;
        ConverterDefaultVMReconfigurationParamsResult other = (ConverterDefaultVMReconfigurationParamsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultVMReconfigurationParams==null && other.getDefaultVMReconfigurationParams()==null) || 
             (this.defaultVMReconfigurationParams!=null &&
              this.defaultVMReconfigurationParams.equals(other.getDefaultVMReconfigurationParams()))) &&
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
        if (getDefaultVMReconfigurationParams() != null) {
            _hashCode += getDefaultVMReconfigurationParams().hashCode();
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
        new org.apache.axis.description.TypeDesc(ConverterDefaultVMReconfigurationParamsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDefaultVMReconfigurationParamsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultVMReconfigurationParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "defaultVMReconfigurationParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDefaultVMReconfigurationParams"));
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
