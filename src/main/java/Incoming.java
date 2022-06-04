/**
 * Класс "Входящий документ (Incoming)"
 */

import java.util.Date;

public class Incoming extends Document
{
    private String sender;    //отправитель
    private String recipient; //адресат
    private String outNumber; //исходящий номер
    private Date outRegDate;  //исходящая дата регистрации

    @Override
    public String toString()
    {
        return "Incoming{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", outNumber='" + outNumber + '\'' +
                ", outRegDate=" + outRegDate +
                '}';
    }
}
