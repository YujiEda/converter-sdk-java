/**
 * FileBackedVirtualDiskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class FileBackedVirtualDiskSpec  extends com.vmware.converter.VirtualDiskSpec  implements java.io.Serializable {
    private long capacityKb;

    private com.vmware.converter.VirtualMachineProfileSpec[] profile;

    public FileBackedVirtualDiskSpec() {
    }

    public FileBackedVirtualDiskSpec(
           java.lang.String diskType,
           java.lang.String adapterType,
           long capacityKb,
           com.vmware.converter.VirtualMachineProfileSpec[] profile) {
        super(
            diskType,
            adapterType);
        this.capacityKb = capacityKb;
        this.profile = profile;
    }


    /**
     * Gets the capacityKb value for this FileBackedVirtualDiskSpec.
     * 
     * @return capacityKb
     */
    public long getCapacityKb() {
        return capacityKb;
    }


    /**
     * Sets the capacityKb value for this FileBackedVirtualDiskSpec.
     * 
     * @param capacityKb
     */
    public void setCapacityKb(long capacityKb) {
        this.capacityKb = capacityKb;
    }


    /**
     * Gets the profile value for this FileBackedVirtualDiskSpec.
     * 
     * @return profile
     */
    public com.vmware.converter.VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this FileBackedVirtualDiskSpec.
     * 
     * @param profile
     */
    public void setProfile(com.vmware.converter.VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public com.vmware.converter.VirtualMachineProfileSpec getProfile(int i) {
        return this.profile[i];
    }

    public void setProfile(int i, com.vmware.converter.VirtualMachineProfileSpec _value) {
        this.profile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileBackedVirtualDiskSpec)) return false;
        FileBackedVirtualDiskSpec other = (FileBackedVirtualDiskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.capacityKb == other.getCapacityKb() &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              java.util.Arrays.equals(this.profile, other.getProfile())));
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
        _hashCode += new Long(getCapacityKb()).hashCode();
        if (getProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfile(), i);
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
        new org.apache.axis.description.TypeDesc(FileBackedVirtualDiskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FileBackedVirtualDiskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityKb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacityKb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineProfileSpec"));
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
