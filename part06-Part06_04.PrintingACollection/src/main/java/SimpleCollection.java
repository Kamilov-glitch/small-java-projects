
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String toOutput  = "";
        for (String i : elements) {
            if (elements.size() == 1) {
                toOutput = toOutput + i;
            } else {
                toOutput = toOutput + i + "\n";
            }
            
        }
        String sOrNoS = "";
        if (this.elements.size() == 1) {
            sOrNoS = "element:";
        } else {
            sOrNoS = "elements:";
        }
        return "The collection " + this.name + " has " + this.elements.size() +
                " " + sOrNoS + "\n" + toOutput;
    }
    
}
