/**
 * ConverterAgentPassDiskTicketsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentPassDiskTicketsRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private java.lang.String requestId;

    private com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo[] ticketInfos;

    public ConverterAgentPassDiskTicketsRequestType() {
    }

    public ConverterAgentPassDiskTicketsRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           java.lang.String requestId,
           com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo[] ticketInfos) {
           this._this = _this;
           this.requestId = requestId;
           this.ticketInfos = ticketInfos;
    }


    /**
     * Gets the _this value for this ConverterAgentPassDiskTicketsRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterAgentPassDiskTicketsRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the requestId value for this ConverterAgentPassDiskTicketsRequestType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ConverterAgentPassDiskTicketsRequestType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the ticketInfos value for this ConverterAgentPassDiskTicketsRequestType.
     * 
     * @return ticketInfos
     */
    public com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo[] getTicketInfos() {
        return ticketInfos;
    }


    /**
     * Sets the ticketInfos value for this ConverterAgentPassDiskTicketsRequestType.
     * 
     * @param ticketInfos
     */
    public void setTicketInfos(com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo[] ticketInfos) {
        this.ticketInfos = ticketInfos;
    }

    public com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo getTicketInfos(int i) {
        return this.ticketInfos[i];
    }

    public void setTicketInfos(int i, com.vmware.converter.ConverterDiskTicketDispatcherDiskTicketInfo _value) {
        this.ticketInfos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentPassDiskTicketsRequestType)) return false;
        ConverterAgentPassDiskTicketsRequestType other = (ConverterAgentPassDiskTicketsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.ticketInfos==null && other.getTicketInfos()==null) || 
             (this.ticketInfos!=null &&
              java.util.Arrays.equals(this.ticketInfos, other.getTicketInfos())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getTicketInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTicketInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTicketInfos(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterAgentPassDiskTicketsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentPassDiskTicketsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "ticketInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiskTicketDispatcherDiskTicketInfo"));
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
