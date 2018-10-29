/**
 * PlacementRankSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class PlacementRankSpec  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.PlacementSpec[] specs;

    private com.vmware.converter.ManagedObjectReference[] clusters;

    private com.vmware.converter.PlacementAffinityRule[] rules;

    private com.vmware.converter.StorageDrsPlacementRankVmSpec[] placementRankByVm;

    public PlacementRankSpec() {
    }

    public PlacementRankSpec(
           com.vmware.converter.PlacementSpec[] specs,
           com.vmware.converter.ManagedObjectReference[] clusters,
           com.vmware.converter.PlacementAffinityRule[] rules,
           com.vmware.converter.StorageDrsPlacementRankVmSpec[] placementRankByVm) {
        this.specs = specs;
        this.clusters = clusters;
        this.rules = rules;
        this.placementRankByVm = placementRankByVm;
    }


    /**
     * Gets the specs value for this PlacementRankSpec.
     * 
     * @return specs
     */
    public com.vmware.converter.PlacementSpec[] getSpecs() {
        return specs;
    }


    /**
     * Sets the specs value for this PlacementRankSpec.
     * 
     * @param specs
     */
    public void setSpecs(com.vmware.converter.PlacementSpec[] specs) {
        this.specs = specs;
    }

    public com.vmware.converter.PlacementSpec getSpecs(int i) {
        return this.specs[i];
    }

    public void setSpecs(int i, com.vmware.converter.PlacementSpec _value) {
        this.specs[i] = _value;
    }


    /**
     * Gets the clusters value for this PlacementRankSpec.
     * 
     * @return clusters
     */
    public com.vmware.converter.ManagedObjectReference[] getClusters() {
        return clusters;
    }


    /**
     * Sets the clusters value for this PlacementRankSpec.
     * 
     * @param clusters
     */
    public void setClusters(com.vmware.converter.ManagedObjectReference[] clusters) {
        this.clusters = clusters;
    }

    public com.vmware.converter.ManagedObjectReference getClusters(int i) {
        return this.clusters[i];
    }

    public void setClusters(int i, com.vmware.converter.ManagedObjectReference _value) {
        this.clusters[i] = _value;
    }


    /**
     * Gets the rules value for this PlacementRankSpec.
     * 
     * @return rules
     */
    public com.vmware.converter.PlacementAffinityRule[] getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this PlacementRankSpec.
     * 
     * @param rules
     */
    public void setRules(com.vmware.converter.PlacementAffinityRule[] rules) {
        this.rules = rules;
    }

    public com.vmware.converter.PlacementAffinityRule getRules(int i) {
        return this.rules[i];
    }

    public void setRules(int i, com.vmware.converter.PlacementAffinityRule _value) {
        this.rules[i] = _value;
    }


    /**
     * Gets the placementRankByVm value for this PlacementRankSpec.
     * 
     * @return placementRankByVm
     */
    public com.vmware.converter.StorageDrsPlacementRankVmSpec[] getPlacementRankByVm() {
        return placementRankByVm;
    }


    /**
     * Sets the placementRankByVm value for this PlacementRankSpec.
     * 
     * @param placementRankByVm
     */
    public void setPlacementRankByVm(com.vmware.converter.StorageDrsPlacementRankVmSpec[] placementRankByVm) {
        this.placementRankByVm = placementRankByVm;
    }

    public com.vmware.converter.StorageDrsPlacementRankVmSpec getPlacementRankByVm(int i) {
        return this.placementRankByVm[i];
    }

    public void setPlacementRankByVm(int i, com.vmware.converter.StorageDrsPlacementRankVmSpec _value) {
        this.placementRankByVm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementRankSpec)) return false;
        PlacementRankSpec other = (PlacementRankSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.specs==null && other.getSpecs()==null) || 
             (this.specs!=null &&
              java.util.Arrays.equals(this.specs, other.getSpecs()))) &&
            ((this.clusters==null && other.getClusters()==null) || 
             (this.clusters!=null &&
              java.util.Arrays.equals(this.clusters, other.getClusters()))) &&
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              java.util.Arrays.equals(this.rules, other.getRules()))) &&
            ((this.placementRankByVm==null && other.getPlacementRankByVm()==null) || 
             (this.placementRankByVm!=null &&
              java.util.Arrays.equals(this.placementRankByVm, other.getPlacementRankByVm())));
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
        if (getSpecs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlacementRankByVm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementRankByVm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementRankByVm(), i);
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
        new org.apache.axis.description.TypeDesc(PlacementRankSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementRankSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "specs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementSpec"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rules");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PlacementAffinityRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementRankByVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "placementRankByVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageDrsPlacementRankVmSpec"));
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
