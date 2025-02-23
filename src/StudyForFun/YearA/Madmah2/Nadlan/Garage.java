package StudyForFun.YearA.Madmah2.Nadlan;

public class Garage extends Nehes{
    private boolean isForHeavyWeight;
    public int numCondi;

    public Garage(int godelMeter , int yearBuild , Seller seller, boolean isForHeavyWeight , int numCondi){
        super(godelMeter,yearBuild,seller);
        this.isForHeavyWeight = isForHeavyWeight;
        this.numCondi = numCondi;
    }
}
