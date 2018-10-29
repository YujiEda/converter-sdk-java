/**
 * ConverterSupportedSources.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterSupportedSources  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] supportedSources;

    private java.lang.String[] supportedLiveSources;

    private java.lang.String[] supportedHostedSources;

    public ConverterSupportedSources() {
    }

    public ConverterSupportedSources(
           java.lang.String[] supportedSources,
           java.lang.String[] supportedLiveSources,
           java.lang.String[] supportedHostedSources) {
        this.supportedSources = supportedSources;
        this.supportedLiveSources = supportedLiveSources;
        this.supportedHostedSources = supportedHostedSources;
    }


    /**
     * Gets the supportedSources value for this ConverterSupportedSources.
     * 
     * @return supportedSources
     */
    public java.lang.String[] getSupportedSources() {
        return supportedSources;
    }


    /**
     * Sets the supportedSources value for this ConverterSupportedSources.
     * 
     * @param supportedSources
     */
    public void setSupportedSources(java.lang.String[] supportedSources) {
        this.supportedSources = supportedSources;
    }

    public java.lang.String getSupportedSources(int i) {
        return this.supportedSources[i];
    }

    public void setSupportedSources(int i, java.lang.String _value) {
        this.supportedSources[i] = _value;
    }


    /**
     * Gets the supportedLiveSources value for this ConverterSupportedSources.
     * 
     * @return supportedLiveSources
     */
    public java.lang.String[] getSupportedLiveSources() {
        return supportedLiveSources;
    }


    /**
     * Sets the supportedLiveSources value for this ConverterSupportedSources.
     * 
     * @param supportedLiveSources
     */
    public void setSupportedLiveSources(java.lang.String[] supportedLiveSources) {
        this.supportedLiveSources = supportedLiveSources;
    }

    public java.lang.String getSupportedLiveSources(int i) {
        return this.supportedLiveSources[i];
    }

    public void setSupportedLiveSources(int i, java.lang.String _value) {
        this.supportedLiveSources[i] = _value;
    }


    /**
     * Gets the supportedHostedSources value for this ConverterSupportedSources.
     * 
     * @return supportedHostedSources
     */
    public java.lang.String[] getSupportedHostedSources() {
        return supportedHostedSources;
    }


    /**
     * Sets the supportedHostedSources value for this ConverterSupportedSources.
     * 
     * @param supportedHostedSources
     */
    public void setSupportedHostedSources(java.lang.String[] supportedHostedSources) {
        this.supportedHostedSources = supportedHostedSources;
    }

    public java.lang.String getSupportedHostedSources(int i) {
        return this.supportedHostedSources[i];
    }

    public void setSupportedHostedSources(int i, java.lang.String _value) {
        this.supportedHostedSources[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterSupportedSources)) return false;
        ConverterSupportedSources other = (ConverterSupportedSources) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.supportedSources==null && other.getSupportedSources()==null) || 
             (this.supportedSources!=null &&
              java.util.Arrays.equals(this.supportedSources, other.getSupportedSources()))) &&
            ((this.supportedLiveSources==null && other.getSupportedLiveSources()==null) || 
             (this.supportedLiveSources!=null &&
              java.util.Arrays.equals(this.supportedLiveSources, other.getSupportedLiveSources()))) &&
            ((this.supportedHostedSources==null && other.getSupportedHostedSources()==null) || 
             (this.supportedHostedSources!=null &&
              java.util.Arrays.equals(this.supportedHostedSources, other.getSupportedHostedSources())));
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
        if (getSupportedSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedSources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedSources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupportedLiveSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedLiveSources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedLiveSources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupportedHostedSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedHostedSources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedHostedSources(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterSupportedSources.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterSupportedSources"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedSources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedSources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedLiveSources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedLiveSources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedHostedSources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "supportedHostedSources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
