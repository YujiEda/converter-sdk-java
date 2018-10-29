/**
 * GuestProcessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class GuestProcessInfo  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private long pid;

    private java.lang.String owner;

    private java.lang.String cmdLine;

    private java.util.Calendar startTime;

    private java.util.Calendar endTime;

    private java.lang.Integer exitCode;

    public GuestProcessInfo() {
    }

    public GuestProcessInfo(
           java.lang.String name,
           long pid,
           java.lang.String owner,
           java.lang.String cmdLine,
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           java.lang.Integer exitCode) {
        this.name = name;
        this.pid = pid;
        this.owner = owner;
        this.cmdLine = cmdLine;
        this.startTime = startTime;
        this.endTime = endTime;
        this.exitCode = exitCode;
    }


    /**
     * Gets the name value for this GuestProcessInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GuestProcessInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the pid value for this GuestProcessInfo.
     * 
     * @return pid
     */
    public long getPid() {
        return pid;
    }


    /**
     * Sets the pid value for this GuestProcessInfo.
     * 
     * @param pid
     */
    public void setPid(long pid) {
        this.pid = pid;
    }


    /**
     * Gets the owner value for this GuestProcessInfo.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this GuestProcessInfo.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the cmdLine value for this GuestProcessInfo.
     * 
     * @return cmdLine
     */
    public java.lang.String getCmdLine() {
        return cmdLine;
    }


    /**
     * Sets the cmdLine value for this GuestProcessInfo.
     * 
     * @param cmdLine
     */
    public void setCmdLine(java.lang.String cmdLine) {
        this.cmdLine = cmdLine;
    }


    /**
     * Gets the startTime value for this GuestProcessInfo.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this GuestProcessInfo.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this GuestProcessInfo.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this GuestProcessInfo.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the exitCode value for this GuestProcessInfo.
     * 
     * @return exitCode
     */
    public java.lang.Integer getExitCode() {
        return exitCode;
    }


    /**
     * Sets the exitCode value for this GuestProcessInfo.
     * 
     * @param exitCode
     */
    public void setExitCode(java.lang.Integer exitCode) {
        this.exitCode = exitCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestProcessInfo)) return false;
        GuestProcessInfo other = (GuestProcessInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.pid == other.getPid() &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.cmdLine==null && other.getCmdLine()==null) || 
             (this.cmdLine!=null &&
              this.cmdLine.equals(other.getCmdLine()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.exitCode==null && other.getExitCode()==null) || 
             (this.exitCode!=null &&
              this.exitCode.equals(other.getExitCode())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getPid()).hashCode();
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getCmdLine() != null) {
            _hashCode += getCmdLine().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getExitCode() != null) {
            _hashCode += getExitCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestProcessInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestProcessInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cmdLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "exitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
