/**
 * ConverterGetSupportedConfigOptionsForManagedRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterGetSupportedConfigOptionsForManagedRequestType  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference _this;

    private com.vmware.converter.ConverterTargetVmSpecManagedVmLocation[] targets;

    public ConverterGetSupportedConfigOptionsForManagedRequestType() {
    }

    public ConverterGetSupportedConfigOptionsForManagedRequestType(
           com.vmware.converter.ManagedObjectReference _this,
           com.vmware.converter.ConverterTargetVmSpecManagedVmLocation[] targets) {
           this._this = _this;
           this.targets = targets;
    }


    /**
     * Gets the _this value for this ConverterGetSupportedConfigOptionsForManagedRequestType.
     * 
     * @return _this
     */
    public com.vmware.converter.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ConverterGetSupportedConfigOptionsForManagedRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.converter.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the targets value for this ConverterGetSupportedConfigOptionsForManagedRequestType.
     * 
     * @return targets
     */
    public com.vmware.converter.ConverterTargetVmSpecManagedVmLocation[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this ConverterGetSupportedConfigOptionsForManagedRequestType.
     * 
     * @param targets
     */
    public void setTargets(com.vmware.converter.ConverterTargetVmSpecManagedVmLocation[] targets) {
        this.targets = targets;
    }

    public com.vmware.converter.ConverterTargetVmSpecManagedVmLocation getTargets(int i) {
        return this.targets[i];
    }

    public void setTargets(int i, com.vmware.converter.ConverterTargetVmSpecManagedVmLocation _value) {
        this.targets[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterGetSupportedConfigOptionsForManagedRequestType)) return false;
        ConverterGetSupportedConfigOptionsForManagedRequestType other = (ConverterGetSupportedConfigOptionsForManagedRequestType) obj;
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
            ((this.targets==null && other.getTargets()==null) || 
             (this.targets!=null &&
              java.util.Arrays.equals(this.targets, other.getTargets())));
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
        if (getTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterGetSupportedConfigOptionsForManagedRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterGetSupportedConfigOptionsForManagedRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTargetVmSpecManagedVmLocation"));
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
