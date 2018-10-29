/**
 * ArrayOfHostService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfHostService  implements java.io.Serializable {
    private com.vmware.converter.HostService[] hostService;

    public ArrayOfHostService() {
    }

    public ArrayOfHostService(
           com.vmware.converter.HostService[] hostService) {
           this.hostService = hostService;
    }


    /**
     * Gets the hostService value for this ArrayOfHostService.
     * 
     * @return hostService
     */
    public com.vmware.converter.HostService[] getHostService() {
        return hostService;
    }


    /**
     * Sets the hostService value for this ArrayOfHostService.
     * 
     * @param hostService
     */
    public void setHostService(com.vmware.converter.HostService[] hostService) {
        this.hostService = hostService;
    }

    public com.vmware.converter.HostService getHostService(int i) {
        return this.hostService[i];
    }

    public void setHostService(int i, com.vmware.converter.HostService _value) {
        this.hostService[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostService)) return false;
        ArrayOfHostService other = (ArrayOfHostService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostService==null && other.getHostService()==null) || 
             (this.hostService!=null &&
              java.util.Arrays.equals(this.hostService, other.getHostService())));
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
        if (getHostService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostService(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostService"));
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
