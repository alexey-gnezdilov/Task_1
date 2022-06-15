package repositories;

import java.util.*;
import java.util.stream.Stream;

public class DocAuthors {

    public static ArrayList<String> authorsList;

    static {
        authorsList = new ArrayList<>(){{
            for (int i = 0; i < 20; i++) {
                add(generateRandomAuthor());
            }
        }};
    }

    static String generateRandomAuthor() {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> firstNames = new ArrayList<>(Arrays.asList("Даниил", "Максим", "Владислав", "Алексей", "Пётр"));
        List<String> middleNames = new ArrayList<>(Arrays.asList("Николаевич", "Владимирович", "Александрович"));
        List<String> lastNames = new ArrayList<>(Arrays.asList("Иванов", "Смирнов", "Сидоров", "Меньшов"));
        Stream.of(firstNames, middleNames, lastNames).forEach(Collections::shuffle);
        stringBuilder.append(String.format("%s %s %s", lastNames.get(0), firstNames.get(0), middleNames.get(0)));
        return stringBuilder.toString();
    }
}
