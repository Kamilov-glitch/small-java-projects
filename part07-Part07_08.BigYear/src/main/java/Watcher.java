import java.util.ArrayList;

public class Watcher {
    private ArrayList<Bird> birds;
    
    public Watcher() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }
    
    public void observation(String bird) {
        for (Bird i : birds) {
            if (i.getName().equals(bird)) {
                i.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void all() {
        for (Bird i : birds) {
            System.out.println(i);
        }
    }
    
    public void one(String bird) {
        for (Bird i : birds) {
            if (i.getName().equals(bird)) {
                System.out.println(i);
            }
        }
    }
}
