/**
 * HostPnicNetworkResourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostPnicNetworkResourceInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String pnicDevice;

    private java.lang.Long availableBandwidthForVMTraffic;

    private java.lang.Long unusedBandwidthForVMTraffic;

    private com.vmware.converter.HostPlacedVirtualNicIdentifier[] placedVirtualNics;

    public HostPnicNetworkResourceInfo() {
    }

    public HostPnicNetworkResourceInfo(
           java.lang.String pnicDevice,
           java.lang.Long availableBandwidthForVMTraffic,
           java.lang.Long unusedBandwidthForVMTraffic,
           com.vmware.converter.HostPlacedVirtualNicIdentifier[] placedVirtualNics) {
        this.pnicDevice = pnicDevice;
        this.availableBandwidthForVMTraffic = availableBandwidthForVMTraffic;
        this.unusedBandwidthForVMTraffic = unusedBandwidthForVMTraffic;
        this.placedVirtualNics = placedVirtualNics;
    }


    /**
     * Gets the pnicDevice value for this HostPnicNetworkResourceInfo.
     * 
     * @return pnicDevice
     */
    public java.lang.String getPnicDevice() {
        return pnicDevice;
    }


    /**
     * Sets the pnicDevice value for this HostPnicNetworkResourceInfo.
     * 
     * @param pnicDevice
     */
    public void setPnicDevice(java.lang.String pnicDevice) {
        this.pnicDevice = pnicDevice;
    }


    /**
     * Gets the availableBandwidthForVMTraffic value for this HostPnicNetworkResourceInfo.
     * 
     * @return availableBandwidthForVMTraffic
     */
    public java.lang.Long getAvailableBandwidthForVMTraffic() {
        return availableBandwidthForVMTraffic;
    }


    /**
     * Sets the availableBandwidthForVMTraffic value for this HostPnicNetworkResourceInfo.
     * 
     * @param availableBandwidthForVMTraffic
     */
    public void setAvailableBandwidthForVMTraffic(java.lang.Long availableBandwidthForVMTraffic) {
        this.availableBandwidthForVMTraffic = availableBandwidthForVMTraffic;
    }


    /**
     * Gets the unusedBandwidthForVMTraffic value for this HostPnicNetworkResourceInfo.
     * 
     * @return unusedBandwidthForVMTraffic
     */
    public java.lang.Long getUnusedBandwidthForVMTraffic() {
        return unusedBandwidthForVMTraffic;
    }


    /**
     * Sets the unusedBandwidthForVMTraffic value for this HostPnicNetworkResourceInfo.
     * 
     * @param unusedBandwidthForVMTraffic
     */
    public void setUnusedBandwidthForVMTraffic(java.lang.Long unusedBandwidthForVMTraffic) {
        this.unusedBandwidthForVMTraffic = unusedBandwidthForVMTraffic;
    }


    /**
     * Gets the placedVirtualNics value for this HostPnicNetworkResourceInfo.
     * 
     * @return placedVirtualNics
     */
    public com.vmware.converter.HostPlacedVirtualNicIdentifier[] getPlacedVirtualNics() {
        return placedVirtualNics;
    }


    /**
     * Sets the placedVirtualNics value for this HostPnicNetworkResourceInfo.
     * 
     * @param placedVirtualNics
     */
    public void setPlacedVirtualNics(com.vmware.converter.HostPlacedVirtualNicIdentifier[] placedVirtualNics) {
        this.placedVirtualNics = placedVirtualNics;
    }

    public com.vmware.converter.HostPlacedVirtualNicIdentifier getPlacedVirtualNics(int i) {
        return this.placedVirtualNics[i];
    }

    public void setPlacedVirtualNics(int i, com.vmware.converter.HostPlacedVirtualNicIdentifier _value) {
        this.placedVirtualNics[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostPnicNetworkResourceInfo)) return false;
        HostPnicNetworkResourceInfo other = (HostPnicNetworkResourceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pnicDevice==null && other.getPnicDevice()==null) || 
             (this.pnicDevice!=null &&
              this.pnicDevice.equals(other.getPnicDevice()))) &&
            ((this.availableBandwidthForVMTraffic==null && other.getAvailableBandwidthForVMTraffic()==null) || 
             (this.availableBandwidthForVMTraffic!=null &&
              this.availableBandwidthForVMTraffic.equals(other.getAvailableBandwidthForVMTraffic()))) &&
            ((this.unusedBandwidthForVMTraffic==null && other.getUnusedBandwidthForVMTraffic()==null) || 
             (this.unusedBandwidthForVMTraffic!=null &&
              this.unusedBandwidthForVMTraffic.equals(other.getUnusedBandwidthForVMTraffic()))) &&
            ((this.placedVirtualNics==null && other.getPlacedVirtualNics()==null) || 
             (this.placedVirtualNics!=null &&
              java.util.Arrays.equals(this.placedVirtualNics, other.getPlacedVirtualNics())));
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
        if (getPnicDevice() != null) {
            _hashCode += getPnicDevice().hashCode();
        }
        if (getAvailableBandwidthForVMTraffic() != null) {
            _hashCode += getAvailableBandwidthForVMTraffic().hashCode();
        }
        if (getUnusedBandwidthForVMTraffic() != null) {
            _hashCode += getUnusedBandwidthForVMTraffic().hashCode();
        }
        if (getPlacedVirtualNics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacedVirtualNics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacedVirtualNics(), i);
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
        new org.apache.axis.description.TypeDesc(HostPnicNetworkResourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPnicNetworkResourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableBandwidthForVMTraffic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "availableBandwidthForVMTraffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unusedBandwidthForVMTraffic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unusedBandwidthForVMTraffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placedVirtualNics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "placedVirtualNics"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPlacedVirtualNicIdentifier"));
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
