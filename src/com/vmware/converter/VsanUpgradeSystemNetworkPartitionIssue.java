/**
 * VsanUpgradeSystemNetworkPartitionIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemNetworkPartitionIssue  extends com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue  implements java.io.Serializable {
    private com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo[] partitions;

    public VsanUpgradeSystemNetworkPartitionIssue() {
    }

    public VsanUpgradeSystemNetworkPartitionIssue(
           java.lang.String msg,
           com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo[] partitions) {
        super(
            msg);
        this.partitions = partitions;
    }


    /**
     * Gets the partitions value for this VsanUpgradeSystemNetworkPartitionIssue.
     * 
     * @return partitions
     */
    public com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo[] getPartitions() {
        return partitions;
    }


    /**
     * Sets the partitions value for this VsanUpgradeSystemNetworkPartitionIssue.
     * 
     * @param partitions
     */
    public void setPartitions(com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo[] partitions) {
        this.partitions = partitions;
    }

    public com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo getPartitions(int i) {
        return this.partitions[i];
    }

    public void setPartitions(int i, com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo _value) {
        this.partitions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemNetworkPartitionIssue)) return false;
        VsanUpgradeSystemNetworkPartitionIssue other = (VsanUpgradeSystemNetworkPartitionIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partitions==null && other.getPartitions()==null) || 
             (this.partitions!=null &&
              java.util.Arrays.equals(this.partitions, other.getPartitions())));
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
        if (getPartitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitions(), i);
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
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemNetworkPartitionIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemNetworkPartitionIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "partitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemNetworkPartitionInfo"));
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
