package invalidez.carpeta.prissa.anses.gov.ar;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * Proporciona los servicios de grabar/recuperar los archivos del SITACIE
 *
 * This class was generated by Apache CXF 3.4.4
 * 2021-06-25T11:58:47.312-03:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "SitacieWS",
                  wsdlLocation = "file:/C:/Users/juanqui/git/anses-dictamenes-auditoria/src/main/resources/wsdl/SitacieWS.wsdl",
                  targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez")
public class SitacieWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", "SitacieWS");
    public final static QName SitacieWSSoap = new QName("http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", "SitacieWSSoap");
    public final static QName SitacieWSSoap12 = new QName("http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", "SitacieWSSoap12");
    public final static QName SitacieWSHttpGet = new QName("http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", "SitacieWSHttpGet");
    public final static QName SitacieWSHttpPost = new QName("http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", "SitacieWSHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/juanqui/git/anses-dictamenes-auditoria/src/main/resources/wsdl/SitacieWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SitacieWS.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/juanqui/git/anses-dictamenes-auditoria/src/main/resources/wsdl/SitacieWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SitacieWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SitacieWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SitacieWS() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SitacieWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SitacieWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SitacieWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SitacieWSSoap
     */
    @WebEndpoint(name = "SitacieWSSoap")
    public SitacieWSSoap getSitacieWSSoap() {
        return super.getPort(SitacieWSSoap, SitacieWSSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SitacieWSSoap
     */
    @WebEndpoint(name = "SitacieWSSoap")
    public SitacieWSSoap getSitacieWSSoap(WebServiceFeature... features) {
        return super.getPort(SitacieWSSoap, SitacieWSSoap.class, features);
    }


    /**
     *
     * @return
     *     returns SitacieWSSoap
     */
    @WebEndpoint(name = "SitacieWSSoap12")
    public SitacieWSSoap getSitacieWSSoap12() {
        return super.getPort(SitacieWSSoap12, SitacieWSSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SitacieWSSoap
     */
    @WebEndpoint(name = "SitacieWSSoap12")
    public SitacieWSSoap getSitacieWSSoap12(WebServiceFeature... features) {
        return super.getPort(SitacieWSSoap12, SitacieWSSoap.class, features);
    }


    /**
     *
     * @return
     *     returns SitacieWSHttpGet
     */
    @WebEndpoint(name = "SitacieWSHttpGet")
    public SitacieWSHttpGet getSitacieWSHttpGet() {
        return super.getPort(SitacieWSHttpGet, SitacieWSHttpGet.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SitacieWSHttpGet
     */
    @WebEndpoint(name = "SitacieWSHttpGet")
    public SitacieWSHttpGet getSitacieWSHttpGet(WebServiceFeature... features) {
        return super.getPort(SitacieWSHttpGet, SitacieWSHttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns SitacieWSHttpPost
     */
    @WebEndpoint(name = "SitacieWSHttpPost")
    public SitacieWSHttpPost getSitacieWSHttpPost() {
        return super.getPort(SitacieWSHttpPost, SitacieWSHttpPost.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SitacieWSHttpPost
     */
    @WebEndpoint(name = "SitacieWSHttpPost")
    public SitacieWSHttpPost getSitacieWSHttpPost(WebServiceFeature... features) {
        return super.getPort(SitacieWSHttpPost, SitacieWSHttpPost.class, features);
    }

}