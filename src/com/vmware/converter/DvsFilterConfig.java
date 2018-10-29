/**
 * DvsFilterConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsFilterConfig  extends com.vmware.converter.InheritablePolicy  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String agentName;

    private java.lang.String slotNumber;

    private com.vmware.converter.DvsFilterParameter parameters;

    private java.lang.String onFailure;

    public DvsFilterConfig() {
    }

    public DvsFilterConfig(
           boolean inherited,
           java.lang.String key,
           java.lang.String agentName,
           java.lang.String slotNumber,
           com.vmware.converter.DvsFilterParameter parameters,
           java.lang.String onFailure) {
        super(
            inherited);
        this.key = key;
        this.agentName = agentName;
        this.slotNumber = slotNumber;
        this.parameters = parameters;
        this.onFailure = onFailure;
    }


    /**
     * Gets the key value for this DvsFilterConfig.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this DvsFilterConfig.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the agentName value for this DvsFilterConfig.
     * 
     * @return agentName
     */
    public java.lang.String getAgentName() {
        return agentName;
    }


    /**
     * Sets the agentName value for this DvsFilterConfig.
     * 
     * @param agentName
     */
    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }


    /**
     * Gets the slotNumber value for this DvsFilterConfig.
     * 
     * @return slotNumber
     */
    public java.lang.String getSlotNumber() {
        return slotNumber;
    }


    /**
     * Sets the slotNumber value for this DvsFilterConfig.
     * 
     * @param slotNumber
     */
    public void setSlotNumber(java.lang.String slotNumber) {
        this.slotNumber = slotNumber;
    }


    /**
     * Gets the parameters value for this DvsFilterConfig.
     * 
     * @return parameters
     */
    public com.vmware.converter.DvsFilterParameter getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this DvsFilterConfig.
     * 
     * @param parameters
     */
    public void setParameters(com.vmware.converter.DvsFilterParameter parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the onFailure value for this DvsFilterConfig.
     * 
     * @return onFailure
     */
    public java.lang.String getOnFailure() {
        return onFailure;
    }


    /**
     * Sets the onFailure value for this DvsFilterConfig.
     * 
     * @param onFailure
     */
    public void setOnFailure(java.lang.String onFailure) {
        this.onFailure = onFailure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsFilterConfig)) return false;
        DvsFilterConfig other = (DvsFilterConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.agentName==null && other.getAgentName()==null) || 
             (this.agentName!=null &&
              this.agentName.equals(other.getAgentName()))) &&
            ((this.slotNumber==null && other.getSlotNumber()==null) || 
             (this.slotNumber!=null &&
              this.slotNumber.equals(other.getSlotNumber()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters()))) &&
            ((this.onFailure==null && other.getOnFailure()==null) || 
             (this.onFailure!=null &&
              this.onFailure.equals(other.getOnFailure())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getAgentName() != null) {
            _hashCode += getAgentName().hashCode();
        }
        if (getSlotNumber() != null) {
            _hashCode += getSlotNumber().hashCode();
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        if (getOnFailure() != null) {
            _hashCode += getOnFailure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsFilterConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsFilterConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "agentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "slotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsFilterParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "onFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
