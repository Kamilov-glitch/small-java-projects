
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(7);
        nums.add(9);
        nums.add(22);
        System.out.println("The numbers in the range [2, 4]");
        printNumbersInRange(nums, 2, 4);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= upperLimit && numbers.get(i) >= lowerLimit) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
