/**
 * DistributedVirtualSwitchManagerHostDvsMembershipFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchManagerHostDvsMembershipFilter  extends com.vmware.converter.DistributedVirtualSwitchManagerHostDvsFilterSpec  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference distributedVirtualSwitch;

    public DistributedVirtualSwitchManagerHostDvsMembershipFilter() {
    }

    public DistributedVirtualSwitchManagerHostDvsMembershipFilter(
           boolean inclusive,
           com.vmware.converter.ManagedObjectReference distributedVirtualSwitch) {
        super(
            inclusive);
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }


    /**
     * Gets the distributedVirtualSwitch value for this DistributedVirtualSwitchManagerHostDvsMembershipFilter.
     * 
     * @return distributedVirtualSwitch
     */
    public com.vmware.converter.ManagedObjectReference getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }


    /**
     * Sets the distributedVirtualSwitch value for this DistributedVirtualSwitchManagerHostDvsMembershipFilter.
     * 
     * @param distributedVirtualSwitch
     */
    public void setDistributedVirtualSwitch(com.vmware.converter.ManagedObjectReference distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchManagerHostDvsMembershipFilter)) return false;
        DistributedVirtualSwitchManagerHostDvsMembershipFilter other = (DistributedVirtualSwitchManagerHostDvsMembershipFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.distributedVirtualSwitch==null && other.getDistributedVirtualSwitch()==null) || 
             (this.distributedVirtualSwitch!=null &&
              this.distributedVirtualSwitch.equals(other.getDistributedVirtualSwitch())));
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
        if (getDistributedVirtualSwitch() != null) {
            _hashCode += getDistributedVirtualSwitch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchManagerHostDvsMembershipFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerHostDvsMembershipFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
