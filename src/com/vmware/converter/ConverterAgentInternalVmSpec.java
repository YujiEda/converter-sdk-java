/**
 * ConverterAgentInternalVmSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalVmSpec  extends com.vmware.converter.ConverterAgentInternalStaticComputerSpec  implements java.io.Serializable {
    private java.lang.String snapshotId;

    public ConverterAgentInternalVmSpec() {
    }

    public ConverterAgentInternalVmSpec(
           java.lang.String snapshotId) {
        this.snapshotId = snapshotId;
    }


    /**
     * Gets the snapshotId value for this ConverterAgentInternalVmSpec.
     * 
     * @return snapshotId
     */
    public java.lang.String getSnapshotId() {
        return snapshotId;
    }


    /**
     * Sets the snapshotId value for this ConverterAgentInternalVmSpec.
     * 
     * @param snapshotId
     */
    public void setSnapshotId(java.lang.String snapshotId) {
        this.snapshotId = snapshotId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalVmSpec)) return false;
        ConverterAgentInternalVmSpec other = (ConverterAgentInternalVmSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.snapshotId==null && other.getSnapshotId()==null) || 
             (this.snapshotId!=null &&
              this.snapshotId.equals(other.getSnapshotId())));
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
        if (getSnapshotId() != null) {
            _hashCode += getSnapshotId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalVmSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalVmSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "snapshotId"));
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
