package termB.OOP.lesson3;

import termA.lesson7.Stings;

public class ParkRide {

    private String name;
    private int uniqueNumber;
    private int time;
    private int capacityKids;
    private Visitor[] currentRide;
    private int totalVisitors = 0;

    public ParkRide(String name , int uniqueNumber , int time , int capacityKids){
        this.name = name;
        this.uniqueNumber = uniqueNumber;
        this.time = time;
        this.capacityKids = capacityKids;
        this.currentRide = new Visitor[capacityKids];
    }




}
