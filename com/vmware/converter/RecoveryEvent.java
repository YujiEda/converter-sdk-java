/**
 * RecoveryEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class RecoveryEvent  extends com.vmware.converter.DvsEvent  implements java.io.Serializable {
    private java.lang.String hostName;

    private java.lang.String portKey;

    private java.lang.String dvsUuid;

    private java.lang.String vnic;

    public RecoveryEvent() {
    }

    public RecoveryEvent(
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
           java.lang.String hostName,
           java.lang.String portKey,
           java.lang.String dvsUuid,
           java.lang.String vnic) {
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
        this.hostName = hostName;
        this.portKey = portKey;
        this.dvsUuid = dvsUuid;
        this.vnic = vnic;
    }


    /**
     * Gets the hostName value for this RecoveryEvent.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this RecoveryEvent.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the portKey value for this RecoveryEvent.
     * 
     * @return portKey
     */
    public java.lang.String getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this RecoveryEvent.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String portKey) {
        this.portKey = portKey;
    }


    /**
     * Gets the dvsUuid value for this RecoveryEvent.
     * 
     * @return dvsUuid
     */
    public java.lang.String getDvsUuid() {
        return dvsUuid;
    }


    /**
     * Sets the dvsUuid value for this RecoveryEvent.
     * 
     * @param dvsUuid
     */
    public void setDvsUuid(java.lang.String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }


    /**
     * Gets the vnic value for this RecoveryEvent.
     * 
     * @return vnic
     */
    public java.lang.String getVnic() {
        return vnic;
    }


    /**
     * Sets the vnic value for this RecoveryEvent.
     * 
     * @param vnic
     */
    public void setVnic(java.lang.String vnic) {
        this.vnic = vnic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecoveryEvent)) return false;
        RecoveryEvent other = (RecoveryEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.portKey==null && other.getPortKey()==null) || 
             (this.portKey!=null &&
              this.portKey.equals(other.getPortKey()))) &&
            ((this.dvsUuid==null && other.getDvsUuid()==null) || 
             (this.dvsUuid!=null &&
              this.dvsUuid.equals(other.getDvsUuid()))) &&
            ((this.vnic==null && other.getVnic()==null) || 
             (this.vnic!=null &&
              this.vnic.equals(other.getVnic())));
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
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getPortKey() != null) {
            _hashCode += getPortKey().hashCode();
        }
        if (getDvsUuid() != null) {
            _hashCode += getDvsUuid().hashCode();
        }
        if (getVnic() != null) {
            _hashCode += getVnic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecoveryEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "RecoveryEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnic"));
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
