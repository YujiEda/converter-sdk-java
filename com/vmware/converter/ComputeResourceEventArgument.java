/**
 * ComputeResourceEventArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ComputeResourceEventArgument  extends com.vmware.converter.EntityEventArgument  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference computeResource;

    public ComputeResourceEventArgument() {
    }

    public ComputeResourceEventArgument(
           java.lang.String name,
           com.vmware.converter.ManagedObjectReference computeResource) {
        super(
            name);
        this.computeResource = computeResource;
    }


    /**
     * Gets the computeResource value for this ComputeResourceEventArgument.
     * 
     * @return computeResource
     */
    public com.vmware.converter.ManagedObjectReference getComputeResource() {
        return computeResource;
    }


    /**
     * Sets the computeResource value for this ComputeResourceEventArgument.
     * 
     * @param computeResource
     */
    public void setComputeResource(com.vmware.converter.ManagedObjectReference computeResource) {
        this.computeResource = computeResource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComputeResourceEventArgument)) return false;
        ComputeResourceEventArgument other = (ComputeResourceEventArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.computeResource==null && other.getComputeResource()==null) || 
             (this.computeResource!=null &&
              this.computeResource.equals(other.getComputeResource())));
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
        if (getComputeResource() != null) {
            _hashCode += getComputeResource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComputeResourceEventArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComputeResourceEventArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "computeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
