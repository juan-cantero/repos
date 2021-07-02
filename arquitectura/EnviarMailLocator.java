/**
 * EnviarMailLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ar.gov.anses.arquitectura;

public class EnviarMailLocator extends org.apache.axis.client.Service implements ar.gov.anses.arquitectura.EnviarMail {

    public EnviarMailLocator() {
    }


    public EnviarMailLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EnviarMailLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EnviarMailSoap
    private java.lang.String EnviarMailSoap_address = "http://labprueba3:8080/checkmail/enviarmail.asmx";

    public java.lang.String getEnviarMailSoapAddress() {
        return EnviarMailSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EnviarMailSoapWSDDServiceName = "EnviarMailSoap";

    public java.lang.String getEnviarMailSoapWSDDServiceName() {
        return EnviarMailSoapWSDDServiceName;
    }

    public void setEnviarMailSoapWSDDServiceName(java.lang.String name) {
        EnviarMailSoapWSDDServiceName = name;
    }

    public ar.gov.anses.arquitectura.EnviarMailSoap getEnviarMailSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EnviarMailSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEnviarMailSoap(endpoint);
    }

    public ar.gov.anses.arquitectura.EnviarMailSoap getEnviarMailSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ar.gov.anses.arquitectura.EnviarMailSoapStub _stub = new ar.gov.anses.arquitectura.EnviarMailSoapStub(portAddress, this);
            _stub.setPortName(getEnviarMailSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEnviarMailSoapEndpointAddress(java.lang.String address) {
        EnviarMailSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ar.gov.anses.arquitectura.EnviarMailSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ar.gov.anses.arquitectura.EnviarMailSoapStub _stub = new ar.gov.anses.arquitectura.EnviarMailSoapStub(new java.net.URL(EnviarMailSoap_address), this);
                _stub.setPortName(getEnviarMailSoapWSDDServiceName());
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
        if ("EnviarMailSoap".equals(inputPortName)) {
            return getEnviarMailSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://anses.gov.ar/arquitectura/", "EnviarMail");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://anses.gov.ar/arquitectura/", "EnviarMailSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EnviarMailSoap".equals(portName)) {
            setEnviarMailSoapEndpointAddress(address);
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
