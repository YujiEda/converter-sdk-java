/**
 * VirtualDiskAntiAffinityRuleSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualDiskAntiAffinityRuleSpec  extends com.vmware.converter.ClusterRuleInfo  implements java.io.Serializable {
    private int[] diskId;

    public VirtualDiskAntiAffinityRuleSpec() {
    }

    public VirtualDiskAntiAffinityRuleSpec(
           java.lang.Integer key,
           com.vmware.converter.ManagedEntityStatus status,
           java.lang.Boolean enabled,
           java.lang.String name,
           java.lang.Boolean mandatory,
           java.lang.Boolean userCreated,
           java.lang.Boolean inCompliance,
           java.lang.String ruleUuid,
           int[] diskId) {
        super(
            key,
            status,
            enabled,
            name,
            mandatory,
            userCreated,
            inCompliance,
            ruleUuid);
        this.diskId = diskId;
    }


    /**
     * Gets the diskId value for this VirtualDiskAntiAffinityRuleSpec.
     * 
     * @return diskId
     */
    public int[] getDiskId() {
        return diskId;
    }


    /**
     * Sets the diskId value for this VirtualDiskAntiAffinityRuleSpec.
     * 
     * @param diskId
     */
    public void setDiskId(int[] diskId) {
        this.diskId = diskId;
    }

    public int getDiskId(int i) {
        return this.diskId[i];
    }

    public void setDiskId(int i, int _value) {
        this.diskId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskAntiAffinityRuleSpec)) return false;
        VirtualDiskAntiAffinityRuleSpec other = (VirtualDiskAntiAffinityRuleSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskId==null && other.getDiskId()==null) || 
             (this.diskId!=null &&
              java.util.Arrays.equals(this.diskId, other.getDiskId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDiskId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskId(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualDiskAntiAffinityRuleSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskAntiAffinityRuleSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
