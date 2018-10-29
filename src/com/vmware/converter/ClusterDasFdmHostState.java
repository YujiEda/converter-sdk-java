/**
 * ClusterDasFdmHostState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterDasFdmHostState  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String state;

    private com.vmware.converter.ManagedObjectReference stateReporter;

    public ClusterDasFdmHostState() {
    }

    public ClusterDasFdmHostState(
           java.lang.String state,
           com.vmware.converter.ManagedObjectReference stateReporter) {
        this.state = state;
        this.stateReporter = stateReporter;
    }


    /**
     * Gets the state value for this ClusterDasFdmHostState.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ClusterDasFdmHostState.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the stateReporter value for this ClusterDasFdmHostState.
     * 
     * @return stateReporter
     */
    public com.vmware.converter.ManagedObjectReference getStateReporter() {
        return stateReporter;
    }


    /**
     * Sets the stateReporter value for this ClusterDasFdmHostState.
     * 
     * @param stateReporter
     */
    public void setStateReporter(com.vmware.converter.ManagedObjectReference stateReporter) {
        this.stateReporter = stateReporter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasFdmHostState)) return false;
        ClusterDasFdmHostState other = (ClusterDasFdmHostState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateReporter==null && other.getStateReporter()==null) || 
             (this.stateReporter!=null &&
              this.stateReporter.equals(other.getStateReporter())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateReporter() != null) {
            _hashCode += getStateReporter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasFdmHostState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFdmHostState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateReporter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "stateReporter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
