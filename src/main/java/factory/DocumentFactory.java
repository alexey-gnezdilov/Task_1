package factory;

import document.*;
import exceptions.DocumentExistException;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Stream;

/** Фабрика по производству документов.
 * todo Стоит рассмотреть паттерн Фабрика (фабричный метод)
 * todo В java фигурная скобка открывается на той же строке, что и текст. А ты пишешь как С++ =). Почитать - Чистокод
 * */
public class DocumentFactory {
    static HashMap<Integer,Document> docList = new HashMap<>();
    int docType;
    Integer regNumInMap;
    private LocalDate docRegDate;
    private String docText;
    private String DocAuthor;

    public void createDocuments(int amount)  {
        for (int i = 0; i < amount; i++) {
            generateDocument();

            if (!docList.containsKey(regNumInMap))
            {
                switch (docType) {
                    case 1 -> docList.put(regNumInMap,
                            new Task(regNumInMap,
                                    docRegDate,
                                    docText,
                                    DocAuthor
                            )
                    );
                    case 2 -> docList.put(regNumInMap, new Incoming(regNumInMap));
                    case 3 -> docList.put(regNumInMap, new Outgoing(regNumInMap));
                }
            }
            else {
                try {
                    throw new DocumentExistException(regNumInMap);
                } catch (DocumentExistException ignored) {}
            }
        }

        docList.values().stream().sorted().forEach(System.out::println);
    }

    /** Метод генерирует входные данные документа */
    private void generateDocument(){
        docType = (int)((Math.random() * 3) + 1);
        regNumInMap = (int)((Math.random() * 100) + 5);

        docRegDate = LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
        docText = "Рандомный текст";

        DocAuthor = generateDocAuthor();
    }

    /** Метод генерирует автора документа */
    private String generateDocAuthor() {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> firstNames = new ArrayList<>(Arrays.asList("Даниил", "Максим", "Владислав", "Никита", "Артем", "Иван", "Кирилл", "Егор", "Илья", "Андрей"));
        List<String> middleNames = new ArrayList<>(Arrays.asList("Николаевич", "Владимирович", "Александрович", "Иванович", "Васильевич", "Сергеевич", "Викторович", "Михайлович", "Артемович", "Андреевич"));
        List<String> lastNames = new ArrayList<>(Arrays.asList("Иванов", "Смирнов", "Кузнецов", "Попов", "Васильев", "Петров", "Соколов", "Лазарев", "Медведев", "Ершов"));

        Stream.of(firstNames, middleNames, lastNames).forEach(Collections::shuffle);

        stringBuilder.append(String.format("%s %s %s", firstNames.get(0), middleNames.get(0), lastNames.get(0)));

        return stringBuilder.toString();
    }
}