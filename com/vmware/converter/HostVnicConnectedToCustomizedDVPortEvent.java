/**
 * HostVnicConnectedToCustomizedDVPortEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostVnicConnectedToCustomizedDVPortEvent  extends com.vmware.converter.HostEvent  implements java.io.Serializable {
    private com.vmware.converter.VnicPortArgument vnic;

    public HostVnicConnectedToCustomizedDVPortEvent() {
    }

    public HostVnicConnectedToCustomizedDVPortEvent(
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
           com.vmware.converter.VnicPortArgument vnic) {
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
        this.vnic = vnic;
    }


    /**
     * Gets the vnic value for this HostVnicConnectedToCustomizedDVPortEvent.
     * 
     * @return vnic
     */
    public com.vmware.converter.VnicPortArgument getVnic() {
        return vnic;
    }


    /**
     * Sets the vnic value for this HostVnicConnectedToCustomizedDVPortEvent.
     * 
     * @param vnic
     */
    public void setVnic(com.vmware.converter.VnicPortArgument vnic) {
        this.vnic = vnic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVnicConnectedToCustomizedDVPortEvent)) return false;
        HostVnicConnectedToCustomizedDVPortEvent other = (HostVnicConnectedToCustomizedDVPortEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vnic==null && other.getVnic()==null) || 
             (this.vnic!=null &&
              this.vnic.equals(other.getVnic())));
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
        if (getVnic() != null) {
            _hashCode += getVnic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVnicConnectedToCustomizedDVPortEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVnicConnectedToCustomizedDVPortEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VnicPortArgument"));
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
