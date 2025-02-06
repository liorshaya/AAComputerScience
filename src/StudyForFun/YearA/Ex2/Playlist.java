package StudyForFun.YearA.Ex2;

public class Playlist {
    private String name;
    private Song[] songs;

    public Playlist(String name, Song[] songs){
        this.name = name;
        this.songs = songs;
    }

    public boolean exists(String name,String performerName){
        for (int i = 0; i < songs.length; i++) {
            if(songs[i].getName().equals(name) && songs[i].getPerformerName().equals(performerName)){
                return true;
            }
        }
        return false;
    }

    public Song[] getSongs(){
        return this.songs;
    }

    public int lengthPlaylist(){
        int sum = 0;
        for (int i = 0; i < this.songs.length; i++) {
            sum += this.songs[i].getLength();
        }
        return sum;
    }

    public String getName(){
        return this.name;
    }
}
