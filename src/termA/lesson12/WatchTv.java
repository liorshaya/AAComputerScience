package termA.lesson12;

public abstract class WatchTv {
    private String name;
    private String type;
    private int[] gradeByWatchers;
    private int minimalAge;

    public WatchTv(String name, String type, int[] gradeByWatchers, int minimalAge){
        this.name = name;
        this.type = type;
        this.gradeByWatchers = new int[0];
        this.minimalAge = minimalAge;
    }


}
