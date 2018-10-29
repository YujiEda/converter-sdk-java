/**
 * FaultToleranceSecondaryConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FaultToleranceSecondaryConfigInfo  extends com.vmware.converter.FaultToleranceConfigInfo  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference primaryVM;

    public FaultToleranceSecondaryConfigInfo() {
    }

    public FaultToleranceSecondaryConfigInfo(
           int role,
           java.lang.String[] instanceUuids,
           java.lang.String[] configPaths,
           java.lang.Boolean orphaned,
           com.vmware.converter.ManagedObjectReference primaryVM) {
        super(
            role,
            instanceUuids,
            configPaths,
            orphaned);
        this.primaryVM = primaryVM;
    }


    /**
     * Gets the primaryVM value for this FaultToleranceSecondaryConfigInfo.
     * 
     * @return primaryVM
     */
    public com.vmware.converter.ManagedObjectReference getPrimaryVM() {
        return primaryVM;
    }


    /**
     * Sets the primaryVM value for this FaultToleranceSecondaryConfigInfo.
     * 
     * @param primaryVM
     */
    public void setPrimaryVM(com.vmware.converter.ManagedObjectReference primaryVM) {
        this.primaryVM = primaryVM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultToleranceSecondaryConfigInfo)) return false;
        FaultToleranceSecondaryConfigInfo other = (FaultToleranceSecondaryConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.primaryVM==null && other.getPrimaryVM()==null) || 
             (this.primaryVM!=null &&
              this.primaryVM.equals(other.getPrimaryVM())));
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
        if (getPrimaryVM() != null) {
            _hashCode += getPrimaryVM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultToleranceSecondaryConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceSecondaryConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryVM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "primaryVM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
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
