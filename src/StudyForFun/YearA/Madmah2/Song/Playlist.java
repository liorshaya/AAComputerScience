package StudyForFun.YearA.Madmah2.Song;

public class Playlist {
    private String name;
    public Song[] songs;

    public boolean exists(String name, String performerName){
        for (int i = 0; i < this.songs.length; i++) {
            if(this.songs[i].getName().equals(name) && this.songs[i].getPerformerName().equals(performerName)){
                return true;
            }
        }
        return false;
    }

    public String getName(){
        return this.name;
    }
}
