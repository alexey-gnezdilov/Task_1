package repositories.doc;

import entyties.documents.Document;
import exceptions.DocumentExistException;
import org.apache.commons.lang3.RandomUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DocList {

    private static ArrayList<Document> docList;
    private static ArrayList<Integer> regNumList;
    private static TreeSet<String> authorsSet;

    static {
        docList = new ArrayList<>();
        regNumList = new ArrayList<>();
    }

    public static ArrayList<Document> getDocList() {
        return docList;
    }

    public static void addDocument(Document document) {
        while (true) {
            try {
                if(!regNumList.contains(document.getRegNum())) {
                    docList.add(document);
                    regNumList.add(document.getRegNum());
                    Collections.sort(docList);
                    break;
                } else {
                    throw new DocumentExistException();
                }
            } catch (DocumentExistException e) {
                document.setRegNum(RandomUtils.nextInt(0,3500));
                System.out.println("A new RegNum has created.");
            }
        }
    }

    public static void toOutputReport(){
        authorsSet = docList.stream()
                .map(Document::getAuthor)
                .collect(Collectors.toCollection(TreeSet::new));

        for (String author : authorsSet) {
            System.out.println("-" + author);
            docList.stream()
                    .filter(doc -> doc.getAuthor().equals(author))
                    .forEach(doc -> System.out.println("  \u2022" + doc));
        }
    }
}
