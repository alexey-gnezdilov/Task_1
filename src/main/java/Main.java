import exceptions.DocumentExistException;
import factory.DocumentFactory;

public class Main {
    public static void main(String[] args) {
        //factory.DocumentFactory.createDocuments(Integer.parseInt(args[0]));
        new DocumentFactory().createDocuments(26);
    }
}
