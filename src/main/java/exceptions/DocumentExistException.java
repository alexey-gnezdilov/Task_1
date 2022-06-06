package exceptions;

public class DocumentExistException extends Exception
{
    public DocumentExistException(Integer num)
    {
        super();
        System.out.println("Такой документ уже существует!!! " + num);
    }
}
