/**
 * StorageDrsConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.StorageDrsPodConfigSpec podConfigSpec;

    private com.vmware.converter.StorageDrsVmConfigSpec[] vmConfigSpec;

    public StorageDrsConfigSpec() {
    }

    public StorageDrsConfigSpec(
           com.vmware.converter.StorageDrsPodConfigSpec podConfigSpec,
           com.vmware.converter.StorageDrsVmConfigSpec[] vmConfigSpec) {
        this.podConfigSpec = podConfigSpec;
        this.vmConfigSpec = vmConfigSpec;
    }


    /**
     * Gets the podConfigSpec value for this StorageDrsConfigSpec.
     * 
     * @return podConfigSpec
     */
    public com.vmware.converter.StorageDrsPodConfigSpec getPodConfigSpec() {
        return podConfigSpec;
    }


    /**
     * Sets the podConfigSpec value for this StorageDrsConfigSpec.
     * 
     * @param podConfigSpec
     */
    public void setPodConfigSpec(com.vmware.converter.StorageDrsPodConfigSpec podConfigSpec) {
        this.podConfigSpec = podConfigSpec;
    }


    /**
     * Gets the vmConfigSpec value for this StorageDrsConfigSpec.
     * 
     * @return vmConfigSpec
     */
    public com.vmware.converter.StorageDrsVmConfigSpec[] getVmConfigSpec() {
        return vmConfigSpec;
    }


    /**
     * Sets the vmConfigSpec value for this StorageDrsConfigSpec.
     * 
     * @param vmConfigSpec
     */
    public void setVmConfigSpec(com.vmware.converter.StorageDrsVmConfigSpec[] vmConfigSpec) {
        this.vmConfigSpec = vmConfigSpec;
    }

    public com.vmware.converter.StorageDrsVmConfigSpec getVmConfigSpec(int i) {
        return this.vmConfigSpec[i];
    }

    public void setVmConfigSpec(int i, com.vmware.converter.StorageDrsVmConfigSpec _value) {
        this.vmConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsConfigSpec)) return false;
        StorageDrsConfigSpec other = (StorageDrsConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.podConfigSpec==null && other.getPodConfigSpec()==null) || 
             (this.podConfigSpec!=null &&
              this.podConfigSpec.equals(other.getPodConfigSpec()))) &&
            ((this.vmConfigSpec==null && other.getVmConfigSpec()==null) || 
             (this.vmConfigSpec!=null &&
              java.util.Arrays.equals(this.vmConfigSpec, other.getVmConfigSpec())));
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
        if (getPodConfigSpec() != null) {
            _hashCode += getPodConfigSpec().hashCode();
        }
        if (getVmConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmConfigSpec(), i);
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
        new org.apache.axis.description.TypeDesc(StorageDrsConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("podConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "podConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsPodConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsVmConfigSpec"));
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
