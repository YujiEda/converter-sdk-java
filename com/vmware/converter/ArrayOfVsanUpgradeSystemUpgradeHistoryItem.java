/**
 * ArrayOfVsanUpgradeSystemUpgradeHistoryItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVsanUpgradeSystemUpgradeHistoryItem  implements java.io.Serializable {
    private com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem[] vsanUpgradeSystemUpgradeHistoryItem;

    public ArrayOfVsanUpgradeSystemUpgradeHistoryItem() {
    }

    public ArrayOfVsanUpgradeSystemUpgradeHistoryItem(
           com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem[] vsanUpgradeSystemUpgradeHistoryItem) {
           this.vsanUpgradeSystemUpgradeHistoryItem = vsanUpgradeSystemUpgradeHistoryItem;
    }


    /**
     * Gets the vsanUpgradeSystemUpgradeHistoryItem value for this ArrayOfVsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @return vsanUpgradeSystemUpgradeHistoryItem
     */
    public com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem[] getVsanUpgradeSystemUpgradeHistoryItem() {
        return vsanUpgradeSystemUpgradeHistoryItem;
    }


    /**
     * Sets the vsanUpgradeSystemUpgradeHistoryItem value for this ArrayOfVsanUpgradeSystemUpgradeHistoryItem.
     * 
     * @param vsanUpgradeSystemUpgradeHistoryItem
     */
    public void setVsanUpgradeSystemUpgradeHistoryItem(com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem[] vsanUpgradeSystemUpgradeHistoryItem) {
        this.vsanUpgradeSystemUpgradeHistoryItem = vsanUpgradeSystemUpgradeHistoryItem;
    }

    public com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem getVsanUpgradeSystemUpgradeHistoryItem(int i) {
        return this.vsanUpgradeSystemUpgradeHistoryItem[i];
    }

    public void setVsanUpgradeSystemUpgradeHistoryItem(int i, com.vmware.converter.VsanUpgradeSystemUpgradeHistoryItem _value) {
        this.vsanUpgradeSystemUpgradeHistoryItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVsanUpgradeSystemUpgradeHistoryItem)) return false;
        ArrayOfVsanUpgradeSystemUpgradeHistoryItem other = (ArrayOfVsanUpgradeSystemUpgradeHistoryItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vsanUpgradeSystemUpgradeHistoryItem==null && other.getVsanUpgradeSystemUpgradeHistoryItem()==null) || 
             (this.vsanUpgradeSystemUpgradeHistoryItem!=null &&
              java.util.Arrays.equals(this.vsanUpgradeSystemUpgradeHistoryItem, other.getVsanUpgradeSystemUpgradeHistoryItem())));
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
        if (getVsanUpgradeSystemUpgradeHistoryItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsanUpgradeSystemUpgradeHistoryItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsanUpgradeSystemUpgradeHistoryItem(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVsanUpgradeSystemUpgradeHistoryItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVsanUpgradeSystemUpgradeHistoryItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanUpgradeSystemUpgradeHistoryItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemUpgradeHistoryItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemUpgradeHistoryItem"));
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
