/**
 * VirtualMachineVMCIDeviceFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineVMCIDeviceFilterSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private long rank;

    private java.lang.String action;

    private java.lang.String protocol;

    private java.lang.String direction;

    private java.lang.Long lowerDstPortBoundary;

    private java.lang.Long upperDstPortBoundary;

    public VirtualMachineVMCIDeviceFilterSpec() {
    }

    public VirtualMachineVMCIDeviceFilterSpec(
           long rank,
           java.lang.String action,
           java.lang.String protocol,
           java.lang.String direction,
           java.lang.Long lowerDstPortBoundary,
           java.lang.Long upperDstPortBoundary) {
        this.rank = rank;
        this.action = action;
        this.protocol = protocol;
        this.direction = direction;
        this.lowerDstPortBoundary = lowerDstPortBoundary;
        this.upperDstPortBoundary = upperDstPortBoundary;
    }


    /**
     * Gets the rank value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @return rank
     */
    public long getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @param rank
     */
    public void setRank(long rank) {
        this.rank = rank;
    }


    /**
     * Gets the action value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the protocol value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the direction value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the lowerDstPortBoundary value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @return lowerDstPortBoundary
     */
    public java.lang.Long getLowerDstPortBoundary() {
        return lowerDstPortBoundary;
    }


    /**
     * Sets the lowerDstPortBoundary value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @param lowerDstPortBoundary
     */
    public void setLowerDstPortBoundary(java.lang.Long lowerDstPortBoundary) {
        this.lowerDstPortBoundary = lowerDstPortBoundary;
    }


    /**
     * Gets the upperDstPortBoundary value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @return upperDstPortBoundary
     */
    public java.lang.Long getUpperDstPortBoundary() {
        return upperDstPortBoundary;
    }


    /**
     * Sets the upperDstPortBoundary value for this VirtualMachineVMCIDeviceFilterSpec.
     * 
     * @param upperDstPortBoundary
     */
    public void setUpperDstPortBoundary(java.lang.Long upperDstPortBoundary) {
        this.upperDstPortBoundary = upperDstPortBoundary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineVMCIDeviceFilterSpec)) return false;
        VirtualMachineVMCIDeviceFilterSpec other = (VirtualMachineVMCIDeviceFilterSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.rank == other.getRank() &&
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
        _hashCode += new Long(getRank()).hashCode();
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
        new org.apache.axis.description.TypeDesc(VirtualMachineVMCIDeviceFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDeviceFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowerDstPortBoundary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lowerDstPortBoundary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperDstPortBoundary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "upperDstPortBoundary"));
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
