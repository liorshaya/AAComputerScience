package StudyForFun.YearA.Ex2;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song("Hello","Addle", 23);
        Song s2 = new Song("WOW","Marco", 34);
        Song s3 = new Song("Somebody to love","Queen", 432);
        Song s4 = new Song("Bye Bye","Meni", 45);

        Song[] playlist = {s1,s2,s3,s4};
        Song[] playlist2 = {s1,s2,s4,s3};
        Playlist p1 = new Playlist("Favorite", playlist);
        Playlist p2 = new Playlist("LoL", playlist2);
         boolean result = p1.exists("WOW","Marco");
        System.out.println(result);

        Playlist[] pl = {p1 , p2};
        String result2 = longestPlaylist(pl);
        System.out.println(result2);
    }

    public static String longestPlaylist(Playlist[] playlist){
        Playlist longestPl = playlist[0];
        int lengthPl = playlist[0].lengthPlaylist();
        for (int i = 1; i < playlist.length; i++) {
            if(lengthPl < playlist[i].lengthPlaylist()){
                longestPl = playlist[i];
                lengthPl = playlist[i].lengthPlaylist();
            }
        }
        return longestPl.getName();
    }
}
