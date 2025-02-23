package StudyForFun.YearA.Madmah2.Nadlan;

public abstract class Nehes {
    private int godelMeter;
    private int yearBuild;
    private Seller seller;

    public Nehes(int godelMeter , int yearBuild , Seller seller){
        this.godelMeter = godelMeter;
        this.yearBuild = yearBuild;
        this.seller = seller;
    }

    public Seller getSeller(){
        return this.seller;
    }

    public int getGodelMeter(){
        return this.godelMeter;
    }
}
