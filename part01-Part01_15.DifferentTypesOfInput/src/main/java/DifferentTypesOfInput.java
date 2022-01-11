
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double numd = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + numd);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
