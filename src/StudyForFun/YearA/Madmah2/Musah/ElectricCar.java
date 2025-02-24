package StudyForFun.YearA.Madmah2.Musah;

public class ElectricCar extends Vehicle {
    private int kiboletBattary;
    private int sizeKmWithFullBattary;

    public ElectricCar(String model , int yearManu , int km , Owner owner, int kiboletBattary , int sizeKmWithFullBattary){
        super(model,yearManu,km,owner);
        this.kiboletBattary = kiboletBattary;
        this.sizeKmWithFullBattary = sizeKmWithFullBattary;
    }

    public int fixPrice(){
        int finalPrice = 0;
        if(this.getKm() > 100000){
            finalPrice = super.fixPrice() + 400;
        }
        return finalPrice;
    }
}
