package termA.lesson12;

public abstract class WatchTv {
    private String name;
    private String type;
    private int[] gradeByWatchers;
    private int minimalAge;

    public WatchTv(String name, String type, int[] gradeByWatchers, int minimalAge){
        this.name = name;
        this.type = type;
        this.gradeByWatchers = gradeByWatchers;
        this.minimalAge = minimalAge;
    }

    public String getName(){
        return this.name;
    }

    public int getMinimalAge(){
        return this.minimalAge;
    }

    public int[] getGradeByWatchers(){
        return this.gradeByWatchers;
    }

    public void addScore(int score){
        if(score >= 1 && score <= 5){
            int[] rate = new int[getGradeByWatchers().length+1];
            for (int i = 0; i < getGradeByWatchers().length; i++) {
                rate[i] = getGradeByWatchers()[i];
                rate[rate.length-1] = score;
            }
        }
    }

    public boolean forKids(){
        if(this.getMinimalAge() == 3){
            return true;
        }
        return false;
    }

    public double calculateAverageScore(){
        int sumRate = 0;
        int count = 0;
        for (int i = 0; i < getGradeByWatchers().length; i++) {
            sumRate += getGradeByWatchers()[i];
            count++;
        }
        return (double) sumRate / count;
    }

}
