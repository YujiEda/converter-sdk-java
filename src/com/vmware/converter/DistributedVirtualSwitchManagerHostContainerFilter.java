/**
 * DistributedVirtualSwitchManagerHostContainerFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchManagerHostContainerFilter  extends com.vmware.converter.DistributedVirtualSwitchManagerHostDvsFilterSpec  implements java.io.Serializable {
    private com.vmware.converter.DistributedVirtualSwitchManagerHostContainer hostContainer;

    public DistributedVirtualSwitchManagerHostContainerFilter() {
    }

    public DistributedVirtualSwitchManagerHostContainerFilter(
           boolean inclusive,
           com.vmware.converter.DistributedVirtualSwitchManagerHostContainer hostContainer) {
        super(
            inclusive);
        this.hostContainer = hostContainer;
    }


    /**
     * Gets the hostContainer value for this DistributedVirtualSwitchManagerHostContainerFilter.
     * 
     * @return hostContainer
     */
    public com.vmware.converter.DistributedVirtualSwitchManagerHostContainer getHostContainer() {
        return hostContainer;
    }


    /**
     * Sets the hostContainer value for this DistributedVirtualSwitchManagerHostContainerFilter.
     * 
     * @param hostContainer
     */
    public void setHostContainer(com.vmware.converter.DistributedVirtualSwitchManagerHostContainer hostContainer) {
        this.hostContainer = hostContainer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchManagerHostContainerFilter)) return false;
        DistributedVirtualSwitchManagerHostContainerFilter other = (DistributedVirtualSwitchManagerHostContainerFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostContainer==null && other.getHostContainer()==null) || 
             (this.hostContainer!=null &&
              this.hostContainer.equals(other.getHostContainer())));
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
        if (getHostContainer() != null) {
            _hashCode += getHostContainer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchManagerHostContainerFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerHostContainerFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerHostContainer"));
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
