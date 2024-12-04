package termA.lesson1;

import java.util.Scanner;

//Ex1
public class InputOutput {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println(number + " " + number + " " + number);

    }
}

class Ex2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter float number:");
        float floatNumber = scanner.nextFloat();
        float newNumber = floatNumber * 2;
        System.out.println("The number multiplied by 2 is " + newNumber);

    }

}

class Ex3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        System.out.println("Give me only integer radius: ");
        int radius = scanner.nextInt();
        System.out.println("The Circumference value is: " + 2*pi*radius);
        System.out.println("The Area value is: " + pi*(radius * radius));
    }
}

class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int newAge = age + 16;
        System.out.println("Your age in 2040 will be: " + newAge);
    }
}

class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length:");
        int length = scanner.nextInt();
        System.out.println("Enter Width:");
        int width = scanner.nextInt();
        System.out.println("The Circumference is: " + (2*length + 2*width));
        System.out.println("The Area is: " + (length*width));
    }
}

class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter fourth number:");
        int fourthNumber = scanner.nextInt();
        double avg = ((firstNumber+secondNumber+thirdNumber+fourthNumber)/4F);

        System.out.println("The average is:" + avg);
    }
}

class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Legs:");
        int legs1 = scanner.nextInt();
        System.out.println("Enter second Legs:");
        int legs2 = scanner.nextInt();
        double calculation = (legs1*legs1 + legs2*legs2);
        System.out.println("The Hypotenuse is:" + Math.sqrt(calculation));

    }
}
class Ex8 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product price:");
        int productPrice = scanner.nextInt();
        System.out.println("Enter distance from the shop:");
        int shopDistance = scanner.nextInt();
        System.out.println("Enter floor number:");
        int floorNumber = scanner.nextInt();
        double result = ((shopDistance*5 + floorNumber) *1.1);
        System.out.println("The final price is:" + (productPrice+ result ));
    }
}

class Ex9 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= scanner.nextInt();
        int result = number % 10;
        System.out.println("The result is " + result);
    }
}

class Ex10 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= scanner.nextInt();
        int result = number / 10;
        System.out.println("The result is " + result);
    }
}
class Ex11 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number with 2-digits: ");
        int twoDigits = scanner.nextInt();
        int unit = twoDigits % 10;
        int tens = twoDigits / 10;
        int result = unit + tens;
        System.out.println("The sum of 2-digits is: " + result);
    }
}

class Ex12a {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seconds number:");
        int userInput = scanner.nextInt();
        System.out.println("The number you entered has " + (userInput / 3600F) + " hours.");
        System.out.println("The number you entered has " + userInput / 60F + " minutes.");
        System.out.println("The number you entered has " + (userInput ) + " seconds.");

    }
}

class Ex12b {
    public static void main(String [] args){
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter second number and i'll replace it to H-M-S format:");
        int number = scanner.nextInt();

        int hourNumber = number/3600;
        int minNumber = number/60 % 60;
        int secondNumber = number % 60;
        System.out.println("In this number have " + hourNumber + " Hours, " + minNumber + " Minutes and " + secondNumber + " Seconds." );
    }
}

class Ex13 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number with 3-digits:");
        int threeDigits = scanner.nextInt();
        int units = threeDigits % 10;
        int tens = (threeDigits /10) % 10;
        int hundreds = threeDigits / 100;
        int reversedNumber = units * 100 + tens*10 + hundreds;
        System.out.println("The reversed number is: " + reversedNumber);
    }
}

class Ex14 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number with 3-digits:");
        int threeDigits = scanner.nextInt();
        int units = threeDigits % 10;
        int tens = (threeDigits /10) % 10;
        int hundreds = threeDigits / 100;
        int sumNumber = units + tens + hundreds;
        System.out.println("The sum number is: " + sumNumber);
    }
}


class ExampleIf {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number with 2-digits");
        int number = scanner.nextInt();
        int oneDig = number % 10;
        int twoDig = number / 10;
        int result = oneDig + twoDig;

        if(result % 2 == 0){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even.");
        }
    }
}