/**
 * HostMaintenanceSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostMaintenanceSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VsanHostDecommissionMode vsanMode;

    public HostMaintenanceSpec() {
    }

    public HostMaintenanceSpec(
           com.vmware.converter.VsanHostDecommissionMode vsanMode) {
        this.vsanMode = vsanMode;
    }


    /**
     * Gets the vsanMode value for this HostMaintenanceSpec.
     * 
     * @return vsanMode
     */
    public com.vmware.converter.VsanHostDecommissionMode getVsanMode() {
        return vsanMode;
    }


    /**
     * Sets the vsanMode value for this HostMaintenanceSpec.
     * 
     * @param vsanMode
     */
    public void setVsanMode(com.vmware.converter.VsanHostDecommissionMode vsanMode) {
        this.vsanMode = vsanMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMaintenanceSpec)) return false;
        HostMaintenanceSpec other = (HostMaintenanceSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vsanMode==null && other.getVsanMode()==null) || 
             (this.vsanMode!=null &&
              this.vsanMode.equals(other.getVsanMode())));
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
        if (getVsanMode() != null) {
            _hashCode += getVsanMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostMaintenanceSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMaintenanceSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDecommissionMode"));
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
