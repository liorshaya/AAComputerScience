package StudyForFun.YearA.Madmah2.Movie;

public class Movie {
    private String name;
    private String director;
    private int duration;

    public Movie(String name, String director, int duration){
        this.name = name;
        this.director = director;
        this.duration = duration;
    }

    public String toString(){
        return "Movie " + this.name + " was directed by " + this.director;
    }

    public String getName(){
        return this.name;
    }

    public int getDuration(){
        return this.duration;
    }
}
