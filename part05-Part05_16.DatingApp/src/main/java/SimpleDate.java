
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void monthAdvance(int howManyMonths) {
        int years = howManyMonths / 12;
        int months = howManyMonths % 12;
        if ((this.month + months) < 12) {
            this.month += months;
        } else {
            this.month = months - (12 - this.month);
            years += 1;
        }
        this.year += years;
    }
    
    public void advance() {
        if (this.day < 30) {
            this.day+=1;
        } else {
            this.day = 1;
            if (this.month < 12) {
                this.month += 1;
            } else {
                this.month = 1;
                this.year += 1;
            }
        }
    }
    
    public void advance(int howManyDays) {
        int months = howManyDays / 30;
        int days = howManyDays % 30;
        if ((this.day + days) <= 30) {
            this.day += days;
        } else {
            this.day = days - (30 - this.day);
            months += 1;
        }
        
        if (months > 0) {
            monthAdvance(months);
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
