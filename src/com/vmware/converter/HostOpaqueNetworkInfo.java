/**
 * HostOpaqueNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostOpaqueNetworkInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String opaqueNetworkId;

    private java.lang.String opaqueNetworkName;

    private java.lang.String opaqueNetworkType;

    private java.lang.String[] pnicZone;

    public HostOpaqueNetworkInfo() {
    }

    public HostOpaqueNetworkInfo(
           java.lang.String opaqueNetworkId,
           java.lang.String opaqueNetworkName,
           java.lang.String opaqueNetworkType,
           java.lang.String[] pnicZone) {
        this.opaqueNetworkId = opaqueNetworkId;
        this.opaqueNetworkName = opaqueNetworkName;
        this.opaqueNetworkType = opaqueNetworkType;
        this.pnicZone = pnicZone;
    }


    /**
     * Gets the opaqueNetworkId value for this HostOpaqueNetworkInfo.
     * 
     * @return opaqueNetworkId
     */
    public java.lang.String getOpaqueNetworkId() {
        return opaqueNetworkId;
    }


    /**
     * Sets the opaqueNetworkId value for this HostOpaqueNetworkInfo.
     * 
     * @param opaqueNetworkId
     */
    public void setOpaqueNetworkId(java.lang.String opaqueNetworkId) {
        this.opaqueNetworkId = opaqueNetworkId;
    }


    /**
     * Gets the opaqueNetworkName value for this HostOpaqueNetworkInfo.
     * 
     * @return opaqueNetworkName
     */
    public java.lang.String getOpaqueNetworkName() {
        return opaqueNetworkName;
    }


    /**
     * Sets the opaqueNetworkName value for this HostOpaqueNetworkInfo.
     * 
     * @param opaqueNetworkName
     */
    public void setOpaqueNetworkName(java.lang.String opaqueNetworkName) {
        this.opaqueNetworkName = opaqueNetworkName;
    }


    /**
     * Gets the opaqueNetworkType value for this HostOpaqueNetworkInfo.
     * 
     * @return opaqueNetworkType
     */
    public java.lang.String getOpaqueNetworkType() {
        return opaqueNetworkType;
    }


    /**
     * Sets the opaqueNetworkType value for this HostOpaqueNetworkInfo.
     * 
     * @param opaqueNetworkType
     */
    public void setOpaqueNetworkType(java.lang.String opaqueNetworkType) {
        this.opaqueNetworkType = opaqueNetworkType;
    }


    /**
     * Gets the pnicZone value for this HostOpaqueNetworkInfo.
     * 
     * @return pnicZone
     */
    public java.lang.String[] getPnicZone() {
        return pnicZone;
    }


    /**
     * Sets the pnicZone value for this HostOpaqueNetworkInfo.
     * 
     * @param pnicZone
     */
    public void setPnicZone(java.lang.String[] pnicZone) {
        this.pnicZone = pnicZone;
    }

    public java.lang.String getPnicZone(int i) {
        return this.pnicZone[i];
    }

    public void setPnicZone(int i, java.lang.String _value) {
        this.pnicZone[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostOpaqueNetworkInfo)) return false;
        HostOpaqueNetworkInfo other = (HostOpaqueNetworkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.opaqueNetworkId==null && other.getOpaqueNetworkId()==null) || 
             (this.opaqueNetworkId!=null &&
              this.opaqueNetworkId.equals(other.getOpaqueNetworkId()))) &&
            ((this.opaqueNetworkName==null && other.getOpaqueNetworkName()==null) || 
             (this.opaqueNetworkName!=null &&
              this.opaqueNetworkName.equals(other.getOpaqueNetworkName()))) &&
            ((this.opaqueNetworkType==null && other.getOpaqueNetworkType()==null) || 
             (this.opaqueNetworkType!=null &&
              this.opaqueNetworkType.equals(other.getOpaqueNetworkType()))) &&
            ((this.pnicZone==null && other.getPnicZone()==null) || 
             (this.pnicZone!=null &&
              java.util.Arrays.equals(this.pnicZone, other.getPnicZone())));
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
        if (getOpaqueNetworkId() != null) {
            _hashCode += getOpaqueNetworkId().hashCode();
        }
        if (getOpaqueNetworkName() != null) {
            _hashCode += getOpaqueNetworkName().hashCode();
        }
        if (getOpaqueNetworkType() != null) {
            _hashCode += getOpaqueNetworkType().hashCode();
        }
        if (getPnicZone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnicZone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnicZone(), i);
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
        new org.apache.axis.description.TypeDesc(HostOpaqueNetworkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueNetworkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opaqueNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opaqueNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opaqueNetworkName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opaqueNetworkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opaqueNetworkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "opaqueNetworkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
