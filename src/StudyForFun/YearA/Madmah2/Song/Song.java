package StudyForFun.YearA.Madmah2.Song;

public class Song {
    private String name;
    private String performerName;
    private int length;

    public Song( String performerName, int length, String name){
        this.name = name;
        this.performerName = performerName;
        this.length = length;
    }

    public String toString(){
        return this.name + "/" + this.performerName + ": " + this.length;
    }

    public String getName(){
        return this.name;
    }

    public String getPerformerName(){
        return this.performerName;
    }

    public int getLength(){
        return this.length;
    }
}
