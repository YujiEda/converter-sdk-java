/**
 * AlarmSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class AlarmSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String systemName;

    private java.lang.String description;

    private boolean enabled;

    private com.vmware.converter.AlarmExpression expression;

    private com.vmware.converter.AlarmAction action;

    private java.lang.Integer actionFrequency;

    private com.vmware.converter.AlarmSetting setting;

    public AlarmSpec() {
    }

    public AlarmSpec(
           java.lang.String name,
           java.lang.String systemName,
           java.lang.String description,
           boolean enabled,
           com.vmware.converter.AlarmExpression expression,
           com.vmware.converter.AlarmAction action,
           java.lang.Integer actionFrequency,
           com.vmware.converter.AlarmSetting setting) {
        this.name = name;
        this.systemName = systemName;
        this.description = description;
        this.enabled = enabled;
        this.expression = expression;
        this.action = action;
        this.actionFrequency = actionFrequency;
        this.setting = setting;
    }


    /**
     * Gets the name value for this AlarmSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AlarmSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the systemName value for this AlarmSpec.
     * 
     * @return systemName
     */
    public java.lang.String getSystemName() {
        return systemName;
    }


    /**
     * Sets the systemName value for this AlarmSpec.
     * 
     * @param systemName
     */
    public void setSystemName(java.lang.String systemName) {
        this.systemName = systemName;
    }


    /**
     * Gets the description value for this AlarmSpec.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AlarmSpec.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the enabled value for this AlarmSpec.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this AlarmSpec.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the expression value for this AlarmSpec.
     * 
     * @return expression
     */
    public com.vmware.converter.AlarmExpression getExpression() {
        return expression;
    }


    /**
     * Sets the expression value for this AlarmSpec.
     * 
     * @param expression
     */
    public void setExpression(com.vmware.converter.AlarmExpression expression) {
        this.expression = expression;
    }


    /**
     * Gets the action value for this AlarmSpec.
     * 
     * @return action
     */
    public com.vmware.converter.AlarmAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this AlarmSpec.
     * 
     * @param action
     */
    public void setAction(com.vmware.converter.AlarmAction action) {
        this.action = action;
    }


    /**
     * Gets the actionFrequency value for this AlarmSpec.
     * 
     * @return actionFrequency
     */
    public java.lang.Integer getActionFrequency() {
        return actionFrequency;
    }


    /**
     * Sets the actionFrequency value for this AlarmSpec.
     * 
     * @param actionFrequency
     */
    public void setActionFrequency(java.lang.Integer actionFrequency) {
        this.actionFrequency = actionFrequency;
    }


    /**
     * Gets the setting value for this AlarmSpec.
     * 
     * @return setting
     */
    public com.vmware.converter.AlarmSetting getSetting() {
        return setting;
    }


    /**
     * Sets the setting value for this AlarmSpec.
     * 
     * @param setting
     */
    public void setSetting(com.vmware.converter.AlarmSetting setting) {
        this.setting = setting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmSpec)) return false;
        AlarmSpec other = (AlarmSpec) obj;
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
            ((this.systemName==null && other.getSystemName()==null) || 
             (this.systemName!=null &&
              this.systemName.equals(other.getSystemName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.enabled == other.isEnabled() &&
            ((this.expression==null && other.getExpression()==null) || 
             (this.expression!=null &&
              this.expression.equals(other.getExpression()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.actionFrequency==null && other.getActionFrequency()==null) || 
             (this.actionFrequency!=null &&
              this.actionFrequency.equals(other.getActionFrequency()))) &&
            ((this.setting==null && other.getSetting()==null) || 
             (this.setting!=null &&
              this.setting.equals(other.getSetting())));
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
        if (getSystemName() != null) {
            _hashCode += getSystemName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExpression() != null) {
            _hashCode += getExpression().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getActionFrequency() != null) {
            _hashCode += getActionFrequency().hashCode();
        }
        if (getSetting() != null) {
            _hashCode += getSetting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "systemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expression");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "expression"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmExpression"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "actionFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "setting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmSetting"));
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
