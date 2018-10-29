/**
 * ReplicationConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ReplicationConfigSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private long generation;

    private java.lang.String vmReplicationId;

    private java.lang.String destination;

    private int port;

    private long rpo;

    private boolean quiesceGuestEnabled;

    private boolean paused;

    private boolean oppUpdatesEnabled;

    private java.lang.Boolean netCompressionEnabled;

    private com.vmware.converter.ReplicationInfoDiskSettings[] disk;

    public ReplicationConfigSpec() {
    }

    public ReplicationConfigSpec(
           long generation,
           java.lang.String vmReplicationId,
           java.lang.String destination,
           int port,
           long rpo,
           boolean quiesceGuestEnabled,
           boolean paused,
           boolean oppUpdatesEnabled,
           java.lang.Boolean netCompressionEnabled,
           com.vmware.converter.ReplicationInfoDiskSettings[] disk) {
        this.generation = generation;
        this.vmReplicationId = vmReplicationId;
        this.destination = destination;
        this.port = port;
        this.rpo = rpo;
        this.quiesceGuestEnabled = quiesceGuestEnabled;
        this.paused = paused;
        this.oppUpdatesEnabled = oppUpdatesEnabled;
        this.netCompressionEnabled = netCompressionEnabled;
        this.disk = disk;
    }


    /**
     * Gets the generation value for this ReplicationConfigSpec.
     * 
     * @return generation
     */
    public long getGeneration() {
        return generation;
    }


    /**
     * Sets the generation value for this ReplicationConfigSpec.
     * 
     * @param generation
     */
    public void setGeneration(long generation) {
        this.generation = generation;
    }


    /**
     * Gets the vmReplicationId value for this ReplicationConfigSpec.
     * 
     * @return vmReplicationId
     */
    public java.lang.String getVmReplicationId() {
        return vmReplicationId;
    }


    /**
     * Sets the vmReplicationId value for this ReplicationConfigSpec.
     * 
     * @param vmReplicationId
     */
    public void setVmReplicationId(java.lang.String vmReplicationId) {
        this.vmReplicationId = vmReplicationId;
    }


    /**
     * Gets the destination value for this ReplicationConfigSpec.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this ReplicationConfigSpec.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the port value for this ReplicationConfigSpec.
     * 
     * @return port
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this ReplicationConfigSpec.
     * 
     * @param port
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the rpo value for this ReplicationConfigSpec.
     * 
     * @return rpo
     */
    public long getRpo() {
        return rpo;
    }


    /**
     * Sets the rpo value for this ReplicationConfigSpec.
     * 
     * @param rpo
     */
    public void setRpo(long rpo) {
        this.rpo = rpo;
    }


    /**
     * Gets the quiesceGuestEnabled value for this ReplicationConfigSpec.
     * 
     * @return quiesceGuestEnabled
     */
    public boolean isQuiesceGuestEnabled() {
        return quiesceGuestEnabled;
    }


    /**
     * Sets the quiesceGuestEnabled value for this ReplicationConfigSpec.
     * 
     * @param quiesceGuestEnabled
     */
    public void setQuiesceGuestEnabled(boolean quiesceGuestEnabled) {
        this.quiesceGuestEnabled = quiesceGuestEnabled;
    }


    /**
     * Gets the paused value for this ReplicationConfigSpec.
     * 
     * @return paused
     */
    public boolean isPaused() {
        return paused;
    }


    /**
     * Sets the paused value for this ReplicationConfigSpec.
     * 
     * @param paused
     */
    public void setPaused(boolean paused) {
        this.paused = paused;
    }


    /**
     * Gets the oppUpdatesEnabled value for this ReplicationConfigSpec.
     * 
     * @return oppUpdatesEnabled
     */
    public boolean isOppUpdatesEnabled() {
        return oppUpdatesEnabled;
    }


    /**
     * Sets the oppUpdatesEnabled value for this ReplicationConfigSpec.
     * 
     * @param oppUpdatesEnabled
     */
    public void setOppUpdatesEnabled(boolean oppUpdatesEnabled) {
        this.oppUpdatesEnabled = oppUpdatesEnabled;
    }


    /**
     * Gets the netCompressionEnabled value for this ReplicationConfigSpec.
     * 
     * @return netCompressionEnabled
     */
    public java.lang.Boolean getNetCompressionEnabled() {
        return netCompressionEnabled;
    }


    /**
     * Sets the netCompressionEnabled value for this ReplicationConfigSpec.
     * 
     * @param netCompressionEnabled
     */
    public void setNetCompressionEnabled(java.lang.Boolean netCompressionEnabled) {
        this.netCompressionEnabled = netCompressionEnabled;
    }


    /**
     * Gets the disk value for this ReplicationConfigSpec.
     * 
     * @return disk
     */
    public com.vmware.converter.ReplicationInfoDiskSettings[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this ReplicationConfigSpec.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.converter.ReplicationInfoDiskSettings[] disk) {
        this.disk = disk;
    }

    public com.vmware.converter.ReplicationInfoDiskSettings getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.converter.ReplicationInfoDiskSettings _value) {
        this.disk[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplicationConfigSpec)) return false;
        ReplicationConfigSpec other = (ReplicationConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.generation == other.getGeneration() &&
            ((this.vmReplicationId==null && other.getVmReplicationId()==null) || 
             (this.vmReplicationId!=null &&
              this.vmReplicationId.equals(other.getVmReplicationId()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.port == other.getPort() &&
            this.rpo == other.getRpo() &&
            this.quiesceGuestEnabled == other.isQuiesceGuestEnabled() &&
            this.paused == other.isPaused() &&
            this.oppUpdatesEnabled == other.isOppUpdatesEnabled() &&
            ((this.netCompressionEnabled==null && other.getNetCompressionEnabled()==null) || 
             (this.netCompressionEnabled!=null &&
              this.netCompressionEnabled.equals(other.getNetCompressionEnabled()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk())));
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
        _hashCode += new Long(getGeneration()).hashCode();
        if (getVmReplicationId() != null) {
            _hashCode += getVmReplicationId().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        _hashCode += getPort();
        _hashCode += new Long(getRpo()).hashCode();
        _hashCode += (isQuiesceGuestEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPaused() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOppUpdatesEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNetCompressionEnabled() != null) {
            _hashCode += getNetCompressionEnabled().hashCode();
        }
        if (getDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisk(), i);
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
        new org.apache.axis.description.TypeDesc(ReplicationConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "generation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmReplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmReplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rpo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quiesceGuestEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "quiesceGuestEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paused");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "paused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oppUpdatesEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oppUpdatesEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netCompressionEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "netCompressionEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ReplicationInfoDiskSettings"));
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
