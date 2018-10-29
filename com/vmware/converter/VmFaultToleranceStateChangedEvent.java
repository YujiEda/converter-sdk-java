/**
 * VmFaultToleranceStateChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmFaultToleranceStateChangedEvent  extends com.vmware.converter.VmEvent  implements java.io.Serializable {
    private com.vmware.converter.VirtualMachineFaultToleranceState oldState;

    private com.vmware.converter.VirtualMachineFaultToleranceState newState;

    public VmFaultToleranceStateChangedEvent() {
    }

    public VmFaultToleranceStateChangedEvent(
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
           boolean template,
           com.vmware.converter.VirtualMachineFaultToleranceState oldState,
           com.vmware.converter.VirtualMachineFaultToleranceState newState) {
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
            template);
        this.oldState = oldState;
        this.newState = newState;
    }


    /**
     * Gets the oldState value for this VmFaultToleranceStateChangedEvent.
     * 
     * @return oldState
     */
    public com.vmware.converter.VirtualMachineFaultToleranceState getOldState() {
        return oldState;
    }


    /**
     * Sets the oldState value for this VmFaultToleranceStateChangedEvent.
     * 
     * @param oldState
     */
    public void setOldState(com.vmware.converter.VirtualMachineFaultToleranceState oldState) {
        this.oldState = oldState;
    }


    /**
     * Gets the newState value for this VmFaultToleranceStateChangedEvent.
     * 
     * @return newState
     */
    public com.vmware.converter.VirtualMachineFaultToleranceState getNewState() {
        return newState;
    }


    /**
     * Sets the newState value for this VmFaultToleranceStateChangedEvent.
     * 
     * @param newState
     */
    public void setNewState(com.vmware.converter.VirtualMachineFaultToleranceState newState) {
        this.newState = newState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmFaultToleranceStateChangedEvent)) return false;
        VmFaultToleranceStateChangedEvent other = (VmFaultToleranceStateChangedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldState==null && other.getOldState()==null) || 
             (this.oldState!=null &&
              this.oldState.equals(other.getOldState()))) &&
            ((this.newState==null && other.getNewState()==null) || 
             (this.newState!=null &&
              this.newState.equals(other.getNewState())));
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
        if (getOldState() != null) {
            _hashCode += getOldState().hashCode();
        }
        if (getNewState() != null) {
            _hashCode += getNewState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmFaultToleranceStateChangedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmFaultToleranceStateChangedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFaultToleranceState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFaultToleranceState"));
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
