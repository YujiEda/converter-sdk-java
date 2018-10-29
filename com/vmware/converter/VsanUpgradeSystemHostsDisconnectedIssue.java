/**
 * VsanUpgradeSystemHostsDisconnectedIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemHostsDisconnectedIssue  extends com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference[] hosts;

    public VsanUpgradeSystemHostsDisconnectedIssue() {
    }

    public VsanUpgradeSystemHostsDisconnectedIssue(
           java.lang.String msg,
           com.vmware.converter.ManagedObjectReference[] hosts) {
        super(
            msg);
        this.hosts = hosts;
    }


    /**
     * Gets the hosts value for this VsanUpgradeSystemHostsDisconnectedIssue.
     * 
     * @return hosts
     */
    public com.vmware.converter.ManagedObjectReference[] getHosts() {
        return hosts;
    }


    /**
     * Sets the hosts value for this VsanUpgradeSystemHostsDisconnectedIssue.
     * 
     * @param hosts
     */
    public void setHosts(com.vmware.converter.ManagedObjectReference[] hosts) {
        this.hosts = hosts;
    }

    public com.vmware.converter.ManagedObjectReference getHosts(int i) {
        return this.hosts[i];
    }

    public void setHosts(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.hosts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemHostsDisconnectedIssue)) return false;
        VsanUpgradeSystemHostsDisconnectedIssue other = (VsanUpgradeSystemHostsDisconnectedIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hosts==null && other.getHosts()==null) || 
             (this.hosts!=null &&
              java.util.Arrays.equals(this.hosts, other.getHosts())));
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
        if (getHosts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHosts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHosts(), i);
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
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemHostsDisconnectedIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemHostsDisconnectedIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
