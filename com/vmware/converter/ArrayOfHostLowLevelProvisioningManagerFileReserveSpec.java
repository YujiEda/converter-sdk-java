/**
 * ArrayOfHostLowLevelProvisioningManagerFileReserveSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostLowLevelProvisioningManagerFileReserveSpec  implements java.io.Serializable {
    private com.vmware.converter.HostLowLevelProvisioningManagerFileReserveSpec[] hostLowLevelProvisioningManagerFileReserveSpec;

    public ArrayOfHostLowLevelProvisioningManagerFileReserveSpec() {
    }

    public ArrayOfHostLowLevelProvisioningManagerFileReserveSpec(
           com.vmware.converter.HostLowLevelProvisioningManagerFileReserveSpec[] hostLowLevelProvisioningManagerFileReserveSpec) {
           this.hostLowLevelProvisioningManagerFileReserveSpec = hostLowLevelProvisioningManagerFileReserveSpec;
    }


    /**
     * Gets the hostLowLevelProvisioningManagerFileReserveSpec value for this ArrayOfHostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @return hostLowLevelProvisioningManagerFileReserveSpec
     */
    public com.vmware.converter.HostLowLevelProvisioningManagerFileReserveSpec[] getHostLowLevelProvisioningManagerFileReserveSpec() {
        return hostLowLevelProvisioningManagerFileReserveSpec;
    }


    /**
     * Sets the hostLowLevelProvisioningManagerFileReserveSpec value for this ArrayOfHostLowLevelProvisioningManagerFileReserveSpec.
     * 
     * @param hostLowLevelProvisioningManagerFileReserveSpec
     */
    public void setHostLowLevelProvisioningManagerFileReserveSpec(com.vmware.converter.HostLowLevelProvisioningManagerFileReserveSpec[] hostLowLevelProvisioningManagerFileReserveSpec) {
        this.hostLowLevelProvisioningManagerFileReserveSpec = hostLowLevelProvisioningManagerFileReserveSpec;
    }

    public com.vmware.converter.HostLowLevelProvisioningManagerFileReserveSpec getHostLowLevelProvisioningManagerFileReserveSpec(int i) {
        return this.hostLowLevelProvisioningManagerFileReserveSpec[i];
    }

    public void setHostLowLevelProvisioningManagerFileReserveSpec(int i, com.vmware.converter.HostLowLevelProvisioningManagerFileReserveSpec _value) {
        this.hostLowLevelProvisioningManagerFileReserveSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostLowLevelProvisioningManagerFileReserveSpec)) return false;
        ArrayOfHostLowLevelProvisioningManagerFileReserveSpec other = (ArrayOfHostLowLevelProvisioningManagerFileReserveSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostLowLevelProvisioningManagerFileReserveSpec==null && other.getHostLowLevelProvisioningManagerFileReserveSpec()==null) || 
             (this.hostLowLevelProvisioningManagerFileReserveSpec!=null &&
              java.util.Arrays.equals(this.hostLowLevelProvisioningManagerFileReserveSpec, other.getHostLowLevelProvisioningManagerFileReserveSpec())));
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
        if (getHostLowLevelProvisioningManagerFileReserveSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostLowLevelProvisioningManagerFileReserveSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostLowLevelProvisioningManagerFileReserveSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostLowLevelProvisioningManagerFileReserveSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostLowLevelProvisioningManagerFileReserveSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostLowLevelProvisioningManagerFileReserveSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerFileReserveSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerFileReserveSpec"));
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
