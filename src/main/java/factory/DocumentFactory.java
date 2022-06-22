package factory;

import entity.Document;

public class DocumentFactory {

    public DocumentFactory(Class T) {
        generateDocument(T);
    }

    public <T extends Document> T generateDocument(Class T) {
        try {
            return (T) T.getConstructor().newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}