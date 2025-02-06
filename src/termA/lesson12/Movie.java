package termA.lesson12;

public class Movie extends WatchTv{
    private int time;

    public Movie(String name, String type, int[] gradeByWatchers, int minimalAge , int time){
        super(name,type,gradeByWatchers,minimalAge);
        this.time = time;
    }

    public boolean isValidLength(){
        if(this.time >= 90 && this.time <= 210){
            return true;
        }
        return false;
    }


    public String toString(){
        String forKids = "";
        if(forKids()){
            forKids = " and the movie is for kids.";
        }
        else{
            forKids = " and the movie is not for kids.";
        }
        return getName() + ": " + this.time + " minutes length" + forKids;
    }

    public boolean isLong(){
        if(!forKids()){
            if(this.time > 150){
                return true;
            }
        }
        else {
            if(this.time > 100){
                return true;
            }
        }
        return false;
    }


}
