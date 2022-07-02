package ParserXML;

import javax.xml.bind.JAXBException;
import java.io.File;

public interface ParserXml {
    Object getObject(File file, Class c) throws JAXBException;
    void saveObject(File file, Object o) throws JAXBException;
}
