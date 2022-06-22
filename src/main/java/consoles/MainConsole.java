package consoles;

import java.io.Console;

public class MainConsole {
    Console console = System.console();

    String main = "\nWelcome to the Document Management System (DMS). \n" +
            "Please, choose an option (input a number, then press \"Enter\")\n" +
            "1 - Create\n" +
            "2 - Find\n" +
            "3 - Remove\n" +
            "4 - Edit\n" +
            "5 - Show the Report\n" +
            "6 - Exit\n";
//======================================Create menu text==========================================================
    String create = "\nCreate a document. \n" +
            "Please, choose an option (input a number, then press \"Enter\")\n" +
            "1 - Create a single document\n" +
            "2 - Create 100 random documents (for the Report demonstration)\n" +
            "3 - Back\n";

    String kind = "\nWhat type of document do you wanna create?\n" +
            "1 - Task\n" +
            "2 - Incoming\n" +
            "3 - Outgoing\n" +
            "4 - Back\n";

    String selection = "0";

    public MainConsole() {

        do {
            if (console != null) {
                console.writer().println(main);
                System.out.print("Your choice: ");
                selection = console.readLine();
                switch (selection) {
                    case "1":
                        do {
                            console.writer().println(create);
                            System.out.print("Your choice: ");
                            selection = console.readLine();
                            switch (selection) {
                                case "1":
                                    do {
                                        console.writer().println(kind);
                                        System.out.print("Your choice: ");
                                        selection = console.readLine();
                                        switch (selection) {
                                            case "1":
                                            case "2":
                                            case "3":
                                                //создать док
                                                break;
                                            case "4":
                                                break;
                                            default:
                                                System.out.println("Invalit input. Input a number from 1 to 4");
                                        }
                                    } while (!selection.equals("4"));
                                    break;
                                case "2":
                                    //создать 100 рандомных доков, показать по ним отчёт
                                    //выйти в главное меню
                                    break;
                                case "3":
                                    break;
                                default:
                                    console.writer().println("\nInvalid input. Please, input a number from 1 to 3, then press \"Enter\"\n");
                            }
                        } while (!selection.equals("3"));
                        selection = "0";
                        break;
                    case "2":
                        //Find a document
                        break;
                    case "3":
                        //Fina a document
                        break;
                    case "4":
                        //Fina a document
                        break;
                    case "5":
                        //Fina a document
                        break;
                    case "6":
                        console.writer().println("======Good Bye======");
                        break;
                    default:
                        console.writer().println("\nInvalid input. Please, input a number from 1 to 6, then press \"Enter\"\n");
                }

            } else {
                System.out.println("We don't have any console.");
            }
        } while (!selection.equals("6"));
    }
}
