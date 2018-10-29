/**
 * ArrayOfDvsVnicAllocatedResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDvsVnicAllocatedResource  implements java.io.Serializable {
    private com.vmware.converter.DvsVnicAllocatedResource[] dvsVnicAllocatedResource;

    public ArrayOfDvsVnicAllocatedResource() {
    }

    public ArrayOfDvsVnicAllocatedResource(
           com.vmware.converter.DvsVnicAllocatedResource[] dvsVnicAllocatedResource) {
           this.dvsVnicAllocatedResource = dvsVnicAllocatedResource;
    }


    /**
     * Gets the dvsVnicAllocatedResource value for this ArrayOfDvsVnicAllocatedResource.
     * 
     * @return dvsVnicAllocatedResource
     */
    public com.vmware.converter.DvsVnicAllocatedResource[] getDvsVnicAllocatedResource() {
        return dvsVnicAllocatedResource;
    }


    /**
     * Sets the dvsVnicAllocatedResource value for this ArrayOfDvsVnicAllocatedResource.
     * 
     * @param dvsVnicAllocatedResource
     */
    public void setDvsVnicAllocatedResource(com.vmware.converter.DvsVnicAllocatedResource[] dvsVnicAllocatedResource) {
        this.dvsVnicAllocatedResource = dvsVnicAllocatedResource;
    }

    public com.vmware.converter.DvsVnicAllocatedResource getDvsVnicAllocatedResource(int i) {
        return this.dvsVnicAllocatedResource[i];
    }

    public void setDvsVnicAllocatedResource(int i, com.vmware.converter.DvsVnicAllocatedResource _value) {
        this.dvsVnicAllocatedResource[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsVnicAllocatedResource)) return false;
        ArrayOfDvsVnicAllocatedResource other = (ArrayOfDvsVnicAllocatedResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsVnicAllocatedResource==null && other.getDvsVnicAllocatedResource()==null) || 
             (this.dvsVnicAllocatedResource!=null &&
              java.util.Arrays.equals(this.dvsVnicAllocatedResource, other.getDvsVnicAllocatedResource())));
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
        if (getDvsVnicAllocatedResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsVnicAllocatedResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsVnicAllocatedResource(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsVnicAllocatedResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsVnicAllocatedResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsVnicAllocatedResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsVnicAllocatedResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsVnicAllocatedResource"));
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
