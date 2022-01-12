import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dikt;
    public TextUI(Scanner scanner, SimpleDictionary dikt) {
        this.scan = scanner;
        this.dikt = dikt;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scan.nextLine();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scan.nextLine();
                System.out.println("Translation:");
                String tr = this.scan.nextLine();
                this.dikt.add(word, tr);
                continue;
            }
            if (command.equals("search")) {
                System.out.println("To be translated:");
                String toTr = this.scan.nextLine();
                System.out.println("Translation:");
                if (this.dikt.translate(toTr) == null) {
                    System.out.println("Word " + toTr + " was not found");
                    continue;
                }
                System.out.println(this.dikt.translate(toTr));
                continue;
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }
}
