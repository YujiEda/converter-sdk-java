/**
 * DvsRenamedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsRenamedEvent  extends com.vmware.converter.DvsEvent  implements java.io.Serializable {
    private java.lang.String oldName;

    private java.lang.String newName;

    public DvsRenamedEvent() {
    }

    public DvsRenamedEvent(
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.converter.DatacenterEventArgument datacenter,
           com.vmware.converter.ComputeResourceEventArgument computeResource,
           com.vmware.converter.HostEventArgument host,
           com.vmware.converter.VmEventArgument vm,
           com.vmware.converter.DatastoreEventArgument ds,
           com.vmware.converter.NetworkEventArgument net,
           com.vmware.converter.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           java.lang.String oldName,
           java.lang.String newName) {
        super(
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag);
        this.oldName = oldName;
        this.newName = newName;
    }


    /**
     * Gets the oldName value for this DvsRenamedEvent.
     * 
     * @return oldName
     */
    public java.lang.String getOldName() {
        return oldName;
    }


    /**
     * Sets the oldName value for this DvsRenamedEvent.
     * 
     * @param oldName
     */
    public void setOldName(java.lang.String oldName) {
        this.oldName = oldName;
    }


    /**
     * Gets the newName value for this DvsRenamedEvent.
     * 
     * @return newName
     */
    public java.lang.String getNewName() {
        return newName;
    }


    /**
     * Sets the newName value for this DvsRenamedEvent.
     * 
     * @param newName
     */
    public void setNewName(java.lang.String newName) {
        this.newName = newName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsRenamedEvent)) return false;
        DvsRenamedEvent other = (DvsRenamedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldName==null && other.getOldName()==null) || 
             (this.oldName!=null &&
              this.oldName.equals(other.getOldName()))) &&
            ((this.newName==null && other.getNewName()==null) || 
             (this.newName!=null &&
              this.newName.equals(other.getNewName())));
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
        if (getOldName() != null) {
            _hashCode += getOldName().hashCode();
        }
        if (getNewName() != null) {
            _hashCode += getNewName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsRenamedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsRenamedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
