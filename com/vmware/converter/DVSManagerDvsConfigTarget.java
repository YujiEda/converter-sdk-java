/**
 * DVSManagerDvsConfigTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSManagerDvsConfigTarget  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup;

    private com.vmware.converter.DistributedVirtualSwitchInfo[] distributedVirtualSwitch;

    public DVSManagerDvsConfigTarget() {
    }

    public DVSManagerDvsConfigTarget(
           com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup,
           com.vmware.converter.DistributedVirtualSwitchInfo[] distributedVirtualSwitch) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }


    /**
     * Gets the distributedVirtualPortgroup value for this DVSManagerDvsConfigTarget.
     * 
     * @return distributedVirtualPortgroup
     */
    public com.vmware.converter.DistributedVirtualPortgroupInfo[] getDistributedVirtualPortgroup() {
        return distributedVirtualPortgroup;
    }


    /**
     * Sets the distributedVirtualPortgroup value for this DVSManagerDvsConfigTarget.
     * 
     * @param distributedVirtualPortgroup
     */
    public void setDistributedVirtualPortgroup(com.vmware.converter.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
    }

    public com.vmware.converter.DistributedVirtualPortgroupInfo getDistributedVirtualPortgroup(int i) {
        return this.distributedVirtualPortgroup[i];
    }

    public void setDistributedVirtualPortgroup(int i, com.vmware.converter.DistributedVirtualPortgroupInfo _value) {
        this.distributedVirtualPortgroup[i] = _value;
    }


    /**
     * Gets the distributedVirtualSwitch value for this DVSManagerDvsConfigTarget.
     * 
     * @return distributedVirtualSwitch
     */
    public com.vmware.converter.DistributedVirtualSwitchInfo[] getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }


    /**
     * Sets the distributedVirtualSwitch value for this DVSManagerDvsConfigTarget.
     * 
     * @param distributedVirtualSwitch
     */
    public void setDistributedVirtualSwitch(com.vmware.converter.DistributedVirtualSwitchInfo[] distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public com.vmware.converter.DistributedVirtualSwitchInfo getDistributedVirtualSwitch(int i) {
        return this.distributedVirtualSwitch[i];
    }

    public void setDistributedVirtualSwitch(int i, com.vmware.converter.DistributedVirtualSwitchInfo _value) {
        this.distributedVirtualSwitch[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSManagerDvsConfigTarget)) return false;
        DVSManagerDvsConfigTarget other = (DVSManagerDvsConfigTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.distributedVirtualPortgroup==null && other.getDistributedVirtualPortgroup()==null) || 
             (this.distributedVirtualPortgroup!=null &&
              java.util.Arrays.equals(this.distributedVirtualPortgroup, other.getDistributedVirtualPortgroup()))) &&
            ((this.distributedVirtualSwitch==null && other.getDistributedVirtualSwitch()==null) || 
             (this.distributedVirtualSwitch!=null &&
              java.util.Arrays.equals(this.distributedVirtualSwitch, other.getDistributedVirtualSwitch())));
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
        if (getDistributedVirtualPortgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualPortgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualPortgroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistributedVirtualSwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualSwitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualSwitch(), i);
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
        new org.apache.axis.description.TypeDesc(DVSManagerDvsConfigTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSManagerDvsConfigTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualPortgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualPortgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualPortgroupInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchInfo"));
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
