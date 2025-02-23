package StudyForFun.YearA.Madmah2.Song;

public class Main {
    public static void main(String[] args) {

    }
    public static String longestPlaylist(Playlist[] playlists){
        int mostLength = 0;
        String mostLengthName = playlists[0].getName();

        for (int i = 0; i < playlists.length; i++) {
            int currLength = 0;
            for (int j = 0; j < playlists[i].songs.length; j++) {
                currLength+= playlists[i].songs[j].getLength();
            }
            if(currLength > mostLength){
                mostLength = currLength;
                mostLengthName = playlists[i].getName();
            }
        }
        return mostLengthName;
    }
}
