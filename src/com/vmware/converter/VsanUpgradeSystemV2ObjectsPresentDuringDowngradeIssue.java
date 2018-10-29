/**
 * VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue  extends com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue  implements java.io.Serializable {
    private java.lang.String[] uuids;

    public VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue() {
    }

    public VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue(
           java.lang.String msg,
           java.lang.String[] uuids) {
        super(
            msg);
        this.uuids = uuids;
    }


    /**
     * Gets the uuids value for this VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue.
     * 
     * @return uuids
     */
    public java.lang.String[] getUuids() {
        return uuids;
    }


    /**
     * Sets the uuids value for this VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue.
     * 
     * @param uuids
     */
    public void setUuids(java.lang.String[] uuids) {
        this.uuids = uuids;
    }

    public java.lang.String getUuids(int i) {
        return this.uuids[i];
    }

    public void setUuids(int i, java.lang.String _value) {
        this.uuids[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue)) return false;
        VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue other = (VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uuids==null && other.getUuids()==null) || 
             (this.uuids!=null &&
              java.util.Arrays.equals(this.uuids, other.getUuids())));
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
        if (getUuids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUuids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUuids(), i);
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
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuids");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
