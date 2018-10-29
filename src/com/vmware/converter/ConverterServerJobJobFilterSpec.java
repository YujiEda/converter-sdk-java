/**
 * ConverterServerJobJobFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerJobJobFilterSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterServerJobJobFilterSpecByTime timeRange;

    private java.lang.String owner;

    private java.lang.String[] state;

    public ConverterServerJobJobFilterSpec() {
    }

    public ConverterServerJobJobFilterSpec(
           com.vmware.converter.ConverterServerJobJobFilterSpecByTime timeRange,
           java.lang.String owner,
           java.lang.String[] state) {
        this.timeRange = timeRange;
        this.owner = owner;
        this.state = state;
    }


    /**
     * Gets the timeRange value for this ConverterServerJobJobFilterSpec.
     * 
     * @return timeRange
     */
    public com.vmware.converter.ConverterServerJobJobFilterSpecByTime getTimeRange() {
        return timeRange;
    }


    /**
     * Sets the timeRange value for this ConverterServerJobJobFilterSpec.
     * 
     * @param timeRange
     */
    public void setTimeRange(com.vmware.converter.ConverterServerJobJobFilterSpecByTime timeRange) {
        this.timeRange = timeRange;
    }


    /**
     * Gets the owner value for this ConverterServerJobJobFilterSpec.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ConverterServerJobJobFilterSpec.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the state value for this ConverterServerJobJobFilterSpec.
     * 
     * @return state
     */
    public java.lang.String[] getState() {
        return state;
    }


    /**
     * Sets the state value for this ConverterServerJobJobFilterSpec.
     * 
     * @param state
     */
    public void setState(java.lang.String[] state) {
        this.state = state;
    }

    public java.lang.String getState(int i) {
        return this.state[i];
    }

    public void setState(int i, java.lang.String _value) {
        this.state[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerJobJobFilterSpec)) return false;
        ConverterServerJobJobFilterSpec other = (ConverterServerJobJobFilterSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timeRange==null && other.getTimeRange()==null) || 
             (this.timeRange!=null &&
              this.timeRange.equals(other.getTimeRange()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState())));
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
        if (getTimeRange() != null) {
            _hashCode += getTimeRange().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterServerJobJobFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerJobJobFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "timeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerJobJobFilterSpecByTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
