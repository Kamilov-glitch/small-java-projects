import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title:");
            String title = scan.nextLine();
            
            if (title.length() == 0) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scan.nextLine());
            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String what = scan.nextLine();
        if (what.equals("everything")) {
            for (Book i : books) {
                System.out.println(i);
            }
        } else if (what.equals("name")) {
            for (Book i : books) {
                System.out.println(i.getName());
            }
        }
    }
}
