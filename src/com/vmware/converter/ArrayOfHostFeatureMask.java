/**
 * ArrayOfHostFeatureMask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostFeatureMask  implements java.io.Serializable {
    private com.vmware.converter.HostFeatureMask[] hostFeatureMask;

    public ArrayOfHostFeatureMask() {
    }

    public ArrayOfHostFeatureMask(
           com.vmware.converter.HostFeatureMask[] hostFeatureMask) {
           this.hostFeatureMask = hostFeatureMask;
    }


    /**
     * Gets the hostFeatureMask value for this ArrayOfHostFeatureMask.
     * 
     * @return hostFeatureMask
     */
    public com.vmware.converter.HostFeatureMask[] getHostFeatureMask() {
        return hostFeatureMask;
    }


    /**
     * Sets the hostFeatureMask value for this ArrayOfHostFeatureMask.
     * 
     * @param hostFeatureMask
     */
    public void setHostFeatureMask(com.vmware.converter.HostFeatureMask[] hostFeatureMask) {
        this.hostFeatureMask = hostFeatureMask;
    }

    public com.vmware.converter.HostFeatureMask getHostFeatureMask(int i) {
        return this.hostFeatureMask[i];
    }

    public void setHostFeatureMask(int i, com.vmware.converter.HostFeatureMask _value) {
        this.hostFeatureMask[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostFeatureMask)) return false;
        ArrayOfHostFeatureMask other = (ArrayOfHostFeatureMask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostFeatureMask==null && other.getHostFeatureMask()==null) || 
             (this.hostFeatureMask!=null &&
              java.util.Arrays.equals(this.hostFeatureMask, other.getHostFeatureMask())));
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
        if (getHostFeatureMask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostFeatureMask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostFeatureMask(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostFeatureMask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostFeatureMask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostFeatureMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostFeatureMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFeatureMask"));
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
