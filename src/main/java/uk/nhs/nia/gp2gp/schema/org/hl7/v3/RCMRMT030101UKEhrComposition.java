
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for RCMR_MT030101UK.EhrComposition complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RCMR_MT030101UK.EhrComposition"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="id" type="{urn:hl7-org:v3}II"/&amp;gt;
 *         &amp;lt;element name="code" type="{urn:hl7-org:v3}CD"/&amp;gt;
 *         &amp;lt;element name="statusCode" type="{urn:hl7-org:v3}CS"/&amp;gt;
 *         &amp;lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS"/&amp;gt;
 *         &amp;lt;element name="availabilityTime" type="{urn:hl7-org:v3}TS"/&amp;gt;
 *         &amp;lt;element name="author" type="{urn:hl7-org:v3}RCMR_MT030101UK.Author"/&amp;gt;
 *         &amp;lt;element name="location" type="{urn:hl7-org:v3}RCMR_MT030101UK.Location" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Participant2" type="{urn:hl7-org:v3}RCMR_MT030101UK.Participant2" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="component" type="{urn:hl7-org:v3}RCMR_MT030101UK.Component4" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="replacementOf" type="{urn:hl7-org:v3}RCMR_MT030101UK.ReplacementOf2" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="type" type="{urn:hl7-org:v3}Classes" default="ContextStructure" /&amp;gt;
 *       &amp;lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClass" default="COMPOSITION" /&amp;gt;
 *       &amp;lt;attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" default="EVN" /&amp;gt;
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
@XmlType(name = "RCMR_MT030101UK.EhrComposition", propOrder = {
    "id",
    "code",
    "statusCode",
    "effectiveTime",
    "availabilityTime",
    "confidentialityCode",
    "author",
    "location",
    "participant2",
    "component",
    "replacementOf"
})
public class RCMRMT030101UKEhrComposition {

    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected CD code;
    @XmlElement(required = true)
    protected CS statusCode;
    @XmlElement(required = true)
    protected IVLTS effectiveTime;
    @XmlElement(required = true)
    protected TS availabilityTime;
    protected CV confidentialityCode;

    @XmlElement(required = true, type = RCMRMT030101UKAuthor.class)
    protected RCMRMT030101UKAuthor author;

    @XmlElement(type = RCMRMT030101UKLocation.class)
    protected RCMRMT030101UKLocation location;

    @XmlElement(name = "Participant2", type = RCMRMT030101UKParticipant2.class)
    protected List<RCMRMT030101UKParticipant2> participant2;

    @XmlElement(required = true, type = RCMRMT030101UKComponent4.class)
    protected List<RCMRMT030101UKComponent4> component;

    @XmlElement(type = RCMRMT030101UKReplacementOf2.class)
    protected RCMRMT030101UKReplacementOf2 replacementOf;

    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "classCode")
    protected List<String> classCode;
    @XmlAttribute(name = "moodCode")
    protected List<String> moodCode;
    @XmlAttribute(name = "typeID")
    protected List<String> typeID;
    @XmlAttribute(name = "realmCode")
    protected List<String> realmCode;
    @XmlAttribute(name = "nullFlavor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nullFlavor;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setStatusCode(CS value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the availabilityTime property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getAvailabilityTime() {
        return availabilityTime;
    }

    /**
     * Sets the value of the availabilityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setAvailabilityTime(TS value) {
        this.availabilityTime = value;
    }

    
    public boolean hasAvailabilityTime() { return availabilityTime != null; }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link RCMRMT030101UKAuthor }
     *     
     */
    public RCMRMT030101UKAuthor getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMRMT030101UKAuthor }
     *     
     */
    public void setAuthor(RCMRMT030101UKAuthor value) {
        this.author = value;
    }

    public boolean hasAuthor() {
        return author != null;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link RCMRMT030101UKLocation }
     *     
     */
    public RCMRMT030101UKLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMRMT030101UKLocation }
     *     
     */
    public void setLocation(RCMRMT030101UKLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the participant2 property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the participant2 property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getParticipant2().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RCMRMT030101UKParticipant2 }
     * 
     * 
     */
    public List<RCMRMT030101UKParticipant2> getParticipant2() {
        if (participant2 == null) {
            participant2 = new ArrayList<>();
        }
        return this.participant2;
    }

    public boolean hasParticipant2() {
        return participant2 != null && !participant2.isEmpty();
    }

    /**
     * Gets the value of the component property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the component property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getComponent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RCMRMT030101UKComponent4 }
     * 
     * 
     */
    public List<RCMRMT030101UKComponent4> getComponent() {
        if (component == null) {
            component = new ArrayList<>();
        }
        return this.component;
    }

    /**
     * Sets the value of the component property.
     *
     * @param value
     *     allowed object is
     *     {@link RCMRMT030101UKComponent4 }
     *
     */
    public void setComponent(List<RCMRMT030101UKComponent4> value) {
        this.component = value;
    }

    /**
     * Gets the value of the replacementOf property.
     * 
     * @return
     *     possible object is
     *     {@link RCMRMT030101UKReplacementOf2 }
     *     
     */
    public RCMRMT030101UKReplacementOf2 getReplacementOf() {
        return replacementOf;
    }

    /**
     * Sets the value of the replacementOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMRMT030101UKReplacementOf2 }
     *     
     */
    public void setReplacementOf(RCMRMT030101UKReplacementOf2 value) {
        this.replacementOf = value;
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
        return Objects.requireNonNullElse(type, "ContextStructure");
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
     * Gets the value of the classCode property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the classCode property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getClassCode().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassCode() {
        if (classCode == null) {
            classCode = new ArrayList<>();
        }
        return this.classCode;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the moodCode property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMoodCode().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMoodCode() {
        if (moodCode == null) {
            moodCode = new ArrayList<>();
        }
        return this.moodCode;
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

    public Optional<CV> getConfidentialityCode() {
        return Optional.ofNullable(confidentialityCode);
    }

    public void setConfidentialityCode(CV confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }

}
