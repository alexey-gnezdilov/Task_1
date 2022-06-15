import exceptions.DocumentExistException;
import factory.DocumentFactory;

public class Main {
    public static void main(String[] args) throws DocumentExistException {
        new DocumentFactory().createDocuments();
    }
}
