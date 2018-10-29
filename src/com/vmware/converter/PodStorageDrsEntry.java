/**
 * PodStorageDrsEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PodStorageDrsEntry  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.StorageDrsConfigInfo storageDrsConfig;

    private com.vmware.converter.ClusterRecommendation[] recommendation;

    private com.vmware.converter.ClusterDrsFaults[] drsFault;

    private com.vmware.converter.ClusterActionHistory[] actionHistory;

    public PodStorageDrsEntry() {
    }

    public PodStorageDrsEntry(
           com.vmware.converter.StorageDrsConfigInfo storageDrsConfig,
           com.vmware.converter.ClusterRecommendation[] recommendation,
           com.vmware.converter.ClusterDrsFaults[] drsFault,
           com.vmware.converter.ClusterActionHistory[] actionHistory) {
        this.storageDrsConfig = storageDrsConfig;
        this.recommendation = recommendation;
        this.drsFault = drsFault;
        this.actionHistory = actionHistory;
    }


    /**
     * Gets the storageDrsConfig value for this PodStorageDrsEntry.
     * 
     * @return storageDrsConfig
     */
    public com.vmware.converter.StorageDrsConfigInfo getStorageDrsConfig() {
        return storageDrsConfig;
    }


    /**
     * Sets the storageDrsConfig value for this PodStorageDrsEntry.
     * 
     * @param storageDrsConfig
     */
    public void setStorageDrsConfig(com.vmware.converter.StorageDrsConfigInfo storageDrsConfig) {
        this.storageDrsConfig = storageDrsConfig;
    }


    /**
     * Gets the recommendation value for this PodStorageDrsEntry.
     * 
     * @return recommendation
     */
    public com.vmware.converter.ClusterRecommendation[] getRecommendation() {
        return recommendation;
    }


    /**
     * Sets the recommendation value for this PodStorageDrsEntry.
     * 
     * @param recommendation
     */
    public void setRecommendation(com.vmware.converter.ClusterRecommendation[] recommendation) {
        this.recommendation = recommendation;
    }

    public com.vmware.converter.ClusterRecommendation getRecommendation(int i) {
        return this.recommendation[i];
    }

    public void setRecommendation(int i, com.vmware.converter.ClusterRecommendation _value) {
        this.recommendation[i] = _value;
    }


    /**
     * Gets the drsFault value for this PodStorageDrsEntry.
     * 
     * @return drsFault
     */
    public com.vmware.converter.ClusterDrsFaults[] getDrsFault() {
        return drsFault;
    }


    /**
     * Sets the drsFault value for this PodStorageDrsEntry.
     * 
     * @param drsFault
     */
    public void setDrsFault(com.vmware.converter.ClusterDrsFaults[] drsFault) {
        this.drsFault = drsFault;
    }

    public com.vmware.converter.ClusterDrsFaults getDrsFault(int i) {
        return this.drsFault[i];
    }

    public void setDrsFault(int i, com.vmware.converter.ClusterDrsFaults _value) {
        this.drsFault[i] = _value;
    }


    /**
     * Gets the actionHistory value for this PodStorageDrsEntry.
     * 
     * @return actionHistory
     */
    public com.vmware.converter.ClusterActionHistory[] getActionHistory() {
        return actionHistory;
    }


    /**
     * Sets the actionHistory value for this PodStorageDrsEntry.
     * 
     * @param actionHistory
     */
    public void setActionHistory(com.vmware.converter.ClusterActionHistory[] actionHistory) {
        this.actionHistory = actionHistory;
    }

    public com.vmware.converter.ClusterActionHistory getActionHistory(int i) {
        return this.actionHistory[i];
    }

    public void setActionHistory(int i, com.vmware.converter.ClusterActionHistory _value) {
        this.actionHistory[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PodStorageDrsEntry)) return false;
        PodStorageDrsEntry other = (PodStorageDrsEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.storageDrsConfig==null && other.getStorageDrsConfig()==null) || 
             (this.storageDrsConfig!=null &&
              this.storageDrsConfig.equals(other.getStorageDrsConfig()))) &&
            ((this.recommendation==null && other.getRecommendation()==null) || 
             (this.recommendation!=null &&
              java.util.Arrays.equals(this.recommendation, other.getRecommendation()))) &&
            ((this.drsFault==null && other.getDrsFault()==null) || 
             (this.drsFault!=null &&
              java.util.Arrays.equals(this.drsFault, other.getDrsFault()))) &&
            ((this.actionHistory==null && other.getActionHistory()==null) || 
             (this.actionHistory!=null &&
              java.util.Arrays.equals(this.actionHistory, other.getActionHistory())));
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
        if (getStorageDrsConfig() != null) {
            _hashCode += getStorageDrsConfig().hashCode();
        }
        if (getRecommendation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecommendation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecommendation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrsFault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrsFault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrsFault(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActionHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionHistory(), i);
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
        new org.apache.axis.description.TypeDesc(PodStorageDrsEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PodStorageDrsEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageDrsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageDrsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRecommendation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drsFault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "drsFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsFaults"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "actionHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterActionHistory"));
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
