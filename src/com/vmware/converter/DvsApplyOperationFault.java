/**
 * DvsApplyOperationFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsApplyOperationFault  extends com.vmware.converter.DvsFault  implements java.io.Serializable {
    private com.vmware.converter.DvsApplyOperationFaultFaultOnObject[] objectFault;

    public DvsApplyOperationFault() {
    }

    public DvsApplyOperationFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           com.vmware.converter.DvsApplyOperationFaultFaultOnObject[] objectFault) {
        super(
            faultCause,
            faultMessage);
        this.objectFault = objectFault;
    }


    /**
     * Gets the objectFault value for this DvsApplyOperationFault.
     * 
     * @return objectFault
     */
    public com.vmware.converter.DvsApplyOperationFaultFaultOnObject[] getObjectFault() {
        return objectFault;
    }


    /**
     * Sets the objectFault value for this DvsApplyOperationFault.
     * 
     * @param objectFault
     */
    public void setObjectFault(com.vmware.converter.DvsApplyOperationFaultFaultOnObject[] objectFault) {
        this.objectFault = objectFault;
    }

    public com.vmware.converter.DvsApplyOperationFaultFaultOnObject getObjectFault(int i) {
        return this.objectFault[i];
    }

    public void setObjectFault(int i, com.vmware.converter.DvsApplyOperationFaultFaultOnObject _value) {
        this.objectFault[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsApplyOperationFault)) return false;
        DvsApplyOperationFault other = (DvsApplyOperationFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.objectFault==null && other.getObjectFault()==null) || 
             (this.objectFault!=null &&
              java.util.Arrays.equals(this.objectFault, other.getObjectFault())));
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
        if (getObjectFault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectFault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectFault(), i);
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
        new org.apache.axis.description.TypeDesc(DvsApplyOperationFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsApplyOperationFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectFault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsApplyOperationFaultFaultOnObject"));
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
