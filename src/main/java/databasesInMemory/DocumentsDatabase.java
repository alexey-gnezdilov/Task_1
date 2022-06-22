package databasesInMemory;

import entity.Document;

import java.util.ArrayList;
import java.util.TreeSet;

public class DocumentsDatabase {

    //наплодить доков
    private static ArrayList<Document> docList;
    private static TreeSet<Integer> regNumList;

    static {
        docList = new ArrayList<>();
        regNumList = new TreeSet<>();
    }

    public static ArrayList<Document> getDocList() {
        return docList;
    }

    public static TreeSet<Integer> getRegNumList() {
        return regNumList;
    }
}
