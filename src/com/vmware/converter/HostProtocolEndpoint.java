/**
 * HostProtocolEndpoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostProtocolEndpoint  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String peType;

    private java.lang.String uuid;

    private com.vmware.converter.ManagedObjectReference[] hostKey;

    private java.lang.String storageArray;

    private java.lang.String nfsServer;

    private java.lang.String nfsDir;

    private java.lang.String deviceId;

    public HostProtocolEndpoint() {
    }

    public HostProtocolEndpoint(
           java.lang.String peType,
           java.lang.String uuid,
           com.vmware.converter.ManagedObjectReference[] hostKey,
           java.lang.String storageArray,
           java.lang.String nfsServer,
           java.lang.String nfsDir,
           java.lang.String deviceId) {
        this.peType = peType;
        this.uuid = uuid;
        this.hostKey = hostKey;
        this.storageArray = storageArray;
        this.nfsServer = nfsServer;
        this.nfsDir = nfsDir;
        this.deviceId = deviceId;
    }


    /**
     * Gets the peType value for this HostProtocolEndpoint.
     * 
     * @return peType
     */
    public java.lang.String getPeType() {
        return peType;
    }


    /**
     * Sets the peType value for this HostProtocolEndpoint.
     * 
     * @param peType
     */
    public void setPeType(java.lang.String peType) {
        this.peType = peType;
    }


    /**
     * Gets the uuid value for this HostProtocolEndpoint.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this HostProtocolEndpoint.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the hostKey value for this HostProtocolEndpoint.
     * 
     * @return hostKey
     */
    public com.vmware.converter.ManagedObjectReference[] getHostKey() {
        return hostKey;
    }


    /**
     * Sets the hostKey value for this HostProtocolEndpoint.
     * 
     * @param hostKey
     */
    public void setHostKey(com.vmware.converter.ManagedObjectReference[] hostKey) {
        this.hostKey = hostKey;
    }

    public com.vmware.converter.ManagedObjectReference getHostKey(int i) {
        return this.hostKey[i];
    }

    public void setHostKey(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.hostKey[i] = _value;
    }


    /**
     * Gets the storageArray value for this HostProtocolEndpoint.
     * 
     * @return storageArray
     */
    public java.lang.String getStorageArray() {
        return storageArray;
    }


    /**
     * Sets the storageArray value for this HostProtocolEndpoint.
     * 
     * @param storageArray
     */
    public void setStorageArray(java.lang.String storageArray) {
        this.storageArray = storageArray;
    }


    /**
     * Gets the nfsServer value for this HostProtocolEndpoint.
     * 
     * @return nfsServer
     */
    public java.lang.String getNfsServer() {
        return nfsServer;
    }


    /**
     * Sets the nfsServer value for this HostProtocolEndpoint.
     * 
     * @param nfsServer
     */
    public void setNfsServer(java.lang.String nfsServer) {
        this.nfsServer = nfsServer;
    }


    /**
     * Gets the nfsDir value for this HostProtocolEndpoint.
     * 
     * @return nfsDir
     */
    public java.lang.String getNfsDir() {
        return nfsDir;
    }


    /**
     * Sets the nfsDir value for this HostProtocolEndpoint.
     * 
     * @param nfsDir
     */
    public void setNfsDir(java.lang.String nfsDir) {
        this.nfsDir = nfsDir;
    }


    /**
     * Gets the deviceId value for this HostProtocolEndpoint.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this HostProtocolEndpoint.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostProtocolEndpoint)) return false;
        HostProtocolEndpoint other = (HostProtocolEndpoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.peType==null && other.getPeType()==null) || 
             (this.peType!=null &&
              this.peType.equals(other.getPeType()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.hostKey==null && other.getHostKey()==null) || 
             (this.hostKey!=null &&
              java.util.Arrays.equals(this.hostKey, other.getHostKey()))) &&
            ((this.storageArray==null && other.getStorageArray()==null) || 
             (this.storageArray!=null &&
              this.storageArray.equals(other.getStorageArray()))) &&
            ((this.nfsServer==null && other.getNfsServer()==null) || 
             (this.nfsServer!=null &&
              this.nfsServer.equals(other.getNfsServer()))) &&
            ((this.nfsDir==null && other.getNfsDir()==null) || 
             (this.nfsDir!=null &&
              this.nfsDir.equals(other.getNfsDir()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId())));
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
        if (getPeType() != null) {
            _hashCode += getPeType().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getHostKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStorageArray() != null) {
            _hashCode += getStorageArray().hashCode();
        }
        if (getNfsServer() != null) {
            _hashCode += getNfsServer().hashCode();
        }
        if (getNfsDir() != null) {
            _hashCode += getNfsDir().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostProtocolEndpoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostProtocolEndpoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "peType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageArray");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfsServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nfsServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfsDir");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nfsDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceId"));
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
