package StudyForFun.YearA.Madmah2.Nadlan;

public class Office extends Nehes{
    private boolean isIncludeSittingRoom;
    public boolean isIncloudeSecureEnter;

    public Office(int godelMeter , int yearBuild , Seller seller , boolean isIncludeSittingRoom , boolean isIncloudeSecureEnter){
        super(godelMeter,yearBuild,seller);
        this.isIncludeSittingRoom = isIncludeSittingRoom;
        this.isIncloudeSecureEnter = isIncloudeSecureEnter;
    }
}
