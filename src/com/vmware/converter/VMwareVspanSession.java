/**
 * VMwareVspanSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareVspanSession  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String name;

    private java.lang.String description;

    private boolean enabled;

    private com.vmware.converter.VMwareVspanPort sourcePortTransmitted;

    private com.vmware.converter.VMwareVspanPort sourcePortReceived;

    private com.vmware.converter.VMwareVspanPort destinationPort;

    private java.lang.Integer encapsulationVlanId;

    private boolean stripOriginalVlan;

    private java.lang.Integer mirroredPacketLength;

    private boolean normalTrafficAllowed;

    private java.lang.String sessionType;

    private java.lang.Integer samplingRate;

    public VMwareVspanSession() {
    }

    public VMwareVspanSession(
           java.lang.String key,
           java.lang.String name,
           java.lang.String description,
           boolean enabled,
           com.vmware.converter.VMwareVspanPort sourcePortTransmitted,
           com.vmware.converter.VMwareVspanPort sourcePortReceived,
           com.vmware.converter.VMwareVspanPort destinationPort,
           java.lang.Integer encapsulationVlanId,
           boolean stripOriginalVlan,
           java.lang.Integer mirroredPacketLength,
           boolean normalTrafficAllowed,
           java.lang.String sessionType,
           java.lang.Integer samplingRate) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.enabled = enabled;
        this.sourcePortTransmitted = sourcePortTransmitted;
        this.sourcePortReceived = sourcePortReceived;
        this.destinationPort = destinationPort;
        this.encapsulationVlanId = encapsulationVlanId;
        this.stripOriginalVlan = stripOriginalVlan;
        this.mirroredPacketLength = mirroredPacketLength;
        this.normalTrafficAllowed = normalTrafficAllowed;
        this.sessionType = sessionType;
        this.samplingRate = samplingRate;
    }


    /**
     * Gets the key value for this VMwareVspanSession.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this VMwareVspanSession.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the name value for this VMwareVspanSession.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VMwareVspanSession.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this VMwareVspanSession.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VMwareVspanSession.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the enabled value for this VMwareVspanSession.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this VMwareVspanSession.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the sourcePortTransmitted value for this VMwareVspanSession.
     * 
     * @return sourcePortTransmitted
     */
    public com.vmware.converter.VMwareVspanPort getSourcePortTransmitted() {
        return sourcePortTransmitted;
    }


    /**
     * Sets the sourcePortTransmitted value for this VMwareVspanSession.
     * 
     * @param sourcePortTransmitted
     */
    public void setSourcePortTransmitted(com.vmware.converter.VMwareVspanPort sourcePortTransmitted) {
        this.sourcePortTransmitted = sourcePortTransmitted;
    }


    /**
     * Gets the sourcePortReceived value for this VMwareVspanSession.
     * 
     * @return sourcePortReceived
     */
    public com.vmware.converter.VMwareVspanPort getSourcePortReceived() {
        return sourcePortReceived;
    }


    /**
     * Sets the sourcePortReceived value for this VMwareVspanSession.
     * 
     * @param sourcePortReceived
     */
    public void setSourcePortReceived(com.vmware.converter.VMwareVspanPort sourcePortReceived) {
        this.sourcePortReceived = sourcePortReceived;
    }


    /**
     * Gets the destinationPort value for this VMwareVspanSession.
     * 
     * @return destinationPort
     */
    public com.vmware.converter.VMwareVspanPort getDestinationPort() {
        return destinationPort;
    }


    /**
     * Sets the destinationPort value for this VMwareVspanSession.
     * 
     * @param destinationPort
     */
    public void setDestinationPort(com.vmware.converter.VMwareVspanPort destinationPort) {
        this.destinationPort = destinationPort;
    }


    /**
     * Gets the encapsulationVlanId value for this VMwareVspanSession.
     * 
     * @return encapsulationVlanId
     */
    public java.lang.Integer getEncapsulationVlanId() {
        return encapsulationVlanId;
    }


    /**
     * Sets the encapsulationVlanId value for this VMwareVspanSession.
     * 
     * @param encapsulationVlanId
     */
    public void setEncapsulationVlanId(java.lang.Integer encapsulationVlanId) {
        this.encapsulationVlanId = encapsulationVlanId;
    }


    /**
     * Gets the stripOriginalVlan value for this VMwareVspanSession.
     * 
     * @return stripOriginalVlan
     */
    public boolean isStripOriginalVlan() {
        return stripOriginalVlan;
    }


    /**
     * Sets the stripOriginalVlan value for this VMwareVspanSession.
     * 
     * @param stripOriginalVlan
     */
    public void setStripOriginalVlan(boolean stripOriginalVlan) {
        this.stripOriginalVlan = stripOriginalVlan;
    }


    /**
     * Gets the mirroredPacketLength value for this VMwareVspanSession.
     * 
     * @return mirroredPacketLength
     */
    public java.lang.Integer getMirroredPacketLength() {
        return mirroredPacketLength;
    }


    /**
     * Sets the mirroredPacketLength value for this VMwareVspanSession.
     * 
     * @param mirroredPacketLength
     */
    public void setMirroredPacketLength(java.lang.Integer mirroredPacketLength) {
        this.mirroredPacketLength = mirroredPacketLength;
    }


    /**
     * Gets the normalTrafficAllowed value for this VMwareVspanSession.
     * 
     * @return normalTrafficAllowed
     */
    public boolean isNormalTrafficAllowed() {
        return normalTrafficAllowed;
    }


    /**
     * Sets the normalTrafficAllowed value for this VMwareVspanSession.
     * 
     * @param normalTrafficAllowed
     */
    public void setNormalTrafficAllowed(boolean normalTrafficAllowed) {
        this.normalTrafficAllowed = normalTrafficAllowed;
    }


    /**
     * Gets the sessionType value for this VMwareVspanSession.
     * 
     * @return sessionType
     */
    public java.lang.String getSessionType() {
        return sessionType;
    }


    /**
     * Sets the sessionType value for this VMwareVspanSession.
     * 
     * @param sessionType
     */
    public void setSessionType(java.lang.String sessionType) {
        this.sessionType = sessionType;
    }


    /**
     * Gets the samplingRate value for this VMwareVspanSession.
     * 
     * @return samplingRate
     */
    public java.lang.Integer getSamplingRate() {
        return samplingRate;
    }


    /**
     * Sets the samplingRate value for this VMwareVspanSession.
     * 
     * @param samplingRate
     */
    public void setSamplingRate(java.lang.Integer samplingRate) {
        this.samplingRate = samplingRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareVspanSession)) return false;
        VMwareVspanSession other = (VMwareVspanSession) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.enabled == other.isEnabled() &&
            ((this.sourcePortTransmitted==null && other.getSourcePortTransmitted()==null) || 
             (this.sourcePortTransmitted!=null &&
              this.sourcePortTransmitted.equals(other.getSourcePortTransmitted()))) &&
            ((this.sourcePortReceived==null && other.getSourcePortReceived()==null) || 
             (this.sourcePortReceived!=null &&
              this.sourcePortReceived.equals(other.getSourcePortReceived()))) &&
            ((this.destinationPort==null && other.getDestinationPort()==null) || 
             (this.destinationPort!=null &&
              this.destinationPort.equals(other.getDestinationPort()))) &&
            ((this.encapsulationVlanId==null && other.getEncapsulationVlanId()==null) || 
             (this.encapsulationVlanId!=null &&
              this.encapsulationVlanId.equals(other.getEncapsulationVlanId()))) &&
            this.stripOriginalVlan == other.isStripOriginalVlan() &&
            ((this.mirroredPacketLength==null && other.getMirroredPacketLength()==null) || 
             (this.mirroredPacketLength!=null &&
              this.mirroredPacketLength.equals(other.getMirroredPacketLength()))) &&
            this.normalTrafficAllowed == other.isNormalTrafficAllowed() &&
            ((this.sessionType==null && other.getSessionType()==null) || 
             (this.sessionType!=null &&
              this.sessionType.equals(other.getSessionType()))) &&
            ((this.samplingRate==null && other.getSamplingRate()==null) || 
             (this.samplingRate!=null &&
              this.samplingRate.equals(other.getSamplingRate())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourcePortTransmitted() != null) {
            _hashCode += getSourcePortTransmitted().hashCode();
        }
        if (getSourcePortReceived() != null) {
            _hashCode += getSourcePortReceived().hashCode();
        }
        if (getDestinationPort() != null) {
            _hashCode += getDestinationPort().hashCode();
        }
        if (getEncapsulationVlanId() != null) {
            _hashCode += getEncapsulationVlanId().hashCode();
        }
        _hashCode += (isStripOriginalVlan() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMirroredPacketLength() != null) {
            _hashCode += getMirroredPacketLength().hashCode();
        }
        _hashCode += (isNormalTrafficAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSessionType() != null) {
            _hashCode += getSessionType().hashCode();
        }
        if (getSamplingRate() != null) {
            _hashCode += getSamplingRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMwareVspanSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortTransmitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourcePortTransmitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanPort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePortReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourcePortReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanPort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destinationPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanPort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encapsulationVlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "encapsulationVlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stripOriginalVlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "stripOriginalVlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mirroredPacketLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mirroredPacketLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalTrafficAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "normalTrafficAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sessionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samplingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "samplingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
