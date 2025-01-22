package termA.lesson12;

public class TvShow extends WatchTv{
    private Episode[] episodes;

    public TvShow(String name, String type, int[] gradeByWatchers, int minimalAge , Episode[] episodes){
        super(name, type, gradeByWatchers, minimalAge);
        this.episodes = new Episode[0];
    }

//    public String toString(){
//
//    }




}
