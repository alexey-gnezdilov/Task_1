/**
 * Класс "Поручения (Task)"
 */

import java.util.Date;

public class Task extends Document
{
    private Date taskIssueDate;     //дата выдачи поручения
    private Date taskExecutionTerm; //срок исполнения поручения
    private String respExecutor;    //ответственный исполнитель
    private String controlSign;     //признак контрольности
    private String taskController;  //контролёр поручения

    @Override
    public String toString()
    {
        return "Task{" +
                "taskIssueDate=" + taskIssueDate +
                ", taskExecutionTerm=" + taskExecutionTerm +
                ", respExecutor='" + respExecutor + '\'' +
                ", controlSign='" + controlSign + '\'' +
                ", taskController='" + taskController + '\'' +
                '}';
    }
}
