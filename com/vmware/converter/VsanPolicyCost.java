/**
 * VsanPolicyCost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanPolicyCost  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.Long changeDataSize;

    private java.lang.Long currentDataSize;

    private java.lang.Long tempDataSize;

    private java.lang.Long copyDataSize;

    private java.lang.Long changeFlashReadCacheSize;

    private java.lang.Long currentFlashReadCacheSize;

    private java.lang.Float currentDiskSpaceToAddressSpaceRatio;

    private java.lang.Float diskSpaceToAddressSpaceRatio;

    public VsanPolicyCost() {
    }

    public VsanPolicyCost(
           java.lang.Long changeDataSize,
           java.lang.Long currentDataSize,
           java.lang.Long tempDataSize,
           java.lang.Long copyDataSize,
           java.lang.Long changeFlashReadCacheSize,
           java.lang.Long currentFlashReadCacheSize,
           java.lang.Float currentDiskSpaceToAddressSpaceRatio,
           java.lang.Float diskSpaceToAddressSpaceRatio) {
        this.changeDataSize = changeDataSize;
        this.currentDataSize = currentDataSize;
        this.tempDataSize = tempDataSize;
        this.copyDataSize = copyDataSize;
        this.changeFlashReadCacheSize = changeFlashReadCacheSize;
        this.currentFlashReadCacheSize = currentFlashReadCacheSize;
        this.currentDiskSpaceToAddressSpaceRatio = currentDiskSpaceToAddressSpaceRatio;
        this.diskSpaceToAddressSpaceRatio = diskSpaceToAddressSpaceRatio;
    }


    /**
     * Gets the changeDataSize value for this VsanPolicyCost.
     * 
     * @return changeDataSize
     */
    public java.lang.Long getChangeDataSize() {
        return changeDataSize;
    }


    /**
     * Sets the changeDataSize value for this VsanPolicyCost.
     * 
     * @param changeDataSize
     */
    public void setChangeDataSize(java.lang.Long changeDataSize) {
        this.changeDataSize = changeDataSize;
    }


    /**
     * Gets the currentDataSize value for this VsanPolicyCost.
     * 
     * @return currentDataSize
     */
    public java.lang.Long getCurrentDataSize() {
        return currentDataSize;
    }


    /**
     * Sets the currentDataSize value for this VsanPolicyCost.
     * 
     * @param currentDataSize
     */
    public void setCurrentDataSize(java.lang.Long currentDataSize) {
        this.currentDataSize = currentDataSize;
    }


    /**
     * Gets the tempDataSize value for this VsanPolicyCost.
     * 
     * @return tempDataSize
     */
    public java.lang.Long getTempDataSize() {
        return tempDataSize;
    }


    /**
     * Sets the tempDataSize value for this VsanPolicyCost.
     * 
     * @param tempDataSize
     */
    public void setTempDataSize(java.lang.Long tempDataSize) {
        this.tempDataSize = tempDataSize;
    }


    /**
     * Gets the copyDataSize value for this VsanPolicyCost.
     * 
     * @return copyDataSize
     */
    public java.lang.Long getCopyDataSize() {
        return copyDataSize;
    }


    /**
     * Sets the copyDataSize value for this VsanPolicyCost.
     * 
     * @param copyDataSize
     */
    public void setCopyDataSize(java.lang.Long copyDataSize) {
        this.copyDataSize = copyDataSize;
    }


    /**
     * Gets the changeFlashReadCacheSize value for this VsanPolicyCost.
     * 
     * @return changeFlashReadCacheSize
     */
    public java.lang.Long getChangeFlashReadCacheSize() {
        return changeFlashReadCacheSize;
    }


    /**
     * Sets the changeFlashReadCacheSize value for this VsanPolicyCost.
     * 
     * @param changeFlashReadCacheSize
     */
    public void setChangeFlashReadCacheSize(java.lang.Long changeFlashReadCacheSize) {
        this.changeFlashReadCacheSize = changeFlashReadCacheSize;
    }


    /**
     * Gets the currentFlashReadCacheSize value for this VsanPolicyCost.
     * 
     * @return currentFlashReadCacheSize
     */
    public java.lang.Long getCurrentFlashReadCacheSize() {
        return currentFlashReadCacheSize;
    }


    /**
     * Sets the currentFlashReadCacheSize value for this VsanPolicyCost.
     * 
     * @param currentFlashReadCacheSize
     */
    public void setCurrentFlashReadCacheSize(java.lang.Long currentFlashReadCacheSize) {
        this.currentFlashReadCacheSize = currentFlashReadCacheSize;
    }


    /**
     * Gets the currentDiskSpaceToAddressSpaceRatio value for this VsanPolicyCost.
     * 
     * @return currentDiskSpaceToAddressSpaceRatio
     */
    public java.lang.Float getCurrentDiskSpaceToAddressSpaceRatio() {
        return currentDiskSpaceToAddressSpaceRatio;
    }


    /**
     * Sets the currentDiskSpaceToAddressSpaceRatio value for this VsanPolicyCost.
     * 
     * @param currentDiskSpaceToAddressSpaceRatio
     */
    public void setCurrentDiskSpaceToAddressSpaceRatio(java.lang.Float currentDiskSpaceToAddressSpaceRatio) {
        this.currentDiskSpaceToAddressSpaceRatio = currentDiskSpaceToAddressSpaceRatio;
    }


    /**
     * Gets the diskSpaceToAddressSpaceRatio value for this VsanPolicyCost.
     * 
     * @return diskSpaceToAddressSpaceRatio
     */
    public java.lang.Float getDiskSpaceToAddressSpaceRatio() {
        return diskSpaceToAddressSpaceRatio;
    }


    /**
     * Sets the diskSpaceToAddressSpaceRatio value for this VsanPolicyCost.
     * 
     * @param diskSpaceToAddressSpaceRatio
     */
    public void setDiskSpaceToAddressSpaceRatio(java.lang.Float diskSpaceToAddressSpaceRatio) {
        this.diskSpaceToAddressSpaceRatio = diskSpaceToAddressSpaceRatio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanPolicyCost)) return false;
        VsanPolicyCost other = (VsanPolicyCost) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeDataSize==null && other.getChangeDataSize()==null) || 
             (this.changeDataSize!=null &&
              this.changeDataSize.equals(other.getChangeDataSize()))) &&
            ((this.currentDataSize==null && other.getCurrentDataSize()==null) || 
             (this.currentDataSize!=null &&
              this.currentDataSize.equals(other.getCurrentDataSize()))) &&
            ((this.tempDataSize==null && other.getTempDataSize()==null) || 
             (this.tempDataSize!=null &&
              this.tempDataSize.equals(other.getTempDataSize()))) &&
            ((this.copyDataSize==null && other.getCopyDataSize()==null) || 
             (this.copyDataSize!=null &&
              this.copyDataSize.equals(other.getCopyDataSize()))) &&
            ((this.changeFlashReadCacheSize==null && other.getChangeFlashReadCacheSize()==null) || 
             (this.changeFlashReadCacheSize!=null &&
              this.changeFlashReadCacheSize.equals(other.getChangeFlashReadCacheSize()))) &&
            ((this.currentFlashReadCacheSize==null && other.getCurrentFlashReadCacheSize()==null) || 
             (this.currentFlashReadCacheSize!=null &&
              this.currentFlashReadCacheSize.equals(other.getCurrentFlashReadCacheSize()))) &&
            ((this.currentDiskSpaceToAddressSpaceRatio==null && other.getCurrentDiskSpaceToAddressSpaceRatio()==null) || 
             (this.currentDiskSpaceToAddressSpaceRatio!=null &&
              this.currentDiskSpaceToAddressSpaceRatio.equals(other.getCurrentDiskSpaceToAddressSpaceRatio()))) &&
            ((this.diskSpaceToAddressSpaceRatio==null && other.getDiskSpaceToAddressSpaceRatio()==null) || 
             (this.diskSpaceToAddressSpaceRatio!=null &&
              this.diskSpaceToAddressSpaceRatio.equals(other.getDiskSpaceToAddressSpaceRatio())));
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
        if (getChangeDataSize() != null) {
            _hashCode += getChangeDataSize().hashCode();
        }
        if (getCurrentDataSize() != null) {
            _hashCode += getCurrentDataSize().hashCode();
        }
        if (getTempDataSize() != null) {
            _hashCode += getTempDataSize().hashCode();
        }
        if (getCopyDataSize() != null) {
            _hashCode += getCopyDataSize().hashCode();
        }
        if (getChangeFlashReadCacheSize() != null) {
            _hashCode += getChangeFlashReadCacheSize().hashCode();
        }
        if (getCurrentFlashReadCacheSize() != null) {
            _hashCode += getCurrentFlashReadCacheSize().hashCode();
        }
        if (getCurrentDiskSpaceToAddressSpaceRatio() != null) {
            _hashCode += getCurrentDiskSpaceToAddressSpaceRatio().hashCode();
        }
        if (getDiskSpaceToAddressSpaceRatio() != null) {
            _hashCode += getDiskSpaceToAddressSpaceRatio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VsanPolicyCost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanPolicyCost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeDataSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeDataSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentDataSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentDataSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempDataSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tempDataSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyDataSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "copyDataSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeFlashReadCacheSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeFlashReadCacheSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentFlashReadCacheSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentFlashReadCacheSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentDiskSpaceToAddressSpaceRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentDiskSpaceToAddressSpaceRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskSpaceToAddressSpaceRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskSpaceToAddressSpaceRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
