/**
 * HostMountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostMountInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String path;

    private java.lang.String accessMode;

    private java.lang.Boolean mounted;

    private java.lang.Boolean accessible;

    private java.lang.String inaccessibleReason;

    public HostMountInfo() {
    }

    public HostMountInfo(
           java.lang.String path,
           java.lang.String accessMode,
           java.lang.Boolean mounted,
           java.lang.Boolean accessible,
           java.lang.String inaccessibleReason) {
        this.path = path;
        this.accessMode = accessMode;
        this.mounted = mounted;
        this.accessible = accessible;
        this.inaccessibleReason = inaccessibleReason;
    }


    /**
     * Gets the path value for this HostMountInfo.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this HostMountInfo.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the accessMode value for this HostMountInfo.
     * 
     * @return accessMode
     */
    public java.lang.String getAccessMode() {
        return accessMode;
    }


    /**
     * Sets the accessMode value for this HostMountInfo.
     * 
     * @param accessMode
     */
    public void setAccessMode(java.lang.String accessMode) {
        this.accessMode = accessMode;
    }


    /**
     * Gets the mounted value for this HostMountInfo.
     * 
     * @return mounted
     */
    public java.lang.Boolean getMounted() {
        return mounted;
    }


    /**
     * Sets the mounted value for this HostMountInfo.
     * 
     * @param mounted
     */
    public void setMounted(java.lang.Boolean mounted) {
        this.mounted = mounted;
    }


    /**
     * Gets the accessible value for this HostMountInfo.
     * 
     * @return accessible
     */
    public java.lang.Boolean getAccessible() {
        return accessible;
    }


    /**
     * Sets the accessible value for this HostMountInfo.
     * 
     * @param accessible
     */
    public void setAccessible(java.lang.Boolean accessible) {
        this.accessible = accessible;
    }


    /**
     * Gets the inaccessibleReason value for this HostMountInfo.
     * 
     * @return inaccessibleReason
     */
    public java.lang.String getInaccessibleReason() {
        return inaccessibleReason;
    }


    /**
     * Sets the inaccessibleReason value for this HostMountInfo.
     * 
     * @param inaccessibleReason
     */
    public void setInaccessibleReason(java.lang.String inaccessibleReason) {
        this.inaccessibleReason = inaccessibleReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMountInfo)) return false;
        HostMountInfo other = (HostMountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.accessMode==null && other.getAccessMode()==null) || 
             (this.accessMode!=null &&
              this.accessMode.equals(other.getAccessMode()))) &&
            ((this.mounted==null && other.getMounted()==null) || 
             (this.mounted!=null &&
              this.mounted.equals(other.getMounted()))) &&
            ((this.accessible==null && other.getAccessible()==null) || 
             (this.accessible!=null &&
              this.accessible.equals(other.getAccessible()))) &&
            ((this.inaccessibleReason==null && other.getInaccessibleReason()==null) || 
             (this.inaccessibleReason!=null &&
              this.inaccessibleReason.equals(other.getInaccessibleReason())));
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getAccessMode() != null) {
            _hashCode += getAccessMode().hashCode();
        }
        if (getMounted() != null) {
            _hashCode += getMounted().hashCode();
        }
        if (getAccessible() != null) {
            _hashCode += getAccessible().hashCode();
        }
        if (getInaccessibleReason() != null) {
            _hashCode += getInaccessibleReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostMountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accessMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mounted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mounted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accessible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inaccessibleReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inaccessibleReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
