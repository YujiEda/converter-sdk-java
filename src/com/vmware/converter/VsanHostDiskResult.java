/**
 * VsanHostDiskResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostDiskResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostScsiDisk disk;

    private java.lang.String state;

    private java.lang.String vsanUuid;

    private com.vmware.converter.LocalizedMethodFault error;

    private java.lang.Boolean degraded;

    public VsanHostDiskResult() {
    }

    public VsanHostDiskResult(
           com.vmware.converter.HostScsiDisk disk,
           java.lang.String state,
           java.lang.String vsanUuid,
           com.vmware.converter.LocalizedMethodFault error,
           java.lang.Boolean degraded) {
        this.disk = disk;
        this.state = state;
        this.vsanUuid = vsanUuid;
        this.error = error;
        this.degraded = degraded;
    }


    /**
     * Gets the disk value for this VsanHostDiskResult.
     * 
     * @return disk
     */
    public com.vmware.converter.HostScsiDisk getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this VsanHostDiskResult.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.HostScsiDisk disk) {
        this.disk = disk;
    }


    /**
     * Gets the state value for this VsanHostDiskResult.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this VsanHostDiskResult.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the vsanUuid value for this VsanHostDiskResult.
     * 
     * @return vsanUuid
     */
    public java.lang.String getVsanUuid() {
        return vsanUuid;
    }


    /**
     * Sets the vsanUuid value for this VsanHostDiskResult.
     * 
     * @param vsanUuid
     */
    public void setVsanUuid(java.lang.String vsanUuid) {
        this.vsanUuid = vsanUuid;
    }


    /**
     * Gets the error value for this VsanHostDiskResult.
     * 
     * @return error
     */
    public com.vmware.converter.LocalizedMethodFault getError() {
        return error;
    }


    /**
     * Sets the error value for this VsanHostDiskResult.
     * 
     * @param error
     */
    public void setError(com.vmware.converter.LocalizedMethodFault error) {
        this.error = error;
    }


    /**
     * Gets the degraded value for this VsanHostDiskResult.
     * 
     * @return degraded
     */
    public java.lang.Boolean getDegraded() {
        return degraded;
    }


    /**
     * Sets the degraded value for this VsanHostDiskResult.
     * 
     * @param degraded
     */
    public void setDegraded(java.lang.Boolean degraded) {
        this.degraded = degraded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostDiskResult)) return false;
        VsanHostDiskResult other = (VsanHostDiskResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              this.disk.equals(other.getDisk()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.vsanUuid==null && other.getVsanUuid()==null) || 
             (this.vsanUuid!=null &&
              this.vsanUuid.equals(other.getVsanUuid()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.degraded==null && other.getDegraded()==null) || 
             (this.degraded!=null &&
              this.degraded.equals(other.getDegraded())));
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
        if (getDisk() != null) {
            _hashCode += getDisk().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getVsanUuid() != null) {
            _hashCode += getVsanUuid().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getDegraded() != null) {
            _hashCode += getDegraded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostDiskResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDisk"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("degraded");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "degraded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
