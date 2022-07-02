package repository;

import entity.Document;
import java.util.*;

import static databasesInMemory.DocumentsDatabase.*;

public class DocumentsRepo {

    public static void addDocument(Document document) {
        getDocList().add(document);
        getRegNumList().add(document.getRegNum());
        Collections.sort(getDocList());
    }

    public static boolean removeDocument(Long regNum) {
        return getDocList().removeIf(document -> document.getRegNum().equals(regNum))
                && getRegNumList().removeIf(regNumber -> regNumber.equals(regNum));
    }

    public static ArrayList<Document> getAllDocuments() {
        return getDocList();
    }

    public static Document getDocument(Long regNum) {
        Iterator<Document> iterator = getAllDocuments().iterator();
        Document document;
        while (iterator.hasNext()) {
            document = iterator.next();
            if (document.getRegNum().equals(regNum)) {
                return document;
            }
        }
        return null;
    }

    public static boolean isDocumentHere(Long regNum) {
        return getRegNumList().contains(regNum);
    }

    public static boolean isListEmpty() {
        return getDocList().isEmpty();
    }
}
