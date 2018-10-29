/**
 * VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState  extends com.vmware.converter.VirtualMachineDeviceRuntimeInfoDeviceRuntimeState  implements java.io.Serializable {
    private boolean vmDirectPathGen2Active;

    private java.lang.String[] vmDirectPathGen2InactiveReasonVm;

    private java.lang.String[] vmDirectPathGen2InactiveReasonOther;

    private java.lang.String vmDirectPathGen2InactiveReasonExtended;

    private java.lang.String reservationStatus;

    public VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState() {
    }

    public VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState(
           boolean vmDirectPathGen2Active,
           java.lang.String[] vmDirectPathGen2InactiveReasonVm,
           java.lang.String[] vmDirectPathGen2InactiveReasonOther,
           java.lang.String vmDirectPathGen2InactiveReasonExtended,
           java.lang.String reservationStatus) {
        this.vmDirectPathGen2Active = vmDirectPathGen2Active;
        this.vmDirectPathGen2InactiveReasonVm = vmDirectPathGen2InactiveReasonVm;
        this.vmDirectPathGen2InactiveReasonOther = vmDirectPathGen2InactiveReasonOther;
        this.vmDirectPathGen2InactiveReasonExtended = vmDirectPathGen2InactiveReasonExtended;
        this.reservationStatus = reservationStatus;
    }


    /**
     * Gets the vmDirectPathGen2Active value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @return vmDirectPathGen2Active
     */
    public boolean isVmDirectPathGen2Active() {
        return vmDirectPathGen2Active;
    }


    /**
     * Sets the vmDirectPathGen2Active value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @param vmDirectPathGen2Active
     */
    public void setVmDirectPathGen2Active(boolean vmDirectPathGen2Active) {
        this.vmDirectPathGen2Active = vmDirectPathGen2Active;
    }


    /**
     * Gets the vmDirectPathGen2InactiveReasonVm value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @return vmDirectPathGen2InactiveReasonVm
     */
    public java.lang.String[] getVmDirectPathGen2InactiveReasonVm() {
        return vmDirectPathGen2InactiveReasonVm;
    }


    /**
     * Sets the vmDirectPathGen2InactiveReasonVm value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @param vmDirectPathGen2InactiveReasonVm
     */
    public void setVmDirectPathGen2InactiveReasonVm(java.lang.String[] vmDirectPathGen2InactiveReasonVm) {
        this.vmDirectPathGen2InactiveReasonVm = vmDirectPathGen2InactiveReasonVm;
    }

    public java.lang.String getVmDirectPathGen2InactiveReasonVm(int i) {
        return this.vmDirectPathGen2InactiveReasonVm[i];
    }

    public void setVmDirectPathGen2InactiveReasonVm(int i, java.lang.String _value) {
        this.vmDirectPathGen2InactiveReasonVm[i] = _value;
    }


    /**
     * Gets the vmDirectPathGen2InactiveReasonOther value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @return vmDirectPathGen2InactiveReasonOther
     */
    public java.lang.String[] getVmDirectPathGen2InactiveReasonOther() {
        return vmDirectPathGen2InactiveReasonOther;
    }


    /**
     * Sets the vmDirectPathGen2InactiveReasonOther value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @param vmDirectPathGen2InactiveReasonOther
     */
    public void setVmDirectPathGen2InactiveReasonOther(java.lang.String[] vmDirectPathGen2InactiveReasonOther) {
        this.vmDirectPathGen2InactiveReasonOther = vmDirectPathGen2InactiveReasonOther;
    }

    public java.lang.String getVmDirectPathGen2InactiveReasonOther(int i) {
        return this.vmDirectPathGen2InactiveReasonOther[i];
    }

    public void setVmDirectPathGen2InactiveReasonOther(int i, java.lang.String _value) {
        this.vmDirectPathGen2InactiveReasonOther[i] = _value;
    }


    /**
     * Gets the vmDirectPathGen2InactiveReasonExtended value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @return vmDirectPathGen2InactiveReasonExtended
     */
    public java.lang.String getVmDirectPathGen2InactiveReasonExtended() {
        return vmDirectPathGen2InactiveReasonExtended;
    }


    /**
     * Sets the vmDirectPathGen2InactiveReasonExtended value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @param vmDirectPathGen2InactiveReasonExtended
     */
    public void setVmDirectPathGen2InactiveReasonExtended(java.lang.String vmDirectPathGen2InactiveReasonExtended) {
        this.vmDirectPathGen2InactiveReasonExtended = vmDirectPathGen2InactiveReasonExtended;
    }


    /**
     * Gets the reservationStatus value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @return reservationStatus
     */
    public java.lang.String getReservationStatus() {
        return reservationStatus;
    }


    /**
     * Sets the reservationStatus value for this VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.
     * 
     * @param reservationStatus
     */
    public void setReservationStatus(java.lang.String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState)) return false;
        VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState other = (VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.vmDirectPathGen2Active == other.isVmDirectPathGen2Active() &&
            ((this.vmDirectPathGen2InactiveReasonVm==null && other.getVmDirectPathGen2InactiveReasonVm()==null) || 
             (this.vmDirectPathGen2InactiveReasonVm!=null &&
              java.util.Arrays.equals(this.vmDirectPathGen2InactiveReasonVm, other.getVmDirectPathGen2InactiveReasonVm()))) &&
            ((this.vmDirectPathGen2InactiveReasonOther==null && other.getVmDirectPathGen2InactiveReasonOther()==null) || 
             (this.vmDirectPathGen2InactiveReasonOther!=null &&
              java.util.Arrays.equals(this.vmDirectPathGen2InactiveReasonOther, other.getVmDirectPathGen2InactiveReasonOther()))) &&
            ((this.vmDirectPathGen2InactiveReasonExtended==null && other.getVmDirectPathGen2InactiveReasonExtended()==null) || 
             (this.vmDirectPathGen2InactiveReasonExtended!=null &&
              this.vmDirectPathGen2InactiveReasonExtended.equals(other.getVmDirectPathGen2InactiveReasonExtended()))) &&
            ((this.reservationStatus==null && other.getReservationStatus()==null) || 
             (this.reservationStatus!=null &&
              this.reservationStatus.equals(other.getReservationStatus())));
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
        _hashCode += (isVmDirectPathGen2Active() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVmDirectPathGen2InactiveReasonVm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmDirectPathGen2InactiveReasonVm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmDirectPathGen2InactiveReasonVm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVmDirectPathGen2InactiveReasonOther() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmDirectPathGen2InactiveReasonOther());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmDirectPathGen2InactiveReasonOther(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVmDirectPathGen2InactiveReasonExtended() != null) {
            _hashCode += getVmDirectPathGen2InactiveReasonExtended().hashCode();
        }
        if (getReservationStatus() != null) {
            _hashCode += getReservationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2Active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2InactiveReasonVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2InactiveReasonVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2InactiveReasonOther");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2InactiveReasonOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDirectPathGen2InactiveReasonExtended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmDirectPathGen2InactiveReasonExtended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reservationStatus"));
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
