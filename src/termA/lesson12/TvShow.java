package termA.lesson12;

public class TvShow extends WatchTv{
    private Episode[] episodes;

    public TvShow(String name, String type, int[] gradeByWatchers, int minimalAge , Episode[] episodes){
        super(name, type, gradeByWatchers, minimalAge);
        this.episodes = episodes;
    }

    public String toString(){
        return this.getName() + ": " + this.episodes.length + " episodes.";
    }

    public void addEpisode(Episode toAdd){
        Episode[] array = new Episode[this.episodes.length+1];
        for (int i = 0; i < this.episodes.length; i++) {
            array[i] = this.episodes[i];
        }
        array[this.episodes.length] = toAdd;
    }

    public boolean isLong(){
        int count = 0;
        for (int i = 0; i < this.episodes.length; i++) {
            if(episodes[i].isLong()){
                count++;
            }
        }
        int countAllEpisodes = this.episodes.length;
        if(countAllEpisodes / 2 < count){
            return true;
        }
        return false;
    }

    public int  calculateLength(){
        int sumEpisodesLength = 0;
        for (int i = 0; i < this.episodes.length; i++) {
            sumEpisodesLength += this.episodes[i].getTime();
        }
        return sumEpisodesLength;
    }

    public Episode getLongestEpisode(){
        if(this.episodes.length == 0){
            return null;
        }

        int longestEpisode = this.episodes[0].getTime();
        Episode episode = this.episodes[0];
        for (int i = 1; i < this.episodes.length; i++) {
            if(longestEpisode < this.episodes[i].getTime()){
                longestEpisode = this.episodes[i].getTime();
                episode = this.episodes[i];
            }
        }
        return episode;
    }


}
