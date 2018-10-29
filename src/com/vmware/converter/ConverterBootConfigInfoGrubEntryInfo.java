/**
 * ConverterBootConfigInfoGrubEntryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterBootConfigInfoGrubEntryInfo  extends com.vmware.converter.ConverterBootConfigInfoBootLoaderEntryInfo  implements java.io.Serializable {
    private java.lang.String rootDisk;

    private java.lang.String kernel;

    private java.lang.String initrd;

    public ConverterBootConfigInfoGrubEntryInfo() {
    }

    public ConverterBootConfigInfoGrubEntryInfo(
           int entryNumber,
           boolean defaultEntry,
           java.lang.String title,
           java.lang.String rootDisk,
           java.lang.String kernel,
           java.lang.String initrd) {
        super(
            entryNumber,
            defaultEntry,
            title);
        this.rootDisk = rootDisk;
        this.kernel = kernel;
        this.initrd = initrd;
    }


    /**
     * Gets the rootDisk value for this ConverterBootConfigInfoGrubEntryInfo.
     * 
     * @return rootDisk
     */
    public java.lang.String getRootDisk() {
        return rootDisk;
    }


    /**
     * Sets the rootDisk value for this ConverterBootConfigInfoGrubEntryInfo.
     * 
     * @param rootDisk
     */
    public void setRootDisk(java.lang.String rootDisk) {
        this.rootDisk = rootDisk;
    }


    /**
     * Gets the kernel value for this ConverterBootConfigInfoGrubEntryInfo.
     * 
     * @return kernel
     */
    public java.lang.String getKernel() {
        return kernel;
    }


    /**
     * Sets the kernel value for this ConverterBootConfigInfoGrubEntryInfo.
     * 
     * @param kernel
     */
    public void setKernel(java.lang.String kernel) {
        this.kernel = kernel;
    }


    /**
     * Gets the initrd value for this ConverterBootConfigInfoGrubEntryInfo.
     * 
     * @return initrd
     */
    public java.lang.String getInitrd() {
        return initrd;
    }


    /**
     * Sets the initrd value for this ConverterBootConfigInfoGrubEntryInfo.
     * 
     * @param initrd
     */
    public void setInitrd(java.lang.String initrd) {
        this.initrd = initrd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterBootConfigInfoGrubEntryInfo)) return false;
        ConverterBootConfigInfoGrubEntryInfo other = (ConverterBootConfigInfoGrubEntryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rootDisk==null && other.getRootDisk()==null) || 
             (this.rootDisk!=null &&
              this.rootDisk.equals(other.getRootDisk()))) &&
            ((this.kernel==null && other.getKernel()==null) || 
             (this.kernel!=null &&
              this.kernel.equals(other.getKernel()))) &&
            ((this.initrd==null && other.getInitrd()==null) || 
             (this.initrd!=null &&
              this.initrd.equals(other.getInitrd())));
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
        if (getRootDisk() != null) {
            _hashCode += getRootDisk().hashCode();
        }
        if (getKernel() != null) {
            _hashCode += getKernel().hashCode();
        }
        if (getInitrd() != null) {
            _hashCode += getInitrd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterBootConfigInfoGrubEntryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBootConfigInfoGrubEntryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "rootDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kernel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "kernel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initrd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "initrd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
