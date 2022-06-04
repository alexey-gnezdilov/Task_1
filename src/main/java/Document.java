import java.util.Date;

public abstract class Document implements Comparable, Storable
{
    private String id;        //идентификатор документа
    private String docName;   //название документа
    private String docText;   //текст документа
    private String docRegNum; //регистрационный номер документа
    private Date docRegDate;  //дата регистрации документа
    private String docAuthor; //автор документа
}
