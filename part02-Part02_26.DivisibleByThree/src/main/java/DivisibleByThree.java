
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("gib two nums");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        divisibleByThreeInRange(num1, num2);

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
    }

}
