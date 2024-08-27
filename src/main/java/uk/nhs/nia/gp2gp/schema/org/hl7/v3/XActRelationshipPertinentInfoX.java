
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for x_ActRelationshipPertinentInfo_X.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="x_ActRelationshipPertinentInfo_X"&amp;gt;
 *   &amp;lt;restriction base="{urn:hl7-org:v3}cs"&amp;gt;
 *     &amp;lt;enumeration value="REFR"/&amp;gt;
 *     &amp;lt;enumeration value="SUBJ"/&amp;gt;
 *     &amp;lt;enumeration value="MFST"/&amp;gt;
 *     &amp;lt;enumeration value="CAUS"/&amp;gt;
 *     &amp;lt;enumeration value="SPRT"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "x_ActRelationshipPertinentInfo_X")
@XmlEnum
public enum XActRelationshipPertinentInfoX {

    REFR,
    SUBJ,
    MFST,
    CAUS,
    SPRT;

    public String value() {
        return name();
    }

    public static XActRelationshipPertinentInfoX fromValue(String v) {
        return valueOf(v);
    }

}
