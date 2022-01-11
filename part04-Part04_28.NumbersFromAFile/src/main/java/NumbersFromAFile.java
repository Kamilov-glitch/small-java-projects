
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try( Scanner scan = new Scanner(Paths.get(file)) ) {
            while (scan.hasNextLine()) {
                int row = Integer.valueOf(scan.nextLine());
                nums.add(row);
            }
        } catch(Exception e) {
            System.out.println("Exception " + e);
        }
        
        for (int i : nums) {
            if (i >= lowerBound && i <= upperBound) {
                count++;
            }
        }
        
        System.out.println("Numbers: " + count);
    }

}
