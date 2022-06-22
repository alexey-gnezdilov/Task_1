package repositories;

import databasesInMemory.DocumentsDatabase;
import entity.Document;
import exception.DocumentExistException;
import org.apache.commons.lang3.RandomUtils;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public interface DocumentsRepo {

    //Adding
    static void addDocument(Document document) {
        while (true) {
            try {
                if (!DocumentsDatabase.getRegNumList().contains(document.getRegNum())) {
                    DocumentsDatabase.getDocList().add(document);
                    DocumentsDatabase.getRegNumList().add(document.getRegNum());
                    Collections.sort(DocumentsDatabase.getDocList());
                    break;
                } else {
                    throw new DocumentExistException();
                }
            } catch (Exception e) {
                document.setRegNum(RandomUtils.nextInt(0, 3500));
            }
        }

    }

    //Searching
    static boolean searchAndWatchDocument(Document document) {
        boolean isHere = false;
        if (DocumentsDatabase.getRegNumList().contains(document.getRegNum())) {
            System.out.println(document);
            isHere = true;
        } else {
            System.out.println("The documents doesn't exist. Try to input another registration number");
        }
        return isHere;
    }

    //Getting all documents by an author
    static void getAllDocuments(List<Document> list) {
        TreeSet<String> authorsSet = list.stream()
                .map(Document::getAuthor)
                .collect(Collectors.toCollection(TreeSet::new));

        for (String author : authorsSet) {
            System.out.println("-" + author);
            list.stream()
                    .filter(doc -> doc.getAuthor().equals(author))
                    .forEach(doc -> System.out.println("  \u2022" + doc));
            System.out.println();
        }
    }

    //Removing
    static void removeDocument(Document document) {
        DocumentsDatabase.getDocList().remove(document);
    }
}
