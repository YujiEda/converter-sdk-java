/**
 * ConverterServiceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServiceInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String serviceName;

    private java.lang.String displayName;

    private java.lang.String description;

    private com.vmware.converter.ConverterServiceInfoServiceState currentState;

    private com.vmware.converter.ConverterServiceStartType startType;

    private boolean canBeStopped;

    public ConverterServiceInfo() {
    }

    public ConverterServiceInfo(
           java.lang.String serviceName,
           java.lang.String displayName,
           java.lang.String description,
           com.vmware.converter.ConverterServiceInfoServiceState currentState,
           com.vmware.converter.ConverterServiceStartType startType,
           boolean canBeStopped) {
        this.serviceName = serviceName;
        this.displayName = displayName;
        this.description = description;
        this.currentState = currentState;
        this.startType = startType;
        this.canBeStopped = canBeStopped;
    }


    /**
     * Gets the serviceName value for this ConverterServiceInfo.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this ConverterServiceInfo.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the displayName value for this ConverterServiceInfo.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ConverterServiceInfo.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this ConverterServiceInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ConverterServiceInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the currentState value for this ConverterServiceInfo.
     * 
     * @return currentState
     */
    public com.vmware.converter.ConverterServiceInfoServiceState getCurrentState() {
        return currentState;
    }


    /**
     * Sets the currentState value for this ConverterServiceInfo.
     * 
     * @param currentState
     */
    public void setCurrentState(com.vmware.converter.ConverterServiceInfoServiceState currentState) {
        this.currentState = currentState;
    }


    /**
     * Gets the startType value for this ConverterServiceInfo.
     * 
     * @return startType
     */
    public com.vmware.converter.ConverterServiceStartType getStartType() {
        return startType;
    }


    /**
     * Sets the startType value for this ConverterServiceInfo.
     * 
     * @param startType
     */
    public void setStartType(com.vmware.converter.ConverterServiceStartType startType) {
        this.startType = startType;
    }


    /**
     * Gets the canBeStopped value for this ConverterServiceInfo.
     * 
     * @return canBeStopped
     */
    public boolean isCanBeStopped() {
        return canBeStopped;
    }


    /**
     * Sets the canBeStopped value for this ConverterServiceInfo.
     * 
     * @param canBeStopped
     */
    public void setCanBeStopped(boolean canBeStopped) {
        this.canBeStopped = canBeStopped;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServiceInfo)) return false;
        ConverterServiceInfo other = (ConverterServiceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.currentState==null && other.getCurrentState()==null) || 
             (this.currentState!=null &&
              this.currentState.equals(other.getCurrentState()))) &&
            ((this.startType==null && other.getStartType()==null) || 
             (this.startType!=null &&
              this.startType.equals(other.getStartType()))) &&
            this.canBeStopped == other.isCanBeStopped();
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
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCurrentState() != null) {
            _hashCode += getCurrentState().hashCode();
        }
        if (getStartType() != null) {
            _hashCode += getStartType().hashCode();
        }
        _hashCode += (isCanBeStopped() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServiceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "currentState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceInfoServiceState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "startType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServiceStartType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canBeStopped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "canBeStopped"));
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
