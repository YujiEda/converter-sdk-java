/**
 * ConverterBasicHardwareInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterBasicHardwareInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Integer numCPUs;

    private java.lang.Integer numCoresPerSocket;

    private java.lang.Long memoryMB;

    public ConverterBasicHardwareInfo() {
    }

    public ConverterBasicHardwareInfo(
           java.lang.Integer numCPUs,
           java.lang.Integer numCoresPerSocket,
           java.lang.Long memoryMB) {
        this.numCPUs = numCPUs;
        this.numCoresPerSocket = numCoresPerSocket;
        this.memoryMB = memoryMB;
    }


    /**
     * Gets the numCPUs value for this ConverterBasicHardwareInfo.
     * 
     * @return numCPUs
     */
    public java.lang.Integer getNumCPUs() {
        return numCPUs;
    }


    /**
     * Sets the numCPUs value for this ConverterBasicHardwareInfo.
     * 
     * @param numCPUs
     */
    public void setNumCPUs(java.lang.Integer numCPUs) {
        this.numCPUs = numCPUs;
    }


    /**
     * Gets the numCoresPerSocket value for this ConverterBasicHardwareInfo.
     * 
     * @return numCoresPerSocket
     */
    public java.lang.Integer getNumCoresPerSocket() {
        return numCoresPerSocket;
    }


    /**
     * Sets the numCoresPerSocket value for this ConverterBasicHardwareInfo.
     * 
     * @param numCoresPerSocket
     */
    public void setNumCoresPerSocket(java.lang.Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }


    /**
     * Gets the memoryMB value for this ConverterBasicHardwareInfo.
     * 
     * @return memoryMB
     */
    public java.lang.Long getMemoryMB() {
        return memoryMB;
    }


    /**
     * Sets the memoryMB value for this ConverterBasicHardwareInfo.
     * 
     * @param memoryMB
     */
    public void setMemoryMB(java.lang.Long memoryMB) {
        this.memoryMB = memoryMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterBasicHardwareInfo)) return false;
        ConverterBasicHardwareInfo other = (ConverterBasicHardwareInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numCPUs==null && other.getNumCPUs()==null) || 
             (this.numCPUs!=null &&
              this.numCPUs.equals(other.getNumCPUs()))) &&
            ((this.numCoresPerSocket==null && other.getNumCoresPerSocket()==null) || 
             (this.numCoresPerSocket!=null &&
              this.numCoresPerSocket.equals(other.getNumCoresPerSocket()))) &&
            ((this.memoryMB==null && other.getMemoryMB()==null) || 
             (this.memoryMB!=null &&
              this.memoryMB.equals(other.getMemoryMB())));
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
        if (getNumCPUs() != null) {
            _hashCode += getNumCPUs().hashCode();
        }
        if (getNumCoresPerSocket() != null) {
            _hashCode += getNumCoresPerSocket().hashCode();
        }
        if (getMemoryMB() != null) {
            _hashCode += getMemoryMB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterBasicHardwareInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBasicHardwareInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCPUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "numCPUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCoresPerSocket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "numCoresPerSocket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "memoryMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
