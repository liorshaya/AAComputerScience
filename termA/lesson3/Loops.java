package termA.lesson3;

import java.util.Random;
import java.util.Scanner;

//Ex1
public class Loops {
    public static void main(String[] args) {

        for (int i = 0 ; i < 1001 ; i++ ){
            System.out.println(i);
        }
    }
}

class Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the limit number: ");
        int limit = scanner.nextInt();

        if(limit > 0){
            for(int i = 0 ; i <= limit  ; i++){
                System.out.println(i);
            }
        }
        else{
            System.out.println("Wrong number!");
        }
    }
}

class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a start number: ");
        int start = scanner.nextInt();
        System.out.println("Enter a end number:");
        int end = scanner.nextInt();

        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Wrong!");
        }

    }
}

class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you want to enter: ");
        int userInput = scanner.nextInt();

        int count = 0;

        for (int i = userInput; i > 0; i--) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 10) {
                count++;
            }
        }

        System.out.println("Numbers greater than 10: " + count);
    }
}

class Ex5{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter min range: ");
        int min = scanner.nextInt();
        System.out.println("Enter max range: ");
        int max = scanner.nextInt();

        int counter = 0;

        for(int i = 0 ; i < 5 ; i++){
            int randomNumber = random.nextInt(min,max);
            System.out.println(randomNumber);

            if(randomNumber > 9){
                counter++;
            }
        }
        System.out.println("Numbers that above 10: " + counter);

    }
}

class Ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Enter a number:");
            int userInput = scanner.nextInt();

            if(userInput % 2 == 0){
                counter++;
            }
        }
        System.out.println("Even numbers:" + counter);

    }
}

class Ex7{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a counter number: ");
        int count = scanner.nextInt();
        int sum = 0;

        for (int i = count ; i > 0 ; i--){
            System.out.println("Enter a number: ");
            int userInput = scanner.nextInt();
            sum = sum + userInput;
        }
        System.out.println("The average is: " + ((double) sum/count));

    }
}

class Ex8{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while(counter < 5) {
            System.out.println("Enter a number:");
            int userInput = scanner.nextInt();
            if (userInput % 2 == 0) {
                counter++;
            }
        }
        System.out.println("You entered 5 even numbers.");
    }
}

class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 3) {
            System.out.println("Enter a number: ");
            float userInput = scanner.nextFloat();

            if (userInput > 9 && userInput < 100){
                counter++;
            }

        }
        System.out.println("You have entered 3 times 2 two-digit numbers.");
    }
}

class Ex10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 5) {
            System.out.println("Enter a number: ");
            float userInput = scanner.nextFloat();

            if ( userInput % 1 == 0){
                counter++;
            }

        }
        System.out.println("You have entered 5 times integer numbers.");
    }
}

class Ex11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int goodNumber = 0;
        while(counter < 1){
            System.out.println("Enter a number:");
            int userInput = scanner.nextInt();
            if (userInput > 99 && userInput < 1000) {
                if(userInput/100 == userInput % 10 && userInput % 10 == (userInput/10) % 10) {
                    counter++;
                    goodNumber = userInput;
                }
            }

        }
        System.out.println("Done! The number " + goodNumber + " is good.");
    }
}

class Ex12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a limit number: ");
        int limitNumber = scanner.nextInt();

        for(int i = limitNumber ; i > 0 ; i--){
            if(i % 7 == 0 || String.valueOf(i).contains("7")){
                System.out.println("BOOM");
            }
            else{
                System.out.println(i);
            }
        }
    }
}

class Ex13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int previous = 0;

        while(counter < 3){
            System.out.println("Enter a number: ");
            int userInput = scanner.nextInt();

            if(userInput == previous + 1){
                counter++;
            }
            else {
                counter = 1;
            }
            previous = userInput;
            if (counter == 3) {
                System.out.println("The three numbers are consecutive.");
            }
        }
    }
}


class Ex14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int lines = scanner.nextInt();

        for(int i = 0 ; i < lines ;i++){
            for(int k = 0 ; k < lines; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Ex15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int lines = scanner.nextInt();

        for(int i = 0 ; i < lines ; i++){
            for(int k = 0 ; k < lines ; k++){
                System.out.print(lines);
            }
            System.out.println();
        }
    }
}

class Ex16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int lines = scanner.nextInt();

        int number = 1;

        for(int i = 0 ; i < lines ; i++){
            for (int k = 0 ; k < lines ; k++){
                System.out.print(number);
            }
            number++;
            System.out.println();
        }
    }
}

class Ex17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int lines = scanner.nextInt();
        int firstNumber = 1;

        for(int i = 0 ;i < lines ; i++ ){
            for(int k = 0 ; k < firstNumber ; k++){
                System.out.print(firstNumber);
            }
            firstNumber++;
            System.out.println();
        }
    }
}

class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        while(userInput % 2 == 0){
            System.out.println("Enter a number");
            userInput = scanner.nextInt();
        }
        for(int i = 0 ; i < userInput ; i++){
            for(int k = 0 ; k < i + 1 ; k++){
                System.out.print(i +1);
            }
            System.out.println();
        }
        for (int i = userInput -1; i > 0; i--) {
            for(int k = 0 ; k < i  ; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class Ex19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        while(userInput % 2 ==0){
            System.out.println("Enter a number:");
            userInput = scanner.nextInt();
        }

        for (int i = 0; i < userInput; i++) {

            for (int j = 0; j < (userInput-i)/2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print(i+1);
            }
            i = i + 1;
            System.out.println();
        }

        for (int i = userInput-2; i > 0; i--) {
            for (int j = 0; j < (userInput-i)/2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(i);
            }
            i = i - 1;
            System.out.println();
        }
    }
}

class Ex20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row size:");
        int row = scanner.nextInt();
        System.out.println("Enter Length:");
        int length = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int k = length-2; k > 0; k--){
            System.out.print("*");
            for (int l = row - 2; l > 0; l--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            System.out.print("*");
        }
    }
}

class Ex21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter basis hezka: ");
        int basis = scanner.nextInt();
        System.out.println("Enter maarih hezka: ");
        int maarih = scanner.nextInt();

        int result = 1;
        for(int i = maarih ; i > 0 ; i--){
            result = result * basis;
        }
        System.out.println(result);
    }
}

class Ex22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        int result = 1;

        for(int i = n ; i > 0 ; i--){
            result = result * i;
        }

        System.out.println(result);
    }
}

class Ex23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Difference: ");
        int difference = scanner.nextInt();
        System.out.println("How much numbers: ");
        int amountNumbers = scanner.nextInt();

        for(int i = 0 ; i < amountNumbers ; i++){
            int currentNumber = firstNumber + (i * difference);
            System.out.print(currentNumber);

            if (i < amountNumbers - 1) {
                System.out.print(" ,");
            }
        }
    }
}
