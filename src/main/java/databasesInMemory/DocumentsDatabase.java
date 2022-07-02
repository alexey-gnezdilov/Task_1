package databasesInMemory;

import entity.Document;
import java.util.ArrayList;
import java.util.TreeSet;

public class DocumentsDatabase {

    private static ArrayList<Document> docList;
    private static TreeSet<Long> regNumList;

    static {
        docList = new ArrayList<>();
        regNumList = new TreeSet<>();
    }

    public static ArrayList<Document> getDocList() {
        return docList;
    }

    public static TreeSet<Long> getRegNumList() {
        return regNumList;
    }
}
