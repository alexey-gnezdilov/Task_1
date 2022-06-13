package services.docservice;

import entyties.documents.Document;
import java.util.*;
import java.util.stream.Collectors;

public interface SortedReport {

    static void toOutputReport(ArrayList<Document> docList){

       TreeSet<String> authorsSet = docList.stream().map(Document::getAuthor).collect(Collectors.toCollection(TreeSet::new));

        for (String author : authorsSet) {
            System.out.println(author);
            TreeSet<Document> docsByAuthor = docList.stream()
                                                    .filter(document -> document.getAuthor().equals(author))
                                                    .collect(Collectors.toCollection(TreeSet::new));
            docsByAuthor.forEach(document -> System.out.println("\u2022" + document));
            System.out.println();
        }
    }
}
