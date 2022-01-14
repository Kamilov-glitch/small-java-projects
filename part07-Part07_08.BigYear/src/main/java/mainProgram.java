
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Watcher paul = new Watcher();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();
                paul.add(name, latinName);
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                paul.observation(bird);
            }
            
            if (command.equals("All")) {
                paul.all();
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                paul.one(bird);
            }
        }
    }

}
