/**
 * OvfValidateHostResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfValidateHostResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long downloadSize;

    private java.lang.Long flatDeploymentSize;

    private java.lang.Long sparseDeploymentSize;

    private com.vmware.converter.LocalizedMethodFault[] error;

    private com.vmware.converter.LocalizedMethodFault[] warning;

    private java.lang.String[] supportedDiskProvisioning;

    public OvfValidateHostResult() {
    }

    public OvfValidateHostResult(
           java.lang.Long downloadSize,
           java.lang.Long flatDeploymentSize,
           java.lang.Long sparseDeploymentSize,
           com.vmware.converter.LocalizedMethodFault[] error,
           com.vmware.converter.LocalizedMethodFault[] warning,
           java.lang.String[] supportedDiskProvisioning) {
        this.downloadSize = downloadSize;
        this.flatDeploymentSize = flatDeploymentSize;
        this.sparseDeploymentSize = sparseDeploymentSize;
        this.error = error;
        this.warning = warning;
        this.supportedDiskProvisioning = supportedDiskProvisioning;
    }


    /**
     * Gets the downloadSize value for this OvfValidateHostResult.
     * 
     * @return downloadSize
     */
    public java.lang.Long getDownloadSize() {
        return downloadSize;
    }


    /**
     * Sets the downloadSize value for this OvfValidateHostResult.
     * 
     * @param downloadSize
     */
    public void setDownloadSize(java.lang.Long downloadSize) {
        this.downloadSize = downloadSize;
    }


    /**
     * Gets the flatDeploymentSize value for this OvfValidateHostResult.
     * 
     * @return flatDeploymentSize
     */
    public java.lang.Long getFlatDeploymentSize() {
        return flatDeploymentSize;
    }


    /**
     * Sets the flatDeploymentSize value for this OvfValidateHostResult.
     * 
     * @param flatDeploymentSize
     */
    public void setFlatDeploymentSize(java.lang.Long flatDeploymentSize) {
        this.flatDeploymentSize = flatDeploymentSize;
    }


    /**
     * Gets the sparseDeploymentSize value for this OvfValidateHostResult.
     * 
     * @return sparseDeploymentSize
     */
    public java.lang.Long getSparseDeploymentSize() {
        return sparseDeploymentSize;
    }


    /**
     * Sets the sparseDeploymentSize value for this OvfValidateHostResult.
     * 
     * @param sparseDeploymentSize
     */
    public void setSparseDeploymentSize(java.lang.Long sparseDeploymentSize) {
        this.sparseDeploymentSize = sparseDeploymentSize;
    }


    /**
     * Gets the error value for this OvfValidateHostResult.
     * 
     * @return error
     */
    public com.vmware.converter.LocalizedMethodFault[] getError() {
        return error;
    }


    /**
     * Sets the error value for this OvfValidateHostResult.
     * 
     * @param error
     */
    public void setError(com.vmware.converter.LocalizedMethodFault[] error) {
        this.error = error;
    }

    public com.vmware.converter.LocalizedMethodFault getError(int i) {
        return this.error[i];
    }

    public void setError(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.error[i] = _value;
    }


    /**
     * Gets the warning value for this OvfValidateHostResult.
     * 
     * @return warning
     */
    public com.vmware.converter.LocalizedMethodFault[] getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this OvfValidateHostResult.
     * 
     * @param warning
     */
    public void setWarning(com.vmware.converter.LocalizedMethodFault[] warning) {
        this.warning = warning;
    }

    public com.vmware.converter.LocalizedMethodFault getWarning(int i) {
        return this.warning[i];
    }

    public void setWarning(int i, com.vmware.converter.LocalizedMethodFault _value) {
        this.warning[i] = _value;
    }


    /**
     * Gets the supportedDiskProvisioning value for this OvfValidateHostResult.
     * 
     * @return supportedDiskProvisioning
     */
    public java.lang.String[] getSupportedDiskProvisioning() {
        return supportedDiskProvisioning;
    }


    /**
     * Sets the supportedDiskProvisioning value for this OvfValidateHostResult.
     * 
     * @param supportedDiskProvisioning
     */
    public void setSupportedDiskProvisioning(java.lang.String[] supportedDiskProvisioning) {
        this.supportedDiskProvisioning = supportedDiskProvisioning;
    }

    public java.lang.String getSupportedDiskProvisioning(int i) {
        return this.supportedDiskProvisioning[i];
    }

    public void setSupportedDiskProvisioning(int i, java.lang.String _value) {
        this.supportedDiskProvisioning[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfValidateHostResult)) return false;
        OvfValidateHostResult other = (OvfValidateHostResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.downloadSize==null && other.getDownloadSize()==null) || 
             (this.downloadSize!=null &&
              this.downloadSize.equals(other.getDownloadSize()))) &&
            ((this.flatDeploymentSize==null && other.getFlatDeploymentSize()==null) || 
             (this.flatDeploymentSize!=null &&
              this.flatDeploymentSize.equals(other.getFlatDeploymentSize()))) &&
            ((this.sparseDeploymentSize==null && other.getSparseDeploymentSize()==null) || 
             (this.sparseDeploymentSize!=null &&
              this.sparseDeploymentSize.equals(other.getSparseDeploymentSize()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              java.util.Arrays.equals(this.error, other.getError()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              java.util.Arrays.equals(this.warning, other.getWarning()))) &&
            ((this.supportedDiskProvisioning==null && other.getSupportedDiskProvisioning()==null) || 
             (this.supportedDiskProvisioning!=null &&
              java.util.Arrays.equals(this.supportedDiskProvisioning, other.getSupportedDiskProvisioning())));
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
        if (getDownloadSize() != null) {
            _hashCode += getDownloadSize().hashCode();
        }
        if (getFlatDeploymentSize() != null) {
            _hashCode += getFlatDeploymentSize().hashCode();
        }
        if (getSparseDeploymentSize() != null) {
            _hashCode += getSparseDeploymentSize().hashCode();
        }
        if (getError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarning(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupportedDiskProvisioning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedDiskProvisioning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedDiskProvisioning(), i);
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
        new org.apache.axis.description.TypeDesc(OvfValidateHostResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfValidateHostResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "downloadSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatDeploymentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "flatDeploymentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparseDeploymentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sparseDeploymentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedDiskProvisioning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedDiskProvisioning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
