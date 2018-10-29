/**
 * HostLowLevelProvisioningManagerDiskLayoutSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostLowLevelProvisioningManagerDiskLayoutSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String controllerType;

    private int busNumber;

    private int unitNumber;

    private java.lang.String srcFilename;

    private java.lang.String dstFilename;

    public HostLowLevelProvisioningManagerDiskLayoutSpec() {
    }

    public HostLowLevelProvisioningManagerDiskLayoutSpec(
           java.lang.String controllerType,
           int busNumber,
           int unitNumber,
           java.lang.String srcFilename,
           java.lang.String dstFilename) {
        this.controllerType = controllerType;
        this.busNumber = busNumber;
        this.unitNumber = unitNumber;
        this.srcFilename = srcFilename;
        this.dstFilename = dstFilename;
    }


    /**
     * Gets the controllerType value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @return controllerType
     */
    public java.lang.String getControllerType() {
        return controllerType;
    }


    /**
     * Sets the controllerType value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @param controllerType
     */
    public void setControllerType(java.lang.String controllerType) {
        this.controllerType = controllerType;
    }


    /**
     * Gets the busNumber value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @return busNumber
     */
    public int getBusNumber() {
        return busNumber;
    }


    /**
     * Sets the busNumber value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @param busNumber
     */
    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }


    /**
     * Gets the unitNumber value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @return unitNumber
     */
    public int getUnitNumber() {
        return unitNumber;
    }


    /**
     * Sets the unitNumber value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @param unitNumber
     */
    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }


    /**
     * Gets the srcFilename value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @return srcFilename
     */
    public java.lang.String getSrcFilename() {
        return srcFilename;
    }


    /**
     * Sets the srcFilename value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @param srcFilename
     */
    public void setSrcFilename(java.lang.String srcFilename) {
        this.srcFilename = srcFilename;
    }


    /**
     * Gets the dstFilename value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @return dstFilename
     */
    public java.lang.String getDstFilename() {
        return dstFilename;
    }


    /**
     * Sets the dstFilename value for this HostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @param dstFilename
     */
    public void setDstFilename(java.lang.String dstFilename) {
        this.dstFilename = dstFilename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostLowLevelProvisioningManagerDiskLayoutSpec)) return false;
        HostLowLevelProvisioningManagerDiskLayoutSpec other = (HostLowLevelProvisioningManagerDiskLayoutSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.controllerType==null && other.getControllerType()==null) || 
             (this.controllerType!=null &&
              this.controllerType.equals(other.getControllerType()))) &&
            this.busNumber == other.getBusNumber() &&
            this.unitNumber == other.getUnitNumber() &&
            ((this.srcFilename==null && other.getSrcFilename()==null) || 
             (this.srcFilename!=null &&
              this.srcFilename.equals(other.getSrcFilename()))) &&
            ((this.dstFilename==null && other.getDstFilename()==null) || 
             (this.dstFilename!=null &&
              this.dstFilename.equals(other.getDstFilename())));
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
        if (getControllerType() != null) {
            _hashCode += getControllerType().hashCode();
        }
        _hashCode += getBusNumber();
        _hashCode += getUnitNumber();
        if (getSrcFilename() != null) {
            _hashCode += getSrcFilename().hashCode();
        }
        if (getDstFilename() != null) {
            _hashCode += getDstFilename().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostLowLevelProvisioningManagerDiskLayoutSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerDiskLayoutSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "controllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "busNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcFilename");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "srcFilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dstFilename");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dstFilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
