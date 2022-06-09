package document;

import java.time.LocalDate;

/** Outgoing documents class */
public class Outgoing extends Document {

    private String recipient;
    private String deliveryMethod;

    public Outgoing(Integer docRegNum, LocalDate docRegDate, String docText, String docAuthor) {
        super();
        setDocName("Исход");
        setDocRegNum(docRegNum);
        setDocRegDate(docRegDate);
        setDocText(docText);
        setDocAuthor(docAuthor);
    }

    @Override
    public String toString() {
        return getDocName() + "     №" + getDocRegNum() + " от " + getDocRegDate() + " " + getDocText();
    }
}
