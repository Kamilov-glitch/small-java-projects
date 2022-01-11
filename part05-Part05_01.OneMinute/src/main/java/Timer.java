
public class Timer {
    private int second;
    private int hosecond;
    
    public Timer() {
        this.second = 0;
        this.hosecond = 0;
    }
    
    public void advance() {
        this.hosecond++;
        if (this.hosecond == 100) {
            this.second++;
            this.hosecond = 0;
        }
        if (this.second == 60) {
            this.second = 0;
        }
    }
    
    @Override
    public String toString() {
        String second = String.valueOf(this.second);
        String hosecond = String.valueOf(this.hosecond);
        if (second.length() < 2) {
            second = "0" + second;
        }
        if (hosecond.length() < 2) {
            hosecond = "0" + hosecond;
        }
        return (second + ":" + hosecond);
    }
}
