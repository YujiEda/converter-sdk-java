/**
 * FailToEnableSPBM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FailToEnableSPBM  extends com.vmware.converter.NotEnoughLicenses  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference cs;

    private java.lang.String csName;

    private com.vmware.converter.ComputeResourceHostSPBMLicenseInfo[] hostLicenseStates;

    public FailToEnableSPBM() {
    }

    public FailToEnableSPBM(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.ManagedObjectReference cs,
           java.lang.String csName,
           com.vmware.converter.ComputeResourceHostSPBMLicenseInfo[] hostLicenseStates) {
        super(
            faultCause,
            faultMessage);
        this.cs = cs;
        this.csName = csName;
        this.hostLicenseStates = hostLicenseStates;
    }


    /**
     * Gets the cs value for this FailToEnableSPBM.
     * 
     * @return cs
     */
    public com.vmware.converter.ManagedObjectReference getCs() {
        return cs;
    }


    /**
     * Sets the cs value for this FailToEnableSPBM.
     * 
     * @param cs
     */
    public void setCs(com.vmware.converter.ManagedObjectReference cs) {
        this.cs = cs;
    }


    /**
     * Gets the csName value for this FailToEnableSPBM.
     * 
     * @return csName
     */
    public java.lang.String getCsName() {
        return csName;
    }


    /**
     * Sets the csName value for this FailToEnableSPBM.
     * 
     * @param csName
     */
    public void setCsName(java.lang.String csName) {
        this.csName = csName;
    }


    /**
     * Gets the hostLicenseStates value for this FailToEnableSPBM.
     * 
     * @return hostLicenseStates
     */
    public com.vmware.converter.ComputeResourceHostSPBMLicenseInfo[] getHostLicenseStates() {
        return hostLicenseStates;
    }


    /**
     * Sets the hostLicenseStates value for this FailToEnableSPBM.
     * 
     * @param hostLicenseStates
     */
    public void setHostLicenseStates(com.vmware.converter.ComputeResourceHostSPBMLicenseInfo[] hostLicenseStates) {
        this.hostLicenseStates = hostLicenseStates;
    }

    public com.vmware.converter.ComputeResourceHostSPBMLicenseInfo getHostLicenseStates(int i) {
        return this.hostLicenseStates[i];
    }

    public void setHostLicenseStates(int i, com.vmware.converter.ComputeResourceHostSPBMLicenseInfo _value) {
        this.hostLicenseStates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailToEnableSPBM)) return false;
        FailToEnableSPBM other = (FailToEnableSPBM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cs==null && other.getCs()==null) || 
             (this.cs!=null &&
              this.cs.equals(other.getCs()))) &&
            ((this.csName==null && other.getCsName()==null) || 
             (this.csName!=null &&
              this.csName.equals(other.getCsName()))) &&
            ((this.hostLicenseStates==null && other.getHostLicenseStates()==null) || 
             (this.hostLicenseStates!=null &&
              java.util.Arrays.equals(this.hostLicenseStates, other.getHostLicenseStates())));
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
        if (getCs() != null) {
            _hashCode += getCs().hashCode();
        }
        if (getCsName() != null) {
            _hashCode += getCsName().hashCode();
        }
        if (getHostLicenseStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostLicenseStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostLicenseStates(), i);
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
        new org.apache.axis.description.TypeDesc(FailToEnableSPBM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FailToEnableSPBM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "csName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostLicenseStates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostLicenseStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComputeResourceHostSPBMLicenseInfo"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
