/**
 * GuestProgramSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestProgramSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String programPath;

    private java.lang.String arguments;

    private java.lang.String workingDirectory;

    private java.lang.String[] envVariables;

    public GuestProgramSpec() {
    }

    public GuestProgramSpec(
           java.lang.String programPath,
           java.lang.String arguments,
           java.lang.String workingDirectory,
           java.lang.String[] envVariables) {
        this.programPath = programPath;
        this.arguments = arguments;
        this.workingDirectory = workingDirectory;
        this.envVariables = envVariables;
    }


    /**
     * Gets the programPath value for this GuestProgramSpec.
     * 
     * @return programPath
     */
    public java.lang.String getProgramPath() {
        return programPath;
    }


    /**
     * Sets the programPath value for this GuestProgramSpec.
     * 
     * @param programPath
     */
    public void setProgramPath(java.lang.String programPath) {
        this.programPath = programPath;
    }


    /**
     * Gets the arguments value for this GuestProgramSpec.
     * 
     * @return arguments
     */
    public java.lang.String getArguments() {
        return arguments;
    }


    /**
     * Sets the arguments value for this GuestProgramSpec.
     * 
     * @param arguments
     */
    public void setArguments(java.lang.String arguments) {
        this.arguments = arguments;
    }


    /**
     * Gets the workingDirectory value for this GuestProgramSpec.
     * 
     * @return workingDirectory
     */
    public java.lang.String getWorkingDirectory() {
        return workingDirectory;
    }


    /**
     * Sets the workingDirectory value for this GuestProgramSpec.
     * 
     * @param workingDirectory
     */
    public void setWorkingDirectory(java.lang.String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }


    /**
     * Gets the envVariables value for this GuestProgramSpec.
     * 
     * @return envVariables
     */
    public java.lang.String[] getEnvVariables() {
        return envVariables;
    }


    /**
     * Sets the envVariables value for this GuestProgramSpec.
     * 
     * @param envVariables
     */
    public void setEnvVariables(java.lang.String[] envVariables) {
        this.envVariables = envVariables;
    }

    public java.lang.String getEnvVariables(int i) {
        return this.envVariables[i];
    }

    public void setEnvVariables(int i, java.lang.String _value) {
        this.envVariables[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestProgramSpec)) return false;
        GuestProgramSpec other = (GuestProgramSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.programPath==null && other.getProgramPath()==null) || 
             (this.programPath!=null &&
              this.programPath.equals(other.getProgramPath()))) &&
            ((this.arguments==null && other.getArguments()==null) || 
             (this.arguments!=null &&
              this.arguments.equals(other.getArguments()))) &&
            ((this.workingDirectory==null && other.getWorkingDirectory()==null) || 
             (this.workingDirectory!=null &&
              this.workingDirectory.equals(other.getWorkingDirectory()))) &&
            ((this.envVariables==null && other.getEnvVariables()==null) || 
             (this.envVariables!=null &&
              java.util.Arrays.equals(this.envVariables, other.getEnvVariables())));
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
        if (getProgramPath() != null) {
            _hashCode += getProgramPath().hashCode();
        }
        if (getArguments() != null) {
            _hashCode += getArguments().hashCode();
        }
        if (getWorkingDirectory() != null) {
            _hashCode += getWorkingDirectory().hashCode();
        }
        if (getEnvVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvVariables(), i);
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
        new org.apache.axis.description.TypeDesc(GuestProgramSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestProgramSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "programPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arguments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "arguments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workingDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "workingDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "envVariables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
