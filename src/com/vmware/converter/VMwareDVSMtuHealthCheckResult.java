/**
 * VMwareDVSMtuHealthCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VMwareDVSMtuHealthCheckResult  extends com.vmware.converter.HostMemberUplinkHealthCheckResult  implements java.io.Serializable {
    private boolean mtuMismatch;

    private com.vmware.converter.NumericRange[] vlanSupportSwitchMtu;

    private com.vmware.converter.NumericRange[] vlanNotSupportSwitchMtu;

    public VMwareDVSMtuHealthCheckResult() {
    }

    public VMwareDVSMtuHealthCheckResult(
           java.lang.String summary,
           java.lang.String uplinkPortKey,
           boolean mtuMismatch,
           com.vmware.converter.NumericRange[] vlanSupportSwitchMtu,
           com.vmware.converter.NumericRange[] vlanNotSupportSwitchMtu) {
        super(
            summary,
            uplinkPortKey);
        this.mtuMismatch = mtuMismatch;
        this.vlanSupportSwitchMtu = vlanSupportSwitchMtu;
        this.vlanNotSupportSwitchMtu = vlanNotSupportSwitchMtu;
    }


    /**
     * Gets the mtuMismatch value for this VMwareDVSMtuHealthCheckResult.
     * 
     * @return mtuMismatch
     */
    public boolean isMtuMismatch() {
        return mtuMismatch;
    }


    /**
     * Sets the mtuMismatch value for this VMwareDVSMtuHealthCheckResult.
     * 
     * @param mtuMismatch
     */
    public void setMtuMismatch(boolean mtuMismatch) {
        this.mtuMismatch = mtuMismatch;
    }


    /**
     * Gets the vlanSupportSwitchMtu value for this VMwareDVSMtuHealthCheckResult.
     * 
     * @return vlanSupportSwitchMtu
     */
    public com.vmware.converter.NumericRange[] getVlanSupportSwitchMtu() {
        return vlanSupportSwitchMtu;
    }


    /**
     * Sets the vlanSupportSwitchMtu value for this VMwareDVSMtuHealthCheckResult.
     * 
     * @param vlanSupportSwitchMtu
     */
    public void setVlanSupportSwitchMtu(com.vmware.converter.NumericRange[] vlanSupportSwitchMtu) {
        this.vlanSupportSwitchMtu = vlanSupportSwitchMtu;
    }

    public com.vmware.converter.NumericRange getVlanSupportSwitchMtu(int i) {
        return this.vlanSupportSwitchMtu[i];
    }

    public void setVlanSupportSwitchMtu(int i, com.vmware.converter.NumericRange _value) {
        this.vlanSupportSwitchMtu[i] = _value;
    }


    /**
     * Gets the vlanNotSupportSwitchMtu value for this VMwareDVSMtuHealthCheckResult.
     * 
     * @return vlanNotSupportSwitchMtu
     */
    public com.vmware.converter.NumericRange[] getVlanNotSupportSwitchMtu() {
        return vlanNotSupportSwitchMtu;
    }


    /**
     * Sets the vlanNotSupportSwitchMtu value for this VMwareDVSMtuHealthCheckResult.
     * 
     * @param vlanNotSupportSwitchMtu
     */
    public void setVlanNotSupportSwitchMtu(com.vmware.converter.NumericRange[] vlanNotSupportSwitchMtu) {
        this.vlanNotSupportSwitchMtu = vlanNotSupportSwitchMtu;
    }

    public com.vmware.converter.NumericRange getVlanNotSupportSwitchMtu(int i) {
        return this.vlanNotSupportSwitchMtu[i];
    }

    public void setVlanNotSupportSwitchMtu(int i, com.vmware.converter.NumericRange _value) {
        this.vlanNotSupportSwitchMtu[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMwareDVSMtuHealthCheckResult)) return false;
        VMwareDVSMtuHealthCheckResult other = (VMwareDVSMtuHealthCheckResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.mtuMismatch == other.isMtuMismatch() &&
            ((this.vlanSupportSwitchMtu==null && other.getVlanSupportSwitchMtu()==null) || 
             (this.vlanSupportSwitchMtu!=null &&
              java.util.Arrays.equals(this.vlanSupportSwitchMtu, other.getVlanSupportSwitchMtu()))) &&
            ((this.vlanNotSupportSwitchMtu==null && other.getVlanNotSupportSwitchMtu()==null) || 
             (this.vlanNotSupportSwitchMtu!=null &&
              java.util.Arrays.equals(this.vlanNotSupportSwitchMtu, other.getVlanNotSupportSwitchMtu())));
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
        _hashCode += (isMtuMismatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVlanSupportSwitchMtu() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlanSupportSwitchMtu());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlanSupportSwitchMtu(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVlanNotSupportSwitchMtu() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlanNotSupportSwitchMtu());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlanNotSupportSwitchMtu(), i);
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
        new org.apache.axis.description.TypeDesc(VMwareDVSMtuHealthCheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSMtuHealthCheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtuMismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mtuMismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanSupportSwitchMtu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanSupportSwitchMtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NumericRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanNotSupportSwitchMtu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanNotSupportSwitchMtu"));
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
