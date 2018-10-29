/**
 * ClusterComputeResourceSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterComputeResourceSummary  extends com.vmware.converter.ComputeResourceSummary  implements java.io.Serializable {
    private int currentFailoverLevel;

    private com.vmware.converter.ClusterDasAdmissionControlInfo admissionControlInfo;

    private int numVmotions;

    private java.lang.Integer targetBalance;

    private java.lang.Integer currentBalance;

    private com.vmware.converter.ClusterUsageSummary usageSummary;

    private java.lang.String currentEVCModeKey;

    private com.vmware.converter.ClusterDasData dasData;

    public ClusterComputeResourceSummary() {
    }

    public ClusterComputeResourceSummary(
           int totalCpu,
           long totalMemory,
           short numCpuCores,
           short numCpuThreads,
           int effectiveCpu,
           long effectiveMemory,
           int numHosts,
           int numEffectiveHosts,
           com.vmware.converter.ManagedEntityStatus overallStatus,
           int currentFailoverLevel,
           com.vmware.converter.ClusterDasAdmissionControlInfo admissionControlInfo,
           int numVmotions,
           java.lang.Integer targetBalance,
           java.lang.Integer currentBalance,
           com.vmware.converter.ClusterUsageSummary usageSummary,
           java.lang.String currentEVCModeKey,
           com.vmware.converter.ClusterDasData dasData) {
        super(
            totalCpu,
            totalMemory,
            numCpuCores,
            numCpuThreads,
            effectiveCpu,
            effectiveMemory,
            numHosts,
            numEffectiveHosts,
            overallStatus);
        this.currentFailoverLevel = currentFailoverLevel;
        this.admissionControlInfo = admissionControlInfo;
        this.numVmotions = numVmotions;
        this.targetBalance = targetBalance;
        this.currentBalance = currentBalance;
        this.usageSummary = usageSummary;
        this.currentEVCModeKey = currentEVCModeKey;
        this.dasData = dasData;
    }


    /**
     * Gets the currentFailoverLevel value for this ClusterComputeResourceSummary.
     * 
     * @return currentFailoverLevel
     */
    public int getCurrentFailoverLevel() {
        return currentFailoverLevel;
    }


    /**
     * Sets the currentFailoverLevel value for this ClusterComputeResourceSummary.
     * 
     * @param currentFailoverLevel
     */
    public void setCurrentFailoverLevel(int currentFailoverLevel) {
        this.currentFailoverLevel = currentFailoverLevel;
    }


    /**
     * Gets the admissionControlInfo value for this ClusterComputeResourceSummary.
     * 
     * @return admissionControlInfo
     */
    public com.vmware.converter.ClusterDasAdmissionControlInfo getAdmissionControlInfo() {
        return admissionControlInfo;
    }


    /**
     * Sets the admissionControlInfo value for this ClusterComputeResourceSummary.
     * 
     * @param admissionControlInfo
     */
    public void setAdmissionControlInfo(com.vmware.converter.ClusterDasAdmissionControlInfo admissionControlInfo) {
        this.admissionControlInfo = admissionControlInfo;
    }


    /**
     * Gets the numVmotions value for this ClusterComputeResourceSummary.
     * 
     * @return numVmotions
     */
    public int getNumVmotions() {
        return numVmotions;
    }


    /**
     * Sets the numVmotions value for this ClusterComputeResourceSummary.
     * 
     * @param numVmotions
     */
    public void setNumVmotions(int numVmotions) {
        this.numVmotions = numVmotions;
    }


    /**
     * Gets the targetBalance value for this ClusterComputeResourceSummary.
     * 
     * @return targetBalance
     */
    public java.lang.Integer getTargetBalance() {
        return targetBalance;
    }


    /**
     * Sets the targetBalance value for this ClusterComputeResourceSummary.
     * 
     * @param targetBalance
     */
    public void setTargetBalance(java.lang.Integer targetBalance) {
        this.targetBalance = targetBalance;
    }


    /**
     * Gets the currentBalance value for this ClusterComputeResourceSummary.
     * 
     * @return currentBalance
     */
    public java.lang.Integer getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this ClusterComputeResourceSummary.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.lang.Integer currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the usageSummary value for this ClusterComputeResourceSummary.
     * 
     * @return usageSummary
     */
    public com.vmware.converter.ClusterUsageSummary getUsageSummary() {
        return usageSummary;
    }


    /**
     * Sets the usageSummary value for this ClusterComputeResourceSummary.
     * 
     * @param usageSummary
     */
    public void setUsageSummary(com.vmware.converter.ClusterUsageSummary usageSummary) {
        this.usageSummary = usageSummary;
    }


    /**
     * Gets the currentEVCModeKey value for this ClusterComputeResourceSummary.
     * 
     * @return currentEVCModeKey
     */
    public java.lang.String getCurrentEVCModeKey() {
        return currentEVCModeKey;
    }


    /**
     * Sets the currentEVCModeKey value for this ClusterComputeResourceSummary.
     * 
     * @param currentEVCModeKey
     */
    public void setCurrentEVCModeKey(java.lang.String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }


    /**
     * Gets the dasData value for this ClusterComputeResourceSummary.
     * 
     * @return dasData
     */
    public com.vmware.converter.ClusterDasData getDasData() {
        return dasData;
    }


    /**
     * Sets the dasData value for this ClusterComputeResourceSummary.
     * 
     * @param dasData
     */
    public void setDasData(com.vmware.converter.ClusterDasData dasData) {
        this.dasData = dasData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterComputeResourceSummary)) return false;
        ClusterComputeResourceSummary other = (ClusterComputeResourceSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.currentFailoverLevel == other.getCurrentFailoverLevel() &&
            ((this.admissionControlInfo==null && other.getAdmissionControlInfo()==null) || 
             (this.admissionControlInfo!=null &&
              this.admissionControlInfo.equals(other.getAdmissionControlInfo()))) &&
            this.numVmotions == other.getNumVmotions() &&
            ((this.targetBalance==null && other.getTargetBalance()==null) || 
             (this.targetBalance!=null &&
              this.targetBalance.equals(other.getTargetBalance()))) &&
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.usageSummary==null && other.getUsageSummary()==null) || 
             (this.usageSummary!=null &&
              this.usageSummary.equals(other.getUsageSummary()))) &&
            ((this.currentEVCModeKey==null && other.getCurrentEVCModeKey()==null) || 
             (this.currentEVCModeKey!=null &&
              this.currentEVCModeKey.equals(other.getCurrentEVCModeKey()))) &&
            ((this.dasData==null && other.getDasData()==null) || 
             (this.dasData!=null &&
              this.dasData.equals(other.getDasData())));
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
        _hashCode += getCurrentFailoverLevel();
        if (getAdmissionControlInfo() != null) {
            _hashCode += getAdmissionControlInfo().hashCode();
        }
        _hashCode += getNumVmotions();
        if (getTargetBalance() != null) {
            _hashCode += getTargetBalance().hashCode();
        }
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getUsageSummary() != null) {
            _hashCode += getUsageSummary().hashCode();
        }
        if (getCurrentEVCModeKey() != null) {
            _hashCode += getCurrentEVCModeKey().hashCode();
        }
        if (getDasData() != null) {
            _hashCode += getDasData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterComputeResourceSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterComputeResourceSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentFailoverLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentFailoverLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admissionControlInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "admissionControlInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAdmissionControlInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVmotions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVmotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "targetBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usageSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterUsageSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentEVCModeKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentEVCModeKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasData"));
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
