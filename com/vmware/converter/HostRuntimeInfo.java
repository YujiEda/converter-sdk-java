/**
 * HostRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostRuntimeInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.HostSystemConnectionState connectionState;

    private com.vmware.converter.HostSystemPowerState powerState;

    private java.lang.String standbyMode;

    private boolean inMaintenanceMode;

    private java.util.Calendar bootTime;

    private com.vmware.converter.HealthSystemRuntime healthSystemRuntime;

    private com.vmware.converter.ClusterDasFdmHostState dasHostState;

    private com.vmware.converter.HostTpmDigestInfo[] tpmPcrValues;

    private com.vmware.converter.VsanHostRuntimeInfo vsanRuntimeInfo;

    private com.vmware.converter.HostRuntimeInfoNetworkRuntimeInfo networkRuntimeInfo;

    private com.vmware.converter.HostVFlashManagerVFlashResourceRunTimeInfo vFlashResourceRuntimeInfo;

    private java.lang.Long hostMaxVirtualDiskCapacity;

    public HostRuntimeInfo() {
    }

    public HostRuntimeInfo(
           com.vmware.converter.HostSystemConnectionState connectionState,
           com.vmware.converter.HostSystemPowerState powerState,
           java.lang.String standbyMode,
           boolean inMaintenanceMode,
           java.util.Calendar bootTime,
           com.vmware.converter.HealthSystemRuntime healthSystemRuntime,
           com.vmware.converter.ClusterDasFdmHostState dasHostState,
           com.vmware.converter.HostTpmDigestInfo[] tpmPcrValues,
           com.vmware.converter.VsanHostRuntimeInfo vsanRuntimeInfo,
           com.vmware.converter.HostRuntimeInfoNetworkRuntimeInfo networkRuntimeInfo,
           com.vmware.converter.HostVFlashManagerVFlashResourceRunTimeInfo vFlashResourceRuntimeInfo,
           java.lang.Long hostMaxVirtualDiskCapacity) {
        this.connectionState = connectionState;
        this.powerState = powerState;
        this.standbyMode = standbyMode;
        this.inMaintenanceMode = inMaintenanceMode;
        this.bootTime = bootTime;
        this.healthSystemRuntime = healthSystemRuntime;
        this.dasHostState = dasHostState;
        this.tpmPcrValues = tpmPcrValues;
        this.vsanRuntimeInfo = vsanRuntimeInfo;
        this.networkRuntimeInfo = networkRuntimeInfo;
        this.vFlashResourceRuntimeInfo = vFlashResourceRuntimeInfo;
        this.hostMaxVirtualDiskCapacity = hostMaxVirtualDiskCapacity;
    }


    /**
     * Gets the connectionState value for this HostRuntimeInfo.
     * 
     * @return connectionState
     */
    public com.vmware.converter.HostSystemConnectionState getConnectionState() {
        return connectionState;
    }


    /**
     * Sets the connectionState value for this HostRuntimeInfo.
     * 
     * @param connectionState
     */
    public void setConnectionState(com.vmware.converter.HostSystemConnectionState connectionState) {
        this.connectionState = connectionState;
    }


    /**
     * Gets the powerState value for this HostRuntimeInfo.
     * 
     * @return powerState
     */
    public com.vmware.converter.HostSystemPowerState getPowerState() {
        return powerState;
    }


    /**
     * Sets the powerState value for this HostRuntimeInfo.
     * 
     * @param powerState
     */
    public void setPowerState(com.vmware.converter.HostSystemPowerState powerState) {
        this.powerState = powerState;
    }


    /**
     * Gets the standbyMode value for this HostRuntimeInfo.
     * 
     * @return standbyMode
     */
    public java.lang.String getStandbyMode() {
        return standbyMode;
    }


    /**
     * Sets the standbyMode value for this HostRuntimeInfo.
     * 
     * @param standbyMode
     */
    public void setStandbyMode(java.lang.String standbyMode) {
        this.standbyMode = standbyMode;
    }


    /**
     * Gets the inMaintenanceMode value for this HostRuntimeInfo.
     * 
     * @return inMaintenanceMode
     */
    public boolean isInMaintenanceMode() {
        return inMaintenanceMode;
    }


    /**
     * Sets the inMaintenanceMode value for this HostRuntimeInfo.
     * 
     * @param inMaintenanceMode
     */
    public void setInMaintenanceMode(boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }


    /**
     * Gets the bootTime value for this HostRuntimeInfo.
     * 
     * @return bootTime
     */
    public java.util.Calendar getBootTime() {
        return bootTime;
    }


    /**
     * Sets the bootTime value for this HostRuntimeInfo.
     * 
     * @param bootTime
     */
    public void setBootTime(java.util.Calendar bootTime) {
        this.bootTime = bootTime;
    }


    /**
     * Gets the healthSystemRuntime value for this HostRuntimeInfo.
     * 
     * @return healthSystemRuntime
     */
    public com.vmware.converter.HealthSystemRuntime getHealthSystemRuntime() {
        return healthSystemRuntime;
    }


    /**
     * Sets the healthSystemRuntime value for this HostRuntimeInfo.
     * 
     * @param healthSystemRuntime
     */
    public void setHealthSystemRuntime(com.vmware.converter.HealthSystemRuntime healthSystemRuntime) {
        this.healthSystemRuntime = healthSystemRuntime;
    }


    /**
     * Gets the dasHostState value for this HostRuntimeInfo.
     * 
     * @return dasHostState
     */
    public com.vmware.converter.ClusterDasFdmHostState getDasHostState() {
        return dasHostState;
    }


    /**
     * Sets the dasHostState value for this HostRuntimeInfo.
     * 
     * @param dasHostState
     */
    public void setDasHostState(com.vmware.converter.ClusterDasFdmHostState dasHostState) {
        this.dasHostState = dasHostState;
    }


    /**
     * Gets the tpmPcrValues value for this HostRuntimeInfo.
     * 
     * @return tpmPcrValues
     */
    public com.vmware.converter.HostTpmDigestInfo[] getTpmPcrValues() {
        return tpmPcrValues;
    }


    /**
     * Sets the tpmPcrValues value for this HostRuntimeInfo.
     * 
     * @param tpmPcrValues
     */
    public void setTpmPcrValues(com.vmware.converter.HostTpmDigestInfo[] tpmPcrValues) {
        this.tpmPcrValues = tpmPcrValues;
    }

    public com.vmware.converter.HostTpmDigestInfo getTpmPcrValues(int i) {
        return this.tpmPcrValues[i];
    }

    public void setTpmPcrValues(int i, com.vmware.converter.HostTpmDigestInfo _value) {
        this.tpmPcrValues[i] = _value;
    }


    /**
     * Gets the vsanRuntimeInfo value for this HostRuntimeInfo.
     * 
     * @return vsanRuntimeInfo
     */
    public com.vmware.converter.VsanHostRuntimeInfo getVsanRuntimeInfo() {
        return vsanRuntimeInfo;
    }


    /**
     * Sets the vsanRuntimeInfo value for this HostRuntimeInfo.
     * 
     * @param vsanRuntimeInfo
     */
    public void setVsanRuntimeInfo(com.vmware.converter.VsanHostRuntimeInfo vsanRuntimeInfo) {
        this.vsanRuntimeInfo = vsanRuntimeInfo;
    }


    /**
     * Gets the networkRuntimeInfo value for this HostRuntimeInfo.
     * 
     * @return networkRuntimeInfo
     */
    public com.vmware.converter.HostRuntimeInfoNetworkRuntimeInfo getNetworkRuntimeInfo() {
        return networkRuntimeInfo;
    }


    /**
     * Sets the networkRuntimeInfo value for this HostRuntimeInfo.
     * 
     * @param networkRuntimeInfo
     */
    public void setNetworkRuntimeInfo(com.vmware.converter.HostRuntimeInfoNetworkRuntimeInfo networkRuntimeInfo) {
        this.networkRuntimeInfo = networkRuntimeInfo;
    }


    /**
     * Gets the vFlashResourceRuntimeInfo value for this HostRuntimeInfo.
     * 
     * @return vFlashResourceRuntimeInfo
     */
    public com.vmware.converter.HostVFlashManagerVFlashResourceRunTimeInfo getVFlashResourceRuntimeInfo() {
        return vFlashResourceRuntimeInfo;
    }


    /**
     * Sets the vFlashResourceRuntimeInfo value for this HostRuntimeInfo.
     * 
     * @param vFlashResourceRuntimeInfo
     */
    public void setVFlashResourceRuntimeInfo(com.vmware.converter.HostVFlashManagerVFlashResourceRunTimeInfo vFlashResourceRuntimeInfo) {
        this.vFlashResourceRuntimeInfo = vFlashResourceRuntimeInfo;
    }


    /**
     * Gets the hostMaxVirtualDiskCapacity value for this HostRuntimeInfo.
     * 
     * @return hostMaxVirtualDiskCapacity
     */
    public java.lang.Long getHostMaxVirtualDiskCapacity() {
        return hostMaxVirtualDiskCapacity;
    }


    /**
     * Sets the hostMaxVirtualDiskCapacity value for this HostRuntimeInfo.
     * 
     * @param hostMaxVirtualDiskCapacity
     */
    public void setHostMaxVirtualDiskCapacity(java.lang.Long hostMaxVirtualDiskCapacity) {
        this.hostMaxVirtualDiskCapacity = hostMaxVirtualDiskCapacity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostRuntimeInfo)) return false;
        HostRuntimeInfo other = (HostRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connectionState==null && other.getConnectionState()==null) || 
             (this.connectionState!=null &&
              this.connectionState.equals(other.getConnectionState()))) &&
            ((this.powerState==null && other.getPowerState()==null) || 
             (this.powerState!=null &&
              this.powerState.equals(other.getPowerState()))) &&
            ((this.standbyMode==null && other.getStandbyMode()==null) || 
             (this.standbyMode!=null &&
              this.standbyMode.equals(other.getStandbyMode()))) &&
            this.inMaintenanceMode == other.isInMaintenanceMode() &&
            ((this.bootTime==null && other.getBootTime()==null) || 
             (this.bootTime!=null &&
              this.bootTime.equals(other.getBootTime()))) &&
            ((this.healthSystemRuntime==null && other.getHealthSystemRuntime()==null) || 
             (this.healthSystemRuntime!=null &&
              this.healthSystemRuntime.equals(other.getHealthSystemRuntime()))) &&
            ((this.dasHostState==null && other.getDasHostState()==null) || 
             (this.dasHostState!=null &&
              this.dasHostState.equals(other.getDasHostState()))) &&
            ((this.tpmPcrValues==null && other.getTpmPcrValues()==null) || 
             (this.tpmPcrValues!=null &&
              java.util.Arrays.equals(this.tpmPcrValues, other.getTpmPcrValues()))) &&
            ((this.vsanRuntimeInfo==null && other.getVsanRuntimeInfo()==null) || 
             (this.vsanRuntimeInfo!=null &&
              this.vsanRuntimeInfo.equals(other.getVsanRuntimeInfo()))) &&
            ((this.networkRuntimeInfo==null && other.getNetworkRuntimeInfo()==null) || 
             (this.networkRuntimeInfo!=null &&
              this.networkRuntimeInfo.equals(other.getNetworkRuntimeInfo()))) &&
            ((this.vFlashResourceRuntimeInfo==null && other.getVFlashResourceRuntimeInfo()==null) || 
             (this.vFlashResourceRuntimeInfo!=null &&
              this.vFlashResourceRuntimeInfo.equals(other.getVFlashResourceRuntimeInfo()))) &&
            ((this.hostMaxVirtualDiskCapacity==null && other.getHostMaxVirtualDiskCapacity()==null) || 
             (this.hostMaxVirtualDiskCapacity!=null &&
              this.hostMaxVirtualDiskCapacity.equals(other.getHostMaxVirtualDiskCapacity())));
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
        if (getConnectionState() != null) {
            _hashCode += getConnectionState().hashCode();
        }
        if (getPowerState() != null) {
            _hashCode += getPowerState().hashCode();
        }
        if (getStandbyMode() != null) {
            _hashCode += getStandbyMode().hashCode();
        }
        _hashCode += (isInMaintenanceMode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBootTime() != null) {
            _hashCode += getBootTime().hashCode();
        }
        if (getHealthSystemRuntime() != null) {
            _hashCode += getHealthSystemRuntime().hashCode();
        }
        if (getDasHostState() != null) {
            _hashCode += getDasHostState().hashCode();
        }
        if (getTpmPcrValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpmPcrValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpmPcrValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsanRuntimeInfo() != null) {
            _hashCode += getVsanRuntimeInfo().hashCode();
        }
        if (getNetworkRuntimeInfo() != null) {
            _hashCode += getNetworkRuntimeInfo().hashCode();
        }
        if (getVFlashResourceRuntimeInfo() != null) {
            _hashCode += getVFlashResourceRuntimeInfo().hashCode();
        }
        if (getHostMaxVirtualDiskCapacity() != null) {
            _hashCode += getHostMaxVirtualDiskCapacity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connectionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemConnectionState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemPowerState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standbyMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "standbyMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inMaintenanceMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inMaintenanceMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthSystemRuntime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthSystemRuntime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HealthSystemRuntime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasHostState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasHostState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFdmHostState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpmPcrValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tpmPcrValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmDigestInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsanRuntimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vsanRuntimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VsanHostRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkRuntimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkRuntimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostRuntimeInfoNetworkRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VFlashResourceRuntimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vFlashResourceRuntimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVFlashManagerVFlashResourceRunTimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMaxVirtualDiskCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostMaxVirtualDiskCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
