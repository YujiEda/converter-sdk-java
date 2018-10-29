/**
 * DVSNetworkResourcePoolConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DVSNetworkResourcePoolConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String configVersion;

    private com.vmware.converter.DVSNetworkResourcePoolAllocationInfo allocationInfo;

    private java.lang.String name;

    private java.lang.String description;

    public DVSNetworkResourcePoolConfigSpec() {
    }

    public DVSNetworkResourcePoolConfigSpec(
           java.lang.String key,
           java.lang.String configVersion,
           com.vmware.converter.DVSNetworkResourcePoolAllocationInfo allocationInfo,
           java.lang.String name,
           java.lang.String description) {
        this.key = key;
        this.configVersion = configVersion;
        this.allocationInfo = allocationInfo;
        this.name = name;
        this.description = description;
    }


    /**
     * Gets the key value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the configVersion value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @return configVersion
     */
    public java.lang.String getConfigVersion() {
        return configVersion;
    }


    /**
     * Sets the configVersion value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @param configVersion
     */
    public void setConfigVersion(java.lang.String configVersion) {
        this.configVersion = configVersion;
    }


    /**
     * Gets the allocationInfo value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @return allocationInfo
     */
    public com.vmware.converter.DVSNetworkResourcePoolAllocationInfo getAllocationInfo() {
        return allocationInfo;
    }


    /**
     * Sets the allocationInfo value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @param allocationInfo
     */
    public void setAllocationInfo(com.vmware.converter.DVSNetworkResourcePoolAllocationInfo allocationInfo) {
        this.allocationInfo = allocationInfo;
    }


    /**
     * Gets the name value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DVSNetworkResourcePoolConfigSpec.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSNetworkResourcePoolConfigSpec)) return false;
        DVSNetworkResourcePoolConfigSpec other = (DVSNetworkResourcePoolConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.configVersion==null && other.getConfigVersion()==null) || 
             (this.configVersion!=null &&
              this.configVersion.equals(other.getConfigVersion()))) &&
            ((this.allocationInfo==null && other.getAllocationInfo()==null) || 
             (this.allocationInfo!=null &&
              this.allocationInfo.equals(other.getAllocationInfo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getConfigVersion() != null) {
            _hashCode += getConfigVersion().hashCode();
        }
        if (getAllocationInfo() != null) {
            _hashCode += getAllocationInfo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSNetworkResourcePoolConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSNetworkResourcePoolConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allocationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSNetworkResourcePoolAllocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
