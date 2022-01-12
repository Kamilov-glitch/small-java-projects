import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addItem(Item item) {
        if (item.getWeight() + this.totalWeight > this.maxWeight) {
            return;
        }
        this.items.add(item);
        this.totalWeight += item.getWeight();
    }
    
    public void printItems() {
        for (Item i : this.items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item i : items) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight + " kg)";
        }
        return (this.items.size() + " items (" + this.totalWeight + " kg)"); 
    }
}
