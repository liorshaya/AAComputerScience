package termA.lesson4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//Ex1
public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        boolean ans = higherThenTen(number1, number2, number3);
        if (ans) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean higherThenTen(int number1, int number2, int number3) {
        if (number1 > 10 && number2 > 10 && number3 > 10){
            return true;
        }
        return false;

    }
}

class Ex2{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    boolean ans = isDivisible(number1,number2);
    if(ans){
        System.out.println("True");
    }
    else{
        System.out.println("False");
        }
    }

    public static boolean isDivisible(int number1, int number2){
        if((number1 % number2) ==0){
            return true;
        }
        return false;
    }
}


class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(twoPositiveNumbers(number1,number2,number3));
    }

    public static boolean twoPositiveNumbers(int number1, int number2, int number3) {
        int counter = 0;

        if (number1 > 0) {
            counter++;
        }
        if (number2 > 0) {
            counter++;
        }
        if (number3 > 0) {
            counter++;
        }
        if(counter >= 2){
            return true;
        }
        return false;
    }
}

class Ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int limit = scanner.nextInt();
        System.out.println(allNumber0toNumber(limit));
    }

    public static int allNumber0toNumber(int limit){
        Random random = new Random();
        for(int i = 1 ; i<limit ; i++){
            System.out.println(random.nextInt(limit));
        }
        return limit;
    }
}

class Ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.println(highestNumber(firstNumber));

    }

    public static int highestNumber(int firstNumber){
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        for (int i = 0; i < firstNumber; i++) {
            int userInput = scanner.nextInt();
            if(userInput > maxNumber){
                maxNumber = userInput;
            }
        }
        return maxNumber;
    }
}

class Ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total student number: ");
        int totalStudents = scanner.nextInt();
        System.out.println(averageGrade(totalStudents));
    }

    public static boolean averageGrade(int totalStudents){
        Scanner scanner = new Scanner(System.in);
        int sumGrade = 0;
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Enter grade:");
            int grade = scanner.nextInt();
            sumGrade += grade;
        }
        int avg = sumGrade/totalStudents;
        if(avg > 60 ){
            return true;
        }
        return false;
    }

}

class Ex7{
    public static void main(String[] args) {
        randomModule(3);
    }

    public static int randomModule(int number){
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int randomNumber = random.nextInt(0, 100) ;

            if(randomNumber % number != 0){
                randomNumber = randomNumber + (number - ( randomNumber % number ));
            }
            System.out.println(randomNumber);
        }
        return number;
    }
}

class Ex8{
    public static void main(String[] args) {
        System.out.println(avgBetweenNumbers(1,3,5,3));

    }

    public static boolean avgBetweenNumbers(int num1 , int num2 , int num3 , int num4){
        double avgNum =(num1+num2+num3+num4)/4F;
            if(avgNum == num1){
                return true;
            }
            else if(avgNum == num2){
                return true;
            }
            else if(avgNum == num3){
                return true;
            }
            else if (avgNum == num4) {
                return true;
            }
            return false;
    }
}

class Ex9{
    public static void main(String[] args) {
        int max = inputNumbersUntil0();
        System.out.println("The max number is: " + max );
    }

    public static int inputNumbersUntil0(){
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int userInput;
        do{
            System.out.println("Enter a number:");
            userInput = scanner.nextInt();
            if(userInput > maxNumber ){
                maxNumber = userInput;
            }
        }
        while(userInput != 0);

        return maxNumber;

    }
}

class Ex10{
    public static void main(String[] args) {
    multiplicationTable(20);
    }

    public static void multiplicationTable(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }
}


class Ex11{
    public static void main(String[] args) {
        System.out.println(twoNumbers(-545,4));
    }

    public static boolean numWithOneDigit(int checkNum){
        if(checkNum >= -9 && checkNum <= 9){
            return true;
        }
        return false;
    }

    public static boolean twoNumbers(int number, int digit){
        if(!numWithOneDigit(digit)){
            return false;
        }
        if(number < 0){
            number = -number;
        }
        if(digit <0){
            digit = -digit;
        }

        while(number>0){
            int lastDigit = number % 10;
            if(lastDigit == digit){
                return true;
            }
            number = number /10;
        }
        return false;
    }
}

class Ex12{
    public static void main(String[] args) {
        int number1 =threePositiveNumbers();
        int number2 =threePositiveNumbers();
        int number3 =threePositiveNumbers();

        boolean checkingAscending = checkingAscendingNumbers(number1,number2,number3);

        if(checkingAscending){
            System.out.println("The numbers are ascending numbers.");
        }
        else{
            System.out.println("The numbers are not ascending numbers.");
        }

    }
    public static int threePositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do{
            System.out.println("Enter a number");
            userInput = scanner.nextInt();
            if(userInput <= 0){
                System.out.println("The number must be positive, try again.");
            }
        }
        while(userInput <= 0);
        return userInput;
    }

    public static boolean checkingAscendingNumbers(int number1,int number2 , int number3){
        if(number1 < number2 && number2 < number3){
            return true;
        }
        return false;
    }
}

class Ex13{
    public static void main(String[] args) {

        int validNumber = acceptOnlyOddNumber();
        int middleDigit = middleDigit(validNumber);
        System.out.println("The number is:" + validNumber);
        System.out.println("The middle number is: " + middleDigit);
    }

    public static boolean numberIsOdd(int number){
        int counter = 0;

        if(number<0){
            number = -number;
        }
        while(number >0){
            number = number/10;
            counter++;
        }
        if(counter % 2 == 1){
            return true;
        }
        return false;
    }

