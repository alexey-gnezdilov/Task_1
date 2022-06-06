package document;

import java.util.Date;

public class Incoming extends Document
{
    private String sender;    //отправитель
    private String recipient; //адресат
    private String outNumber; //исходящий номер
    private Date outRegDate;  //исходящая дата регистрации

    public Incoming(Integer docRegNum)
    {
        super();
        setDocName("Входящий");
        setDocRegNum(docRegNum);
    }

    @Override
    public String toString()
    {
        return getDocName() + "     №" + getDocRegNum() + " от " + getDocRegDate() + " " + getDocText();
    }
}
