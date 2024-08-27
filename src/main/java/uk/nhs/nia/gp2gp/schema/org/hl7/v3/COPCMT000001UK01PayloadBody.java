package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for COPC_MT000001UK01.PayloadBody complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="COPC_MT000001UK01.PayloadBody"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&amp;gt;
 *         &amp;lt;element name="code" type="{urn:hl7-org:v3}CV"/&amp;gt;
 *         &amp;lt;element name="id" type="{urn:hl7-org:v3}II.NPfIT.uuid.mandatory"/&amp;gt;
 *         &amp;lt;element name="value" type="{urn:hl7-org:v3}ED"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/&amp;gt;
 *       &amp;lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}cs" fixed="OBS" /&amp;gt;
 *       &amp;lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}cs" fixed="EVN" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COPC_MT000001UK01.PayloadBody", propOrder = {
    "code",
    "id",
    "value"
})
public class COPCMT000001UK01PayloadBody {

    @XmlElement(required = true)
    protected CV code;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected ED value;
    @XmlAttribute(name = "classCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String classCode;
    @XmlAttribute(name = "moodCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String moodCode;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "updateMode")
    protected CsUpdateMode updateMode;

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link CV }
     *
     */
    public CV getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link CV }
     *
     */
    public void setCode(CV value) {
        this.code = value;
    }

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
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link ED }
     *
     */
    public ED getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link ED }
     *
     */
    public void setValue(ED value) {
        this.value = value;
    }

    /**
     * Gets the value of the classCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClassCode() {
        if (classCode == null) {
            return "OBS";
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMoodCode() {
        if (moodCode == null) {
            return "EVN";
        } else {
            return moodCode;
        }
    }

    /**
     * Sets the value of the moodCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMoodCode(String value) {
        this.moodCode = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     *
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the nullFlavor property.
     *
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNullFlavor().add(newItem);
     * &lt;/pre&gt;
     *
     *
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<>();
        }
        return this.nullFlavor;
    }

    /**
     * Gets the value of the updateMode property.
     *
     * @return
     *     possible object is
     *     {@link CsUpdateMode }
     *
     */
    public CsUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Sets the value of the updateMode property.
     *
     * @param value
     *     allowed object is
     *     {@link CsUpdateMode }
     *
     */
    public void setUpdateMode(CsUpdateMode value) {
        this.updateMode = value;
    }
}