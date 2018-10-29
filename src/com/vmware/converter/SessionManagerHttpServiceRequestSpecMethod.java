/**
 * SessionManagerHttpServiceRequestSpecMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class SessionManagerHttpServiceRequestSpecMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SessionManagerHttpServiceRequestSpecMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _httpOptions = "httpOptions";
    public static final java.lang.String _httpGet = "httpGet";
    public static final java.lang.String _httpHead = "httpHead";
    public static final java.lang.String _httpPost = "httpPost";
    public static final java.lang.String _httpPut = "httpPut";
    public static final java.lang.String _httpDelete = "httpDelete";
    public static final java.lang.String _httpTrace = "httpTrace";
    public static final java.lang.String _httpConnect = "httpConnect";
    public static final SessionManagerHttpServiceRequestSpecMethod httpOptions = new SessionManagerHttpServiceRequestSpecMethod(_httpOptions);
    public static final SessionManagerHttpServiceRequestSpecMethod httpGet = new SessionManagerHttpServiceRequestSpecMethod(_httpGet);
    public static final SessionManagerHttpServiceRequestSpecMethod httpHead = new SessionManagerHttpServiceRequestSpecMethod(_httpHead);
    public static final SessionManagerHttpServiceRequestSpecMethod httpPost = new SessionManagerHttpServiceRequestSpecMethod(_httpPost);
    public static final SessionManagerHttpServiceRequestSpecMethod httpPut = new SessionManagerHttpServiceRequestSpecMethod(_httpPut);
    public static final SessionManagerHttpServiceRequestSpecMethod httpDelete = new SessionManagerHttpServiceRequestSpecMethod(_httpDelete);
    public static final SessionManagerHttpServiceRequestSpecMethod httpTrace = new SessionManagerHttpServiceRequestSpecMethod(_httpTrace);
    public static final SessionManagerHttpServiceRequestSpecMethod httpConnect = new SessionManagerHttpServiceRequestSpecMethod(_httpConnect);
    public java.lang.String getValue() { return _value_;}
    public static SessionManagerHttpServiceRequestSpecMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SessionManagerHttpServiceRequestSpecMethod enumeration = (SessionManagerHttpServiceRequestSpecMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SessionManagerHttpServiceRequestSpecMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SessionManagerHttpServiceRequestSpecMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SessionManagerHttpServiceRequestSpecMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
