package StudyForFun.YearA.Madmah2.Trangle;

public class Traingle {
    private int zavitA;
    private int zavitB;
    private int zavitC;

    public Traingle(int zavitA , int zavitB){
        this.zavitA = zavitA;
        this.zavitB = zavitB;
        this.zavitC = 180 - zavitA - zavitB;
    }

    public int type(){
        if(zavitA < 90 && zavitB < 90 && zavitC < 90){
            return 1;
        }
        else if(zavitA == 90 || zavitB == 90 || zavitC == 90){
            return 2;
        }
        return 3;
    }

    public int specialType(){
        if(zavitA == zavitB || zavitA == zavitC || zavitB == zavitC){
            if(zavitA == 90 || zavitB == 90 || zavitC ==90){
                return 3;
            }
            return 1;
        } else if (zavitA == 60 && zavitB == 60 && zavitC == 60) {
            return 2;
        }
        return 0;
    }
}
