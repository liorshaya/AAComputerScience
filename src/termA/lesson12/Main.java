package termA.lesson12;

public class Main {
    public static void main(String[] args) {
        Episode ep1 = new Episode("PilotPilotPilot", 20);
        Episode ep2 = new Episode("noboth", 44);
        Episode ep3 = new Episode("Gsskejnd", 33);
        Episode ep4 = new Episode("The human", 56);

        Episode[] tvShow = {ep1,ep2,ep3,ep4};

        int[] rate = {2,4,4};
        TvShow tv1 = new TvShow("Vikings","Fear",rate,18,tvShow);
        Movie mo1 = new Movie("Joker","Action",rate,8,160);
        LiveShow ls1 = new LiveShow("Uvda", "Drama",rate,12,12,5,14,59,14,50);

        tv1.addEpisode(ep4);

//        System.out.println(ep1.isLong());
//        System.out.println(ep1.getShortName());

        boolean result = tv1.isLong();
        System.out.println(result);

        int sumLengthEpisodes = tv1.calculateLength();
        System.out.println(sumLengthEpisodes);

        Episode ep = tv1.getLongestEpisode();
        System.out.println(ep);

        tv1.addScore(1);
        System.out.println(tv1);

        double avgRate = tv1.calculateAverageScore();
        System.out.println(avgRate);

        boolean isValidLength = mo1.isValidLength();
        System.out.println(isValidLength);

        boolean movieForKids = mo1.forKids();
        System.out.println(movieForKids);
        System.out.println(mo1);

        boolean isLongMovie = mo1.isLong();
        System.out.println(isLongMovie);

        int liveShowExpLength = ls1.expectedLength();
        System.out.println(liveShowExpLength + " Expected Minutes length.");

        int liveShowActualLength = ls1.actualLength();
        System.out.println(liveShowActualLength + " Actual Minutes length.");

        boolean isLongLiveShow = ls1.isLong();
        System.out.println(isLongLiveShow);
        System.out.println(ls1);


    }

}
