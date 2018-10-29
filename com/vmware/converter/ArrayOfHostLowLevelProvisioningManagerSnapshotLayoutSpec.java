/**
 * ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec  implements java.io.Serializable {
    private com.vmware.converter.HostLowLevelProvisioningManagerSnapshotLayoutSpec[] hostLowLevelProvisioningManagerSnapshotLayoutSpec;

    public ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec() {
    }

    public ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec(
           com.vmware.converter.HostLowLevelProvisioningManagerSnapshotLayoutSpec[] hostLowLevelProvisioningManagerSnapshotLayoutSpec) {
           this.hostLowLevelProvisioningManagerSnapshotLayoutSpec = hostLowLevelProvisioningManagerSnapshotLayoutSpec;
    }


    /**
     * Gets the hostLowLevelProvisioningManagerSnapshotLayoutSpec value for this ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @return hostLowLevelProvisioningManagerSnapshotLayoutSpec
     */
    public com.vmware.converter.HostLowLevelProvisioningManagerSnapshotLayoutSpec[] getHostLowLevelProvisioningManagerSnapshotLayoutSpec() {
        return hostLowLevelProvisioningManagerSnapshotLayoutSpec;
    }


    /**
     * Sets the hostLowLevelProvisioningManagerSnapshotLayoutSpec value for this ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec.
     * 
     * @param hostLowLevelProvisioningManagerSnapshotLayoutSpec
     */
    public void setHostLowLevelProvisioningManagerSnapshotLayoutSpec(com.vmware.converter.HostLowLevelProvisioningManagerSnapshotLayoutSpec[] hostLowLevelProvisioningManagerSnapshotLayoutSpec) {
        this.hostLowLevelProvisioningManagerSnapshotLayoutSpec = hostLowLevelProvisioningManagerSnapshotLayoutSpec;
    }

    public com.vmware.converter.HostLowLevelProvisioningManagerSnapshotLayoutSpec getHostLowLevelProvisioningManagerSnapshotLayoutSpec(int i) {
        return this.hostLowLevelProvisioningManagerSnapshotLayoutSpec[i];
    }

    public void setHostLowLevelProvisioningManagerSnapshotLayoutSpec(int i, com.vmware.converter.HostLowLevelProvisioningManagerSnapshotLayoutSpec _value) {
        this.hostLowLevelProvisioningManagerSnapshotLayoutSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec)) return false;
        ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec other = (ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostLowLevelProvisioningManagerSnapshotLayoutSpec==null && other.getHostLowLevelProvisioningManagerSnapshotLayoutSpec()==null) || 
             (this.hostLowLevelProvisioningManagerSnapshotLayoutSpec!=null &&
              java.util.Arrays.equals(this.hostLowLevelProvisioningManagerSnapshotLayoutSpec, other.getHostLowLevelProvisioningManagerSnapshotLayoutSpec())));
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
        if (getHostLowLevelProvisioningManagerSnapshotLayoutSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostLowLevelProvisioningManagerSnapshotLayoutSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostLowLevelProvisioningManagerSnapshotLayoutSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostLowLevelProvisioningManagerSnapshotLayoutSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerSnapshotLayoutSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLowLevelProvisioningManagerSnapshotLayoutSpec"));
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
