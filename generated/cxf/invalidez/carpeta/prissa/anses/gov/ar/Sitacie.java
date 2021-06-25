
package invalidez.carpeta.prissa.anses.gov.ar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sitacie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sitacie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Base64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sitacie", propOrder = {
    "nombreArchivo",
    "base64String",
    "error"
})
public class Sitacie {

    @XmlElement(name = "NombreArchivo")
    protected String nombreArchivo;
    @XmlElement(name = "Base64String")
    protected String base64String;
    @XmlElement(name = "Error")
    protected String error;

    /**
     * Gets the value of the nombreArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Sets the value of the nombreArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivo(String value) {
        this.nombreArchivo = value;
    }

    /**
     * Gets the value of the base64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64String() {
        return base64String;
    }

    /**
     * Sets the value of the base64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64String(String value) {
        this.base64String = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
