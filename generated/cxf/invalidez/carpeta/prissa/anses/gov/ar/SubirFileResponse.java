
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
 *         &lt;element name="SubirFileResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "subirFileResult"
})
@XmlRootElement(name = "SubirFileResponse")
public class SubirFileResponse {

    @XmlElement(name = "SubirFileResult")
    protected String subirFileResult;

    /**
     * Gets the value of the subirFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubirFileResult() {
        return subirFileResult;
    }

    /**
     * Sets the value of the subirFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubirFileResult(String value) {
        this.subirFileResult = value;
    }

}
