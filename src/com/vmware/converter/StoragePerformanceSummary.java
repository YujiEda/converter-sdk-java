/**
 * StoragePerformanceSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StoragePerformanceSummary  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private int interval;

    private int[] percentile;

    private double[] datastoreReadLatency;

    private double[] datastoreWriteLatency;

    private double[] datastoreVmLatency;

    private double[] datastoreReadIops;

    private double[] datastoreWriteIops;

    private int siocActivityDuration;

    public StoragePerformanceSummary() {
    }

    public StoragePerformanceSummary(
           int interval,
           int[] percentile,
           double[] datastoreReadLatency,
           double[] datastoreWriteLatency,
           double[] datastoreVmLatency,
           double[] datastoreReadIops,
           double[] datastoreWriteIops,
           int siocActivityDuration) {
        this.interval = interval;
        this.percentile = percentile;
        this.datastoreReadLatency = datastoreReadLatency;
        this.datastoreWriteLatency = datastoreWriteLatency;
        this.datastoreVmLatency = datastoreVmLatency;
        this.datastoreReadIops = datastoreReadIops;
        this.datastoreWriteIops = datastoreWriteIops;
        this.siocActivityDuration = siocActivityDuration;
    }


    /**
     * Gets the interval value for this StoragePerformanceSummary.
     * 
     * @return interval
     */
    public int getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this StoragePerformanceSummary.
     * 
     * @param interval
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }


    /**
     * Gets the percentile value for this StoragePerformanceSummary.
     * 
     * @return percentile
     */
    public int[] getPercentile() {
        return percentile;
    }


    /**
     * Sets the percentile value for this StoragePerformanceSummary.
     * 
     * @param percentile
     */
    public void setPercentile(int[] percentile) {
        this.percentile = percentile;
    }

    public int getPercentile(int i) {
        return this.percentile[i];
    }

    public void setPercentile(int i, int _value) {
        this.percentile[i] = _value;
    }


    /**
     * Gets the datastoreReadLatency value for this StoragePerformanceSummary.
     * 
     * @return datastoreReadLatency
     */
    public double[] getDatastoreReadLatency() {
        return datastoreReadLatency;
    }


    /**
     * Sets the datastoreReadLatency value for this StoragePerformanceSummary.
     * 
     * @param datastoreReadLatency
     */
    public void setDatastoreReadLatency(double[] datastoreReadLatency) {
        this.datastoreReadLatency = datastoreReadLatency;
    }

    public double getDatastoreReadLatency(int i) {
        return this.datastoreReadLatency[i];
    }

    public void setDatastoreReadLatency(int i, double _value) {
        this.datastoreReadLatency[i] = _value;
    }


    /**
     * Gets the datastoreWriteLatency value for this StoragePerformanceSummary.
     * 
     * @return datastoreWriteLatency
     */
    public double[] getDatastoreWriteLatency() {
        return datastoreWriteLatency;
    }


    /**
     * Sets the datastoreWriteLatency value for this StoragePerformanceSummary.
     * 
     * @param datastoreWriteLatency
     */
    public void setDatastoreWriteLatency(double[] datastoreWriteLatency) {
        this.datastoreWriteLatency = datastoreWriteLatency;
    }

    public double getDatastoreWriteLatency(int i) {
        return this.datastoreWriteLatency[i];
    }

    public void setDatastoreWriteLatency(int i, double _value) {
        this.datastoreWriteLatency[i] = _value;
    }


    /**
     * Gets the datastoreVmLatency value for this StoragePerformanceSummary.
     * 
     * @return datastoreVmLatency
     */
    public double[] getDatastoreVmLatency() {
        return datastoreVmLatency;
    }


    /**
     * Sets the datastoreVmLatency value for this StoragePerformanceSummary.
     * 
     * @param datastoreVmLatency
     */
    public void setDatastoreVmLatency(double[] datastoreVmLatency) {
        this.datastoreVmLatency = datastoreVmLatency;
    }

    public double getDatastoreVmLatency(int i) {
        return this.datastoreVmLatency[i];
    }

    public void setDatastoreVmLatency(int i, double _value) {
        this.datastoreVmLatency[i] = _value;
    }


    /**
     * Gets the datastoreReadIops value for this StoragePerformanceSummary.
     * 
     * @return datastoreReadIops
     */
    public double[] getDatastoreReadIops() {
        return datastoreReadIops;
    }


    /**
     * Sets the datastoreReadIops value for this StoragePerformanceSummary.
     * 
     * @param datastoreReadIops
     */
    public void setDatastoreReadIops(double[] datastoreReadIops) {
        this.datastoreReadIops = datastoreReadIops;
    }

    public double getDatastoreReadIops(int i) {
        return this.datastoreReadIops[i];
    }

    public void setDatastoreReadIops(int i, double _value) {
        this.datastoreReadIops[i] = _value;
    }


    /**
     * Gets the datastoreWriteIops value for this StoragePerformanceSummary.
     * 
     * @return datastoreWriteIops
     */
    public double[] getDatastoreWriteIops() {
        return datastoreWriteIops;
    }


    /**
     * Sets the datastoreWriteIops value for this StoragePerformanceSummary.
     * 
     * @param datastoreWriteIops
     */
    public void setDatastoreWriteIops(double[] datastoreWriteIops) {
        this.datastoreWriteIops = datastoreWriteIops;
    }

    public double getDatastoreWriteIops(int i) {
        return this.datastoreWriteIops[i];
    }

    public void setDatastoreWriteIops(int i, double _value) {
        this.datastoreWriteIops[i] = _value;
    }


    /**
     * Gets the siocActivityDuration value for this StoragePerformanceSummary.
     * 
     * @return siocActivityDuration
     */
    public int getSiocActivityDuration() {
        return siocActivityDuration;
    }


    /**
     * Sets the siocActivityDuration value for this StoragePerformanceSummary.
     * 
     * @param siocActivityDuration
     */
    public void setSiocActivityDuration(int siocActivityDuration) {
        this.siocActivityDuration = siocActivityDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoragePerformanceSummary)) return false;
        StoragePerformanceSummary other = (StoragePerformanceSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.interval == other.getInterval() &&
            ((this.percentile==null && other.getPercentile()==null) || 
             (this.percentile!=null &&
              java.util.Arrays.equals(this.percentile, other.getPercentile()))) &&
            ((this.datastoreReadLatency==null && other.getDatastoreReadLatency()==null) || 
             (this.datastoreReadLatency!=null &&
              java.util.Arrays.equals(this.datastoreReadLatency, other.getDatastoreReadLatency()))) &&
            ((this.datastoreWriteLatency==null && other.getDatastoreWriteLatency()==null) || 
             (this.datastoreWriteLatency!=null &&
              java.util.Arrays.equals(this.datastoreWriteLatency, other.getDatastoreWriteLatency()))) &&
            ((this.datastoreVmLatency==null && other.getDatastoreVmLatency()==null) || 
             (this.datastoreVmLatency!=null &&
              java.util.Arrays.equals(this.datastoreVmLatency, other.getDatastoreVmLatency()))) &&
            ((this.datastoreReadIops==null && other.getDatastoreReadIops()==null) || 
             (this.datastoreReadIops!=null &&
              java.util.Arrays.equals(this.datastoreReadIops, other.getDatastoreReadIops()))) &&
            ((this.datastoreWriteIops==null && other.getDatastoreWriteIops()==null) || 
             (this.datastoreWriteIops!=null &&
              java.util.Arrays.equals(this.datastoreWriteIops, other.getDatastoreWriteIops()))) &&
            this.siocActivityDuration == other.getSiocActivityDuration();
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
        _hashCode += getInterval();
        if (getPercentile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPercentile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPercentile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastoreReadLatency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastoreReadLatency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastoreReadLatency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastoreWriteLatency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastoreWriteLatency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastoreWriteLatency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastoreVmLatency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastoreVmLatency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastoreVmLatency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastoreReadIops() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastoreReadIops());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastoreReadIops(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatastoreWriteIops() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastoreWriteIops());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastoreWriteIops(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSiocActivityDuration();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoragePerformanceSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StoragePerformanceSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "percentile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreReadLatency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreReadLatency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreWriteLatency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreWriteLatency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreVmLatency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreVmLatency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreReadIops");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreReadIops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreWriteIops");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreWriteIops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siocActivityDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "siocActivityDuration"));
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
