/**
 * ConverterPropertyInfoInsufficientSpaceError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterPropertyInfoInsufficientSpaceError  extends com.vmware.converter.ConverterPropertyInfo  implements java.io.Serializable {
    private java.lang.String targetName;

    public ConverterPropertyInfoInsufficientSpaceError() {
    }

    public ConverterPropertyInfoInsufficientSpaceError(
           java.lang.String property,
           java.lang.String severityLevel,
           java.lang.String message,
           java.lang.String targetName) {
        super(
            property,
            severityLevel,
            message);
        this.targetName = targetName;
    }


    /**
     * Gets the targetName value for this ConverterPropertyInfoInsufficientSpaceError.
     * 
     * @return targetName
     */
    public java.lang.String getTargetName() {
        return targetName;
    }


    /**
     * Sets the targetName value for this ConverterPropertyInfoInsufficientSpaceError.
     * 
     * @param targetName
     */
    public void setTargetName(java.lang.String targetName) {
        this.targetName = targetName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterPropertyInfoInsufficientSpaceError)) return false;
        ConverterPropertyInfoInsufficientSpaceError other = (ConverterPropertyInfoInsufficientSpaceError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetName==null && other.getTargetName()==null) || 
             (this.targetName!=null &&
              this.targetName.equals(other.getTargetName())));
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
        if (getTargetName() != null) {
            _hashCode += getTargetName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterPropertyInfoInsufficientSpaceError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterPropertyInfoInsufficientSpaceError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetName"));
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
