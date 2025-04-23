package termB.OOP.lesson3;

import java.util.Random;

public class Visitor {
    private int uniqueNumber;
    private String name;
    private int[] preferences;
    private int waitingTime;
    private int playingTime;
    private int currentRide = -1;

    public Visitor(int uniqueNumber , String name){
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.preferences = new int[5];
        generatePreferences();
    }

    public void generatePreferences(){
        Random rnd = new Random();
        int total = 100;
        for (int i = 0; i < 4; i++) {
            preferences[i] = rnd.nextInt(total+1);
            total -= preferences[i];
        }
        preferences[4] = total;
    }

    public int chooseRideByPrecent(){
        Random rnd = new Random();
        int randomNum = rnd.nextInt(100);
        int sum = 0;
        for (int i = 0; i < this.preferences.length; i++) {
            sum += preferences[i];
            if(randomNum < sum){
                return i;
            }
        }
        return this.preferences.length -1;
    }

    public int getCurrentRide() {
        return currentRide;
    }

    public void setCurrentRide(int currentRide) {
        this.currentRide = currentRide;
    }
}
