
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = -5555;
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] pieces = str.split(",");
            if (Integer.valueOf(pieces[1]) > biggest) {
                biggest = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + biggest);

    }
}
