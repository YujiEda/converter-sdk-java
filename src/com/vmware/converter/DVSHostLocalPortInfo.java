/**
 * DVSHostLocalPortInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSHostLocalPortInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String switchUuid;

    private java.lang.String portKey;

    private com.vmware.converter.DVPortSetting setting;

    private java.lang.String vnic;

    public DVSHostLocalPortInfo() {
    }

    public DVSHostLocalPortInfo(
           java.lang.String switchUuid,
           java.lang.String portKey,
           com.vmware.converter.DVPortSetting setting,
           java.lang.String vnic) {
        this.switchUuid = switchUuid;
        this.portKey = portKey;
        this.setting = setting;
        this.vnic = vnic;
    }


    /**
     * Gets the switchUuid value for this DVSHostLocalPortInfo.
     * 
     * @return switchUuid
     */
    public java.lang.String getSwitchUuid() {
        return switchUuid;
    }


    /**
     * Sets the switchUuid value for this DVSHostLocalPortInfo.
     * 
     * @param switchUuid
     */
    public void setSwitchUuid(java.lang.String switchUuid) {
        this.switchUuid = switchUuid;
    }


    /**
     * Gets the portKey value for this DVSHostLocalPortInfo.
     * 
     * @return portKey
     */
    public java.lang.String getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this DVSHostLocalPortInfo.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String portKey) {
        this.portKey = portKey;
    }


    /**
     * Gets the setting value for this DVSHostLocalPortInfo.
     * 
     * @return setting
     */
    public com.vmware.converter.DVPortSetting getSetting() {
        return setting;
    }


    /**
     * Sets the setting value for this DVSHostLocalPortInfo.
     * 
     * @param setting
     */
    public void setSetting(com.vmware.converter.DVPortSetting setting) {
        this.setting = setting;
    }


    /**
     * Gets the vnic value for this DVSHostLocalPortInfo.
     * 
     * @return vnic
     */
    public java.lang.String getVnic() {
        return vnic;
    }


    /**
     * Sets the vnic value for this DVSHostLocalPortInfo.
     * 
     * @param vnic
     */
    public void setVnic(java.lang.String vnic) {
        this.vnic = vnic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSHostLocalPortInfo)) return false;
        DVSHostLocalPortInfo other = (DVSHostLocalPortInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.switchUuid==null && other.getSwitchUuid()==null) || 
             (this.switchUuid!=null &&
              this.switchUuid.equals(other.getSwitchUuid()))) &&
            ((this.portKey==null && other.getPortKey()==null) || 
             (this.portKey!=null &&
              this.portKey.equals(other.getPortKey()))) &&
            ((this.setting==null && other.getSetting()==null) || 
             (this.setting!=null &&
              this.setting.equals(other.getSetting()))) &&
            ((this.vnic==null && other.getVnic()==null) || 
             (this.vnic!=null &&
              this.vnic.equals(other.getVnic())));
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
        if (getSwitchUuid() != null) {
            _hashCode += getSwitchUuid().hashCode();
        }
        if (getPortKey() != null) {
            _hashCode += getPortKey().hashCode();
        }
        if (getSetting() != null) {
            _hashCode += getSetting().hashCode();
        }
        if (getVnic() != null) {
            _hashCode += getVnic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSHostLocalPortInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSHostLocalPortInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "setting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortSetting"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
