package termA.lesson10.Exe3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(10 ,50 , 1f);
        Car car2 = new Car(20 ,40 , 0.4f);
        Car car3 = new Car(40 ,50 , 0.1f);
        Car car4 = new Car(15 ,34 , 2f);
        Car car5 = new Car(22 ,70 , 0.5f);

        Car[] cars = {car1,car2,car3,car4,car5};

        float checkPercent = car1.percent();
        System.out.println( "Fuel percent: "+checkPercent + "%");

        boolean urgentGasStation = car1.urgentGasStation();
        System.out.println(urgentGasStation);

        boolean driveCar = car1.drive(5);
        System.out.println(driveCar);

        System.out.println(maxKmToDrive(cars));

    }
    public static int maxKmToDrive(Car[] array){
        int kmToDrive = 0;
        for (int i = 0; i < array.length; i++) {
            int currCar = (int)(array[i].getFuel() / array[i].getLitersPerKm());
            kmToDrive += currCar;
        }
        return kmToDrive;
    }
}
