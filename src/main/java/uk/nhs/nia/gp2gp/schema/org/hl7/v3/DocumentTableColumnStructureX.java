
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DocumentTableColumnStructure_X.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DocumentTableColumnStructure_X"&amp;gt;
 *   &amp;lt;restriction base="{urn:hl7-org:v3}cs"&amp;gt;
 *     &amp;lt;enumeration value="TBLCOL"/&amp;gt;
 *     &amp;lt;enumeration value="TBLCOLGP"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DocumentTableColumnStructure_X")
@XmlEnum
public enum DocumentTableColumnStructureX {

    TBLCOL,
    TBLCOLGP;

    public String value() {
        return name();
    }

    public static DocumentTableColumnStructureX fromValue(String v) {
        return valueOf(v);
    }

}
