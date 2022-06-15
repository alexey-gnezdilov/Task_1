package factory;

import entyties.documents.*;
import exceptions.DocumentExistException;
import org.apache.commons.lang3.RandomUtils;
import repositories.DocList;
import repositories.DocTypeList;

public class DocumentFactory {

    public Document generateDocument(Class clazz) {
        String docType = clazz.getSimpleName();
        return switch (docType) {
            case "Task" -> new Task(docType);
            case "Incoming" -> new Incoming(docType);
            case "Outgoing" -> new Outgoing(docType);
            default -> null;
        };
    }


    public void createDocuments() throws DocumentExistException {
        for (int i = 0; i < 20; i++) {
            int randomTypeDocIndex = RandomUtils.nextInt(0,2);
            Class randomTypeDoc = DocTypeList.docTypeList.get(randomTypeDocIndex);
            DocList.addDocument(generateDocument(randomTypeDoc));
        }
        DocList.toOutputReport();
    }
}