package entyties.documents;

import exceptions.DocumentExistException;

public class Task extends Document {

    private String issueDate;
    private String executionDate;
    private String respExecutor;
    private String controlSign;
    private String controller;

    public Task(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return String.format("%s № %s at %s %s",
                getType(),
                getRegNum(),
                getRegDate(),
                getText());
    }
}