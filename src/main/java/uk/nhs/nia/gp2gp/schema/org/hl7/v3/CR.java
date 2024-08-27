
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * A concept qualifier code with optionally named role.  Both qualifier
 * role and value codes must be defined by the coding system.  For
 * example, if SNOMED RT defines a concept "leg", a role relation
 * "has-laterality", and another concept "left", the concept role
 * relation allows to add the qualifier "has-laterality: left" to a
 * primary code "leg" to construct the meaning "left leg".
 * 
 * 
 * &lt;p&gt;Java class for CR complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CR"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:hl7-org:v3}CD"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name" type="{urn:hl7-org:v3}CV" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="value" type="{urn:hl7-org:v3}CD" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="inverted" type="{urn:hl7-org:v3}bl" default="false" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CR", propOrder = {
    "name",
    "value"
})
public class CR
    extends CD
{

    protected CV name;
    protected CD value;
    @XmlAttribute(name = "inverted")
    protected Boolean inverted;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setName(CV value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setValue(CD value) {
        this.value = value;
    }

    /**
     * Gets the value of the inverted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInverted() {
        if (inverted == null) {
            return false;
        } else {
            return inverted;
        }
    }

    /**
     * Sets the value of the inverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverted(Boolean value) {
        this.inverted = value;
    }

}
