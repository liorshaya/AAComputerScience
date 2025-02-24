package StudyForFun.YearA.Madmah2.Musah;

public class GasCar extends Vehicle {
    private int sizeTankGas;

    public GasCar(String model , int yearManu , int km , Owner owner , int sizeTankGas){
        super(model,yearManu,km,owner);
        this.sizeTankGas = sizeTankGas;
    }
    public int fixPrice(){
        return super.fixPrice();
    }
}
