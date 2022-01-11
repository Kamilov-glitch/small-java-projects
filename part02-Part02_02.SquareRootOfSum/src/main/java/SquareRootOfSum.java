
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("gib two nums");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        double sqroot = Math.sqrt(first + second);
        System.out.println(sqroot);
    }
}
