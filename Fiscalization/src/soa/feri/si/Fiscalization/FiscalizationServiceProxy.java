package soa.feri.si.Fiscalization;

public class FiscalizationServiceProxy implements soa.feri.si.Fiscalization.FiscalizationService_PortType {
  private String _endpoint = null;
  private soa.feri.si.Fiscalization.FiscalizationService_PortType fiscalizationService_PortType = null;
  
  public FiscalizationServiceProxy() {
    _initFiscalizationServiceProxy();
  }
  
  public FiscalizationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFiscalizationServiceProxy();
  }
  
  private void _initFiscalizationServiceProxy() {
    try {
      fiscalizationService_PortType = (new soa.feri.si.Fiscalization.FiscalizationService_ServiceLocator()).getFiscalizationVerificationSOAP();
      if (fiscalizationService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fiscalizationService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fiscalizationService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fiscalizationService_PortType != null)
      ((javax.xml.rpc.Stub)fiscalizationService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soa.feri.si.Fiscalization.FiscalizationService_PortType getFiscalizationService_PortType() {
    if (fiscalizationService_PortType == null)
      _initFiscalizationServiceProxy();
    return fiscalizationService_PortType;
  }
  
  public java.lang.String registration(java.lang.String VAT, soa.feri.si.Fiscalization.AddressType address) throws java.rmi.RemoteException{
    if (fiscalizationService_PortType == null)
      _initFiscalizationServiceProxy();
    return fiscalizationService_PortType.registration(VAT, address);
  }
  
  public java.lang.String verification(java.lang.String VAT, java.lang.String containKey, java.util.Calendar dateOfIssue, soa.feri.si.Fiscalization.InvoiceType invoice) throws java.rmi.RemoteException{
    if (fiscalizationService_PortType == null)
      _initFiscalizationServiceProxy();
    return fiscalizationService_PortType.verification(VAT, containKey, dateOfIssue, invoice);
  }
  
  public soa.feri.si.Fiscalization.InvoiceType[] obtainInvoices(java.lang.String VAT, java.lang.String containKey, java.util.Calendar dateFrom, java.util.Calendar dateTo) throws java.rmi.RemoteException{
    if (fiscalizationService_PortType == null)
      _initFiscalizationServiceProxy();
    return fiscalizationService_PortType.obtainInvoices(VAT, containKey, dateFrom, dateTo);
  }
  
  
}