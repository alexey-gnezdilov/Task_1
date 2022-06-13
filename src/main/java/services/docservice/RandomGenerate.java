package services.docservice;

import exceptions.DocumentExistException;
import repositories.RegNumList;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Stream;

public interface RandomGenerate {

    static String generateRandomID() {
        int randomID = (int) ((Math.random() * 50000) + 1);
        return Integer.toString(randomID);

    }

    static Integer generateRandomRegNumber() {
        Integer regNum = 0;

        while (true) {

            int randomRegNum = (int) ((Math.random() * 100) + 5);

            if (RegNumList.regNumList.contains(randomRegNum)){
                try {
                    throw new DocumentExistException(randomRegNum);
                } catch (Exception e) {
                    System.out.println("Document already exists. \n");
                    continue;
                }
            } else {
                regNum = randomRegNum;
                RegNumList.regNumList.add(randomRegNum);
                break;
            }
        }

        return regNum;
    }

    static String generateRandomRegDate() {
        String randomRegDate = LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70)))).toString();
        return randomRegDate;
    }

    static String generateRandomAuthor() {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> firstNames = new ArrayList<>(Arrays.asList("Даниил", "Максим", "Владислав"));
        List<String> middleNames = new ArrayList<>(Arrays.asList("Николаевич", "Владимирович", "Александрович"));
        List<String> lastNames = new ArrayList<>(Arrays.asList("Иванов", "Смирнов"));
        Stream.of(firstNames, middleNames, lastNames).forEach(Collections::shuffle);
        stringBuilder.append(String.format("%s %s %s", lastNames.get(0), firstNames.get(0), middleNames.get(0)));
        return stringBuilder.toString();
    }
}
