/**
 * VirtualResourcePoolUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualResourcePoolUsage  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vrpId;

    private long cpuReservationMhz;

    private long memReservationMB;

    private long cpuReservationUsedMhz;

    private long memReservationUsedMB;

    public VirtualResourcePoolUsage() {
    }

    public VirtualResourcePoolUsage(
           java.lang.String vrpId,
           long cpuReservationMhz,
           long memReservationMB,
           long cpuReservationUsedMhz,
           long memReservationUsedMB) {
        this.vrpId = vrpId;
        this.cpuReservationMhz = cpuReservationMhz;
        this.memReservationMB = memReservationMB;
        this.cpuReservationUsedMhz = cpuReservationUsedMhz;
        this.memReservationUsedMB = memReservationUsedMB;
    }


    /**
     * Gets the vrpId value for this VirtualResourcePoolUsage.
     * 
     * @return vrpId
     */
    public java.lang.String getVrpId() {
        return vrpId;
    }


    /**
     * Sets the vrpId value for this VirtualResourcePoolUsage.
     * 
     * @param vrpId
     */
    public void setVrpId(java.lang.String vrpId) {
        this.vrpId = vrpId;
    }


    /**
     * Gets the cpuReservationMhz value for this VirtualResourcePoolUsage.
     * 
     * @return cpuReservationMhz
     */
    public long getCpuReservationMhz() {
        return cpuReservationMhz;
    }


    /**
     * Sets the cpuReservationMhz value for this VirtualResourcePoolUsage.
     * 
     * @param cpuReservationMhz
     */
    public void setCpuReservationMhz(long cpuReservationMhz) {
        this.cpuReservationMhz = cpuReservationMhz;
    }


    /**
     * Gets the memReservationMB value for this VirtualResourcePoolUsage.
     * 
     * @return memReservationMB
     */
    public long getMemReservationMB() {
        return memReservationMB;
    }


    /**
     * Sets the memReservationMB value for this VirtualResourcePoolUsage.
     * 
     * @param memReservationMB
     */
    public void setMemReservationMB(long memReservationMB) {
        this.memReservationMB = memReservationMB;
    }


    /**
     * Gets the cpuReservationUsedMhz value for this VirtualResourcePoolUsage.
     * 
     * @return cpuReservationUsedMhz
     */
    public long getCpuReservationUsedMhz() {
        return cpuReservationUsedMhz;
    }


    /**
     * Sets the cpuReservationUsedMhz value for this VirtualResourcePoolUsage.
     * 
     * @param cpuReservationUsedMhz
     */
    public void setCpuReservationUsedMhz(long cpuReservationUsedMhz) {
        this.cpuReservationUsedMhz = cpuReservationUsedMhz;
    }


    /**
     * Gets the memReservationUsedMB value for this VirtualResourcePoolUsage.
     * 
     * @return memReservationUsedMB
     */
    public long getMemReservationUsedMB() {
        return memReservationUsedMB;
    }


    /**
     * Sets the memReservationUsedMB value for this VirtualResourcePoolUsage.
     * 
     * @param memReservationUsedMB
     */
    public void setMemReservationUsedMB(long memReservationUsedMB) {
        this.memReservationUsedMB = memReservationUsedMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualResourcePoolUsage)) return false;
        VirtualResourcePoolUsage other = (VirtualResourcePoolUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vrpId==null && other.getVrpId()==null) || 
             (this.vrpId!=null &&
              this.vrpId.equals(other.getVrpId()))) &&
            this.cpuReservationMhz == other.getCpuReservationMhz() &&
            this.memReservationMB == other.getMemReservationMB() &&
            this.cpuReservationUsedMhz == other.getCpuReservationUsedMhz() &&
            this.memReservationUsedMB == other.getMemReservationUsedMB();
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
        if (getVrpId() != null) {
            _hashCode += getVrpId().hashCode();
        }
        _hashCode += new Long(getCpuReservationMhz()).hashCode();
        _hashCode += new Long(getMemReservationMB()).hashCode();
        _hashCode += new Long(getCpuReservationUsedMhz()).hashCode();
        _hashCode += new Long(getMemReservationUsedMB()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualResourcePoolUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualResourcePoolUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrpId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vrpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuReservationMhz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuReservationMhz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memReservationMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memReservationMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuReservationUsedMhz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuReservationUsedMhz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memReservationUsedMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memReservationUsedMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
