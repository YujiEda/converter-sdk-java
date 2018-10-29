/**
 * InsufficientVFlashResourcesFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class InsufficientVFlashResourcesFault  extends com.vmware.converter.InsufficientResourcesFault  implements java.io.Serializable {
    private java.lang.Long freeSpaceInMB;

    private long freeSpace;

    private java.lang.Long requestedSpaceInMB;

    private long requestedSpace;

    public InsufficientVFlashResourcesFault() {
    }

    public InsufficientVFlashResourcesFault(
           com.vmware.converter.LocalizedMethodFault faultCause,
           com.vmware.converter.LocalizableMessage[] faultMessage,
           java.lang.Long freeSpaceInMB,
           long freeSpace,
           java.lang.Long requestedSpaceInMB,
           long requestedSpace) {
        super(
            faultCause,
            faultMessage);
        this.freeSpaceInMB = freeSpaceInMB;
        this.freeSpace = freeSpace;
        this.requestedSpaceInMB = requestedSpaceInMB;
        this.requestedSpace = requestedSpace;
    }


    /**
     * Gets the freeSpaceInMB value for this InsufficientVFlashResourcesFault.
     * 
     * @return freeSpaceInMB
     */
    public java.lang.Long getFreeSpaceInMB() {
        return freeSpaceInMB;
    }


    /**
     * Sets the freeSpaceInMB value for this InsufficientVFlashResourcesFault.
     * 
     * @param freeSpaceInMB
     */
    public void setFreeSpaceInMB(java.lang.Long freeSpaceInMB) {
        this.freeSpaceInMB = freeSpaceInMB;
    }


    /**
     * Gets the freeSpace value for this InsufficientVFlashResourcesFault.
     * 
     * @return freeSpace
     */
    public long getFreeSpace() {
        return freeSpace;
    }


    /**
     * Sets the freeSpace value for this InsufficientVFlashResourcesFault.
     * 
     * @param freeSpace
     */
    public void setFreeSpace(long freeSpace) {
        this.freeSpace = freeSpace;
    }


    /**
     * Gets the requestedSpaceInMB value for this InsufficientVFlashResourcesFault.
     * 
     * @return requestedSpaceInMB
     */
    public java.lang.Long getRequestedSpaceInMB() {
        return requestedSpaceInMB;
    }


    /**
     * Sets the requestedSpaceInMB value for this InsufficientVFlashResourcesFault.
     * 
     * @param requestedSpaceInMB
     */
    public void setRequestedSpaceInMB(java.lang.Long requestedSpaceInMB) {
        this.requestedSpaceInMB = requestedSpaceInMB;
    }


    /**
     * Gets the requestedSpace value for this InsufficientVFlashResourcesFault.
     * 
     * @return requestedSpace
     */
    public long getRequestedSpace() {
        return requestedSpace;
    }


    /**
     * Sets the requestedSpace value for this InsufficientVFlashResourcesFault.
     * 
     * @param requestedSpace
     */
    public void setRequestedSpace(long requestedSpace) {
        this.requestedSpace = requestedSpace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsufficientVFlashResourcesFault)) return false;
        InsufficientVFlashResourcesFault other = (InsufficientVFlashResourcesFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.freeSpaceInMB==null && other.getFreeSpaceInMB()==null) || 
             (this.freeSpaceInMB!=null &&
              this.freeSpaceInMB.equals(other.getFreeSpaceInMB()))) &&
            this.freeSpace == other.getFreeSpace() &&
            ((this.requestedSpaceInMB==null && other.getRequestedSpaceInMB()==null) || 
             (this.requestedSpaceInMB!=null &&
              this.requestedSpaceInMB.equals(other.getRequestedSpaceInMB()))) &&
            this.requestedSpace == other.getRequestedSpace();
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
        if (getFreeSpaceInMB() != null) {
            _hashCode += getFreeSpaceInMB().hashCode();
        }
        _hashCode += new Long(getFreeSpace()).hashCode();
        if (getRequestedSpaceInMB() != null) {
            _hashCode += getRequestedSpaceInMB().hashCode();
        }
        _hashCode += new Long(getRequestedSpace()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsufficientVFlashResourcesFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InsufficientVFlashResourcesFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSpaceInMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "freeSpaceInMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "freeSpace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedSpaceInMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requestedSpaceInMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requestedSpace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
