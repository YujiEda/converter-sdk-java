/**
 * InvalidDeviceOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InvalidDeviceOperation  extends com.vmware.converter.InvalidDeviceSpec  implements java.io.Serializable {
    private com.vmware.converter.VirtualDeviceConfigSpecOperation badOp;

    private com.vmware.converter.VirtualDeviceConfigSpecFileOperation badFileOp;

    public InvalidDeviceOperation() {
    }

    public InvalidDeviceOperation(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String property,
           int deviceIndex,
           com.vmware.converter.VirtualDeviceConfigSpecOperation badOp,
           com.vmware.converter.VirtualDeviceConfigSpecFileOperation badFileOp) {
        super(
            faultCause,
            faultMessage,
            property,
            deviceIndex);
        this.badOp = badOp;
        this.badFileOp = badFileOp;
    }


    /**
     * Gets the badOp value for this InvalidDeviceOperation.
     * 
     * @return badOp
     */
    public com.vmware.converter.VirtualDeviceConfigSpecOperation getBadOp() {
        return badOp;
    }


    /**
     * Sets the badOp value for this InvalidDeviceOperation.
     * 
     * @param badOp
     */
    public void setBadOp(com.vmware.converter.VirtualDeviceConfigSpecOperation badOp) {
        this.badOp = badOp;
    }


    /**
     * Gets the badFileOp value for this InvalidDeviceOperation.
     * 
     * @return badFileOp
     */
    public com.vmware.converter.VirtualDeviceConfigSpecFileOperation getBadFileOp() {
        return badFileOp;
    }


    /**
     * Sets the badFileOp value for this InvalidDeviceOperation.
     * 
     * @param badFileOp
     */
    public void setBadFileOp(com.vmware.converter.VirtualDeviceConfigSpecFileOperation badFileOp) {
        this.badFileOp = badFileOp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidDeviceOperation)) return false;
        InvalidDeviceOperation other = (InvalidDeviceOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.badOp==null && other.getBadOp()==null) || 
             (this.badOp!=null &&
              this.badOp.equals(other.getBadOp()))) &&
            ((this.badFileOp==null && other.getBadFileOp()==null) || 
             (this.badFileOp!=null &&
              this.badFileOp.equals(other.getBadFileOp())));
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
        if (getBadOp() != null) {
            _hashCode += getBadOp().hashCode();
        }
        if (getBadFileOp() != null) {
            _hashCode += getBadFileOp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvalidDeviceOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InvalidDeviceOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badOp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "badOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpecOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badFileOp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "badFileOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpecFileOperation"));
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
