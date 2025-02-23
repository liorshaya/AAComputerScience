package StudyForFun.YearA.Madmah2.Shift;

public class Metupal {
    private int id;
    private boolean isDahuf;
    private int type;

    public Metupal(int id, boolean isDahuf , int type){
        this.id = id;
        this.isDahuf = isDahuf;
        this.type = type;
    }

    public int getType(){
        return this.type;
    }

    public boolean getDahuf(){
        return this.isDahuf;
    }
}
