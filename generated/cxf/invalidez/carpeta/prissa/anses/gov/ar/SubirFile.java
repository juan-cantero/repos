
package invalidez.carpeta.prissa.anses.gov.ar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "base64",
    "directorio",
    "fileName"
})
@XmlRootElement(name = "SubirFile")
public class SubirFile {

    protected String base64;
    protected String directorio;
    protected String fileName;

    /**
     * Gets the value of the base64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64() {
        return base64;
    }

    /**
     * Sets the value of the base64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64(String value) {
        this.base64 = value;
    }

    /**
     * Gets the value of the directorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorio() {
        return directorio;
    }

    /**
     * Sets the value of the directorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorio(String value) {
        this.directorio = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
