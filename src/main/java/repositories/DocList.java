package repositories;

import entyties.documents.Document;
import java.util.ArrayList;

public class DocList {

    private static ArrayList<Document> docList;

    static {
        docList = new ArrayList<>();
    }

    public static ArrayList<Document> getDocList() {
        return docList;
    }

    public static void addDocument(Document document) {
        docList.add(document);
    }
}
