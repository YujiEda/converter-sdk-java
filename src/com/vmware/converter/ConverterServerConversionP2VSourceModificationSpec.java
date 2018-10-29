/**
 * ConverterServerConversionP2VSourceModificationSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerConversionP2VSourceModificationSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean uninstallAgent;

    private java.lang.Boolean shutdownSource;

    public ConverterServerConversionP2VSourceModificationSpec() {
    }

    public ConverterServerConversionP2VSourceModificationSpec(
           java.lang.Boolean uninstallAgent,
           java.lang.Boolean shutdownSource) {
        this.uninstallAgent = uninstallAgent;
        this.shutdownSource = shutdownSource;
    }


    /**
     * Gets the uninstallAgent value for this ConverterServerConversionP2VSourceModificationSpec.
     * 
     * @return uninstallAgent
     */
    public java.lang.Boolean getUninstallAgent() {
        return uninstallAgent;
    }


    /**
     * Sets the uninstallAgent value for this ConverterServerConversionP2VSourceModificationSpec.
     * 
     * @param uninstallAgent
     */
    public void setUninstallAgent(java.lang.Boolean uninstallAgent) {
        this.uninstallAgent = uninstallAgent;
    }


    /**
     * Gets the shutdownSource value for this ConverterServerConversionP2VSourceModificationSpec.
     * 
     * @return shutdownSource
     */
    public java.lang.Boolean getShutdownSource() {
        return shutdownSource;
    }


    /**
     * Sets the shutdownSource value for this ConverterServerConversionP2VSourceModificationSpec.
     * 
     * @param shutdownSource
     */
    public void setShutdownSource(java.lang.Boolean shutdownSource) {
        this.shutdownSource = shutdownSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerConversionP2VSourceModificationSpec)) return false;
        ConverterServerConversionP2VSourceModificationSpec other = (ConverterServerConversionP2VSourceModificationSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uninstallAgent==null && other.getUninstallAgent()==null) || 
             (this.uninstallAgent!=null &&
              this.uninstallAgent.equals(other.getUninstallAgent()))) &&
            ((this.shutdownSource==null && other.getShutdownSource()==null) || 
             (this.shutdownSource!=null &&
              this.shutdownSource.equals(other.getShutdownSource())));
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
        if (getUninstallAgent() != null) {
            _hashCode += getUninstallAgent().hashCode();
        }
        if (getShutdownSource() != null) {
            _hashCode += getShutdownSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerConversionP2VSourceModificationSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionP2VSourceModificationSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uninstallAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "uninstallAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shutdownSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "shutdownSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
