package termA.lesson11.LecturePoly;

public class Bus extends Vehicle{
    private int seats;

    public Bus(String color , int speed , int manuYear , int seats){
        super(color , speed , manuYear);
        this.seats = seats;
    }

    public void goToBase() {
        System.out.println("Bus back to bus station.");
    }
}
