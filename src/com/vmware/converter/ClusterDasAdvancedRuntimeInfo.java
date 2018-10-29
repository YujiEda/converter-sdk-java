/**
 * ClusterDasAdvancedRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDasAdvancedRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ClusterDasHostInfo dasHostInfo;

    private com.vmware.converter.ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo vmcpSupported;

    private com.vmware.converter.DasHeartbeatDatastoreInfo[] heartbeatDatastoreInfo;

    public ClusterDasAdvancedRuntimeInfo() {
    }

    public ClusterDasAdvancedRuntimeInfo(
           com.vmware.converter.ClusterDasHostInfo dasHostInfo,
           com.vmware.converter.ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo vmcpSupported,
           com.vmware.converter.DasHeartbeatDatastoreInfo[] heartbeatDatastoreInfo) {
        this.dasHostInfo = dasHostInfo;
        this.vmcpSupported = vmcpSupported;
        this.heartbeatDatastoreInfo = heartbeatDatastoreInfo;
    }


    /**
     * Gets the dasHostInfo value for this ClusterDasAdvancedRuntimeInfo.
     * 
     * @return dasHostInfo
     */
    public com.vmware.converter.ClusterDasHostInfo getDasHostInfo() {
        return dasHostInfo;
    }


    /**
     * Sets the dasHostInfo value for this ClusterDasAdvancedRuntimeInfo.
     * 
     * @param dasHostInfo
     */
    public void setDasHostInfo(com.vmware.converter.ClusterDasHostInfo dasHostInfo) {
        this.dasHostInfo = dasHostInfo;
    }


    /**
     * Gets the vmcpSupported value for this ClusterDasAdvancedRuntimeInfo.
     * 
     * @return vmcpSupported
     */
    public com.vmware.converter.ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo getVmcpSupported() {
        return vmcpSupported;
    }


    /**
     * Sets the vmcpSupported value for this ClusterDasAdvancedRuntimeInfo.
     * 
     * @param vmcpSupported
     */
    public void setVmcpSupported(com.vmware.converter.ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo vmcpSupported) {
        this.vmcpSupported = vmcpSupported;
    }


    /**
     * Gets the heartbeatDatastoreInfo value for this ClusterDasAdvancedRuntimeInfo.
     * 
     * @return heartbeatDatastoreInfo
     */
    public com.vmware.converter.DasHeartbeatDatastoreInfo[] getHeartbeatDatastoreInfo() {
        return heartbeatDatastoreInfo;
    }


    /**
     * Sets the heartbeatDatastoreInfo value for this ClusterDasAdvancedRuntimeInfo.
     * 
     * @param heartbeatDatastoreInfo
     */
    public void setHeartbeatDatastoreInfo(com.vmware.converter.DasHeartbeatDatastoreInfo[] heartbeatDatastoreInfo) {
        this.heartbeatDatastoreInfo = heartbeatDatastoreInfo;
    }

    public com.vmware.converter.DasHeartbeatDatastoreInfo getHeartbeatDatastoreInfo(int i) {
        return this.heartbeatDatastoreInfo[i];
    }

    public void setHeartbeatDatastoreInfo(int i, com.vmware.converter.DasHeartbeatDatastoreInfo _value) {
        this.heartbeatDatastoreInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasAdvancedRuntimeInfo)) return false;
        ClusterDasAdvancedRuntimeInfo other = (ClusterDasAdvancedRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dasHostInfo==null && other.getDasHostInfo()==null) || 
             (this.dasHostInfo!=null &&
              this.dasHostInfo.equals(other.getDasHostInfo()))) &&
            ((this.vmcpSupported==null && other.getVmcpSupported()==null) || 
             (this.vmcpSupported!=null &&
              this.vmcpSupported.equals(other.getVmcpSupported()))) &&
            ((this.heartbeatDatastoreInfo==null && other.getHeartbeatDatastoreInfo()==null) || 
             (this.heartbeatDatastoreInfo!=null &&
              java.util.Arrays.equals(this.heartbeatDatastoreInfo, other.getHeartbeatDatastoreInfo())));
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
        if (getDasHostInfo() != null) {
            _hashCode += getDasHostInfo().hashCode();
        }
        if (getVmcpSupported() != null) {
            _hashCode += getVmcpSupported().hashCode();
        }
        if (getHeartbeatDatastoreInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeartbeatDatastoreInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeartbeatDatastoreInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterDasAdvancedRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAdvancedRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasHostInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasHostInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasHostInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmcpSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmcpSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heartbeatDatastoreInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "heartbeatDatastoreInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DasHeartbeatDatastoreInfo"));
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
