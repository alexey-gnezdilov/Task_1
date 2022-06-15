package repositories.inandout;

import java.util.ArrayList;

public class SendersList {
    public static ArrayList<String> sendersList;

    static {
        sendersList = new ArrayList<>(){{
            add("ООО \"РЖД\"");
            add("ПАО \"ОТЕЛЬ ПЛАЗА\"");
            add("ЗАО \"МЕТОД\"");
            add("ООО \"МАКДОНАЛЬДС");
            add("ООО \"ЭКСПРЕСС\"");
        }};
    }
}
