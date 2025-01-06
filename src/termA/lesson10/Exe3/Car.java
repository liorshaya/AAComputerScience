package termA.lesson10.Exe3;

public class Car {
    private int fuel;
    private int fuelCapacity;
    private float litersPerKm;

    public Car(int fuel , int fuelCapacity , float litersPerKm){
        this.fuel = fuel;
        this.fuelCapacity = fuelCapacity;
        this.litersPerKm = litersPerKm;
    }

    public int getFuel(){
        return this.fuel;
    }

    public void setFuel(int fuel){
        this.fuel = fuel;
    }

    public float getLitersPerKm(){
        return this.litersPerKm;
    }

    public void setFuelCapacity(float litersPerKm){
        this.litersPerKm = litersPerKm;
    }

    public float percent(){
        float percent = ((float)this.fuel/this.fuelCapacity) *100;
        return percent;
    }

    public boolean urgentGasStation(){
        if(this.fuel < 20){
            return true;
        }
        if(percent() < 10){
            return true;
        }
        return false;
    }

    public boolean drive(int km){
        if((this.fuel - ((float) km * this.litersPerKm) > 0 )){
            this.fuel -= (int)(this.fuel - ((float) km * this.litersPerKm));
            return true;
        }
        return false;
    }


}
