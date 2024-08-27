package uk.nhs.nia.gp2gp.schema.utility;

import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import uk.nhs.nia.gp2gp.schema.org.hl7.v3.RCMRMT030101UKCompoundStatement;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParsingUtilityTest {
    @Test
    void Given_CompoundStatementXmlString_Expect_UnmarshalledSuccessfully() throws JAXBException {
        final String xmlString = """
        <CompoundStatement classCode="CATEGORY" moodCode="EVN" xmlns="urn:hl7-org:v3">
            <id root="allergy-compound-id"/>
            <code code="14L..00" codeSystem="2.16.840.1.113883.2.1.6.2"
                  displayName="H/O: drug allergy"/>
            <statusCode code="COMPLETE"/>
            <effectiveTime>
                <center nullFlavor="NI"/>
            </effectiveTime>
            <availabilityTime value="20100113"/>
            <component typeCode="COMP" contextConductionInd="true">
                <ObservationStatement classCode="OBS" moodCode="EVN">
                    <id root="allergy-observation-id"/>
                    <code code="14LK.00" codeSystem="2.16.840.1.113883.2.1.6.2"
                          displayName="H/O: aspirin allergy">
                        <qualifier inverted="false">
                            <name code="255217005" codeSystem="2.16.840.1.113883.2.1.3.2.4.15"
                                  displayName="First"/>
                        </qualifier>
                        <translation code="395102008" codeSystem="2.16.840.1.113883.2.1.3.2.4.15"
                                     displayName="H/O: aspirin allergy"/>
                    </code>
                    <statusCode code="COMPLETE"/>
                    <effectiveTime>
                        <center nullFlavor="NI"/>
                    </effectiveTime>
                    <availabilityTime value="20100113"/>
                    <value type="CD" code="ALLERGY-READ2-14LK" codeSystem="2.16.840.1.113883.2.1.6.3"
                           displayName="H/O: aspirin allergy"/>
                    <pertinentInformation typeCode="PERT">
                        <sequenceNumber value="+1"/>
                        <pertinentAnnotation classCode="OBS" moodCode="EVN">
                            <text>Drug Allergy - Apsrin</text>
                        </pertinentAnnotation>
                    </pertinentInformation>
                </ObservationStatement>
            </component>
        </CompoundStatement>""";

        final RCMRMT030101UKCompoundStatement actual =
            ParsingUtility.unmarshallFromXmlString(xmlString, RCMRMT030101UKCompoundStatement.class);

        assertAll(
            () -> assertThat(actual.getId().getFirst().getRoot()).isEqualTo("allergy-compound-id"),
            () -> assertThat(actual.getCode().getCode()).isEqualTo("14L..00"),
            () -> assertThat(actual.getCode().getCodeSystem()).isEqualTo("2.16.840.1.113883.2.1.6.2")
        );
    }
}