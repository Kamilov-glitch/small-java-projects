
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            nums.add(input);
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Average: " + (sum/nums.size()));
        
    }
}
