
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = -5555;
        String name = "";
        int sum = 0;
        int count = 0;
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] pieces = str.split(",");
            count++;
            sum += Integer.valueOf(pieces[1]);
            if (Integer.valueOf(pieces[0].length()) > biggest) {
                biggest = pieces[0].length();
                name = pieces[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (sum*1.0/count));


    }
}
