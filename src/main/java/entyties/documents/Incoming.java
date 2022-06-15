package entyties.documents;

import org.apache.commons.lang3.RandomUtils;
import repositories.inandout.RecipientsList;
import repositories.inandout.SendersList;

public class Incoming extends Document {

    private String sender;
    private String recipient;
    private Integer outNumber;
    private String outRegDate;

    public Incoming(String type) {
        super(type);
        sender = SendersList.sendersList.get(RandomUtils.nextInt(0,4));
        recipient = RecipientsList.recipientsList.get(RandomUtils.nextInt(0,4));
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