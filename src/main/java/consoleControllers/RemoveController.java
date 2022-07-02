package consoleControllers;

import static repository.DocumentsRepo.removeDocument;
import static repository.DocumentsRepo.isListEmpty;

public class RemoveController extends AbstractController{

    public static void deleteDocument() {
        if (!isListEmpty()) {
            inputRegNum();
            removing();
        } else {
            System.out.println("The list is empty.");
        }
    }

    private static void removing() {
        Long regNumL = Long.parseLong(regNum);
        if (removeDocument(regNumL)) {
            System.out.println("The document has been deleted successfully.");
        } else {
            System.out.println("The document doesn't exist.");
        }
    }
}
