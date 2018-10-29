/**
 * VirtualMachineSriovInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineSriovInfo  extends com.vmware.converter.VirtualMachinePciPassthroughInfo  implements java.io.Serializable {
    private boolean virtualFunction;

    private java.lang.String pnic;

    public VirtualMachineSriovInfo() {
    }

    public VirtualMachineSriovInfo(
           java.lang.String name,
           java.lang.String[] configurationTag,
           com.vmware.converter.HostPciDevice pciDevice,
           java.lang.String systemId,
           boolean virtualFunction,
           java.lang.String pnic) {
        super(
            name,
            configurationTag,
            pciDevice,
            systemId);
        this.virtualFunction = virtualFunction;
        this.pnic = pnic;
    }


    /**
     * Gets the virtualFunction value for this VirtualMachineSriovInfo.
     * 
     * @return virtualFunction
     */
    public boolean isVirtualFunction() {
        return virtualFunction;
    }


    /**
     * Sets the virtualFunction value for this VirtualMachineSriovInfo.
     * 
     * @param virtualFunction
     */
    public void setVirtualFunction(boolean virtualFunction) {
        this.virtualFunction = virtualFunction;
    }


    /**
     * Gets the pnic value for this VirtualMachineSriovInfo.
     * 
     * @return pnic
     */
    public java.lang.String getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this VirtualMachineSriovInfo.
     * 
     * @param pnic
     */
    public void setPnic(java.lang.String pnic) {
        this.pnic = pnic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineSriovInfo)) return false;
        VirtualMachineSriovInfo other = (VirtualMachineSriovInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.virtualFunction == other.isVirtualFunction() &&
            ((this.pnic==null && other.getPnic()==null) || 
             (this.pnic!=null &&
              this.pnic.equals(other.getPnic())));
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
        _hashCode += (isVirtualFunction() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPnic() != null) {
            _hashCode += getPnic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineSriovInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSriovInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualFunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
