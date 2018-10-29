/**
 * DvsOperationBulkFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsOperationBulkFault  extends com.vmware.converter.DvsFault  implements java.io.Serializable {
    private com.vmware.converter.DvsOperationBulkFaultFaultOnHost[] hostFault;

    public DvsOperationBulkFault() {
    }

    public DvsOperationBulkFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.DvsOperationBulkFaultFaultOnHost[] hostFault) {
        super(
            faultCause,
            faultMessage);
        this.hostFault = hostFault;
    }


    /**
     * Gets the hostFault value for this DvsOperationBulkFault.
     * 
     * @return hostFault
     */
    public com.vmware.converter.DvsOperationBulkFaultFaultOnHost[] getHostFault() {
        return hostFault;
    }


    /**
     * Sets the hostFault value for this DvsOperationBulkFault.
     * 
     * @param hostFault
     */
    public void setHostFault(com.vmware.converter.DvsOperationBulkFaultFaultOnHost[] hostFault) {
        this.hostFault = hostFault;
    }

    public com.vmware.converter.DvsOperationBulkFaultFaultOnHost getHostFault(int i) {
        return this.hostFault[i];
    }

    public void setHostFault(int i, com.vmware.converter.DvsOperationBulkFaultFaultOnHost _value) {
        this.hostFault[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsOperationBulkFault)) return false;
        DvsOperationBulkFault other = (DvsOperationBulkFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostFault==null && other.getHostFault()==null) || 
             (this.hostFault!=null &&
              java.util.Arrays.equals(this.hostFault, other.getHostFault())));
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
        if (getHostFault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostFault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostFault(), i);
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
        new org.apache.axis.description.TypeDesc(DvsOperationBulkFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsOperationBulkFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostFault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsOperationBulkFaultFaultOnHost"));
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
