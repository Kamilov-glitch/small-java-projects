
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if(!(obj instanceof Song)) {
            return false;
        }
        
        Song comparedObj = (Song) obj;
        if (this.artist.equals(comparedObj.artist) &&
                this.name.equals(comparedObj.name) &&
                this.durationInSeconds == comparedObj.durationInSeconds) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
