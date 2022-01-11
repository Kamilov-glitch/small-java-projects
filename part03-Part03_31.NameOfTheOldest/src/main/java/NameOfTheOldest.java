
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = -5555;
        String name = "";
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] pieces = str.split(",");
            if (Integer.valueOf(pieces[1]) > biggest) {
                biggest = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);


    }
}
