/**
 * StorageDrsConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.StorageDrsPodConfigInfo podConfig;

    private com.vmware.converter.StorageDrsVmConfigInfo[] vmConfig;

    public StorageDrsConfigInfo() {
    }

    public StorageDrsConfigInfo(
           com.vmware.converter.StorageDrsPodConfigInfo podConfig,
           com.vmware.converter.StorageDrsVmConfigInfo[] vmConfig) {
        this.podConfig = podConfig;
        this.vmConfig = vmConfig;
    }


    /**
     * Gets the podConfig value for this StorageDrsConfigInfo.
     * 
     * @return podConfig
     */
    public com.vmware.converter.StorageDrsPodConfigInfo getPodConfig() {
        return podConfig;
    }


    /**
     * Sets the podConfig value for this StorageDrsConfigInfo.
     * 
     * @param podConfig
     */
    public void setPodConfig(com.vmware.converter.StorageDrsPodConfigInfo podConfig) {
        this.podConfig = podConfig;
    }


    /**
     * Gets the vmConfig value for this StorageDrsConfigInfo.
     * 
     * @return vmConfig
     */
    public com.vmware.converter.StorageDrsVmConfigInfo[] getVmConfig() {
        return vmConfig;
    }


    /**
     * Sets the vmConfig value for this StorageDrsConfigInfo.
     * 
     * @param vmConfig
     */
    public void setVmConfig(com.vmware.converter.StorageDrsVmConfigInfo[] vmConfig) {
        this.vmConfig = vmConfig;
    }

    public com.vmware.converter.StorageDrsVmConfigInfo getVmConfig(int i) {
        return this.vmConfig[i];
    }

    public void setVmConfig(int i, com.vmware.converter.StorageDrsVmConfigInfo _value) {
        this.vmConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsConfigInfo)) return false;
        StorageDrsConfigInfo other = (StorageDrsConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.podConfig==null && other.getPodConfig()==null) || 
             (this.podConfig!=null &&
              this.podConfig.equals(other.getPodConfig()))) &&
            ((this.vmConfig==null && other.getVmConfig()==null) || 
             (this.vmConfig!=null &&
              java.util.Arrays.equals(this.vmConfig, other.getVmConfig())));
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
        if (getPodConfig() != null) {
            _hashCode += getPodConfig().hashCode();
        }
        if (getVmConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmConfig(), i);
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
        new org.apache.axis.description.TypeDesc(StorageDrsConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("podConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "podConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsPodConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsVmConfigInfo"));
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
