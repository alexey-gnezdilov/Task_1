package document;

import interfaces.Storable;
import java.time.LocalDate;
import java.util.Comparator;

/** Documents storing main abstract class */
public abstract class Document implements Comparable<Document>, Storable {

    private String    id;
    private String    docName;
    private String    docText;
    private Integer   docRegNum;
    private LocalDate docRegDate;
    private String    docAuthor;

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
    public int compareTo(Document d) {
        return Comparator
                .comparing(Document::getDocRegNum)
                //.thenComparing(Document::getDocRegDate)
                .compare(this, d);
    }
}
