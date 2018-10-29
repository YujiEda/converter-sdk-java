/**
 * HostTpmOptionEventDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostTpmOptionEventDetails  extends com.vmware.converter.HostTpmEventDetails  implements java.io.Serializable {
    private java.lang.String optionsFileName;

    private byte[] bootOptions;

    public HostTpmOptionEventDetails() {
    }

    public HostTpmOptionEventDetails(
           byte[] dataHash,
           java.lang.String optionsFileName,
           byte[] bootOptions) {
        super(
            dataHash);
        this.optionsFileName = optionsFileName;
        this.bootOptions = bootOptions;
    }


    /**
     * Gets the optionsFileName value for this HostTpmOptionEventDetails.
     * 
     * @return optionsFileName
     */
    public java.lang.String getOptionsFileName() {
        return optionsFileName;
    }


    /**
     * Sets the optionsFileName value for this HostTpmOptionEventDetails.
     * 
     * @param optionsFileName
     */
    public void setOptionsFileName(java.lang.String optionsFileName) {
        this.optionsFileName = optionsFileName;
    }


    /**
     * Gets the bootOptions value for this HostTpmOptionEventDetails.
     * 
     * @return bootOptions
     */
    public byte[] getBootOptions() {
        return bootOptions;
    }


    /**
     * Sets the bootOptions value for this HostTpmOptionEventDetails.
     * 
     * @param bootOptions
     */
    public void setBootOptions(byte[] bootOptions) {
        this.bootOptions = bootOptions;
    }

    public byte getBootOptions(int i) {
        return this.bootOptions[i];
    }

    public void setBootOptions(int i, byte _value) {
        this.bootOptions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostTpmOptionEventDetails)) return false;
        HostTpmOptionEventDetails other = (HostTpmOptionEventDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.optionsFileName==null && other.getOptionsFileName()==null) || 
             (this.optionsFileName!=null &&
              this.optionsFileName.equals(other.getOptionsFileName()))) &&
            ((this.bootOptions==null && other.getBootOptions()==null) || 
             (this.bootOptions!=null &&
              java.util.Arrays.equals(this.bootOptions, other.getBootOptions())));
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
        if (getOptionsFileName() != null) {
            _hashCode += getOptionsFileName().hashCode();
        }
        if (getBootOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBootOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBootOptions(), i);
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
        new org.apache.axis.description.TypeDesc(HostTpmOptionEventDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmOptionEventDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "optionsFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setMinOccurs(0);
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
