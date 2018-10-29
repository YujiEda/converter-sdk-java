/**
 * FcoeConfigFcoeSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FcoeConfigFcoeSpecification  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String underlyingPnic;

    private java.lang.Integer priorityClass;

    private java.lang.String sourceMac;

    private com.vmware.converter.FcoeConfigVlanRange[] vlanRange;

    public FcoeConfigFcoeSpecification() {
    }

    public FcoeConfigFcoeSpecification(
           java.lang.String underlyingPnic,
           java.lang.Integer priorityClass,
           java.lang.String sourceMac,
           com.vmware.converter.FcoeConfigVlanRange[] vlanRange) {
        this.underlyingPnic = underlyingPnic;
        this.priorityClass = priorityClass;
        this.sourceMac = sourceMac;
        this.vlanRange = vlanRange;
    }


    /**
     * Gets the underlyingPnic value for this FcoeConfigFcoeSpecification.
     * 
     * @return underlyingPnic
     */
    public java.lang.String getUnderlyingPnic() {
        return underlyingPnic;
    }


    /**
     * Sets the underlyingPnic value for this FcoeConfigFcoeSpecification.
     * 
     * @param underlyingPnic
     */
    public void setUnderlyingPnic(java.lang.String underlyingPnic) {
        this.underlyingPnic = underlyingPnic;
    }


    /**
     * Gets the priorityClass value for this FcoeConfigFcoeSpecification.
     * 
     * @return priorityClass
     */
    public java.lang.Integer getPriorityClass() {
        return priorityClass;
    }


    /**
     * Sets the priorityClass value for this FcoeConfigFcoeSpecification.
     * 
     * @param priorityClass
     */
    public void setPriorityClass(java.lang.Integer priorityClass) {
        this.priorityClass = priorityClass;
    }


    /**
     * Gets the sourceMac value for this FcoeConfigFcoeSpecification.
     * 
     * @return sourceMac
     */
    public java.lang.String getSourceMac() {
        return sourceMac;
    }


    /**
     * Sets the sourceMac value for this FcoeConfigFcoeSpecification.
     * 
     * @param sourceMac
     */
    public void setSourceMac(java.lang.String sourceMac) {
        this.sourceMac = sourceMac;
    }


    /**
     * Gets the vlanRange value for this FcoeConfigFcoeSpecification.
     * 
     * @return vlanRange
     */
    public com.vmware.converter.FcoeConfigVlanRange[] getVlanRange() {
        return vlanRange;
    }


    /**
     * Sets the vlanRange value for this FcoeConfigFcoeSpecification.
     * 
     * @param vlanRange
     */
    public void setVlanRange(com.vmware.converter.FcoeConfigVlanRange[] vlanRange) {
        this.vlanRange = vlanRange;
    }

    public com.vmware.converter.FcoeConfigVlanRange getVlanRange(int i) {
        return this.vlanRange[i];
    }

    public void setVlanRange(int i, com.vmware.converter.FcoeConfigVlanRange _value) {
        this.vlanRange[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FcoeConfigFcoeSpecification)) return false;
        FcoeConfigFcoeSpecification other = (FcoeConfigFcoeSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.underlyingPnic==null && other.getUnderlyingPnic()==null) || 
             (this.underlyingPnic!=null &&
              this.underlyingPnic.equals(other.getUnderlyingPnic()))) &&
            ((this.priorityClass==null && other.getPriorityClass()==null) || 
             (this.priorityClass!=null &&
              this.priorityClass.equals(other.getPriorityClass()))) &&
            ((this.sourceMac==null && other.getSourceMac()==null) || 
             (this.sourceMac!=null &&
              this.sourceMac.equals(other.getSourceMac()))) &&
            ((this.vlanRange==null && other.getVlanRange()==null) || 
             (this.vlanRange!=null &&
              java.util.Arrays.equals(this.vlanRange, other.getVlanRange())));
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
        if (getUnderlyingPnic() != null) {
            _hashCode += getUnderlyingPnic().hashCode();
        }
        if (getPriorityClass() != null) {
            _hashCode += getPriorityClass().hashCode();
        }
        if (getSourceMac() != null) {
            _hashCode += getSourceMac().hashCode();
        }
        if (getVlanRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlanRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlanRange(), i);
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
        new org.apache.axis.description.TypeDesc(FcoeConfigFcoeSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfigFcoeSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underlyingPnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "underlyingPnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "priorityClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceMac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FcoeConfigVlanRange"));
        elemField.setMinOccurs(0);
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