    public static int acceptOnlyOddNumber(){
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do{
            System.out.println("Enter an odd number:");
            userInput = scanner.nextInt();
            if(!numberIsOdd(userInput)){
                System.out.println("The number does not have an odd number of digits. Try again.");
            }
        }
        while(!numberIsOdd(userInput));
        return userInput;
    }

    public static int middleDigit(int number){
        int digitCounter = 0;

        if(number < 0){
            number = -number;
        }
        int temp = number;

        while(temp > 0){
            digitCounter++;
            temp = temp/10;
        }
        int middleIndex = digitCounter/2;

        for (int i = 0; i < middleIndex; i++) {
            number = number /10;
        }
        return number %10;

    }
}





class Ex14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int attempt = selectDifficulty(scanner);

        int digit1, digit2, digit3, digit4 = 0;


        do {
            digit1 = generateRandomDigit();
            digit2 = generateRandomDigit();
            digit3 = generateRandomDigit();
            digit4 = generateRandomDigit();
        } while (!isUniqueDigit(digit1, digit2, digit3, digit4));

        // System.out.println("The code: "+ digit1 + digit2 + digit3 + digit4);

        System.out.println("Welcome to the Secret Code Game!");
        System.out.println("Try to guess the secret 4-digit code. Each digit is between 1 and 6.");

        boolean flagWin = false;


        while (attempt > 0 && !flagWin) {
            System.out.println("You have " + attempt + " attempts left.");
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();

            if (!validGuess(guess)) {
                System.out.println("you lost 2 attempts!");
                attempt = attempt - 2;
                continue;
            }

            int g4 = guess % 10;
            guess /= 10;
            int g3 = guess % 10;
            guess /= 10;
            int g2 = guess % 10;
            guess /= 10;
            int g1 = guess;

            int exactMatch = exactMatch(digit1, digit2, digit3, digit4, g1, g2, g3, g4);
            int partialMatch = partialMatch(digit1, digit2, digit3, digit4, g1, g2, g3, g4);

            if (exactMatch == 4) {
                flagWin = true;
                System.out.println("Congratulations! You guessed the secret code!");
            } else {
                System.out.println("Exact match: " + exactMatch + " Partial match: " + partialMatch);
                attempt--;
            }
        }

        if (!flagWin) {
            System.out.println("You used all attempts!");
            System.out.println("The secret code is:" + digit1 + digit2 + digit3 + digit4);
        }


    }

    public static int generateRandomDigit() {
        Random random = new Random();
        return random.nextInt(1, 7);

    }

    public static boolean isUniqueDigit(int d1, int d2, int d3, int d4) {
        if (d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4) {
            return true;
        }
        return false;
    }

    public static int selectDifficulty(Scanner scanner) {
        Random random = new Random();
        int attempt = 0;

        while (attempt == 0) {
            System.out.println("Enter the difficulty level:");
            System.out.println("Level 1: Easy (20 attempts)");
            System.out.println("Level 2: Medium (15 attempts)");
            System.out.println("Level 3: Hard (10 attempts)");
            System.out.println("Level 4: Surprise (Random attempts)");

            int choice = scanner.nextInt();
            if (choice == 1) {
                attempt = 20;
            } else if (choice == 2) {
                attempt = 15;
            } else if (choice == 3) {
                attempt = 10;
            } else if (choice == 4) {
                attempt = random.nextInt(5, 26);
            } else {
                System.out.println("Invalid level, try again.");
            }
        }
        return attempt;
    }

    public static boolean validGuess(int guess) {
        if (guess < 1111 || guess > 6666) {
            return false;
        }
//        int g4 = guess % 10;
//        guess = guess/10;
//        int g3 = guess % 10;
//        guess = guess/10;
//        int g2 = guess % 10;
//        guess = guess/10;
//        int g1 = guess;

        int counter = 3;
        for (int i = 0; i < 4; i++) {
            int g = guess % 10;
            if (g > 6 || g < 1) {
                return false;
            }
            guess /= 10;
            int g2 = guess;
            for (int j = 0; j < counter; j++) {
                int g1 = g2 % 10;
                if (g == g1) {
                    return false;
                } else {
                    g2 /= 10;
                }
            }
            counter--;
        }
        return true;
//        if(g1 == g2 || g1 == g3 || g1 == g4 || g2 == g3 || g2 == g4 || g3 == g4){
//            return false;
//        }


//        if(g1 < 1 || g1 > 6 || g2 < 1 || g2 > 6 || g3 < 1 || g3 > 6 || g4 < 1 || g4 > 6){
//            return false;
//        }
//        return true;
    }

    public static int exactMatch(int d1, int d2, int d3, int d4, int g1, int g2, int g3, int g4) {
        int counter = 0;
        if (d1 == g1) {
            counter++;
        }
        if (d2 == g2) {
            counter++;
        }
        if (d3 == g3) {
            counter++;
        }
        if (d4 == g4) {
            counter++;
        }
        return counter;
    }

    public static int partialMatch(int d1, int d2, int d3, int d4, int g1, int g2, int g3, int g4) {
        int counter = 0;
        if (g1 == d2 || g1 == d3 || g1 == d4) {
            counter++;
        }
        if (g2 == d1 || g2 == d3 || g2 == d4) {
            counter++;
        }
        if (g3 == d1 || g3 == d2 || g3 == d4) {
            counter++;
        }
        if (g4 == d1 || g4 == d2 || g4 == d3) {
            counter++;
        }
        return counter;
    }

}