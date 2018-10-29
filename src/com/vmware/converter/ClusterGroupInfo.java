/**
 * ClusterGroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ClusterGroupInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean userCreated;

    private java.lang.String uniqueID;

    public ClusterGroupInfo() {
    }

    public ClusterGroupInfo(
           java.lang.String name,
           java.lang.Boolean userCreated,
           java.lang.String uniqueID) {
        this.name = name;
        this.userCreated = userCreated;
        this.uniqueID = uniqueID;
    }


    /**
     * Gets the name value for this ClusterGroupInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ClusterGroupInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the userCreated value for this ClusterGroupInfo.
     * 
     * @return userCreated
     */
    public java.lang.Boolean getUserCreated() {
        return userCreated;
    }


    /**
     * Sets the userCreated value for this ClusterGroupInfo.
     * 
     * @param userCreated
     */
    public void setUserCreated(java.lang.Boolean userCreated) {
        this.userCreated = userCreated;
    }


    /**
     * Gets the uniqueID value for this ClusterGroupInfo.
     * 
     * @return uniqueID
     */
    public java.lang.String getUniqueID() {
        return uniqueID;
    }


    /**
     * Sets the uniqueID value for this ClusterGroupInfo.
     * 
     * @param uniqueID
     */
    public void setUniqueID(java.lang.String uniqueID) {
        this.uniqueID = uniqueID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterGroupInfo)) return false;
        ClusterGroupInfo other = (ClusterGroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.userCreated==null && other.getUserCreated()==null) || 
             (this.userCreated!=null &&
              this.userCreated.equals(other.getUserCreated()))) &&
            ((this.uniqueID==null && other.getUniqueID()==null) || 
             (this.uniqueID!=null &&
              this.uniqueID.equals(other.getUniqueID())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUserCreated() != null) {
            _hashCode += getUserCreated().hashCode();
        }
        if (getUniqueID() != null) {
            _hashCode += getUniqueID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterGroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterGroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uniqueID"));
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
