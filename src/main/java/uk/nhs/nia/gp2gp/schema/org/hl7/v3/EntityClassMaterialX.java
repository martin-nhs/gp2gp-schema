
package uk.nhs.nia.gp2gp.schema.org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EntityClassMaterial_X.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EntityClassMaterial_X"&amp;gt;
 *   &amp;lt;restriction base="{urn:hl7-org:v3}cs"&amp;gt;
 *     &amp;lt;enumeration value="FOOD"/&amp;gt;
 *     &amp;lt;enumeration value="CHEM"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EntityClassMaterial_X")
@XmlEnum
public enum EntityClassMaterialX {

    FOOD,
    CHEM;

    public String value() {
        return name();
    }

    public static EntityClassMaterialX fromValue(String v) {
        return valueOf(v);
    }

}
