
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("soz");
        strings.add("boz");
        strings.add("Doz");
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() - 1);
    }

}