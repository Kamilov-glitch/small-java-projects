
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int nums = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            sum += num;
            nums += 1;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + nums);
        System.out.println("Average: " + (sum * 1.0 / nums));
        System.out.println("Even: " + even);
        System.out.println("Odd " + odd);
        
    }
}
