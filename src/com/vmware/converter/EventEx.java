/**
 * EventEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EventEx  extends com.vmware.converter.Event  implements java.io.Serializable {
    private java.lang.String eventTypeId;

    private java.lang.String severity;

    private java.lang.String message;

    private com.vmware.converter.KeyAnyValue[] arguments;

    private java.lang.String objectId;

    private java.lang.String objectType;

    private java.lang.String objectName;

    private com.vmware.converter.LocalizedMethodFault fault;

    public EventEx() {
    }

    public EventEx(
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
           java.lang.String eventTypeId,
           java.lang.String severity,
           java.lang.String message,
           com.vmware.converter.KeyAnyValue[] arguments,
           java.lang.String objectId,
           java.lang.String objectType,
           java.lang.String objectName,
           com.vmware.converter.LocalizedMethodFault fault) {
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
        this.eventTypeId = eventTypeId;
        this.severity = severity;
        this.message = message;
        this.arguments = arguments;
        this.objectId = objectId;
        this.objectType = objectType;
        this.objectName = objectName;
        this.fault = fault;
    }


    /**
     * Gets the eventTypeId value for this EventEx.
     * 
     * @return eventTypeId
     */
    public java.lang.String getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this EventEx.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(java.lang.String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the severity value for this EventEx.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this EventEx.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the message value for this EventEx.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this EventEx.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the arguments value for this EventEx.
     * 
     * @return arguments
     */
    public com.vmware.converter.KeyAnyValue[] getArguments() {
        return arguments;
    }


    /**
     * Sets the arguments value for this EventEx.
     * 
     * @param arguments
     */
    public void setArguments(com.vmware.converter.KeyAnyValue[] arguments) {
        this.arguments = arguments;
    }

    public com.vmware.converter.KeyAnyValue getArguments(int i) {
        return this.arguments[i];
    }

    public void setArguments(int i, com.vmware.converter.KeyAnyValue _value) {
        this.arguments[i] = _value;
    }


    /**
     * Gets the objectId value for this EventEx.
     * 
     * @return objectId
     */
    public java.lang.String getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this EventEx.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.String objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objectType value for this EventEx.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this EventEx.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the objectName value for this EventEx.
     * 
     * @return objectName
     */
    public java.lang.String getObjectName() {
        return objectName;
    }


    /**
     * Sets the objectName value for this EventEx.
     * 
     * @param objectName
     */
    public void setObjectName(java.lang.String objectName) {
        this.objectName = objectName;
    }


    /**
     * Gets the fault value for this EventEx.
     * 
     * @return fault
     */
    public com.vmware.converter.LocalizedMethodFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this EventEx.
     * 
     * @param fault
     */
    public void setFault(com.vmware.converter.LocalizedMethodFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventEx)) return false;
        EventEx other = (EventEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventTypeId==null && other.getEventTypeId()==null) || 
             (this.eventTypeId!=null &&
              this.eventTypeId.equals(other.getEventTypeId()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.arguments==null && other.getArguments()==null) || 
             (this.arguments!=null &&
              java.util.Arrays.equals(this.arguments, other.getArguments()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.objectName==null && other.getObjectName()==null) || 
             (this.objectName!=null &&
              this.objectName.equals(other.getObjectName()))) &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              this.fault.equals(other.getFault())));
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
        if (getEventTypeId() != null) {
            _hashCode += getEventTypeId().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getArguments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArguments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArguments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getObjectName() != null) {
            _hashCode += getObjectName().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EventEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arguments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "arguments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyAnyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
