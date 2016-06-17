/**
 * FiscalizationService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soa.feri.si.Fiscalization;

public interface FiscalizationService_PortType extends java.rmi.Remote {
    public java.lang.String registration(java.lang.String VAT, soa.feri.si.Fiscalization.AddressType address) throws java.rmi.RemoteException;
    public java.lang.String verification(java.lang.String VAT, java.lang.String containKey, java.util.Calendar dateOfIssue, soa.feri.si.Fiscalization.InvoiceType invoice) throws java.rmi.RemoteException;
    public soa.feri.si.Fiscalization.InvoiceType[] obtainInvoices(java.lang.String VAT, java.lang.String containKey, java.util.Calendar dateFrom, java.util.Calendar dateTo) throws java.rmi.RemoteException;
}
