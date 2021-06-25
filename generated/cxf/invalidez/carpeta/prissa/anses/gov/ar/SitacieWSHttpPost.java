package invalidez.carpeta.prissa.anses.gov.ar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-06-25T11:58:47.297-03:00
 * Generated source version: 3.4.4
 *
 */
@WebService(targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", name = "SitacieWSHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SitacieWSHttpPost {

    /**
     * Graba el archivo en el SITACIE
     */
    @WebMethod(operationName = "SubirFile")
    @WebResult(name = "string", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", partName = "Body")
    public java.lang.String subirFile(

        @WebParam(partName = "base64", name = "base64", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez")
        java.lang.String base64,
        @WebParam(partName = "directorio", name = "directorio", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez")
        java.lang.String directorio,
        @WebParam(partName = "fileName", name = "fileName", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez")
        java.lang.String fileName
    );

    /**
     * Recupera una lista de archivos
     */
    @WebMethod(operationName = "DescargarFileBase64")
    @WebResult(name = "ArrayOfSitacie", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", partName = "Body")
    public ArrayOfSitacie descargarFileBase64(

        @WebParam(partName = "directorio", name = "directorio", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez")
        java.lang.String directorio
    );

    /**
     * Eliminar el archivo
     */
    @WebMethod(operationName = "EliminarFile")
    @WebResult(name = "string", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez", partName = "Body")
    public java.lang.String eliminarFile(

        @WebParam(partName = "directorio", name = "directorio", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez")
        java.lang.String directorio,
        @WebParam(partName = "fileName", name = "fileName", targetNamespace = "http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez")
        java.lang.String fileName
    );
}