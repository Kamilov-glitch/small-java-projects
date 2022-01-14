
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(7);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
  
}
