package termA.lesson2;

import java.util.Random;
import java.util.Scanner;

//Ex1
public class IfElse {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();

        if(userInput > 1000){
            System.out.println("Success");
        }
        else{
            System.out.println("Failure");
        }
    }
}

class Ex2{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter 3 product prices:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int sum = number1 + number2 + number3;

        if(sum > 500){
            System.out.println("You should pay: " + sum + " . after discount of 10%: " + sum*0.9);
        }
        else{
            System.out.println("You have to pay: " + sum );
        }
    }
}

class Ex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int sum1 = number2 - number1;
        int sum2 = number3 - number2;
        if(sum1 == sum2){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}

class Ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("You’re an adult.");
        }
        else{
            System.out.println("you’re a minor.");
        }
    }
}

class Ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("You’re a minor.");
        }
        else if(age >= 18 && age <= 65){
            System.out.println("You’re an adult.");
        }
        else if(age > 120){
            System.out.println("You are dead :)");
        }
        else{
            System.out.println("You’re a retiree.");
        }
    }
}

class Ex6a{
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1001);
        System.out.println("The number is : " + number);
        if(number % 3 == 0){
            System.out.println("You win");
        }
        else {
            System.out.println("You lose");
        }
    }
}

class Ex6b{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your average grade:");
        int avgGrade = scanner.nextInt();

        if(avgGrade > 90){
            System.out.println("Excellent");
        }
        else if(70 <= avgGrade && avgGrade <= 90){
            System.out.println("Good");
        }
        else{
            System.out.println("struggling");
        }
    }
}

class Ex7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1 > number2 && number1> number3){
            System.out.println("OK");
        }
        else {
            System.out.println("Not Ok");
        }

    }
}

class Ex8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before you drive, enter your capacity gas tank(L): ");
        int capacityTank = scanner.nextInt();
        System.out.println("Now enter your current gas by liter: ");
        int currentGas = scanner.nextInt();

        if(currentGas>capacityTank){
            System.out.println("Do you want to kill your car??? ");
        }
        else if(currentGas > capacityTank/2){
            System.out.println("You are good to drive :)");
        }
        else if ((currentGas < capacityTank * 0.5 ) && ( currentGas > capacityTank * 0.15 )) {
            System.out.println("Suggest you to fill gas");
        }
        else {
            System.out.println("You must fill gas!");
        }
    }
}

class Ex9{
    public static void main(String[] args) {
        Random random = new Random();

        int random1 = random.nextInt(1,6);
        int random2 = random.nextInt(1,6);
        int random3 = random.nextInt(1,6);

        System.out.println("The first number is : " + random1);
        System.out.println("The second number is : " + random2);
        System.out.println("The third number is : " + random3);

        if(random3 - random2 == random2 - random1){
            System.out.println("This is a computational series.");
        }
        else {
            System.out.println("This is not computational series.");
        }
    }
}

class Ex10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The first number: ");
        int number1 = scanner.nextInt();
        System.out.println("The second  number: ");
        int number2 = scanner.nextInt();
        System.out.println("The third number: ");
        int number3 = scanner.nextInt();

        int sum = number3 - number2;

        if(number3 - number2 == number2 - number1){
            System.out.println("The next number is : " + (number3+sum));
        }

    }
}

class Ex11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number with 2-digits: ");
        int number = scanner.nextInt();

        int unit = number % 10;
        int tens = (number/10) % 10;

        if(number > 9){
            if(number < 100){
                System.out.println("The sum is: " +(unit + tens));
            }
        }
    }
}

class Ex12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number with 3-digits: ");
        int number = scanner.nextInt();

        int unit = number % 10 ;
        int tens =(number /10) % 10;
        int hundreds = number/100 ;

        if(number > 99){
            if(number < 1000){
                if((hundreds + 1 == tens && tens + 1 == unit) || (hundreds - 1 == tens && tens - 1 == unit)){
                    System.out.println("Good");
                }
                else{
                    System.out.println("Bad");
                }
            }
        }
    }
}

class Ex13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary:");
        int salary = scanner.nextInt();
        System.out.println("Enter monthly sales goal: ");
        int salesGoal = scanner.nextInt();
        System.out.println("Enter current sales:");
        int currentSales = scanner.nextInt();

        if(currentSales > salesGoal ){
            System.out.println("You did it! the salary after bonuses- " + salary*1.75);
        }
        else if (currentSales > salesGoal/2){
            System.out.println("You reached more then 50% sales goal, the salary after bonus- " + (salary +2000));
        }
        else{
            System.out.println("Your salary is " + salary + " without bonuses");
        }
    }
}

class Ex14{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a bet price: ");
        int betPrice = scanner.nextInt();

        int number1 = random.nextInt(1,11);
        int number2 = random.nextInt(1,11);
        int number3 = random.nextInt(1,11);

        int anotherNumber = random.nextInt(1,6);

        if(betPrice > 9){
            if(betPrice < 101){
                if (betPrice % 5 == 0) {
                    System.out.println("The first number: " + number1);
                    System.out.println("The second number: " + number2);
                    System.out.println("The third number: " + number3);

                    int count = 0;
                    if(number1 == number2 ){
                        count++;
                    }
                    if(number2 == number3){
                        count++;
                    }
                    if(number1 == number3){
                        count++;
                    }


                    if(count == 0){
                        System.out.println("You lost..");
                    }
                    if(count == 1){
                        System.out.println("You win " + (betPrice*2) + "$");
                    }

                    if(count == 3) {
                        if (number1 == 7 ) {
                            System.out.println("The another random number is: " + anotherNumber);
                            System.out.println("You win " + ((betPrice * 4) * anotherNumber) + "$");
                        }
                        else {
                            System.out.println("You win " + (betPrice * 4) + "$");
                        }
                    }
                }
            }
        }
    }
}

class Ex15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter flight range(km): ");
        int flightRange = scanner.nextInt();
        System.out.println("Enter how much seats have in the airplane: ");
        int capacityAirplane = scanner.nextInt();
        System.out.println("Enter how much people have in the airplane: ");
        int currentInAirplane = scanner.nextInt();

        double basePrice = 0;
        boolean weather = random.nextBoolean();

        if(flightRange <= 100){
            basePrice = flightRange * 2;
            System.out.println("0-100 km: 2$");
        }
        else if(flightRange <= 200){
            basePrice = 100 * 2 + (flightRange - 100)*1.5 ;
            System.out.println("0-100 km: 2$ , 101-200km: 1.5$");
        }
        else{
            basePrice = 100 *2 + (flightRange - 100)*1.5 + (flightRange - 200)*1.2;
            System.out.println("0-100 km: 2$ , 101-200km: 1.5$, 201km+: 1.2$");
        }

        if(weather){
            basePrice = basePrice *2;
            System.out.println("Due to stormy weather, the price is doubled.");
        }
        double occupancyRate = (double)  currentInAirplane/ capacityAirplane;

        if(occupancyRate == 1){
            basePrice = basePrice*0.9;
            System.out.println("Full occupancy: 10% discount applied.");
        }
        else if (occupancyRate > 0.9) {
            basePrice = basePrice*0.95;
            System.out.println("More then 90% occupancy: 5% discount applied.");
        }

        System.out.println("The final ticket price: " + basePrice);

    }
}









