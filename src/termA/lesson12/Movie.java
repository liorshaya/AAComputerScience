package termA.lesson12;

public class Movie extends WatchTv{
    private int time;

    public Movie(String name, String type, int[] gradeByWatchers, int minimalAge , int time){
        super(name,type,gradeByWatchers,minimalAge);
        this.time = time;
    }
}
