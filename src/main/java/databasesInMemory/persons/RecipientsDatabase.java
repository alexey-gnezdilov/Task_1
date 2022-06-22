package databasesInMemory.persons;

import java.util.ArrayList;

public class RecipientsDatabase {
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
