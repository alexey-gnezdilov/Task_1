package consoleControllers;

import entity.Document;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static databasesInMemory.DocumentsDatabase.getDocList;
import static repository.DocumentsRepo.getAllDocuments;

public class ShowController {
    public static void showAllDocumentsByAthor() {
        List<Document> allDocuments = getAllDocuments();

        if (allDocuments.isEmpty()) {
            System.out.println("The list is empty.\n");
        } else {
            TreeSet<String> authorsSet = allDocuments.stream()
                    .map(Document::getAuthor)
                    .collect(Collectors.toCollection(TreeSet::new));

            for (String author : authorsSet) {
                System.out.println("-" + author);
                getDocList().stream()
                        .filter(doc -> doc.getAuthor().equals(author))
                        .forEach(doc -> System.out.println("  \u2022" + doc));
                System.out.println();
            }
        }
    }
}
