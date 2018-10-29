/**
 * PlacementResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PlacementResult  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.ClusterRecommendation[] recommendations;

    private com.vmware.converter.ClusterDrsFaults drsFault;

    public PlacementResult() {
    }

    public PlacementResult(
           com.vmware.converter.ClusterRecommendation[] recommendations,
           com.vmware.converter.ClusterDrsFaults drsFault) {
        this.recommendations = recommendations;
        this.drsFault = drsFault;
    }


    /**
     * Gets the recommendations value for this PlacementResult.
     * 
     * @return recommendations
     */
    public com.vmware.converter.ClusterRecommendation[] getRecommendations() {
        return recommendations;
    }


    /**
     * Sets the recommendations value for this PlacementResult.
     * 
     * @param recommendations
     */
    public void setRecommendations(com.vmware.converter.ClusterRecommendation[] recommendations) {
        this.recommendations = recommendations;
    }

    public com.vmware.converter.ClusterRecommendation getRecommendations(int i) {
        return this.recommendations[i];
    }

    public void setRecommendations(int i, com.vmware.converter.ClusterRecommendation _value) {
        this.recommendations[i] = _value;
    }


    /**
     * Gets the drsFault value for this PlacementResult.
     * 
     * @return drsFault
     */
    public com.vmware.converter.ClusterDrsFaults getDrsFault() {
        return drsFault;
    }


    /**
     * Sets the drsFault value for this PlacementResult.
     * 
     * @param drsFault
     */
    public void setDrsFault(com.vmware.converter.ClusterDrsFaults drsFault) {
        this.drsFault = drsFault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementResult)) return false;
        PlacementResult other = (PlacementResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recommendations==null && other.getRecommendations()==null) || 
             (this.recommendations!=null &&
              java.util.Arrays.equals(this.recommendations, other.getRecommendations()))) &&
            ((this.drsFault==null && other.getDrsFault()==null) || 
             (this.drsFault!=null &&
              this.drsFault.equals(other.getDrsFault())));
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
        if (getRecommendations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecommendations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecommendations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrsFault() != null) {
            _hashCode += getDrsFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRecommendation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drsFault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "drsFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsFaults"));
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
