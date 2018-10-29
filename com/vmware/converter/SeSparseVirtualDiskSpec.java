/**
 * SeSparseVirtualDiskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class SeSparseVirtualDiskSpec  extends com.vmware.converter.FileBackedVirtualDiskSpec  implements java.io.Serializable {
    private java.lang.Integer grainSizeKb;

    public SeSparseVirtualDiskSpec() {
    }

    public SeSparseVirtualDiskSpec(
           java.lang.String diskType,
           java.lang.String adapterType,
           long capacityKb,
           com.vmware.converter.VirtualMachineProfileSpec[] profile,
           java.lang.Integer grainSizeKb) {
        super(
            diskType,
            adapterType,
            capacityKb,
            profile);
        this.grainSizeKb = grainSizeKb;
    }


    /**
     * Gets the grainSizeKb value for this SeSparseVirtualDiskSpec.
     * 
     * @return grainSizeKb
     */
    public java.lang.Integer getGrainSizeKb() {
        return grainSizeKb;
    }


    /**
     * Sets the grainSizeKb value for this SeSparseVirtualDiskSpec.
     * 
     * @param grainSizeKb
     */
    public void setGrainSizeKb(java.lang.Integer grainSizeKb) {
        this.grainSizeKb = grainSizeKb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeSparseVirtualDiskSpec)) return false;
        SeSparseVirtualDiskSpec other = (SeSparseVirtualDiskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.grainSizeKb==null && other.getGrainSizeKb()==null) || 
             (this.grainSizeKb!=null &&
              this.grainSizeKb.equals(other.getGrainSizeKb())));
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
        if (getGrainSizeKb() != null) {
            _hashCode += getGrainSizeKb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeSparseVirtualDiskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SeSparseVirtualDiskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grainSizeKb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "grainSizeKb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
