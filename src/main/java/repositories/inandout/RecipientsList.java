package repositories.inandout;

import java.util.ArrayList;

public class RecipientsList {
    public static ArrayList<String> recipientsList;

    static {
        recipientsList = new ArrayList<>() {{
            add("\"ВТБ\"");
            add("\"СБЕРБАНК\"");
            add("\"АЛЬФА-БАНК\"");
            add("\"ТИНЬКОФ");
            add("\"ОТКРЫТИЕ\"");
        }};
    }
}
