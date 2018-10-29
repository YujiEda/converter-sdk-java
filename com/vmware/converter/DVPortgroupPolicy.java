/**
 * DVPortgroupPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVPortgroupPolicy  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean blockOverrideAllowed;

    private boolean shapingOverrideAllowed;

    private boolean vendorConfigOverrideAllowed;

    private boolean livePortMovingAllowed;

    private boolean portConfigResetAtDisconnect;

    private java.lang.Boolean networkResourcePoolOverrideAllowed;

    private java.lang.Boolean trafficFilterOverrideAllowed;

    public DVPortgroupPolicy() {
    }

    public DVPortgroupPolicy(
           boolean blockOverrideAllowed,
           boolean shapingOverrideAllowed,
           boolean vendorConfigOverrideAllowed,
           boolean livePortMovingAllowed,
           boolean portConfigResetAtDisconnect,
           java.lang.Boolean networkResourcePoolOverrideAllowed,
           java.lang.Boolean trafficFilterOverrideAllowed) {
        this.blockOverrideAllowed = blockOverrideAllowed;
        this.shapingOverrideAllowed = shapingOverrideAllowed;
        this.vendorConfigOverrideAllowed = vendorConfigOverrideAllowed;
        this.livePortMovingAllowed = livePortMovingAllowed;
        this.portConfigResetAtDisconnect = portConfigResetAtDisconnect;
        this.networkResourcePoolOverrideAllowed = networkResourcePoolOverrideAllowed;
        this.trafficFilterOverrideAllowed = trafficFilterOverrideAllowed;
    }


    /**
     * Gets the blockOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @return blockOverrideAllowed
     */
    public boolean isBlockOverrideAllowed() {
        return blockOverrideAllowed;
    }


    /**
     * Sets the blockOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @param blockOverrideAllowed
     */
    public void setBlockOverrideAllowed(boolean blockOverrideAllowed) {
        this.blockOverrideAllowed = blockOverrideAllowed;
    }


    /**
     * Gets the shapingOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @return shapingOverrideAllowed
     */
    public boolean isShapingOverrideAllowed() {
        return shapingOverrideAllowed;
    }


    /**
     * Sets the shapingOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @param shapingOverrideAllowed
     */
    public void setShapingOverrideAllowed(boolean shapingOverrideAllowed) {
        this.shapingOverrideAllowed = shapingOverrideAllowed;
    }


    /**
     * Gets the vendorConfigOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @return vendorConfigOverrideAllowed
     */
    public boolean isVendorConfigOverrideAllowed() {
        return vendorConfigOverrideAllowed;
    }


    /**
     * Sets the vendorConfigOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @param vendorConfigOverrideAllowed
     */
    public void setVendorConfigOverrideAllowed(boolean vendorConfigOverrideAllowed) {
        this.vendorConfigOverrideAllowed = vendorConfigOverrideAllowed;
    }


    /**
     * Gets the livePortMovingAllowed value for this DVPortgroupPolicy.
     * 
     * @return livePortMovingAllowed
     */
    public boolean isLivePortMovingAllowed() {
        return livePortMovingAllowed;
    }


    /**
     * Sets the livePortMovingAllowed value for this DVPortgroupPolicy.
     * 
     * @param livePortMovingAllowed
     */
    public void setLivePortMovingAllowed(boolean livePortMovingAllowed) {
        this.livePortMovingAllowed = livePortMovingAllowed;
    }


    /**
     * Gets the portConfigResetAtDisconnect value for this DVPortgroupPolicy.
     * 
     * @return portConfigResetAtDisconnect
     */
    public boolean isPortConfigResetAtDisconnect() {
        return portConfigResetAtDisconnect;
    }


    /**
     * Sets the portConfigResetAtDisconnect value for this DVPortgroupPolicy.
     * 
     * @param portConfigResetAtDisconnect
     */
    public void setPortConfigResetAtDisconnect(boolean portConfigResetAtDisconnect) {
        this.portConfigResetAtDisconnect = portConfigResetAtDisconnect;
    }


    /**
     * Gets the networkResourcePoolOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @return networkResourcePoolOverrideAllowed
     */
    public java.lang.Boolean getNetworkResourcePoolOverrideAllowed() {
        return networkResourcePoolOverrideAllowed;
    }


    /**
     * Sets the networkResourcePoolOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @param networkResourcePoolOverrideAllowed
     */
    public void setNetworkResourcePoolOverrideAllowed(java.lang.Boolean networkResourcePoolOverrideAllowed) {
        this.networkResourcePoolOverrideAllowed = networkResourcePoolOverrideAllowed;
    }


    /**
     * Gets the trafficFilterOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @return trafficFilterOverrideAllowed
     */
    public java.lang.Boolean getTrafficFilterOverrideAllowed() {
        return trafficFilterOverrideAllowed;
    }


    /**
     * Sets the trafficFilterOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @param trafficFilterOverrideAllowed
     */
    public void setTrafficFilterOverrideAllowed(java.lang.Boolean trafficFilterOverrideAllowed) {
        this.trafficFilterOverrideAllowed = trafficFilterOverrideAllowed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVPortgroupPolicy)) return false;
        DVPortgroupPolicy other = (DVPortgroupPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.blockOverrideAllowed == other.isBlockOverrideAllowed() &&
            this.shapingOverrideAllowed == other.isShapingOverrideAllowed() &&
            this.vendorConfigOverrideAllowed == other.isVendorConfigOverrideAllowed() &&
            this.livePortMovingAllowed == other.isLivePortMovingAllowed() &&
            this.portConfigResetAtDisconnect == other.isPortConfigResetAtDisconnect() &&
            ((this.networkResourcePoolOverrideAllowed==null && other.getNetworkResourcePoolOverrideAllowed()==null) || 
             (this.networkResourcePoolOverrideAllowed!=null &&
              this.networkResourcePoolOverrideAllowed.equals(other.getNetworkResourcePoolOverrideAllowed()))) &&
            ((this.trafficFilterOverrideAllowed==null && other.getTrafficFilterOverrideAllowed()==null) || 
             (this.trafficFilterOverrideAllowed!=null &&
              this.trafficFilterOverrideAllowed.equals(other.getTrafficFilterOverrideAllowed())));
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
        _hashCode += (isBlockOverrideAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShapingOverrideAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVendorConfigOverrideAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLivePortMovingAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPortConfigResetAtDisconnect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNetworkResourcePoolOverrideAllowed() != null) {
            _hashCode += getNetworkResourcePoolOverrideAllowed().hashCode();
        }
        if (getTrafficFilterOverrideAllowed() != null) {
            _hashCode += getTrafficFilterOverrideAllowed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVPortgroupPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortgroupPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockOverrideAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blockOverrideAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shapingOverrideAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shapingOverrideAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorConfigOverrideAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorConfigOverrideAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livePortMovingAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "livePortMovingAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portConfigResetAtDisconnect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portConfigResetAtDisconnect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkResourcePoolOverrideAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkResourcePoolOverrideAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficFilterOverrideAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "trafficFilterOverrideAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
