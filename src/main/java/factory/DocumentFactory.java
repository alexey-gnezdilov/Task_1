package factory;

import entyties.documents.*;

public class DocumentFactory {

    public DocumentFactory() {}

    public Document generateDocument(Class clazz) {

        String docType = clazz.getSimpleName();

        return switch (docType) {
            case "Task" -> new Task(docType);
            case "Incoming" -> new Incoming(docType);
            case "Outgoing" -> new Outgoing(docType);
            default -> null;
        };
    }
}