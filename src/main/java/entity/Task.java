package entity;

import databasesInMemory.persons.PersonsDatabase;
import org.apache.commons.lang3.RandomUtils;

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
        respExecutor = PersonsDatabase.persons.get(RandomUtils.nextInt(0,47));
        controlSign = String.valueOf(RandomUtils.nextInt() % 2 == 0);
        controller = PersonsDatabase.persons.get(RandomUtils.nextInt(0,47));
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