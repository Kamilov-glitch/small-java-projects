import java.util.ArrayList;


public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(8);
        nums.add(9);
        System.out.println(sum(nums));;
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
