/**
 * VirtualHardware.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualHardware  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int numCPU;

    private java.lang.Integer numCoresPerSocket;

    private int memoryMB;

    private java.lang.Boolean virtualICH7MPresent;

    private java.lang.Boolean virtualSMCPresent;

    private com.vmware.converter.VirtualDevice[] device;

    public VirtualHardware() {
    }

    public VirtualHardware(
           int numCPU,
           java.lang.Integer numCoresPerSocket,
           int memoryMB,
           java.lang.Boolean virtualICH7MPresent,
           java.lang.Boolean virtualSMCPresent,
           com.vmware.converter.VirtualDevice[] device) {
        this.numCPU = numCPU;
        this.numCoresPerSocket = numCoresPerSocket;
        this.memoryMB = memoryMB;
        this.virtualICH7MPresent = virtualICH7MPresent;
        this.virtualSMCPresent = virtualSMCPresent;
        this.device = device;
    }


    /**
     * Gets the numCPU value for this VirtualHardware.
     * 
     * @return numCPU
     */
    public int getNumCPU() {
        return numCPU;
    }


    /**
     * Sets the numCPU value for this VirtualHardware.
     * 
     * @param numCPU
     */
    public void setNumCPU(int numCPU) {
        this.numCPU = numCPU;
    }


    /**
     * Gets the numCoresPerSocket value for this VirtualHardware.
     * 
     * @return numCoresPerSocket
     */
    public java.lang.Integer getNumCoresPerSocket() {
        return numCoresPerSocket;
    }


    /**
     * Sets the numCoresPerSocket value for this VirtualHardware.
     * 
     * @param numCoresPerSocket
     */
    public void setNumCoresPerSocket(java.lang.Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }


    /**
     * Gets the memoryMB value for this VirtualHardware.
     * 
     * @return memoryMB
     */
    public int getMemoryMB() {
        return memoryMB;
    }


    /**
     * Sets the memoryMB value for this VirtualHardware.
     * 
     * @param memoryMB
     */
    public void setMemoryMB(int memoryMB) {
        this.memoryMB = memoryMB;
    }


    /**
     * Gets the virtualICH7MPresent value for this VirtualHardware.
     * 
     * @return virtualICH7MPresent
     */
    public java.lang.Boolean getVirtualICH7MPresent() {
        return virtualICH7MPresent;
    }


    /**
     * Sets the virtualICH7MPresent value for this VirtualHardware.
     * 
     * @param virtualICH7MPresent
     */
    public void setVirtualICH7MPresent(java.lang.Boolean virtualICH7MPresent) {
        this.virtualICH7MPresent = virtualICH7MPresent;
    }


    /**
     * Gets the virtualSMCPresent value for this VirtualHardware.
     * 
     * @return virtualSMCPresent
     */
    public java.lang.Boolean getVirtualSMCPresent() {
        return virtualSMCPresent;
    }


    /**
     * Sets the virtualSMCPresent value for this VirtualHardware.
     * 
     * @param virtualSMCPresent
     */
    public void setVirtualSMCPresent(java.lang.Boolean virtualSMCPresent) {
        this.virtualSMCPresent = virtualSMCPresent;
    }


    /**
     * Gets the device value for this VirtualHardware.
     * 
     * @return device
     */
    public com.vmware.converter.VirtualDevice[] getDevice() {
        return device;
    }


    /**
     * Sets the device value for this VirtualHardware.
     * 
     * @param device
     */
    public void setDevice(com.vmware.converter.VirtualDevice[] device) {
        this.device = device;
    }

    public com.vmware.converter.VirtualDevice getDevice(int i) {
        return this.device[i];
    }

    public void setDevice(int i, com.vmware.converter.VirtualDevice _value) {
        this.device[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualHardware)) return false;
        VirtualHardware other = (VirtualHardware) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.numCPU == other.getNumCPU() &&
            ((this.numCoresPerSocket==null && other.getNumCoresPerSocket()==null) || 
             (this.numCoresPerSocket!=null &&
              this.numCoresPerSocket.equals(other.getNumCoresPerSocket()))) &&
            this.memoryMB == other.getMemoryMB() &&
            ((this.virtualICH7MPresent==null && other.getVirtualICH7MPresent()==null) || 
             (this.virtualICH7MPresent!=null &&
              this.virtualICH7MPresent.equals(other.getVirtualICH7MPresent()))) &&
            ((this.virtualSMCPresent==null && other.getVirtualSMCPresent()==null) || 
             (this.virtualSMCPresent!=null &&
              this.virtualSMCPresent.equals(other.getVirtualSMCPresent()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              java.util.Arrays.equals(this.device, other.getDevice())));
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
        _hashCode += getNumCPU();
        if (getNumCoresPerSocket() != null) {
            _hashCode += getNumCoresPerSocket().hashCode();
        }
        _hashCode += getMemoryMB();
        if (getVirtualICH7MPresent() != null) {
            _hashCode += getVirtualICH7MPresent().hashCode();
        }
        if (getVirtualSMCPresent() != null) {
            _hashCode += getVirtualSMCPresent().hashCode();
        }
        if (getDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevice(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualHardware.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualHardware"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCPU");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCPU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCoresPerSocket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCoresPerSocket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualICH7MPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualICH7MPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualSMCPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualSMCPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDevice"));
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
