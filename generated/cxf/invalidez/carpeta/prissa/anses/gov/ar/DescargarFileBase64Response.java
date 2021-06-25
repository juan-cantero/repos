
package invalidez.carpeta.prissa.anses.gov.ar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="DescargarFileBase64Result" type="{http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez}ArrayOfSitacie" minOccurs="0"/&gt;
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
    "descargarFileBase64Result"
})
@XmlRootElement(name = "DescargarFileBase64Response")
public class DescargarFileBase64Response {

    @XmlElement(name = "DescargarFileBase64Result")
    protected ArrayOfSitacie descargarFileBase64Result;

    /**
     * Gets the value of the descargarFileBase64Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSitacie }
     *     
     */
    public ArrayOfSitacie getDescargarFileBase64Result() {
        return descargarFileBase64Result;
    }

    /**
     * Sets the value of the descargarFileBase64Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSitacie }
     *     
     */
    public void setDescargarFileBase64Result(ArrayOfSitacie value) {
        this.descargarFileBase64Result = value;
    }

}
