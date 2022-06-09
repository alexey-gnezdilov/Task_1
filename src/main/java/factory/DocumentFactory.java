package factory;

import document.*;
import exceptions.DocumentExistException;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Document creation factory.
 * todo Стоит рассмотреть паттерн Фабрика (фабричный метод)
 * todo В java фигурная скобка открывается на той же строке, что и текст. А ты пишешь как С++ =). Почитать - Чистокод
 * */
public class DocumentFactory {
    static HashMap<Integer,Document> docList = new HashMap<>();
    static Map<String, List<Document>> docsByAuthor;
    int docType;
    Integer regNumInMap;
    private LocalDate docRegDate;
    private String docText;
    private String DocAuthor;

    public void createDocuments(int amount)  {
        for (int i = 0; i < amount; i++) {
            generateDocument();

            if (!docList.containsKey(regNumInMap)) {
                switch (docType) {
                    case 1 -> docList.put(regNumInMap, new Task(regNumInMap, docRegDate, docText, DocAuthor));
                    case 2 -> docList.put(regNumInMap, new Incoming(regNumInMap, docRegDate, docText, DocAuthor));
                    case 3 -> docList.put(regNumInMap, new Outgoing(regNumInMap, docRegDate, docText, DocAuthor));
                }
            }
            else {
                try {
                    throw new DocumentExistException(regNumInMap);
                } catch (DocumentExistException ignored) {}
            }
        }

        docsByAuthor = docList
                .values()
                .stream()
                .sorted(Comparator.comparing(Document::getDocName).thenComparingInt(Document::getDocRegNum))
                .collect(Collectors.groupingBy(Document::getDocAuthor));

        Map<String, List<Document>> treeMap = new TreeMap<>(docsByAuthor);

        for (Map.Entry<String, List<Document>> item : treeMap.entrySet()){
            System.out.println(item.getKey());
            for (Document document : item.getValue()){
                System.out.println("  " + document);
            }
            System.out.println();
        }


    }

    /** Method generates document data */
    private void generateDocument(){
        docType = (int)((Math.random() * 3) + 1);
        regNumInMap = (int)((Math.random() * 100) + 5);
        docRegDate = LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
        docText = "Рандомный текст";
        DocAuthor = generateDocAuthor();
    }

    /** Method generate document author */
    private String generateDocAuthor() {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> firstNames = new ArrayList<>(Arrays.asList("Даниил", "Максим", "Владислав"));
        List<String> middleNames = new ArrayList<>(Arrays.asList("Николаевич", "Владимирович", "Александрович"));
        List<String> lastNames = new ArrayList<>(Arrays.asList("Иванов", "Смирнов"));

        Stream.of(firstNames, middleNames, lastNames).forEach(Collections::shuffle);

        stringBuilder.append(String.format("%s %s %s", lastNames.get(0), firstNames.get(0), middleNames.get(0)));

        return stringBuilder.toString();
    }
}