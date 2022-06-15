package repositories.task;

import java.util.ArrayList;

public class ResponsableExecutorsList {
    public static ArrayList<String> respExList;

    static {
        respExList = new ArrayList<>(){{
            add("Гнездилов Алексей Юрьевич");
            add("Емельянов Виктор Фёдорович");
            add("Шиверский Андрей Сергеевич");
            add("Иванова Елена Петровна");
            add("Попова Елена Геннадьевна");
        }};
    }
}
