/**
 * ConverterServerConversionConversionJobSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerConversionConversionJobSpec  extends com.vmware.converter.ConverterServerJobAbstractConversionBasedJobSpec  implements java.io.Serializable {
    private com.vmware.converter.ConverterServerConversionP2VSourceModificationSpec p2VSourceModificationSpec;

    private com.vmware.converter.ManagedObjectReference parentFolder;

    private java.lang.Boolean synchronizeImmediately;

    private java.util.Calendar synchronizationStartTime;

    public ConverterServerConversionConversionJobSpec() {
    }

    public ConverterServerConversionConversionJobSpec(
           java.lang.String name,
           java.lang.String description,
           java.util.Calendar firstRun,
           java.lang.Boolean startSuspended,
           com.vmware.converter.ConverterComputerSpec source,
           com.vmware.converter.ConverterConversionParams conversionParams,
           com.vmware.converter.ConverterServerConversionP2VSourceModificationSpec p2VSourceModificationSpec,
           com.vmware.converter.ManagedObjectReference parentFolder,
           java.lang.Boolean synchronizeImmediately,
           java.util.Calendar synchronizationStartTime) {
        super(
            name,
            description,
            firstRun,
            startSuspended,
            source,
            conversionParams);
        this.p2VSourceModificationSpec = p2VSourceModificationSpec;
        this.parentFolder = parentFolder;
        this.synchronizeImmediately = synchronizeImmediately;
        this.synchronizationStartTime = synchronizationStartTime;
    }


    /**
     * Gets the p2VSourceModificationSpec value for this ConverterServerConversionConversionJobSpec.
     * 
     * @return p2VSourceModificationSpec
     */
    public com.vmware.converter.ConverterServerConversionP2VSourceModificationSpec getP2VSourceModificationSpec() {
        return p2VSourceModificationSpec;
    }


    /**
     * Sets the p2VSourceModificationSpec value for this ConverterServerConversionConversionJobSpec.
     * 
     * @param p2VSourceModificationSpec
     */
    public void setP2VSourceModificationSpec(com.vmware.converter.ConverterServerConversionP2VSourceModificationSpec p2VSourceModificationSpec) {
        this.p2VSourceModificationSpec = p2VSourceModificationSpec;
    }


    /**
     * Gets the parentFolder value for this ConverterServerConversionConversionJobSpec.
     * 
     * @return parentFolder
     */
    public com.vmware.converter.ManagedObjectReference getParentFolder() {
        return parentFolder;
    }


    /**
     * Sets the parentFolder value for this ConverterServerConversionConversionJobSpec.
     * 
     * @param parentFolder
     */
    public void setParentFolder(com.vmware.converter.ManagedObjectReference parentFolder) {
        this.parentFolder = parentFolder;
    }


    /**
     * Gets the synchronizeImmediately value for this ConverterServerConversionConversionJobSpec.
     * 
     * @return synchronizeImmediately
     */
    public java.lang.Boolean getSynchronizeImmediately() {
        return synchronizeImmediately;
    }


    /**
     * Sets the synchronizeImmediately value for this ConverterServerConversionConversionJobSpec.
     * 
     * @param synchronizeImmediately
     */
    public void setSynchronizeImmediately(java.lang.Boolean synchronizeImmediately) {
        this.synchronizeImmediately = synchronizeImmediately;
    }


    /**
     * Gets the synchronizationStartTime value for this ConverterServerConversionConversionJobSpec.
     * 
     * @return synchronizationStartTime
     */
    public java.util.Calendar getSynchronizationStartTime() {
        return synchronizationStartTime;
    }


    /**
     * Sets the synchronizationStartTime value for this ConverterServerConversionConversionJobSpec.
     * 
     * @param synchronizationStartTime
     */
    public void setSynchronizationStartTime(java.util.Calendar synchronizationStartTime) {
        this.synchronizationStartTime = synchronizationStartTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerConversionConversionJobSpec)) return false;
        ConverterServerConversionConversionJobSpec other = (ConverterServerConversionConversionJobSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.p2VSourceModificationSpec==null && other.getP2VSourceModificationSpec()==null) || 
             (this.p2VSourceModificationSpec!=null &&
              this.p2VSourceModificationSpec.equals(other.getP2VSourceModificationSpec()))) &&
            ((this.parentFolder==null && other.getParentFolder()==null) || 
             (this.parentFolder!=null &&
              this.parentFolder.equals(other.getParentFolder()))) &&
            ((this.synchronizeImmediately==null && other.getSynchronizeImmediately()==null) || 
             (this.synchronizeImmediately!=null &&
              this.synchronizeImmediately.equals(other.getSynchronizeImmediately()))) &&
            ((this.synchronizationStartTime==null && other.getSynchronizationStartTime()==null) || 
             (this.synchronizationStartTime!=null &&
              this.synchronizationStartTime.equals(other.getSynchronizationStartTime())));
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
        if (getP2VSourceModificationSpec() != null) {
            _hashCode += getP2VSourceModificationSpec().hashCode();
        }
        if (getParentFolder() != null) {
            _hashCode += getParentFolder().hashCode();
        }
        if (getSynchronizeImmediately() != null) {
            _hashCode += getSynchronizeImmediately().hashCode();
        }
        if (getSynchronizationStartTime() != null) {
            _hashCode += getSynchronizationStartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerConversionConversionJobSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionConversionJobSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p2VSourceModificationSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "p2vSourceModificationSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionP2VSourceModificationSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "parentFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronizeImmediately");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "synchronizeImmediately"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronizationStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "synchronizationStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
