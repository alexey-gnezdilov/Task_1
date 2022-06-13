package repositories;

import entyties.documents.Document;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Collectors;

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

    public static void toOutputReport(){

        TreeSet<String> authorsSet = docList.stream().map(Document::getAuthor).collect(Collectors.toCollection(TreeSet::new));

        for (String author : authorsSet) {
            System.out.println("-" + author);
            TreeSet<Document> docsByAuthor = docList.stream().filter(document -> document.getAuthor().equals(author)).collect(Collectors.toCollection(TreeSet::new));
            docsByAuthor.forEach(document -> System.out.println("  \u2022" + document));
            System.out.println();
        }
    }
}
