/**
 * DatacenterMismatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DatacenterMismatch  extends com.vmware.converter.MigrationFault  implements java.io.Serializable {
    private com.vmware.converter.DatacenterMismatchArgument[] invalidArgument;

    private com.vmware.converter.ManagedObjectReference expectedDatacenter;

    public DatacenterMismatch() {
    }

    public DatacenterMismatch(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.DatacenterMismatchArgument[] invalidArgument,
           com.vmware.converter.ManagedObjectReference expectedDatacenter) {
        super(
            faultCause,
            faultMessage);
        this.invalidArgument = invalidArgument;
        this.expectedDatacenter = expectedDatacenter;
    }


    /**
     * Gets the invalidArgument value for this DatacenterMismatch.
     * 
     * @return invalidArgument
     */
    public com.vmware.converter.DatacenterMismatchArgument[] getInvalidArgument() {
        return invalidArgument;
    }


    /**
     * Sets the invalidArgument value for this DatacenterMismatch.
     * 
     * @param invalidArgument
     */
    public void setInvalidArgument(com.vmware.converter.DatacenterMismatchArgument[] invalidArgument) {
        this.invalidArgument = invalidArgument;
    }

    public com.vmware.converter.DatacenterMismatchArgument getInvalidArgument(int i) {
        return this.invalidArgument[i];
    }

    public void setInvalidArgument(int i, com.vmware.converter.DatacenterMismatchArgument _value) {
        this.invalidArgument[i] = _value;
    }


    /**
     * Gets the expectedDatacenter value for this DatacenterMismatch.
     * 
     * @return expectedDatacenter
     */
    public com.vmware.converter.ManagedObjectReference getExpectedDatacenter() {
        return expectedDatacenter;
    }


    /**
     * Sets the expectedDatacenter value for this DatacenterMismatch.
     * 
     * @param expectedDatacenter
     */
    public void setExpectedDatacenter(com.vmware.converter.ManagedObjectReference expectedDatacenter) {
        this.expectedDatacenter = expectedDatacenter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatacenterMismatch)) return false;
        DatacenterMismatch other = (DatacenterMismatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invalidArgument==null && other.getInvalidArgument()==null) || 
             (this.invalidArgument!=null &&
              java.util.Arrays.equals(this.invalidArgument, other.getInvalidArgument()))) &&
            ((this.expectedDatacenter==null && other.getExpectedDatacenter()==null) || 
             (this.expectedDatacenter!=null &&
              this.expectedDatacenter.equals(other.getExpectedDatacenter())));
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
        if (getInvalidArgument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalidArgument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalidArgument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedDatacenter() != null) {
            _hashCode += getExpectedDatacenter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatacenterMismatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatacenterMismatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidArgument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "invalidArgument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatacenterMismatchArgument"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDatacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "expectedDatacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
