/**
 * FiscalizationService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soa.feri.si.Fiscalization;

public class FiscalizationService_ServiceLocator extends org.apache.axis.client.Service implements soa.feri.si.Fiscalization.FiscalizationService_Service {

    public FiscalizationService_ServiceLocator() {
    }


    public FiscalizationService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FiscalizationService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FiscalizationVerificationSOAP
    private java.lang.String FiscalizationVerificationSOAP_address = "http://si.feri.soa/Verification";

    public java.lang.String getFiscalizationVerificationSOAPAddress() {
        return FiscalizationVerificationSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FiscalizationVerificationSOAPWSDDServiceName = "FiscalizationVerificationSOAP";

    public java.lang.String getFiscalizationVerificationSOAPWSDDServiceName() {
        return FiscalizationVerificationSOAPWSDDServiceName;
    }

    public void setFiscalizationVerificationSOAPWSDDServiceName(java.lang.String name) {
        FiscalizationVerificationSOAPWSDDServiceName = name;
    }

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationVerificationSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FiscalizationVerificationSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFiscalizationVerificationSOAP(endpoint);
    }

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationVerificationSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub _stub = new soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub(portAddress, this);
            _stub.setPortName(getFiscalizationVerificationSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFiscalizationVerificationSOAPEndpointAddress(java.lang.String address) {
        FiscalizationVerificationSOAP_address = address;
    }


    // Use to get a proxy class for FiscalizationRegistrationSOAP
    private java.lang.String FiscalizationRegistrationSOAP_address = "http://si.feri.soa/Fiscalization";

    public java.lang.String getFiscalizationRegistrationSOAPAddress() {
        return FiscalizationRegistrationSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FiscalizationRegistrationSOAPWSDDServiceName = "FiscalizationRegistrationSOAP";

    public java.lang.String getFiscalizationRegistrationSOAPWSDDServiceName() {
        return FiscalizationRegistrationSOAPWSDDServiceName;
    }

    public void setFiscalizationRegistrationSOAPWSDDServiceName(java.lang.String name) {
        FiscalizationRegistrationSOAPWSDDServiceName = name;
    }

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationRegistrationSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FiscalizationRegistrationSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFiscalizationRegistrationSOAP(endpoint);
    }

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationRegistrationSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub _stub = new soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub(portAddress, this);
            _stub.setPortName(getFiscalizationRegistrationSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFiscalizationRegistrationSOAPEndpointAddress(java.lang.String address) {
        FiscalizationRegistrationSOAP_address = address;
    }


    // Use to get a proxy class for FiscalizationObtainInvoicesSOAP
    private java.lang.String FiscalizationObtainInvoicesSOAP_address = "http://si.feri.soa/ObtainInvoices";

    public java.lang.String getFiscalizationObtainInvoicesSOAPAddress() {
        return FiscalizationObtainInvoicesSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FiscalizationObtainInvoicesSOAPWSDDServiceName = "FiscalizationObtainInvoicesSOAP";

    public java.lang.String getFiscalizationObtainInvoicesSOAPWSDDServiceName() {
        return FiscalizationObtainInvoicesSOAPWSDDServiceName;
    }

    public void setFiscalizationObtainInvoicesSOAPWSDDServiceName(java.lang.String name) {
        FiscalizationObtainInvoicesSOAPWSDDServiceName = name;
    }

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationObtainInvoicesSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FiscalizationObtainInvoicesSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFiscalizationObtainInvoicesSOAP(endpoint);
    }

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationObtainInvoicesSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub _stub = new soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub(portAddress, this);
            _stub.setPortName(getFiscalizationObtainInvoicesSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFiscalizationObtainInvoicesSOAPEndpointAddress(java.lang.String address) {
        FiscalizationObtainInvoicesSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soa.feri.si.Fiscalization.FiscalizationService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub _stub = new soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub(new java.net.URL(FiscalizationVerificationSOAP_address), this);
                _stub.setPortName(getFiscalizationVerificationSOAPWSDDServiceName());
                return _stub;
            }
            if (soa.feri.si.Fiscalization.FiscalizationService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub _stub = new soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub(new java.net.URL(FiscalizationRegistrationSOAP_address), this);
                _stub.setPortName(getFiscalizationRegistrationSOAPWSDDServiceName());
                return _stub;
            }
            if (soa.feri.si.Fiscalization.FiscalizationService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub _stub = new soa.feri.si.Fiscalization.FiscalizationServiceSOAPStub(new java.net.URL(FiscalizationObtainInvoicesSOAP_address), this);
                _stub.setPortName(getFiscalizationObtainInvoicesSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FiscalizationVerificationSOAP".equals(inputPortName)) {
            return getFiscalizationVerificationSOAP();
        }
        else if ("FiscalizationRegistrationSOAP".equals(inputPortName)) {
            return getFiscalizationRegistrationSOAP();
        }
        else if ("FiscalizationObtainInvoicesSOAP".equals(inputPortName)) {
            return getFiscalizationObtainInvoicesSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "FiscalizationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "FiscalizationVerificationSOAP"));
            ports.add(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "FiscalizationRegistrationSOAP"));
            ports.add(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "FiscalizationObtainInvoicesSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FiscalizationVerificationSOAP".equals(portName)) {
            setFiscalizationVerificationSOAPEndpointAddress(address);
        }
        else 
if ("FiscalizationRegistrationSOAP".equals(portName)) {
            setFiscalizationRegistrationSOAPEndpointAddress(address);
        }
        else 
if ("FiscalizationObtainInvoicesSOAP".equals(portName)) {
            setFiscalizationObtainInvoicesSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
