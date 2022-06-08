package document;

import java.time.LocalDate;

/**
 * Класс "Поручения (document.Task)"
 */

public class Task extends Document
{
//    private Date taskIssueDate;     //дата выдачи поручения
//    private Date taskExecutionTerm; //срок исполнения поручения
//    private String respExecutor;    //ответственный исполнитель
//    private String controlSign;     //признак контрольности
//    private String taskController;  //контролёр поручения

    public Task(Integer docRegNum, LocalDate docRegDate, String docText, String DocAuthor) {
        super();

        setDocName("Поруч");
        setDocRegNum(docRegNum);
        setDocRegDate(docRegDate);
        setDocText(docText);
        setDocAuthor(DocAuthor);
    }

    @Override
    public String toString() {
        return getDocAuthor() + ":\n" +
                getDocName() + "     №" + getDocRegNum() + " от " + getDocRegDate() + " " + getDocText() + "\n";
    }
}
