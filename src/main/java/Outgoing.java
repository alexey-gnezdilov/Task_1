/**
 * Класс "Исходящий документ (Outgoing)"
 */

public class Outgoing extends Document
{
    private String recipient;      //адресат
    private String deliveryMethod; //способ доставки

    @Override
    public String toString()
    {
        return "Outgoing{" +
                "recipient='" + recipient + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                '}';
    }
}
