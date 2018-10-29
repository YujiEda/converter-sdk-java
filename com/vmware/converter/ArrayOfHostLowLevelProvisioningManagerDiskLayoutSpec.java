/**
 * ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec  implements java.io.Serializable {
    private com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec[] hostLowLevelProvisioningManagerDiskLayoutSpec;

    public ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec() {
    }

    public ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec(
           com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec[] hostLowLevelProvisioningManagerDiskLayoutSpec) {
           this.hostLowLevelProvisioningManagerDiskLayoutSpec = hostLowLevelProvisioningManagerDiskLayoutSpec;
    }


    /**
     * Gets the hostLowLevelProvisioningManagerDiskLayoutSpec value for this ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @return hostLowLevelProvisioningManagerDiskLayoutSpec
     */
    public com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec[] getHostLowLevelProvisioningManagerDiskLayoutSpec() {
        return hostLowLevelProvisioningManagerDiskLayoutSpec;
    }


    /**
     * Sets the hostLowLevelProvisioningManagerDiskLayoutSpec value for this ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec.
     * 
     * @param hostLowLevelProvisioningManagerDiskLayoutSpec
     */
    public void setHostLowLevelProvisioningManagerDiskLayoutSpec(com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec[] hostLowLevelProvisioningManagerDiskLayoutSpec) {
        this.hostLowLevelProvisioningManagerDiskLayoutSpec = hostLowLevelProvisioningManagerDiskLayoutSpec;
    }

    public com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec getHostLowLevelProvisioningManagerDiskLayoutSpec(int i) {
        return this.hostLowLevelProvisioningManagerDiskLayoutSpec[i];
    }

    public void setHostLowLevelProvisioningManagerDiskLayoutSpec(int i, com.vmware.converter.HostLowLevelProvisioningManagerDiskLayoutSpec _value) {
        this.hostLowLevelProvisioningManagerDiskLayoutSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec)) return false;
        ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec other = (ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostLowLevelProvisioningManagerDiskLayoutSpec==null && other.getHostLowLevelProvisioningManagerDiskLayoutSpec()==null) || 
             (this.hostLowLevelProvisioningManagerDiskLayoutSpec!=null &&
              java.util.Arrays.equals(this.hostLowLevelProvisioningManagerDiskLayoutSpec, other.getHostLowLevelProvisioningManagerDiskLayoutSpec())));
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
        if (getHostLowLevelProvisioningManagerDiskLayoutSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostLowLevelProvisioningManagerDiskLayoutSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostLowLevelProvisioningManagerDiskLayoutSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostLowLevelProvisioningManagerDiskLayoutSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerDiskLayoutSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerDiskLayoutSpec"));
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
