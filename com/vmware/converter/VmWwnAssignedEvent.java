/**
 * VmWwnAssignedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VmWwnAssignedEvent  extends com.vmware.converter.VmEvent  implements java.io.Serializable {
    private long[] nodeWwns;

    private long[] portWwns;

    public VmWwnAssignedEvent() {
    }

    public VmWwnAssignedEvent(
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
           boolean template,
           long[] nodeWwns,
           long[] portWwns) {
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
            changeTag,
            template);
        this.nodeWwns = nodeWwns;
        this.portWwns = portWwns;
    }


    /**
     * Gets the nodeWwns value for this VmWwnAssignedEvent.
     * 
     * @return nodeWwns
     */
    public long[] getNodeWwns() {
        return nodeWwns;
    }


    /**
     * Sets the nodeWwns value for this VmWwnAssignedEvent.
     * 
     * @param nodeWwns
     */
    public void setNodeWwns(long[] nodeWwns) {
        this.nodeWwns = nodeWwns;
    }

    public long getNodeWwns(int i) {
        return this.nodeWwns[i];
    }

    public void setNodeWwns(int i, long _value) {
        this.nodeWwns[i] = _value;
    }


    /**
     * Gets the portWwns value for this VmWwnAssignedEvent.
     * 
     * @return portWwns
     */
    public long[] getPortWwns() {
        return portWwns;
    }


    /**
     * Sets the portWwns value for this VmWwnAssignedEvent.
     * 
     * @param portWwns
     */
    public void setPortWwns(long[] portWwns) {
        this.portWwns = portWwns;
    }

    public long getPortWwns(int i) {
        return this.portWwns[i];
    }

    public void setPortWwns(int i, long _value) {
        this.portWwns[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmWwnAssignedEvent)) return false;
        VmWwnAssignedEvent other = (VmWwnAssignedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nodeWwns==null && other.getNodeWwns()==null) || 
             (this.nodeWwns!=null &&
              java.util.Arrays.equals(this.nodeWwns, other.getNodeWwns()))) &&
            ((this.portWwns==null && other.getPortWwns()==null) || 
             (this.portWwns!=null &&
              java.util.Arrays.equals(this.portWwns, other.getPortWwns())));
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
        if (getNodeWwns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNodeWwns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNodeWwns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortWwns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortWwns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortWwns(), i);
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
        new org.apache.axis.description.TypeDesc(VmWwnAssignedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmWwnAssignedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeWwns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nodeWwns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portWwns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portWwns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
