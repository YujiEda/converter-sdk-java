/**
 * ArrayOfIpPoolManagerIpAllocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfIpPoolManagerIpAllocation  implements java.io.Serializable {
    private com.vmware.converter.IpPoolManagerIpAllocation[] ipPoolManagerIpAllocation;

    public ArrayOfIpPoolManagerIpAllocation() {
    }

    public ArrayOfIpPoolManagerIpAllocation(
           com.vmware.converter.IpPoolManagerIpAllocation[] ipPoolManagerIpAllocation) {
           this.ipPoolManagerIpAllocation = ipPoolManagerIpAllocation;
    }


    /**
     * Gets the ipPoolManagerIpAllocation value for this ArrayOfIpPoolManagerIpAllocation.
     * 
     * @return ipPoolManagerIpAllocation
     */
    public com.vmware.converter.IpPoolManagerIpAllocation[] getIpPoolManagerIpAllocation() {
        return ipPoolManagerIpAllocation;
    }


    /**
     * Sets the ipPoolManagerIpAllocation value for this ArrayOfIpPoolManagerIpAllocation.
     * 
     * @param ipPoolManagerIpAllocation
     */
    public void setIpPoolManagerIpAllocation(com.vmware.converter.IpPoolManagerIpAllocation[] ipPoolManagerIpAllocation) {
        this.ipPoolManagerIpAllocation = ipPoolManagerIpAllocation;
    }

    public com.vmware.converter.IpPoolManagerIpAllocation getIpPoolManagerIpAllocation(int i) {
        return this.ipPoolManagerIpAllocation[i];
    }

    public void setIpPoolManagerIpAllocation(int i, com.vmware.converter.IpPoolManagerIpAllocation _value) {
        this.ipPoolManagerIpAllocation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfIpPoolManagerIpAllocation)) return false;
        ArrayOfIpPoolManagerIpAllocation other = (ArrayOfIpPoolManagerIpAllocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipPoolManagerIpAllocation==null && other.getIpPoolManagerIpAllocation()==null) || 
             (this.ipPoolManagerIpAllocation!=null &&
              java.util.Arrays.equals(this.ipPoolManagerIpAllocation, other.getIpPoolManagerIpAllocation())));
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
        if (getIpPoolManagerIpAllocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpPoolManagerIpAllocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpPoolManagerIpAllocation(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfIpPoolManagerIpAllocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfIpPoolManagerIpAllocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipPoolManagerIpAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "IpPoolManagerIpAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpPoolManagerIpAllocation"));
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
