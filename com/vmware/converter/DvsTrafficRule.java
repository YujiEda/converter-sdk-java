/**
 * DvsTrafficRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsTrafficRule  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String description;

    private java.lang.Integer sequence;

    private com.vmware.converter.DvsNetworkRuleQualifier[] qualifier;

    private com.vmware.converter.DvsNetworkRuleAction action;

    private java.lang.String direction;

    public DvsTrafficRule() {
    }

    public DvsTrafficRule(
           java.lang.String key,
           java.lang.String description,
           java.lang.Integer sequence,
           com.vmware.converter.DvsNetworkRuleQualifier[] qualifier,
           com.vmware.converter.DvsNetworkRuleAction action,
           java.lang.String direction) {
        this.key = key;
        this.description = description;
        this.sequence = sequence;
        this.qualifier = qualifier;
        this.action = action;
        this.direction = direction;
    }


    /**
     * Gets the key value for this DvsTrafficRule.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this DvsTrafficRule.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the description value for this DvsTrafficRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DvsTrafficRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the sequence value for this DvsTrafficRule.
     * 
     * @return sequence
     */
    public java.lang.Integer getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this DvsTrafficRule.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.Integer sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the qualifier value for this DvsTrafficRule.
     * 
     * @return qualifier
     */
    public com.vmware.converter.DvsNetworkRuleQualifier[] getQualifier() {
        return qualifier;
    }


    /**
     * Sets the qualifier value for this DvsTrafficRule.
     * 
     * @param qualifier
     */
    public void setQualifier(com.vmware.converter.DvsNetworkRuleQualifier[] qualifier) {
        this.qualifier = qualifier;
    }

    public com.vmware.converter.DvsNetworkRuleQualifier getQualifier(int i) {
        return this.qualifier[i];
    }

    public void setQualifier(int i, com.vmware.converter.DvsNetworkRuleQualifier _value) {
        this.qualifier[i] = _value;
    }


    /**
     * Gets the action value for this DvsTrafficRule.
     * 
     * @return action
     */
    public com.vmware.converter.DvsNetworkRuleAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this DvsTrafficRule.
     * 
     * @param action
     */
    public void setAction(com.vmware.converter.DvsNetworkRuleAction action) {
        this.action = action;
    }


    /**
     * Gets the direction value for this DvsTrafficRule.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this DvsTrafficRule.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsTrafficRule)) return false;
        DvsTrafficRule other = (DvsTrafficRule) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.qualifier==null && other.getQualifier()==null) || 
             (this.qualifier!=null &&
              java.util.Arrays.equals(this.qualifier, other.getQualifier()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getQualifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQualifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsTrafficRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsTrafficRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "qualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsNetworkRuleQualifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsNetworkRuleAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "direction"));
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
