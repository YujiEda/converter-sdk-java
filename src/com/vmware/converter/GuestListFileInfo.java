/**
 * GuestListFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestListFileInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.GuestFileInfo[] files;

    private int remaining;

    public GuestListFileInfo() {
    }

    public GuestListFileInfo(
           com.vmware.converter.GuestFileInfo[] files,
           int remaining) {
        this.files = files;
        this.remaining = remaining;
    }


    /**
     * Gets the files value for this GuestListFileInfo.
     * 
     * @return files
     */
    public com.vmware.converter.GuestFileInfo[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this GuestListFileInfo.
     * 
     * @param files
     */
    public void setFiles(com.vmware.converter.GuestFileInfo[] files) {
        this.files = files;
    }

    public com.vmware.converter.GuestFileInfo getFiles(int i) {
        return this.files[i];
    }

    public void setFiles(int i, com.vmware.converter.GuestFileInfo _value) {
        this.files[i] = _value;
    }


    /**
     * Gets the remaining value for this GuestListFileInfo.
     * 
     * @return remaining
     */
    public int getRemaining() {
        return remaining;
    }


    /**
     * Sets the remaining value for this GuestListFileInfo.
     * 
     * @param remaining
     */
    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestListFileInfo)) return false;
        GuestListFileInfo other = (GuestListFileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles()))) &&
            this.remaining == other.getRemaining();
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
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRemaining();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestListFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestListFileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestFileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "remaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
