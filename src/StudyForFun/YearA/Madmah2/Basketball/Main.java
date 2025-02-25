package StudyForFun.YearA.Madmah2.Basketball;

public class Main {
    public static void main(String[] args) {

    }
    public static String getMaxTrippleDoubler(Basketballer[] players){
        String namePlayerMost = players[0].getName();
        int maxCount = 0;
        for (int i = 0; i < players.length ;i++) {
            int currCount = players[i].countTripleDoubler();

            if(currCount > maxCount){
                maxCount = currCount;
                namePlayerMost = players[i].getName();
            }
        }
        return namePlayerMost;
    }

}
