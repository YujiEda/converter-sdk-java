/**
 * PermissionUpdatedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PermissionUpdatedEvent  extends com.vmware.converter.PermissionEvent  implements java.io.Serializable {
    private com.vmware.converter.RoleEventArgument role;

    private boolean propagate;

    public PermissionUpdatedEvent() {
    }

    public PermissionUpdatedEvent(
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.converter.DatacenterEventArgument datacenter,
           com.vmware.converter.ComputeResourceEventArgument computeResource,
           com.vmware.converter.HostEventArgument host,
           com.vmware.converter.VmEventArgument vm,
           com.vmware.converter.DatastoreEventArgument ds,
           com.vmware.converter.NetworkEventArgument net,
           com.vmware.converter.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           com.vmware.converter.ManagedEntityEventArgument entity,
           java.lang.String principal,
           boolean group,
           com.vmware.converter.RoleEventArgument role,
           boolean propagate) {
        super(
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag,
            entity,
            principal,
            group);
        this.role = role;
        this.propagate = propagate;
    }


    /**
     * Gets the role value for this PermissionUpdatedEvent.
     * 
     * @return role
     */
    public com.vmware.converter.RoleEventArgument getRole() {
        return role;
    }


    /**
     * Sets the role value for this PermissionUpdatedEvent.
     * 
     * @param role
     */
    public void setRole(com.vmware.converter.RoleEventArgument role) {
        this.role = role;
    }


    /**
     * Gets the propagate value for this PermissionUpdatedEvent.
     * 
     * @return propagate
     */
    public boolean isPropagate() {
        return propagate;
    }


    /**
     * Sets the propagate value for this PermissionUpdatedEvent.
     * 
     * @param propagate
     */
    public void setPropagate(boolean propagate) {
        this.propagate = propagate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermissionUpdatedEvent)) return false;
        PermissionUpdatedEvent other = (PermissionUpdatedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            this.propagate == other.isPropagate();
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
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        _hashCode += (isPropagate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermissionUpdatedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PermissionUpdatedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RoleEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propagate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propagate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
