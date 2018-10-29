/**
 * HostRuntimeInfoNetStackInstanceRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostRuntimeInfoNetStackInstanceRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String netStackInstanceKey;

    private java.lang.String state;

    private java.lang.String[] vmknicKeys;

    private java.lang.Integer maxNumberOfConnections;

    private java.lang.Boolean currentIpV6Enabled;

    public HostRuntimeInfoNetStackInstanceRuntimeInfo() {
    }

    public HostRuntimeInfoNetStackInstanceRuntimeInfo(
           java.lang.String netStackInstanceKey,
           java.lang.String state,
           java.lang.String[] vmknicKeys,
           java.lang.Integer maxNumberOfConnections,
           java.lang.Boolean currentIpV6Enabled) {
        this.netStackInstanceKey = netStackInstanceKey;
        this.state = state;
        this.vmknicKeys = vmknicKeys;
        this.maxNumberOfConnections = maxNumberOfConnections;
        this.currentIpV6Enabled = currentIpV6Enabled;
    }


    /**
     * Gets the netStackInstanceKey value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @return netStackInstanceKey
     */
    public java.lang.String getNetStackInstanceKey() {
        return netStackInstanceKey;
    }


    /**
     * Sets the netStackInstanceKey value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @param netStackInstanceKey
     */
    public void setNetStackInstanceKey(java.lang.String netStackInstanceKey) {
        this.netStackInstanceKey = netStackInstanceKey;
    }


    /**
     * Gets the state value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the vmknicKeys value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @return vmknicKeys
     */
    public java.lang.String[] getVmknicKeys() {
        return vmknicKeys;
    }


    /**
     * Sets the vmknicKeys value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @param vmknicKeys
     */
    public void setVmknicKeys(java.lang.String[] vmknicKeys) {
        this.vmknicKeys = vmknicKeys;
    }

    public java.lang.String getVmknicKeys(int i) {
        return this.vmknicKeys[i];
    }

    public void setVmknicKeys(int i, java.lang.String _value) {
        this.vmknicKeys[i] = _value;
    }


    /**
     * Gets the maxNumberOfConnections value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @return maxNumberOfConnections
     */
    public java.lang.Integer getMaxNumberOfConnections() {
        return maxNumberOfConnections;
    }


    /**
     * Sets the maxNumberOfConnections value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @param maxNumberOfConnections
     */
    public void setMaxNumberOfConnections(java.lang.Integer maxNumberOfConnections) {
        this.maxNumberOfConnections = maxNumberOfConnections;
    }


    /**
     * Gets the currentIpV6Enabled value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @return currentIpV6Enabled
     */
    public java.lang.Boolean getCurrentIpV6Enabled() {
        return currentIpV6Enabled;
    }


    /**
     * Sets the currentIpV6Enabled value for this HostRuntimeInfoNetStackInstanceRuntimeInfo.
     * 
     * @param currentIpV6Enabled
     */
    public void setCurrentIpV6Enabled(java.lang.Boolean currentIpV6Enabled) {
        this.currentIpV6Enabled = currentIpV6Enabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostRuntimeInfoNetStackInstanceRuntimeInfo)) return false;
        HostRuntimeInfoNetStackInstanceRuntimeInfo other = (HostRuntimeInfoNetStackInstanceRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.netStackInstanceKey==null && other.getNetStackInstanceKey()==null) || 
             (this.netStackInstanceKey!=null &&
              this.netStackInstanceKey.equals(other.getNetStackInstanceKey()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.vmknicKeys==null && other.getVmknicKeys()==null) || 
             (this.vmknicKeys!=null &&
              java.util.Arrays.equals(this.vmknicKeys, other.getVmknicKeys()))) &&
            ((this.maxNumberOfConnections==null && other.getMaxNumberOfConnections()==null) || 
             (this.maxNumberOfConnections!=null &&
              this.maxNumberOfConnections.equals(other.getMaxNumberOfConnections()))) &&
            ((this.currentIpV6Enabled==null && other.getCurrentIpV6Enabled()==null) || 
             (this.currentIpV6Enabled!=null &&
              this.currentIpV6Enabled.equals(other.getCurrentIpV6Enabled())));
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
        if (getNetStackInstanceKey() != null) {
            _hashCode += getNetStackInstanceKey().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getVmknicKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmknicKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmknicKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxNumberOfConnections() != null) {
            _hashCode += getMaxNumberOfConnections().hashCode();
        }
        if (getCurrentIpV6Enabled() != null) {
            _hashCode += getCurrentIpV6Enabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostRuntimeInfoNetStackInstanceRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostRuntimeInfoNetStackInstanceRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netStackInstanceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "netStackInstanceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmknicKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmknicKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxNumberOfConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentIpV6Enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentIpV6Enabled"));
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
