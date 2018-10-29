/**
 * PlacementRankResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PlacementRankResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private com.vmware.converter.ManagedObjectReference candidate;

    private long reservedSpaceMB;

    private long usedSpaceMB;

    private long totalSpaceMB;

    private double utilization;

    private com.vmware.converter.LocalizedMethodFault[] faults;

    public PlacementRankResult() {
    }

    public PlacementRankResult(
           java.lang.String key,
           com.vmware.converter.ManagedObjectReference candidate,
           long reservedSpaceMB,
           long usedSpaceMB,
           long totalSpaceMB,
           double utilization,
           com.vmware.converter.LocalizedMethodFault[] faults) {
        this.key = key;
        this.candidate = candidate;
        this.reservedSpaceMB = reservedSpaceMB;
        this.usedSpaceMB = usedSpaceMB;
        this.totalSpaceMB = totalSpaceMB;
        this.utilization = utilization;
        this.faults = faults;
    }


    /**
     * Gets the key value for this PlacementRankResult.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this PlacementRankResult.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the candidate value for this PlacementRankResult.
     * 
     * @return candidate
     */
    public com.vmware.converter.ManagedObjectReference getCandidate() {
        return candidate;
    }


    /**
     * Sets the candidate value for this PlacementRankResult.
     * 
     * @param candidate
     */
    public void setCandidate(com.vmware.converter.ManagedObjectReference candidate) {
        this.candidate = candidate;
    }


    /**
     * Gets the reservedSpaceMB value for this PlacementRankResult.
     * 
     * @return reservedSpaceMB
     */
    public long getReservedSpaceMB() {
        return reservedSpaceMB;
    }


    /**
     * Sets the reservedSpaceMB value for this PlacementRankResult.
     * 
     * @param reservedSpaceMB
     */
    public void setReservedSpaceMB(long reservedSpaceMB) {
        this.reservedSpaceMB = reservedSpaceMB;
    }


    /**
     * Gets the usedSpaceMB value for this PlacementRankResult.
     * 
     * @return usedSpaceMB
     */
    public long getUsedSpaceMB() {
        return usedSpaceMB;
    }


    /**
     * Sets the usedSpaceMB value for this PlacementRankResult.
     * 
     * @param usedSpaceMB
     */
    public void setUsedSpaceMB(long usedSpaceMB) {
        this.usedSpaceMB = usedSpaceMB;
    }


    /**
     * Gets the totalSpaceMB value for this PlacementRankResult.
     * 
     * @return totalSpaceMB
     */
    public long getTotalSpaceMB() {
        return totalSpaceMB;
    }


    /**
     * Sets the totalSpaceMB value for this PlacementRankResult.
     * 
     * @param totalSpaceMB
     */
    public void setTotalSpaceMB(long totalSpaceMB) {
        this.totalSpaceMB = totalSpaceMB;
    }


    /**
     * Gets the utilization value for this PlacementRankResult.
     * 
     * @return utilization
     */
    public double getUtilization() {
        return utilization;
    }


    /**
     * Sets the utilization value for this PlacementRankResult.
     * 
     * @param utilization
     */
    public void setUtilization(double utilization) {
        this.utilization = utilization;
    }


    /**
     * Gets the faults value for this PlacementRankResult.
     * 
     * @return faults
     */
    public com.vmware.converter.LocalizedMethodFault[] getFaults() {
        return faults;
    }


    /**
     * Sets the faults value for this PlacementRankResult.
     * 
     * @param faults
     */
    public void setFaults(com.vmware.converter.LocalizedMethodFault[] faults) {
        this.faults = faults;
    }

    public com.vmware.converter.LocalizedMethodFault getFaults(int i) {
        return this.faults[i];
    }

    public void setFaults(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.faults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementRankResult)) return false;
        PlacementRankResult other = (PlacementRankResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.candidate==null && other.getCandidate()==null) || 
             (this.candidate!=null &&
              this.candidate.equals(other.getCandidate()))) &&
            this.reservedSpaceMB == other.getReservedSpaceMB() &&
            this.usedSpaceMB == other.getUsedSpaceMB() &&
            this.totalSpaceMB == other.getTotalSpaceMB() &&
            this.utilization == other.getUtilization() &&
            ((this.faults==null && other.getFaults()==null) || 
             (this.faults!=null &&
              java.util.Arrays.equals(this.faults, other.getFaults())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getCandidate() != null) {
            _hashCode += getCandidate().hashCode();
        }
        _hashCode += new Long(getReservedSpaceMB()).hashCode();
        _hashCode += new Long(getUsedSpaceMB()).hashCode();
        _hashCode += new Long(getTotalSpaceMB()).hashCode();
        _hashCode += new Double(getUtilization()).hashCode();
        if (getFaults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaults(), i);
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
        new org.apache.axis.description.TypeDesc(PlacementRankResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementRankResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "candidate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedSpaceMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservedSpaceMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedSpaceMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usedSpaceMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSpaceMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalSpaceMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "utilization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
