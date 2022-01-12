import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scan;
    
    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = this.scan.nextLine();
            if (input.equals("X")) {
                break;
            }
            int num = Integer.valueOf(input);
            command(num);
        }
    }
    
    public void command(int num) {
        if (num == 1) {
            this.addJoke();
        } else if (num == 2) {
            System.out.println(this.drawJoke());
        } else if (num == 3) {
            this.print();
        }
        
    }
    
    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = this.scan.nextLine();
        this.jokes.addJoke(joke);
    }
    
    public String drawJoke() {
        return this.jokes.drawJoke();
    }
    
    public void print() {
        this.jokes.printJokes();
    }
}
