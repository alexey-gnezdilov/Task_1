package exceptions;

public class DocumentExistException extends Exception {
    public DocumentExistException() {
        super("The document already exists.");
    }
}
