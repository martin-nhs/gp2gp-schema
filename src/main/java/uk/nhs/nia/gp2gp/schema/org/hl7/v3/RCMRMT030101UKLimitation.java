
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for RCMR_MT030101UK.Limitation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RCMR_MT030101UK.Limitation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="limitingEhrExtractSpecification" type="{urn:hl7-org:v3}RCMR_MT030101UK.EhrExtractSpecification"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="type" type="{urn:hl7-org:v3}Classes" default="ActRelationship" /&amp;gt;
 *       &amp;lt;attribute name="typeCode" type="{urn:hl7-org:v3}ActRelationshipType" default="LIMIT" /&amp;gt;
 *       &amp;lt;attribute name="inversionInd" type="{urn:hl7-org:v3}bl" default="true" /&amp;gt;
 *       &amp;lt;attribute name="typeID"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;list itemType="{urn:hl7-org:v3}oid" /&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="realmCode"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;list itemType="{urn:hl7-org:v3}cs" /&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}cs" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RCMR_MT030101UK.Limitation", propOrder = {
    "limitingEhrExtractSpecification"
})
public class RCMRMT030101UKLimitation {

    @XmlElement(required = true, type = RCMRMT030101UKEhrExtractSpecification.class)
    protected RCMRMT030101UKEhrExtractSpecification limitingEhrExtractSpecification;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "typeCode")
    protected List<String> typeCode;
    @XmlAttribute(name = "inversionInd")
    protected Boolean inversionInd;
    @XmlAttribute(name = "typeID")
    protected List<String> typeID;
    @XmlAttribute(name = "realmCode")
    protected List<String> realmCode;
    @XmlAttribute(name = "nullFlavor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nullFlavor;

    /**
     * Gets the value of the limitingEhrExtractSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link RCMRMT030101UKEhrExtractSpecification }
     *     
     */
    public RCMRMT030101UKEhrExtractSpecification getLimitingEhrExtractSpecification() {
        return limitingEhrExtractSpecification;
    }

    /**
     * Sets the value of the limitingEhrExtractSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMRMT030101UKEhrExtractSpecification }
     *     
     */
    public void setLimitingEhrExtractSpecification(RCMRMT030101UKEhrExtractSpecification value) {
        this.limitingEhrExtractSpecification = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return Objects.requireNonNullElse(type, "ActRelationship");
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the typeCode property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTypeCode().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<>();
        }
        return this.typeCode;
    }

    /**
     * Gets the value of the inversionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInversionInd() {
        return Objects.requireNonNullElse(inversionInd, true);
    }

    /**
     * Sets the value of the inversionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInversionInd(Boolean value) {
        this.inversionInd = value;
    }

    /**
     * Gets the value of the typeID property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the typeID property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTypeID().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeID() {
        if (typeID == null) {
            typeID = new ArrayList<>();
        }
        return this.typeID;
    }

    /**
     * Gets the value of the realmCode property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the realmCode property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRealmCode().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullFlavor() {
        return nullFlavor;
    }

    /**
     * Sets the value of the nullFlavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullFlavor(String value) {
        this.nullFlavor = value;
    }

}
