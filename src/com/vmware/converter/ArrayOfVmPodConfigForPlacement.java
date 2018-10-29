/**
 * ArrayOfVmPodConfigForPlacement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVmPodConfigForPlacement  implements java.io.Serializable {
    private com.vmware.converter.VmPodConfigForPlacement[] vmPodConfigForPlacement;

    public ArrayOfVmPodConfigForPlacement() {
    }

    public ArrayOfVmPodConfigForPlacement(
           com.vmware.converter.VmPodConfigForPlacement[] vmPodConfigForPlacement) {
           this.vmPodConfigForPlacement = vmPodConfigForPlacement;
    }


    /**
     * Gets the vmPodConfigForPlacement value for this ArrayOfVmPodConfigForPlacement.
     * 
     * @return vmPodConfigForPlacement
     */
    public com.vmware.converter.VmPodConfigForPlacement[] getVmPodConfigForPlacement() {
        return vmPodConfigForPlacement;
    }


    /**
     * Sets the vmPodConfigForPlacement value for this ArrayOfVmPodConfigForPlacement.
     * 
     * @param vmPodConfigForPlacement
     */
    public void setVmPodConfigForPlacement(com.vmware.converter.VmPodConfigForPlacement[] vmPodConfigForPlacement) {
        this.vmPodConfigForPlacement = vmPodConfigForPlacement;
    }

    public com.vmware.converter.VmPodConfigForPlacement getVmPodConfigForPlacement(int i) {
        return this.vmPodConfigForPlacement[i];
    }

    public void setVmPodConfigForPlacement(int i, com.vmware.converter.VmPodConfigForPlacement _value) {
        this.vmPodConfigForPlacement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVmPodConfigForPlacement)) return false;
        ArrayOfVmPodConfigForPlacement other = (ArrayOfVmPodConfigForPlacement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vmPodConfigForPlacement==null && other.getVmPodConfigForPlacement()==null) || 
             (this.vmPodConfigForPlacement!=null &&
              java.util.Arrays.equals(this.vmPodConfigForPlacement, other.getVmPodConfigForPlacement())));
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
        if (getVmPodConfigForPlacement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmPodConfigForPlacement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmPodConfigForPlacement(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVmPodConfigForPlacement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVmPodConfigForPlacement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmPodConfigForPlacement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VmPodConfigForPlacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmPodConfigForPlacement"));
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
