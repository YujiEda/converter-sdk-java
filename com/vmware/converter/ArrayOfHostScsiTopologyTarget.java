/**
 * ArrayOfHostScsiTopologyTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostScsiTopologyTarget  implements java.io.Serializable {
    private com.vmware.converter.HostScsiTopologyTarget[] hostScsiTopologyTarget;

    public ArrayOfHostScsiTopologyTarget() {
    }

    public ArrayOfHostScsiTopologyTarget(
           com.vmware.converter.HostScsiTopologyTarget[] hostScsiTopologyTarget) {
           this.hostScsiTopologyTarget = hostScsiTopologyTarget;
    }


    /**
     * Gets the hostScsiTopologyTarget value for this ArrayOfHostScsiTopologyTarget.
     * 
     * @return hostScsiTopologyTarget
     */
    public com.vmware.converter.HostScsiTopologyTarget[] getHostScsiTopologyTarget() {
        return hostScsiTopologyTarget;
    }


    /**
     * Sets the hostScsiTopologyTarget value for this ArrayOfHostScsiTopologyTarget.
     * 
     * @param hostScsiTopologyTarget
     */
    public void setHostScsiTopologyTarget(com.vmware.converter.HostScsiTopologyTarget[] hostScsiTopologyTarget) {
        this.hostScsiTopologyTarget = hostScsiTopologyTarget;
    }

    public com.vmware.converter.HostScsiTopologyTarget getHostScsiTopologyTarget(int i) {
        return this.hostScsiTopologyTarget[i];
    }

    public void setHostScsiTopologyTarget(int i, com.vmware.converter.HostScsiTopologyTarget _value) {
        this.hostScsiTopologyTarget[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostScsiTopologyTarget)) return false;
        ArrayOfHostScsiTopologyTarget other = (ArrayOfHostScsiTopologyTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostScsiTopologyTarget==null && other.getHostScsiTopologyTarget()==null) || 
             (this.hostScsiTopologyTarget!=null &&
              java.util.Arrays.equals(this.hostScsiTopologyTarget, other.getHostScsiTopologyTarget())));
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
        if (getHostScsiTopologyTarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostScsiTopologyTarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostScsiTopologyTarget(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostScsiTopologyTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostScsiTopologyTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostScsiTopologyTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostScsiTopologyTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiTopologyTarget"));
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
