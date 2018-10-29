/**
 * HostInternetScsiHbaIPCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class HostInternetScsiHbaIPCapabilities  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private boolean addressSettable;

    private boolean ipConfigurationMethodSettable;

    private boolean subnetMaskSettable;

    private boolean defaultGatewaySettable;

    private boolean primaryDnsServerAddressSettable;

    private boolean alternateDnsServerAddressSettable;

    private java.lang.Boolean ipv6Supported;

    private java.lang.Boolean arpRedirectSettable;

    private java.lang.Boolean mtuSettable;

    private java.lang.Boolean hostNameAsTargetAddress;

    private java.lang.Boolean nameAliasSettable;

    private java.lang.Boolean ipv4EnableSettable;

    private java.lang.Boolean ipv6EnableSettable;

    private java.lang.Boolean ipv6PrefixLengthSettable;

    private java.lang.Integer ipv6PrefixLength;

    private java.lang.Boolean ipv6DhcpConfigurationSettable;

    private java.lang.Boolean ipv6LinkLocalAutoConfigurationSettable;

    private java.lang.Boolean ipv6RouterAdvertisementConfigurationSettable;

    private java.lang.Boolean ipv6DefaultGatewaySettable;

    private java.lang.Integer ipv6MaxStaticAddressesSupported;

    public HostInternetScsiHbaIPCapabilities() {
    }

    public HostInternetScsiHbaIPCapabilities(
           boolean addressSettable,
           boolean ipConfigurationMethodSettable,
           boolean subnetMaskSettable,
           boolean defaultGatewaySettable,
           boolean primaryDnsServerAddressSettable,
           boolean alternateDnsServerAddressSettable,
           java.lang.Boolean ipv6Supported,
           java.lang.Boolean arpRedirectSettable,
           java.lang.Boolean mtuSettable,
           java.lang.Boolean hostNameAsTargetAddress,
           java.lang.Boolean nameAliasSettable,
           java.lang.Boolean ipv4EnableSettable,
           java.lang.Boolean ipv6EnableSettable,
           java.lang.Boolean ipv6PrefixLengthSettable,
           java.lang.Integer ipv6PrefixLength,
           java.lang.Boolean ipv6DhcpConfigurationSettable,
           java.lang.Boolean ipv6LinkLocalAutoConfigurationSettable,
           java.lang.Boolean ipv6RouterAdvertisementConfigurationSettable,
           java.lang.Boolean ipv6DefaultGatewaySettable,
           java.lang.Integer ipv6MaxStaticAddressesSupported) {
        this.addressSettable = addressSettable;
        this.ipConfigurationMethodSettable = ipConfigurationMethodSettable;
        this.subnetMaskSettable = subnetMaskSettable;
        this.defaultGatewaySettable = defaultGatewaySettable;
        this.primaryDnsServerAddressSettable = primaryDnsServerAddressSettable;
        this.alternateDnsServerAddressSettable = alternateDnsServerAddressSettable;
        this.ipv6Supported = ipv6Supported;
        this.arpRedirectSettable = arpRedirectSettable;
        this.mtuSettable = mtuSettable;
        this.hostNameAsTargetAddress = hostNameAsTargetAddress;
        this.nameAliasSettable = nameAliasSettable;
        this.ipv4EnableSettable = ipv4EnableSettable;
        this.ipv6EnableSettable = ipv6EnableSettable;
        this.ipv6PrefixLengthSettable = ipv6PrefixLengthSettable;
        this.ipv6PrefixLength = ipv6PrefixLength;
        this.ipv6DhcpConfigurationSettable = ipv6DhcpConfigurationSettable;
        this.ipv6LinkLocalAutoConfigurationSettable = ipv6LinkLocalAutoConfigurationSettable;
        this.ipv6RouterAdvertisementConfigurationSettable = ipv6RouterAdvertisementConfigurationSettable;
        this.ipv6DefaultGatewaySettable = ipv6DefaultGatewaySettable;
        this.ipv6MaxStaticAddressesSupported = ipv6MaxStaticAddressesSupported;
    }


    /**
     * Gets the addressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return addressSettable
     */
    public boolean isAddressSettable() {
        return addressSettable;
    }


    /**
     * Sets the addressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param addressSettable
     */
    public void setAddressSettable(boolean addressSettable) {
        this.addressSettable = addressSettable;
    }


    /**
     * Gets the ipConfigurationMethodSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipConfigurationMethodSettable
     */
    public boolean isIpConfigurationMethodSettable() {
        return ipConfigurationMethodSettable;
    }


    /**
     * Sets the ipConfigurationMethodSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipConfigurationMethodSettable
     */
    public void setIpConfigurationMethodSettable(boolean ipConfigurationMethodSettable) {
        this.ipConfigurationMethodSettable = ipConfigurationMethodSettable;
    }


    /**
     * Gets the subnetMaskSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return subnetMaskSettable
     */
    public boolean isSubnetMaskSettable() {
        return subnetMaskSettable;
    }


    /**
     * Sets the subnetMaskSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param subnetMaskSettable
     */
    public void setSubnetMaskSettable(boolean subnetMaskSettable) {
        this.subnetMaskSettable = subnetMaskSettable;
    }


    /**
     * Gets the defaultGatewaySettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return defaultGatewaySettable
     */
    public boolean isDefaultGatewaySettable() {
        return defaultGatewaySettable;
    }


    /**
     * Sets the defaultGatewaySettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param defaultGatewaySettable
     */
    public void setDefaultGatewaySettable(boolean defaultGatewaySettable) {
        this.defaultGatewaySettable = defaultGatewaySettable;
    }


    /**
     * Gets the primaryDnsServerAddressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return primaryDnsServerAddressSettable
     */
    public boolean isPrimaryDnsServerAddressSettable() {
        return primaryDnsServerAddressSettable;
    }


    /**
     * Sets the primaryDnsServerAddressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param primaryDnsServerAddressSettable
     */
    public void setPrimaryDnsServerAddressSettable(boolean primaryDnsServerAddressSettable) {
        this.primaryDnsServerAddressSettable = primaryDnsServerAddressSettable;
    }


    /**
     * Gets the alternateDnsServerAddressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return alternateDnsServerAddressSettable
     */
    public boolean isAlternateDnsServerAddressSettable() {
        return alternateDnsServerAddressSettable;
    }


    /**
     * Sets the alternateDnsServerAddressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param alternateDnsServerAddressSettable
     */
    public void setAlternateDnsServerAddressSettable(boolean alternateDnsServerAddressSettable) {
        this.alternateDnsServerAddressSettable = alternateDnsServerAddressSettable;
    }


    /**
     * Gets the ipv6Supported value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6Supported
     */
    public java.lang.Boolean getIpv6Supported() {
        return ipv6Supported;
    }


    /**
     * Sets the ipv6Supported value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6Supported
     */
    public void setIpv6Supported(java.lang.Boolean ipv6Supported) {
        this.ipv6Supported = ipv6Supported;
    }


    /**
     * Gets the arpRedirectSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return arpRedirectSettable
     */
    public java.lang.Boolean getArpRedirectSettable() {
        return arpRedirectSettable;
    }


    /**
     * Sets the arpRedirectSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param arpRedirectSettable
     */
    public void setArpRedirectSettable(java.lang.Boolean arpRedirectSettable) {
        this.arpRedirectSettable = arpRedirectSettable;
    }


    /**
     * Gets the mtuSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return mtuSettable
     */
    public java.lang.Boolean getMtuSettable() {
        return mtuSettable;
    }


    /**
     * Sets the mtuSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param mtuSettable
     */
    public void setMtuSettable(java.lang.Boolean mtuSettable) {
        this.mtuSettable = mtuSettable;
    }


    /**
     * Gets the hostNameAsTargetAddress value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return hostNameAsTargetAddress
     */
    public java.lang.Boolean getHostNameAsTargetAddress() {
        return hostNameAsTargetAddress;
    }


    /**
     * Sets the hostNameAsTargetAddress value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param hostNameAsTargetAddress
     */
    public void setHostNameAsTargetAddress(java.lang.Boolean hostNameAsTargetAddress) {
        this.hostNameAsTargetAddress = hostNameAsTargetAddress;
    }


    /**
     * Gets the nameAliasSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return nameAliasSettable
     */
    public java.lang.Boolean getNameAliasSettable() {
        return nameAliasSettable;
    }


    /**
     * Sets the nameAliasSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param nameAliasSettable
     */
    public void setNameAliasSettable(java.lang.Boolean nameAliasSettable) {
        this.nameAliasSettable = nameAliasSettable;
    }


    /**
     * Gets the ipv4EnableSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv4EnableSettable
     */
    public java.lang.Boolean getIpv4EnableSettable() {
        return ipv4EnableSettable;
    }


    /**
     * Sets the ipv4EnableSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv4EnableSettable
     */
    public void setIpv4EnableSettable(java.lang.Boolean ipv4EnableSettable) {
        this.ipv4EnableSettable = ipv4EnableSettable;
    }


    /**
     * Gets the ipv6EnableSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6EnableSettable
     */
    public java.lang.Boolean getIpv6EnableSettable() {
        return ipv6EnableSettable;
    }


    /**
     * Sets the ipv6EnableSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6EnableSettable
     */
    public void setIpv6EnableSettable(java.lang.Boolean ipv6EnableSettable) {
        this.ipv6EnableSettable = ipv6EnableSettable;
    }


    /**
     * Gets the ipv6PrefixLengthSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6PrefixLengthSettable
     */
    public java.lang.Boolean getIpv6PrefixLengthSettable() {
        return ipv6PrefixLengthSettable;
    }


    /**
     * Sets the ipv6PrefixLengthSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6PrefixLengthSettable
     */
    public void setIpv6PrefixLengthSettable(java.lang.Boolean ipv6PrefixLengthSettable) {
        this.ipv6PrefixLengthSettable = ipv6PrefixLengthSettable;
    }


    /**
     * Gets the ipv6PrefixLength value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6PrefixLength
     */
    public java.lang.Integer getIpv6PrefixLength() {
        return ipv6PrefixLength;
    }


    /**
     * Sets the ipv6PrefixLength value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6PrefixLength
     */
    public void setIpv6PrefixLength(java.lang.Integer ipv6PrefixLength) {
        this.ipv6PrefixLength = ipv6PrefixLength;
    }


    /**
     * Gets the ipv6DhcpConfigurationSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6DhcpConfigurationSettable
     */
    public java.lang.Boolean getIpv6DhcpConfigurationSettable() {
        return ipv6DhcpConfigurationSettable;
    }


    /**
     * Sets the ipv6DhcpConfigurationSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6DhcpConfigurationSettable
     */
    public void setIpv6DhcpConfigurationSettable(java.lang.Boolean ipv6DhcpConfigurationSettable) {
        this.ipv6DhcpConfigurationSettable = ipv6DhcpConfigurationSettable;
    }


    /**
     * Gets the ipv6LinkLocalAutoConfigurationSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6LinkLocalAutoConfigurationSettable
     */
    public java.lang.Boolean getIpv6LinkLocalAutoConfigurationSettable() {
        return ipv6LinkLocalAutoConfigurationSettable;
    }


    /**
     * Sets the ipv6LinkLocalAutoConfigurationSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6LinkLocalAutoConfigurationSettable
     */
    public void setIpv6LinkLocalAutoConfigurationSettable(java.lang.Boolean ipv6LinkLocalAutoConfigurationSettable) {
        this.ipv6LinkLocalAutoConfigurationSettable = ipv6LinkLocalAutoConfigurationSettable;
    }


    /**
     * Gets the ipv6RouterAdvertisementConfigurationSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6RouterAdvertisementConfigurationSettable
     */
    public java.lang.Boolean getIpv6RouterAdvertisementConfigurationSettable() {
        return ipv6RouterAdvertisementConfigurationSettable;
    }


    /**
     * Sets the ipv6RouterAdvertisementConfigurationSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6RouterAdvertisementConfigurationSettable
     */
    public void setIpv6RouterAdvertisementConfigurationSettable(java.lang.Boolean ipv6RouterAdvertisementConfigurationSettable) {
        this.ipv6RouterAdvertisementConfigurationSettable = ipv6RouterAdvertisementConfigurationSettable;
    }


    /**
     * Gets the ipv6DefaultGatewaySettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6DefaultGatewaySettable
     */
    public java.lang.Boolean getIpv6DefaultGatewaySettable() {
        return ipv6DefaultGatewaySettable;
    }


    /**
     * Sets the ipv6DefaultGatewaySettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6DefaultGatewaySettable
     */
    public void setIpv6DefaultGatewaySettable(java.lang.Boolean ipv6DefaultGatewaySettable) {
        this.ipv6DefaultGatewaySettable = ipv6DefaultGatewaySettable;
    }


    /**
     * Gets the ipv6MaxStaticAddressesSupported value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6MaxStaticAddressesSupported
     */
    public java.lang.Integer getIpv6MaxStaticAddressesSupported() {
        return ipv6MaxStaticAddressesSupported;
    }


    /**
     * Sets the ipv6MaxStaticAddressesSupported value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6MaxStaticAddressesSupported
     */
    public void setIpv6MaxStaticAddressesSupported(java.lang.Integer ipv6MaxStaticAddressesSupported) {
        this.ipv6MaxStaticAddressesSupported = ipv6MaxStaticAddressesSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaIPCapabilities)) return false;
        HostInternetScsiHbaIPCapabilities other = (HostInternetScsiHbaIPCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.addressSettable == other.isAddressSettable() &&
            this.ipConfigurationMethodSettable == other.isIpConfigurationMethodSettable() &&
            this.subnetMaskSettable == other.isSubnetMaskSettable() &&
            this.defaultGatewaySettable == other.isDefaultGatewaySettable() &&
            this.primaryDnsServerAddressSettable == other.isPrimaryDnsServerAddressSettable() &&
            this.alternateDnsServerAddressSettable == other.isAlternateDnsServerAddressSettable() &&
            ((this.ipv6Supported==null && other.getIpv6Supported()==null) || 
             (this.ipv6Supported!=null &&
              this.ipv6Supported.equals(other.getIpv6Supported()))) &&
            ((this.arpRedirectSettable==null && other.getArpRedirectSettable()==null) || 
             (this.arpRedirectSettable!=null &&
              this.arpRedirectSettable.equals(other.getArpRedirectSettable()))) &&
            ((this.mtuSettable==null && other.getMtuSettable()==null) || 
             (this.mtuSettable!=null &&
              this.mtuSettable.equals(other.getMtuSettable()))) &&
            ((this.hostNameAsTargetAddress==null && other.getHostNameAsTargetAddress()==null) || 
             (this.hostNameAsTargetAddress!=null &&
              this.hostNameAsTargetAddress.equals(other.getHostNameAsTargetAddress()))) &&
            ((this.nameAliasSettable==null && other.getNameAliasSettable()==null) || 
             (this.nameAliasSettable!=null &&
              this.nameAliasSettable.equals(other.getNameAliasSettable()))) &&
            ((this.ipv4EnableSettable==null && other.getIpv4EnableSettable()==null) || 
             (this.ipv4EnableSettable!=null &&
              this.ipv4EnableSettable.equals(other.getIpv4EnableSettable()))) &&
            ((this.ipv6EnableSettable==null && other.getIpv6EnableSettable()==null) || 
             (this.ipv6EnableSettable!=null &&
              this.ipv6EnableSettable.equals(other.getIpv6EnableSettable()))) &&
            ((this.ipv6PrefixLengthSettable==null && other.getIpv6PrefixLengthSettable()==null) || 
             (this.ipv6PrefixLengthSettable!=null &&
              this.ipv6PrefixLengthSettable.equals(other.getIpv6PrefixLengthSettable()))) &&
            ((this.ipv6PrefixLength==null && other.getIpv6PrefixLength()==null) || 
             (this.ipv6PrefixLength!=null &&
              this.ipv6PrefixLength.equals(other.getIpv6PrefixLength()))) &&
            ((this.ipv6DhcpConfigurationSettable==null && other.getIpv6DhcpConfigurationSettable()==null) || 
             (this.ipv6DhcpConfigurationSettable!=null &&
              this.ipv6DhcpConfigurationSettable.equals(other.getIpv6DhcpConfigurationSettable()))) &&
            ((this.ipv6LinkLocalAutoConfigurationSettable==null && other.getIpv6LinkLocalAutoConfigurationSettable()==null) || 
             (this.ipv6LinkLocalAutoConfigurationSettable!=null &&
              this.ipv6LinkLocalAutoConfigurationSettable.equals(other.getIpv6LinkLocalAutoConfigurationSettable()))) &&
            ((this.ipv6RouterAdvertisementConfigurationSettable==null && other.getIpv6RouterAdvertisementConfigurationSettable()==null) || 
             (this.ipv6RouterAdvertisementConfigurationSettable!=null &&
              this.ipv6RouterAdvertisementConfigurationSettable.equals(other.getIpv6RouterAdvertisementConfigurationSettable()))) &&
            ((this.ipv6DefaultGatewaySettable==null && other.getIpv6DefaultGatewaySettable()==null) || 
             (this.ipv6DefaultGatewaySettable!=null &&
              this.ipv6DefaultGatewaySettable.equals(other.getIpv6DefaultGatewaySettable()))) &&
            ((this.ipv6MaxStaticAddressesSupported==null && other.getIpv6MaxStaticAddressesSupported()==null) || 
             (this.ipv6MaxStaticAddressesSupported!=null &&
              this.ipv6MaxStaticAddressesSupported.equals(other.getIpv6MaxStaticAddressesSupported())));
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
        _hashCode += (isAddressSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIpConfigurationMethodSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSubnetMaskSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDefaultGatewaySettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPrimaryDnsServerAddressSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAlternateDnsServerAddressSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpv6Supported() != null) {
            _hashCode += getIpv6Supported().hashCode();
        }
        if (getArpRedirectSettable() != null) {
            _hashCode += getArpRedirectSettable().hashCode();
        }
        if (getMtuSettable() != null) {
            _hashCode += getMtuSettable().hashCode();
        }
        if (getHostNameAsTargetAddress() != null) {
            _hashCode += getHostNameAsTargetAddress().hashCode();
        }
        if (getNameAliasSettable() != null) {
            _hashCode += getNameAliasSettable().hashCode();
        }
        if (getIpv4EnableSettable() != null) {
            _hashCode += getIpv4EnableSettable().hashCode();
        }
        if (getIpv6EnableSettable() != null) {
            _hashCode += getIpv6EnableSettable().hashCode();
        }
        if (getIpv6PrefixLengthSettable() != null) {
            _hashCode += getIpv6PrefixLengthSettable().hashCode();
        }
        if (getIpv6PrefixLength() != null) {
            _hashCode += getIpv6PrefixLength().hashCode();
        }
        if (getIpv6DhcpConfigurationSettable() != null) {
            _hashCode += getIpv6DhcpConfigurationSettable().hashCode();
        }
        if (getIpv6LinkLocalAutoConfigurationSettable() != null) {
            _hashCode += getIpv6LinkLocalAutoConfigurationSettable().hashCode();
        }
        if (getIpv6RouterAdvertisementConfigurationSettable() != null) {
            _hashCode += getIpv6RouterAdvertisementConfigurationSettable().hashCode();
        }
        if (getIpv6DefaultGatewaySettable() != null) {
            _hashCode += getIpv6DefaultGatewaySettable().hashCode();
        }
        if (getIpv6MaxStaticAddressesSupported() != null) {
            _hashCode += getIpv6MaxStaticAddressesSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaIPCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaIPCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "addressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipConfigurationMethodSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipConfigurationMethodSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetMaskSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "subnetMaskSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultGatewaySettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultGatewaySettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryDnsServerAddressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "primaryDnsServerAddressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDnsServerAddressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alternateDnsServerAddressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Supported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6Supported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arpRedirectSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "arpRedirectSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtuSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mtuSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNameAsTargetAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostNameAsTargetAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameAliasSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nameAliasSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv4EnableSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv4EnableSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6EnableSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6EnableSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6PrefixLengthSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6PrefixLengthSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6PrefixLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6PrefixLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6DhcpConfigurationSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6DhcpConfigurationSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6LinkLocalAutoConfigurationSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6LinkLocalAutoConfigurationSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6RouterAdvertisementConfigurationSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6RouterAdvertisementConfigurationSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6DefaultGatewaySettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6DefaultGatewaySettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6MaxStaticAddressesSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6MaxStaticAddressesSupported"));
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
