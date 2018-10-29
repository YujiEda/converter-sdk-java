/**
 * ClusterUsageSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterUsageSummary  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int totalCpuCapacityMhz;

    private int totalMemCapacityMB;

    private int cpuReservationMhz;

    private int memReservationMB;

    private java.lang.Integer poweredOffCpuReservationMhz;

    private java.lang.Integer poweredOffMemReservationMB;

    private int cpuDemandMhz;

    private int memDemandMB;

    private long statsGenNumber;

    private int cpuEntitledMhz;

    private int memEntitledMB;

    private int poweredOffVmCount;

    private int totalVmCount;

    public ClusterUsageSummary() {
    }

    public ClusterUsageSummary(
           int totalCpuCapacityMhz,
           int totalMemCapacityMB,
           int cpuReservationMhz,
           int memReservationMB,
           java.lang.Integer poweredOffCpuReservationMhz,
           java.lang.Integer poweredOffMemReservationMB,
           int cpuDemandMhz,
           int memDemandMB,
           long statsGenNumber,
           int cpuEntitledMhz,
           int memEntitledMB,
           int poweredOffVmCount,
           int totalVmCount) {
        this.totalCpuCapacityMhz = totalCpuCapacityMhz;
        this.totalMemCapacityMB = totalMemCapacityMB;
        this.cpuReservationMhz = cpuReservationMhz;
        this.memReservationMB = memReservationMB;
        this.poweredOffCpuReservationMhz = poweredOffCpuReservationMhz;
        this.poweredOffMemReservationMB = poweredOffMemReservationMB;
        this.cpuDemandMhz = cpuDemandMhz;
        this.memDemandMB = memDemandMB;
        this.statsGenNumber = statsGenNumber;
        this.cpuEntitledMhz = cpuEntitledMhz;
        this.memEntitledMB = memEntitledMB;
        this.poweredOffVmCount = poweredOffVmCount;
        this.totalVmCount = totalVmCount;
    }


    /**
     * Gets the totalCpuCapacityMhz value for this ClusterUsageSummary.
     * 
     * @return totalCpuCapacityMhz
     */
    public int getTotalCpuCapacityMhz() {
        return totalCpuCapacityMhz;
    }


    /**
     * Sets the totalCpuCapacityMhz value for this ClusterUsageSummary.
     * 
     * @param totalCpuCapacityMhz
     */
    public void setTotalCpuCapacityMhz(int totalCpuCapacityMhz) {
        this.totalCpuCapacityMhz = totalCpuCapacityMhz;
    }


    /**
     * Gets the totalMemCapacityMB value for this ClusterUsageSummary.
     * 
     * @return totalMemCapacityMB
     */
    public int getTotalMemCapacityMB() {
        return totalMemCapacityMB;
    }


    /**
     * Sets the totalMemCapacityMB value for this ClusterUsageSummary.
     * 
     * @param totalMemCapacityMB
     */
    public void setTotalMemCapacityMB(int totalMemCapacityMB) {
        this.totalMemCapacityMB = totalMemCapacityMB;
    }


    /**
     * Gets the cpuReservationMhz value for this ClusterUsageSummary.
     * 
     * @return cpuReservationMhz
     */
    public int getCpuReservationMhz() {
        return cpuReservationMhz;
    }


    /**
     * Sets the cpuReservationMhz value for this ClusterUsageSummary.
     * 
     * @param cpuReservationMhz
     */
    public void setCpuReservationMhz(int cpuReservationMhz) {
        this.cpuReservationMhz = cpuReservationMhz;
    }


    /**
     * Gets the memReservationMB value for this ClusterUsageSummary.
     * 
     * @return memReservationMB
     */
    public int getMemReservationMB() {
        return memReservationMB;
    }


    /**
     * Sets the memReservationMB value for this ClusterUsageSummary.
     * 
     * @param memReservationMB
     */
    public void setMemReservationMB(int memReservationMB) {
        this.memReservationMB = memReservationMB;
    }


    /**
     * Gets the poweredOffCpuReservationMhz value for this ClusterUsageSummary.
     * 
     * @return poweredOffCpuReservationMhz
     */
    public java.lang.Integer getPoweredOffCpuReservationMhz() {
        return poweredOffCpuReservationMhz;
    }


    /**
     * Sets the poweredOffCpuReservationMhz value for this ClusterUsageSummary.
     * 
     * @param poweredOffCpuReservationMhz
     */
    public void setPoweredOffCpuReservationMhz(java.lang.Integer poweredOffCpuReservationMhz) {
        this.poweredOffCpuReservationMhz = poweredOffCpuReservationMhz;
    }


    /**
     * Gets the poweredOffMemReservationMB value for this ClusterUsageSummary.
     * 
     * @return poweredOffMemReservationMB
     */
    public java.lang.Integer getPoweredOffMemReservationMB() {
        return poweredOffMemReservationMB;
    }


    /**
     * Sets the poweredOffMemReservationMB value for this ClusterUsageSummary.
     * 
     * @param poweredOffMemReservationMB
     */
    public void setPoweredOffMemReservationMB(java.lang.Integer poweredOffMemReservationMB) {
        this.poweredOffMemReservationMB = poweredOffMemReservationMB;
    }


    /**
     * Gets the cpuDemandMhz value for this ClusterUsageSummary.
     * 
     * @return cpuDemandMhz
     */
    public int getCpuDemandMhz() {
        return cpuDemandMhz;
    }


    /**
     * Sets the cpuDemandMhz value for this ClusterUsageSummary.
     * 
     * @param cpuDemandMhz
     */
    public void setCpuDemandMhz(int cpuDemandMhz) {
        this.cpuDemandMhz = cpuDemandMhz;
    }


    /**
     * Gets the memDemandMB value for this ClusterUsageSummary.
     * 
     * @return memDemandMB
     */
    public int getMemDemandMB() {
        return memDemandMB;
    }


    /**
     * Sets the memDemandMB value for this ClusterUsageSummary.
     * 
     * @param memDemandMB
     */
    public void setMemDemandMB(int memDemandMB) {
        this.memDemandMB = memDemandMB;
    }


    /**
     * Gets the statsGenNumber value for this ClusterUsageSummary.
     * 
     * @return statsGenNumber
     */
    public long getStatsGenNumber() {
        return statsGenNumber;
    }


    /**
     * Sets the statsGenNumber value for this ClusterUsageSummary.
     * 
     * @param statsGenNumber
     */
    public void setStatsGenNumber(long statsGenNumber) {
        this.statsGenNumber = statsGenNumber;
    }


    /**
     * Gets the cpuEntitledMhz value for this ClusterUsageSummary.
     * 
     * @return cpuEntitledMhz
     */
    public int getCpuEntitledMhz() {
        return cpuEntitledMhz;
    }


    /**
     * Sets the cpuEntitledMhz value for this ClusterUsageSummary.
     * 
     * @param cpuEntitledMhz
     */
    public void setCpuEntitledMhz(int cpuEntitledMhz) {
        this.cpuEntitledMhz = cpuEntitledMhz;
    }


    /**
     * Gets the memEntitledMB value for this ClusterUsageSummary.
     * 
     * @return memEntitledMB
     */
    public int getMemEntitledMB() {
        return memEntitledMB;
    }


    /**
     * Sets the memEntitledMB value for this ClusterUsageSummary.
     * 
     * @param memEntitledMB
     */
    public void setMemEntitledMB(int memEntitledMB) {
        this.memEntitledMB = memEntitledMB;
    }


    /**
     * Gets the poweredOffVmCount value for this ClusterUsageSummary.
     * 
     * @return poweredOffVmCount
     */
    public int getPoweredOffVmCount() {
        return poweredOffVmCount;
    }


    /**
     * Sets the poweredOffVmCount value for this ClusterUsageSummary.
     * 
     * @param poweredOffVmCount
     */
    public void setPoweredOffVmCount(int poweredOffVmCount) {
        this.poweredOffVmCount = poweredOffVmCount;
    }


    /**
     * Gets the totalVmCount value for this ClusterUsageSummary.
     * 
     * @return totalVmCount
     */
    public int getTotalVmCount() {
        return totalVmCount;
    }


    /**
     * Sets the totalVmCount value for this ClusterUsageSummary.
     * 
     * @param totalVmCount
     */
    public void setTotalVmCount(int totalVmCount) {
        this.totalVmCount = totalVmCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterUsageSummary)) return false;
        ClusterUsageSummary other = (ClusterUsageSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.totalCpuCapacityMhz == other.getTotalCpuCapacityMhz() &&
            this.totalMemCapacityMB == other.getTotalMemCapacityMB() &&
            this.cpuReservationMhz == other.getCpuReservationMhz() &&
            this.memReservationMB == other.getMemReservationMB() &&
            ((this.poweredOffCpuReservationMhz==null && other.getPoweredOffCpuReservationMhz()==null) || 
             (this.poweredOffCpuReservationMhz!=null &&
              this.poweredOffCpuReservationMhz.equals(other.getPoweredOffCpuReservationMhz()))) &&
            ((this.poweredOffMemReservationMB==null && other.getPoweredOffMemReservationMB()==null) || 
             (this.poweredOffMemReservationMB!=null &&
              this.poweredOffMemReservationMB.equals(other.getPoweredOffMemReservationMB()))) &&
            this.cpuDemandMhz == other.getCpuDemandMhz() &&
            this.memDemandMB == other.getMemDemandMB() &&
            this.statsGenNumber == other.getStatsGenNumber() &&
            this.cpuEntitledMhz == other.getCpuEntitledMhz() &&
            this.memEntitledMB == other.getMemEntitledMB() &&
            this.poweredOffVmCount == other.getPoweredOffVmCount() &&
            this.totalVmCount == other.getTotalVmCount();
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
        _hashCode += getTotalCpuCapacityMhz();
        _hashCode += getTotalMemCapacityMB();
        _hashCode += getCpuReservationMhz();
        _hashCode += getMemReservationMB();
        if (getPoweredOffCpuReservationMhz() != null) {
            _hashCode += getPoweredOffCpuReservationMhz().hashCode();
        }
        if (getPoweredOffMemReservationMB() != null) {
            _hashCode += getPoweredOffMemReservationMB().hashCode();
        }
        _hashCode += getCpuDemandMhz();
        _hashCode += getMemDemandMB();
        _hashCode += new Long(getStatsGenNumber()).hashCode();
        _hashCode += getCpuEntitledMhz();
        _hashCode += getMemEntitledMB();
        _hashCode += getPoweredOffVmCount();
        _hashCode += getTotalVmCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterUsageSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterUsageSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCpuCapacityMhz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalCpuCapacityMhz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMemCapacityMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalMemCapacityMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuReservationMhz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuReservationMhz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memReservationMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memReservationMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poweredOffCpuReservationMhz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "poweredOffCpuReservationMhz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poweredOffMemReservationMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "poweredOffMemReservationMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuDemandMhz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuDemandMhz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memDemandMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memDemandMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsGenNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "statsGenNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuEntitledMhz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuEntitledMhz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memEntitledMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memEntitledMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poweredOffVmCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "poweredOffVmCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVmCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalVmCount"));
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
