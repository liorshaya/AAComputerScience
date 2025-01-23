package termA.lesson12;

public class LiveShow extends WatchTv{
    private int hourStartTime;
    private int minuteStartTime;
    private int expHourEndTime;
    private int expMinuteEndTime;
    private int actualHourEndTime;
    private int actualMinuteEndTime;


    public LiveShow(String name, String type, int[] gradeByWatchers, int minimalAge, int hourStartTime, int minuteStartTime, int expHourEndTime, int expMinuteEndTime, int actualHourEndTime, int actualMinuteEndTime){
        super(name, type, gradeByWatchers, minimalAge);
        this.hourStartTime = hourStartTime;
        this.minuteStartTime = minuteStartTime;
        this.expHourEndTime = expHourEndTime;
        this.expMinuteEndTime = expMinuteEndTime;
        this.actualHourEndTime = actualHourEndTime;
        this.actualMinuteEndTime = actualMinuteEndTime;
    }

    public int expectedLength(){
        int hoursToMinutes = (this.expHourEndTime-this.hourStartTime) * 60;
        int minutes = this.expMinuteEndTime-this.minuteStartTime;
        return hoursToMinutes + minutes;
    }

    public int actualLength(){
        int hoursToMinutes = (this.actualHourEndTime-this.hourStartTime) * 60;
        int minutes = this.actualMinuteEndTime-this.minuteStartTime;
        return hoursToMinutes + minutes;
    }

    public boolean isLong(){
        if(actualLength() > expectedLength()){
            return true;
        }
        return false;
    }



}
