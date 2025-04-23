package termB.OOP.lesson3;

import java.util.Random;

public class Park {
    private ParkRide[] parkRides = new ParkRide[5];
    private Visitor[] visitors = new Visitor[50];

   public void startSimulation(){
       Random rnd = new Random();

       for (int i = 0; i < 5; i++) {
           int duration = rnd.nextInt(21)+10;
           int capacity = rnd.nextInt(4)+3;
           parkRides[i] = new ParkRide("Ride" + (i+1), i , duration , capacity);
       }

       for (int i = 0; i < 50; i++) {
           visitors[i] = new Visitor(i , "Visitor" + (i+1));
       }
   }


}
