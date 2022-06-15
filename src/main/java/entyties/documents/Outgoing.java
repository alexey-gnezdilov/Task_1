package entyties.documents;

import org.apache.commons.lang3.RandomUtils;
import repositories.inandout.RecipientsList;

public class Outgoing extends Document {

    private String recipient;
    private String deliveryMethod;

    public Outgoing(String type) {
        super(type);
        recipient = RecipientsList.recipientsList.get(RandomUtils.nextInt(0,4));
        deliveryMethod = RandomUtils.nextInt() % 2 == 0 ? "byEmail" : "byPost";
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