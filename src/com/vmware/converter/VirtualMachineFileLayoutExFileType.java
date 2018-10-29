/**
 * VirtualMachineFileLayoutExFileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualMachineFileLayoutExFileType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineFileLayoutExFileType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _config = "config";
    public static final java.lang.String _extendedConfig = "extendedConfig";
    public static final java.lang.String _diskDescriptor = "diskDescriptor";
    public static final java.lang.String _diskExtent = "diskExtent";
    public static final java.lang.String _digestDescriptor = "digestDescriptor";
    public static final java.lang.String _digestExtent = "digestExtent";
    public static final java.lang.String _diskReplicationState = "diskReplicationState";
    public static final java.lang.String _log = "log";
    public static final java.lang.String _stat = "stat";
    public static final java.lang.String _namespaceData = "namespaceData";
    public static final java.lang.String _nvram = "nvram";
    public static final java.lang.String _snapshotData = "snapshotData";
    public static final java.lang.String _snapshotMemory = "snapshotMemory";
    public static final java.lang.String _snapshotList = "snapshotList";
    public static final java.lang.String _snapshotManifestList = "snapshotManifestList";
    public static final java.lang.String _suspend = "suspend";
    public static final java.lang.String _suspendMemory = "suspendMemory";
    public static final java.lang.String _swap = "swap";
    public static final java.lang.String _uwswap = "uwswap";
    public static final java.lang.String _core = "core";
    public static final java.lang.String _screenshot = "screenshot";
    public static final java.lang.String _ftMetadata = "ftMetadata";
    public static final java.lang.String _guestCustomization = "guestCustomization";
    public static final VirtualMachineFileLayoutExFileType config = new VirtualMachineFileLayoutExFileType(_config);
    public static final VirtualMachineFileLayoutExFileType extendedConfig = new VirtualMachineFileLayoutExFileType(_extendedConfig);
    public static final VirtualMachineFileLayoutExFileType diskDescriptor = new VirtualMachineFileLayoutExFileType(_diskDescriptor);
    public static final VirtualMachineFileLayoutExFileType diskExtent = new VirtualMachineFileLayoutExFileType(_diskExtent);
    public static final VirtualMachineFileLayoutExFileType digestDescriptor = new VirtualMachineFileLayoutExFileType(_digestDescriptor);
    public static final VirtualMachineFileLayoutExFileType digestExtent = new VirtualMachineFileLayoutExFileType(_digestExtent);
    public static final VirtualMachineFileLayoutExFileType diskReplicationState = new VirtualMachineFileLayoutExFileType(_diskReplicationState);
    public static final VirtualMachineFileLayoutExFileType log = new VirtualMachineFileLayoutExFileType(_log);
    public static final VirtualMachineFileLayoutExFileType stat = new VirtualMachineFileLayoutExFileType(_stat);
    public static final VirtualMachineFileLayoutExFileType namespaceData = new VirtualMachineFileLayoutExFileType(_namespaceData);
    public static final VirtualMachineFileLayoutExFileType nvram = new VirtualMachineFileLayoutExFileType(_nvram);
    public static final VirtualMachineFileLayoutExFileType snapshotData = new VirtualMachineFileLayoutExFileType(_snapshotData);
    public static final VirtualMachineFileLayoutExFileType snapshotMemory = new VirtualMachineFileLayoutExFileType(_snapshotMemory);
    public static final VirtualMachineFileLayoutExFileType snapshotList = new VirtualMachineFileLayoutExFileType(_snapshotList);
    public static final VirtualMachineFileLayoutExFileType snapshotManifestList = new VirtualMachineFileLayoutExFileType(_snapshotManifestList);
    public static final VirtualMachineFileLayoutExFileType suspend = new VirtualMachineFileLayoutExFileType(_suspend);
    public static final VirtualMachineFileLayoutExFileType suspendMemory = new VirtualMachineFileLayoutExFileType(_suspendMemory);
    public static final VirtualMachineFileLayoutExFileType swap = new VirtualMachineFileLayoutExFileType(_swap);
    public static final VirtualMachineFileLayoutExFileType uwswap = new VirtualMachineFileLayoutExFileType(_uwswap);
    public static final VirtualMachineFileLayoutExFileType core = new VirtualMachineFileLayoutExFileType(_core);
    public static final VirtualMachineFileLayoutExFileType screenshot = new VirtualMachineFileLayoutExFileType(_screenshot);
    public static final VirtualMachineFileLayoutExFileType ftMetadata = new VirtualMachineFileLayoutExFileType(_ftMetadata);
    public static final VirtualMachineFileLayoutExFileType guestCustomization = new VirtualMachineFileLayoutExFileType(_guestCustomization);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineFileLayoutExFileType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineFileLayoutExFileType enumeration = (VirtualMachineFileLayoutExFileType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineFileLayoutExFileType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineFileLayoutExFileType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExFileType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
