package consoleControllers;

import entity.Document;

import static repository.DocumentsRepo.getDocument;
import static repository.DocumentsRepo.isListEmpty;

public class FindController extends AbstractController{

    public static Document findDocument() {
        if (!isListEmpty()) {
            return getting();
        } else {
            System.out.println("The list is empty.");
        }
        return null;
    }

    private static Document getting() {
        inputRegNum();
        doc = getDocument(Long.parseLong(regNum));
        if (doc != null) {
            showDocument(doc);
            return doc;
        } else {
            System.out.println("The document doesn't exist.");
        }
        return null;
    }
}
