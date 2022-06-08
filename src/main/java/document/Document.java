package document;

import interfaces.Storable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.Random;

/** Класс предназначен для хранения документов */
public abstract class Document implements Comparable<Document>, Storable
{
    private String    docName;      //название документа
    private String    id;           //идентификатор документа
    private String    docText;      //текст документа
    private Integer   docRegNum;    //регистрационный номер документа
    private LocalDate docRegDate;   //дата регистрации документа
    private String    docAuthor;    //автор документа

    public Document() {}

    public void setDocText(String docText) {
        this.docText = docText;
    }

    public void setDocRegDate(LocalDate docRegDate) {
        this.docRegDate = docRegDate;
    }

    public String getDocAuthor() {
        return docAuthor;
    }

    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return Comparator
                .comparing(Document::getDocRegNum)
                //.thenComparing(Document::getDocRegDate)
                .compare(this, d);
    }
}
