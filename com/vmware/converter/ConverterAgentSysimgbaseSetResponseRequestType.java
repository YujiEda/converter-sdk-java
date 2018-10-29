/**
 * ConverterAgentSysimgbaseSetResponseRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentSysimgbaseSetResponseRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private java.lang.String key;

    private byte[] response;

    public ConverterAgentSysimgbaseSetResponseRequestType() {
    }

    public ConverterAgentSysimgbaseSetResponseRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           java.lang.String key,
           byte[] response) {
           this._this = _this;
           this.key = key;
           this.response = response;
    }


    /**
     * Gets the _this value for this ConverterAgentSysimgbaseSetResponseRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterAgentSysimgbaseSetResponseRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the key value for this ConverterAgentSysimgbaseSetResponseRequestType.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ConverterAgentSysimgbaseSetResponseRequestType.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the response value for this ConverterAgentSysimgbaseSetResponseRequestType.
     * 
     * @return response
     */
    public byte[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this ConverterAgentSysimgbaseSetResponseRequestType.
     * 
     * @param response
     */
    public void setResponse(byte[] response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentSysimgbaseSetResponseRequestType)) return false;
        ConverterAgentSysimgbaseSetResponseRequestType other = (ConverterAgentSysimgbaseSetResponseRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              java.util.Arrays.equals(this.response, other.getResponse())));
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
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterAgentSysimgbaseSetResponseRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentSysimgbaseSetResponseRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
