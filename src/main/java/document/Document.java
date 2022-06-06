package document;

import interfaces.Storable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public abstract class Document implements Comparable<Document>, Storable
{
    private String    docName;      //название документа
    private String    id;           //идентификатор документа
    private String    docText;      //текст документа
    private Integer   docRegNum;    //регистрационный номер документа
    private LocalDate docRegDate;   //дата регистрации документа
    private String    docAuthor;    //автор документа

    public Document()
    {
        docRegDate = LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
        docText = "Рандомный текст";
    }

    public String getDocName() {return docName;}

    public void setDocName(String docName) {this.docName = docName;}

    public Integer getDocRegNum(){return docRegNum;}

    public void setDocRegNum(Integer docRegNum){this.docRegNum = docRegNum;}

    public LocalDate getDocRegDate(){return docRegDate;}

    public String getDocText(){return docText;}

    @Override
    public int compareTo(Document d)
    {
        return docName.compareTo(d.docName);
    }
}
