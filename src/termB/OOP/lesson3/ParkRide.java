package termB.OOP.lesson3;

import termA.lesson7.Stings;

public class ParkRide {

    private String name;
    private int uniqueNumber;
    private int time;
    private int capacityKids;
    private Visitor[] currentRide;
    private int totalVisitors = 0;
    private boolean isRunning;

    public ParkRide(String name , int uniqueNumber , int time , int capacityKids){
        this.name = name;
        this.uniqueNumber = uniqueNumber;
        this.time = time;
        this.capacityKids = capacityKids;
        this.currentRide = new Visitor[capacityKids];
    }

    public boolean tryToJoin(Visitor visitor){
        for (int i = 0; i < capacityKids; i++) {
            if(this.currentRide[i] == null){
                currentRide[i] = visitor;
                visitor.setCurrentRide(this.uniqueNumber);
                return true;
            }
        }
        return false;
    }

    public void runRide(){
        this.isRunning = true;
        //System.out.println(this.name + "running with " + );

    }










}
