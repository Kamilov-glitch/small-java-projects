
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate sd = new SimpleDate(30, 12, 2021);
        System.out.println(sd);
        sd.advance(90);
        System.out.println(90);
        System.out.println(sd);
        sd.advance(29);
        System.out.println(29);
        System.out.println(sd);
        sd.monthAdvance(24);
        System.out.println(24 + "ay");
        System.out.println(sd);
        sd.monthAdvance(2);
        System.out.println(2 + "ay");
        System.out.println(sd);
        sd.advance(22);
        System.out.println("22");
        System.out.println(sd);
    }
}
