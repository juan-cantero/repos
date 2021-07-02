/**
 * EnviarMailSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.anses.arquitectura;

public interface EnviarMailSoap extends java.rmi.Remote {
    public boolean envioPruebaMail(java.lang.String asunto, java.lang.String correoElectronico, java.lang.String cuerpoComunicacion) throws java.rmi.RemoteException;
    public boolean envioUnico(java.lang.String correoElectronico, java.lang.String asunto, java.lang.String cuerpoHTML, java.lang.String cuerpoTexto) throws java.rmi.RemoteException;
    public boolean envioConAdjunto(java.lang.String correoElectronico, java.lang.String asunto, java.lang.String cuerpoHTML, byte[] datosBinarios, java.lang.String nombreArchivo) throws java.rmi.RemoteException;
    public boolean envioPruebaConAdjunto(java.lang.String asunto, java.lang.String correoElectronico, java.lang.String cuerpoComunicacion, byte[] datosBinarios, java.lang.String nombreArchivo) throws java.rmi.RemoteException;
}
