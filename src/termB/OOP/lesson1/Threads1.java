package termB.OOP.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Threads1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        countDown(num);
    }

    public static void countDown(int num){
        Thread t1 = new Thread(() ->{
            for (int i = num; i >= 0 ; i--) {
                if(i != 0){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                else{
                    System.out.println("BOOM!");
                }
            }
        });t1.start();
    }
}

class exe2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second num: ");
        int num2 = scanner.nextInt();
        realTyping(num1,num2);
    }

    public static void realTyping(int num1 , int num2){
        int sum = num1 + num2;
        String text = "The sum of both numbers is : " + sum;

        Thread t1 = new Thread(() ->{
            Random rnd = new Random();
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                try {
                    Thread.sleep(rnd.nextInt(100,500));
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });t1.start();
    }
}

class exe3{

}