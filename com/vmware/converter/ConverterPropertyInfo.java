/**
 * ConverterPropertyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterPropertyInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String property;

    private java.lang.String severityLevel;

    private java.lang.String message;

    public ConverterPropertyInfo() {
    }

    public ConverterPropertyInfo(
           java.lang.String property,
           java.lang.String severityLevel,
           java.lang.String message) {
        this.property = property;
        this.severityLevel = severityLevel;
        this.message = message;
    }


    /**
     * Gets the property value for this ConverterPropertyInfo.
     * 
     * @return property
     */
    public java.lang.String getProperty() {
        return property;
    }


    /**
     * Sets the property value for this ConverterPropertyInfo.
     * 
     * @param property
     */
    public void setProperty(java.lang.String property) {
        this.property = property;
    }


    /**
     * Gets the severityLevel value for this ConverterPropertyInfo.
     * 
     * @return severityLevel
     */
    public java.lang.String getSeverityLevel() {
        return severityLevel;
    }


    /**
     * Sets the severityLevel value for this ConverterPropertyInfo.
     * 
     * @param severityLevel
     */
    public void setSeverityLevel(java.lang.String severityLevel) {
        this.severityLevel = severityLevel;
    }


    /**
     * Gets the message value for this ConverterPropertyInfo.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ConverterPropertyInfo.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterPropertyInfo)) return false;
        ConverterPropertyInfo other = (ConverterPropertyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              this.property.equals(other.getProperty()))) &&
            ((this.severityLevel==null && other.getSeverityLevel()==null) || 
             (this.severityLevel!=null &&
              this.severityLevel.equals(other.getSeverityLevel()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getProperty() != null) {
            _hashCode += getProperty().hashCode();
        }
        if (getSeverityLevel() != null) {
            _hashCode += getSeverityLevel().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterPropertyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterPropertyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "severityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "message"));
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
