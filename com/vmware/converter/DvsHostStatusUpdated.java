/**
 * DvsHostStatusUpdated.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DvsHostStatusUpdated  extends com.vmware.converter.DvsEvent  implements java.io.Serializable {
    private com.vmware.converter.HostEventArgument hostMember;

    private java.lang.String oldStatus;

    private java.lang.String newStatus;

    private java.lang.String oldStatusDetail;

    private java.lang.String newStatusDetail;

    public DvsHostStatusUpdated() {
    }

    public DvsHostStatusUpdated(
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
           com.vmware.converter.HostEventArgument hostMember,
           java.lang.String oldStatus,
           java.lang.String newStatus,
           java.lang.String oldStatusDetail,
           java.lang.String newStatusDetail) {
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
        this.hostMember = hostMember;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.oldStatusDetail = oldStatusDetail;
        this.newStatusDetail = newStatusDetail;
    }


    /**
     * Gets the hostMember value for this DvsHostStatusUpdated.
     * 
     * @return hostMember
     */
    public com.vmware.converter.HostEventArgument getHostMember() {
        return hostMember;
    }


    /**
     * Sets the hostMember value for this DvsHostStatusUpdated.
     * 
     * @param hostMember
     */
    public void setHostMember(com.vmware.converter.HostEventArgument hostMember) {
        this.hostMember = hostMember;
    }


    /**
     * Gets the oldStatus value for this DvsHostStatusUpdated.
     * 
     * @return oldStatus
     */
    public java.lang.String getOldStatus() {
        return oldStatus;
    }


    /**
     * Sets the oldStatus value for this DvsHostStatusUpdated.
     * 
     * @param oldStatus
     */
    public void setOldStatus(java.lang.String oldStatus) {
        this.oldStatus = oldStatus;
    }


    /**
     * Gets the newStatus value for this DvsHostStatusUpdated.
     * 
     * @return newStatus
     */
    public java.lang.String getNewStatus() {
        return newStatus;
    }


    /**
     * Sets the newStatus value for this DvsHostStatusUpdated.
     * 
     * @param newStatus
     */
    public void setNewStatus(java.lang.String newStatus) {
        this.newStatus = newStatus;
    }


    /**
     * Gets the oldStatusDetail value for this DvsHostStatusUpdated.
     * 
     * @return oldStatusDetail
     */
    public java.lang.String getOldStatusDetail() {
        return oldStatusDetail;
    }


    /**
     * Sets the oldStatusDetail value for this DvsHostStatusUpdated.
     * 
     * @param oldStatusDetail
     */
    public void setOldStatusDetail(java.lang.String oldStatusDetail) {
        this.oldStatusDetail = oldStatusDetail;
    }


    /**
     * Gets the newStatusDetail value for this DvsHostStatusUpdated.
     * 
     * @return newStatusDetail
     */
    public java.lang.String getNewStatusDetail() {
        return newStatusDetail;
    }


    /**
     * Sets the newStatusDetail value for this DvsHostStatusUpdated.
     * 
     * @param newStatusDetail
     */
    public void setNewStatusDetail(java.lang.String newStatusDetail) {
        this.newStatusDetail = newStatusDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsHostStatusUpdated)) return false;
        DvsHostStatusUpdated other = (DvsHostStatusUpdated) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostMember==null && other.getHostMember()==null) || 
             (this.hostMember!=null &&
              this.hostMember.equals(other.getHostMember()))) &&
            ((this.oldStatus==null && other.getOldStatus()==null) || 
             (this.oldStatus!=null &&
              this.oldStatus.equals(other.getOldStatus()))) &&
            ((this.newStatus==null && other.getNewStatus()==null) || 
             (this.newStatus!=null &&
              this.newStatus.equals(other.getNewStatus()))) &&
            ((this.oldStatusDetail==null && other.getOldStatusDetail()==null) || 
             (this.oldStatusDetail!=null &&
              this.oldStatusDetail.equals(other.getOldStatusDetail()))) &&
            ((this.newStatusDetail==null && other.getNewStatusDetail()==null) || 
             (this.newStatusDetail!=null &&
              this.newStatusDetail.equals(other.getNewStatusDetail())));
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
        if (getHostMember() != null) {
            _hashCode += getHostMember().hashCode();
        }
        if (getOldStatus() != null) {
            _hashCode += getOldStatus().hashCode();
        }
        if (getNewStatus() != null) {
            _hashCode += getNewStatus().hashCode();
        }
        if (getOldStatusDetail() != null) {
            _hashCode += getOldStatusDetail().hashCode();
        }
        if (getNewStatusDetail() != null) {
            _hashCode += getNewStatusDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsHostStatusUpdated.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsHostStatusUpdated"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldStatusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldStatusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newStatusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newStatusDetail"));
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
