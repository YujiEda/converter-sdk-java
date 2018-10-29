/**
 * PodDiskLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PodDiskLocator  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int diskId;

    private java.lang.String diskMoveType;

    private com.vmware.converter.VirtualDeviceBackingInfo diskBackingInfo;

    private com.vmware.converter.VirtualMachineProfileSpec[] profile;

    public PodDiskLocator() {
    }

    public PodDiskLocator(
           int diskId,
           java.lang.String diskMoveType,
           com.vmware.converter.VirtualDeviceBackingInfo diskBackingInfo,
           com.vmware.converter.VirtualMachineProfileSpec[] profile) {
        this.diskId = diskId;
        this.diskMoveType = diskMoveType;
        this.diskBackingInfo = diskBackingInfo;
        this.profile = profile;
    }


    /**
     * Gets the diskId value for this PodDiskLocator.
     * 
     * @return diskId
     */
    public int getDiskId() {
        return diskId;
    }


    /**
     * Sets the diskId value for this PodDiskLocator.
     * 
     * @param diskId
     */
    public void setDiskId(int diskId) {
        this.diskId = diskId;
    }


    /**
     * Gets the diskMoveType value for this PodDiskLocator.
     * 
     * @return diskMoveType
     */
    public java.lang.String getDiskMoveType() {
        return diskMoveType;
    }


    /**
     * Sets the diskMoveType value for this PodDiskLocator.
     * 
     * @param diskMoveType
     */
    public void setDiskMoveType(java.lang.String diskMoveType) {
        this.diskMoveType = diskMoveType;
    }


    /**
     * Gets the diskBackingInfo value for this PodDiskLocator.
     * 
     * @return diskBackingInfo
     */
    public com.vmware.converter.VirtualDeviceBackingInfo getDiskBackingInfo() {
        return diskBackingInfo;
    }


    /**
     * Sets the diskBackingInfo value for this PodDiskLocator.
     * 
     * @param diskBackingInfo
     */
    public void setDiskBackingInfo(com.vmware.converter.VirtualDeviceBackingInfo diskBackingInfo) {
        this.diskBackingInfo = diskBackingInfo;
    }


    /**
     * Gets the profile value for this PodDiskLocator.
     * 
     * @return profile
     */
    public com.vmware.converter.VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this PodDiskLocator.
     * 
     * @param profile
     */
    public void setProfile(com.vmware.converter.VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public com.vmware.converter.VirtualMachineProfileSpec getProfile(int i) {
        return this.profile[i];
    }

    public void setProfile(int i, com.vmware.converter.VirtualMachineProfileSpec _value) {
        this.profile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PodDiskLocator)) return false;
        PodDiskLocator other = (PodDiskLocator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.diskId == other.getDiskId() &&
            ((this.diskMoveType==null && other.getDiskMoveType()==null) || 
             (this.diskMoveType!=null &&
              this.diskMoveType.equals(other.getDiskMoveType()))) &&
            ((this.diskBackingInfo==null && other.getDiskBackingInfo()==null) || 
             (this.diskBackingInfo!=null &&
              this.diskBackingInfo.equals(other.getDiskBackingInfo()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              java.util.Arrays.equals(this.profile, other.getProfile())));
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
        _hashCode += getDiskId();
        if (getDiskMoveType() != null) {
            _hashCode += getDiskMoveType().hashCode();
        }
        if (getDiskBackingInfo() != null) {
            _hashCode += getDiskBackingInfo().hashCode();
        }
        if (getProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfile(), i);
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
        new org.apache.axis.description.TypeDesc(PodDiskLocator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PodDiskLocator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMoveType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMoveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskBackingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskBackingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceBackingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineProfileSpec"));
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
