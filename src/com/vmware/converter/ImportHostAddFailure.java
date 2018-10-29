/**
 * ImportHostAddFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ImportHostAddFailure  extends com.vmware.converter.DvsFault  implements java.io.Serializable {
    private java.lang.String[] hostIp;

    public ImportHostAddFailure() {
    }

    public ImportHostAddFailure(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String[] hostIp) {
        super(
            faultCause,
            faultMessage);
        this.hostIp = hostIp;
    }


    /**
     * Gets the hostIp value for this ImportHostAddFailure.
     * 
     * @return hostIp
     */
    public java.lang.String[] getHostIp() {
        return hostIp;
    }


    /**
     * Sets the hostIp value for this ImportHostAddFailure.
     * 
     * @param hostIp
     */
    public void setHostIp(java.lang.String[] hostIp) {
        this.hostIp = hostIp;
    }

    public java.lang.String getHostIp(int i) {
        return this.hostIp[i];
    }

    public void setHostIp(int i, java.lang.String _value) {
        this.hostIp[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportHostAddFailure)) return false;
        ImportHostAddFailure other = (ImportHostAddFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostIp==null && other.getHostIp()==null) || 
             (this.hostIp!=null &&
              java.util.Arrays.equals(this.hostIp, other.getHostIp())));
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
        if (getHostIp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostIp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostIp(), i);
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
        new org.apache.axis.description.TypeDesc(ImportHostAddFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ImportHostAddFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
