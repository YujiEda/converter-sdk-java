/**
 * ProfileMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ProfileMetadata  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String profileTypeName;

    private com.vmware.converter.ExtendedDescription description;

    private com.vmware.converter.ProfileMetadataProfileSortSpec[] sortSpec;

    private java.lang.String profileCategory;

    private java.lang.String profileComponent;

    public ProfileMetadata() {
    }

    public ProfileMetadata(
           java.lang.String key,
           java.lang.String profileTypeName,
           com.vmware.converter.ExtendedDescription description,
           com.vmware.converter.ProfileMetadataProfileSortSpec[] sortSpec,
           java.lang.String profileCategory,
           java.lang.String profileComponent) {
        this.key = key;
        this.profileTypeName = profileTypeName;
        this.description = description;
        this.sortSpec = sortSpec;
        this.profileCategory = profileCategory;
        this.profileComponent = profileComponent;
    }


    /**
     * Gets the key value for this ProfileMetadata.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ProfileMetadata.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the profileTypeName value for this ProfileMetadata.
     * 
     * @return profileTypeName
     */
    public java.lang.String getProfileTypeName() {
        return profileTypeName;
    }


    /**
     * Sets the profileTypeName value for this ProfileMetadata.
     * 
     * @param profileTypeName
     */
    public void setProfileTypeName(java.lang.String profileTypeName) {
        this.profileTypeName = profileTypeName;
    }


    /**
     * Gets the description value for this ProfileMetadata.
     * 
     * @return description
     */
    public com.vmware.converter.ExtendedDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProfileMetadata.
     * 
     * @param description
     */
    public void setDescription(com.vmware.converter.ExtendedDescription description) {
        this.description = description;
    }


    /**
     * Gets the sortSpec value for this ProfileMetadata.
     * 
     * @return sortSpec
     */
    public com.vmware.converter.ProfileMetadataProfileSortSpec[] getSortSpec() {
        return sortSpec;
    }


    /**
     * Sets the sortSpec value for this ProfileMetadata.
     * 
     * @param sortSpec
     */
    public void setSortSpec(com.vmware.converter.ProfileMetadataProfileSortSpec[] sortSpec) {
        this.sortSpec = sortSpec;
    }

    public com.vmware.converter.ProfileMetadataProfileSortSpec getSortSpec(int i) {
        return this.sortSpec[i];
    }

    public void setSortSpec(int i, com.vmware.converter.ProfileMetadataProfileSortSpec _value) {
        this.sortSpec[i] = _value;
    }


    /**
     * Gets the profileCategory value for this ProfileMetadata.
     * 
     * @return profileCategory
     */
    public java.lang.String getProfileCategory() {
        return profileCategory;
    }


    /**
     * Sets the profileCategory value for this ProfileMetadata.
     * 
     * @param profileCategory
     */
    public void setProfileCategory(java.lang.String profileCategory) {
        this.profileCategory = profileCategory;
    }


    /**
     * Gets the profileComponent value for this ProfileMetadata.
     * 
     * @return profileComponent
     */
    public java.lang.String getProfileComponent() {
        return profileComponent;
    }


    /**
     * Sets the profileComponent value for this ProfileMetadata.
     * 
     * @param profileComponent
     */
    public void setProfileComponent(java.lang.String profileComponent) {
        this.profileComponent = profileComponent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileMetadata)) return false;
        ProfileMetadata other = (ProfileMetadata) obj;
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
            ((this.profileTypeName==null && other.getProfileTypeName()==null) || 
             (this.profileTypeName!=null &&
              this.profileTypeName.equals(other.getProfileTypeName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.sortSpec==null && other.getSortSpec()==null) || 
             (this.sortSpec!=null &&
              java.util.Arrays.equals(this.sortSpec, other.getSortSpec()))) &&
            ((this.profileCategory==null && other.getProfileCategory()==null) || 
             (this.profileCategory!=null &&
              this.profileCategory.equals(other.getProfileCategory()))) &&
            ((this.profileComponent==null && other.getProfileComponent()==null) || 
             (this.profileComponent!=null &&
              this.profileComponent.equals(other.getProfileComponent())));
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
        if (getProfileTypeName() != null) {
            _hashCode += getProfileTypeName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSortSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSortSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSortSpec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfileCategory() != null) {
            _hashCode += getProfileCategory().hashCode();
        }
        if (getProfileComponent() != null) {
            _hashCode += getProfileComponent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profileTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtendedDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sortSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileMetadataProfileSortSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profileCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profileComponent"));
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
