package ar.gov.anses.arquitectura;

public class EnviarMailSoapProxy implements ar.gov.anses.arquitectura.EnviarMailSoap {
  private String _endpoint = null;
  private ar.gov.anses.arquitectura.EnviarMailSoap enviarMailSoap = null;
  
  public EnviarMailSoapProxy() {
    _initEnviarMailSoapProxy();
  }
  
  public EnviarMailSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEnviarMailSoapProxy();
  }
  
  private void _initEnviarMailSoapProxy() {
    try {
      enviarMailSoap = (new ar.gov.anses.arquitectura.EnviarMailLocator()).getEnviarMailSoap();
      if (enviarMailSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)enviarMailSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)enviarMailSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (enviarMailSoap != null)
      ((javax.xml.rpc.Stub)enviarMailSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ar.gov.anses.arquitectura.EnviarMailSoap getEnviarMailSoap() {
    if (enviarMailSoap == null)
      _initEnviarMailSoapProxy();
    return enviarMailSoap;
  }
  
  public boolean envioPruebaMail(java.lang.String asunto, java.lang.String correoElectronico, java.lang.String cuerpoComunicacion) throws java.rmi.RemoteException{
    if (enviarMailSoap == null)
      _initEnviarMailSoapProxy();
    return enviarMailSoap.envioPruebaMail(asunto, correoElectronico, cuerpoComunicacion);
  }
  
  public boolean envioUnico(java.lang.String correoElectronico, java.lang.String asunto, java.lang.String cuerpoHTML, java.lang.String cuerpoTexto) throws java.rmi.RemoteException{
    if (enviarMailSoap == null)
      _initEnviarMailSoapProxy();
    return enviarMailSoap.envioUnico(correoElectronico, asunto, cuerpoHTML, cuerpoTexto);
  }
  
  public boolean envioConAdjunto(java.lang.String correoElectronico, java.lang.String asunto, java.lang.String cuerpoHTML, byte[] datosBinarios, java.lang.String nombreArchivo) throws java.rmi.RemoteException{
    if (enviarMailSoap == null)
      _initEnviarMailSoapProxy();
    return enviarMailSoap.envioConAdjunto(correoElectronico, asunto, cuerpoHTML, datosBinarios, nombreArchivo);
  }
  
  public boolean envioPruebaConAdjunto(java.lang.String asunto, java.lang.String correoElectronico, java.lang.String cuerpoComunicacion, byte[] datosBinarios, java.lang.String nombreArchivo) throws java.rmi.RemoteException{
    if (enviarMailSoap == null)
      _initEnviarMailSoapProxy();
    return enviarMailSoap.envioPruebaConAdjunto(asunto, correoElectronico, cuerpoComunicacion, datosBinarios, nombreArchivo);
  }
  
  
}