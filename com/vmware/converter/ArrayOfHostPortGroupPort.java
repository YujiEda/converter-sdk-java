/**
 * ArrayOfHostPortGroupPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostPortGroupPort  implements java.io.Serializable {
    private com.vmware.converter.HostPortGroupPort[] hostPortGroupPort;

    public ArrayOfHostPortGroupPort() {
    }

    public ArrayOfHostPortGroupPort(
           com.vmware.converter.HostPortGroupPort[] hostPortGroupPort) {
           this.hostPortGroupPort = hostPortGroupPort;
    }


    /**
     * Gets the hostPortGroupPort value for this ArrayOfHostPortGroupPort.
     * 
     * @return hostPortGroupPort
     */
    public com.vmware.converter.HostPortGroupPort[] getHostPortGroupPort() {
        return hostPortGroupPort;
    }


    /**
     * Sets the hostPortGroupPort value for this ArrayOfHostPortGroupPort.
     * 
     * @param hostPortGroupPort
     */
    public void setHostPortGroupPort(com.vmware.converter.HostPortGroupPort[] hostPortGroupPort) {
        this.hostPortGroupPort = hostPortGroupPort;
    }

    public com.vmware.converter.HostPortGroupPort getHostPortGroupPort(int i) {
        return this.hostPortGroupPort[i];
    }

    public void setHostPortGroupPort(int i, com.vmware.converter.HostPortGroupPort _value) {
        this.hostPortGroupPort[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPortGroupPort)) return false;
        ArrayOfHostPortGroupPort other = (ArrayOfHostPortGroupPort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPortGroupPort==null && other.getHostPortGroupPort()==null) || 
             (this.hostPortGroupPort!=null &&
              java.util.Arrays.equals(this.hostPortGroupPort, other.getHostPortGroupPort())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHostPortGroupPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPortGroupPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPortGroupPort(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPortGroupPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPortGroupPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPortGroupPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPortGroupPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPortGroupPort"));
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
