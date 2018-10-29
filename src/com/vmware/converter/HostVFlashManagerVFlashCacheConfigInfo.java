/**
 * HostVFlashManagerVFlashCacheConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVFlashManagerVFlashCacheConfigInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption[] vFlashModuleConfigOption;

    private java.lang.String defaultVFlashModule;

    private java.lang.Long swapCacheReservationInGB;

    public HostVFlashManagerVFlashCacheConfigInfo() {
    }

    public HostVFlashManagerVFlashCacheConfigInfo(
           com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption[] vFlashModuleConfigOption,
           java.lang.String defaultVFlashModule,
           java.lang.Long swapCacheReservationInGB) {
        this.vFlashModuleConfigOption = vFlashModuleConfigOption;
        this.defaultVFlashModule = defaultVFlashModule;
        this.swapCacheReservationInGB = swapCacheReservationInGB;
    }


    /**
     * Gets the vFlashModuleConfigOption value for this HostVFlashManagerVFlashCacheConfigInfo.
     * 
     * @return vFlashModuleConfigOption
     */
    public com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption[] getVFlashModuleConfigOption() {
        return vFlashModuleConfigOption;
    }


    /**
     * Sets the vFlashModuleConfigOption value for this HostVFlashManagerVFlashCacheConfigInfo.
     * 
     * @param vFlashModuleConfigOption
     */
    public void setVFlashModuleConfigOption(com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption[] vFlashModuleConfigOption) {
        this.vFlashModuleConfigOption = vFlashModuleConfigOption;
    }

    public com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption getVFlashModuleConfigOption(int i) {
        return this.vFlashModuleConfigOption[i];
    }

    public void setVFlashModuleConfigOption(int i, com.vmware.converter.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption _value) {
        this.vFlashModuleConfigOption[i] = _value;
    }


    /**
     * Gets the defaultVFlashModule value for this HostVFlashManagerVFlashCacheConfigInfo.
     * 
     * @return defaultVFlashModule
     */
    public java.lang.String getDefaultVFlashModule() {
        return defaultVFlashModule;
    }


    /**
     * Sets the defaultVFlashModule value for this HostVFlashManagerVFlashCacheConfigInfo.
     * 
     * @param defaultVFlashModule
     */
    public void setDefaultVFlashModule(java.lang.String defaultVFlashModule) {
        this.defaultVFlashModule = defaultVFlashModule;
    }


    /**
     * Gets the swapCacheReservationInGB value for this HostVFlashManagerVFlashCacheConfigInfo.
     * 
     * @return swapCacheReservationInGB
     */
    public java.lang.Long getSwapCacheReservationInGB() {
        return swapCacheReservationInGB;
    }


    /**
     * Sets the swapCacheReservationInGB value for this HostVFlashManagerVFlashCacheConfigInfo.
     * 
     * @param swapCacheReservationInGB
     */
    public void setSwapCacheReservationInGB(java.lang.Long swapCacheReservationInGB) {
        this.swapCacheReservationInGB = swapCacheReservationInGB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVFlashManagerVFlashCacheConfigInfo)) return false;
        HostVFlashManagerVFlashCacheConfigInfo other = (HostVFlashManagerVFlashCacheConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vFlashModuleConfigOption==null && other.getVFlashModuleConfigOption()==null) || 
             (this.vFlashModuleConfigOption!=null &&
              java.util.Arrays.equals(this.vFlashModuleConfigOption, other.getVFlashModuleConfigOption()))) &&
            ((this.defaultVFlashModule==null && other.getDefaultVFlashModule()==null) || 
             (this.defaultVFlashModule!=null &&
              this.defaultVFlashModule.equals(other.getDefaultVFlashModule()))) &&
            ((this.swapCacheReservationInGB==null && other.getSwapCacheReservationInGB()==null) || 
             (this.swapCacheReservationInGB!=null &&
              this.swapCacheReservationInGB.equals(other.getSwapCacheReservationInGB())));
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
        if (getVFlashModuleConfigOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVFlashModuleConfigOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVFlashModuleConfigOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultVFlashModule() != null) {
            _hashCode += getDefaultVFlashModule().hashCode();
        }
        if (getSwapCacheReservationInGB() != null) {
            _hashCode += getSwapCacheReservationInGB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVFlashManagerVFlashCacheConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashCacheConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashModuleConfigOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashModuleConfigOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultVFlashModule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultVFlashModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapCacheReservationInGB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "swapCacheReservationInGB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
