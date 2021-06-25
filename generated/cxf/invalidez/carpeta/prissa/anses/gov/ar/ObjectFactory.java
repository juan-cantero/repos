
package invalidez.carpeta.prissa.anses.gov.ar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the invalidez.carpeta.prissa.anses.gov.ar package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", "string");
    private final static QName _ArrayOfSitacie_QNAME = new QName("http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", "ArrayOfSitacie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: invalidez.carpeta.prissa.anses.gov.ar
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubirFile }
     * 
     */
    public SubirFile createSubirFile() {
        return new SubirFile();
    }

    /**
     * Create an instance of {@link SubirFileResponse }
     * 
     */
    public SubirFileResponse createSubirFileResponse() {
        return new SubirFileResponse();
    }

    /**
     * Create an instance of {@link DescargarFileBase64 }
     * 
     */
    public DescargarFileBase64 createDescargarFileBase64() {
        return new DescargarFileBase64();
    }

    /**
     * Create an instance of {@link DescargarFileBase64Response }
     * 
     */
    public DescargarFileBase64Response createDescargarFileBase64Response() {
        return new DescargarFileBase64Response();
    }

    /**
     * Create an instance of {@link ArrayOfSitacie }
     * 
     */
    public ArrayOfSitacie createArrayOfSitacie() {
        return new ArrayOfSitacie();
    }

    /**
     * Create an instance of {@link EliminarFile }
     * 
     */
    public EliminarFile createEliminarFile() {
        return new EliminarFile();
    }

    /**
     * Create an instance of {@link EliminarFileResponse }
     * 
     */
    public EliminarFileResponse createEliminarFileResponse() {
        return new EliminarFileResponse();
    }

    /**
     * Create an instance of {@link Sitacie }
     * 
     */
    public Sitacie createSitacie() {
        return new Sitacie();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSitacie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSitacie }{@code >}
     */
    @XmlElementDecl(namespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", name = "ArrayOfSitacie")
    public JAXBElement<ArrayOfSitacie> createArrayOfSitacie(ArrayOfSitacie value) {
        return new JAXBElement<ArrayOfSitacie>(_ArrayOfSitacie_QNAME, ArrayOfSitacie.class, null, value);
    }

}
