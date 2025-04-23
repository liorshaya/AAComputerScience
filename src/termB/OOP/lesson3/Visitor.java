package termB.OOP.lesson3;

import java.util.Random;

public class Visitor {
    private int uniqueNumber;
    private String name;
    private int[] preferences;
    private int waitingTime;
    private int playingTime;

    public Visitor(int uniqueNumber , String name){
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.preferences = new int[5];
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


}
