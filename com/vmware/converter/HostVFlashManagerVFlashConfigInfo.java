/**
 * HostVFlashManagerVFlashConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVFlashManagerVFlashConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostVFlashManagerVFlashResourceConfigInfo vFlashResourceConfigInfo;

    private com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfo vFlashCacheConfigInfo;

    public HostVFlashManagerVFlashConfigInfo() {
    }

    public HostVFlashManagerVFlashConfigInfo(
           com.vmware.converter.HostVFlashManagerVFlashResourceConfigInfo vFlashResourceConfigInfo,
           com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfo vFlashCacheConfigInfo) {
        this.vFlashResourceConfigInfo = vFlashResourceConfigInfo;
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
    }


    /**
     * Gets the vFlashResourceConfigInfo value for this HostVFlashManagerVFlashConfigInfo.
     * 
     * @return vFlashResourceConfigInfo
     */
    public com.vmware.converter.HostVFlashManagerVFlashResourceConfigInfo getVFlashResourceConfigInfo() {
        return vFlashResourceConfigInfo;
    }


    /**
     * Sets the vFlashResourceConfigInfo value for this HostVFlashManagerVFlashConfigInfo.
     * 
     * @param vFlashResourceConfigInfo
     */
    public void setVFlashResourceConfigInfo(com.vmware.converter.HostVFlashManagerVFlashResourceConfigInfo vFlashResourceConfigInfo) {
        this.vFlashResourceConfigInfo = vFlashResourceConfigInfo;
    }


    /**
     * Gets the vFlashCacheConfigInfo value for this HostVFlashManagerVFlashConfigInfo.
     * 
     * @return vFlashCacheConfigInfo
     */
    public com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
        return vFlashCacheConfigInfo;
    }


    /**
     * Sets the vFlashCacheConfigInfo value for this HostVFlashManagerVFlashConfigInfo.
     * 
     * @param vFlashCacheConfigInfo
     */
    public void setVFlashCacheConfigInfo(com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfo vFlashCacheConfigInfo) {
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVFlashManagerVFlashConfigInfo)) return false;
        HostVFlashManagerVFlashConfigInfo other = (HostVFlashManagerVFlashConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vFlashResourceConfigInfo==null && other.getVFlashResourceConfigInfo()==null) || 
             (this.vFlashResourceConfigInfo!=null &&
              this.vFlashResourceConfigInfo.equals(other.getVFlashResourceConfigInfo()))) &&
            ((this.vFlashCacheConfigInfo==null && other.getVFlashCacheConfigInfo()==null) || 
             (this.vFlashCacheConfigInfo!=null &&
              this.vFlashCacheConfigInfo.equals(other.getVFlashCacheConfigInfo())));
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
        if (getVFlashResourceConfigInfo() != null) {
            _hashCode += getVFlashResourceConfigInfo().hashCode();
        }
        if (getVFlashCacheConfigInfo() != null) {
            _hashCode += getVFlashCacheConfigInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVFlashManagerVFlashConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashResourceConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashResourceConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashResourceConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashCacheConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashCacheConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashCacheConfigInfo"));
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
