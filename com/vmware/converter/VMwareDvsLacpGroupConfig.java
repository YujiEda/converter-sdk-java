/**
 * VMwareDvsLacpGroupConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDvsLacpGroupConfig  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String name;

    private java.lang.String mode;

    private java.lang.Integer uplinkNum;

    private java.lang.String loadbalanceAlgorithm;

    private com.vmware.converter.VMwareDvsLagVlanConfig vlan;

    private com.vmware.converter.VMwareDvsLagIpfixConfig ipfix;

    private java.lang.String[] uplinkName;

    private java.lang.String[] uplinkPortKey;

    public VMwareDvsLacpGroupConfig() {
    }

    public VMwareDvsLacpGroupConfig(
           java.lang.String key,
           java.lang.String name,
           java.lang.String mode,
           java.lang.Integer uplinkNum,
           java.lang.String loadbalanceAlgorithm,
           com.vmware.converter.VMwareDvsLagVlanConfig vlan,
           com.vmware.converter.VMwareDvsLagIpfixConfig ipfix,
           java.lang.String[] uplinkName,
           java.lang.String[] uplinkPortKey) {
        this.key = key;
        this.name = name;
        this.mode = mode;
        this.uplinkNum = uplinkNum;
        this.loadbalanceAlgorithm = loadbalanceAlgorithm;
        this.vlan = vlan;
        this.ipfix = ipfix;
        this.uplinkName = uplinkName;
        this.uplinkPortKey = uplinkPortKey;
    }


    /**
     * Gets the key value for this VMwareDvsLacpGroupConfig.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this VMwareDvsLacpGroupConfig.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the name value for this VMwareDvsLacpGroupConfig.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VMwareDvsLacpGroupConfig.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the mode value for this VMwareDvsLacpGroupConfig.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this VMwareDvsLacpGroupConfig.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }


    /**
     * Gets the uplinkNum value for this VMwareDvsLacpGroupConfig.
     * 
     * @return uplinkNum
     */
    public java.lang.Integer getUplinkNum() {
        return uplinkNum;
    }


    /**
     * Sets the uplinkNum value for this VMwareDvsLacpGroupConfig.
     * 
     * @param uplinkNum
     */
    public void setUplinkNum(java.lang.Integer uplinkNum) {
        this.uplinkNum = uplinkNum;
    }


    /**
     * Gets the loadbalanceAlgorithm value for this VMwareDvsLacpGroupConfig.
     * 
     * @return loadbalanceAlgorithm
     */
    public java.lang.String getLoadbalanceAlgorithm() {
        return loadbalanceAlgorithm;
    }


    /**
     * Sets the loadbalanceAlgorithm value for this VMwareDvsLacpGroupConfig.
     * 
     * @param loadbalanceAlgorithm
     */
    public void setLoadbalanceAlgorithm(java.lang.String loadbalanceAlgorithm) {
        this.loadbalanceAlgorithm = loadbalanceAlgorithm;
    }


    /**
     * Gets the vlan value for this VMwareDvsLacpGroupConfig.
     * 
     * @return vlan
     */
    public com.vmware.converter.VMwareDvsLagVlanConfig getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this VMwareDvsLacpGroupConfig.
     * 
     * @param vlan
     */
    public void setVlan(com.vmware.converter.VMwareDvsLagVlanConfig vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the ipfix value for this VMwareDvsLacpGroupConfig.
     * 
     * @return ipfix
     */
    public com.vmware.converter.VMwareDvsLagIpfixConfig getIpfix() {
        return ipfix;
    }


    /**
     * Sets the ipfix value for this VMwareDvsLacpGroupConfig.
     * 
     * @param ipfix
     */
    public void setIpfix(com.vmware.converter.VMwareDvsLagIpfixConfig ipfix) {
        this.ipfix = ipfix;
    }


    /**
     * Gets the uplinkName value for this VMwareDvsLacpGroupConfig.
     * 
     * @return uplinkName
     */
    public java.lang.String[] getUplinkName() {
        return uplinkName;
    }


    /**
     * Sets the uplinkName value for this VMwareDvsLacpGroupConfig.
     * 
     * @param uplinkName
     */
    public void setUplinkName(java.lang.String[] uplinkName) {
        this.uplinkName = uplinkName;
    }

    public java.lang.String getUplinkName(int i) {
        return this.uplinkName[i];
    }

    public void setUplinkName(int i, java.lang.String _value) {
        this.uplinkName[i] = _value;
    }


    /**
     * Gets the uplinkPortKey value for this VMwareDvsLacpGroupConfig.
     * 
     * @return uplinkPortKey
     */
    public java.lang.String[] getUplinkPortKey() {
        return uplinkPortKey;
    }


    /**
     * Sets the uplinkPortKey value for this VMwareDvsLacpGroupConfig.
     * 
     * @param uplinkPortKey
     */
    public void setUplinkPortKey(java.lang.String[] uplinkPortKey) {
        this.uplinkPortKey = uplinkPortKey;
    }

    public java.lang.String getUplinkPortKey(int i) {
        return this.uplinkPortKey[i];
    }

    public void setUplinkPortKey(int i, java.lang.String _value) {
        this.uplinkPortKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDvsLacpGroupConfig)) return false;
        VMwareDvsLacpGroupConfig other = (VMwareDvsLacpGroupConfig) obj;
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
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.uplinkNum==null && other.getUplinkNum()==null) || 
             (this.uplinkNum!=null &&
              this.uplinkNum.equals(other.getUplinkNum()))) &&
            ((this.loadbalanceAlgorithm==null && other.getLoadbalanceAlgorithm()==null) || 
             (this.loadbalanceAlgorithm!=null &&
              this.loadbalanceAlgorithm.equals(other.getLoadbalanceAlgorithm()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.ipfix==null && other.getIpfix()==null) || 
             (this.ipfix!=null &&
              this.ipfix.equals(other.getIpfix()))) &&
            ((this.uplinkName==null && other.getUplinkName()==null) || 
             (this.uplinkName!=null &&
              java.util.Arrays.equals(this.uplinkName, other.getUplinkName()))) &&
            ((this.uplinkPortKey==null && other.getUplinkPortKey()==null) || 
             (this.uplinkPortKey!=null &&
              java.util.Arrays.equals(this.uplinkPortKey, other.getUplinkPortKey())));
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
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getUplinkNum() != null) {
            _hashCode += getUplinkNum().hashCode();
        }
        if (getLoadbalanceAlgorithm() != null) {
            _hashCode += getLoadbalanceAlgorithm().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getIpfix() != null) {
            _hashCode += getIpfix().hashCode();
        }
        if (getUplinkName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUplinkName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUplinkName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUplinkPortKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUplinkPortKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUplinkPortKey(), i);
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
        new org.apache.axis.description.TypeDesc(VMwareDvsLacpGroupConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLacpGroupConfig"));
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
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadbalanceAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "loadbalanceAlgorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLagVlanConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipfix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipfix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDvsLagIpfixConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortKey"));
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
