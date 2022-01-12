import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> cases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cases = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight == this.maxWeight) {
            return;
        }
        if ((this.totalWeight + suitcase.totalWeight()) > this.maxWeight) {
            return;
        }
        this.cases.add(suitcase);
        this.totalWeight += suitcase.totalWeight();
    }
    
    public void printItems() {
        for (Suitcase s : cases) {
            s.printItems();
        }
    }
    
    public String toString() {
        if (this.cases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        if (this.cases.size() == 1) {
            return "1 suitcase (" + this.totalWeight + " kg)";
        }
        return (this.cases.size() + " suitcases (" + this.totalWeight + " kg)"); 
    }
}
