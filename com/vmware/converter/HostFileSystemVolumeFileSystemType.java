/**
 * HostFileSystemVolumeFileSystemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostFileSystemVolumeFileSystemType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostFileSystemVolumeFileSystemType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VMFS = "VMFS";
    public static final java.lang.String _NFS = "NFS";
    public static final java.lang.String _NFS41 = "NFS41";
    public static final java.lang.String _CIFS = "CIFS";
    public static final java.lang.String _vsan = "vsan";
    public static final java.lang.String _VFFS = "VFFS";
    public static final java.lang.String _VVOL = "VVOL";
    public static final java.lang.String _OTHER = "OTHER";
    public static final HostFileSystemVolumeFileSystemType VMFS = new HostFileSystemVolumeFileSystemType(_VMFS);
    public static final HostFileSystemVolumeFileSystemType NFS = new HostFileSystemVolumeFileSystemType(_NFS);
    public static final HostFileSystemVolumeFileSystemType NFS41 = new HostFileSystemVolumeFileSystemType(_NFS41);
    public static final HostFileSystemVolumeFileSystemType CIFS = new HostFileSystemVolumeFileSystemType(_CIFS);
    public static final HostFileSystemVolumeFileSystemType vsan = new HostFileSystemVolumeFileSystemType(_vsan);
    public static final HostFileSystemVolumeFileSystemType VFFS = new HostFileSystemVolumeFileSystemType(_VFFS);
    public static final HostFileSystemVolumeFileSystemType VVOL = new HostFileSystemVolumeFileSystemType(_VVOL);
    public static final HostFileSystemVolumeFileSystemType OTHER = new HostFileSystemVolumeFileSystemType(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static HostFileSystemVolumeFileSystemType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostFileSystemVolumeFileSystemType enumeration = (HostFileSystemVolumeFileSystemType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostFileSystemVolumeFileSystemType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostFileSystemVolumeFileSystemType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFileSystemVolumeFileSystemType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
