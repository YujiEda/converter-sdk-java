/**
 * VmSmpFaultToleranceTooManyVMsOnHost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmSmpFaultToleranceTooManyVMsOnHost  extends com.vmware.converter.InsufficientResourcesFault  implements java.io.Serializable {
    private java.lang.String hostName;

    private int maxNumSmpFtVms;

    public VmSmpFaultToleranceTooManyVMsOnHost() {
    }

    public VmSmpFaultToleranceTooManyVMsOnHost(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String hostName,
           int maxNumSmpFtVms) {
        super(
            faultCause,
            faultMessage);
        this.hostName = hostName;
        this.maxNumSmpFtVms = maxNumSmpFtVms;
    }


    /**
     * Gets the hostName value for this VmSmpFaultToleranceTooManyVMsOnHost.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this VmSmpFaultToleranceTooManyVMsOnHost.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the maxNumSmpFtVms value for this VmSmpFaultToleranceTooManyVMsOnHost.
     * 
     * @return maxNumSmpFtVms
     */
    public int getMaxNumSmpFtVms() {
        return maxNumSmpFtVms;
    }


    /**
     * Sets the maxNumSmpFtVms value for this VmSmpFaultToleranceTooManyVMsOnHost.
     * 
     * @param maxNumSmpFtVms
     */
    public void setMaxNumSmpFtVms(int maxNumSmpFtVms) {
        this.maxNumSmpFtVms = maxNumSmpFtVms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmSmpFaultToleranceTooManyVMsOnHost)) return false;
        VmSmpFaultToleranceTooManyVMsOnHost other = (VmSmpFaultToleranceTooManyVMsOnHost) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            this.maxNumSmpFtVms == other.getMaxNumSmpFtVms();
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
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        _hashCode += getMaxNumSmpFtVms();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmSmpFaultToleranceTooManyVMsOnHost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmSmpFaultToleranceTooManyVMsOnHost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumSmpFtVms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxNumSmpFtVms"));
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
