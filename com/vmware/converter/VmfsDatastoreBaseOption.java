/**
 * VmfsDatastoreBaseOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmfsDatastoreBaseOption  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostDiskPartitionLayout layout;

    private java.lang.Boolean partitionFormatChange;

    public VmfsDatastoreBaseOption() {
    }

    public VmfsDatastoreBaseOption(
           com.vmware.converter.HostDiskPartitionLayout layout,
           java.lang.Boolean partitionFormatChange) {
        this.layout = layout;
        this.partitionFormatChange = partitionFormatChange;
    }


    /**
     * Gets the layout value for this VmfsDatastoreBaseOption.
     * 
     * @return layout
     */
    public com.vmware.converter.HostDiskPartitionLayout getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this VmfsDatastoreBaseOption.
     * 
     * @param layout
     */
    public void setLayout(com.vmware.converter.HostDiskPartitionLayout layout) {
        this.layout = layout;
    }


    /**
     * Gets the partitionFormatChange value for this VmfsDatastoreBaseOption.
     * 
     * @return partitionFormatChange
     */
    public java.lang.Boolean getPartitionFormatChange() {
        return partitionFormatChange;
    }


    /**
     * Sets the partitionFormatChange value for this VmfsDatastoreBaseOption.
     * 
     * @param partitionFormatChange
     */
    public void setPartitionFormatChange(java.lang.Boolean partitionFormatChange) {
        this.partitionFormatChange = partitionFormatChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmfsDatastoreBaseOption)) return false;
        VmfsDatastoreBaseOption other = (VmfsDatastoreBaseOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout()))) &&
            ((this.partitionFormatChange==null && other.getPartitionFormatChange()==null) || 
             (this.partitionFormatChange!=null &&
              this.partitionFormatChange.equals(other.getPartitionFormatChange())));
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
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        if (getPartitionFormatChange() != null) {
            _hashCode += getPartitionFormatChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmfsDatastoreBaseOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmfsDatastoreBaseOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskPartitionLayout"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionFormatChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "partitionFormatChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
