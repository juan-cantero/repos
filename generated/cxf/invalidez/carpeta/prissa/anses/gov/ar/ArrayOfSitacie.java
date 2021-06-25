
package invalidez.carpeta.prissa.anses.gov.ar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSitacie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSitacie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sitacie" type="{http://Ar.Gov.Anses.Prissa.Carpeta.Invalidez}Sitacie" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSitacie", propOrder = {
    "sitacie"
})
public class ArrayOfSitacie {

    @XmlElement(name = "Sitacie", nillable = true)
    protected List<Sitacie> sitacie;

    /**
     * Gets the value of the sitacie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sitacie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSitacie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sitacie }
     * 
     * 
     */
    public List<Sitacie> getSitacie() {
        if (sitacie == null) {
            sitacie = new ArrayList<Sitacie>();
        }
        return this.sitacie;
    }

}
