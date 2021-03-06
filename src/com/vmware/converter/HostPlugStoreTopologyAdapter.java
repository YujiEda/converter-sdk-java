/**
 * HostPlugStoreTopologyAdapter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostPlugStoreTopologyAdapter  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String adapter;

    private java.lang.String[] path;

    public HostPlugStoreTopologyAdapter() {
    }

    public HostPlugStoreTopologyAdapter(
           java.lang.String key,
           java.lang.String adapter,
           java.lang.String[] path) {
        this.key = key;
        this.adapter = adapter;
        this.path = path;
    }


    /**
     * Gets the key value for this HostPlugStoreTopologyAdapter.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostPlugStoreTopologyAdapter.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the adapter value for this HostPlugStoreTopologyAdapter.
     * 
     * @return adapter
     */
    public java.lang.String getAdapter() {
        return adapter;
    }


    /**
     * Sets the adapter value for this HostPlugStoreTopologyAdapter.
     * 
     * @param adapter
     */
    public void setAdapter(java.lang.String adapter) {
        this.adapter = adapter;
    }


    /**
     * Gets the path value for this HostPlugStoreTopologyAdapter.
     * 
     * @return path
     */
    public java.lang.String[] getPath() {
        return path;
    }


    /**
     * Sets the path value for this HostPlugStoreTopologyAdapter.
     * 
     * @param path
     */
    public void setPath(java.lang.String[] path) {
        this.path = path;
    }

    public java.lang.String getPath(int i) {
        return this.path[i];
    }

    public void setPath(int i, java.lang.String _value) {
        this.path[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostPlugStoreTopologyAdapter)) return false;
        HostPlugStoreTopologyAdapter other = (HostPlugStoreTopologyAdapter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.adapter==null && other.getAdapter()==null) || 
             (this.adapter!=null &&
              this.adapter.equals(other.getAdapter()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              java.util.Arrays.equals(this.path, other.getPath())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getAdapter() != null) {
            _hashCode += getAdapter().hashCode();
        }
        if (getPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPath(), i);
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
        new org.apache.axis.description.TypeDesc(HostPlugStoreTopologyAdapter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPlugStoreTopologyAdapter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "adapter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "path"));
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
