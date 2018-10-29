/**
 * PatchMetadataInvalid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PatchMetadataInvalid  extends com.vmware.converter.VimFault  implements java.io.Serializable {
    private java.lang.String patchID;

    private java.lang.String[] metaData;

    public PatchMetadataInvalid() {
    }

    public PatchMetadataInvalid(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.String patchID,
           java.lang.String[] metaData) {
        super(
            faultCause,
            faultMessage);
        this.patchID = patchID;
        this.metaData = metaData;
    }


    /**
     * Gets the patchID value for this PatchMetadataInvalid.
     * 
     * @return patchID
     */
    public java.lang.String getPatchID() {
        return patchID;
    }


    /**
     * Sets the patchID value for this PatchMetadataInvalid.
     * 
     * @param patchID
     */
    public void setPatchID(java.lang.String patchID) {
        this.patchID = patchID;
    }


    /**
     * Gets the metaData value for this PatchMetadataInvalid.
     * 
     * @return metaData
     */
    public java.lang.String[] getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this PatchMetadataInvalid.
     * 
     * @param metaData
     */
    public void setMetaData(java.lang.String[] metaData) {
        this.metaData = metaData;
    }

    public java.lang.String getMetaData(int i) {
        return this.metaData[i];
    }

    public void setMetaData(int i, java.lang.String _value) {
        this.metaData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatchMetadataInvalid)) return false;
        PatchMetadataInvalid other = (PatchMetadataInvalid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.patchID==null && other.getPatchID()==null) || 
             (this.patchID!=null &&
              this.patchID.equals(other.getPatchID()))) &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              java.util.Arrays.equals(this.metaData, other.getMetaData())));
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
        if (getPatchID() != null) {
            _hashCode += getPatchID().hashCode();
        }
        if (getMetaData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetaData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetaData(), i);
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
        new org.apache.axis.description.TypeDesc(PatchMetadataInvalid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PatchMetadataInvalid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patchID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "patchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "metaData"));
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
