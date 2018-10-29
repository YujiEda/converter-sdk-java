/**
 * VmDasBeingResetWithScreenshotEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmDasBeingResetWithScreenshotEvent  extends com.vmware.converter.VmDasBeingResetEvent  implements java.io.Serializable {
    private java.lang.String screenshotFilePath;

    public VmDasBeingResetWithScreenshotEvent() {
    }

    public VmDasBeingResetWithScreenshotEvent(
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
           boolean template,
           java.lang.String reason,
           java.lang.String screenshotFilePath) {
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
            changeTag,
            template,
            reason);
        this.screenshotFilePath = screenshotFilePath;
    }


    /**
     * Gets the screenshotFilePath value for this VmDasBeingResetWithScreenshotEvent.
     * 
     * @return screenshotFilePath
     */
    public java.lang.String getScreenshotFilePath() {
        return screenshotFilePath;
    }


    /**
     * Sets the screenshotFilePath value for this VmDasBeingResetWithScreenshotEvent.
     * 
     * @param screenshotFilePath
     */
    public void setScreenshotFilePath(java.lang.String screenshotFilePath) {
        this.screenshotFilePath = screenshotFilePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmDasBeingResetWithScreenshotEvent)) return false;
        VmDasBeingResetWithScreenshotEvent other = (VmDasBeingResetWithScreenshotEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.screenshotFilePath==null && other.getScreenshotFilePath()==null) || 
             (this.screenshotFilePath!=null &&
              this.screenshotFilePath.equals(other.getScreenshotFilePath())));
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
        if (getScreenshotFilePath() != null) {
            _hashCode += getScreenshotFilePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmDasBeingResetWithScreenshotEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmDasBeingResetWithScreenshotEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenshotFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "screenshotFilePath"));
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
