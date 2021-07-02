/**
 * EnviarMail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.anses.arquitectura;

public interface EnviarMail extends javax.xml.rpc.Service {
    public java.lang.String getEnviarMailSoapAddress();

    public ar.gov.anses.arquitectura.EnviarMailSoap getEnviarMailSoap() throws javax.xml.rpc.ServiceException;

    public ar.gov.anses.arquitectura.EnviarMailSoap getEnviarMailSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
