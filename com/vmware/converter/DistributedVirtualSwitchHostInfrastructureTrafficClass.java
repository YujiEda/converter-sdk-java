/**
 * DistributedVirtualSwitchHostInfrastructureTrafficClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class DistributedVirtualSwitchHostInfrastructureTrafficClass implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DistributedVirtualSwitchHostInfrastructureTrafficClass(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _management = "management";
    public static final java.lang.String _faultTolerance = "faultTolerance";
    public static final java.lang.String _vmotion = "vmotion";
    public static final java.lang.String _virtualMachine = "virtualMachine";
    public static final java.lang.String _iSCSI = "iSCSI";
    public static final java.lang.String _nfs = "nfs";
    public static final java.lang.String _hbr = "hbr";
    public static final java.lang.String _vsan = "vsan";
    public static final java.lang.String _vdp = "vdp";
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass management = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_management);
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass faultTolerance = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_faultTolerance);
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass vmotion = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_vmotion);
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass virtualMachine = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_virtualMachine);
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass iSCSI = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_iSCSI);
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass nfs = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_nfs);
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass hbr = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_hbr);
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass vsan = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_vsan);
    public static final DistributedVirtualSwitchHostInfrastructureTrafficClass vdp = new DistributedVirtualSwitchHostInfrastructureTrafficClass(_vdp);
    public java.lang.String getValue() { return _value_;}
    public static DistributedVirtualSwitchHostInfrastructureTrafficClass fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DistributedVirtualSwitchHostInfrastructureTrafficClass enumeration = (DistributedVirtualSwitchHostInfrastructureTrafficClass)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DistributedVirtualSwitchHostInfrastructureTrafficClass fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchHostInfrastructureTrafficClass.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostInfrastructureTrafficClass"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
