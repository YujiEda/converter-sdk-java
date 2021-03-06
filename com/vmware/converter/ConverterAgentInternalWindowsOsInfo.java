/**
 * ConverterAgentInternalWindowsOsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalWindowsOsInfo  extends com.vmware.converter.ConverterAgentInternalExtendedOsInfo  implements java.io.Serializable {
    private int spLevel;

    public ConverterAgentInternalWindowsOsInfo() {
    }

    public ConverterAgentInternalWindowsOsInfo(
           com.vmware.converter.ConverterAgentInternalOsInfoOsFamily family,
           java.lang.String displayName,
           java.lang.String guestOsId,
           java.lang.String vendor,
           java.lang.String edition,
           int majorVersion,
           int minorVersion,
           boolean multiProcessor,
           boolean osIs64Bit,
           java.lang.String osFolder,
           int bootPartition,
           java.lang.String partitionGuid,
           java.lang.String partitionUuid,
           java.lang.Integer bootDiskDeviceNumber,
           java.lang.Integer bootDiskSignature,
           java.lang.String bootDiskGuid,
           java.lang.Boolean vmxnetPresent,
           java.lang.Integer bootPartStartingSector,
           int spLevel) {
        super(
            family,
            displayName,
            guestOsId,
            vendor,
            edition,
            majorVersion,
            minorVersion,
            multiProcessor,
            osIs64Bit,
            osFolder,
            bootPartition,
            partitionGuid,
            partitionUuid,
            bootDiskDeviceNumber,
            bootDiskSignature,
            bootDiskGuid,
            vmxnetPresent,
            bootPartStartingSector);
        this.spLevel = spLevel;
    }


    /**
     * Gets the spLevel value for this ConverterAgentInternalWindowsOsInfo.
     * 
     * @return spLevel
     */
    public int getSpLevel() {
        return spLevel;
    }


    /**
     * Sets the spLevel value for this ConverterAgentInternalWindowsOsInfo.
     * 
     * @param spLevel
     */
    public void setSpLevel(int spLevel) {
        this.spLevel = spLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterAgentInternalWindowsOsInfo)) return false;
        ConverterAgentInternalWindowsOsInfo other = (ConverterAgentInternalWindowsOsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.spLevel == other.getSpLevel();
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
        _hashCode += getSpLevel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalWindowsOsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalWindowsOsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "spLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
