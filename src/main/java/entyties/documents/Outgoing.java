package entyties.documents;

public class Outgoing extends Document {

    private String recipient;
    private String deliveryMethod;

    public Outgoing(String type) {
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