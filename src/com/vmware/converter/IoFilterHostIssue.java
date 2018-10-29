/**
 * IoFilterHostIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IoFilterHostIssue  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference host;

    private com.vmware.converter.LocalizedMethodFault[] issue;

    public IoFilterHostIssue() {
    }

    public IoFilterHostIssue(
           com.vmware.converter.ManagedObjectReference host,
           com.vmware.converter.LocalizedMethodFault[] issue) {
        this.host = host;
        this.issue = issue;
    }


    /**
     * Gets the host value for this IoFilterHostIssue.
     * 
     * @return host
     */
    public com.vmware.converter.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this IoFilterHostIssue.
     * 
     * @param host
     */
    public void setHost(com.vmware.converter.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the issue value for this IoFilterHostIssue.
     * 
     * @return issue
     */
    public com.vmware.converter.LocalizedMethodFault[] getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this IoFilterHostIssue.
     * 
     * @param issue
     */
    public void setIssue(com.vmware.converter.LocalizedMethodFault[] issue) {
        this.issue = issue;
    }

    public com.vmware.converter.LocalizedMethodFault getIssue(int i) {
        return this.issue[i];
    }

    public void setIssue(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.issue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IoFilterHostIssue)) return false;
        IoFilterHostIssue other = (IoFilterHostIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              java.util.Arrays.equals(this.issue, other.getIssue())));
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getIssue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssue(), i);
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
        new org.apache.axis.description.TypeDesc(IoFilterHostIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IoFilterHostIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
