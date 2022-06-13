package entyties.documents;

import exceptions.DocumentExistException;

public class Incoming extends Document {

    private String sender;
    private String recipient;
    private String outNumber;
    private String outRegDate;

    public Incoming(String type) {
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