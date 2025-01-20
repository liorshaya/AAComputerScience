package termA.lesson11.LecturePoly;

public class Ship extends Vehicle{
    private int maxKmDistance;

    public Ship(String color, int speed , int manuYear , int maxKmDistance){
        super(color, speed, manuYear);
        this.maxKmDistance = maxKmDistance;
    }

    @Override
    public void goToBase() {
        System.out.println("Ship back to harbor.");
    }
}
