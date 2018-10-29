/**
 * VsanHostClusterStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VsanHostClusterStatus  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String uuid;

    private java.lang.String nodeUuid;

    private java.lang.String health;

    private com.vmware.converter.VsanHostClusterStatusState nodeState;

    private java.lang.String[] memberUuid;

    public VsanHostClusterStatus() {
    }

    public VsanHostClusterStatus(
           java.lang.String uuid,
           java.lang.String nodeUuid,
           java.lang.String health,
           com.vmware.converter.VsanHostClusterStatusState nodeState,
           java.lang.String[] memberUuid) {
        this.uuid = uuid;
        this.nodeUuid = nodeUuid;
        this.health = health;
        this.nodeState = nodeState;
        this.memberUuid = memberUuid;
    }


    /**
     * Gets the uuid value for this VsanHostClusterStatus.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VsanHostClusterStatus.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the nodeUuid value for this VsanHostClusterStatus.
     * 
     * @return nodeUuid
     */
    public java.lang.String getNodeUuid() {
        return nodeUuid;
    }


    /**
     * Sets the nodeUuid value for this VsanHostClusterStatus.
     * 
     * @param nodeUuid
     */
    public void setNodeUuid(java.lang.String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }


    /**
     * Gets the health value for this VsanHostClusterStatus.
     * 
     * @return health
     */
    public java.lang.String getHealth() {
        return health;
    }


    /**
     * Sets the health value for this VsanHostClusterStatus.
     * 
     * @param health
     */
    public void setHealth(java.lang.String health) {
        this.health = health;
    }


    /**
     * Gets the nodeState value for this VsanHostClusterStatus.
     * 
     * @return nodeState
     */
    public com.vmware.converter.VsanHostClusterStatusState getNodeState() {
        return nodeState;
    }


    /**
     * Sets the nodeState value for this VsanHostClusterStatus.
     * 
     * @param nodeState
     */
    public void setNodeState(com.vmware.converter.VsanHostClusterStatusState nodeState) {
        this.nodeState = nodeState;
    }


    /**
     * Gets the memberUuid value for this VsanHostClusterStatus.
     * 
     * @return memberUuid
     */
    public java.lang.String[] getMemberUuid() {
        return memberUuid;
    }


    /**
     * Sets the memberUuid value for this VsanHostClusterStatus.
     * 
     * @param memberUuid
     */
    public void setMemberUuid(java.lang.String[] memberUuid) {
        this.memberUuid = memberUuid;
    }

    public java.lang.String getMemberUuid(int i) {
        return this.memberUuid[i];
    }

    public void setMemberUuid(int i, java.lang.String _value) {
        this.memberUuid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VsanHostClusterStatus)) return false;
        VsanHostClusterStatus other = (VsanHostClusterStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.nodeUuid==null && other.getNodeUuid()==null) || 
             (this.nodeUuid!=null &&
              this.nodeUuid.equals(other.getNodeUuid()))) &&
            ((this.health==null && other.getHealth()==null) || 
             (this.health!=null &&
              this.health.equals(other.getHealth()))) &&
            ((this.nodeState==null && other.getNodeState()==null) || 
             (this.nodeState!=null &&
              this.nodeState.equals(other.getNodeState()))) &&
            ((this.memberUuid==null && other.getMemberUuid()==null) || 
             (this.memberUuid!=null &&
              java.util.Arrays.equals(this.memberUuid, other.getMemberUuid())));
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
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getNodeUuid() != null) {
            _hashCode += getNodeUuid().hashCode();
        }
        if (getHealth() != null) {
            _hashCode += getHealth().hashCode();
        }
        if (getNodeState() != null) {
            _hashCode += getNodeState().hashCode();
        }
        if (getMemberUuid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberUuid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberUuid(), i);
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
        new org.apache.axis.description.TypeDesc(VsanHostClusterStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostClusterStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nodeUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("health");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "health"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nodeState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostClusterStatusState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memberUuid"));
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
