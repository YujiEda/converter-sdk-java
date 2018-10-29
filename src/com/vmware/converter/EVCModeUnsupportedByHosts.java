/**
 * EVCModeUnsupportedByHosts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EVCModeUnsupportedByHosts  extends com.vmware.converter.EVCConfigFault  implements java.io.Serializable {
    private java.lang.String evcMode;

    private com.vmware.converter.ManagedObjectReference[] host;

    private java.lang.String[] hostName;

    public EVCModeUnsupportedByHosts() {
    }

    public EVCModeUnsupportedByHosts(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.LocalizedMethodFault[] faults,
           java.lang.String evcMode,
           com.vmware.converter.ManagedObjectReference[] host,
           java.lang.String[] hostName) {
        super(
            faultCause,
            faultMessage,
            faults);
        this.evcMode = evcMode;
        this.host = host;
        this.hostName = hostName;
    }


    /**
     * Gets the evcMode value for this EVCModeUnsupportedByHosts.
     * 
     * @return evcMode
     */
    public java.lang.String getEvcMode() {
        return evcMode;
    }


    /**
     * Sets the evcMode value for this EVCModeUnsupportedByHosts.
     * 
     * @param evcMode
     */
    public void setEvcMode(java.lang.String evcMode) {
        this.evcMode = evcMode;
    }


    /**
     * Gets the host value for this EVCModeUnsupportedByHosts.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference[] getHost() {
        return host;
    }


    /**
     * Sets the host value for this EVCModeUnsupportedByHosts.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference[] host) {
        this.host = host;
    }

    public com.vmware.converter.ManagedObjectReference getHost(int i) {
        return this.host[i];
    }

    public void setHost(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.host[i] = _value;
    }


    /**
     * Gets the hostName value for this EVCModeUnsupportedByHosts.
     * 
     * @return hostName
     */
    public java.lang.String[] getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this EVCModeUnsupportedByHosts.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String[] hostName) {
        this.hostName = hostName;
    }

    public java.lang.String getHostName(int i) {
        return this.hostName[i];
    }

    public void setHostName(int i, java.lang.String _value) {
        this.hostName[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVCModeUnsupportedByHosts)) return false;
        EVCModeUnsupportedByHosts other = (EVCModeUnsupportedByHosts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.evcMode==null && other.getEvcMode()==null) || 
             (this.evcMode!=null &&
              this.evcMode.equals(other.getEvcMode()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              java.util.Arrays.equals(this.host, other.getHost()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              java.util.Arrays.equals(this.hostName, other.getHostName())));
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
        if (getEvcMode() != null) {
            _hashCode += getEvcMode().hashCode();
        }
        if (getHost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHostName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostName(), i);
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
        new org.apache.axis.description.TypeDesc(EVCModeUnsupportedByHosts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCModeUnsupportedByHosts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evcMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "evcMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
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
