
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nums = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) {
                nums += 1;
                sum += num;
            }
        }
        double avg = sum * 1.0 / nums;
        if (avg > 0) {
            System.out.println("Average of the numbers: " + (sum*1.0/nums));
        } else {
            System.out.println("Cannot calculate the average");
        }
        

    }
}
