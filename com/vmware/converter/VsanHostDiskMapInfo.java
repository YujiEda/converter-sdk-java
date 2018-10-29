/**
 * VsanHostDiskMapInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostDiskMapInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VsanHostDiskMapping mapping;

    private boolean mounted;

    public VsanHostDiskMapInfo() {
    }

    public VsanHostDiskMapInfo(
           com.vmware.converter.VsanHostDiskMapping mapping,
           boolean mounted) {
        this.mapping = mapping;
        this.mounted = mounted;
    }


    /**
     * Gets the mapping value for this VsanHostDiskMapInfo.
     * 
     * @return mapping
     */
    public com.vmware.converter.VsanHostDiskMapping getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this VsanHostDiskMapInfo.
     * 
     * @param mapping
     */
    public void setMapping(com.vmware.converter.VsanHostDiskMapping mapping) {
        this.mapping = mapping;
    }


    /**
     * Gets the mounted value for this VsanHostDiskMapInfo.
     * 
     * @return mounted
     */
    public boolean isMounted() {
        return mounted;
    }


    /**
     * Sets the mounted value for this VsanHostDiskMapInfo.
     * 
     * @param mounted
     */
    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostDiskMapInfo)) return false;
        VsanHostDiskMapInfo other = (VsanHostDiskMapInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mapping==null && other.getMapping()==null) || 
             (this.mapping!=null &&
              this.mapping.equals(other.getMapping()))) &&
            this.mounted == other.isMounted();
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
        if (getMapping() != null) {
            _hashCode += getMapping().hashCode();
        }
        _hashCode += (isMounted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostDiskMapInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapping"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mounted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mounted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
