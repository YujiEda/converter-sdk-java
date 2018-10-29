/**
 * HostProxySwitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostProxySwitch  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String dvsUuid;

    private java.lang.String dvsName;

    private java.lang.String key;

    private int numPorts;

    private java.lang.Integer configNumPorts;

    private int numPortsAvailable;

    private com.vmware.converter.KeyValue[] uplinkPort;

    private java.lang.Integer mtu;

    private java.lang.String[] pnic;

    private com.vmware.converter.HostProxySwitchSpec spec;

    private com.vmware.converter.HostProxySwitchHostLagConfig[] hostLag;

    private java.lang.Boolean networkReservationSupported;

    public HostProxySwitch() {
    }

    public HostProxySwitch(
           java.lang.String dvsUuid,
           java.lang.String dvsName,
           java.lang.String key,
           int numPorts,
           java.lang.Integer configNumPorts,
           int numPortsAvailable,
           com.vmware.converter.KeyValue[] uplinkPort,
           java.lang.Integer mtu,
           java.lang.String[] pnic,
           com.vmware.converter.HostProxySwitchSpec spec,
           com.vmware.converter.HostProxySwitchHostLagConfig[] hostLag,
           java.lang.Boolean networkReservationSupported) {
        this.dvsUuid = dvsUuid;
        this.dvsName = dvsName;
        this.key = key;
        this.numPorts = numPorts;
        this.configNumPorts = configNumPorts;
        this.numPortsAvailable = numPortsAvailable;
        this.uplinkPort = uplinkPort;
        this.mtu = mtu;
        this.pnic = pnic;
        this.spec = spec;
        this.hostLag = hostLag;
        this.networkReservationSupported = networkReservationSupported;
    }


    /**
     * Gets the dvsUuid value for this HostProxySwitch.
     * 
     * @return dvsUuid
     */
    public java.lang.String getDvsUuid() {
        return dvsUuid;
    }


    /**
     * Sets the dvsUuid value for this HostProxySwitch.
     * 
     * @param dvsUuid
     */
    public void setDvsUuid(java.lang.String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }


    /**
     * Gets the dvsName value for this HostProxySwitch.
     * 
     * @return dvsName
     */
    public java.lang.String getDvsName() {
        return dvsName;
    }


    /**
     * Sets the dvsName value for this HostProxySwitch.
     * 
     * @param dvsName
     */
    public void setDvsName(java.lang.String dvsName) {
        this.dvsName = dvsName;
    }


    /**
     * Gets the key value for this HostProxySwitch.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostProxySwitch.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the numPorts value for this HostProxySwitch.
     * 
     * @return numPorts
     */
    public int getNumPorts() {
        return numPorts;
    }


    /**
     * Sets the numPorts value for this HostProxySwitch.
     * 
     * @param numPorts
     */
    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }


    /**
     * Gets the configNumPorts value for this HostProxySwitch.
     * 
     * @return configNumPorts
     */
    public java.lang.Integer getConfigNumPorts() {
        return configNumPorts;
    }


    /**
     * Sets the configNumPorts value for this HostProxySwitch.
     * 
     * @param configNumPorts
     */
    public void setConfigNumPorts(java.lang.Integer configNumPorts) {
        this.configNumPorts = configNumPorts;
    }


    /**
     * Gets the numPortsAvailable value for this HostProxySwitch.
     * 
     * @return numPortsAvailable
     */
    public int getNumPortsAvailable() {
        return numPortsAvailable;
    }


    /**
     * Sets the numPortsAvailable value for this HostProxySwitch.
     * 
     * @param numPortsAvailable
     */
    public void setNumPortsAvailable(int numPortsAvailable) {
        this.numPortsAvailable = numPortsAvailable;
    }


    /**
     * Gets the uplinkPort value for this HostProxySwitch.
     * 
     * @return uplinkPort
     */
    public com.vmware.converter.KeyValue[] getUplinkPort() {
        return uplinkPort;
    }


    /**
     * Sets the uplinkPort value for this HostProxySwitch.
     * 
     * @param uplinkPort
     */
    public void setUplinkPort(com.vmware.converter.KeyValue[] uplinkPort) {
        this.uplinkPort = uplinkPort;
    }

    public com.vmware.converter.KeyValue getUplinkPort(int i) {
        return this.uplinkPort[i];
    }

    public void setUplinkPort(int i, com.vmware.converter.KeyValue _value) {
        this.uplinkPort[i] = _value;
    }


    /**
     * Gets the mtu value for this HostProxySwitch.
     * 
     * @return mtu
     */
    public java.lang.Integer getMtu() {
        return mtu;
    }


    /**
     * Sets the mtu value for this HostProxySwitch.
     * 
     * @param mtu
     */
    public void setMtu(java.lang.Integer mtu) {
        this.mtu = mtu;
    }


    /**
     * Gets the pnic value for this HostProxySwitch.
     * 
     * @return pnic
     */
    public java.lang.String[] getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this HostProxySwitch.
     * 
     * @param pnic
     */
    public void setPnic(java.lang.String[] pnic) {
        this.pnic = pnic;
    }

    public java.lang.String getPnic(int i) {
        return this.pnic[i];
    }

    public void setPnic(int i, java.lang.String _value) {
        this.pnic[i] = _value;
    }


    /**
     * Gets the spec value for this HostProxySwitch.
     * 
     * @return spec
     */
    public com.vmware.converter.HostProxySwitchSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this HostProxySwitch.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.converter.HostProxySwitchSpec spec) {
        this.spec = spec;
    }


    /**
     * Gets the hostLag value for this HostProxySwitch.
     * 
     * @return hostLag
     */
    public com.vmware.converter.HostProxySwitchHostLagConfig[] getHostLag() {
        return hostLag;
    }


    /**
     * Sets the hostLag value for this HostProxySwitch.
     * 
     * @param hostLag
     */
    public void setHostLag(com.vmware.converter.HostProxySwitchHostLagConfig[] hostLag) {
        this.hostLag = hostLag;
    }

    public com.vmware.converter.HostProxySwitchHostLagConfig getHostLag(int i) {
        return this.hostLag[i];
    }

    public void setHostLag(int i, com.vmware.converter.HostProxySwitchHostLagConfig _value) {
        this.hostLag[i] = _value;
    }


    /**
     * Gets the networkReservationSupported value for this HostProxySwitch.
     * 
     * @return networkReservationSupported
     */
    public java.lang.Boolean getNetworkReservationSupported() {
        return networkReservationSupported;
    }


    /**
     * Sets the networkReservationSupported value for this HostProxySwitch.
     * 
     * @param networkReservationSupported
     */
    public void setNetworkReservationSupported(java.lang.Boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostProxySwitch)) return false;
        HostProxySwitch other = (HostProxySwitch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dvsUuid==null && other.getDvsUuid()==null) || 
             (this.dvsUuid!=null &&
              this.dvsUuid.equals(other.getDvsUuid()))) &&
            ((this.dvsName==null && other.getDvsName()==null) || 
             (this.dvsName!=null &&
              this.dvsName.equals(other.getDvsName()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            this.numPorts == other.getNumPorts() &&
            ((this.configNumPorts==null && other.getConfigNumPorts()==null) || 
             (this.configNumPorts!=null &&
              this.configNumPorts.equals(other.getConfigNumPorts()))) &&
            this.numPortsAvailable == other.getNumPortsAvailable() &&
            ((this.uplinkPort==null && other.getUplinkPort()==null) || 
             (this.uplinkPort!=null &&
              java.util.Arrays.equals(this.uplinkPort, other.getUplinkPort()))) &&
            ((this.mtu==null && other.getMtu()==null) || 
             (this.mtu!=null &&
              this.mtu.equals(other.getMtu()))) &&
            ((this.pnic==null && other.getPnic()==null) || 
             (this.pnic!=null &&
              java.util.Arrays.equals(this.pnic, other.getPnic()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec()))) &&
            ((this.hostLag==null && other.getHostLag()==null) || 
             (this.hostLag!=null &&
              java.util.Arrays.equals(this.hostLag, other.getHostLag()))) &&
            ((this.networkReservationSupported==null && other.getNetworkReservationSupported()==null) || 
             (this.networkReservationSupported!=null &&
              this.networkReservationSupported.equals(other.getNetworkReservationSupported())));
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
        if (getDvsUuid() != null) {
            _hashCode += getDvsUuid().hashCode();
        }
        if (getDvsName() != null) {
            _hashCode += getDvsName().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        _hashCode += getNumPorts();
        if (getConfigNumPorts() != null) {
            _hashCode += getConfigNumPorts().hashCode();
        }
        _hashCode += getNumPortsAvailable();
        if (getUplinkPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUplinkPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUplinkPort(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMtu() != null) {
            _hashCode += getMtu().hashCode();
        }
        if (getPnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        if (getHostLag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostLag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostLag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkReservationSupported() != null) {
            _hashCode += getNetworkReservationSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostProxySwitch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProxySwitch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configNumPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configNumPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPortsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numPortsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProxySwitchSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostLag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostLag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProxySwitchHostLagConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkReservationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkReservationSupported"));
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
