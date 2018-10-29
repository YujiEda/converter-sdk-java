/**
 * ConverterStorageParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterStorageParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String cloningMode;

    private java.lang.String diskControllerType;

    private com.vmware.converter.ConverterStorageParamsTargetDiskParams[] targetDiskParams;

    private java.lang.Boolean skipUnwantedFiles;

    private java.lang.String vmxDatastoreName;

    private java.lang.Integer resizeRatio;

    private java.lang.Long minVolumeSize;

    private java.lang.Boolean optimizedPartitionAlignment;

    public ConverterStorageParams() {
    }

    public ConverterStorageParams(
           java.lang.String cloningMode,
           java.lang.String diskControllerType,
           com.vmware.converter.ConverterStorageParamsTargetDiskParams[] targetDiskParams,
           java.lang.Boolean skipUnwantedFiles,
           java.lang.String vmxDatastoreName,
           java.lang.Integer resizeRatio,
           java.lang.Long minVolumeSize,
           java.lang.Boolean optimizedPartitionAlignment) {
        this.cloningMode = cloningMode;
        this.diskControllerType = diskControllerType;
        this.targetDiskParams = targetDiskParams;
        this.skipUnwantedFiles = skipUnwantedFiles;
        this.vmxDatastoreName = vmxDatastoreName;
        this.resizeRatio = resizeRatio;
        this.minVolumeSize = minVolumeSize;
        this.optimizedPartitionAlignment = optimizedPartitionAlignment;
    }


    /**
     * Gets the cloningMode value for this ConverterStorageParams.
     * 
     * @return cloningMode
     */
    public java.lang.String getCloningMode() {
        return cloningMode;
    }


    /**
     * Sets the cloningMode value for this ConverterStorageParams.
     * 
     * @param cloningMode
     */
    public void setCloningMode(java.lang.String cloningMode) {
        this.cloningMode = cloningMode;
    }


    /**
     * Gets the diskControllerType value for this ConverterStorageParams.
     * 
     * @return diskControllerType
     */
    public java.lang.String getDiskControllerType() {
        return diskControllerType;
    }


    /**
     * Sets the diskControllerType value for this ConverterStorageParams.
     * 
     * @param diskControllerType
     */
    public void setDiskControllerType(java.lang.String diskControllerType) {
        this.diskControllerType = diskControllerType;
    }


    /**
     * Gets the targetDiskParams value for this ConverterStorageParams.
     * 
     * @return targetDiskParams
     */
    public com.vmware.converter.ConverterStorageParamsTargetDiskParams[] getTargetDiskParams() {
        return targetDiskParams;
    }


    /**
     * Sets the targetDiskParams value for this ConverterStorageParams.
     * 
     * @param targetDiskParams
     */
    public void setTargetDiskParams(com.vmware.converter.ConverterStorageParamsTargetDiskParams[] targetDiskParams) {
        this.targetDiskParams = targetDiskParams;
    }

    public com.vmware.converter.ConverterStorageParamsTargetDiskParams getTargetDiskParams(int i) {
        return this.targetDiskParams[i];
    }

    public void setTargetDiskParams(int i, com.vmware.converter.ConverterStorageParamsTargetDiskParams _value) {
        this.targetDiskParams[i] = _value;
    }


    /**
     * Gets the skipUnwantedFiles value for this ConverterStorageParams.
     * 
     * @return skipUnwantedFiles
     */
    public java.lang.Boolean getSkipUnwantedFiles() {
        return skipUnwantedFiles;
    }


    /**
     * Sets the skipUnwantedFiles value for this ConverterStorageParams.
     * 
     * @param skipUnwantedFiles
     */
    public void setSkipUnwantedFiles(java.lang.Boolean skipUnwantedFiles) {
        this.skipUnwantedFiles = skipUnwantedFiles;
    }


    /**
     * Gets the vmxDatastoreName value for this ConverterStorageParams.
     * 
     * @return vmxDatastoreName
     */
    public java.lang.String getVmxDatastoreName() {
        return vmxDatastoreName;
    }


    /**
     * Sets the vmxDatastoreName value for this ConverterStorageParams.
     * 
     * @param vmxDatastoreName
     */
    public void setVmxDatastoreName(java.lang.String vmxDatastoreName) {
        this.vmxDatastoreName = vmxDatastoreName;
    }


    /**
     * Gets the resizeRatio value for this ConverterStorageParams.
     * 
     * @return resizeRatio
     */
    public java.lang.Integer getResizeRatio() {
        return resizeRatio;
    }


    /**
     * Sets the resizeRatio value for this ConverterStorageParams.
     * 
     * @param resizeRatio
     */
    public void setResizeRatio(java.lang.Integer resizeRatio) {
        this.resizeRatio = resizeRatio;
    }


    /**
     * Gets the minVolumeSize value for this ConverterStorageParams.
     * 
     * @return minVolumeSize
     */
    public java.lang.Long getMinVolumeSize() {
        return minVolumeSize;
    }


    /**
     * Sets the minVolumeSize value for this ConverterStorageParams.
     * 
     * @param minVolumeSize
     */
    public void setMinVolumeSize(java.lang.Long minVolumeSize) {
        this.minVolumeSize = minVolumeSize;
    }


    /**
     * Gets the optimizedPartitionAlignment value for this ConverterStorageParams.
     * 
     * @return optimizedPartitionAlignment
     */
    public java.lang.Boolean getOptimizedPartitionAlignment() {
        return optimizedPartitionAlignment;
    }


    /**
     * Sets the optimizedPartitionAlignment value for this ConverterStorageParams.
     * 
     * @param optimizedPartitionAlignment
     */
    public void setOptimizedPartitionAlignment(java.lang.Boolean optimizedPartitionAlignment) {
        this.optimizedPartitionAlignment = optimizedPartitionAlignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterStorageParams)) return false;
        ConverterStorageParams other = (ConverterStorageParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cloningMode==null && other.getCloningMode()==null) || 
             (this.cloningMode!=null &&
              this.cloningMode.equals(other.getCloningMode()))) &&
            ((this.diskControllerType==null && other.getDiskControllerType()==null) || 
             (this.diskControllerType!=null &&
              this.diskControllerType.equals(other.getDiskControllerType()))) &&
            ((this.targetDiskParams==null && other.getTargetDiskParams()==null) || 
             (this.targetDiskParams!=null &&
              java.util.Arrays.equals(this.targetDiskParams, other.getTargetDiskParams()))) &&
            ((this.skipUnwantedFiles==null && other.getSkipUnwantedFiles()==null) || 
             (this.skipUnwantedFiles!=null &&
              this.skipUnwantedFiles.equals(other.getSkipUnwantedFiles()))) &&
            ((this.vmxDatastoreName==null && other.getVmxDatastoreName()==null) || 
             (this.vmxDatastoreName!=null &&
              this.vmxDatastoreName.equals(other.getVmxDatastoreName()))) &&
            ((this.resizeRatio==null && other.getResizeRatio()==null) || 
             (this.resizeRatio!=null &&
              this.resizeRatio.equals(other.getResizeRatio()))) &&
            ((this.minVolumeSize==null && other.getMinVolumeSize()==null) || 
             (this.minVolumeSize!=null &&
              this.minVolumeSize.equals(other.getMinVolumeSize()))) &&
            ((this.optimizedPartitionAlignment==null && other.getOptimizedPartitionAlignment()==null) || 
             (this.optimizedPartitionAlignment!=null &&
              this.optimizedPartitionAlignment.equals(other.getOptimizedPartitionAlignment())));
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
        if (getCloningMode() != null) {
            _hashCode += getCloningMode().hashCode();
        }
        if (getDiskControllerType() != null) {
            _hashCode += getDiskControllerType().hashCode();
        }
        if (getTargetDiskParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetDiskParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetDiskParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSkipUnwantedFiles() != null) {
            _hashCode += getSkipUnwantedFiles().hashCode();
        }
        if (getVmxDatastoreName() != null) {
            _hashCode += getVmxDatastoreName().hashCode();
        }
        if (getResizeRatio() != null) {
            _hashCode += getResizeRatio().hashCode();
        }
        if (getMinVolumeSize() != null) {
            _hashCode += getMinVolumeSize().hashCode();
        }
        if (getOptimizedPartitionAlignment() != null) {
            _hashCode += getOptimizedPartitionAlignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterStorageParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloningMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "cloningMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskControllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "diskControllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDiskParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "targetDiskParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParamsTargetDiskParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipUnwantedFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "skipUnwantedFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmxDatastoreName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "vmxDatastoreName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resizeRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "resizeRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minVolumeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "minVolumeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimizedPartitionAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "optimizedPartitionAlignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
