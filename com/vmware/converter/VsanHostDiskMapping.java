/**
 * VsanHostDiskMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostDiskMapping  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostScsiDisk ssd;

    private com.vmware.converter.HostScsiDisk[] nonSsd;

    public VsanHostDiskMapping() {
    }

    public VsanHostDiskMapping(
           com.vmware.converter.HostScsiDisk ssd,
           com.vmware.converter.HostScsiDisk[] nonSsd) {
        this.ssd = ssd;
        this.nonSsd = nonSsd;
    }


    /**
     * Gets the ssd value for this VsanHostDiskMapping.
     * 
     * @return ssd
     */
    public com.vmware.converter.HostScsiDisk getSsd() {
        return ssd;
    }


    /**
     * Sets the ssd value for this VsanHostDiskMapping.
     * 
     * @param ssd
     */
    public void setSsd(com.vmware.converter.HostScsiDisk ssd) {
        this.ssd = ssd;
    }


    /**
     * Gets the nonSsd value for this VsanHostDiskMapping.
     * 
     * @return nonSsd
     */
    public com.vmware.converter.HostScsiDisk[] getNonSsd() {
        return nonSsd;
    }


    /**
     * Sets the nonSsd value for this VsanHostDiskMapping.
     * 
     * @param nonSsd
     */
    public void setNonSsd(com.vmware.converter.HostScsiDisk[] nonSsd) {
        this.nonSsd = nonSsd;
    }

    public com.vmware.converter.HostScsiDisk getNonSsd(int i) {
        return this.nonSsd[i];
    }

    public void setNonSsd(int i, com.vmware.converter.HostScsiDisk _value) {
        this.nonSsd[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostDiskMapping)) return false;
        VsanHostDiskMapping other = (VsanHostDiskMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ssd==null && other.getSsd()==null) || 
             (this.ssd!=null &&
              this.ssd.equals(other.getSsd()))) &&
            ((this.nonSsd==null && other.getNonSsd()==null) || 
             (this.nonSsd!=null &&
              java.util.Arrays.equals(this.nonSsd, other.getNonSsd())));
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
        if (getSsd() != null) {
            _hashCode += getSsd().hashCode();
        }
        if (getNonSsd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonSsd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonSsd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostDiskMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ssd"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDisk"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonSsd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nonSsd"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDisk"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
