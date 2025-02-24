package StudyForFun.YearA.Madmah2.Musah;

public class Truck extends Vehicle{
    private int sizeTank;
    private int omesKm;

    public Truck(String model , int yearManu , int km , Owner owner, int sizeTank , int omesKm){
        super(model,yearManu,km,owner);
        this.sizeTank = sizeTank;
        this.omesKm = omesKm;
    }
    public int fixPrice(){
        return super.fixPrice()+300;
    }
}
