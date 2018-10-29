/**
 * HostWwnChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostWwnChangedEvent  extends com.vmware.converter.HostEvent  implements java.io.Serializable {
    private long[] oldNodeWwns;

    private long[] oldPortWwns;

    private long[] newNodeWwns;

    private long[] newPortWwns;

    public HostWwnChangedEvent() {
    }

    public HostWwnChangedEvent(
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
           long[] oldNodeWwns,
           long[] oldPortWwns,
           long[] newNodeWwns,
           long[] newPortWwns) {
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
        this.oldNodeWwns = oldNodeWwns;
        this.oldPortWwns = oldPortWwns;
        this.newNodeWwns = newNodeWwns;
        this.newPortWwns = newPortWwns;
    }


    /**
     * Gets the oldNodeWwns value for this HostWwnChangedEvent.
     * 
     * @return oldNodeWwns
     */
    public long[] getOldNodeWwns() {
        return oldNodeWwns;
    }


    /**
     * Sets the oldNodeWwns value for this HostWwnChangedEvent.
     * 
     * @param oldNodeWwns
     */
    public void setOldNodeWwns(long[] oldNodeWwns) {
        this.oldNodeWwns = oldNodeWwns;
    }

    public long getOldNodeWwns(int i) {
        return this.oldNodeWwns[i];
    }

    public void setOldNodeWwns(int i, long _value) {
        this.oldNodeWwns[i] = _value;
    }


    /**
     * Gets the oldPortWwns value for this HostWwnChangedEvent.
     * 
     * @return oldPortWwns
     */
    public long[] getOldPortWwns() {
        return oldPortWwns;
    }


    /**
     * Sets the oldPortWwns value for this HostWwnChangedEvent.
     * 
     * @param oldPortWwns
     */
    public void setOldPortWwns(long[] oldPortWwns) {
        this.oldPortWwns = oldPortWwns;
    }

    public long getOldPortWwns(int i) {
        return this.oldPortWwns[i];
    }

    public void setOldPortWwns(int i, long _value) {
        this.oldPortWwns[i] = _value;
    }


    /**
     * Gets the newNodeWwns value for this HostWwnChangedEvent.
     * 
     * @return newNodeWwns
     */
    public long[] getNewNodeWwns() {
        return newNodeWwns;
    }


    /**
     * Sets the newNodeWwns value for this HostWwnChangedEvent.
     * 
     * @param newNodeWwns
     */
    public void setNewNodeWwns(long[] newNodeWwns) {
        this.newNodeWwns = newNodeWwns;
    }

    public long getNewNodeWwns(int i) {
        return this.newNodeWwns[i];
    }

    public void setNewNodeWwns(int i, long _value) {
        this.newNodeWwns[i] = _value;
    }


    /**
     * Gets the newPortWwns value for this HostWwnChangedEvent.
     * 
     * @return newPortWwns
     */
    public long[] getNewPortWwns() {
        return newPortWwns;
    }


    /**
     * Sets the newPortWwns value for this HostWwnChangedEvent.
     * 
     * @param newPortWwns
     */
    public void setNewPortWwns(long[] newPortWwns) {
        this.newPortWwns = newPortWwns;
    }

    public long getNewPortWwns(int i) {
        return this.newPortWwns[i];
    }

    public void setNewPortWwns(int i, long _value) {
        this.newPortWwns[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostWwnChangedEvent)) return false;
        HostWwnChangedEvent other = (HostWwnChangedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldNodeWwns==null && other.getOldNodeWwns()==null) || 
             (this.oldNodeWwns!=null &&
              java.util.Arrays.equals(this.oldNodeWwns, other.getOldNodeWwns()))) &&
            ((this.oldPortWwns==null && other.getOldPortWwns()==null) || 
             (this.oldPortWwns!=null &&
              java.util.Arrays.equals(this.oldPortWwns, other.getOldPortWwns()))) &&
            ((this.newNodeWwns==null && other.getNewNodeWwns()==null) || 
             (this.newNodeWwns!=null &&
              java.util.Arrays.equals(this.newNodeWwns, other.getNewNodeWwns()))) &&
            ((this.newPortWwns==null && other.getNewPortWwns()==null) || 
             (this.newPortWwns!=null &&
              java.util.Arrays.equals(this.newPortWwns, other.getNewPortWwns())));
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
        if (getOldNodeWwns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOldNodeWwns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOldNodeWwns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOldPortWwns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOldPortWwns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOldPortWwns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewNodeWwns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewNodeWwns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewNodeWwns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewPortWwns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewPortWwns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewPortWwns(), i);
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
        new org.apache.axis.description.TypeDesc(HostWwnChangedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostWwnChangedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldNodeWwns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldNodeWwns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPortWwns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldPortWwns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newNodeWwns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newNodeWwns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPortWwns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newPortWwns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
