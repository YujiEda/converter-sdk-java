/**
 * AlarmEmailFailedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AlarmEmailFailedEvent  extends com.vmware.converter.AlarmEvent  implements java.io.Serializable {
    private com.vmware.converter.ManagedEntityEventArgument entity;

    private java.lang.String to;

    private com.vmware.converter.LocalizedMethodFault reason;

    public AlarmEmailFailedEvent() {
    }

    public AlarmEmailFailedEvent(
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
           com.vmware.converter.AlarmEventArgument alarm,
           com.vmware.converter.ManagedEntityEventArgument entity,
           java.lang.String to,
           com.vmware.converter.LocalizedMethodFault reason) {
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
            alarm);
        this.entity = entity;
        this.to = to;
        this.reason = reason;
    }


    /**
     * Gets the entity value for this AlarmEmailFailedEvent.
     * 
     * @return entity
     */
    public com.vmware.converter.ManagedEntityEventArgument getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this AlarmEmailFailedEvent.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.converter.ManagedEntityEventArgument entity) {
        this.entity = entity;
    }


    /**
     * Gets the to value for this AlarmEmailFailedEvent.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this AlarmEmailFailedEvent.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the reason value for this AlarmEmailFailedEvent.
     * 
     * @return reason
     */
    public com.vmware.converter.LocalizedMethodFault getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this AlarmEmailFailedEvent.
     * 
     * @param reason
     */
    public void setReason(com.vmware.converter.LocalizedMethodFault reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmEmailFailedEvent)) return false;
        AlarmEmailFailedEvent other = (AlarmEmailFailedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmEmailFailedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmEmailFailedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedEntityEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
