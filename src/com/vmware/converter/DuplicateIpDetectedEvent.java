/**
 * DuplicateIpDetectedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DuplicateIpDetectedEvent  extends com.vmware.converter.HostEvent  implements java.io.Serializable {
    private java.lang.String duplicateIP;

    private java.lang.String macAddress;

    public DuplicateIpDetectedEvent() {
    }

    public DuplicateIpDetectedEvent(
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.converter.DatacenterEventArgument datacenter,
           com.vmware.converter.ComputeResourceEventArgument computeResource,
           com.vmware.converter.HostEventArgument host,
           com.vmware.converter.VmEventArgument vm,
           com.vmware.converter.DatastoreEventArgument ds,
           com.vmware.converter.NetworkEventArgument net,
           com.vmware.converter.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           java.lang.String duplicateIP,
           java.lang.String macAddress) {
        super(
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag);
        this.duplicateIP = duplicateIP;
        this.macAddress = macAddress;
    }


    /**
     * Gets the duplicateIP value for this DuplicateIpDetectedEvent.
     * 
     * @return duplicateIP
     */
    public java.lang.String getDuplicateIP() {
        return duplicateIP;
    }


    /**
     * Sets the duplicateIP value for this DuplicateIpDetectedEvent.
     * 
     * @param duplicateIP
     */
    public void setDuplicateIP(java.lang.String duplicateIP) {
        this.duplicateIP = duplicateIP;
    }


    /**
     * Gets the macAddress value for this DuplicateIpDetectedEvent.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this DuplicateIpDetectedEvent.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DuplicateIpDetectedEvent)) return false;
        DuplicateIpDetectedEvent other = (DuplicateIpDetectedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.duplicateIP==null && other.getDuplicateIP()==null) || 
             (this.duplicateIP!=null &&
              this.duplicateIP.equals(other.getDuplicateIP()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress())));
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
        if (getDuplicateIP() != null) {
            _hashCode += getDuplicateIP().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DuplicateIpDetectedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DuplicateIpDetectedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "duplicateIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "macAddress"));
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
