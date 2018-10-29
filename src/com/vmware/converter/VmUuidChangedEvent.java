/**
 * VmUuidChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmUuidChangedEvent  extends com.vmware.converter.VmEvent  implements java.io.Serializable {
    private java.lang.String oldUuid;

    private java.lang.String newUuid;

    public VmUuidChangedEvent() {
    }

    public VmUuidChangedEvent(
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
           boolean template,
           java.lang.String oldUuid,
           java.lang.String newUuid) {
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
            changeTag,
            template);
        this.oldUuid = oldUuid;
        this.newUuid = newUuid;
    }


    /**
     * Gets the oldUuid value for this VmUuidChangedEvent.
     * 
     * @return oldUuid
     */
    public java.lang.String getOldUuid() {
        return oldUuid;
    }


    /**
     * Sets the oldUuid value for this VmUuidChangedEvent.
     * 
     * @param oldUuid
     */
    public void setOldUuid(java.lang.String oldUuid) {
        this.oldUuid = oldUuid;
    }


    /**
     * Gets the newUuid value for this VmUuidChangedEvent.
     * 
     * @return newUuid
     */
    public java.lang.String getNewUuid() {
        return newUuid;
    }


    /**
     * Sets the newUuid value for this VmUuidChangedEvent.
     * 
     * @param newUuid
     */
    public void setNewUuid(java.lang.String newUuid) {
        this.newUuid = newUuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmUuidChangedEvent)) return false;
        VmUuidChangedEvent other = (VmUuidChangedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldUuid==null && other.getOldUuid()==null) || 
             (this.oldUuid!=null &&
              this.oldUuid.equals(other.getOldUuid()))) &&
            ((this.newUuid==null && other.getNewUuid()==null) || 
             (this.newUuid!=null &&
              this.newUuid.equals(other.getNewUuid())));
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
        if (getOldUuid() != null) {
            _hashCode += getOldUuid().hashCode();
        }
        if (getNewUuid() != null) {
            _hashCode += getNewUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmUuidChangedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmUuidChangedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
