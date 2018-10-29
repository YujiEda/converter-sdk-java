/**
 * OvfCreateDescriptorResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfCreateDescriptorResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String ovfDescriptor;

    private com.vmware.converter.LocalizedMethodFault[] error;

    private com.vmware.converter.LocalizedMethodFault[] warning;

    private java.lang.Boolean includeImageFiles;

    public OvfCreateDescriptorResult() {
    }

    public OvfCreateDescriptorResult(
           java.lang.String ovfDescriptor,
           com.vmware.converter.LocalizedMethodFault[] error,
           com.vmware.converter.LocalizedMethodFault[] warning,
           java.lang.Boolean includeImageFiles) {
        this.ovfDescriptor = ovfDescriptor;
        this.error = error;
        this.warning = warning;
        this.includeImageFiles = includeImageFiles;
    }


    /**
     * Gets the ovfDescriptor value for this OvfCreateDescriptorResult.
     * 
     * @return ovfDescriptor
     */
    public java.lang.String getOvfDescriptor() {
        return ovfDescriptor;
    }


    /**
     * Sets the ovfDescriptor value for this OvfCreateDescriptorResult.
     * 
     * @param ovfDescriptor
     */
    public void setOvfDescriptor(java.lang.String ovfDescriptor) {
        this.ovfDescriptor = ovfDescriptor;
    }


    /**
     * Gets the error value for this OvfCreateDescriptorResult.
     * 
     * @return error
     */
    public com.vmware.converter.LocalizedMethodFault[] getError() {
        return error;
    }


    /**
     * Sets the error value for this OvfCreateDescriptorResult.
     * 
     * @param error
     */
    public void setError(com.vmware.converter.LocalizedMethodFault[] error) {
        this.error = error;
    }

    public com.vmware.converter.LocalizedMethodFault getError(int i) {
        return this.error[i];
    }

    public void setError(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.error[i] = _value;
    }


    /**
     * Gets the warning value for this OvfCreateDescriptorResult.
     * 
     * @return warning
     */
    public com.vmware.converter.LocalizedMethodFault[] getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this OvfCreateDescriptorResult.
     * 
     * @param warning
     */
    public void setWarning(com.vmware.converter.LocalizedMethodFault[] warning) {
        this.warning = warning;
    }

    public com.vmware.converter.LocalizedMethodFault getWarning(int i) {
        return this.warning[i];
    }

    public void setWarning(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.warning[i] = _value;
    }


    /**
     * Gets the includeImageFiles value for this OvfCreateDescriptorResult.
     * 
     * @return includeImageFiles
     */
    public java.lang.Boolean getIncludeImageFiles() {
        return includeImageFiles;
    }


    /**
     * Sets the includeImageFiles value for this OvfCreateDescriptorResult.
     * 
     * @param includeImageFiles
     */
    public void setIncludeImageFiles(java.lang.Boolean includeImageFiles) {
        this.includeImageFiles = includeImageFiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfCreateDescriptorResult)) return false;
        OvfCreateDescriptorResult other = (OvfCreateDescriptorResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ovfDescriptor==null && other.getOvfDescriptor()==null) || 
             (this.ovfDescriptor!=null &&
              this.ovfDescriptor.equals(other.getOvfDescriptor()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              java.util.Arrays.equals(this.error, other.getError()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              java.util.Arrays.equals(this.warning, other.getWarning()))) &&
            ((this.includeImageFiles==null && other.getIncludeImageFiles()==null) || 
             (this.includeImageFiles!=null &&
              this.includeImageFiles.equals(other.getIncludeImageFiles())));
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
        if (getOvfDescriptor() != null) {
            _hashCode += getOvfDescriptor().hashCode();
        }
        if (getError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarning(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeImageFiles() != null) {
            _hashCode += getIncludeImageFiles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfCreateDescriptorResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfCreateDescriptorResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeImageFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "includeImageFiles"));
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
