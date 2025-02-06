package termA.lesson11.LecturePoly;

public class Truck extends Vehicle{
    private int weight;

    public Truck(String color, int speed , int manuYear , int weight){
        super(color, speed, manuYear);
        this.weight = weight;
    }

    @Override
    public void goToBase() {
        System.out.println("Truck back to parking station.");
    }
}
