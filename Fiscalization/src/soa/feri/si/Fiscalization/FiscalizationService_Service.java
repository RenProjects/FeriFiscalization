/**
 * FiscalizationService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soa.feri.si.Fiscalization;

public interface FiscalizationService_Service extends javax.xml.rpc.Service {
    public java.lang.String getFiscalizationVerificationSOAPAddress();

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationVerificationSOAP() throws javax.xml.rpc.ServiceException;

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationVerificationSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getFiscalizationRegistrationSOAPAddress();

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationRegistrationSOAP() throws javax.xml.rpc.ServiceException;

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationRegistrationSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getFiscalizationObtainInvoicesSOAPAddress();

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationObtainInvoicesSOAP() throws javax.xml.rpc.ServiceException;

    public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationObtainInvoicesSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
