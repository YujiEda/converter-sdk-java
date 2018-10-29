/**
 * HostOpaqueSwitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostOpaqueSwitch  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String name;

    private java.lang.String[] pnic;

    private com.vmware.converter.HostOpaqueSwitchPhysicalNicZone[] pnicZone;

    private java.lang.String status;

    private com.vmware.converter.HostVirtualNic[] vtep;

    public HostOpaqueSwitch() {
    }

    public HostOpaqueSwitch(
           java.lang.String key,
           java.lang.String name,
           java.lang.String[] pnic,
           com.vmware.converter.HostOpaqueSwitchPhysicalNicZone[] pnicZone,
           java.lang.String status,
           com.vmware.converter.HostVirtualNic[] vtep) {
        this.key = key;
        this.name = name;
        this.pnic = pnic;
        this.pnicZone = pnicZone;
        this.status = status;
        this.vtep = vtep;
    }


    /**
     * Gets the key value for this HostOpaqueSwitch.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostOpaqueSwitch.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the name value for this HostOpaqueSwitch.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostOpaqueSwitch.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the pnic value for this HostOpaqueSwitch.
     * 
     * @return pnic
     */
    public java.lang.String[] getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this HostOpaqueSwitch.
     * 
     * @param pnic
     */
    public void setPnic(java.lang.String[] pnic) {
        this.pnic = pnic;
    }

    public java.lang.String getPnic(int i) {
        return this.pnic[i];
    }

    public void setPnic(int i, java.lang.String _value) {
        this.pnic[i] = _value;
    }


    /**
     * Gets the pnicZone value for this HostOpaqueSwitch.
     * 
     * @return pnicZone
     */
    public com.vmware.converter.HostOpaqueSwitchPhysicalNicZone[] getPnicZone() {
        return pnicZone;
    }


    /**
     * Sets the pnicZone value for this HostOpaqueSwitch.
     * 
     * @param pnicZone
     */
    public void setPnicZone(com.vmware.converter.HostOpaqueSwitchPhysicalNicZone[] pnicZone) {
        this.pnicZone = pnicZone;
    }

    public com.vmware.converter.HostOpaqueSwitchPhysicalNicZone getPnicZone(int i) {
        return this.pnicZone[i];
    }

    public void setPnicZone(int i, com.vmware.converter.HostOpaqueSwitchPhysicalNicZone _value) {
        this.pnicZone[i] = _value;
    }


    /**
     * Gets the status value for this HostOpaqueSwitch.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HostOpaqueSwitch.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the vtep value for this HostOpaqueSwitch.
     * 
     * @return vtep
     */
    public com.vmware.converter.HostVirtualNic[] getVtep() {
        return vtep;
    }


    /**
     * Sets the vtep value for this HostOpaqueSwitch.
     * 
     * @param vtep
     */
    public void setVtep(com.vmware.converter.HostVirtualNic[] vtep) {
        this.vtep = vtep;
    }

    public com.vmware.converter.HostVirtualNic getVtep(int i) {
        return this.vtep[i];
    }

    public void setVtep(int i, com.vmware.converter.HostVirtualNic _value) {
        this.vtep[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostOpaqueSwitch)) return false;
        HostOpaqueSwitch other = (HostOpaqueSwitch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.pnic==null && other.getPnic()==null) || 
             (this.pnic!=null &&
              java.util.Arrays.equals(this.pnic, other.getPnic()))) &&
            ((this.pnicZone==null && other.getPnicZone()==null) || 
             (this.pnicZone!=null &&
              java.util.Arrays.equals(this.pnicZone, other.getPnicZone()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.vtep==null && other.getVtep()==null) || 
             (this.vtep!=null &&
              java.util.Arrays.equals(this.vtep, other.getVtep())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPnicZone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnicZone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnicZone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVtep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVtep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVtep(), i);
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
        new org.apache.axis.description.TypeDesc(HostOpaqueSwitch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueSwitch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostOpaqueSwitchPhysicalNicZone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vtep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vtep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNic"));
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
