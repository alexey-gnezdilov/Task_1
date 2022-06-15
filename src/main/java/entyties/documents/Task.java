package entyties.documents;

import org.apache.commons.lang3.RandomUtils;
import repositories.task.ControllersList;
import repositories.task.ResponsableExecutorsList;

import java.time.LocalDate;

public class Task extends Document {

    private String issueDate;
    private String executionTerm;
    private String respExecutor;
    private String controlSign;
    private String controller;

    public Task(String type) {
        super(type);
        issueDate = LocalDate.ofEpochDay(RandomUtils.nextInt(0,326)).toString();
        executionTerm = String.valueOf(RandomUtils.nextInt(0,30));
        respExecutor = ResponsableExecutorsList.respExList.get(RandomUtils.nextInt(0,4));
        controlSign = String.valueOf(RandomUtils.nextInt() % 2 == 0 ? true : false);
        controller = ControllersList.controllersList.get(RandomUtils.nextInt(0,4));
    }

    @Override
    public String toString() {
        return String.format("%s     № %s at %s %s",
                getType(),
                getRegNum(),
                getRegDate(),
                getText());
    }
}