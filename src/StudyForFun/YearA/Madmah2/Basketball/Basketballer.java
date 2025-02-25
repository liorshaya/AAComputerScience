package StudyForFun.YearA.Madmah2.Basketball;

public class Basketballer {
    private String name;
    private int[] points;
    private int[] rebounds;
    private int[] assists;

    public int countDoubleDouble(){
        int count = 0;
        for (int i = 0; i < this.points.length; i++) {
            int checkerCounter = 0;
            if(this.points[i] > 9 && this.points[i] < 100){
                checkerCounter++;
            }
            if(this.rebounds[i] > 9 && this.rebounds[i] < 100){
                checkerCounter++;
            }
            if(this.assists[i] > 9 && this.assists[i] < 100){
                checkerCounter++;
            }
            if(checkerCounter >= 2){
                count++;
            }
        }
        return count;
    }

    public String getName(){
        return this.name;
    }

    public int countTripleDoubler(){
        int count = 0;
        for (int i = 0; i < this.points.length; i++) {
            int checkerCounter = 0;
            if(this.points[i] > 9 && this.points[i] < 100){
                checkerCounter++;
            }
            if(this.rebounds[i] > 9 && this.rebounds[i] < 100){
                checkerCounter++;
            }
            if(this.assists[i] > 9 && this.assists[i] < 100){
                checkerCounter++;
            }
            if(checkerCounter == 3){
                count++;
            }
        }
        return count;
    }


}
