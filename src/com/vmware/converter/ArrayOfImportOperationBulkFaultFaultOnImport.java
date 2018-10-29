/**
 * ArrayOfImportOperationBulkFaultFaultOnImport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ArrayOfImportOperationBulkFaultFaultOnImport  implements java.io.Serializable {
    private com.vmware.converter.ImportOperationBulkFaultFaultOnImport[] importOperationBulkFaultFaultOnImport;

    public ArrayOfImportOperationBulkFaultFaultOnImport() {
    }

    public ArrayOfImportOperationBulkFaultFaultOnImport(
           com.vmware.converter.ImportOperationBulkFaultFaultOnImport[] importOperationBulkFaultFaultOnImport) {
           this.importOperationBulkFaultFaultOnImport = importOperationBulkFaultFaultOnImport;
    }


    /**
     * Gets the importOperationBulkFaultFaultOnImport value for this ArrayOfImportOperationBulkFaultFaultOnImport.
     * 
     * @return importOperationBulkFaultFaultOnImport
     */
    public com.vmware.converter.ImportOperationBulkFaultFaultOnImport[] getImportOperationBulkFaultFaultOnImport() {
        return importOperationBulkFaultFaultOnImport;
    }


    /**
     * Sets the importOperationBulkFaultFaultOnImport value for this ArrayOfImportOperationBulkFaultFaultOnImport.
     * 
     * @param importOperationBulkFaultFaultOnImport
     */
    public void setImportOperationBulkFaultFaultOnImport(com.vmware.converter.ImportOperationBulkFaultFaultOnImport[] importOperationBulkFaultFaultOnImport) {
        this.importOperationBulkFaultFaultOnImport = importOperationBulkFaultFaultOnImport;
    }

    public com.vmware.converter.ImportOperationBulkFaultFaultOnImport getImportOperationBulkFaultFaultOnImport(int i) {
        return this.importOperationBulkFaultFaultOnImport[i];
    }

    public void setImportOperationBulkFaultFaultOnImport(int i, com.vmware.converter.ImportOperationBulkFaultFaultOnImport _value) {
        this.importOperationBulkFaultFaultOnImport[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfImportOperationBulkFaultFaultOnImport)) return false;
        ArrayOfImportOperationBulkFaultFaultOnImport other = (ArrayOfImportOperationBulkFaultFaultOnImport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.importOperationBulkFaultFaultOnImport==null && other.getImportOperationBulkFaultFaultOnImport()==null) || 
             (this.importOperationBulkFaultFaultOnImport!=null &&
              java.util.Arrays.equals(this.importOperationBulkFaultFaultOnImport, other.getImportOperationBulkFaultFaultOnImport())));
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
        if (getImportOperationBulkFaultFaultOnImport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImportOperationBulkFaultFaultOnImport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImportOperationBulkFaultFaultOnImport(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfImportOperationBulkFaultFaultOnImport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfImportOperationBulkFaultFaultOnImport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importOperationBulkFaultFaultOnImport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ImportOperationBulkFaultFaultOnImport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ImportOperationBulkFaultFaultOnImport"));
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
