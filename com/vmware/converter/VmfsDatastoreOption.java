/**
 * VmfsDatastoreOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmfsDatastoreOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VmfsDatastoreBaseOption info;

    private com.vmware.converter.VmfsDatastoreSpec spec;

    public VmfsDatastoreOption() {
    }

    public VmfsDatastoreOption(
           com.vmware.converter.VmfsDatastoreBaseOption info,
           com.vmware.converter.VmfsDatastoreSpec spec) {
        this.info = info;
        this.spec = spec;
    }


    /**
     * Gets the info value for this VmfsDatastoreOption.
     * 
     * @return info
     */
    public com.vmware.converter.VmfsDatastoreBaseOption getInfo() {
        return info;
    }


    /**
     * Sets the info value for this VmfsDatastoreOption.
     * 
     * @param info
     */
    public void setInfo(com.vmware.converter.VmfsDatastoreBaseOption info) {
        this.info = info;
    }


    /**
     * Gets the spec value for this VmfsDatastoreOption.
     * 
     * @return spec
     */
    public com.vmware.converter.VmfsDatastoreSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this VmfsDatastoreOption.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.converter.VmfsDatastoreSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmfsDatastoreOption)) return false;
        VmfsDatastoreOption other = (VmfsDatastoreOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec())));
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
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmfsDatastoreOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmfsDatastoreOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmfsDatastoreBaseOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmfsDatastoreSpec"));
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
