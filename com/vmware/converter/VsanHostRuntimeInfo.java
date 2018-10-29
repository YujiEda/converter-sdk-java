/**
 * VsanHostRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VsanHostMembershipInfo[] membershipList;

    private com.vmware.converter.VsanHostRuntimeInfoDiskIssue[] diskIssues;

    private java.lang.Integer accessGenNo;

    public VsanHostRuntimeInfo() {
    }

    public VsanHostRuntimeInfo(
           com.vmware.converter.VsanHostMembershipInfo[] membershipList,
           com.vmware.converter.VsanHostRuntimeInfoDiskIssue[] diskIssues,
           java.lang.Integer accessGenNo) {
        this.membershipList = membershipList;
        this.diskIssues = diskIssues;
        this.accessGenNo = accessGenNo;
    }


    /**
     * Gets the membershipList value for this VsanHostRuntimeInfo.
     * 
     * @return membershipList
     */
    public com.vmware.converter.VsanHostMembershipInfo[] getMembershipList() {
        return membershipList;
    }


    /**
     * Sets the membershipList value for this VsanHostRuntimeInfo.
     * 
     * @param membershipList
     */
    public void setMembershipList(com.vmware.converter.VsanHostMembershipInfo[] membershipList) {
        this.membershipList = membershipList;
    }

    public com.vmware.converter.VsanHostMembershipInfo getMembershipList(int i) {
        return this.membershipList[i];
    }

    public void setMembershipList(int i, com.vmware.converter.VsanHostMembershipInfo _value) {
        this.membershipList[i] = _value;
    }


    /**
     * Gets the diskIssues value for this VsanHostRuntimeInfo.
     * 
     * @return diskIssues
     */
    public com.vmware.converter.VsanHostRuntimeInfoDiskIssue[] getDiskIssues() {
        return diskIssues;
    }


    /**
     * Sets the diskIssues value for this VsanHostRuntimeInfo.
     * 
     * @param diskIssues
     */
    public void setDiskIssues(com.vmware.converter.VsanHostRuntimeInfoDiskIssue[] diskIssues) {
        this.diskIssues = diskIssues;
    }

    public com.vmware.converter.VsanHostRuntimeInfoDiskIssue getDiskIssues(int i) {
        return this.diskIssues[i];
    }

    public void setDiskIssues(int i, com.vmware.converter.VsanHostRuntimeInfoDiskIssue _value) {
        this.diskIssues[i] = _value;
    }


    /**
     * Gets the accessGenNo value for this VsanHostRuntimeInfo.
     * 
     * @return accessGenNo
     */
    public java.lang.Integer getAccessGenNo() {
        return accessGenNo;
    }


    /**
     * Sets the accessGenNo value for this VsanHostRuntimeInfo.
     * 
     * @param accessGenNo
     */
    public void setAccessGenNo(java.lang.Integer accessGenNo) {
        this.accessGenNo = accessGenNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostRuntimeInfo)) return false;
        VsanHostRuntimeInfo other = (VsanHostRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.membershipList==null && other.getMembershipList()==null) || 
             (this.membershipList!=null &&
              java.util.Arrays.equals(this.membershipList, other.getMembershipList()))) &&
            ((this.diskIssues==null && other.getDiskIssues()==null) || 
             (this.diskIssues!=null &&
              java.util.Arrays.equals(this.diskIssues, other.getDiskIssues()))) &&
            ((this.accessGenNo==null && other.getAccessGenNo()==null) || 
             (this.accessGenNo!=null &&
              this.accessGenNo.equals(other.getAccessGenNo())));
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
        if (getMembershipList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembershipList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembershipList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiskIssues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskIssues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskIssues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessGenNo() != null) {
            _hashCode += getAccessGenNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanHostRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membershipList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "membershipList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostMembershipInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostRuntimeInfoDiskIssue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessGenNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accessGenNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
