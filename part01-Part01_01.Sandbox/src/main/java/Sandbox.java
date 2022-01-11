
import java.util.Scanner;
//import java.util.ArrayList;
import java.time.LocalDate;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String buba = "buba";
        char b = buba.charAt(0);
        Person ada = new Person("ada");
        System.out.println(ada);
        System.out.println(ada.ad());
        System.out.println(ada.yash());
        dida(82812);
        System.out.println(dida(82812));
        LocalDate date = LocalDate.now();
        System.out.println(date.getMonth());
    }
    
    public static long dida(int a) {
        return a;
    }
}
