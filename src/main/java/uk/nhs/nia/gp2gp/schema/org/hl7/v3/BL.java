
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *    The Boolean type stands for the values of two-valued logic. A
 *    Boolean value can be either true or
 *    false, or, as any other value may be NULL.
 * 
 * 
 * &lt;p&gt;Java class for BL complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BL"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:hl7-org:v3}ANY"&amp;gt;
 *       &amp;lt;attribute name="value" type="{urn:hl7-org:v3}bl" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BL")
public class BL
    extends ANY
{

    @XmlAttribute(name = "value")
    protected Boolean value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

}
