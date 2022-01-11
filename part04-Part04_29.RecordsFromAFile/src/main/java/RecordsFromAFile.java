
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try( Scanner scan = new Scanner(Paths.get(file)) ) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                String[] pieces = row.split(",");
                int year = Integer.valueOf(pieces[1]);
                if (year == 1) {
                    System.out.println(pieces[0] + ", " + "age: " + pieces[1] + 
                        " year");
                } else {
                    System.out.println(pieces[0] + ", " + "age: " + pieces[1] + 
                        " years");
                }
                
            }
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
