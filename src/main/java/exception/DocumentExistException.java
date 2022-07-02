package exception;

public class DocumentExistException extends Exception {
    public DocumentExistException() {
        System.out.println("The document already exists. Try to create another document.");
    }
}
