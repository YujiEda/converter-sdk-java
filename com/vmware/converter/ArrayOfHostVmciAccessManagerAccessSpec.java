/**
 * ArrayOfHostVmciAccessManagerAccessSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostVmciAccessManagerAccessSpec  implements java.io.Serializable {
    private com.vmware.converter.HostVmciAccessManagerAccessSpec[] hostVmciAccessManagerAccessSpec;

    public ArrayOfHostVmciAccessManagerAccessSpec() {
    }

    public ArrayOfHostVmciAccessManagerAccessSpec(
           com.vmware.converter.HostVmciAccessManagerAccessSpec[] hostVmciAccessManagerAccessSpec) {
           this.hostVmciAccessManagerAccessSpec = hostVmciAccessManagerAccessSpec;
    }


    /**
     * Gets the hostVmciAccessManagerAccessSpec value for this ArrayOfHostVmciAccessManagerAccessSpec.
     * 
     * @return hostVmciAccessManagerAccessSpec
     */
    public com.vmware.converter.HostVmciAccessManagerAccessSpec[] getHostVmciAccessManagerAccessSpec() {
        return hostVmciAccessManagerAccessSpec;
    }


    /**
     * Sets the hostVmciAccessManagerAccessSpec value for this ArrayOfHostVmciAccessManagerAccessSpec.
     * 
     * @param hostVmciAccessManagerAccessSpec
     */
    public void setHostVmciAccessManagerAccessSpec(com.vmware.converter.HostVmciAccessManagerAccessSpec[] hostVmciAccessManagerAccessSpec) {
        this.hostVmciAccessManagerAccessSpec = hostVmciAccessManagerAccessSpec;
    }

    public com.vmware.converter.HostVmciAccessManagerAccessSpec getHostVmciAccessManagerAccessSpec(int i) {
        return this.hostVmciAccessManagerAccessSpec[i];
    }

    public void setHostVmciAccessManagerAccessSpec(int i, com.vmware.converter.HostVmciAccessManagerAccessSpec _value) {
        this.hostVmciAccessManagerAccessSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostVmciAccessManagerAccessSpec)) return false;
        ArrayOfHostVmciAccessManagerAccessSpec other = (ArrayOfHostVmciAccessManagerAccessSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostVmciAccessManagerAccessSpec==null && other.getHostVmciAccessManagerAccessSpec()==null) || 
             (this.hostVmciAccessManagerAccessSpec!=null &&
              java.util.Arrays.equals(this.hostVmciAccessManagerAccessSpec, other.getHostVmciAccessManagerAccessSpec())));
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
        if (getHostVmciAccessManagerAccessSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostVmciAccessManagerAccessSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostVmciAccessManagerAccessSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostVmciAccessManagerAccessSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostVmciAccessManagerAccessSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostVmciAccessManagerAccessSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostVmciAccessManagerAccessSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVmciAccessManagerAccessSpec"));
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
