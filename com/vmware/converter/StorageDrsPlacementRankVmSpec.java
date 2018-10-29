/**
 * StorageDrsPlacementRankVmSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class StorageDrsPlacementRankVmSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.PlacementSpec vmPlacementSpec;

    private com.vmware.converter.ManagedObjectReference[] vmClusters;

    public StorageDrsPlacementRankVmSpec() {
    }

    public StorageDrsPlacementRankVmSpec(
           com.vmware.converter.PlacementSpec vmPlacementSpec,
           com.vmware.converter.ManagedObjectReference[] vmClusters) {
        this.vmPlacementSpec = vmPlacementSpec;
        this.vmClusters = vmClusters;
    }


    /**
     * Gets the vmPlacementSpec value for this StorageDrsPlacementRankVmSpec.
     * 
     * @return vmPlacementSpec
     */
    public com.vmware.converter.PlacementSpec getVmPlacementSpec() {
        return vmPlacementSpec;
    }


    /**
     * Sets the vmPlacementSpec value for this StorageDrsPlacementRankVmSpec.
     * 
     * @param vmPlacementSpec
     */
    public void setVmPlacementSpec(com.vmware.converter.PlacementSpec vmPlacementSpec) {
        this.vmPlacementSpec = vmPlacementSpec;
    }


    /**
     * Gets the vmClusters value for this StorageDrsPlacementRankVmSpec.
     * 
     * @return vmClusters
     */
    public com.vmware.converter.ManagedObjectReference[] getVmClusters() {
        return vmClusters;
    }


    /**
     * Sets the vmClusters value for this StorageDrsPlacementRankVmSpec.
     * 
     * @param vmClusters
     */
    public void setVmClusters(com.vmware.converter.ManagedObjectReference[] vmClusters) {
        this.vmClusters = vmClusters;
    }

    public com.vmware.converter.ManagedObjectReference getVmClusters(int i) {
        return this.vmClusters[i];
    }

    public void setVmClusters(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.vmClusters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageDrsPlacementRankVmSpec)) return false;
        StorageDrsPlacementRankVmSpec other = (StorageDrsPlacementRankVmSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmPlacementSpec==null && other.getVmPlacementSpec()==null) || 
             (this.vmPlacementSpec!=null &&
              this.vmPlacementSpec.equals(other.getVmPlacementSpec()))) &&
            ((this.vmClusters==null && other.getVmClusters()==null) || 
             (this.vmClusters!=null &&
              java.util.Arrays.equals(this.vmClusters, other.getVmClusters())));
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
        if (getVmPlacementSpec() != null) {
            _hashCode += getVmPlacementSpec().hashCode();
        }
        if (getVmClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmClusters(), i);
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
        new org.apache.axis.description.TypeDesc(StorageDrsPlacementRankVmSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsPlacementRankVmSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmPlacementSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmPlacementSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
