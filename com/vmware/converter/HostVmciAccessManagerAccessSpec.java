/**
 * HostVmciAccessManagerAccessSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVmciAccessManagerAccessSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference vm;

    private java.lang.String[] services;

    private java.lang.String mode;

    public HostVmciAccessManagerAccessSpec() {
    }

    public HostVmciAccessManagerAccessSpec(
           com.vmware.converter.ManagedObjectReference vm,
           java.lang.String[] services,
           java.lang.String mode) {
        this.vm = vm;
        this.services = services;
        this.mode = mode;
    }


    /**
     * Gets the vm value for this HostVmciAccessManagerAccessSpec.
     * 
     * @return vm
     */
    public com.vmware.converter.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this HostVmciAccessManagerAccessSpec.
     * 
     * @param vm
     */
    public void setVm(com.vmware.converter.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the services value for this HostVmciAccessManagerAccessSpec.
     * 
     * @return services
     */
    public java.lang.String[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this HostVmciAccessManagerAccessSpec.
     * 
     * @param services
     */
    public void setServices(java.lang.String[] services) {
        this.services = services;
    }

    public java.lang.String getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, java.lang.String _value) {
        this.services[i] = _value;
    }


    /**
     * Gets the mode value for this HostVmciAccessManagerAccessSpec.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this HostVmciAccessManagerAccessSpec.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVmciAccessManagerAccessSpec)) return false;
        HostVmciAccessManagerAccessSpec other = (HostVmciAccessManagerAccessSpec) obj;
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
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode())));
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
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVmciAccessManagerAccessSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVmciAccessManagerAccessSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
