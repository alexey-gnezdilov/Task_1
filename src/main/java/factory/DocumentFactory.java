package factory;

import entity.Document;

public class DocumentFactory {

    public static <T extends Document> T generateDocument(Class T) {
        try {
            return (T) T.getConstructor(String.class).newInstance(T.getSimpleName());
        } catch (Exception e) {
            return null;
        }
    }
}