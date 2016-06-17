/**
 * FiscalizationServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soa.feri.si.Fiscalization;

public class FiscalizationServiceSOAPSkeleton implements soa.feri.si.Fiscalization.FiscalizationService_PortType, org.apache.axis.wsdl.Skeleton {
    private soa.feri.si.Fiscalization.FiscalizationService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "VAT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "VATType"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "AddressType"), soa.feri.si.Fiscalization.AddressType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("registration", _params, new javax.xml.namespace.QName("", "ContainKey"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "NumberType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "Registration"));
        _oper.setSoapAction("http://si.feri.soa/Fiscalization/Registration");
        _myOperationsList.add(_oper);
        if (_myOperations.get("registration") == null) {
            _myOperations.put("registration", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("registration")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "VAT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "VATType"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ContainKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "NumberType"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateOfIssue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Invoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "InvoiceType"), soa.feri.si.Fiscalization.InvoiceType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("verification", _params, new javax.xml.namespace.QName("", "EOR"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "GUIDType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "InvoiceVerificationRequest"));
        _oper.setSoapAction("http://si.feri.soa/Fiscalization/Verification");
        _myOperationsList.add(_oper);
        if (_myOperations.get("verification") == null) {
            _myOperations.put("verification", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("verification")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "VAT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "VATType"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ContainKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "NumberType"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateFrom"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateTo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("obtainInvoices", _params, new javax.xml.namespace.QName("", "Invoices"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", ">>DataResponse>Invoices"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "DataRequest"));
        _oper.setSoapAction("http://si.feri.soa/Fiscalization/ObtainInvoices");
        _myOperationsList.add(_oper);
        if (_myOperations.get("obtainInvoices") == null) {
            _myOperations.put("obtainInvoices", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("obtainInvoices")).add(_oper);
    }

    public FiscalizationServiceSOAPSkeleton() {
        this.impl = new soa.feri.si.Fiscalization.FiscalizationServiceSOAPImpl();
    }

    public FiscalizationServiceSOAPSkeleton(soa.feri.si.Fiscalization.FiscalizationService_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String registration(java.lang.String VAT, soa.feri.si.Fiscalization.AddressType address) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.registration(VAT, address);
        return ret;
    }

    public java.lang.String verification(java.lang.String VAT, java.lang.String containKey, java.util.Calendar dateOfIssue, soa.feri.si.Fiscalization.InvoiceType invoice) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.verification(VAT, containKey, dateOfIssue, invoice);
        return ret;
    }

    public soa.feri.si.Fiscalization.InvoiceType[] obtainInvoices(java.lang.String VAT, java.lang.String containKey, java.util.Calendar dateFrom, java.util.Calendar dateTo) throws java.rmi.RemoteException
    {
        soa.feri.si.Fiscalization.InvoiceType[] ret = impl.obtainInvoices(VAT, containKey, dateFrom, dateTo);
        return ret;
    }

}
