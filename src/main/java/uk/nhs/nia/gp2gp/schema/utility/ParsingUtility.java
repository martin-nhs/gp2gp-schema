package uk.nhs.nia.gp2gp.schema.utility;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public final class ParsingUtility {
    private ParsingUtility() { }

    public static <T> T unmarshallFromXmlString(String xmlString, Class<T> destinationClass) throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(destinationClass);
        final Unmarshaller unmarshaller = context.createUnmarshaller();

        try(final StringReader stringReader = new StringReader(xmlString)) {
            final JAXBElement<?> jaxbElement = (JAXBElement<?>) unmarshaller.unmarshal(stringReader);
            return destinationClass.cast(jaxbElement.getValue());
        }
    }
}