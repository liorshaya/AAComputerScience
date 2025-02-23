package StudyForFun.YearA.Madmah2.Movie;

public class Libery {
    private String name;
    private Movie[] movies;

    public boolean addMovie(Movie movie){

        for (int i = 0; i < this.movies.length; i++) {
            if(this.movies[i].getName().equals(movie.getName())){
                return false;
            }
        }

        Movie[] newArray = new Movie[this.movies.length+1];
        for (int i = 0; i < this.movies.length; i++) {
            newArray[i] = this.movies[i];
        }
        newArray[this.movies.length] = movie;
        this.movies = newArray;

        return true;
    }

    public int longestMovie(){
        if(this.movies == null || this.movies.length == 0){
            return 0;
        }
        int mostLongest = movies[0].getDuration();

        for (int i = 0; i < this.movies.length; i++) {
            if(this.movies[i].getDuration() > mostLongest){
                mostLongest = this.movies[i].getDuration();
            }
        }
        return mostLongest;
    }
}
