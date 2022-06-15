package repositories.task;

import java.util.ArrayList;

public class ControllersList {
    public static ArrayList<String> controllersList;

    static {
        controllersList = new ArrayList<>(){{
            add("Гнездилов Алексей Юрьевич");
            add("Емельянов Виктор Фёдорович");
            add("Шиверский Андрей Сергеевич");
            add("Иванова Елена Петровна");
            add("Попова Елена Геннадьевна");
        }};
    }
}
