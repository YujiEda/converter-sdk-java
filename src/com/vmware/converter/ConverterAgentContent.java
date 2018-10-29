/**
 * ConverterAgentContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentContent  extends com.vmware.converter.ConverterServiceContent  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference converterAgent;

    public ConverterAgentContent() {
    }

    public ConverterAgentContent(
           com.vmware.converter.ManagedObjectReference propertyCollector,
           com.vmware.converter.ManagedObjectReference sessionManager,
           com.vmware.converter.ManagedObjectReference eventManager,
           com.vmware.converter.ManagedObjectReference taskManager,
           com.vmware.converter.ManagedObjectReference queryManager,
           com.vmware.converter.ManagedObjectReference diagnosticManager,
           com.vmware.converter.AboutInfo about,
           com.vmware.converter.ManagedObjectReference conversionManager,
           com.vmware.converter.ManagedObjectReference converterAgent) {
        super(
            propertyCollector,
            sessionManager,
            eventManager,
            taskManager,
            queryManager,
            diagnosticManager,
            about,
            conversionManager);
        this.converterAgent = converterAgent;
    }


    /**
     * Gets the converterAgent value for this ConverterAgentContent.
     * 
     * @return converterAgent
     */
    public com.vmware.converter.ManagedObjectReference getConverterAgent() {
        return converterAgent;
    }


    /**
     * Sets the converterAgent value for this ConverterAgentContent.
     * 
     * @param converterAgent
     */
    public void setConverterAgent(com.vmware.converter.ManagedObjectReference converterAgent) {
        this.converterAgent = converterAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentContent)) return false;
        ConverterAgentContent other = (ConverterAgentContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.converterAgent==null && other.getConverterAgent()==null) || 
             (this.converterAgent!=null &&
              this.converterAgent.equals(other.getConverterAgent())));
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
        if (getConverterAgent() != null) {
            _hashCode += getConverterAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "converterAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
