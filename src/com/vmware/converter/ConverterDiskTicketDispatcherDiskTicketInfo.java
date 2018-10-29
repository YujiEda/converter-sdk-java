/**
 * ConverterDiskTicketDispatcherDiskTicketInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDiskTicketDispatcherDiskTicketInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String diskId;

    private java.lang.String diskName;

    private java.lang.String password;

    private com.vmware.converter.HostServiceTicket ticket;

    public ConverterDiskTicketDispatcherDiskTicketInfo() {
    }

    public ConverterDiskTicketDispatcherDiskTicketInfo(
           java.lang.String diskId,
           java.lang.String diskName,
           java.lang.String password,
           com.vmware.converter.HostServiceTicket ticket) {
        this.diskId = diskId;
        this.diskName = diskName;
        this.password = password;
        this.ticket = ticket;
    }


    /**
     * Gets the diskId value for this ConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @return diskId
     */
    public java.lang.String getDiskId() {
        return diskId;
    }


    /**
     * Sets the diskId value for this ConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @param diskId
     */
    public void setDiskId(java.lang.String diskId) {
        this.diskId = diskId;
    }


    /**
     * Gets the diskName value for this ConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @return diskName
     */
    public java.lang.String getDiskName() {
        return diskName;
    }


    /**
     * Sets the diskName value for this ConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @param diskName
     */
    public void setDiskName(java.lang.String diskName) {
        this.diskName = diskName;
    }


    /**
     * Gets the password value for this ConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the ticket value for this ConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @return ticket
     */
    public com.vmware.converter.HostServiceTicket getTicket() {
        return ticket;
    }


    /**
     * Sets the ticket value for this ConverterDiskTicketDispatcherDiskTicketInfo.
     * 
     * @param ticket
     */
    public void setTicket(com.vmware.converter.HostServiceTicket ticket) {
        this.ticket = ticket;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterDiskTicketDispatcherDiskTicketInfo)) return false;
        ConverterDiskTicketDispatcherDiskTicketInfo other = (ConverterDiskTicketDispatcherDiskTicketInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskId==null && other.getDiskId()==null) || 
             (this.diskId!=null &&
              this.diskId.equals(other.getDiskId()))) &&
            ((this.diskName==null && other.getDiskName()==null) || 
             (this.diskName!=null &&
              this.diskName.equals(other.getDiskName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.ticket==null && other.getTicket()==null) || 
             (this.ticket!=null &&
              this.ticket.equals(other.getTicket())));
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
        if (getDiskId() != null) {
            _hashCode += getDiskId().hashCode();
        }
        if (getDiskName() != null) {
            _hashCode += getDiskName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getTicket() != null) {
            _hashCode += getTicket().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterDiskTicketDispatcherDiskTicketInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiskTicketDispatcherDiskTicketInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostServiceTicket"));
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
