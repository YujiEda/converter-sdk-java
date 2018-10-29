/**
 * DvsTrafficFilterConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsTrafficFilterConfig  extends com.vmware.converter.DvsFilterConfig  implements java.io.Serializable {
    private com.vmware.converter.DvsTrafficRuleset trafficRuleset;

    public DvsTrafficFilterConfig() {
    }

    public DvsTrafficFilterConfig(
           boolean inherited,
           java.lang.String key,
           java.lang.String agentName,
           java.lang.String slotNumber,
           com.vmware.converter.DvsFilterParameter parameters,
           java.lang.String onFailure,
           com.vmware.converter.DvsTrafficRuleset trafficRuleset) {
        super(
            inherited,
            key,
            agentName,
            slotNumber,
            parameters,
            onFailure);
        this.trafficRuleset = trafficRuleset;
    }


    /**
     * Gets the trafficRuleset value for this DvsTrafficFilterConfig.
     * 
     * @return trafficRuleset
     */
    public com.vmware.converter.DvsTrafficRuleset getTrafficRuleset() {
        return trafficRuleset;
    }


    /**
     * Sets the trafficRuleset value for this DvsTrafficFilterConfig.
     * 
     * @param trafficRuleset
     */
    public void setTrafficRuleset(com.vmware.converter.DvsTrafficRuleset trafficRuleset) {
        this.trafficRuleset = trafficRuleset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsTrafficFilterConfig)) return false;
        DvsTrafficFilterConfig other = (DvsTrafficFilterConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trafficRuleset==null && other.getTrafficRuleset()==null) || 
             (this.trafficRuleset!=null &&
              this.trafficRuleset.equals(other.getTrafficRuleset())));
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
        if (getTrafficRuleset() != null) {
            _hashCode += getTrafficRuleset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsTrafficFilterConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsTrafficFilterConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficRuleset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "trafficRuleset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsTrafficRuleset"));
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
