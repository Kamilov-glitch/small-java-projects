
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros != compared.euros) {
            return this.euros < compared.euros;
        }
        
        return this.cents < compared.cents;
    }
    
    public Money minus(Money decreaser) {
        int mon = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);
        if (mon < 0) {
            return new Money(0, 0);
        }
        return new Money(mon / 100, mon % 100);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
