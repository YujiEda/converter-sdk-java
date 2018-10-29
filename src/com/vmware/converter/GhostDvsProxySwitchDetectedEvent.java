/**
 * GhostDvsProxySwitchDetectedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GhostDvsProxySwitchDetectedEvent  extends com.vmware.converter.HostEvent  implements java.io.Serializable {
    private java.lang.String[] switchUuid;

    public GhostDvsProxySwitchDetectedEvent() {
    }

    public GhostDvsProxySwitchDetectedEvent(
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
           java.lang.String[] switchUuid) {
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
            changeTag);
        this.switchUuid = switchUuid;
    }


    /**
     * Gets the switchUuid value for this GhostDvsProxySwitchDetectedEvent.
     * 
     * @return switchUuid
     */
    public java.lang.String[] getSwitchUuid() {
        return switchUuid;
    }


    /**
     * Sets the switchUuid value for this GhostDvsProxySwitchDetectedEvent.
     * 
     * @param switchUuid
     */
    public void setSwitchUuid(java.lang.String[] switchUuid) {
        this.switchUuid = switchUuid;
    }

    public java.lang.String getSwitchUuid(int i) {
        return this.switchUuid[i];
    }

    public void setSwitchUuid(int i, java.lang.String _value) {
        this.switchUuid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GhostDvsProxySwitchDetectedEvent)) return false;
        GhostDvsProxySwitchDetectedEvent other = (GhostDvsProxySwitchDetectedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.switchUuid==null && other.getSwitchUuid()==null) || 
             (this.switchUuid!=null &&
              java.util.Arrays.equals(this.switchUuid, other.getSwitchUuid())));
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
        if (getSwitchUuid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSwitchUuid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSwitchUuid(), i);
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
        new org.apache.axis.description.TypeDesc(GhostDvsProxySwitchDetectedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GhostDvsProxySwitchDetectedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
