package StudyForFun.YearA.Madmah2.Musah;

public abstract class Vehicle {
    private String model;
    private int yearManu;
    private int km;
    private Owner owner;

    public Vehicle(String model , int yearManu , int km , Owner owner){
        this.model = model;
        this.yearManu = yearManu;
        this.km = km;
        this.owner = owner;
    }

    public int fixPrice(){
        int basePrice = 400;
        int yearsOld = 2025-this.yearManu;
        return basePrice+(yearsOld*25);
    }

    public int getKm(){
        return this.km;
    }
}
