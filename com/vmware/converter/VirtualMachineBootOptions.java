/**
 * VirtualMachineBootOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineBootOptions  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long bootDelay;

    private java.lang.Boolean enterBIOSSetup;

    private java.lang.Boolean bootRetryEnabled;

    private java.lang.Long bootRetryDelay;

    private com.vmware.converter.VirtualMachineBootOptionsBootableDevice[] bootOrder;

    private java.lang.String networkBootProtocol;

    public VirtualMachineBootOptions() {
    }

    public VirtualMachineBootOptions(
           java.lang.Long bootDelay,
           java.lang.Boolean enterBIOSSetup,
           java.lang.Boolean bootRetryEnabled,
           java.lang.Long bootRetryDelay,
           com.vmware.converter.VirtualMachineBootOptionsBootableDevice[] bootOrder,
           java.lang.String networkBootProtocol) {
        this.bootDelay = bootDelay;
        this.enterBIOSSetup = enterBIOSSetup;
        this.bootRetryEnabled = bootRetryEnabled;
        this.bootRetryDelay = bootRetryDelay;
        this.bootOrder = bootOrder;
        this.networkBootProtocol = networkBootProtocol;
    }


    /**
     * Gets the bootDelay value for this VirtualMachineBootOptions.
     * 
     * @return bootDelay
     */
    public java.lang.Long getBootDelay() {
        return bootDelay;
    }


    /**
     * Sets the bootDelay value for this VirtualMachineBootOptions.
     * 
     * @param bootDelay
     */
    public void setBootDelay(java.lang.Long bootDelay) {
        this.bootDelay = bootDelay;
    }


    /**
     * Gets the enterBIOSSetup value for this VirtualMachineBootOptions.
     * 
     * @return enterBIOSSetup
     */
    public java.lang.Boolean getEnterBIOSSetup() {
        return enterBIOSSetup;
    }


    /**
     * Sets the enterBIOSSetup value for this VirtualMachineBootOptions.
     * 
     * @param enterBIOSSetup
     */
    public void setEnterBIOSSetup(java.lang.Boolean enterBIOSSetup) {
        this.enterBIOSSetup = enterBIOSSetup;
    }


    /**
     * Gets the bootRetryEnabled value for this VirtualMachineBootOptions.
     * 
     * @return bootRetryEnabled
     */
    public java.lang.Boolean getBootRetryEnabled() {
        return bootRetryEnabled;
    }


    /**
     * Sets the bootRetryEnabled value for this VirtualMachineBootOptions.
     * 
     * @param bootRetryEnabled
     */
    public void setBootRetryEnabled(java.lang.Boolean bootRetryEnabled) {
        this.bootRetryEnabled = bootRetryEnabled;
    }


    /**
     * Gets the bootRetryDelay value for this VirtualMachineBootOptions.
     * 
     * @return bootRetryDelay
     */
    public java.lang.Long getBootRetryDelay() {
        return bootRetryDelay;
    }


    /**
     * Sets the bootRetryDelay value for this VirtualMachineBootOptions.
     * 
     * @param bootRetryDelay
     */
    public void setBootRetryDelay(java.lang.Long bootRetryDelay) {
        this.bootRetryDelay = bootRetryDelay;
    }


    /**
     * Gets the bootOrder value for this VirtualMachineBootOptions.
     * 
     * @return bootOrder
     */
    public com.vmware.converter.VirtualMachineBootOptionsBootableDevice[] getBootOrder() {
        return bootOrder;
    }


    /**
     * Sets the bootOrder value for this VirtualMachineBootOptions.
     * 
     * @param bootOrder
     */
    public void setBootOrder(com.vmware.converter.VirtualMachineBootOptionsBootableDevice[] bootOrder) {
        this.bootOrder = bootOrder;
    }

    public com.vmware.converter.VirtualMachineBootOptionsBootableDevice getBootOrder(int i) {
        return this.bootOrder[i];
    }

    public void setBootOrder(int i, com.vmware.converter.VirtualMachineBootOptionsBootableDevice _value) {
        this.bootOrder[i] = _value;
    }


    /**
     * Gets the networkBootProtocol value for this VirtualMachineBootOptions.
     * 
     * @return networkBootProtocol
     */
    public java.lang.String getNetworkBootProtocol() {
        return networkBootProtocol;
    }


    /**
     * Sets the networkBootProtocol value for this VirtualMachineBootOptions.
     * 
     * @param networkBootProtocol
     */
    public void setNetworkBootProtocol(java.lang.String networkBootProtocol) {
        this.networkBootProtocol = networkBootProtocol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineBootOptions)) return false;
        VirtualMachineBootOptions other = (VirtualMachineBootOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bootDelay==null && other.getBootDelay()==null) || 
             (this.bootDelay!=null &&
              this.bootDelay.equals(other.getBootDelay()))) &&
            ((this.enterBIOSSetup==null && other.getEnterBIOSSetup()==null) || 
             (this.enterBIOSSetup!=null &&
              this.enterBIOSSetup.equals(other.getEnterBIOSSetup()))) &&
            ((this.bootRetryEnabled==null && other.getBootRetryEnabled()==null) || 
             (this.bootRetryEnabled!=null &&
              this.bootRetryEnabled.equals(other.getBootRetryEnabled()))) &&
            ((this.bootRetryDelay==null && other.getBootRetryDelay()==null) || 
             (this.bootRetryDelay!=null &&
              this.bootRetryDelay.equals(other.getBootRetryDelay()))) &&
            ((this.bootOrder==null && other.getBootOrder()==null) || 
             (this.bootOrder!=null &&
              java.util.Arrays.equals(this.bootOrder, other.getBootOrder()))) &&
            ((this.networkBootProtocol==null && other.getNetworkBootProtocol()==null) || 
             (this.networkBootProtocol!=null &&
              this.networkBootProtocol.equals(other.getNetworkBootProtocol())));
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
        if (getBootDelay() != null) {
            _hashCode += getBootDelay().hashCode();
        }
        if (getEnterBIOSSetup() != null) {
            _hashCode += getEnterBIOSSetup().hashCode();
        }
        if (getBootRetryEnabled() != null) {
            _hashCode += getBootRetryEnabled().hashCode();
        }
        if (getBootRetryDelay() != null) {
            _hashCode += getBootRetryDelay().hashCode();
        }
        if (getBootOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBootOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBootOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkBootProtocol() != null) {
            _hashCode += getNetworkBootProtocol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineBootOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineBootOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterBIOSSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enterBIOSSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootRetryEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootRetryEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootRetryDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootRetryDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineBootOptionsBootableDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkBootProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkBootProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
