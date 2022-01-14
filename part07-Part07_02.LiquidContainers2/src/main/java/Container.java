
public class Container {
    public int cont;
    
    public Container() {
        this.cont = 0;
    }
    
    public int contains() {
        return this.cont;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (amount + this.cont > 100) {
            this.cont = 100;
        } else {
            this.cont += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (amount > this.cont) {
            this.cont = 0;
        } else {
            this.cont -= amount;
        }
    }
    
    public String toString() {
        return (this.cont + "/100");
    }
}
