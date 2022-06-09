package document;

import java.time.LocalDate;
import java.util.Date;

/** Incoming documents class */
public class Incoming extends Document {

    private String sender;
    private String recipient;
    private String outNumber;
    private Date outRegDate;

    public Incoming(Integer docRegNum, LocalDate docRegDate, String docText, String docAuthor) {
        super();
        setDocName("Входя");
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
