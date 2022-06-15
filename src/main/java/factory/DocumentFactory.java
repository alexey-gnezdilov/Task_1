package factory;

import entyties.documents.*;
import org.apache.commons.lang3.RandomUtils;
import repositories.doc.DocList;
import repositories.doc.DocTypeList;

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
    public void createDocument() {
        int randomTypeDocIndex = RandomUtils.nextInt(0,2);
        Class randomTypeDoc = DocTypeList.docTypeList.get(randomTypeDocIndex);
        DocList.addDocument(generateDocument(randomTypeDoc));
    }

    public void createDocuments() {
        for (int i = 0; i < 200; i++) {
            createDocument();
        }
        DocList.toOutputReport();
    }
}