/**
 * ConverterNetworkParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterNetworkParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean preserveNicCount;

    private java.lang.Boolean preserveNicMapping;

    private com.vmware.converter.ConverterNetworkParamsNicParams[] nic;

    public ConverterNetworkParams() {
    }

    public ConverterNetworkParams(
           java.lang.Boolean preserveNicCount,
           java.lang.Boolean preserveNicMapping,
           com.vmware.converter.ConverterNetworkParamsNicParams[] nic) {
        this.preserveNicCount = preserveNicCount;
        this.preserveNicMapping = preserveNicMapping;
        this.nic = nic;
    }


    /**
     * Gets the preserveNicCount value for this ConverterNetworkParams.
     * 
     * @return preserveNicCount
     */
    public java.lang.Boolean getPreserveNicCount() {
        return preserveNicCount;
    }


    /**
     * Sets the preserveNicCount value for this ConverterNetworkParams.
     * 
     * @param preserveNicCount
     */
    public void setPreserveNicCount(java.lang.Boolean preserveNicCount) {
        this.preserveNicCount = preserveNicCount;
    }


    /**
     * Gets the preserveNicMapping value for this ConverterNetworkParams.
     * 
     * @return preserveNicMapping
     */
    public java.lang.Boolean getPreserveNicMapping() {
        return preserveNicMapping;
    }


    /**
     * Sets the preserveNicMapping value for this ConverterNetworkParams.
     * 
     * @param preserveNicMapping
     */
    public void setPreserveNicMapping(java.lang.Boolean preserveNicMapping) {
        this.preserveNicMapping = preserveNicMapping;
    }


    /**
     * Gets the nic value for this ConverterNetworkParams.
     * 
     * @return nic
     */
    public com.vmware.converter.ConverterNetworkParamsNicParams[] getNic() {
        return nic;
    }


    /**
     * Sets the nic value for this ConverterNetworkParams.
     * 
     * @param nic
     */
    public void setNic(com.vmware.converter.ConverterNetworkParamsNicParams[] nic) {
        this.nic = nic;
    }

    public com.vmware.converter.ConverterNetworkParamsNicParams getNic(int i) {
        return this.nic[i];
    }

    public void setNic(int i, com.vmware.converter.ConverterNetworkParamsNicParams _value) {
        this.nic[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterNetworkParams)) return false;
        ConverterNetworkParams other = (ConverterNetworkParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.preserveNicCount==null && other.getPreserveNicCount()==null) || 
             (this.preserveNicCount!=null &&
              this.preserveNicCount.equals(other.getPreserveNicCount()))) &&
            ((this.preserveNicMapping==null && other.getPreserveNicMapping()==null) || 
             (this.preserveNicMapping!=null &&
              this.preserveNicMapping.equals(other.getPreserveNicMapping()))) &&
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
        if (getPreserveNicCount() != null) {
            _hashCode += getPreserveNicCount().hashCode();
        }
        if (getPreserveNicMapping() != null) {
            _hashCode += getPreserveNicMapping().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(ConverterNetworkParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveNicCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "preserveNicCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveNicMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "preserveNicMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkParamsNicParams"));
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
