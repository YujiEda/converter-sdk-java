/**
 * IscsiMigrationDependency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IscsiMigrationDependency  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean migrationAllowed;

    private com.vmware.converter.IscsiStatus disallowReason;

    private com.vmware.converter.IscsiDependencyEntity[] dependency;

    public IscsiMigrationDependency() {
    }

    public IscsiMigrationDependency(
           boolean migrationAllowed,
           com.vmware.converter.IscsiStatus disallowReason,
           com.vmware.converter.IscsiDependencyEntity[] dependency) {
        this.migrationAllowed = migrationAllowed;
        this.disallowReason = disallowReason;
        this.dependency = dependency;
    }


    /**
     * Gets the migrationAllowed value for this IscsiMigrationDependency.
     * 
     * @return migrationAllowed
     */
    public boolean isMigrationAllowed() {
        return migrationAllowed;
    }


    /**
     * Sets the migrationAllowed value for this IscsiMigrationDependency.
     * 
     * @param migrationAllowed
     */
    public void setMigrationAllowed(boolean migrationAllowed) {
        this.migrationAllowed = migrationAllowed;
    }


    /**
     * Gets the disallowReason value for this IscsiMigrationDependency.
     * 
     * @return disallowReason
     */
    public com.vmware.converter.IscsiStatus getDisallowReason() {
        return disallowReason;
    }


    /**
     * Sets the disallowReason value for this IscsiMigrationDependency.
     * 
     * @param disallowReason
     */
    public void setDisallowReason(com.vmware.converter.IscsiStatus disallowReason) {
        this.disallowReason = disallowReason;
    }


    /**
     * Gets the dependency value for this IscsiMigrationDependency.
     * 
     * @return dependency
     */
    public com.vmware.converter.IscsiDependencyEntity[] getDependency() {
        return dependency;
    }


    /**
     * Sets the dependency value for this IscsiMigrationDependency.
     * 
     * @param dependency
     */
    public void setDependency(com.vmware.converter.IscsiDependencyEntity[] dependency) {
        this.dependency = dependency;
    }

    public com.vmware.converter.IscsiDependencyEntity getDependency(int i) {
        return this.dependency[i];
    }

    public void setDependency(int i, com.vmware.converter.IscsiDependencyEntity _value) {
        this.dependency[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IscsiMigrationDependency)) return false;
        IscsiMigrationDependency other = (IscsiMigrationDependency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.migrationAllowed == other.isMigrationAllowed() &&
            ((this.disallowReason==null && other.getDisallowReason()==null) || 
             (this.disallowReason!=null &&
              this.disallowReason.equals(other.getDisallowReason()))) &&
            ((this.dependency==null && other.getDependency()==null) || 
             (this.dependency!=null &&
              java.util.Arrays.equals(this.dependency, other.getDependency())));
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
        _hashCode += (isMigrationAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDisallowReason() != null) {
            _hashCode += getDisallowReason().hashCode();
        }
        if (getDependency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDependency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDependency(), i);
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
        new org.apache.axis.description.TypeDesc(IscsiMigrationDependency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiMigrationDependency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migrationAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "migrationAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disallowReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disallowReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dependency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiDependencyEntity"));
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
