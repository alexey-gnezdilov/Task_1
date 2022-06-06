package document; /**
 * Класс "Поручения (document.Task)"
 */

public class Task extends Document
{
//    private Date taskIssueDate;     //дата выдачи поручения
//    private Date taskExecutionTerm; //срок исполнения поручения
//    private String respExecutor;    //ответственный исполнитель
//    private String controlSign;     //признак контрольности
//    private String taskController;  //контролёр поручения

    public Task(Integer docRegNum)
    {
        super();
        setDocName("Поручение");
        setDocRegNum(docRegNum);
    }

    @Override
    public String toString()
    {
        return getDocName() + "     №" + getDocRegNum() + " от " + getDocRegDate() + " " + getDocText();
    }
}
