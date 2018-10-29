/**
 * DvsVnicAllocatedResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsVnicAllocatedResource  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private java.lang.String vnicKey;

    private java.lang.Long reservation;

    public DvsVnicAllocatedResource() {
    }

    public DvsVnicAllocatedResource(
           com.vmware.converter.ManagedObjectReference vm,
           java.lang.String vnicKey,
           java.lang.Long reservation) {
        this.vm = vm;
        this.vnicKey = vnicKey;
        this.reservation = reservation;
    }


    /**
     * Gets the vm value for this DvsVnicAllocatedResource.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this DvsVnicAllocatedResource.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the vnicKey value for this DvsVnicAllocatedResource.
     * 
     * @return vnicKey
     */
    public java.lang.String getVnicKey() {
        return vnicKey;
    }


    /**
     * Sets the vnicKey value for this DvsVnicAllocatedResource.
     * 
     * @param vnicKey
     */
    public void setVnicKey(java.lang.String vnicKey) {
        this.vnicKey = vnicKey;
    }


    /**
     * Gets the reservation value for this DvsVnicAllocatedResource.
     * 
     * @return reservation
     */
    public java.lang.Long getReservation() {
        return reservation;
    }


    /**
     * Sets the reservation value for this DvsVnicAllocatedResource.
     * 
     * @param reservation
     */
    public void setReservation(java.lang.Long reservation) {
        this.reservation = reservation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsVnicAllocatedResource)) return false;
        DvsVnicAllocatedResource other = (DvsVnicAllocatedResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.vnicKey==null && other.getVnicKey()==null) || 
             (this.vnicKey!=null &&
              this.vnicKey.equals(other.getVnicKey()))) &&
            ((this.reservation==null && other.getReservation()==null) || 
             (this.reservation!=null &&
              this.reservation.equals(other.getReservation())));
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
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getVnicKey() != null) {
            _hashCode += getVnicKey().hashCode();
        }
        if (getReservation() != null) {
            _hashCode += getReservation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsVnicAllocatedResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsVnicAllocatedResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnicKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnicKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
