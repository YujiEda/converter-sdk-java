/**
 * HostNetworkPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostNetworkPolicy  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostNetworkSecurityPolicy security;

    private com.vmware.converter.HostNicTeamingPolicy nicTeaming;

    private com.vmware.converter.HostNetOffloadCapabilities offloadPolicy;

    private com.vmware.converter.HostNetworkTrafficShapingPolicy shapingPolicy;

    public HostNetworkPolicy() {
    }

    public HostNetworkPolicy(
           com.vmware.converter.HostNetworkSecurityPolicy security,
           com.vmware.converter.HostNicTeamingPolicy nicTeaming,
           com.vmware.converter.HostNetOffloadCapabilities offloadPolicy,
           com.vmware.converter.HostNetworkTrafficShapingPolicy shapingPolicy) {
        this.security = security;
        this.nicTeaming = nicTeaming;
        this.offloadPolicy = offloadPolicy;
        this.shapingPolicy = shapingPolicy;
    }


    /**
     * Gets the security value for this HostNetworkPolicy.
     * 
     * @return security
     */
    public com.vmware.converter.HostNetworkSecurityPolicy getSecurity() {
        return security;
    }


    /**
     * Sets the security value for this HostNetworkPolicy.
     * 
     * @param security
     */
    public void setSecurity(com.vmware.converter.HostNetworkSecurityPolicy security) {
        this.security = security;
    }


    /**
     * Gets the nicTeaming value for this HostNetworkPolicy.
     * 
     * @return nicTeaming
     */
    public com.vmware.converter.HostNicTeamingPolicy getNicTeaming() {
        return nicTeaming;
    }


    /**
     * Sets the nicTeaming value for this HostNetworkPolicy.
     * 
     * @param nicTeaming
     */
    public void setNicTeaming(com.vmware.converter.HostNicTeamingPolicy nicTeaming) {
        this.nicTeaming = nicTeaming;
    }


    /**
     * Gets the offloadPolicy value for this HostNetworkPolicy.
     * 
     * @return offloadPolicy
     */
    public com.vmware.converter.HostNetOffloadCapabilities getOffloadPolicy() {
        return offloadPolicy;
    }


    /**
     * Sets the offloadPolicy value for this HostNetworkPolicy.
     * 
     * @param offloadPolicy
     */
    public void setOffloadPolicy(com.vmware.converter.HostNetOffloadCapabilities offloadPolicy) {
        this.offloadPolicy = offloadPolicy;
    }


    /**
     * Gets the shapingPolicy value for this HostNetworkPolicy.
     * 
     * @return shapingPolicy
     */
    public com.vmware.converter.HostNetworkTrafficShapingPolicy getShapingPolicy() {
        return shapingPolicy;
    }


    /**
     * Sets the shapingPolicy value for this HostNetworkPolicy.
     * 
     * @param shapingPolicy
     */
    public void setShapingPolicy(com.vmware.converter.HostNetworkTrafficShapingPolicy shapingPolicy) {
        this.shapingPolicy = shapingPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNetworkPolicy)) return false;
        HostNetworkPolicy other = (HostNetworkPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.security==null && other.getSecurity()==null) || 
             (this.security!=null &&
              this.security.equals(other.getSecurity()))) &&
            ((this.nicTeaming==null && other.getNicTeaming()==null) || 
             (this.nicTeaming!=null &&
              this.nicTeaming.equals(other.getNicTeaming()))) &&
            ((this.offloadPolicy==null && other.getOffloadPolicy()==null) || 
             (this.offloadPolicy!=null &&
              this.offloadPolicy.equals(other.getOffloadPolicy()))) &&
            ((this.shapingPolicy==null && other.getShapingPolicy()==null) || 
             (this.shapingPolicy!=null &&
              this.shapingPolicy.equals(other.getShapingPolicy())));
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
        if (getSecurity() != null) {
            _hashCode += getSecurity().hashCode();
        }
        if (getNicTeaming() != null) {
            _hashCode += getNicTeaming().hashCode();
        }
        if (getOffloadPolicy() != null) {
            _hashCode += getOffloadPolicy().hashCode();
        }
        if (getShapingPolicy() != null) {
            _hashCode += getShapingPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNetworkPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "security"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkSecurityPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicTeaming");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicTeaming"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNicTeamingPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offloadPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "offloadPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetOffloadCapabilities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shapingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shapingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkTrafficShapingPolicy"));
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
