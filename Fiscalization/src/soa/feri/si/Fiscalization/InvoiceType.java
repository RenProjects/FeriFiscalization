/**
 * InvoiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soa.feri.si.Fiscalization;

public class InvoiceType  implements java.io.Serializable {
    private java.lang.String sequentialNumber;

    private java.lang.String taxRate;

    private java.lang.String taxAmount;

    private java.lang.String totalAmount;

    public InvoiceType() {
    }

    public InvoiceType(
           java.lang.String sequentialNumber,
           java.lang.String taxRate,
           java.lang.String taxAmount,
           java.lang.String totalAmount) {
           this.sequentialNumber = sequentialNumber;
           this.taxRate = taxRate;
           this.taxAmount = taxAmount;
           this.totalAmount = totalAmount;
    }


    /**
     * Gets the sequentialNumber value for this InvoiceType.
     * 
     * @return sequentialNumber
     */
    public java.lang.String getSequentialNumber() {
        return sequentialNumber;
    }


    /**
     * Sets the sequentialNumber value for this InvoiceType.
     * 
     * @param sequentialNumber
     */
    public void setSequentialNumber(java.lang.String sequentialNumber) {
        this.sequentialNumber = sequentialNumber;
    }


    /**
     * Gets the taxRate value for this InvoiceType.
     * 
     * @return taxRate
     */
    public java.lang.String getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this InvoiceType.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.String taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxAmount value for this InvoiceType.
     * 
     * @return taxAmount
     */
    public java.lang.String getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this InvoiceType.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.String taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the totalAmount value for this InvoiceType.
     * 
     * @return totalAmount
     */
    public java.lang.String getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this InvoiceType.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.String totalAmount) {
        this.totalAmount = totalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceType)) return false;
        InvoiceType other = (InvoiceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sequentialNumber==null && other.getSequentialNumber()==null) || 
             (this.sequentialNumber!=null &&
              this.sequentialNumber.equals(other.getSequentialNumber()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSequentialNumber() != null) {
            _hashCode += getSequentialNumber().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://si.feri.soa/Fiscalization/", "InvoiceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequentialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SequentialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
