/**
 * EVCAdmissionFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class EVCAdmissionFailed  extends com.vmware.converter.NotSupportedHostInCluster  implements java.io.Serializable {
    private com.vmware.converter.LocalizedMethodFault[] faults;

    public EVCAdmissionFailed() {
    }

    public EVCAdmissionFailed(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String productName,
           java.lang.String productVersion,
           com.vmware.converter.LocalizedMethodFault[] faults) {
        super(
            faultCause,
            faultMessage,
            productName,
            productVersion);
        this.faults = faults;
    }


    /**
     * Gets the faults value for this EVCAdmissionFailed.
     * 
     * @return faults
     */
    public com.vmware.converter.LocalizedMethodFault[] getFaults() {
        return faults;
    }


    /**
     * Sets the faults value for this EVCAdmissionFailed.
     * 
     * @param faults
     */
    public void setFaults(com.vmware.converter.LocalizedMethodFault[] faults) {
        this.faults = faults;
    }

    public com.vmware.converter.LocalizedMethodFault getFaults(int i) {
        return this.faults[i];
    }

    public void setFaults(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.faults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVCAdmissionFailed)) return false;
        EVCAdmissionFailed other = (EVCAdmissionFailed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.faults==null && other.getFaults()==null) || 
             (this.faults!=null &&
              java.util.Arrays.equals(this.faults, other.getFaults())));
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
        if (getFaults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaults(), i);
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
        new org.apache.axis.description.TypeDesc(EVCAdmissionFailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCAdmissionFailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faults"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
