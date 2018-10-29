/**
 * HostFibreChannelOverEthernetHba.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFibreChannelOverEthernetHba  extends com.vmware.converter.HostFibreChannelHba  implements java.io.Serializable {
    private java.lang.String underlyingNic;

    private com.vmware.converter.HostFibreChannelOverEthernetHbaLinkInfo linkInfo;

    private boolean isSoftwareFcoe;

    private boolean markedForRemoval;

    public HostFibreChannelOverEthernetHba() {
    }

    public HostFibreChannelOverEthernetHba(
           java.lang.String key,
           java.lang.String device,
           int bus,
           java.lang.String status,
           java.lang.String model,
           java.lang.String driver,
           java.lang.String pci,
           long portWorldWideName,
           long nodeWorldWideName,
           com.vmware.converter.FibreChannelPortType portType,
           long speed,
           java.lang.String underlyingNic,
           com.vmware.converter.HostFibreChannelOverEthernetHbaLinkInfo linkInfo,
           boolean isSoftwareFcoe,
           boolean markedForRemoval) {
        super(
            key,
            device,
            bus,
            status,
            model,
            driver,
            pci,
            portWorldWideName,
            nodeWorldWideName,
            portType,
            speed);
        this.underlyingNic = underlyingNic;
        this.linkInfo = linkInfo;
        this.isSoftwareFcoe = isSoftwareFcoe;
        this.markedForRemoval = markedForRemoval;
    }


    /**
     * Gets the underlyingNic value for this HostFibreChannelOverEthernetHba.
     * 
     * @return underlyingNic
     */
    public java.lang.String getUnderlyingNic() {
        return underlyingNic;
    }


    /**
     * Sets the underlyingNic value for this HostFibreChannelOverEthernetHba.
     * 
     * @param underlyingNic
     */
    public void setUnderlyingNic(java.lang.String underlyingNic) {
        this.underlyingNic = underlyingNic;
    }


    /**
     * Gets the linkInfo value for this HostFibreChannelOverEthernetHba.
     * 
     * @return linkInfo
     */
    public com.vmware.converter.HostFibreChannelOverEthernetHbaLinkInfo getLinkInfo() {
        return linkInfo;
    }


    /**
     * Sets the linkInfo value for this HostFibreChannelOverEthernetHba.
     * 
     * @param linkInfo
     */
    public void setLinkInfo(com.vmware.converter.HostFibreChannelOverEthernetHbaLinkInfo linkInfo) {
        this.linkInfo = linkInfo;
    }


    /**
     * Gets the isSoftwareFcoe value for this HostFibreChannelOverEthernetHba.
     * 
     * @return isSoftwareFcoe
     */
    public boolean isIsSoftwareFcoe() {
        return isSoftwareFcoe;
    }


    /**
     * Sets the isSoftwareFcoe value for this HostFibreChannelOverEthernetHba.
     * 
     * @param isSoftwareFcoe
     */
    public void setIsSoftwareFcoe(boolean isSoftwareFcoe) {
        this.isSoftwareFcoe = isSoftwareFcoe;
    }


    /**
     * Gets the markedForRemoval value for this HostFibreChannelOverEthernetHba.
     * 
     * @return markedForRemoval
     */
    public boolean isMarkedForRemoval() {
        return markedForRemoval;
    }


    /**
     * Sets the markedForRemoval value for this HostFibreChannelOverEthernetHba.
     * 
     * @param markedForRemoval
     */
    public void setMarkedForRemoval(boolean markedForRemoval) {
        this.markedForRemoval = markedForRemoval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFibreChannelOverEthernetHba)) return false;
        HostFibreChannelOverEthernetHba other = (HostFibreChannelOverEthernetHba) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.underlyingNic==null && other.getUnderlyingNic()==null) || 
             (this.underlyingNic!=null &&
              this.underlyingNic.equals(other.getUnderlyingNic()))) &&
            ((this.linkInfo==null && other.getLinkInfo()==null) || 
             (this.linkInfo!=null &&
              this.linkInfo.equals(other.getLinkInfo()))) &&
            this.isSoftwareFcoe == other.isIsSoftwareFcoe() &&
            this.markedForRemoval == other.isMarkedForRemoval();
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
        if (getUnderlyingNic() != null) {
            _hashCode += getUnderlyingNic().hashCode();
        }
        if (getLinkInfo() != null) {
            _hashCode += getLinkInfo().hashCode();
        }
        _hashCode += (isIsSoftwareFcoe() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMarkedForRemoval() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFibreChannelOverEthernetHba.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFibreChannelOverEthernetHba"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underlyingNic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "underlyingNic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "linkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFibreChannelOverEthernetHbaLinkInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSoftwareFcoe");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isSoftwareFcoe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markedForRemoval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "markedForRemoval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
