
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RoleClassServiceDeliveryLocation_X.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="RoleClassServiceDeliveryLocation_X"&amp;gt;
 *   &amp;lt;restriction base="{urn:hl7-org:v3}cs"&amp;gt;
 *     &amp;lt;enumeration value="ISDLOC"/&amp;gt;
 *     &amp;lt;enumeration value="DSDLOC"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "RoleClassServiceDeliveryLocation_X")
@XmlEnum
public enum RoleClassServiceDeliveryLocationX {

    ISDLOC,
    DSDLOC;

    public String value() {
        return name();
    }

    public static RoleClassServiceDeliveryLocationX fromValue(String v) {
        return valueOf(v);
    }

}
