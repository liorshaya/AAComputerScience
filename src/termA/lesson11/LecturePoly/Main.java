package termA.lesson11.LecturePoly;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bus("Green", 100 , 2021 , 52);
        Vehicle v2 = new Truck("Blue" , 80 , 2014 , 15000);
        Vehicle v3 = new Ship("White", 140 , 2023 , 1200);

        Vehicle[] vehicles = {v1, v2, v3};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].goToBase();
        }
    }
}
