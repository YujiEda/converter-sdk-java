/**
 * VsanHostDiskMapResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostDiskMapResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VsanHostDiskMapping mapping;

    private com.vmware.converter.VsanHostDiskResult[] diskResult;

    private com.vmware.converter.LocalizedMethodFault error;

    public VsanHostDiskMapResult() {
    }

    public VsanHostDiskMapResult(
           com.vmware.converter.VsanHostDiskMapping mapping,
           com.vmware.converter.VsanHostDiskResult[] diskResult,
           com.vmware.converter.LocalizedMethodFault error) {
        this.mapping = mapping;
        this.diskResult = diskResult;
        this.error = error;
    }


    /**
     * Gets the mapping value for this VsanHostDiskMapResult.
     * 
     * @return mapping
     */
    public com.vmware.converter.VsanHostDiskMapping getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this VsanHostDiskMapResult.
     * 
     * @param mapping
     */
    public void setMapping(com.vmware.converter.VsanHostDiskMapping mapping) {
        this.mapping = mapping;
    }


    /**
     * Gets the diskResult value for this VsanHostDiskMapResult.
     * 
     * @return diskResult
     */
    public com.vmware.converter.VsanHostDiskResult[] getDiskResult() {
        return diskResult;
    }


    /**
     * Sets the diskResult value for this VsanHostDiskMapResult.
     * 
     * @param diskResult
     */
    public void setDiskResult(com.vmware.converter.VsanHostDiskResult[] diskResult) {
        this.diskResult = diskResult;
    }

    public com.vmware.converter.VsanHostDiskResult getDiskResult(int i) {
        return this.diskResult[i];
    }

    public void setDiskResult(int i, com.vmware.converter.VsanHostDiskResult _value) {
        this.diskResult[i] = _value;
    }


    /**
     * Gets the error value for this VsanHostDiskMapResult.
     * 
     * @return error
     */
    public com.vmware.converter.LocalizedMethodFault getError() {
        return error;
    }


    /**
     * Sets the error value for this VsanHostDiskMapResult.
     * 
     * @param error
     */
    public void setError(com.vmware.converter.LocalizedMethodFault error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostDiskMapResult)) return false;
        VsanHostDiskMapResult other = (VsanHostDiskMapResult) obj;
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
            ((this.diskResult==null && other.getDiskResult()==null) || 
             (this.diskResult!=null &&
              java.util.Arrays.equals(this.diskResult, other.getDiskResult()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getDiskResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostDiskMapResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapping"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
