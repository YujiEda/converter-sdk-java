/**
 * ArrayOfVsanUpgradeSystemNetworkPartitionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanUpgradeSystemNetworkPartitionInfo  implements java.io.Serializable {
    private com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo[] vsanUpgradeSystemNetworkPartitionInfo;

    public ArrayOfVsanUpgradeSystemNetworkPartitionInfo() {
    }

    public ArrayOfVsanUpgradeSystemNetworkPartitionInfo(
           com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo[] vsanUpgradeSystemNetworkPartitionInfo) {
           this.vsanUpgradeSystemNetworkPartitionInfo = vsanUpgradeSystemNetworkPartitionInfo;
    }


    /**
     * Gets the vsanUpgradeSystemNetworkPartitionInfo value for this ArrayOfVsanUpgradeSystemNetworkPartitionInfo.
     * 
     * @return vsanUpgradeSystemNetworkPartitionInfo
     */
    public com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo[] getVsanUpgradeSystemNetworkPartitionInfo() {
        return vsanUpgradeSystemNetworkPartitionInfo;
    }


    /**
     * Sets the vsanUpgradeSystemNetworkPartitionInfo value for this ArrayOfVsanUpgradeSystemNetworkPartitionInfo.
     * 
     * @param vsanUpgradeSystemNetworkPartitionInfo
     */
    public void setVsanUpgradeSystemNetworkPartitionInfo(com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo[] vsanUpgradeSystemNetworkPartitionInfo) {
        this.vsanUpgradeSystemNetworkPartitionInfo = vsanUpgradeSystemNetworkPartitionInfo;
    }

    public com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo getVsanUpgradeSystemNetworkPartitionInfo(int i) {
        return this.vsanUpgradeSystemNetworkPartitionInfo[i];
    }

    public void setVsanUpgradeSystemNetworkPartitionInfo(int i, com.vmware.converter.VsanUpgradeSystemNetworkPartitionInfo _value) {
        this.vsanUpgradeSystemNetworkPartitionInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanUpgradeSystemNetworkPartitionInfo)) return false;
        ArrayOfVsanUpgradeSystemNetworkPartitionInfo other = (ArrayOfVsanUpgradeSystemNetworkPartitionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanUpgradeSystemNetworkPartitionInfo==null && other.getVsanUpgradeSystemNetworkPartitionInfo()==null) || 
             (this.vsanUpgradeSystemNetworkPartitionInfo!=null &&
              java.util.Arrays.equals(this.vsanUpgradeSystemNetworkPartitionInfo, other.getVsanUpgradeSystemNetworkPartitionInfo())));
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
        if (getVsanUpgradeSystemNetworkPartitionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanUpgradeSystemNetworkPartitionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanUpgradeSystemNetworkPartitionInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanUpgradeSystemNetworkPartitionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanUpgradeSystemNetworkPartitionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanUpgradeSystemNetworkPartitionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemNetworkPartitionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemNetworkPartitionInfo"));
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
