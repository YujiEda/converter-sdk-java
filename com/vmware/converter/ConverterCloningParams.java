/**
 * ConverterCloningParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterCloningParams  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ConverterTargetVmSpec target;

    private com.vmware.converter.ConverterStorageParams storageParams;

    private com.vmware.converter.ConverterNetworkParams networkParams;

    private com.vmware.converter.ConverterBasicHardwareParams basicHardwareParams;

    private com.vmware.converter.ConverterIncrementalP2VCloningParams incrementalP2VCloningParams;

    private java.lang.String[] prevBitmapIds;

    private java.lang.String nextBitmapId;

    private java.lang.Boolean snapshotSource;

    private java.lang.Boolean preserveDeviceBacking;

    private java.lang.Boolean preserveIdentity;

    private java.lang.Boolean doSynchronize;

    private java.lang.Boolean doFinalize;

    private java.lang.String[] servicesToSuspend;

    private java.lang.Boolean useProxyMode;

    public ConverterCloningParams() {
    }

    public ConverterCloningParams(
           com.vmware.converter.ConverterTargetVmSpec target,
           com.vmware.converter.ConverterStorageParams storageParams,
           com.vmware.converter.ConverterNetworkParams networkParams,
           com.vmware.converter.ConverterBasicHardwareParams basicHardwareParams,
           com.vmware.converter.ConverterIncrementalP2VCloningParams incrementalP2VCloningParams,
           java.lang.String[] prevBitmapIds,
           java.lang.String nextBitmapId,
           java.lang.Boolean snapshotSource,
           java.lang.Boolean preserveDeviceBacking,
           java.lang.Boolean preserveIdentity,
           java.lang.Boolean doSynchronize,
           java.lang.Boolean doFinalize,
           java.lang.String[] servicesToSuspend,
           java.lang.Boolean useProxyMode) {
        this.target = target;
        this.storageParams = storageParams;
        this.networkParams = networkParams;
        this.basicHardwareParams = basicHardwareParams;
        this.incrementalP2VCloningParams = incrementalP2VCloningParams;
        this.prevBitmapIds = prevBitmapIds;
        this.nextBitmapId = nextBitmapId;
        this.snapshotSource = snapshotSource;
        this.preserveDeviceBacking = preserveDeviceBacking;
        this.preserveIdentity = preserveIdentity;
        this.doSynchronize = doSynchronize;
        this.doFinalize = doFinalize;
        this.servicesToSuspend = servicesToSuspend;
        this.useProxyMode = useProxyMode;
    }


    /**
     * Gets the target value for this ConverterCloningParams.
     * 
     * @return target
     */
    public com.vmware.converter.ConverterTargetVmSpec getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ConverterCloningParams.
     * 
     * @param target
     */
    public void setTarget(com.vmware.converter.ConverterTargetVmSpec target) {
        this.target = target;
    }


    /**
     * Gets the storageParams value for this ConverterCloningParams.
     * 
     * @return storageParams
     */
    public com.vmware.converter.ConverterStorageParams getStorageParams() {
        return storageParams;
    }


    /**
     * Sets the storageParams value for this ConverterCloningParams.
     * 
     * @param storageParams
     */
    public void setStorageParams(com.vmware.converter.ConverterStorageParams storageParams) {
        this.storageParams = storageParams;
    }


    /**
     * Gets the networkParams value for this ConverterCloningParams.
     * 
     * @return networkParams
     */
    public com.vmware.converter.ConverterNetworkParams getNetworkParams() {
        return networkParams;
    }


    /**
     * Sets the networkParams value for this ConverterCloningParams.
     * 
     * @param networkParams
     */
    public void setNetworkParams(com.vmware.converter.ConverterNetworkParams networkParams) {
        this.networkParams = networkParams;
    }


    /**
     * Gets the basicHardwareParams value for this ConverterCloningParams.
     * 
     * @return basicHardwareParams
     */
    public com.vmware.converter.ConverterBasicHardwareParams getBasicHardwareParams() {
        return basicHardwareParams;
    }


    /**
     * Sets the basicHardwareParams value for this ConverterCloningParams.
     * 
     * @param basicHardwareParams
     */
    public void setBasicHardwareParams(com.vmware.converter.ConverterBasicHardwareParams basicHardwareParams) {
        this.basicHardwareParams = basicHardwareParams;
    }


    /**
     * Gets the incrementalP2VCloningParams value for this ConverterCloningParams.
     * 
     * @return incrementalP2VCloningParams
     */
    public com.vmware.converter.ConverterIncrementalP2VCloningParams getIncrementalP2VCloningParams() {
        return incrementalP2VCloningParams;
    }


    /**
     * Sets the incrementalP2VCloningParams value for this ConverterCloningParams.
     * 
     * @param incrementalP2VCloningParams
     */
    public void setIncrementalP2VCloningParams(com.vmware.converter.ConverterIncrementalP2VCloningParams incrementalP2VCloningParams) {
        this.incrementalP2VCloningParams = incrementalP2VCloningParams;
    }


    /**
     * Gets the prevBitmapIds value for this ConverterCloningParams.
     * 
     * @return prevBitmapIds
     */
    public java.lang.String[] getPrevBitmapIds() {
        return prevBitmapIds;
    }


    /**
     * Sets the prevBitmapIds value for this ConverterCloningParams.
     * 
     * @param prevBitmapIds
     */
    public void setPrevBitmapIds(java.lang.String[] prevBitmapIds) {
        this.prevBitmapIds = prevBitmapIds;
    }

    public java.lang.String getPrevBitmapIds(int i) {
        return this.prevBitmapIds[i];
    }

    public void setPrevBitmapIds(int i, java.lang.String _value) {
        this.prevBitmapIds[i] = _value;
    }


    /**
     * Gets the nextBitmapId value for this ConverterCloningParams.
     * 
     * @return nextBitmapId
     */
    public java.lang.String getNextBitmapId() {
        return nextBitmapId;
    }


    /**
     * Sets the nextBitmapId value for this ConverterCloningParams.
     * 
     * @param nextBitmapId
     */
    public void setNextBitmapId(java.lang.String nextBitmapId) {
        this.nextBitmapId = nextBitmapId;
    }


    /**
     * Gets the snapshotSource value for this ConverterCloningParams.
     * 
     * @return snapshotSource
     */
    public java.lang.Boolean getSnapshotSource() {
        return snapshotSource;
    }


    /**
     * Sets the snapshotSource value for this ConverterCloningParams.
     * 
     * @param snapshotSource
     */
    public void setSnapshotSource(java.lang.Boolean snapshotSource) {
        this.snapshotSource = snapshotSource;
    }


    /**
     * Gets the preserveDeviceBacking value for this ConverterCloningParams.
     * 
     * @return preserveDeviceBacking
     */
    public java.lang.Boolean getPreserveDeviceBacking() {
        return preserveDeviceBacking;
    }


    /**
     * Sets the preserveDeviceBacking value for this ConverterCloningParams.
     * 
     * @param preserveDeviceBacking
     */
    public void setPreserveDeviceBacking(java.lang.Boolean preserveDeviceBacking) {
        this.preserveDeviceBacking = preserveDeviceBacking;
    }


    /**
     * Gets the preserveIdentity value for this ConverterCloningParams.
     * 
     * @return preserveIdentity
     */
    public java.lang.Boolean getPreserveIdentity() {
        return preserveIdentity;
    }


    /**
     * Sets the preserveIdentity value for this ConverterCloningParams.
     * 
     * @param preserveIdentity
     */
    public void setPreserveIdentity(java.lang.Boolean preserveIdentity) {
        this.preserveIdentity = preserveIdentity;
    }


    /**
     * Gets the doSynchronize value for this ConverterCloningParams.
     * 
     * @return doSynchronize
     */
    public java.lang.Boolean getDoSynchronize() {
        return doSynchronize;
    }


    /**
     * Sets the doSynchronize value for this ConverterCloningParams.
     * 
     * @param doSynchronize
     */
    public void setDoSynchronize(java.lang.Boolean doSynchronize) {
        this.doSynchronize = doSynchronize;
    }


    /**
     * Gets the doFinalize value for this ConverterCloningParams.
     * 
     * @return doFinalize
     */
    public java.lang.Boolean getDoFinalize() {
        return doFinalize;
    }


    /**
     * Sets the doFinalize value for this ConverterCloningParams.
     * 
     * @param doFinalize
     */
    public void setDoFinalize(java.lang.Boolean doFinalize) {
        this.doFinalize = doFinalize;
    }


    /**
     * Gets the servicesToSuspend value for this ConverterCloningParams.
     * 
     * @return servicesToSuspend
     */
    public java.lang.String[] getServicesToSuspend() {
        return servicesToSuspend;
    }


    /**
     * Sets the servicesToSuspend value for this ConverterCloningParams.
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
     * Gets the useProxyMode value for this ConverterCloningParams.
     * 
     * @return useProxyMode
     */
    public java.lang.Boolean getUseProxyMode() {
        return useProxyMode;
    }


    /**
     * Sets the useProxyMode value for this ConverterCloningParams.
     * 
     * @param useProxyMode
     */
    public void setUseProxyMode(java.lang.Boolean useProxyMode) {
        this.useProxyMode = useProxyMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConverterCloningParams)) return false;
        ConverterCloningParams other = (ConverterCloningParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.storageParams==null && other.getStorageParams()==null) || 
             (this.storageParams!=null &&
              this.storageParams.equals(other.getStorageParams()))) &&
            ((this.networkParams==null && other.getNetworkParams()==null) || 
             (this.networkParams!=null &&
              this.networkParams.equals(other.getNetworkParams()))) &&
            ((this.basicHardwareParams==null && other.getBasicHardwareParams()==null) || 
             (this.basicHardwareParams!=null &&
              this.basicHardwareParams.equals(other.getBasicHardwareParams()))) &&
            ((this.incrementalP2VCloningParams==null && other.getIncrementalP2VCloningParams()==null) || 
             (this.incrementalP2VCloningParams!=null &&
              this.incrementalP2VCloningParams.equals(other.getIncrementalP2VCloningParams()))) &&
            ((this.prevBitmapIds==null && other.getPrevBitmapIds()==null) || 
             (this.prevBitmapIds!=null &&
              java.util.Arrays.equals(this.prevBitmapIds, other.getPrevBitmapIds()))) &&
            ((this.nextBitmapId==null && other.getNextBitmapId()==null) || 
             (this.nextBitmapId!=null &&
              this.nextBitmapId.equals(other.getNextBitmapId()))) &&
            ((this.snapshotSource==null && other.getSnapshotSource()==null) || 
             (this.snapshotSource!=null &&
              this.snapshotSource.equals(other.getSnapshotSource()))) &&
            ((this.preserveDeviceBacking==null && other.getPreserveDeviceBacking()==null) || 
             (this.preserveDeviceBacking!=null &&
              this.preserveDeviceBacking.equals(other.getPreserveDeviceBacking()))) &&
            ((this.preserveIdentity==null && other.getPreserveIdentity()==null) || 
             (this.preserveIdentity!=null &&
              this.preserveIdentity.equals(other.getPreserveIdentity()))) &&
            ((this.doSynchronize==null && other.getDoSynchronize()==null) || 
             (this.doSynchronize!=null &&
              this.doSynchronize.equals(other.getDoSynchronize()))) &&
            ((this.doFinalize==null && other.getDoFinalize()==null) || 
             (this.doFinalize!=null &&
              this.doFinalize.equals(other.getDoFinalize()))) &&
            ((this.servicesToSuspend==null && other.getServicesToSuspend()==null) || 
             (this.servicesToSuspend!=null &&
              java.util.Arrays.equals(this.servicesToSuspend, other.getServicesToSuspend()))) &&
            ((this.useProxyMode==null && other.getUseProxyMode()==null) || 
             (this.useProxyMode!=null &&
              this.useProxyMode.equals(other.getUseProxyMode())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getStorageParams() != null) {
            _hashCode += getStorageParams().hashCode();
        }
        if (getNetworkParams() != null) {
            _hashCode += getNetworkParams().hashCode();
        }
        if (getBasicHardwareParams() != null) {
            _hashCode += getBasicHardwareParams().hashCode();
        }
        if (getIncrementalP2VCloningParams() != null) {
            _hashCode += getIncrementalP2VCloningParams().hashCode();
        }
        if (getPrevBitmapIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrevBitmapIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrevBitmapIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextBitmapId() != null) {
            _hashCode += getNextBitmapId().hashCode();
        }
        if (getSnapshotSource() != null) {
            _hashCode += getSnapshotSource().hashCode();
        }
        if (getPreserveDeviceBacking() != null) {
            _hashCode += getPreserveDeviceBacking().hashCode();
        }
        if (getPreserveIdentity() != null) {
            _hashCode += getPreserveIdentity().hashCode();
        }
        if (getDoSynchronize() != null) {
            _hashCode += getDoSynchronize().hashCode();
        }
        if (getDoFinalize() != null) {
            _hashCode += getDoFinalize().hashCode();
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
        if (getUseProxyMode() != null) {
            _hashCode += getUseProxyMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConverterCloningParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterCloningParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterTargetVmSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "storageParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterStorageParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "networkParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterNetworkParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicHardwareParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "basicHardwareParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterBasicHardwareParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incrementalP2VCloningParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "incrementalP2VCloningParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterIncrementalP2VCloningParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevBitmapIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "prevBitmapIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBitmapId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "nextBitmapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "snapshotSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveDeviceBacking");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "preserveDeviceBacking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "preserveIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doSynchronize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "doSynchronize"));
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
        elemField.setFieldName("servicesToSuspend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "servicesToSuspend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useProxyMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:converter", "useProxyMode"));
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
