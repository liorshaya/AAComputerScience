package termA.lesson11.LecturePoly;

public abstract class Vehicle {
    private String color;
    private int speed;
    private int manuYear;

    public Vehicle(String color , int speed , int manuYear){
        this.color = color;
        this.speed = speed;
        this.manuYear = manuYear;
    }

    public void accelerate(int num){
        this.speed += num;
    }

    public void slowDown(int num){
        this.speed -= num;
    }

    public abstract void goToBase();

}
