package consoleControllers;

import entity.Document;
import entity.Incoming;
import entity.Outgoing;
import entity.Task;
import exception.DocumentExistException;
import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

import static factory.DocumentFactory.generateDocument;
import static repository.DocumentsRepo.addDocument;
import static repository.DocumentsRepo.isDocumentHere;

public class CreateController extends AbstractController{

    private static final String MENU_OF_CREATING =
            """
            Create a document.
            Please, choose an option (input a number, then press "Enter")
            1 - Create a single document
            2 - Create 100 random documents (for the Report demonstration)
            3 - Back
            """;

    private static final String MENU_OF_TYPES =
            """
            What type of document do you wanna create?
            1 - Task
            2 - Incoming
            3 - Outgoing
            4 - Back
            """;

    public static void showDocCreateController() {
        do {
            selection = showInputMenu(MENU_OF_CREATING);

            switch (selection) {
                case "1":
                    showSingleDocController();
                    break;
                case "2":
                    createRandomDocuments();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("\nInvalid input. Please, input a number from 1 to 3 without any spaces, then press \"Enter\"\n");
            }

        } while (!selection.equals("3"));
    }



    static void showSingleDocController() {
        do {
            selection = showInputMenu(MENU_OF_TYPES);

            switch (selection) {
                case "1":
                case "2":
                case "3":
                    createSingleDocument(selection);
                    return;
                case "4":
                    break;
                default:
                    System.out.println("\nThere's no such type of document.\n");
            }

        } while (!selection.equals("4"));
    }

    public static void createSingleDocument (String selection) {
        Document newDocument = null;

        while (true) {

            switch (selection) {
                case "1" -> newDocument = generateDocument(Task.class);
                case "2" -> newDocument = generateDocument(Incoming.class);
                case "3" -> newDocument = generateDocument(Outgoing.class);
            }

            try {
                if (isDocumentHere(newDocument.getRegNum())) {
                    throw new DocumentExistException();
                } else {
                    addDocument(newDocument);
                    System.out.println("\nA document has been created.\n");
                    return;
                }
            } catch (DocumentExistException e) {}
        }
    }

    public static void createRandomDocuments () {
        for (int i = 0; i < 100; i++) {
            String randomIndex = String.valueOf(RandomUtils.nextInt(1, 3));
            createSingleDocument(randomIndex);
        }
    }
}
