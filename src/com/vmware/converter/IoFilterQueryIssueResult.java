/**
 * IoFilterQueryIssueResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IoFilterQueryIssueResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String opType;

    private com.vmware.converter.IoFilterHostIssue[] hostIssue;

    public IoFilterQueryIssueResult() {
    }

    public IoFilterQueryIssueResult(
           java.lang.String opType,
           com.vmware.converter.IoFilterHostIssue[] hostIssue) {
        this.opType = opType;
        this.hostIssue = hostIssue;
    }


    /**
     * Gets the opType value for this IoFilterQueryIssueResult.
     * 
     * @return opType
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this IoFilterQueryIssueResult.
     * 
     * @param opType
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the hostIssue value for this IoFilterQueryIssueResult.
     * 
     * @return hostIssue
     */
    public com.vmware.converter.IoFilterHostIssue[] getHostIssue() {
        return hostIssue;
    }


    /**
     * Sets the hostIssue value for this IoFilterQueryIssueResult.
     * 
     * @param hostIssue
     */
    public void setHostIssue(com.vmware.converter.IoFilterHostIssue[] hostIssue) {
        this.hostIssue = hostIssue;
    }

    public com.vmware.converter.IoFilterHostIssue getHostIssue(int i) {
        return this.hostIssue[i];
    }

    public void setHostIssue(int i, com.vmware.converter.IoFilterHostIssue _value) {
        this.hostIssue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IoFilterQueryIssueResult)) return false;
        IoFilterQueryIssueResult other = (IoFilterQueryIssueResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.hostIssue==null && other.getHostIssue()==null) || 
             (this.hostIssue!=null &&
              java.util.Arrays.equals(this.hostIssue, other.getHostIssue())));
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
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getHostIssue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostIssue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostIssue(), i);
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
        new org.apache.axis.description.TypeDesc(IoFilterQueryIssueResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IoFilterQueryIssueResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IoFilterHostIssue"));
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
