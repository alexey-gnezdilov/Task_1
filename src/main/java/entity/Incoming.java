package entity;

import databasesInMemory.persons.PersonsDatabase;
import org.apache.commons.lang3.RandomUtils;
import databasesInMemory.persons.RecipientsDatabase;

public class Incoming extends Document {

    private String sender;
    private String recipient;
    private Long outNumber;
    private String outRegDate;

    public Incoming(String type) {
        super(type);
        sender = PersonsDatabase.persons.get(RandomUtils.nextInt(0,47));
        recipient = RecipientsDatabase.recipientsList.get(RandomUtils.nextInt(0,4));
        outNumber = getRegNum();
        outRegDate = getRegDate();
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