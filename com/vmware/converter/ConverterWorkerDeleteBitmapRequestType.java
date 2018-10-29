/**
 * ConverterWorkerDeleteBitmapRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterWorkerDeleteBitmapRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ConverterComputerSpec source;

    private java.lang.String[] prevBitmapIds;

    public ConverterWorkerDeleteBitmapRequestType() {
    }

    public ConverterWorkerDeleteBitmapRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ConverterComputerSpec source,
           java.lang.String[] prevBitmapIds) {
           this._this = _this;
           this.source = source;
           this.prevBitmapIds = prevBitmapIds;
    }


    /**
     * Gets the _this value for this ConverterWorkerDeleteBitmapRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterWorkerDeleteBitmapRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the source value for this ConverterWorkerDeleteBitmapRequestType.
     * 
     * @return source
     */
    public com.vmware.converter.ConverterComputerSpec getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConverterWorkerDeleteBitmapRequestType.
     * 
     * @param source
     */
    public void setSource(com.vmware.converter.ConverterComputerSpec source) {
        this.source = source;
    }


    /**
     * Gets the prevBitmapIds value for this ConverterWorkerDeleteBitmapRequestType.
     * 
     * @return prevBitmapIds
     */
    public java.lang.String[] getPrevBitmapIds() {
        return prevBitmapIds;
    }


    /**
     * Sets the prevBitmapIds value for this ConverterWorkerDeleteBitmapRequestType.
     * 
     * @param prevBitmapIds
     */
    public void setPrevBitmapIds(java.lang.String[] prevBitmapIds) {
        this.prevBitmapIds = prevBitmapIds;
    }

    public java.lang.String getPrevBitmapIds(int i) {
        return this.prevBitmapIds[i];
    }

    public void setPrevBitmapIds(int i, java.lang.String _value) {
        this.prevBitmapIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterWorkerDeleteBitmapRequestType)) return false;
        ConverterWorkerDeleteBitmapRequestType other = (ConverterWorkerDeleteBitmapRequestType) obj;
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
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.prevBitmapIds==null && other.getPrevBitmapIds()==null) || 
             (this.prevBitmapIds!=null &&
              java.util.Arrays.equals(this.prevBitmapIds, other.getPrevBitmapIds())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getPrevBitmapIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrevBitmapIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrevBitmapIds(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterWorkerDeleteBitmapRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterWorkerDeleteBitmapRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterComputerSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevBitmapIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "prevBitmapIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
