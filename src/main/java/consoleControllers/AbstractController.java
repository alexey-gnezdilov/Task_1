package consoleControllers;

import entity.Document;
import java.util.Scanner;

public class AbstractController {

    static String regNum;
    static Scanner sc = new Scanner(System.in);
    static Document doc;

    static void inputRegNum() {
        do {
            System.out.print("\nInput a registration number: ");
            regNum = sc.nextLine();
        } while (isNotNumber(regNum));
    }

    static boolean isNotNumber(String regNum) {
        if (regNum.matches("^\\d+$")) {
            return false;
        }
        System.out.println("Your input is wrong. Try again.");
        return true;
    }

    static void showDocument(Document document) {
        System.out.println("\nYour document: " + document);
    }
}
