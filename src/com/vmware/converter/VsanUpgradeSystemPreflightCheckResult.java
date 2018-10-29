/**
 * VsanUpgradeSystemPreflightCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanUpgradeSystemPreflightCheckResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue[] issues;

    private com.vmware.converter.VsanHostDiskMapping diskMappingToRestore;

    public VsanUpgradeSystemPreflightCheckResult() {
    }

    public VsanUpgradeSystemPreflightCheckResult(
           com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue[] issues,
           com.vmware.converter.VsanHostDiskMapping diskMappingToRestore) {
        this.issues = issues;
        this.diskMappingToRestore = diskMappingToRestore;
    }


    /**
     * Gets the issues value for this VsanUpgradeSystemPreflightCheckResult.
     * 
     * @return issues
     */
    public com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue[] getIssues() {
        return issues;
    }


    /**
     * Sets the issues value for this VsanUpgradeSystemPreflightCheckResult.
     * 
     * @param issues
     */
    public void setIssues(com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue[] issues) {
        this.issues = issues;
    }

    public com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue getIssues(int i) {
        return this.issues[i];
    }

    public void setIssues(int i, com.vmware.converter.VsanUpgradeSystemPreflightCheckIssue _value) {
        this.issues[i] = _value;
    }


    /**
     * Gets the diskMappingToRestore value for this VsanUpgradeSystemPreflightCheckResult.
     * 
     * @return diskMappingToRestore
     */
    public com.vmware.converter.VsanHostDiskMapping getDiskMappingToRestore() {
        return diskMappingToRestore;
    }


    /**
     * Sets the diskMappingToRestore value for this VsanUpgradeSystemPreflightCheckResult.
     * 
     * @param diskMappingToRestore
     */
    public void setDiskMappingToRestore(com.vmware.converter.VsanHostDiskMapping diskMappingToRestore) {
        this.diskMappingToRestore = diskMappingToRestore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanUpgradeSystemPreflightCheckResult)) return false;
        VsanUpgradeSystemPreflightCheckResult other = (VsanUpgradeSystemPreflightCheckResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.issues==null && other.getIssues()==null) || 
             (this.issues!=null &&
              java.util.Arrays.equals(this.issues, other.getIssues()))) &&
            ((this.diskMappingToRestore==null && other.getDiskMappingToRestore()==null) || 
             (this.diskMappingToRestore!=null &&
              this.diskMappingToRestore.equals(other.getDiskMappingToRestore())));
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
        if (getIssues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiskMappingToRestore() != null) {
            _hashCode += getDiskMappingToRestore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanUpgradeSystemPreflightCheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemPreflightCheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "issues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanUpgradeSystemPreflightCheckIssue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMappingToRestore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMappingToRestore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostDiskMapping"));
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
