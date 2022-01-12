import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scan.nextLine();
            if (command.equals("stop")) {
                break;
            }
            this.command(command);
        }
    }
    
    public void command(String command) {
        if (command.equals("add")) {
            System.out.println("To add:");
            String task = this.scan.nextLine();
            this.add(task);
        } else if (command.equals("list")) {
            this.print();
        } else if (command.equals("remove")) {
            System.out.println("Which one is removed?");
            int index = this.scan.nextInt();
            this.remove(index);
        }
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        this.list.print();
    }
    
    public void remove(int index) {
        this.list.remove(index);
    }
}
