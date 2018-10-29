/**
 * DeltaDiskFormatNotSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DeltaDiskFormatNotSupported  extends com.vmware.converter.VmConfigFault  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference[] datastore;

    private java.lang.String deltaDiskFormat;

    public DeltaDiskFormatNotSupported() {
    }

    public DeltaDiskFormatNotSupported(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference[] datastore,
           java.lang.String deltaDiskFormat) {
        super(
            faultCause,
            faultMessage);
        this.datastore = datastore;
        this.deltaDiskFormat = deltaDiskFormat;
    }


    /**
     * Gets the datastore value for this DeltaDiskFormatNotSupported.
     * 
     * @return datastore
     */
    public com.vmware.converter.ManagedObjectReference[] getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this DeltaDiskFormatNotSupported.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.converter.ManagedObjectReference[] datastore) {
        this.datastore = datastore;
    }

    public com.vmware.converter.ManagedObjectReference getDatastore(int i) {
        return this.datastore[i];
    }

    public void setDatastore(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.datastore[i] = _value;
    }


    /**
     * Gets the deltaDiskFormat value for this DeltaDiskFormatNotSupported.
     * 
     * @return deltaDiskFormat
     */
    public java.lang.String getDeltaDiskFormat() {
        return deltaDiskFormat;
    }


    /**
     * Sets the deltaDiskFormat value for this DeltaDiskFormatNotSupported.
     * 
     * @param deltaDiskFormat
     */
    public void setDeltaDiskFormat(java.lang.String deltaDiskFormat) {
        this.deltaDiskFormat = deltaDiskFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeltaDiskFormatNotSupported)) return false;
        DeltaDiskFormatNotSupported other = (DeltaDiskFormatNotSupported) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              java.util.Arrays.equals(this.datastore, other.getDatastore()))) &&
            ((this.deltaDiskFormat==null && other.getDeltaDiskFormat()==null) || 
             (this.deltaDiskFormat!=null &&
              this.deltaDiskFormat.equals(other.getDeltaDiskFormat())));
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
        if (getDatastore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeltaDiskFormat() != null) {
            _hashCode += getDeltaDiskFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeltaDiskFormatNotSupported.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DeltaDiskFormatNotSupported"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaDiskFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deltaDiskFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
