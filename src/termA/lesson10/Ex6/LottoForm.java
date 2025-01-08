package termA.lesson10.Ex6;

import java.util.Random;
import java.util.Scanner;

public class LottoForm {
    private int[] numbers;
    private int strong;
    private String name;

    public int[] getNumbers(){
        return this.numbers;
    }

    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }

    public int getStrong(){
        return this.strong;
    }

    public void setStrong(int strong){
        this.strong = strong;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LottoForm(String name, boolean auto){
        this.name = name;
        this.numbers = new int[6];

        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        boolean checkAuto = rnd.nextBoolean();


        if(checkAuto){
            for (int i = 0; i < this.numbers.length; i++) {
                this.numbers[i] = rnd.nextInt(37) + 1;
            }
            this.strong = rnd.nextInt(7) + 1;
        }
        else{
            int i = 0;
                while(i < 6){
                    System.out.println("Enter a number between 1 to 37: ");
                    int temp = scn.nextInt();
                        if(temp < 1 || temp > 37 ){
                            System.out.println("Invalid input, try again.");
                        }
                        else{
                            this.numbers[i] = temp;
                            i++;
                        }
            }
            System.out.println("Enter strong number: ");
            int strongNum = scn.nextInt();
            while (strongNum < 0 || strongNum > 7){
                System.out.println("Invalid input, try again.");
                strongNum = scn.nextInt();
            }
            this.strong = strongNum;

        }
    }

}

