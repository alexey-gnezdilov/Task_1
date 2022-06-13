package factory;

import entyties.documents.*;
import repositories.DocList;
import repositories.DocTypeList;
import services.docservice.SortedReport;

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

    public void createDocuments() {

        for (int i = 0; i < 20; i++) {
            int randomTypeDocIndex = (int) ((Math.random() * 3) + 1);
            Class randomTypeDoc = DocTypeList.docTypeList.get(randomTypeDocIndex - 1);
            DocList.addDocument(generateDocument(randomTypeDoc));
        }

        SortedReport.toOutputReport(DocList.getDocList());
    }
}