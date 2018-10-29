/**
 * DistributedVirtualSwitchManagerImportResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchManagerImportResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ManagedObjectReference[] distributedVirtualSwitch;

    private com.vmware.converter.ManagedObjectReference[] distributedVirtualPortgroup;

    private com.vmware.converter.ImportOperationBulkFaultFaultOnImport[] importFault;

    public DistributedVirtualSwitchManagerImportResult() {
    }

    public DistributedVirtualSwitchManagerImportResult(
           com.vmware.converter.ManagedObjectReference[] distributedVirtualSwitch,
           com.vmware.converter.ManagedObjectReference[] distributedVirtualPortgroup,
           com.vmware.converter.ImportOperationBulkFaultFaultOnImport[] importFault) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
        this.importFault = importFault;
    }


    /**
     * Gets the distributedVirtualSwitch value for this DistributedVirtualSwitchManagerImportResult.
     * 
     * @return distributedVirtualSwitch
     */
    public com.vmware.converter.ManagedObjectReference[] getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }


    /**
     * Sets the distributedVirtualSwitch value for this DistributedVirtualSwitchManagerImportResult.
     * 
     * @param distributedVirtualSwitch
     */
    public void setDistributedVirtualSwitch(com.vmware.converter.ManagedObjectReference[] distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public com.vmware.converter.ManagedObjectReference getDistributedVirtualSwitch(int i) {
        return this.distributedVirtualSwitch[i];
    }

    public void setDistributedVirtualSwitch(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.distributedVirtualSwitch[i] = _value;
    }


    /**
     * Gets the distributedVirtualPortgroup value for this DistributedVirtualSwitchManagerImportResult.
     * 
     * @return distributedVirtualPortgroup
     */
    public com.vmware.converter.ManagedObjectReference[] getDistributedVirtualPortgroup() {
        return distributedVirtualPortgroup;
    }


    /**
     * Sets the distributedVirtualPortgroup value for this DistributedVirtualSwitchManagerImportResult.
     * 
     * @param distributedVirtualPortgroup
     */
    public void setDistributedVirtualPortgroup(com.vmware.converter.ManagedObjectReference[] distributedVirtualPortgroup) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
    }

    public com.vmware.converter.ManagedObjectReference getDistributedVirtualPortgroup(int i) {
        return this.distributedVirtualPortgroup[i];
    }

    public void setDistributedVirtualPortgroup(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.distributedVirtualPortgroup[i] = _value;
    }


    /**
     * Gets the importFault value for this DistributedVirtualSwitchManagerImportResult.
     * 
     * @return importFault
     */
    public com.vmware.converter.ImportOperationBulkFaultFaultOnImport[] getImportFault() {
        return importFault;
    }


    /**
     * Sets the importFault value for this DistributedVirtualSwitchManagerImportResult.
     * 
     * @param importFault
     */
    public void setImportFault(com.vmware.converter.ImportOperationBulkFaultFaultOnImport[] importFault) {
        this.importFault = importFault;
    }

    public com.vmware.converter.ImportOperationBulkFaultFaultOnImport getImportFault(int i) {
        return this.importFault[i];
    }

    public void setImportFault(int i, com.vmware.converter.ImportOperationBulkFaultFaultOnImport _value) {
        this.importFault[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchManagerImportResult)) return false;
        DistributedVirtualSwitchManagerImportResult other = (DistributedVirtualSwitchManagerImportResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.distributedVirtualSwitch==null && other.getDistributedVirtualSwitch()==null) || 
             (this.distributedVirtualSwitch!=null &&
              java.util.Arrays.equals(this.distributedVirtualSwitch, other.getDistributedVirtualSwitch()))) &&
            ((this.distributedVirtualPortgroup==null && other.getDistributedVirtualPortgroup()==null) || 
             (this.distributedVirtualPortgroup!=null &&
              java.util.Arrays.equals(this.distributedVirtualPortgroup, other.getDistributedVirtualPortgroup()))) &&
            ((this.importFault==null && other.getImportFault()==null) || 
             (this.importFault!=null &&
              java.util.Arrays.equals(this.importFault, other.getImportFault())));
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
        if (getDistributedVirtualSwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualSwitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualSwitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistributedVirtualPortgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualPortgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualPortgroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImportFault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImportFault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImportFault(), i);
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
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchManagerImportResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchManagerImportResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualPortgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualPortgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importFault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "importFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ImportOperationBulkFaultFaultOnImport"));
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
