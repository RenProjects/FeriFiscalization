/**
 * FiscalizationServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soa.feri.si.Fiscalization;

import java.util.UUID;

public class FiscalizationServiceSOAPImpl implements soa.feri.si.Fiscalization.FiscalizationService_PortType {
	public java.lang.String registration(java.lang.String VAT, soa.feri.si.Fiscalization.AddressType address)
			throws java.rmi.RemoteException {

		// TODO Ren: Sloziti ContainKey broj
		return "616252";
	}

	public java.lang.String verification(java.lang.String VAT, java.lang.String containKey,
			java.util.Calendar dateOfIssue, soa.feri.si.Fiscalization.InvoiceType invoice)
			throws java.rmi.RemoteException {
		return UUID.randomUUID().toString();
	}

	public soa.feri.si.Fiscalization.InvoiceType[] obtainInvoices(java.lang.String VAT, java.lang.String containKey,
			java.util.Calendar dateFrom, java.util.Calendar dateTo) throws java.rmi.RemoteException {
		InvoiceType invoice1 = new InvoiceType("123456", "25.00", "25.00", "125.00");
		InvoiceType invoice2 = new InvoiceType("123789", "15.00", "15.00", "115.00");
		InvoiceType invoice3 = new InvoiceType("123987", "18.00", "22.00", "222.00");

		InvoiceType[] invoices = { invoice1, invoice2, invoice3 };

		return invoices;
	}

}
