/**
 * IscsiPortInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class IscsiPortInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String vnicDevice;

    private com.vmware.converter.HostVirtualNic vnic;

    private java.lang.String pnicDevice;

    private com.vmware.converter.PhysicalNic pnic;

    private java.lang.String switchName;

    private java.lang.String switchUuid;

    private java.lang.String portgroupName;

    private java.lang.String portgroupKey;

    private java.lang.String portKey;

    private com.vmware.converter.IscsiStatus complianceStatus;

    private java.lang.String pathStatus;

    public IscsiPortInfo() {
    }

    public IscsiPortInfo(
           java.lang.String vnicDevice,
           com.vmware.converter.HostVirtualNic vnic,
           java.lang.String pnicDevice,
           com.vmware.converter.PhysicalNic pnic,
           java.lang.String switchName,
           java.lang.String switchUuid,
           java.lang.String portgroupName,
           java.lang.String portgroupKey,
           java.lang.String portKey,
           com.vmware.converter.IscsiStatus complianceStatus,
           java.lang.String pathStatus) {
        this.vnicDevice = vnicDevice;
        this.vnic = vnic;
        this.pnicDevice = pnicDevice;
        this.pnic = pnic;
        this.switchName = switchName;
        this.switchUuid = switchUuid;
        this.portgroupName = portgroupName;
        this.portgroupKey = portgroupKey;
        this.portKey = portKey;
        this.complianceStatus = complianceStatus;
        this.pathStatus = pathStatus;
    }


    /**
     * Gets the vnicDevice value for this IscsiPortInfo.
     * 
     * @return vnicDevice
     */
    public java.lang.String getVnicDevice() {
        return vnicDevice;
    }


    /**
     * Sets the vnicDevice value for this IscsiPortInfo.
     * 
     * @param vnicDevice
     */
    public void setVnicDevice(java.lang.String vnicDevice) {
        this.vnicDevice = vnicDevice;
    }


    /**
     * Gets the vnic value for this IscsiPortInfo.
     * 
     * @return vnic
     */
    public com.vmware.converter.HostVirtualNic getVnic() {
        return vnic;
    }


    /**
     * Sets the vnic value for this IscsiPortInfo.
     * 
     * @param vnic
     */
    public void setVnic(com.vmware.converter.HostVirtualNic vnic) {
        this.vnic = vnic;
    }


    /**
     * Gets the pnicDevice value for this IscsiPortInfo.
     * 
     * @return pnicDevice
     */
    public java.lang.String getPnicDevice() {
        return pnicDevice;
    }


    /**
     * Sets the pnicDevice value for this IscsiPortInfo.
     * 
     * @param pnicDevice
     */
    public void setPnicDevice(java.lang.String pnicDevice) {
        this.pnicDevice = pnicDevice;
    }


    /**
     * Gets the pnic value for this IscsiPortInfo.
     * 
     * @return pnic
     */
    public com.vmware.converter.PhysicalNic getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this IscsiPortInfo.
     * 
     * @param pnic
     */
    public void setPnic(com.vmware.converter.PhysicalNic pnic) {
        this.pnic = pnic;
    }


    /**
     * Gets the switchName value for this IscsiPortInfo.
     * 
     * @return switchName
     */
    public java.lang.String getSwitchName() {
        return switchName;
    }


    /**
     * Sets the switchName value for this IscsiPortInfo.
     * 
     * @param switchName
     */
    public void setSwitchName(java.lang.String switchName) {
        this.switchName = switchName;
    }


    /**
     * Gets the switchUuid value for this IscsiPortInfo.
     * 
     * @return switchUuid
     */
    public java.lang.String getSwitchUuid() {
        return switchUuid;
    }


    /**
     * Sets the switchUuid value for this IscsiPortInfo.
     * 
     * @param switchUuid
     */
    public void setSwitchUuid(java.lang.String switchUuid) {
        this.switchUuid = switchUuid;
    }


    /**
     * Gets the portgroupName value for this IscsiPortInfo.
     * 
     * @return portgroupName
     */
    public java.lang.String getPortgroupName() {
        return portgroupName;
    }


    /**
     * Sets the portgroupName value for this IscsiPortInfo.
     * 
     * @param portgroupName
     */
    public void setPortgroupName(java.lang.String portgroupName) {
        this.portgroupName = portgroupName;
    }


    /**
     * Gets the portgroupKey value for this IscsiPortInfo.
     * 
     * @return portgroupKey
     */
    public java.lang.String getPortgroupKey() {
        return portgroupKey;
    }


    /**
     * Sets the portgroupKey value for this IscsiPortInfo.
     * 
     * @param portgroupKey
     */
    public void setPortgroupKey(java.lang.String portgroupKey) {
        this.portgroupKey = portgroupKey;
    }


    /**
     * Gets the portKey value for this IscsiPortInfo.
     * 
     * @return portKey
     */
    public java.lang.String getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this IscsiPortInfo.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String portKey) {
        this.portKey = portKey;
    }


    /**
     * Gets the complianceStatus value for this IscsiPortInfo.
     * 
     * @return complianceStatus
     */
    public com.vmware.converter.IscsiStatus getComplianceStatus() {
        return complianceStatus;
    }


    /**
     * Sets the complianceStatus value for this IscsiPortInfo.
     * 
     * @param complianceStatus
     */
    public void setComplianceStatus(com.vmware.converter.IscsiStatus complianceStatus) {
        this.complianceStatus = complianceStatus;
    }


    /**
     * Gets the pathStatus value for this IscsiPortInfo.
     * 
     * @return pathStatus
     */
    public java.lang.String getPathStatus() {
        return pathStatus;
    }


    /**
     * Sets the pathStatus value for this IscsiPortInfo.
     * 
     * @param pathStatus
     */
    public void setPathStatus(java.lang.String pathStatus) {
        this.pathStatus = pathStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IscsiPortInfo)) return false;
        IscsiPortInfo other = (IscsiPortInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vnicDevice==null && other.getVnicDevice()==null) || 
             (this.vnicDevice!=null &&
              this.vnicDevice.equals(other.getVnicDevice()))) &&
            ((this.vnic==null && other.getVnic()==null) || 
             (this.vnic!=null &&
              this.vnic.equals(other.getVnic()))) &&
            ((this.pnicDevice==null && other.getPnicDevice()==null) || 
             (this.pnicDevice!=null &&
              this.pnicDevice.equals(other.getPnicDevice()))) &&
            ((this.pnic==null && other.getPnic()==null) || 
             (this.pnic!=null &&
              this.pnic.equals(other.getPnic()))) &&
            ((this.switchName==null && other.getSwitchName()==null) || 
             (this.switchName!=null &&
              this.switchName.equals(other.getSwitchName()))) &&
            ((this.switchUuid==null && other.getSwitchUuid()==null) || 
             (this.switchUuid!=null &&
              this.switchUuid.equals(other.getSwitchUuid()))) &&
            ((this.portgroupName==null && other.getPortgroupName()==null) || 
             (this.portgroupName!=null &&
              this.portgroupName.equals(other.getPortgroupName()))) &&
            ((this.portgroupKey==null && other.getPortgroupKey()==null) || 
             (this.portgroupKey!=null &&
              this.portgroupKey.equals(other.getPortgroupKey()))) &&
            ((this.portKey==null && other.getPortKey()==null) || 
             (this.portKey!=null &&
              this.portKey.equals(other.getPortKey()))) &&
            ((this.complianceStatus==null && other.getComplianceStatus()==null) || 
             (this.complianceStatus!=null &&
              this.complianceStatus.equals(other.getComplianceStatus()))) &&
            ((this.pathStatus==null && other.getPathStatus()==null) || 
             (this.pathStatus!=null &&
              this.pathStatus.equals(other.getPathStatus())));
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
        if (getVnicDevice() != null) {
            _hashCode += getVnicDevice().hashCode();
        }
        if (getVnic() != null) {
            _hashCode += getVnic().hashCode();
        }
        if (getPnicDevice() != null) {
            _hashCode += getPnicDevice().hashCode();
        }
        if (getPnic() != null) {
            _hashCode += getPnic().hashCode();
        }
        if (getSwitchName() != null) {
            _hashCode += getSwitchName().hashCode();
        }
        if (getSwitchUuid() != null) {
            _hashCode += getSwitchUuid().hashCode();
        }
        if (getPortgroupName() != null) {
            _hashCode += getPortgroupName().hashCode();
        }
        if (getPortgroupKey() != null) {
            _hashCode += getPortgroupKey().hashCode();
        }
        if (getPortKey() != null) {
            _hashCode += getPortKey().hashCode();
        }
        if (getComplianceStatus() != null) {
            _hashCode += getComplianceStatus().hashCode();
        }
        if (getPathStatus() != null) {
            _hashCode += getPathStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IscsiPortInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiPortInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "switchUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complianceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "complianceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IscsiStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pathStatus"));
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
