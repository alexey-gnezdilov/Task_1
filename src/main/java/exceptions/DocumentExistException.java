package exceptions;

public class DocumentExistException extends Exception {
    public DocumentExistException(Integer num) {

        super("The document already exists. " + num);
    }
}
