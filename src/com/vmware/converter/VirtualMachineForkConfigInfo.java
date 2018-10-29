/**
 * VirtualMachineForkConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineForkConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean parentEnabled;

    private java.lang.String childForkGroupId;

    private java.lang.String childType;

    public VirtualMachineForkConfigInfo() {
    }

    public VirtualMachineForkConfigInfo(
           java.lang.Boolean parentEnabled,
           java.lang.String childForkGroupId,
           java.lang.String childType) {
        this.parentEnabled = parentEnabled;
        this.childForkGroupId = childForkGroupId;
        this.childType = childType;
    }


    /**
     * Gets the parentEnabled value for this VirtualMachineForkConfigInfo.
     * 
     * @return parentEnabled
     */
    public java.lang.Boolean getParentEnabled() {
        return parentEnabled;
    }


    /**
     * Sets the parentEnabled value for this VirtualMachineForkConfigInfo.
     * 
     * @param parentEnabled
     */
    public void setParentEnabled(java.lang.Boolean parentEnabled) {
        this.parentEnabled = parentEnabled;
    }


    /**
     * Gets the childForkGroupId value for this VirtualMachineForkConfigInfo.
     * 
     * @return childForkGroupId
     */
    public java.lang.String getChildForkGroupId() {
        return childForkGroupId;
    }


    /**
     * Sets the childForkGroupId value for this VirtualMachineForkConfigInfo.
     * 
     * @param childForkGroupId
     */
    public void setChildForkGroupId(java.lang.String childForkGroupId) {
        this.childForkGroupId = childForkGroupId;
    }


    /**
     * Gets the childType value for this VirtualMachineForkConfigInfo.
     * 
     * @return childType
     */
    public java.lang.String getChildType() {
        return childType;
    }


    /**
     * Sets the childType value for this VirtualMachineForkConfigInfo.
     * 
     * @param childType
     */
    public void setChildType(java.lang.String childType) {
        this.childType = childType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineForkConfigInfo)) return false;
        VirtualMachineForkConfigInfo other = (VirtualMachineForkConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parentEnabled==null && other.getParentEnabled()==null) || 
             (this.parentEnabled!=null &&
              this.parentEnabled.equals(other.getParentEnabled()))) &&
            ((this.childForkGroupId==null && other.getChildForkGroupId()==null) || 
             (this.childForkGroupId!=null &&
              this.childForkGroupId.equals(other.getChildForkGroupId()))) &&
            ((this.childType==null && other.getChildType()==null) || 
             (this.childType!=null &&
              this.childType.equals(other.getChildType())));
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
        if (getParentEnabled() != null) {
            _hashCode += getParentEnabled().hashCode();
        }
        if (getChildForkGroupId() != null) {
            _hashCode += getChildForkGroupId().hashCode();
        }
        if (getChildType() != null) {
            _hashCode += getChildType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineForkConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineForkConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parentEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childForkGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "childForkGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "childType"));
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
