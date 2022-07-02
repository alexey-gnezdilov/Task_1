package consoleControllers;

import static repository.DocumentsRepo.isListEmpty;

public class EditController extends AbstractController{
    public static void editDocumentAuthor() {
        if (!isListEmpty()) {
            inputRegNum();
            editing();
        } else {
            System.out.println("The list is empty.");
        }
    }

    private static void editing() {
        Long regNumL = Long.parseLong(regNum);

    }
}
