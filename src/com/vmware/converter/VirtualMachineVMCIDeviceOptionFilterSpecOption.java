/**
 * VirtualMachineVMCIDeviceOptionFilterSpecOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineVMCIDeviceOptionFilterSpecOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ChoiceOption action;

    private com.vmware.converter.ChoiceOption protocol;

    private com.vmware.converter.ChoiceOption direction;

    private com.vmware.converter.LongOption lowerDstPortBoundary;

    private com.vmware.converter.LongOption upperDstPortBoundary;

    public VirtualMachineVMCIDeviceOptionFilterSpecOption() {
    }

    public VirtualMachineVMCIDeviceOptionFilterSpecOption(
           com.vmware.converter.ChoiceOption action,
           com.vmware.converter.ChoiceOption protocol,
           com.vmware.converter.ChoiceOption direction,
           com.vmware.converter.LongOption lowerDstPortBoundary,
           com.vmware.converter.LongOption upperDstPortBoundary) {
        this.action = action;
        this.protocol = protocol;
        this.direction = direction;
        this.lowerDstPortBoundary = lowerDstPortBoundary;
        this.upperDstPortBoundary = upperDstPortBoundary;
    }


    /**
     * Gets the action value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @return action
     */
    public com.vmware.converter.ChoiceOption getAction() {
        return action;
    }


    /**
     * Sets the action value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @param action
     */
    public void setAction(com.vmware.converter.ChoiceOption action) {
        this.action = action;
    }


    /**
     * Gets the protocol value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @return protocol
     */
    public com.vmware.converter.ChoiceOption getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @param protocol
     */
    public void setProtocol(com.vmware.converter.ChoiceOption protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the direction value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @return direction
     */
    public com.vmware.converter.ChoiceOption getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @param direction
     */
    public void setDirection(com.vmware.converter.ChoiceOption direction) {
        this.direction = direction;
    }


    /**
     * Gets the lowerDstPortBoundary value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @return lowerDstPortBoundary
     */
    public com.vmware.converter.LongOption getLowerDstPortBoundary() {
        return lowerDstPortBoundary;
    }


    /**
     * Sets the lowerDstPortBoundary value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @param lowerDstPortBoundary
     */
    public void setLowerDstPortBoundary(com.vmware.converter.LongOption lowerDstPortBoundary) {
        this.lowerDstPortBoundary = lowerDstPortBoundary;
    }


    /**
     * Gets the upperDstPortBoundary value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @return upperDstPortBoundary
     */
    public com.vmware.converter.LongOption getUpperDstPortBoundary() {
        return upperDstPortBoundary;
    }


    /**
     * Sets the upperDstPortBoundary value for this VirtualMachineVMCIDeviceOptionFilterSpecOption.
     * 
     * @param upperDstPortBoundary
     */
    public void setUpperDstPortBoundary(com.vmware.converter.LongOption upperDstPortBoundary) {
        this.upperDstPortBoundary = upperDstPortBoundary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineVMCIDeviceOptionFilterSpecOption)) return false;
        VirtualMachineVMCIDeviceOptionFilterSpecOption other = (VirtualMachineVMCIDeviceOptionFilterSpecOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.lowerDstPortBoundary==null && other.getLowerDstPortBoundary()==null) || 
             (this.lowerDstPortBoundary!=null &&
              this.lowerDstPortBoundary.equals(other.getLowerDstPortBoundary()))) &&
            ((this.upperDstPortBoundary==null && other.getUpperDstPortBoundary()==null) || 
             (this.upperDstPortBoundary!=null &&
              this.upperDstPortBoundary.equals(other.getUpperDstPortBoundary())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getLowerDstPortBoundary() != null) {
            _hashCode += getLowerDstPortBoundary().hashCode();
        }
        if (getUpperDstPortBoundary() != null) {
            _hashCode += getUpperDstPortBoundary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineVMCIDeviceOptionFilterSpecOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDeviceOptionFilterSpecOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowerDstPortBoundary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lowerDstPortBoundary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperDstPortBoundary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "upperDstPortBoundary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
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
