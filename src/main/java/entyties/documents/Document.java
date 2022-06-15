package entyties.documents;

import org.apache.commons.lang3.RandomUtils;
import repositories.doc.DocAuthorsList;
import services.storable.Storable;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.UUID;

public abstract class Document implements Comparable<Document>, Storable {

    private String id;
    private String type;
    private String text;
    private Integer regNum;
    private String regDate;
    private String author;

    public Document(String docType) {
        id = UUID.randomUUID().toString();
        type = docType;
        text = "Пока просто текст";
        regNum = RandomUtils.nextInt(0,200);
        regDate = LocalDate.ofEpochDay(RandomUtils.nextInt(0,326)).toString();
        author = DocAuthorsList.authorsList.get(RandomUtils.nextInt(0,19));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRegNum() {
        return regNum;
    }

    public void setRegNum(Integer regNum) {
        this.regNum = regNum;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(Document d) {
        return Comparator
                .comparing(Document::getRegNum)
                .thenComparing(Document::getRegDate)
                .compare(this, d);
    }

    @Override
    public String getID() {
        return getId();
    }

    @Override
    public void setStorageName() {

    }
}
