
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            String[] pieces = str.split(" ");
            for (String i : pieces) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
        }

    }
}
