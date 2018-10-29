/**
 * ArrayOfVirtualDiskDeltaDiskFormatsSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfVirtualDiskDeltaDiskFormatsSupported  implements java.io.Serializable {
    private com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] virtualDiskDeltaDiskFormatsSupported;

    public ArrayOfVirtualDiskDeltaDiskFormatsSupported() {
    }

    public ArrayOfVirtualDiskDeltaDiskFormatsSupported(
           com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] virtualDiskDeltaDiskFormatsSupported) {
           this.virtualDiskDeltaDiskFormatsSupported = virtualDiskDeltaDiskFormatsSupported;
    }


    /**
     * Gets the virtualDiskDeltaDiskFormatsSupported value for this ArrayOfVirtualDiskDeltaDiskFormatsSupported.
     * 
     * @return virtualDiskDeltaDiskFormatsSupported
     */
    public com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] getVirtualDiskDeltaDiskFormatsSupported() {
        return virtualDiskDeltaDiskFormatsSupported;
    }


    /**
     * Sets the virtualDiskDeltaDiskFormatsSupported value for this ArrayOfVirtualDiskDeltaDiskFormatsSupported.
     * 
     * @param virtualDiskDeltaDiskFormatsSupported
     */
    public void setVirtualDiskDeltaDiskFormatsSupported(com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported[] virtualDiskDeltaDiskFormatsSupported) {
        this.virtualDiskDeltaDiskFormatsSupported = virtualDiskDeltaDiskFormatsSupported;
    }

    public com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported getVirtualDiskDeltaDiskFormatsSupported(int i) {
        return this.virtualDiskDeltaDiskFormatsSupported[i];
    }

    public void setVirtualDiskDeltaDiskFormatsSupported(int i, com.vmware.converter.VirtualDiskDeltaDiskFormatsSupported _value) {
        this.virtualDiskDeltaDiskFormatsSupported[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualDiskDeltaDiskFormatsSupported)) return false;
        ArrayOfVirtualDiskDeltaDiskFormatsSupported other = (ArrayOfVirtualDiskDeltaDiskFormatsSupported) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualDiskDeltaDiskFormatsSupported==null && other.getVirtualDiskDeltaDiskFormatsSupported()==null) || 
             (this.virtualDiskDeltaDiskFormatsSupported!=null &&
              java.util.Arrays.equals(this.virtualDiskDeltaDiskFormatsSupported, other.getVirtualDiskDeltaDiskFormatsSupported())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVirtualDiskDeltaDiskFormatsSupported() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualDiskDeltaDiskFormatsSupported());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualDiskDeltaDiskFormatsSupported(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualDiskDeltaDiskFormatsSupported.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualDiskDeltaDiskFormatsSupported"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDiskDeltaDiskFormatsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskDeltaDiskFormatsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskDeltaDiskFormatsSupported"));
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
