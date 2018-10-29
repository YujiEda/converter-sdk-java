/**
 * ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec  implements java.io.Serializable {
    private com.vmware.converter.DistributedVirtualSwitchManagerHostDvsFilterSpec[] distributedVirtualSwitchManagerHostDvsFilterSpec;

    public ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec() {
    }

    public ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec(
           com.vmware.converter.DistributedVirtualSwitchManagerHostDvsFilterSpec[] distributedVirtualSwitchManagerHostDvsFilterSpec) {
           this.distributedVirtualSwitchManagerHostDvsFilterSpec = distributedVirtualSwitchManagerHostDvsFilterSpec;
    }


    /**
     * Gets the distributedVirtualSwitchManagerHostDvsFilterSpec value for this ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec.
     * 
     * @return distributedVirtualSwitchManagerHostDvsFilterSpec
     */
    public com.vmware.converter.DistributedVirtualSwitchManagerHostDvsFilterSpec[] getDistributedVirtualSwitchManagerHostDvsFilterSpec() {
        return distributedVirtualSwitchManagerHostDvsFilterSpec;
    }


    /**
     * Sets the distributedVirtualSwitchManagerHostDvsFilterSpec value for this ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec.
     * 
     * @param distributedVirtualSwitchManagerHostDvsFilterSpec
     */
    public void setDistributedVirtualSwitchManagerHostDvsFilterSpec(com.vmware.converter.DistributedVirtualSwitchManagerHostDvsFilterSpec[] distributedVirtualSwitchManagerHostDvsFilterSpec) {
        this.distributedVirtualSwitchManagerHostDvsFilterSpec = distributedVirtualSwitchManagerHostDvsFilterSpec;
    }

    public com.vmware.converter.DistributedVirtualSwitchManagerHostDvsFilterSpec getDistributedVirtualSwitchManagerHostDvsFilterSpec(int i) {
        return this.distributedVirtualSwitchManagerHostDvsFilterSpec[i];
    }

    public void setDistributedVirtualSwitchManagerHostDvsFilterSpec(int i, com.vmware.converter.DistributedVirtualSwitchManagerHostDvsFilterSpec _value) {
        this.distributedVirtualSwitchManagerHostDvsFilterSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec)) return false;
        ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec other = (ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributedVirtualSwitchManagerHostDvsFilterSpec==null && other.getDistributedVirtualSwitchManagerHostDvsFilterSpec()==null) || 
             (this.distributedVirtualSwitchManagerHostDvsFilterSpec!=null &&
              java.util.Arrays.equals(this.distributedVirtualSwitchManagerHostDvsFilterSpec, other.getDistributedVirtualSwitchManagerHostDvsFilterSpec())));
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
        if (getDistributedVirtualSwitchManagerHostDvsFilterSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualSwitchManagerHostDvsFilterSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualSwitchManagerHostDvsFilterSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitchManagerHostDvsFilterSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerHostDvsFilterSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerHostDvsFilterSpec"));
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
