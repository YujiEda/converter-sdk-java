/**
 * GenericDrsFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GenericDrsFault  extends com.vmware.converter.VimFault  implements java.io.Serializable {
    private com.vmware.converter.LocalizedMethodFault[] hostFaults;

    public GenericDrsFault() {
    }

    public GenericDrsFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.LocalizedMethodFault[] hostFaults) {
        super(
            faultCause,
            faultMessage);
        this.hostFaults = hostFaults;
    }


    /**
     * Gets the hostFaults value for this GenericDrsFault.
     * 
     * @return hostFaults
     */
    public com.vmware.converter.LocalizedMethodFault[] getHostFaults() {
        return hostFaults;
    }


    /**
     * Sets the hostFaults value for this GenericDrsFault.
     * 
     * @param hostFaults
     */
    public void setHostFaults(com.vmware.converter.LocalizedMethodFault[] hostFaults) {
        this.hostFaults = hostFaults;
    }

    public com.vmware.converter.LocalizedMethodFault getHostFaults(int i) {
        return this.hostFaults[i];
    }

    public void setHostFaults(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.hostFaults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenericDrsFault)) return false;
        GenericDrsFault other = (GenericDrsFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostFaults==null && other.getHostFaults()==null) || 
             (this.hostFaults!=null &&
              java.util.Arrays.equals(this.hostFaults, other.getHostFaults())));
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
        if (getHostFaults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostFaults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostFaults(), i);
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
        new org.apache.axis.description.TypeDesc(GenericDrsFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GenericDrsFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostFaults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostFaults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
