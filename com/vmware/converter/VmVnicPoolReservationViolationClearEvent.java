/**
 * VmVnicPoolReservationViolationClearEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmVnicPoolReservationViolationClearEvent  extends com.vmware.converter.DvsEvent  implements java.io.Serializable {
    private java.lang.String vmVnicResourcePoolKey;

    private java.lang.String vmVnicResourcePoolName;

    public VmVnicPoolReservationViolationClearEvent() {
    }

    public VmVnicPoolReservationViolationClearEvent(
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.converter.DatacenterEventArgument datacenter,
           com.vmware.converter.ComputeResourceEventArgument computeResource,
           com.vmware.converter.HostEventArgument host,
           com.vmware.converter.VmEventArgument vm,
           com.vmware.converter.DatastoreEventArgument ds,
           com.vmware.converter.NetworkEventArgument net,
           com.vmware.converter.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           java.lang.String vmVnicResourcePoolKey,
           java.lang.String vmVnicResourcePoolName) {
        super(
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag);
        this.vmVnicResourcePoolKey = vmVnicResourcePoolKey;
        this.vmVnicResourcePoolName = vmVnicResourcePoolName;
    }


    /**
     * Gets the vmVnicResourcePoolKey value for this VmVnicPoolReservationViolationClearEvent.
     * 
     * @return vmVnicResourcePoolKey
     */
    public java.lang.String getVmVnicResourcePoolKey() {
        return vmVnicResourcePoolKey;
    }


    /**
     * Sets the vmVnicResourcePoolKey value for this VmVnicPoolReservationViolationClearEvent.
     * 
     * @param vmVnicResourcePoolKey
     */
    public void setVmVnicResourcePoolKey(java.lang.String vmVnicResourcePoolKey) {
        this.vmVnicResourcePoolKey = vmVnicResourcePoolKey;
    }


    /**
     * Gets the vmVnicResourcePoolName value for this VmVnicPoolReservationViolationClearEvent.
     * 
     * @return vmVnicResourcePoolName
     */
    public java.lang.String getVmVnicResourcePoolName() {
        return vmVnicResourcePoolName;
    }


    /**
     * Sets the vmVnicResourcePoolName value for this VmVnicPoolReservationViolationClearEvent.
     * 
     * @param vmVnicResourcePoolName
     */
    public void setVmVnicResourcePoolName(java.lang.String vmVnicResourcePoolName) {
        this.vmVnicResourcePoolName = vmVnicResourcePoolName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmVnicPoolReservationViolationClearEvent)) return false;
        VmVnicPoolReservationViolationClearEvent other = (VmVnicPoolReservationViolationClearEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmVnicResourcePoolKey==null && other.getVmVnicResourcePoolKey()==null) || 
             (this.vmVnicResourcePoolKey!=null &&
              this.vmVnicResourcePoolKey.equals(other.getVmVnicResourcePoolKey()))) &&
            ((this.vmVnicResourcePoolName==null && other.getVmVnicResourcePoolName()==null) || 
             (this.vmVnicResourcePoolName!=null &&
              this.vmVnicResourcePoolName.equals(other.getVmVnicResourcePoolName())));
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
        if (getVmVnicResourcePoolKey() != null) {
            _hashCode += getVmVnicResourcePoolKey().hashCode();
        }
        if (getVmVnicResourcePoolName() != null) {
            _hashCode += getVmVnicResourcePoolName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmVnicPoolReservationViolationClearEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmVnicPoolReservationViolationClearEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmVnicResourcePoolKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmVnicResourcePoolKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmVnicResourcePoolName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmVnicResourcePoolName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
