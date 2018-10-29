/**
 * VMwareVspanPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareVspanPort  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String[] portKey;

    private java.lang.String[] uplinkPortName;

    private java.lang.String[] wildcardPortConnecteeType;

    private int[] vlans;

    private java.lang.String[] ipAddress;

    public VMwareVspanPort() {
    }

    public VMwareVspanPort(
           java.lang.String[] portKey,
           java.lang.String[] uplinkPortName,
           java.lang.String[] wildcardPortConnecteeType,
           int[] vlans,
           java.lang.String[] ipAddress) {
        this.portKey = portKey;
        this.uplinkPortName = uplinkPortName;
        this.wildcardPortConnecteeType = wildcardPortConnecteeType;
        this.vlans = vlans;
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the portKey value for this VMwareVspanPort.
     * 
     * @return portKey
     */
    public java.lang.String[] getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this VMwareVspanPort.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String[] portKey) {
        this.portKey = portKey;
    }

    public java.lang.String getPortKey(int i) {
        return this.portKey[i];
    }

    public void setPortKey(int i, java.lang.String _value) {
        this.portKey[i] = _value;
    }


    /**
     * Gets the uplinkPortName value for this VMwareVspanPort.
     * 
     * @return uplinkPortName
     */
    public java.lang.String[] getUplinkPortName() {
        return uplinkPortName;
    }


    /**
     * Sets the uplinkPortName value for this VMwareVspanPort.
     * 
     * @param uplinkPortName
     */
    public void setUplinkPortName(java.lang.String[] uplinkPortName) {
        this.uplinkPortName = uplinkPortName;
    }

    public java.lang.String getUplinkPortName(int i) {
        return this.uplinkPortName[i];
    }

    public void setUplinkPortName(int i, java.lang.String _value) {
        this.uplinkPortName[i] = _value;
    }


    /**
     * Gets the wildcardPortConnecteeType value for this VMwareVspanPort.
     * 
     * @return wildcardPortConnecteeType
     */
    public java.lang.String[] getWildcardPortConnecteeType() {
        return wildcardPortConnecteeType;
    }


    /**
     * Sets the wildcardPortConnecteeType value for this VMwareVspanPort.
     * 
     * @param wildcardPortConnecteeType
     */
    public void setWildcardPortConnecteeType(java.lang.String[] wildcardPortConnecteeType) {
        this.wildcardPortConnecteeType = wildcardPortConnecteeType;
    }

    public java.lang.String getWildcardPortConnecteeType(int i) {
        return this.wildcardPortConnecteeType[i];
    }

    public void setWildcardPortConnecteeType(int i, java.lang.String _value) {
        this.wildcardPortConnecteeType[i] = _value;
    }


    /**
     * Gets the vlans value for this VMwareVspanPort.
     * 
     * @return vlans
     */
    public int[] getVlans() {
        return vlans;
    }


    /**
     * Sets the vlans value for this VMwareVspanPort.
     * 
     * @param vlans
     */
    public void setVlans(int[] vlans) {
        this.vlans = vlans;
    }

    public int getVlans(int i) {
        return this.vlans[i];
    }

    public void setVlans(int i, int _value) {
        this.vlans[i] = _value;
    }


    /**
     * Gets the ipAddress value for this VMwareVspanPort.
     * 
     * @return ipAddress
     */
    public java.lang.String[] getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this VMwareVspanPort.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public java.lang.String getIpAddress(int i) {
        return this.ipAddress[i];
    }

    public void setIpAddress(int i, java.lang.String _value) {
        this.ipAddress[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareVspanPort)) return false;
        VMwareVspanPort other = (VMwareVspanPort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.portKey==null && other.getPortKey()==null) || 
             (this.portKey!=null &&
              java.util.Arrays.equals(this.portKey, other.getPortKey()))) &&
            ((this.uplinkPortName==null && other.getUplinkPortName()==null) || 
             (this.uplinkPortName!=null &&
              java.util.Arrays.equals(this.uplinkPortName, other.getUplinkPortName()))) &&
            ((this.wildcardPortConnecteeType==null && other.getWildcardPortConnecteeType()==null) || 
             (this.wildcardPortConnecteeType!=null &&
              java.util.Arrays.equals(this.wildcardPortConnecteeType, other.getWildcardPortConnecteeType()))) &&
            ((this.vlans==null && other.getVlans()==null) || 
             (this.vlans!=null &&
              java.util.Arrays.equals(this.vlans, other.getVlans()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              java.util.Arrays.equals(this.ipAddress, other.getIpAddress())));
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
        if (getPortKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUplinkPortName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUplinkPortName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUplinkPortName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWildcardPortConnecteeType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWildcardPortConnecteeType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWildcardPortConnecteeType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAddress(), i);
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
        new org.apache.axis.description.TypeDesc(VMwareVspanPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareVspanPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wildcardPortConnecteeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wildcardPortConnecteeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlans");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
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
