/**
 * ConverterReconfigPrerequisites.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterReconfigPrerequisites  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo[] hotfix;

    private com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo[] file;

    public ConverterReconfigPrerequisites() {
    }

    public ConverterReconfigPrerequisites(
           com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo[] hotfix,
           com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo[] file) {
        this.hotfix = hotfix;
        this.file = file;
    }


    /**
     * Gets the hotfix value for this ConverterReconfigPrerequisites.
     * 
     * @return hotfix
     */
    public com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo[] getHotfix() {
        return hotfix;
    }


    /**
     * Sets the hotfix value for this ConverterReconfigPrerequisites.
     * 
     * @param hotfix
     */
    public void setHotfix(com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo[] hotfix) {
        this.hotfix = hotfix;
    }

    public com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo getHotfix(int i) {
        return this.hotfix[i];
    }

    public void setHotfix(int i, com.vmware.converter.ConverterReconfigPrerequisitesHotfixInfo _value) {
        this.hotfix[i] = _value;
    }


    /**
     * Gets the file value for this ConverterReconfigPrerequisites.
     * 
     * @return file
     */
    public com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo[] getFile() {
        return file;
    }


    /**
     * Sets the file value for this ConverterReconfigPrerequisites.
     * 
     * @param file
     */
    public void setFile(com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo[] file) {
        this.file = file;
    }

    public com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo getFile(int i) {
        return this.file[i];
    }

    public void setFile(int i, com.vmware.converter.ConverterReconfigPrerequisitesFileToUpdateInfo _value) {
        this.file[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterReconfigPrerequisites)) return false;
        ConverterReconfigPrerequisites other = (ConverterReconfigPrerequisites) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hotfix==null && other.getHotfix()==null) || 
             (this.hotfix!=null &&
              java.util.Arrays.equals(this.hotfix, other.getHotfix()))) &&
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              java.util.Arrays.equals(this.file, other.getFile())));
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
        if (getHotfix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHotfix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHotfix(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFile(), i);
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
        new org.apache.axis.description.TypeDesc(ConverterReconfigPrerequisites.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisites"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotfix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "hotfix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisitesHotfixInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterReconfigPrerequisitesFileToUpdateInfo"));
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
