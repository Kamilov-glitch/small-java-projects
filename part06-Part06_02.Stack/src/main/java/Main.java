
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        Stack b = new Stack();
        b.add("1");
        b.add("2");
        b.add("3");
        b.add("4");
        b.add("5");

        while (!b.isEmpty()) {
            System.out.println(b.take());
        }

    }
}
