import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = list.get(0);
        for (Person i : list) {
            if (i.getHeight() < shortest.getHeight()) {
                shortest = i;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        Person shorty = this.shortest();
        list.remove(this.shortest());
        return shorty;
    }
}
