/**
 * VsanClusterUuidMismatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanClusterUuidMismatch  extends com.vmware.converter.CannotMoveVsanEnabledHost  implements java.io.Serializable {
    private java.lang.String hostClusterUuid;

    private java.lang.String destinationClusterUuid;

    public VsanClusterUuidMismatch() {
    }

    public VsanClusterUuidMismatch(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String hostClusterUuid,
           java.lang.String destinationClusterUuid) {
        super(
            faultCause,
            faultMessage);
        this.hostClusterUuid = hostClusterUuid;
        this.destinationClusterUuid = destinationClusterUuid;
    }


    /**
     * Gets the hostClusterUuid value for this VsanClusterUuidMismatch.
     * 
     * @return hostClusterUuid
     */
    public java.lang.String getHostClusterUuid() {
        return hostClusterUuid;
    }


    /**
     * Sets the hostClusterUuid value for this VsanClusterUuidMismatch.
     * 
     * @param hostClusterUuid
     */
    public void setHostClusterUuid(java.lang.String hostClusterUuid) {
        this.hostClusterUuid = hostClusterUuid;
    }


    /**
     * Gets the destinationClusterUuid value for this VsanClusterUuidMismatch.
     * 
     * @return destinationClusterUuid
     */
    public java.lang.String getDestinationClusterUuid() {
        return destinationClusterUuid;
    }


    /**
     * Sets the destinationClusterUuid value for this VsanClusterUuidMismatch.
     * 
     * @param destinationClusterUuid
     */
    public void setDestinationClusterUuid(java.lang.String destinationClusterUuid) {
        this.destinationClusterUuid = destinationClusterUuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanClusterUuidMismatch)) return false;
        VsanClusterUuidMismatch other = (VsanClusterUuidMismatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostClusterUuid==null && other.getHostClusterUuid()==null) || 
             (this.hostClusterUuid!=null &&
              this.hostClusterUuid.equals(other.getHostClusterUuid()))) &&
            ((this.destinationClusterUuid==null && other.getDestinationClusterUuid()==null) || 
             (this.destinationClusterUuid!=null &&
              this.destinationClusterUuid.equals(other.getDestinationClusterUuid())));
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
        if (getHostClusterUuid() != null) {
            _hashCode += getHostClusterUuid().hashCode();
        }
        if (getDestinationClusterUuid() != null) {
            _hashCode += getDestinationClusterUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanClusterUuidMismatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanClusterUuidMismatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostClusterUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostClusterUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationClusterUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destinationClusterUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
