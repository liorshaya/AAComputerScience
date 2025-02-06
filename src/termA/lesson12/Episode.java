package termA.lesson12;

public class Episode {
    private String name;
    private int time;

    public Episode(String name, int time){
        this.name = name;
        this.time = time;
    }

    public String toString(){
        return this.name + ": " + this.time + " minutes";
    }

    public boolean isLong(){
        if(this.time > 30){
            return true;
        }
        return false;
    }

    public String getShortName(){
        if(this.name.length() > 10){
            return this.name.substring(0,10) + "...";
        }
        return this.name;
    }

    public int getTime(){
        return this.time;
    }


}
