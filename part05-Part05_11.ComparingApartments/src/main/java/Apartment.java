
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int price() {
        return this.princePerSquare * this.squares;
    }
    
    public int priceDifference(Apartment compared) {
        if ( this.moreExpensiveThan(compared) ) {
            return this.price() - compared.price();
        }
        return compared.price() - this.price();
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price() > compared.price()) {
            return true;
        }
        return false;
    }

}
