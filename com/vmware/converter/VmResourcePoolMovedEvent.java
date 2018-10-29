/**
 * VmResourcePoolMovedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmResourcePoolMovedEvent  extends com.vmware.converter.VmEvent  implements java.io.Serializable {
    private com.vmware.converter.ResourcePoolEventArgument oldParent;

    private com.vmware.converter.ResourcePoolEventArgument newParent;

    public VmResourcePoolMovedEvent() {
    }

    public VmResourcePoolMovedEvent(
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
           com.vmware.converter.ResourcePoolEventArgument oldParent,
           com.vmware.converter.ResourcePoolEventArgument newParent) {
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
        this.oldParent = oldParent;
        this.newParent = newParent;
    }


    /**
     * Gets the oldParent value for this VmResourcePoolMovedEvent.
     * 
     * @return oldParent
     */
    public com.vmware.converter.ResourcePoolEventArgument getOldParent() {
        return oldParent;
    }


    /**
     * Sets the oldParent value for this VmResourcePoolMovedEvent.
     * 
     * @param oldParent
     */
    public void setOldParent(com.vmware.converter.ResourcePoolEventArgument oldParent) {
        this.oldParent = oldParent;
    }


    /**
     * Gets the newParent value for this VmResourcePoolMovedEvent.
     * 
     * @return newParent
     */
    public com.vmware.converter.ResourcePoolEventArgument getNewParent() {
        return newParent;
    }


    /**
     * Sets the newParent value for this VmResourcePoolMovedEvent.
     * 
     * @param newParent
     */
    public void setNewParent(com.vmware.converter.ResourcePoolEventArgument newParent) {
        this.newParent = newParent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmResourcePoolMovedEvent)) return false;
        VmResourcePoolMovedEvent other = (VmResourcePoolMovedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldParent==null && other.getOldParent()==null) || 
             (this.oldParent!=null &&
              this.oldParent.equals(other.getOldParent()))) &&
            ((this.newParent==null && other.getNewParent()==null) || 
             (this.newParent!=null &&
              this.newParent.equals(other.getNewParent())));
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
        if (getOldParent() != null) {
            _hashCode += getOldParent().hashCode();
        }
        if (getNewParent() != null) {
            _hashCode += getNewParent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmResourcePoolMovedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmResourcePoolMovedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourcePoolEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourcePoolEventArgument"));
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
