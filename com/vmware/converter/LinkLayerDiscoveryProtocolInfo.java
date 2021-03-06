/**
 * LinkLayerDiscoveryProtocolInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class LinkLayerDiscoveryProtocolInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String chassisId;

    private java.lang.String portId;

    private int timeToLive;

    private com.vmware.converter.KeyAnyValue[] parameter;

    public LinkLayerDiscoveryProtocolInfo() {
    }

    public LinkLayerDiscoveryProtocolInfo(
           java.lang.String chassisId,
           java.lang.String portId,
           int timeToLive,
           com.vmware.converter.KeyAnyValue[] parameter) {
        this.chassisId = chassisId;
        this.portId = portId;
        this.timeToLive = timeToLive;
        this.parameter = parameter;
    }


    /**
     * Gets the chassisId value for this LinkLayerDiscoveryProtocolInfo.
     * 
     * @return chassisId
     */
    public java.lang.String getChassisId() {
        return chassisId;
    }


    /**
     * Sets the chassisId value for this LinkLayerDiscoveryProtocolInfo.
     * 
     * @param chassisId
     */
    public void setChassisId(java.lang.String chassisId) {
        this.chassisId = chassisId;
    }


    /**
     * Gets the portId value for this LinkLayerDiscoveryProtocolInfo.
     * 
     * @return portId
     */
    public java.lang.String getPortId() {
        return portId;
    }


    /**
     * Sets the portId value for this LinkLayerDiscoveryProtocolInfo.
     * 
     * @param portId
     */
    public void setPortId(java.lang.String portId) {
        this.portId = portId;
    }


    /**
     * Gets the timeToLive value for this LinkLayerDiscoveryProtocolInfo.
     * 
     * @return timeToLive
     */
    public int getTimeToLive() {
        return timeToLive;
    }


    /**
     * Sets the timeToLive value for this LinkLayerDiscoveryProtocolInfo.
     * 
     * @param timeToLive
     */
    public void setTimeToLive(int timeToLive) {
        this.timeToLive = timeToLive;
    }


    /**
     * Gets the parameter value for this LinkLayerDiscoveryProtocolInfo.
     * 
     * @return parameter
     */
    public com.vmware.converter.KeyAnyValue[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this LinkLayerDiscoveryProtocolInfo.
     * 
     * @param parameter
     */
    public void setParameter(com.vmware.converter.KeyAnyValue[] parameter) {
        this.parameter = parameter;
    }

    public com.vmware.converter.KeyAnyValue getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, com.vmware.converter.KeyAnyValue _value) {
        this.parameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkLayerDiscoveryProtocolInfo)) return false;
        LinkLayerDiscoveryProtocolInfo other = (LinkLayerDiscoveryProtocolInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chassisId==null && other.getChassisId()==null) || 
             (this.chassisId!=null &&
              this.chassisId.equals(other.getChassisId()))) &&
            ((this.portId==null && other.getPortId()==null) || 
             (this.portId!=null &&
              this.portId.equals(other.getPortId()))) &&
            this.timeToLive == other.getTimeToLive() &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              java.util.Arrays.equals(this.parameter, other.getParameter())));
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
        if (getChassisId() != null) {
            _hashCode += getChassisId().hashCode();
        }
        if (getPortId() != null) {
            _hashCode += getPortId().hashCode();
        }
        _hashCode += getTimeToLive();
        if (getParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameter(), i);
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
        new org.apache.axis.description.TypeDesc(LinkLayerDiscoveryProtocolInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LinkLayerDiscoveryProtocolInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chassisId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chassisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToLive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "timeToLive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyAnyValue"));
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
