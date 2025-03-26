package termB.OOP.lesson1;

import java.util.Random;
import java.util.Scanner;

public class lecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numInput = scanner.nextInt();
        countdown(numInput);

    }

    public static void countdown(int number){
        Thread t1 = new Thread(() -> {
            for (int i = number; i >= 0 ; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }
}
//צריך לעשות שמישהו כאילו מקליד ש- :6 + 4 "The result is : 10 ! "

class ex2{
    public static void main(String[] args) {
       typing(5,6);
    }
    public static void typing(int num1 , int num2){
        int sum = num1 + num2;
        String fullText = "The result is: " + sum;

        Thread t1 = new Thread(()->{
            Random rnd = new Random();

            for (int i = 0; i < fullText.length(); i++) {
                System.out.print(fullText.charAt(i));
                try {
                    Thread.sleep(rnd.nextInt(700)+50);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println();
        });
        t1.start();
    }
}
