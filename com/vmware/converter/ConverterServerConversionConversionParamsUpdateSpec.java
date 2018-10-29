/**
 * ConverterServerConversionConversionParamsUpdateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterServerConversionConversionParamsUpdateSpec  extends com.vmware.converter.ConverterBaseConversionParamsUpdateSpec  implements java.io.Serializable {
    private java.lang.Boolean doReconfig;

    private java.lang.Boolean doFinalize;

    private java.util.Calendar synchronizationStartTime;

    private java.lang.Boolean clearServicesToSuspend;

    private java.lang.String[] servicesToSuspend;

    private java.lang.Boolean powerOnTargetVM;

    private java.lang.Boolean shutdownSource;

    public ConverterServerConversionConversionParamsUpdateSpec() {
    }

    public ConverterServerConversionConversionParamsUpdateSpec(
           com.vmware.converter.ConverterReconfigParams reconfigParams,
           java.lang.Boolean doCustomize,
           com.vmware.converter.ConverterCustomizationParams customizationParams,
           java.lang.Boolean doInstallTools,
           java.lang.Boolean removeRestoreCheckpoints,
           java.lang.String agentSslThumbprint,
           java.lang.Boolean unsetAgentSslThumbprint,
           com.vmware.converter.ConverterThrottlingParamsUpdateSpec throttling,
           java.lang.Boolean doReconfig,
           java.lang.Boolean doFinalize,
           java.util.Calendar synchronizationStartTime,
           java.lang.Boolean clearServicesToSuspend,
           java.lang.String[] servicesToSuspend,
           java.lang.Boolean powerOnTargetVM,
           java.lang.Boolean shutdownSource) {
        super(
            reconfigParams,
            doCustomize,
            customizationParams,
            doInstallTools,
            removeRestoreCheckpoints,
            agentSslThumbprint,
            unsetAgentSslThumbprint,
            throttling);
        this.doReconfig = doReconfig;
        this.doFinalize = doFinalize;
        this.synchronizationStartTime = synchronizationStartTime;
        this.clearServicesToSuspend = clearServicesToSuspend;
        this.servicesToSuspend = servicesToSuspend;
        this.powerOnTargetVM = powerOnTargetVM;
        this.shutdownSource = shutdownSource;
    }


    /**
     * Gets the doReconfig value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @return doReconfig
     */
    public java.lang.Boolean getDoReconfig() {
        return doReconfig;
    }


    /**
     * Sets the doReconfig value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @param doReconfig
     */
    public void setDoReconfig(java.lang.Boolean doReconfig) {
        this.doReconfig = doReconfig;
    }


    /**
     * Gets the doFinalize value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @return doFinalize
     */
    public java.lang.Boolean getDoFinalize() {
        return doFinalize;
    }


    /**
     * Sets the doFinalize value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @param doFinalize
     */
    public void setDoFinalize(java.lang.Boolean doFinalize) {
        this.doFinalize = doFinalize;
    }


    /**
     * Gets the synchronizationStartTime value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @return synchronizationStartTime
     */
    public java.util.Calendar getSynchronizationStartTime() {
        return synchronizationStartTime;
    }


    /**
     * Sets the synchronizationStartTime value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @param synchronizationStartTime
     */
    public void setSynchronizationStartTime(java.util.Calendar synchronizationStartTime) {
        this.synchronizationStartTime = synchronizationStartTime;
    }


    /**
     * Gets the clearServicesToSuspend value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @return clearServicesToSuspend
     */
    public java.lang.Boolean getClearServicesToSuspend() {
        return clearServicesToSuspend;
    }


    /**
     * Sets the clearServicesToSuspend value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @param clearServicesToSuspend
     */
    public void setClearServicesToSuspend(java.lang.Boolean clearServicesToSuspend) {
        this.clearServicesToSuspend = clearServicesToSuspend;
    }


    /**
     * Gets the servicesToSuspend value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @return servicesToSuspend
     */
    public java.lang.String[] getServicesToSuspend() {
        return servicesToSuspend;
    }


    /**
     * Sets the servicesToSuspend value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @param servicesToSuspend
     */
    public void setServicesToSuspend(java.lang.String[] servicesToSuspend) {
        this.servicesToSuspend = servicesToSuspend;
    }

    public java.lang.String getServicesToSuspend(int i) {
        return this.servicesToSuspend[i];
    }

    public void setServicesToSuspend(int i, java.lang.String _value) {
        this.servicesToSuspend[i] = _value;
    }


    /**
     * Gets the powerOnTargetVM value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @return powerOnTargetVM
     */
    public java.lang.Boolean getPowerOnTargetVM() {
        return powerOnTargetVM;
    }


    /**
     * Sets the powerOnTargetVM value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @param powerOnTargetVM
     */
    public void setPowerOnTargetVM(java.lang.Boolean powerOnTargetVM) {
        this.powerOnTargetVM = powerOnTargetVM;
    }


    /**
     * Gets the shutdownSource value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @return shutdownSource
     */
    public java.lang.Boolean getShutdownSource() {
        return shutdownSource;
    }


    /**
     * Sets the shutdownSource value for this ConverterServerConversionConversionParamsUpdateSpec.
     * 
     * @param shutdownSource
     */
    public void setShutdownSource(java.lang.Boolean shutdownSource) {
        this.shutdownSource = shutdownSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterServerConversionConversionParamsUpdateSpec)) return false;
        ConverterServerConversionConversionParamsUpdateSpec other = (ConverterServerConversionConversionParamsUpdateSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.doReconfig==null && other.getDoReconfig()==null) || 
             (this.doReconfig!=null &&
              this.doReconfig.equals(other.getDoReconfig()))) &&
            ((this.doFinalize==null && other.getDoFinalize()==null) || 
             (this.doFinalize!=null &&
              this.doFinalize.equals(other.getDoFinalize()))) &&
            ((this.synchronizationStartTime==null && other.getSynchronizationStartTime()==null) || 
             (this.synchronizationStartTime!=null &&
              this.synchronizationStartTime.equals(other.getSynchronizationStartTime()))) &&
            ((this.clearServicesToSuspend==null && other.getClearServicesToSuspend()==null) || 
             (this.clearServicesToSuspend!=null &&
              this.clearServicesToSuspend.equals(other.getClearServicesToSuspend()))) &&
            ((this.servicesToSuspend==null && other.getServicesToSuspend()==null) || 
             (this.servicesToSuspend!=null &&
              java.util.Arrays.equals(this.servicesToSuspend, other.getServicesToSuspend()))) &&
            ((this.powerOnTargetVM==null && other.getPowerOnTargetVM()==null) || 
             (this.powerOnTargetVM!=null &&
              this.powerOnTargetVM.equals(other.getPowerOnTargetVM()))) &&
            ((this.shutdownSource==null && other.getShutdownSource()==null) || 
             (this.shutdownSource!=null &&
              this.shutdownSource.equals(other.getShutdownSource())));
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
        if (getDoReconfig() != null) {
            _hashCode += getDoReconfig().hashCode();
        }
        if (getDoFinalize() != null) {
            _hashCode += getDoFinalize().hashCode();
        }
        if (getSynchronizationStartTime() != null) {
            _hashCode += getSynchronizationStartTime().hashCode();
        }
        if (getClearServicesToSuspend() != null) {
            _hashCode += getClearServicesToSuspend().hashCode();
        }
        if (getServicesToSuspend() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicesToSuspend());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicesToSuspend(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPowerOnTargetVM() != null) {
            _hashCode += getPowerOnTargetVM().hashCode();
        }
        if (getShutdownSource() != null) {
            _hashCode += getShutdownSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterServerConversionConversionParamsUpdateSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterServerConversionConversionParamsUpdateSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doReconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doReconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doFinalize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doFinalize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronizationStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "synchronizationStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearServicesToSuspend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "clearServicesToSuspend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesToSuspend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "servicesToSuspend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerOnTargetVM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "powerOnTargetVM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shutdownSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "shutdownSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
