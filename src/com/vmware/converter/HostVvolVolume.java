/**
 * HostVvolVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVvolVolume  extends com.vmware.converter.HostFileSystemVolume  implements java.io.Serializable {
    private java.lang.String scId;

    private com.vmware.converter.VVolHostPE[] hostPE;

    private com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo;

    private com.vmware.converter.VASAStorageArray[] storageArray;

    public HostVvolVolume() {
    }

    public HostVvolVolume(
           java.lang.String type,
           java.lang.String name,
           long capacity,
           java.lang.String scId,
           com.vmware.converter.VVolHostPE[] hostPE,
           com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo,
           com.vmware.converter.VASAStorageArray[] storageArray) {
        super(
            type,
            name,
            capacity);
        this.scId = scId;
        this.hostPE = hostPE;
        this.vasaProviderInfo = vasaProviderInfo;
        this.storageArray = storageArray;
    }


    /**
     * Gets the scId value for this HostVvolVolume.
     * 
     * @return scId
     */
    public java.lang.String getScId() {
        return scId;
    }


    /**
     * Sets the scId value for this HostVvolVolume.
     * 
     * @param scId
     */
    public void setScId(java.lang.String scId) {
        this.scId = scId;
    }


    /**
     * Gets the hostPE value for this HostVvolVolume.
     * 
     * @return hostPE
     */
    public com.vmware.converter.VVolHostPE[] getHostPE() {
        return hostPE;
    }


    /**
     * Sets the hostPE value for this HostVvolVolume.
     * 
     * @param hostPE
     */
    public void setHostPE(com.vmware.converter.VVolHostPE[] hostPE) {
        this.hostPE = hostPE;
    }

    public com.vmware.converter.VVolHostPE getHostPE(int i) {
        return this.hostPE[i];
    }

    public void setHostPE(int i, com.vmware.converter.VVolHostPE _value) {
        this.hostPE[i] = _value;
    }


    /**
     * Gets the vasaProviderInfo value for this HostVvolVolume.
     * 
     * @return vasaProviderInfo
     */
    public com.vmware.converter.VimVasaProviderInfo[] getVasaProviderInfo() {
        return vasaProviderInfo;
    }


    /**
     * Sets the vasaProviderInfo value for this HostVvolVolume.
     * 
     * @param vasaProviderInfo
     */
    public void setVasaProviderInfo(com.vmware.converter.VimVasaProviderInfo[] vasaProviderInfo) {
        this.vasaProviderInfo = vasaProviderInfo;
    }

    public com.vmware.converter.VimVasaProviderInfo getVasaProviderInfo(int i) {
        return this.vasaProviderInfo[i];
    }

    public void setVasaProviderInfo(int i, com.vmware.converter.VimVasaProviderInfo _value) {
        this.vasaProviderInfo[i] = _value;
    }


    /**
     * Gets the storageArray value for this HostVvolVolume.
     * 
     * @return storageArray
     */
    public com.vmware.converter.VASAStorageArray[] getStorageArray() {
        return storageArray;
    }


    /**
     * Sets the storageArray value for this HostVvolVolume.
     * 
     * @param storageArray
     */
    public void setStorageArray(com.vmware.converter.VASAStorageArray[] storageArray) {
        this.storageArray = storageArray;
    }

    public com.vmware.converter.VASAStorageArray getStorageArray(int i) {
        return this.storageArray[i];
    }

    public void setStorageArray(int i, com.vmware.converter.VASAStorageArray _value) {
        this.storageArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVvolVolume)) return false;
        HostVvolVolume other = (HostVvolVolume) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scId==null && other.getScId()==null) || 
             (this.scId!=null &&
              this.scId.equals(other.getScId()))) &&
            ((this.hostPE==null && other.getHostPE()==null) || 
             (this.hostPE!=null &&
              java.util.Arrays.equals(this.hostPE, other.getHostPE()))) &&
            ((this.vasaProviderInfo==null && other.getVasaProviderInfo()==null) || 
             (this.vasaProviderInfo!=null &&
              java.util.Arrays.equals(this.vasaProviderInfo, other.getVasaProviderInfo()))) &&
            ((this.storageArray==null && other.getStorageArray()==null) || 
             (this.storageArray!=null &&
              java.util.Arrays.equals(this.storageArray, other.getStorageArray())));
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
        if (getScId() != null) {
            _hashCode += getScId().hashCode();
        }
        if (getHostPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVasaProviderInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVasaProviderInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVasaProviderInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStorageArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStorageArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStorageArray(), i);
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
        new org.apache.axis.description.TypeDesc(HostVvolVolume.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVvolVolume"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPE");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VVolHostPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vasaProviderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vasaProviderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VimVasaProviderInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VASAStorageArray"));
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
