package StudyForFun.YearA.Ex2;

public class Song {
    private String name;
    private String performerName;
    private int length;

    public Song(String name, String performerName, int length){
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
