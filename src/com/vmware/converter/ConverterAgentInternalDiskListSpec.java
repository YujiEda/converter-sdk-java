/**
 * ConverterAgentInternalDiskListSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalDiskListSpec  extends com.vmware.converter.ConverterAgentInternalStaticComputerSpec  implements java.io.Serializable {
    private com.vmware.converter.ConverterAgentInternalOsInfo osHint;

    private com.vmware.converter.ConverterAgentInternalDiskSpec[] disks;

    public ConverterAgentInternalDiskListSpec() {
    }

    public ConverterAgentInternalDiskListSpec(
           com.vmware.converter.ConverterAgentInternalOsInfo osHint,
           com.vmware.converter.ConverterAgentInternalDiskSpec[] disks) {
        this.osHint = osHint;
        this.disks = disks;
    }


    /**
     * Gets the osHint value for this ConverterAgentInternalDiskListSpec.
     * 
     * @return osHint
     */
    public com.vmware.converter.ConverterAgentInternalOsInfo getOsHint() {
        return osHint;
    }


    /**
     * Sets the osHint value for this ConverterAgentInternalDiskListSpec.
     * 
     * @param osHint
     */
    public void setOsHint(com.vmware.converter.ConverterAgentInternalOsInfo osHint) {
        this.osHint = osHint;
    }


    /**
     * Gets the disks value for this ConverterAgentInternalDiskListSpec.
     * 
     * @return disks
     */
    public com.vmware.converter.ConverterAgentInternalDiskSpec[] getDisks() {
        return disks;
    }


    /**
     * Sets the disks value for this ConverterAgentInternalDiskListSpec.
     * 
     * @param disks
     */
    public void setDisks(com.vmware.converter.ConverterAgentInternalDiskSpec[] disks) {
        this.disks = disks;
    }

    public com.vmware.converter.ConverterAgentInternalDiskSpec getDisks(int i) {
        return this.disks[i];
    }

    public void setDisks(int i, com.vmware.converter.ConverterAgentInternalDiskSpec _value) {
        this.disks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalDiskListSpec)) return false;
        ConverterAgentInternalDiskListSpec other = (ConverterAgentInternalDiskListSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.osHint==null && other.getOsHint()==null) || 
             (this.osHint!=null &&
              this.osHint.equals(other.getOsHint()))) &&
            ((this.disks==null && other.getDisks()==null) || 
             (this.disks!=null &&
              java.util.Arrays.equals(this.disks, other.getDisks())));
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
        if (getOsHint() != null) {
            _hashCode += getOsHint().hashCode();
        }
        if (getDisks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisks(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalDiskListSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskListSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osHint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "osHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalOsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "disks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalDiskSpec"));
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
