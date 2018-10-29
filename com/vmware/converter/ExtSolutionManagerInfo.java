/**
 * ExtSolutionManagerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ExtSolutionManagerInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ExtSolutionManagerInfoTabInfo[] tab;

    private java.lang.String smallIconUrl;

    public ExtSolutionManagerInfo() {
    }

    public ExtSolutionManagerInfo(
           com.vmware.converter.ExtSolutionManagerInfoTabInfo[] tab,
           java.lang.String smallIconUrl) {
        this.tab = tab;
        this.smallIconUrl = smallIconUrl;
    }


    /**
     * Gets the tab value for this ExtSolutionManagerInfo.
     * 
     * @return tab
     */
    public com.vmware.converter.ExtSolutionManagerInfoTabInfo[] getTab() {
        return tab;
    }


    /**
     * Sets the tab value for this ExtSolutionManagerInfo.
     * 
     * @param tab
     */
    public void setTab(com.vmware.converter.ExtSolutionManagerInfoTabInfo[] tab) {
        this.tab = tab;
    }

    public com.vmware.converter.ExtSolutionManagerInfoTabInfo getTab(int i) {
        return this.tab[i];
    }

    public void setTab(int i, com.vmware.converter.ExtSolutionManagerInfoTabInfo _value) {
        this.tab[i] = _value;
    }


    /**
     * Gets the smallIconUrl value for this ExtSolutionManagerInfo.
     * 
     * @return smallIconUrl
     */
    public java.lang.String getSmallIconUrl() {
        return smallIconUrl;
    }


    /**
     * Sets the smallIconUrl value for this ExtSolutionManagerInfo.
     * 
     * @param smallIconUrl
     */
    public void setSmallIconUrl(java.lang.String smallIconUrl) {
        this.smallIconUrl = smallIconUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtSolutionManagerInfo)) return false;
        ExtSolutionManagerInfo other = (ExtSolutionManagerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tab==null && other.getTab()==null) || 
             (this.tab!=null &&
              java.util.Arrays.equals(this.tab, other.getTab()))) &&
            ((this.smallIconUrl==null && other.getSmallIconUrl()==null) || 
             (this.smallIconUrl!=null &&
              this.smallIconUrl.equals(other.getSmallIconUrl())));
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
        if (getTab() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTab());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTab(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSmallIconUrl() != null) {
            _hashCode += getSmallIconUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtSolutionManagerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtSolutionManagerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tab");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tab"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtSolutionManagerInfoTabInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallIconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "smallIconUrl"));
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
