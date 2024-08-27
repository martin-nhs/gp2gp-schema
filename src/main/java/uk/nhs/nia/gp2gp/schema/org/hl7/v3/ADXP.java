
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * 
 * A character string that may have a type-tag signifying its role in the
 * address. Typical parts that exist in about every address are street,
 * house number, or post box, postal code, city, country but other roles
 * may be defined regionally, nationally, or on an enterprise level
 * (e.g. in military addresses). Addresses are usually broken up into
 * lines, which are indicated by special line-breaking delimiter elements 
 * (e.g., DEL).
 * 
 * 
 * &lt;p&gt;Java class for ADXP complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ADXP"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:hl7-org:v3}ST"&amp;gt;
 *       &amp;lt;attribute name="partType" type="{urn:hl7-org:v3}cs_AddressPartType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADXP")
@XmlSeeAlso({
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.Delimiter.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.Country.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.State.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.County.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.City.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.PostalCode.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.StreetAddressLine.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.HouseNumber.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.HouseNumberNumeric.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.Direction.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.StreetName.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.StreetNameBase.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.StreetNameType.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.AdditionalLocator.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.UnitID.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.UnitType.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.Carrier.class,
    uk.nhs.nia.gp2gp.schema.org.hl7.v3.AD.CensusTract.class
})
public class ADXP
    extends ED
{

    @XmlAttribute(name = "partType")
    protected CsAddressPartType partType;

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link CsAddressPartType }
     *     
     */
    public CsAddressPartType getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsAddressPartType }
     *     
     */
    public void setPartType(CsAddressPartType value) {
        this.partType = value;
    }

}
