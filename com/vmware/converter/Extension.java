/**
 * Extension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.converter;

public class Extension  extends com.vmware.converter.DynamicData  implements java.io.Serializable {
    private com.vmware.converter.Description description;

    private java.lang.String key;

    private java.lang.String company;

    private java.lang.String type;

    private java.lang.String version;

    private java.lang.String subjectName;

    private com.vmware.converter.ExtensionServerInfo[] server;

    private com.vmware.converter.ExtensionClientInfo[] client;

    private com.vmware.converter.ExtensionTaskTypeInfo[] taskList;

    private com.vmware.converter.ExtensionEventTypeInfo[] eventList;

    private com.vmware.converter.ExtensionFaultTypeInfo[] faultList;

    private com.vmware.converter.ExtensionPrivilegeInfo[] privilegeList;

    private com.vmware.converter.ExtensionResourceInfo[] resourceList;

    private java.util.Calendar lastHeartbeatTime;

    private com.vmware.converter.ExtensionHealthInfo healthInfo;

    private com.vmware.converter.ExtensionOvfConsumerInfo ovfConsumerInfo;

    private com.vmware.converter.ExtExtendedProductInfo extendedProductInfo;

    private com.vmware.converter.ExtManagedEntityInfo[] managedEntityInfo;

    private java.lang.Boolean shownInSolutionManager;

    private com.vmware.converter.ExtSolutionManagerInfo solutionManagerInfo;

    public Extension() {
    }

    public Extension(
           com.vmware.converter.Description description,
           java.lang.String key,
           java.lang.String company,
           java.lang.String type,
           java.lang.String version,
           java.lang.String subjectName,
           com.vmware.converter.ExtensionServerInfo[] server,
           com.vmware.converter.ExtensionClientInfo[] client,
           com.vmware.converter.ExtensionTaskTypeInfo[] taskList,
           com.vmware.converter.ExtensionEventTypeInfo[] eventList,
           com.vmware.converter.ExtensionFaultTypeInfo[] faultList,
           com.vmware.converter.ExtensionPrivilegeInfo[] privilegeList,
           com.vmware.converter.ExtensionResourceInfo[] resourceList,
           java.util.Calendar lastHeartbeatTime,
           com.vmware.converter.ExtensionHealthInfo healthInfo,
           com.vmware.converter.ExtensionOvfConsumerInfo ovfConsumerInfo,
           com.vmware.converter.ExtExtendedProductInfo extendedProductInfo,
           com.vmware.converter.ExtManagedEntityInfo[] managedEntityInfo,
           java.lang.Boolean shownInSolutionManager,
           com.vmware.converter.ExtSolutionManagerInfo solutionManagerInfo) {
        this.description = description;
        this.key = key;
        this.company = company;
        this.type = type;
        this.version = version;
        this.subjectName = subjectName;
        this.server = server;
        this.client = client;
        this.taskList = taskList;
        this.eventList = eventList;
        this.faultList = faultList;
        this.privilegeList = privilegeList;
        this.resourceList = resourceList;
        this.lastHeartbeatTime = lastHeartbeatTime;
        this.healthInfo = healthInfo;
        this.ovfConsumerInfo = ovfConsumerInfo;
        this.extendedProductInfo = extendedProductInfo;
        this.managedEntityInfo = managedEntityInfo;
        this.shownInSolutionManager = shownInSolutionManager;
        this.solutionManagerInfo = solutionManagerInfo;
    }


    /**
     * Gets the description value for this Extension.
     * 
     * @return description
     */
    public com.vmware.converter.Description getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Extension.
     * 
     * @param description
     */
    public void setDescription(com.vmware.converter.Description description) {
        this.description = description;
    }


    /**
     * Gets the key value for this Extension.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this Extension.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the company value for this Extension.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this Extension.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the type value for this Extension.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Extension.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the version value for this Extension.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Extension.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the subjectName value for this Extension.
     * 
     * @return subjectName
     */
    public java.lang.String getSubjectName() {
        return subjectName;
    }


    /**
     * Sets the subjectName value for this Extension.
     * 
     * @param subjectName
     */
    public void setSubjectName(java.lang.String subjectName) {
        this.subjectName = subjectName;
    }


    /**
     * Gets the server value for this Extension.
     * 
     * @return server
     */
    public com.vmware.converter.ExtensionServerInfo[] getServer() {
        return server;
    }


    /**
     * Sets the server value for this Extension.
     * 
     * @param server
     */
    public void setServer(com.vmware.converter.ExtensionServerInfo[] server) {
        this.server = server;
    }

    public com.vmware.converter.ExtensionServerInfo getServer(int i) {
        return this.server[i];
    }

    public void setServer(int i, com.vmware.converter.ExtensionServerInfo _value) {
        this.server[i] = _value;
    }


    /**
     * Gets the client value for this Extension.
     * 
     * @return client
     */
    public com.vmware.converter.ExtensionClientInfo[] getClient() {
        return client;
    }


    /**
     * Sets the client value for this Extension.
     * 
     * @param client
     */
    public void setClient(com.vmware.converter.ExtensionClientInfo[] client) {
        this.client = client;
    }

    public com.vmware.converter.ExtensionClientInfo getClient(int i) {
        return this.client[i];
    }

    public void setClient(int i, com.vmware.converter.ExtensionClientInfo _value) {
        this.client[i] = _value;
    }


    /**
     * Gets the taskList value for this Extension.
     * 
     * @return taskList
     */
    public com.vmware.converter.ExtensionTaskTypeInfo[] getTaskList() {
        return taskList;
    }


    /**
     * Sets the taskList value for this Extension.
     * 
     * @param taskList
     */
    public void setTaskList(com.vmware.converter.ExtensionTaskTypeInfo[] taskList) {
        this.taskList = taskList;
    }

    public com.vmware.converter.ExtensionTaskTypeInfo getTaskList(int i) {
        return this.taskList[i];
    }

    public void setTaskList(int i, com.vmware.converter.ExtensionTaskTypeInfo _value) {
        this.taskList[i] = _value;
    }


    /**
     * Gets the eventList value for this Extension.
     * 
     * @return eventList
     */
    public com.vmware.converter.ExtensionEventTypeInfo[] getEventList() {
        return eventList;
    }


    /**
     * Sets the eventList value for this Extension.
     * 
     * @param eventList
     */
    public void setEventList(com.vmware.converter.ExtensionEventTypeInfo[] eventList) {
        this.eventList = eventList;
    }

    public com.vmware.converter.ExtensionEventTypeInfo getEventList(int i) {
        return this.eventList[i];
    }

    public void setEventList(int i, com.vmware.converter.ExtensionEventTypeInfo _value) {
        this.eventList[i] = _value;
    }


    /**
     * Gets the faultList value for this Extension.
     * 
     * @return faultList
     */
    public com.vmware.converter.ExtensionFaultTypeInfo[] getFaultList() {
        return faultList;
    }


    /**
     * Sets the faultList value for this Extension.
     * 
     * @param faultList
     */
    public void setFaultList(com.vmware.converter.ExtensionFaultTypeInfo[] faultList) {
        this.faultList = faultList;
    }

    public com.vmware.converter.ExtensionFaultTypeInfo getFaultList(int i) {
        return this.faultList[i];
    }

    public void setFaultList(int i, com.vmware.converter.ExtensionFaultTypeInfo _value) {
        this.faultList[i] = _value;
    }


    /**
     * Gets the privilegeList value for this Extension.
     * 
     * @return privilegeList
     */
    public com.vmware.converter.ExtensionPrivilegeInfo[] getPrivilegeList() {
        return privilegeList;
    }


    /**
     * Sets the privilegeList value for this Extension.
     * 
     * @param privilegeList
     */
    public void setPrivilegeList(com.vmware.converter.ExtensionPrivilegeInfo[] privilegeList) {
        this.privilegeList = privilegeList;
    }

    public com.vmware.converter.ExtensionPrivilegeInfo getPrivilegeList(int i) {
        return this.privilegeList[i];
    }

    public void setPrivilegeList(int i, com.vmware.converter.ExtensionPrivilegeInfo _value) {
        this.privilegeList[i] = _value;
    }


    /**
     * Gets the resourceList value for this Extension.
     * 
     * @return resourceList
     */
    public com.vmware.converter.ExtensionResourceInfo[] getResourceList() {
        return resourceList;
    }


    /**
     * Sets the resourceList value for this Extension.
     * 
     * @param resourceList
     */
    public void setResourceList(com.vmware.converter.ExtensionResourceInfo[] resourceList) {
        this.resourceList = resourceList;
    }

    public com.vmware.converter.ExtensionResourceInfo getResourceList(int i) {
        return this.resourceList[i];
    }

    public void setResourceList(int i, com.vmware.converter.ExtensionResourceInfo _value) {
        this.resourceList[i] = _value;
    }


    /**
     * Gets the lastHeartbeatTime value for this Extension.
     * 
     * @return lastHeartbeatTime
     */
    public java.util.Calendar getLastHeartbeatTime() {
        return lastHeartbeatTime;
    }


    /**
     * Sets the lastHeartbeatTime value for this Extension.
     * 
     * @param lastHeartbeatTime
     */
    public void setLastHeartbeatTime(java.util.Calendar lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
    }


    /**
     * Gets the healthInfo value for this Extension.
     * 
     * @return healthInfo
     */
    public com.vmware.converter.ExtensionHealthInfo getHealthInfo() {
        return healthInfo;
    }


    /**
     * Sets the healthInfo value for this Extension.
     * 
     * @param healthInfo
     */
    public void setHealthInfo(com.vmware.converter.ExtensionHealthInfo healthInfo) {
        this.healthInfo = healthInfo;
    }


    /**
     * Gets the ovfConsumerInfo value for this Extension.
     * 
     * @return ovfConsumerInfo
     */
    public com.vmware.converter.ExtensionOvfConsumerInfo getOvfConsumerInfo() {
        return ovfConsumerInfo;
    }


    /**
     * Sets the ovfConsumerInfo value for this Extension.
     * 
     * @param ovfConsumerInfo
     */
    public void setOvfConsumerInfo(com.vmware.converter.ExtensionOvfConsumerInfo ovfConsumerInfo) {
        this.ovfConsumerInfo = ovfConsumerInfo;
    }


    /**
     * Gets the extendedProductInfo value for this Extension.
     * 
     * @return extendedProductInfo
     */
    public com.vmware.converter.ExtExtendedProductInfo getExtendedProductInfo() {
        return extendedProductInfo;
    }


    /**
     * Sets the extendedProductInfo value for this Extension.
     * 
     * @param extendedProductInfo
     */
    public void setExtendedProductInfo(com.vmware.converter.ExtExtendedProductInfo extendedProductInfo) {
        this.extendedProductInfo = extendedProductInfo;
    }


    /**
     * Gets the managedEntityInfo value for this Extension.
     * 
     * @return managedEntityInfo
     */
    public com.vmware.converter.ExtManagedEntityInfo[] getManagedEntityInfo() {
        return managedEntityInfo;
    }


    /**
     * Sets the managedEntityInfo value for this Extension.
     * 
     * @param managedEntityInfo
     */
    public void setManagedEntityInfo(com.vmware.converter.ExtManagedEntityInfo[] managedEntityInfo) {
        this.managedEntityInfo = managedEntityInfo;
    }

    public com.vmware.converter.ExtManagedEntityInfo getManagedEntityInfo(int i) {
        return this.managedEntityInfo[i];
    }

    public void setManagedEntityInfo(int i, com.vmware.converter.ExtManagedEntityInfo _value) {
        this.managedEntityInfo[i] = _value;
    }


    /**
     * Gets the shownInSolutionManager value for this Extension.
     * 
     * @return shownInSolutionManager
     */
    public java.lang.Boolean getShownInSolutionManager() {
        return shownInSolutionManager;
    }


    /**
     * Sets the shownInSolutionManager value for this Extension.
     * 
     * @param shownInSolutionManager
     */
    public void setShownInSolutionManager(java.lang.Boolean shownInSolutionManager) {
        this.shownInSolutionManager = shownInSolutionManager;
    }


    /**
     * Gets the solutionManagerInfo value for this Extension.
     * 
     * @return solutionManagerInfo
     */
    public com.vmware.converter.ExtSolutionManagerInfo getSolutionManagerInfo() {
        return solutionManagerInfo;
    }


    /**
     * Sets the solutionManagerInfo value for this Extension.
     * 
     * @param solutionManagerInfo
     */
    public void setSolutionManagerInfo(com.vmware.converter.ExtSolutionManagerInfo solutionManagerInfo) {
        this.solutionManagerInfo = solutionManagerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Extension)) return false;
        Extension other = (Extension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.subjectName==null && other.getSubjectName()==null) || 
             (this.subjectName!=null &&
              this.subjectName.equals(other.getSubjectName()))) &&
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              java.util.Arrays.equals(this.server, other.getServer()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              java.util.Arrays.equals(this.client, other.getClient()))) &&
            ((this.taskList==null && other.getTaskList()==null) || 
             (this.taskList!=null &&
              java.util.Arrays.equals(this.taskList, other.getTaskList()))) &&
            ((this.eventList==null && other.getEventList()==null) || 
             (this.eventList!=null &&
              java.util.Arrays.equals(this.eventList, other.getEventList()))) &&
            ((this.faultList==null && other.getFaultList()==null) || 
             (this.faultList!=null &&
              java.util.Arrays.equals(this.faultList, other.getFaultList()))) &&
            ((this.privilegeList==null && other.getPrivilegeList()==null) || 
             (this.privilegeList!=null &&
              java.util.Arrays.equals(this.privilegeList, other.getPrivilegeList()))) &&
            ((this.resourceList==null && other.getResourceList()==null) || 
             (this.resourceList!=null &&
              java.util.Arrays.equals(this.resourceList, other.getResourceList()))) &&
            ((this.lastHeartbeatTime==null && other.getLastHeartbeatTime()==null) || 
             (this.lastHeartbeatTime!=null &&
              this.lastHeartbeatTime.equals(other.getLastHeartbeatTime()))) &&
            ((this.healthInfo==null && other.getHealthInfo()==null) || 
             (this.healthInfo!=null &&
              this.healthInfo.equals(other.getHealthInfo()))) &&
            ((this.ovfConsumerInfo==null && other.getOvfConsumerInfo()==null) || 
             (this.ovfConsumerInfo!=null &&
              this.ovfConsumerInfo.equals(other.getOvfConsumerInfo()))) &&
            ((this.extendedProductInfo==null && other.getExtendedProductInfo()==null) || 
             (this.extendedProductInfo!=null &&
              this.extendedProductInfo.equals(other.getExtendedProductInfo()))) &&
            ((this.managedEntityInfo==null && other.getManagedEntityInfo()==null) || 
             (this.managedEntityInfo!=null &&
              java.util.Arrays.equals(this.managedEntityInfo, other.getManagedEntityInfo()))) &&
            ((this.shownInSolutionManager==null && other.getShownInSolutionManager()==null) || 
             (this.shownInSolutionManager!=null &&
              this.shownInSolutionManager.equals(other.getShownInSolutionManager()))) &&
            ((this.solutionManagerInfo==null && other.getSolutionManagerInfo()==null) || 
             (this.solutionManagerInfo!=null &&
              this.solutionManagerInfo.equals(other.getSolutionManagerInfo())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getSubjectName() != null) {
            _hashCode += getSubjectName().hashCode();
        }
        if (getServer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClient(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaskList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaskList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaskList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrivilegeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrivilegeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrivilegeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastHeartbeatTime() != null) {
            _hashCode += getLastHeartbeatTime().hashCode();
        }
        if (getHealthInfo() != null) {
            _hashCode += getHealthInfo().hashCode();
        }
        if (getOvfConsumerInfo() != null) {
            _hashCode += getOvfConsumerInfo().hashCode();
        }
        if (getExtendedProductInfo() != null) {
            _hashCode += getExtendedProductInfo().hashCode();
        }
        if (getManagedEntityInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagedEntityInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagedEntityInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShownInSolutionManager() != null) {
            _hashCode += getShownInSolutionManager().hashCode();
        }
        if (getSolutionManagerInfo() != null) {
            _hashCode += getSolutionManagerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Extension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Extension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Description"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "subjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionServerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionClientInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "taskList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionTaskTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionEventTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionFaultTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "privilegeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionPrivilegeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionResourceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastHeartbeatTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastHeartbeatTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionHealthInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfConsumerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfConsumerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionOvfConsumerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extendedProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtExtendedProductInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedEntityInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "managedEntityInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtManagedEntityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shownInSolutionManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shownInSolutionManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutionManagerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "solutionManagerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtSolutionManagerInfo"));
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
