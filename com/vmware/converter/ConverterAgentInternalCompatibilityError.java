/**
 * ConverterAgentInternalCompatibilityError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class ConverterAgentInternalCompatibilityError implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConverterAgentInternalCompatibilityError(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IMPORT_SLAVE_INCOMPATIBLE = "IMPORT_SLAVE_INCOMPATIBLE";
    public static final java.lang.String _IMPORT_SOURCE_MANAGED_HOST_NOT_FOUND = "IMPORT_SOURCE_MANAGED_HOST_NOT_FOUND";
    public static final java.lang.String _IMPORT_SOURCE_MANAGED_HOST_BAD_CREDENTIALS = "IMPORT_SOURCE_MANAGED_HOST_BAD_CREDENTIALS";
    public static final java.lang.String _IMPORT_SOURCE_MANAGED_HOST_NO_PERMISSION = "IMPORT_SOURCE_MANAGED_HOST_NO_PERMISSION";
    public static final java.lang.String _IMPORT_SOURCE_HOST_NOT_CONNECTED = "IMPORT_SOURCE_HOST_NOT_CONNECTED";
    public static final java.lang.String _IMPORT_SOURCE_V2I_NO_IMPORT = "IMPORT_SOURCE_V2I_NO_IMPORT";
    public static final java.lang.String _IMPORT_SOURCE_VPC_CONFIG_FILE_PARSE_ERROR = "IMPORT_SOURCE_VPC_CONFIG_FILE_PARSE_ERROR";
    public static final java.lang.String _IMPORT_DEST_MANAGED_HOST_NOT_FOUND = "IMPORT_DEST_MANAGED_HOST_NOT_FOUND";
    public static final java.lang.String _IMPORT_DEST_MANAGED_HOST_BAD_CREDENTIALS = "IMPORT_DEST_MANAGED_HOST_BAD_CREDENTIALS";
    public static final java.lang.String _IMPORT_DEST_MANAGED_HOST_NO_PERMISSION = "IMPORT_DEST_MANAGED_HOST_NO_PERMISSION";
    public static final java.lang.String _IMPORT_DEST_ALREADY_EXISTS = "IMPORT_DEST_ALREADY_EXISTS";
    public static final java.lang.String _IMPORT_DEST_NO_PERMISSION = "IMPORT_DEST_NO_PERMISSION";
    public static final java.lang.String _IMPORT_DEST_NOT_FOUND = "IMPORT_DEST_NOT_FOUND";
    public static final java.lang.String _IMPORT_DEST_INCOMPATIBLE_DISK_TYPE = "IMPORT_DEST_INCOMPATIBLE_DISK_TYPE";
    public static final java.lang.String _IMPORT_DEST_DOWN_HW_LEVEL_LINK = "IMPORT_DEST_DOWN_HW_LEVEL_LINK";
    public static final java.lang.String _IMPORT_DEST_UP_HW_LEVEL_LINK = "IMPORT_DEST_UP_HW_LEVEL_LINK";
    public static final java.lang.String _IMPORT_DEST_HOST_NOT_FOUND = "IMPORT_DEST_HOST_NOT_FOUND";
    public static final java.lang.String _IMPORT_DEST_HOST_NOT_UNIQUE = "IMPORT_DEST_HOST_NOT_UNIQUE";
    public static final java.lang.String _IMPORT_DEST_RESOURCE_POOL_NOT_FOUND = "IMPORT_DEST_RESOURCE_POOL_NOT_FOUND";
    public static final java.lang.String _IMPORT_DEST_DATASTORE_NOT_FOUND = "IMPORT_DEST_DATASTORE_NOT_FOUND";
    public static final java.lang.String _IMPORT_DEST_FOLDER_NOT_FOUND = "IMPORT_DEST_FOLDER_NOT_FOUND";
    public static final java.lang.String _IMPORT_DEST_HOST_MAINTENANCE_MODE = "IMPORT_DEST_HOST_MAINTENANCE_MODE";
    public static final java.lang.String _IMPORT_DEST_HOST_NOT_CONNECTED = "IMPORT_DEST_HOST_NOT_CONNECTED";
    public static final java.lang.String _IMPORT_DEST_NO_FOREIGN_FORMAT_LINK = "IMPORT_DEST_NO_FOREIGN_FORMAT_LINK";
    public static final java.lang.String _IMPORT_DEST_VHD_DISK_AND_VOLUME_SELECTION = "IMPORT_DEST_VHD_DISK_AND_VOLUME_SELECTION";
    public static final java.lang.String _CUSTOMIZATION_SYSPREP_FILES_INCOMPATIBLE = "CUSTOMIZATION_SYSPREP_FILES_INCOMPATIBLE";
    public static final java.lang.String _IMPORT_DEST_DATASTORE_READONLY_FOR_HOST = "IMPORT_DEST_DATASTORE_READONLY_FOR_HOST";
    public static final java.lang.String _IMPORT_INCOMPATIBLE = "IMPORT_INCOMPATIBLE";
    public static final java.lang.String _TOTAL_COMPATIBILITY_ERROR_VALUES = "TOTAL_COMPATIBILITY_ERROR_VALUES";
    public static final ConverterAgentInternalCompatibilityError IMPORT_SLAVE_INCOMPATIBLE = new ConverterAgentInternalCompatibilityError(_IMPORT_SLAVE_INCOMPATIBLE);
    public static final ConverterAgentInternalCompatibilityError IMPORT_SOURCE_MANAGED_HOST_NOT_FOUND = new ConverterAgentInternalCompatibilityError(_IMPORT_SOURCE_MANAGED_HOST_NOT_FOUND);
    public static final ConverterAgentInternalCompatibilityError IMPORT_SOURCE_MANAGED_HOST_BAD_CREDENTIALS = new ConverterAgentInternalCompatibilityError(_IMPORT_SOURCE_MANAGED_HOST_BAD_CREDENTIALS);
    public static final ConverterAgentInternalCompatibilityError IMPORT_SOURCE_MANAGED_HOST_NO_PERMISSION = new ConverterAgentInternalCompatibilityError(_IMPORT_SOURCE_MANAGED_HOST_NO_PERMISSION);
    public static final ConverterAgentInternalCompatibilityError IMPORT_SOURCE_HOST_NOT_CONNECTED = new ConverterAgentInternalCompatibilityError(_IMPORT_SOURCE_HOST_NOT_CONNECTED);
    public static final ConverterAgentInternalCompatibilityError IMPORT_SOURCE_V2I_NO_IMPORT = new ConverterAgentInternalCompatibilityError(_IMPORT_SOURCE_V2I_NO_IMPORT);
    public static final ConverterAgentInternalCompatibilityError IMPORT_SOURCE_VPC_CONFIG_FILE_PARSE_ERROR = new ConverterAgentInternalCompatibilityError(_IMPORT_SOURCE_VPC_CONFIG_FILE_PARSE_ERROR);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_MANAGED_HOST_NOT_FOUND = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_MANAGED_HOST_NOT_FOUND);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_MANAGED_HOST_BAD_CREDENTIALS = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_MANAGED_HOST_BAD_CREDENTIALS);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_MANAGED_HOST_NO_PERMISSION = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_MANAGED_HOST_NO_PERMISSION);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_ALREADY_EXISTS = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_ALREADY_EXISTS);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_NO_PERMISSION = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_NO_PERMISSION);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_NOT_FOUND = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_NOT_FOUND);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_INCOMPATIBLE_DISK_TYPE = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_INCOMPATIBLE_DISK_TYPE);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_DOWN_HW_LEVEL_LINK = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_DOWN_HW_LEVEL_LINK);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_UP_HW_LEVEL_LINK = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_UP_HW_LEVEL_LINK);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_HOST_NOT_FOUND = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_HOST_NOT_FOUND);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_HOST_NOT_UNIQUE = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_HOST_NOT_UNIQUE);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_RESOURCE_POOL_NOT_FOUND = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_RESOURCE_POOL_NOT_FOUND);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_DATASTORE_NOT_FOUND = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_DATASTORE_NOT_FOUND);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_FOLDER_NOT_FOUND = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_FOLDER_NOT_FOUND);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_HOST_MAINTENANCE_MODE = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_HOST_MAINTENANCE_MODE);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_HOST_NOT_CONNECTED = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_HOST_NOT_CONNECTED);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_NO_FOREIGN_FORMAT_LINK = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_NO_FOREIGN_FORMAT_LINK);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_VHD_DISK_AND_VOLUME_SELECTION = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_VHD_DISK_AND_VOLUME_SELECTION);
    public static final ConverterAgentInternalCompatibilityError CUSTOMIZATION_SYSPREP_FILES_INCOMPATIBLE = new ConverterAgentInternalCompatibilityError(_CUSTOMIZATION_SYSPREP_FILES_INCOMPATIBLE);
    public static final ConverterAgentInternalCompatibilityError IMPORT_DEST_DATASTORE_READONLY_FOR_HOST = new ConverterAgentInternalCompatibilityError(_IMPORT_DEST_DATASTORE_READONLY_FOR_HOST);
    public static final ConverterAgentInternalCompatibilityError IMPORT_INCOMPATIBLE = new ConverterAgentInternalCompatibilityError(_IMPORT_INCOMPATIBLE);
    public static final ConverterAgentInternalCompatibilityError TOTAL_COMPATIBILITY_ERROR_VALUES = new ConverterAgentInternalCompatibilityError(_TOTAL_COMPATIBILITY_ERROR_VALUES);
    public java.lang.String getValue() { return _value_;}
    public static ConverterAgentInternalCompatibilityError fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConverterAgentInternalCompatibilityError enumeration = (ConverterAgentInternalCompatibilityError)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConverterAgentInternalCompatibilityError fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConverterAgentInternalCompatibilityError.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:converter", "ConverterAgentInternalCompatibilityError"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
