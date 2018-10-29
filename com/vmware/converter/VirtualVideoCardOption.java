/**
 * VirtualVideoCardOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualVideoCardOption  extends com.vmware.converter.VirtualDeviceOption  implements java.io.Serializable {
    private com.vmware.converter.LongOption videoRamSizeInKB;

    private com.vmware.converter.IntOption numDisplays;

    private com.vmware.converter.BoolOption useAutoDetect;

    private com.vmware.converter.BoolOption support3D;

    private com.vmware.converter.BoolOption use3DRendererSupported;

    private com.vmware.converter.LongOption graphicsMemorySizeInKB;

    private com.vmware.converter.BoolOption graphicsMemorySizeSupported;

    public VirtualVideoCardOption() {
    }

    public VirtualVideoCardOption(
           java.lang.String type,
           com.vmware.converter.VirtualDeviceConnectOption connectOption,
           com.vmware.converter.VirtualDeviceBusSlotOption busSlotOption,
           java.lang.String controllerType,
           com.vmware.converter.BoolOption autoAssignController,
           com.vmware.converter.VirtualDeviceBackingOption[] backingOption,
           java.lang.Integer defaultBackingOptionIndex,
           java.lang.String[] licensingLimit,
           boolean deprecated,
           boolean plugAndPlay,
           java.lang.Boolean hotRemoveSupported,
           com.vmware.converter.LongOption videoRamSizeInKB,
           com.vmware.converter.IntOption numDisplays,
           com.vmware.converter.BoolOption useAutoDetect,
           com.vmware.converter.BoolOption support3D,
           com.vmware.converter.BoolOption use3DRendererSupported,
           com.vmware.converter.LongOption graphicsMemorySizeInKB,
           com.vmware.converter.BoolOption graphicsMemorySizeSupported) {
        super(
            type,
            connectOption,
            busSlotOption,
            controllerType,
            autoAssignController,
            backingOption,
            defaultBackingOptionIndex,
            licensingLimit,
            deprecated,
            plugAndPlay,
            hotRemoveSupported);
        this.videoRamSizeInKB = videoRamSizeInKB;
        this.numDisplays = numDisplays;
        this.useAutoDetect = useAutoDetect;
        this.support3D = support3D;
        this.use3DRendererSupported = use3DRendererSupported;
        this.graphicsMemorySizeInKB = graphicsMemorySizeInKB;
        this.graphicsMemorySizeSupported = graphicsMemorySizeSupported;
    }


    /**
     * Gets the videoRamSizeInKB value for this VirtualVideoCardOption.
     * 
     * @return videoRamSizeInKB
     */
    public com.vmware.converter.LongOption getVideoRamSizeInKB() {
        return videoRamSizeInKB;
    }


    /**
     * Sets the videoRamSizeInKB value for this VirtualVideoCardOption.
     * 
     * @param videoRamSizeInKB
     */
    public void setVideoRamSizeInKB(com.vmware.converter.LongOption videoRamSizeInKB) {
        this.videoRamSizeInKB = videoRamSizeInKB;
    }


    /**
     * Gets the numDisplays value for this VirtualVideoCardOption.
     * 
     * @return numDisplays
     */
    public com.vmware.converter.IntOption getNumDisplays() {
        return numDisplays;
    }


    /**
     * Sets the numDisplays value for this VirtualVideoCardOption.
     * 
     * @param numDisplays
     */
    public void setNumDisplays(com.vmware.converter.IntOption numDisplays) {
        this.numDisplays = numDisplays;
    }


    /**
     * Gets the useAutoDetect value for this VirtualVideoCardOption.
     * 
     * @return useAutoDetect
     */
    public com.vmware.converter.BoolOption getUseAutoDetect() {
        return useAutoDetect;
    }


    /**
     * Sets the useAutoDetect value for this VirtualVideoCardOption.
     * 
     * @param useAutoDetect
     */
    public void setUseAutoDetect(com.vmware.converter.BoolOption useAutoDetect) {
        this.useAutoDetect = useAutoDetect;
    }


    /**
     * Gets the support3D value for this VirtualVideoCardOption.
     * 
     * @return support3D
     */
    public com.vmware.converter.BoolOption getSupport3D() {
        return support3D;
    }


    /**
     * Sets the support3D value for this VirtualVideoCardOption.
     * 
     * @param support3D
     */
    public void setSupport3D(com.vmware.converter.BoolOption support3D) {
        this.support3D = support3D;
    }


    /**
     * Gets the use3DRendererSupported value for this VirtualVideoCardOption.
     * 
     * @return use3DRendererSupported
     */
    public com.vmware.converter.BoolOption getUse3DRendererSupported() {
        return use3DRendererSupported;
    }


    /**
     * Sets the use3DRendererSupported value for this VirtualVideoCardOption.
     * 
     * @param use3DRendererSupported
     */
    public void setUse3DRendererSupported(com.vmware.converter.BoolOption use3DRendererSupported) {
        this.use3DRendererSupported = use3DRendererSupported;
    }


    /**
     * Gets the graphicsMemorySizeInKB value for this VirtualVideoCardOption.
     * 
     * @return graphicsMemorySizeInKB
     */
    public com.vmware.converter.LongOption getGraphicsMemorySizeInKB() {
        return graphicsMemorySizeInKB;
    }


    /**
     * Sets the graphicsMemorySizeInKB value for this VirtualVideoCardOption.
     * 
     * @param graphicsMemorySizeInKB
     */
    public void setGraphicsMemorySizeInKB(com.vmware.converter.LongOption graphicsMemorySizeInKB) {
        this.graphicsMemorySizeInKB = graphicsMemorySizeInKB;
    }


    /**
     * Gets the graphicsMemorySizeSupported value for this VirtualVideoCardOption.
     * 
     * @return graphicsMemorySizeSupported
     */
    public com.vmware.converter.BoolOption getGraphicsMemorySizeSupported() {
        return graphicsMemorySizeSupported;
    }


    /**
     * Sets the graphicsMemorySizeSupported value for this VirtualVideoCardOption.
     * 
     * @param graphicsMemorySizeSupported
     */
    public void setGraphicsMemorySizeSupported(com.vmware.converter.BoolOption graphicsMemorySizeSupported) {
        this.graphicsMemorySizeSupported = graphicsMemorySizeSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualVideoCardOption)) return false;
        VirtualVideoCardOption other = (VirtualVideoCardOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.videoRamSizeInKB==null && other.getVideoRamSizeInKB()==null) || 
             (this.videoRamSizeInKB!=null &&
              this.videoRamSizeInKB.equals(other.getVideoRamSizeInKB()))) &&
            ((this.numDisplays==null && other.getNumDisplays()==null) || 
             (this.numDisplays!=null &&
              this.numDisplays.equals(other.getNumDisplays()))) &&
            ((this.useAutoDetect==null && other.getUseAutoDetect()==null) || 
             (this.useAutoDetect!=null &&
              this.useAutoDetect.equals(other.getUseAutoDetect()))) &&
            ((this.support3D==null && other.getSupport3D()==null) || 
             (this.support3D!=null &&
              this.support3D.equals(other.getSupport3D()))) &&
            ((this.use3DRendererSupported==null && other.getUse3DRendererSupported()==null) || 
             (this.use3DRendererSupported!=null &&
              this.use3DRendererSupported.equals(other.getUse3DRendererSupported()))) &&
            ((this.graphicsMemorySizeInKB==null && other.getGraphicsMemorySizeInKB()==null) || 
             (this.graphicsMemorySizeInKB!=null &&
              this.graphicsMemorySizeInKB.equals(other.getGraphicsMemorySizeInKB()))) &&
            ((this.graphicsMemorySizeSupported==null && other.getGraphicsMemorySizeSupported()==null) || 
             (this.graphicsMemorySizeSupported!=null &&
              this.graphicsMemorySizeSupported.equals(other.getGraphicsMemorySizeSupported())));
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
        if (getVideoRamSizeInKB() != null) {
            _hashCode += getVideoRamSizeInKB().hashCode();
        }
        if (getNumDisplays() != null) {
            _hashCode += getNumDisplays().hashCode();
        }
        if (getUseAutoDetect() != null) {
            _hashCode += getUseAutoDetect().hashCode();
        }
        if (getSupport3D() != null) {
            _hashCode += getSupport3D().hashCode();
        }
        if (getUse3DRendererSupported() != null) {
            _hashCode += getUse3DRendererSupported().hashCode();
        }
        if (getGraphicsMemorySizeInKB() != null) {
            _hashCode += getGraphicsMemorySizeInKB().hashCode();
        }
        if (getGraphicsMemorySizeSupported() != null) {
            _hashCode += getGraphicsMemorySizeSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualVideoCardOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualVideoCardOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoRamSizeInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "videoRamSizeInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDisplays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numDisplays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useAutoDetect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "useAutoDetect"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support3D");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "support3D"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use3DRendererSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "use3dRendererSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphicsMemorySizeInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "graphicsMemorySizeInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LongOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphicsMemorySizeSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "graphicsMemorySizeSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
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
