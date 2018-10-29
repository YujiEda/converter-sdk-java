/**
 * OvfCreateImportSpecParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class OvfCreateImportSpecParams  extends com.vmware.converter.OvfManagerCommonParams  implements java.io.Serializable {
    private java.lang.String entityName;

    private com.vmware.converter.ManagedObjectReference hostSystem;

    private com.vmware.converter.OvfNetworkMapping[] networkMapping;

    private java.lang.String ipAllocationPolicy;

    private java.lang.String ipProtocol;

    private com.vmware.converter.KeyValue[] propertyMapping;

    private com.vmware.converter.OvfResourceMap[] resourceMapping;

    private java.lang.String diskProvisioning;

    private com.vmware.converter.OvfConsumerOstNode instantiationOst;

    public OvfCreateImportSpecParams() {
    }

    public OvfCreateImportSpecParams(
           java.lang.String locale,
           java.lang.String deploymentOption,
           com.vmware.converter.KeyValue[] msgBundle,
           java.lang.String[] importOption,
           java.lang.String entityName,
           com.vmware.converter.ManagedObjectReference hostSystem,
           com.vmware.converter.OvfNetworkMapping[] networkMapping,
           java.lang.String ipAllocationPolicy,
           java.lang.String ipProtocol,
           com.vmware.converter.KeyValue[] propertyMapping,
           com.vmware.converter.OvfResourceMap[] resourceMapping,
           java.lang.String diskProvisioning,
           com.vmware.converter.OvfConsumerOstNode instantiationOst) {
        super(
            locale,
            deploymentOption,
            msgBundle,
            importOption);
        this.entityName = entityName;
        this.hostSystem = hostSystem;
        this.networkMapping = networkMapping;
        this.ipAllocationPolicy = ipAllocationPolicy;
        this.ipProtocol = ipProtocol;
        this.propertyMapping = propertyMapping;
        this.resourceMapping = resourceMapping;
        this.diskProvisioning = diskProvisioning;
        this.instantiationOst = instantiationOst;
    }


    /**
     * Gets the entityName value for this OvfCreateImportSpecParams.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this OvfCreateImportSpecParams.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the hostSystem value for this OvfCreateImportSpecParams.
     * 
     * @return hostSystem
     */
    public com.vmware.converter.ManagedObjectReference getHostSystem() {
        return hostSystem;
    }


    /**
     * Sets the hostSystem value for this OvfCreateImportSpecParams.
     * 
     * @param hostSystem
     */
    public void setHostSystem(com.vmware.converter.ManagedObjectReference hostSystem) {
        this.hostSystem = hostSystem;
    }


    /**
     * Gets the networkMapping value for this OvfCreateImportSpecParams.
     * 
     * @return networkMapping
     */
    public com.vmware.converter.OvfNetworkMapping[] getNetworkMapping() {
        return networkMapping;
    }


    /**
     * Sets the networkMapping value for this OvfCreateImportSpecParams.
     * 
     * @param networkMapping
     */
    public void setNetworkMapping(com.vmware.converter.OvfNetworkMapping[] networkMapping) {
        this.networkMapping = networkMapping;
    }

    public com.vmware.converter.OvfNetworkMapping getNetworkMapping(int i) {
        return this.networkMapping[i];
    }

    public void setNetworkMapping(int i, com.vmware.converter.OvfNetworkMapping _value) {
        this.networkMapping[i] = _value;
    }


    /**
     * Gets the ipAllocationPolicy value for this OvfCreateImportSpecParams.
     * 
     * @return ipAllocationPolicy
     */
    public java.lang.String getIpAllocationPolicy() {
        return ipAllocationPolicy;
    }


    /**
     * Sets the ipAllocationPolicy value for this OvfCreateImportSpecParams.
     * 
     * @param ipAllocationPolicy
     */
    public void setIpAllocationPolicy(java.lang.String ipAllocationPolicy) {
        this.ipAllocationPolicy = ipAllocationPolicy;
    }


    /**
     * Gets the ipProtocol value for this OvfCreateImportSpecParams.
     * 
     * @return ipProtocol
     */
    public java.lang.String getIpProtocol() {
        return ipProtocol;
    }


    /**
     * Sets the ipProtocol value for this OvfCreateImportSpecParams.
     * 
     * @param ipProtocol
     */
    public void setIpProtocol(java.lang.String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }


    /**
     * Gets the propertyMapping value for this OvfCreateImportSpecParams.
     * 
     * @return propertyMapping
     */
    public com.vmware.converter.KeyValue[] getPropertyMapping() {
        return propertyMapping;
    }


    /**
     * Sets the propertyMapping value for this OvfCreateImportSpecParams.
     * 
     * @param propertyMapping
     */
    public void setPropertyMapping(com.vmware.converter.KeyValue[] propertyMapping) {
        this.propertyMapping = propertyMapping;
    }

    public com.vmware.converter.KeyValue getPropertyMapping(int i) {
        return this.propertyMapping[i];
    }

    public void setPropertyMapping(int i, com.vmware.converter.KeyValue _value) {
        this.propertyMapping[i] = _value;
    }


    /**
     * Gets the resourceMapping value for this OvfCreateImportSpecParams.
     * 
     * @return resourceMapping
     */
    public com.vmware.converter.OvfResourceMap[] getResourceMapping() {
        return resourceMapping;
    }


    /**
     * Sets the resourceMapping value for this OvfCreateImportSpecParams.
     * 
     * @param resourceMapping
     */
    public void setResourceMapping(com.vmware.converter.OvfResourceMap[] resourceMapping) {
        this.resourceMapping = resourceMapping;
    }

    public com.vmware.converter.OvfResourceMap getResourceMapping(int i) {
        return this.resourceMapping[i];
    }

    public void setResourceMapping(int i, com.vmware.converter.OvfResourceMap _value) {
        this.resourceMapping[i] = _value;
    }


    /**
     * Gets the diskProvisioning value for this OvfCreateImportSpecParams.
     * 
     * @return diskProvisioning
     */
    public java.lang.String getDiskProvisioning() {
        return diskProvisioning;
    }


    /**
     * Sets the diskProvisioning value for this OvfCreateImportSpecParams.
     * 
     * @param diskProvisioning
     */
    public void setDiskProvisioning(java.lang.String diskProvisioning) {
        this.diskProvisioning = diskProvisioning;
    }


    /**
     * Gets the instantiationOst value for this OvfCreateImportSpecParams.
     * 
     * @return instantiationOst
     */
    public com.vmware.converter.OvfConsumerOstNode getInstantiationOst() {
        return instantiationOst;
    }


    /**
     * Sets the instantiationOst value for this OvfCreateImportSpecParams.
     * 
     * @param instantiationOst
     */
    public void setInstantiationOst(com.vmware.converter.OvfConsumerOstNode instantiationOst) {
        this.instantiationOst = instantiationOst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfCreateImportSpecParams)) return false;
        OvfCreateImportSpecParams other = (OvfCreateImportSpecParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.hostSystem==null && other.getHostSystem()==null) || 
             (this.hostSystem!=null &&
              this.hostSystem.equals(other.getHostSystem()))) &&
            ((this.networkMapping==null && other.getNetworkMapping()==null) || 
             (this.networkMapping!=null &&
              java.util.Arrays.equals(this.networkMapping, other.getNetworkMapping()))) &&
            ((this.ipAllocationPolicy==null && other.getIpAllocationPolicy()==null) || 
             (this.ipAllocationPolicy!=null &&
              this.ipAllocationPolicy.equals(other.getIpAllocationPolicy()))) &&
            ((this.ipProtocol==null && other.getIpProtocol()==null) || 
             (this.ipProtocol!=null &&
              this.ipProtocol.equals(other.getIpProtocol()))) &&
            ((this.propertyMapping==null && other.getPropertyMapping()==null) || 
             (this.propertyMapping!=null &&
              java.util.Arrays.equals(this.propertyMapping, other.getPropertyMapping()))) &&
            ((this.resourceMapping==null && other.getResourceMapping()==null) || 
             (this.resourceMapping!=null &&
              java.util.Arrays.equals(this.resourceMapping, other.getResourceMapping()))) &&
            ((this.diskProvisioning==null && other.getDiskProvisioning()==null) || 
             (this.diskProvisioning!=null &&
              this.diskProvisioning.equals(other.getDiskProvisioning()))) &&
            ((this.instantiationOst==null && other.getInstantiationOst()==null) || 
             (this.instantiationOst!=null &&
              this.instantiationOst.equals(other.getInstantiationOst())));
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
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getHostSystem() != null) {
            _hashCode += getHostSystem().hashCode();
        }
        if (getNetworkMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpAllocationPolicy() != null) {
            _hashCode += getIpAllocationPolicy().hashCode();
        }
        if (getIpProtocol() != null) {
            _hashCode += getIpProtocol().hashCode();
        }
        if (getPropertyMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiskProvisioning() != null) {
            _hashCode += getDiskProvisioning().hashCode();
        }
        if (getInstantiationOst() != null) {
            _hashCode += getInstantiationOst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfCreateImportSpecParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfCreateImportSpecParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfNetworkMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAllocationPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAllocationPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propertyMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourceMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfResourceMap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskProvisioning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskProvisioning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instantiationOst");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instantiationOst"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfConsumerOstNode"));
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
