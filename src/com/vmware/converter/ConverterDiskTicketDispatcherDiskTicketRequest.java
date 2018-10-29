/**
 * ConverterDiskTicketDispatcherDiskTicketRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterDiskTicketDispatcherDiskTicketRequest  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String requestId;

    private java.lang.String[] diskId;

    private boolean readOnly;

    public ConverterDiskTicketDispatcherDiskTicketRequest() {
    }

    public ConverterDiskTicketDispatcherDiskTicketRequest(
           java.lang.String requestId,
           java.lang.String[] diskId,
           boolean readOnly) {
        this.requestId = requestId;
        this.diskId = diskId;
        this.readOnly = readOnly;
    }


    /**
     * Gets the requestId value for this ConverterDiskTicketDispatcherDiskTicketRequest.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ConverterDiskTicketDispatcherDiskTicketRequest.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the diskId value for this ConverterDiskTicketDispatcherDiskTicketRequest.
     * 
     * @return diskId
     */
    public java.lang.String[] getDiskId() {
        return diskId;
    }


    /**
     * Sets the diskId value for this ConverterDiskTicketDispatcherDiskTicketRequest.
     * 
     * @param diskId
     */
    public void setDiskId(java.lang.String[] diskId) {
        this.diskId = diskId;
    }

    public java.lang.String getDiskId(int i) {
        return this.diskId[i];
    }

    public void setDiskId(int i, java.lang.String _value) {
        this.diskId[i] = _value;
    }


    /**
     * Gets the readOnly value for this ConverterDiskTicketDispatcherDiskTicketRequest.
     * 
     * @return readOnly
     */
    public boolean isReadOnly() {
        return readOnly;
    }


    /**
     * Sets the readOnly value for this ConverterDiskTicketDispatcherDiskTicketRequest.
     * 
     * @param readOnly
     */
    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterDiskTicketDispatcherDiskTicketRequest)) return false;
        ConverterDiskTicketDispatcherDiskTicketRequest other = (ConverterDiskTicketDispatcherDiskTicketRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.diskId==null && other.getDiskId()==null) || 
             (this.diskId!=null &&
              java.util.Arrays.equals(this.diskId, other.getDiskId()))) &&
            this.readOnly == other.isReadOnly();
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
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getDiskId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReadOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterDiskTicketDispatcherDiskTicketRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterDiskTicketDispatcherDiskTicketRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "readOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
