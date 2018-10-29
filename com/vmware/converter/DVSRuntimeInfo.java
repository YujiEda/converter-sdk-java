/**
 * DVSRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostMemberRuntimeInfo[] hostMemberRuntime;

    private com.vmware.converter.DvsResourceRuntimeInfo resourceRuntimeInfo;

    public DVSRuntimeInfo() {
    }

    public DVSRuntimeInfo(
           com.vmware.converter.HostMemberRuntimeInfo[] hostMemberRuntime,
           com.vmware.converter.DvsResourceRuntimeInfo resourceRuntimeInfo) {
        this.hostMemberRuntime = hostMemberRuntime;
        this.resourceRuntimeInfo = resourceRuntimeInfo;
    }


    /**
     * Gets the hostMemberRuntime value for this DVSRuntimeInfo.
     * 
     * @return hostMemberRuntime
     */
    public com.vmware.converter.HostMemberRuntimeInfo[] getHostMemberRuntime() {
        return hostMemberRuntime;
    }


    /**
     * Sets the hostMemberRuntime value for this DVSRuntimeInfo.
     * 
     * @param hostMemberRuntime
     */
    public void setHostMemberRuntime(com.vmware.converter.HostMemberRuntimeInfo[] hostMemberRuntime) {
        this.hostMemberRuntime = hostMemberRuntime;
    }

    public com.vmware.converter.HostMemberRuntimeInfo getHostMemberRuntime(int i) {
        return this.hostMemberRuntime[i];
    }

    public void setHostMemberRuntime(int i, com.vmware.converter.HostMemberRuntimeInfo _value) {
        this.hostMemberRuntime[i] = _value;
    }


    /**
     * Gets the resourceRuntimeInfo value for this DVSRuntimeInfo.
     * 
     * @return resourceRuntimeInfo
     */
    public com.vmware.converter.DvsResourceRuntimeInfo getResourceRuntimeInfo() {
        return resourceRuntimeInfo;
    }


    /**
     * Sets the resourceRuntimeInfo value for this DVSRuntimeInfo.
     * 
     * @param resourceRuntimeInfo
     */
    public void setResourceRuntimeInfo(com.vmware.converter.DvsResourceRuntimeInfo resourceRuntimeInfo) {
        this.resourceRuntimeInfo = resourceRuntimeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSRuntimeInfo)) return false;
        DVSRuntimeInfo other = (DVSRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostMemberRuntime==null && other.getHostMemberRuntime()==null) || 
             (this.hostMemberRuntime!=null &&
              java.util.Arrays.equals(this.hostMemberRuntime, other.getHostMemberRuntime()))) &&
            ((this.resourceRuntimeInfo==null && other.getResourceRuntimeInfo()==null) || 
             (this.resourceRuntimeInfo!=null &&
              this.resourceRuntimeInfo.equals(other.getResourceRuntimeInfo())));
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
        if (getHostMemberRuntime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostMemberRuntime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostMemberRuntime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceRuntimeInfo() != null) {
            _hashCode += getResourceRuntimeInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMemberRuntime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostMemberRuntime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemberRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceRuntimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourceRuntimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsResourceRuntimeInfo"));
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
