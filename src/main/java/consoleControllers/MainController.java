package consoleControllers;

import java.util.Scanner;

import static consoleControllers.FindController.findDocument;
import static consoleControllers.RemoveController.deleteDocument;
import static consoleControllers.ShowController.showAllDocumentsByAthor;

public class MainController {

    private static final String MAIN =
        """
        \n
        Welcome to the Document Management System (DMS).\s
        Please, choose an option (input a number, then press "Enter")
        1 - Create
        2 - Find
        3 - Remove
        4 - Edit
        5 - Show all documents by author
        6 - Exit
        """;

    public static void showMainController() {
        String selection;

        do {
            System.out.println(MAIN);
            System.out.print("Your choice: ");
            selection = new Scanner(System.in).nextLine();

            switch (selection) {
                    case "1":
                        CreateController.showDocCreateController();
                        break;
                    case "2":
                        findDocument();
                        break;
                    case "3":
                        deleteDocument();
                        break;
                    case "4":
                        break;
                    case "5":
                        showAllDocumentsByAthor();
                        break;
                    case "6":
                        System.out.println("======Good Bye======");
                        break;
                    default:
                        System.out.println("\nInvalid input. Please, input a number from 1 to 6, then press \"Enter\"\n");
                }
        } while (!selection.equals("6"));
    }
}
