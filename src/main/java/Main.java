import entyties.documents.Document;
import factory.DocumentFactory;
import repositories.DocList;
import repositories.DocTypeList;
import services.docservice.SortedReport;

public class Main {
    public static void main(String[] args) {

        DocumentFactory documentFactory = new DocumentFactory();

        for (int i = 0; i < 20; i++) {
            int randomTypeDocIndex = (int) ((Math.random() * 3) + 1);
            Document document = documentFactory.generateDocument(DocTypeList.docTypeList.get(randomTypeDocIndex - 1));
            DocList.getDocList().add(document);
        }

        SortedReport.toOutputReport(DocList.getDocList());
    }
}
