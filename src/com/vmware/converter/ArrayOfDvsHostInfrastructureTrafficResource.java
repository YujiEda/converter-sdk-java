/**
 * ArrayOfDvsHostInfrastructureTrafficResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDvsHostInfrastructureTrafficResource  implements java.io.Serializable {
    private com.vmware.converter.DvsHostInfrastructureTrafficResource[] dvsHostInfrastructureTrafficResource;

    public ArrayOfDvsHostInfrastructureTrafficResource() {
    }

    public ArrayOfDvsHostInfrastructureTrafficResource(
           com.vmware.converter.DvsHostInfrastructureTrafficResource[] dvsHostInfrastructureTrafficResource) {
           this.dvsHostInfrastructureTrafficResource = dvsHostInfrastructureTrafficResource;
    }


    /**
     * Gets the dvsHostInfrastructureTrafficResource value for this ArrayOfDvsHostInfrastructureTrafficResource.
     * 
     * @return dvsHostInfrastructureTrafficResource
     */
    public com.vmware.converter.DvsHostInfrastructureTrafficResource[] getDvsHostInfrastructureTrafficResource() {
        return dvsHostInfrastructureTrafficResource;
    }


    /**
     * Sets the dvsHostInfrastructureTrafficResource value for this ArrayOfDvsHostInfrastructureTrafficResource.
     * 
     * @param dvsHostInfrastructureTrafficResource
     */
    public void setDvsHostInfrastructureTrafficResource(com.vmware.converter.DvsHostInfrastructureTrafficResource[] dvsHostInfrastructureTrafficResource) {
        this.dvsHostInfrastructureTrafficResource = dvsHostInfrastructureTrafficResource;
    }

    public com.vmware.converter.DvsHostInfrastructureTrafficResource getDvsHostInfrastructureTrafficResource(int i) {
        return this.dvsHostInfrastructureTrafficResource[i];
    }

    public void setDvsHostInfrastructureTrafficResource(int i, com.vmware.converter.DvsHostInfrastructureTrafficResource _value) {
        this.dvsHostInfrastructureTrafficResource[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsHostInfrastructureTrafficResource)) return false;
        ArrayOfDvsHostInfrastructureTrafficResource other = (ArrayOfDvsHostInfrastructureTrafficResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsHostInfrastructureTrafficResource==null && other.getDvsHostInfrastructureTrafficResource()==null) || 
             (this.dvsHostInfrastructureTrafficResource!=null &&
              java.util.Arrays.equals(this.dvsHostInfrastructureTrafficResource, other.getDvsHostInfrastructureTrafficResource())));
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
        if (getDvsHostInfrastructureTrafficResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsHostInfrastructureTrafficResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsHostInfrastructureTrafficResource(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsHostInfrastructureTrafficResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsHostInfrastructureTrafficResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsHostInfrastructureTrafficResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsHostInfrastructureTrafficResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsHostInfrastructureTrafficResource"));
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
