/**
 * VirtualUSB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class VirtualUSB  extends com.vmware.converter.VirtualDevice  implements java.io.Serializable {
    private boolean connected;

    private java.lang.Integer vendor;

    private java.lang.Integer product;

    private java.lang.String[] family;

    private java.lang.String[] speed;

    public VirtualUSB() {
    }

    public VirtualUSB(
           int key,
           com.vmware.converter.Description deviceInfo,
           com.vmware.converter.VirtualDeviceBackingInfo backing,
           com.vmware.converter.VirtualDeviceConnectInfo connectable,
           com.vmware.converter.VirtualDeviceBusSlotInfo slotInfo,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           boolean connected,
           java.lang.Integer vendor,
           java.lang.Integer product,
           java.lang.String[] family,
           java.lang.String[] speed) {
        super(
            key,
            deviceInfo,
            backing,
            connectable,
            slotInfo,
            controllerKey,
            unitNumber);
        this.connected = connected;
        this.vendor = vendor;
        this.product = product;
        this.family = family;
        this.speed = speed;
    }


    /**
     * Gets the connected value for this VirtualUSB.
     * 
     * @return connected
     */
    public boolean isConnected() {
        return connected;
    }


    /**
     * Sets the connected value for this VirtualUSB.
     * 
     * @param connected
     */
    public void setConnected(boolean connected) {
        this.connected = connected;
    }


    /**
     * Gets the vendor value for this VirtualUSB.
     * 
     * @return vendor
     */
    public java.lang.Integer getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this VirtualUSB.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.Integer vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the product value for this VirtualUSB.
     * 
     * @return product
     */
    public java.lang.Integer getProduct() {
        return product;
    }


    /**
     * Sets the product value for this VirtualUSB.
     * 
     * @param product
     */
    public void setProduct(java.lang.Integer product) {
        this.product = product;
    }


    /**
     * Gets the family value for this VirtualUSB.
     * 
     * @return family
     */
    public java.lang.String[] getFamily() {
        return family;
    }


    /**
     * Sets the family value for this VirtualUSB.
     * 
     * @param family
     */
    public void setFamily(java.lang.String[] family) {
        this.family = family;
    }

    public java.lang.String getFamily(int i) {
        return this.family[i];
    }

    public void setFamily(int i, java.lang.String _value) {
        this.family[i] = _value;
    }


    /**
     * Gets the speed value for this VirtualUSB.
     * 
     * @return speed
     */
    public java.lang.String[] getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this VirtualUSB.
     * 
     * @param speed
     */
    public void setSpeed(java.lang.String[] speed) {
        this.speed = speed;
    }

    public java.lang.String getSpeed(int i) {
        return this.speed[i];
    }

    public void setSpeed(int i, java.lang.String _value) {
        this.speed[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualUSB)) return false;
        VirtualUSB other = (VirtualUSB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.connected == other.isConnected() &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              java.util.Arrays.equals(this.family, other.getFamily()))) &&
            ((this.speed==null && other.getSpeed()==null) || 
             (this.speed!=null &&
              java.util.Arrays.equals(this.speed, other.getSpeed())));
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
        _hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getFamily() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFamily());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFamily(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpeed(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualUSB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualUSB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "speed"));
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
