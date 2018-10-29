/**
 * VMwareDVSVlanHealthCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSVlanHealthCheckResult  extends com.vmware.converter.HostMemberUplinkHealthCheckResult  implements java.io.Serializable {
    private com.vmware.converter.NumericRange[] trunkedVlan;

    private com.vmware.converter.NumericRange[] untrunkedVlan;

    public VMwareDVSVlanHealthCheckResult() {
    }

    public VMwareDVSVlanHealthCheckResult(
           java.lang.String summary,
           java.lang.String uplinkPortKey,
           com.vmware.converter.NumericRange[] trunkedVlan,
           com.vmware.converter.NumericRange[] untrunkedVlan) {
        super(
            summary,
            uplinkPortKey);
        this.trunkedVlan = trunkedVlan;
        this.untrunkedVlan = untrunkedVlan;
    }


    /**
     * Gets the trunkedVlan value for this VMwareDVSVlanHealthCheckResult.
     * 
     * @return trunkedVlan
     */
    public com.vmware.converter.NumericRange[] getTrunkedVlan() {
        return trunkedVlan;
    }


    /**
     * Sets the trunkedVlan value for this VMwareDVSVlanHealthCheckResult.
     * 
     * @param trunkedVlan
     */
    public void setTrunkedVlan(com.vmware.converter.NumericRange[] trunkedVlan) {
        this.trunkedVlan = trunkedVlan;
    }

    public com.vmware.converter.NumericRange getTrunkedVlan(int i) {
        return this.trunkedVlan[i];
    }

    public void setTrunkedVlan(int i, com.vmware.converter.NumericRange _value) {
        this.trunkedVlan[i] = _value;
    }


    /**
     * Gets the untrunkedVlan value for this VMwareDVSVlanHealthCheckResult.
     * 
     * @return untrunkedVlan
     */
    public com.vmware.converter.NumericRange[] getUntrunkedVlan() {
        return untrunkedVlan;
    }


    /**
     * Sets the untrunkedVlan value for this VMwareDVSVlanHealthCheckResult.
     * 
     * @param untrunkedVlan
     */
    public void setUntrunkedVlan(com.vmware.converter.NumericRange[] untrunkedVlan) {
        this.untrunkedVlan = untrunkedVlan;
    }

    public com.vmware.converter.NumericRange getUntrunkedVlan(int i) {
        return this.untrunkedVlan[i];
    }

    public void setUntrunkedVlan(int i, com.vmware.converter.NumericRange _value) {
        this.untrunkedVlan[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSVlanHealthCheckResult)) return false;
        VMwareDVSVlanHealthCheckResult other = (VMwareDVSVlanHealthCheckResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trunkedVlan==null && other.getTrunkedVlan()==null) || 
             (this.trunkedVlan!=null &&
              java.util.Arrays.equals(this.trunkedVlan, other.getTrunkedVlan()))) &&
            ((this.untrunkedVlan==null && other.getUntrunkedVlan()==null) || 
             (this.untrunkedVlan!=null &&
              java.util.Arrays.equals(this.untrunkedVlan, other.getUntrunkedVlan())));
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
        if (getTrunkedVlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrunkedVlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrunkedVlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUntrunkedVlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUntrunkedVlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUntrunkedVlan(), i);
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
        new org.apache.axis.description.TypeDesc(VMwareDVSVlanHealthCheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSVlanHealthCheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkedVlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "trunkedVlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NumericRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("untrunkedVlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "untrunkedVlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NumericRange"));
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
