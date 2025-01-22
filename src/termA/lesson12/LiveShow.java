package termA.lesson12;

public class LiveShow extends WatchTv{
    private String startTime;
    private String endTime;

    public LiveShow(String name, String type, int[] gradeByWatchers, int minimalAge, String startTime, String endTime){
        super(name, type, gradeByWatchers, minimalAge);
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
