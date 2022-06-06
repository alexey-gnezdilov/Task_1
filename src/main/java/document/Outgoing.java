package document;

public class Outgoing extends Document
{
    private String recipient;      //адресат
    private String deliveryMethod; //способ доставки

    public Outgoing(Integer docRegNum)
    {
        super();
        setDocName("Исходящий");
        setDocRegNum(docRegNum);
    }

    @Override
    public String toString()
    {
        return getDocName() + "     №" + getDocRegNum() + " от " + getDocRegDate() + " " + getDocText();
    }
}
