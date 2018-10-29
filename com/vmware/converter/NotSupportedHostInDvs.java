/**
 * NotSupportedHostInDvs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class NotSupportedHostInDvs  extends com.vmware.converter.NotSupportedHost  implements java.io.Serializable {
    private com.vmware.converter.DistributedVirtualSwitchProductSpec switchProductSpec;

    public NotSupportedHostInDvs() {
    }

    public NotSupportedHostInDvs(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String productName,
           java.lang.String productVersion,
           com.vmware.converter.DistributedVirtualSwitchProductSpec switchProductSpec) {
        super(
            faultCause,
            faultMessage,
            productName,
            productVersion);
        this.switchProductSpec = switchProductSpec;
    }


    /**
     * Gets the switchProductSpec value for this NotSupportedHostInDvs.
     * 
     * @return switchProductSpec
     */
    public com.vmware.converter.DistributedVirtualSwitchProductSpec getSwitchProductSpec() {
        return switchProductSpec;
    }


    /**
     * Sets the switchProductSpec value for this NotSupportedHostInDvs.
     * 
     * @param switchProductSpec
     */
    public void setSwitchProductSpec(com.vmware.converter.DistributedVirtualSwitchProductSpec switchProductSpec) {
        this.switchProductSpec = switchProductSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotSupportedHostInDvs)) return false;
        NotSupportedHostInDvs other = (NotSupportedHostInDvs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.switchProductSpec==null && other.getSwitchProductSpec()==null) || 
             (this.switchProductSpec!=null &&
              this.switchProductSpec.equals(other.getSwitchProductSpec())));
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
        if (getSwitchProductSpec() != null) {
            _hashCode += getSwitchProductSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotSupportedHostInDvs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NotSupportedHostInDvs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchProductSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchProductSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchProductSpec"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
