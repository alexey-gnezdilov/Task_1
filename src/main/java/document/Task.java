package document;

import java.time.LocalDate;

 /** Task documents class */
public class Task extends Document {

//    private Date taskIssueDate;
//    private Date taskExecutionTerm;
//    private String respExecutor;
//    private String controlSign;
//    private String taskController;

    public Task(Integer docRegNum, LocalDate docRegDate, String docText, String docAuthor) {
        super();
        setDocName("Поруч");
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
