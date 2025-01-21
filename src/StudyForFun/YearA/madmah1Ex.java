package StudyForFun.YearA;

import java.util.Random;
import java.util.Scanner;

public class madmah1Ex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius for circle: ");
        double radius = scn.nextFloat();
        double pi = 3.14;

        double setah = pi*(radius*radius);
        System.out.println("Setah: " + setah);
        double area = 2*pi*radius;
        System.out.println("Area: " + area);
    }
}

class ex2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter orech malben: ");
        int orech = scn.nextInt();
        System.out.println("Etner rochav malben: ");
        int rochav = scn.nextInt();

        int area = 2 * orech + 2 * rochav;
        System.out.println("Area: " + area);
        int setach = orech * rochav;
        System.out.println("Setach: " + setach);

    }
}

class ex3{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first nitzav: ");
        double nitzav1 = scn.nextInt();
        System.out.println("Enter second nitzav: ");
        double nitzav2 = scn.nextInt();
        double yeter = (nitzav1*nitzav1)+(nitzav2*nitzav2);
        System.out.println("Yeter: " + Math.sqrt(yeter));
    }
}

class ex4{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int thisYear = 2025;
        System.out.println("Ether your age: ");
        int age = scn.nextInt();
        int addYears = 2040 - thisYear;
        System.out.println("In 2024 your age will be: " + (age+addYears));
    }
}

class ex5{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter " + (i+1)+"'s" + " number: ");
            int number = scn.nextInt();
            sum += number;
        }

        System.out.println("The average is: "+ sum/4f);
    }
}

class ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product price: ");
        int price = scanner.nextInt();
        System.out.println("Enter kg product: ");
        int weight = scanner.nextInt();
        System.out.println("Ether km from store: ");
        int kmFromStore = scanner.nextInt();
        System.out.println("Ether your floor: ");
        int floor = scanner.nextInt();

        double finalPrice = price + (5 * kmFromStore + floor * weight)*1.1;
        double feeAndShipping = (5 * kmFromStore + floor * weight)*1.1;

        System.out.println("The final price is: " + finalPrice + " for product that cost: " + price + " and the shipping cost is: "
             + feeAndShipping*0.9  +  " and the fee for the delivery is: " + feeAndShipping * 0.1 );
    }
}

class ex7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        System.out.println(num%10);
    }
}

class ex8{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        System.out.println(num/10);
    }
}

class ex9{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2-digit number: ");
        int userInput = scn.nextInt();
        int unit = userInput % 10;
        int num2 = userInput / 10;
        System.out.println("the sum number is: " + (unit + num2));
    }
}

class ex10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number grater then 1000");
        int userInput = scn.nextInt();
        if(userInput > 1000){
            System.out.println("Success");
        }
        else{
            System.out.println("Failure");
        }
    }
}

class ex11{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter product price: ");
            int userInput = scn.nextInt();
            sum += userInput;
        }
        if(sum > 500){
            System.out.println("The final price: " + sum * 0.9);
        }
        else{
            System.out.println("price without discount: " + sum);
        }
    }
}

class ex12{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        int checkDiff1 = num2 - num1;
        int checkDiff2 = num3 - num2;

        if(checkDiff1 == checkDiff2){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}

class ex13{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your avg grade: ");
        int avgGrade = scn.nextInt();

        if(avgGrade > 90){
            System.out.println("Perfect");
        }
        else if (avgGrade <= 90 && avgGrade >= 70) {
            System.out.println("Good");
        }
        else{
            System.out.println("Hard");
        }
    }
}

class ex14{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scn.nextInt();

        if(userInput > 9 && userInput < 100){
            int unit = userInput % 10;
            int tens = userInput / 10;
            System.out.println("The user input is 2-digit, sum of them is: " + (unit+tens));
        }
    }
}

class ex15{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = scn.nextInt();

        if(userInput > 99 && userInput < 1000){
            int unit = userInput % 10;
            int tens = (userInput / 10) % 10;
            int hundreds = userInput / 100;

            if(unit +1 == tens && tens+1 == hundreds || hundreds +1 == tens && tens+1 == unit){
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }
        }
    }
}

class ex16{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scn.nextInt();
        System.out.println("Enter monthly goal: ");
        int goal = scn.nextInt();
        System.out.println("Enter sales: ");
        int sales = scn.nextInt();

        if(sales > goal){
            System.out.println("The final salary with 75% is: " + salary * 1.75);
        }
        else if(sales > (goal/2)){
            System.out.println("The final salary with 2000₪ bonus is " + (salary+2000));
        }
        else {
            System.out.println("The final salary without bonus is: " + salary);
        }
    }
}

class ex17{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        while (count < 5){
            System.out.println("Enter a number: ");
            int userInput = scn.nextInt();
            if(userInput % 2 == 0){
                count++;
            }
        }
    }
}

class ex18{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            int userInput = scn.nextInt();
            if(userInput % 3 == 0){
                count++;
            }
        }
        System.out.println("Numbers that divided 3: " + count);
    }
}

class ex19{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        while(count < 1){
            System.out.println("Enter 2-digit number: ");
            int userInput = scn.nextInt();
            int unit = userInput % 10;
            int tens = userInput / 10;
            if(unit == tens ){
                count++;
            }
        }
    }
}

class ex20{
    public static void main(String[] args) {
    int gcdResult = gcd(40, 16);
    System.out.println(gcdResult);

    }

    public static int gcd(int number1, int number2){ // 12 , 18
        int gcd = 1;
        int min;
        if(number1 > number2){
            min = number2;
        }
        else{
            min = number1;
        }

        for (int i = 1; i <= min; i++) {
            if(number1 % i == 0 && number2 % i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
}

class ex21{
    public static void main(String[] args) {
        int result = calculateCharNum(123);
        System.out.println(result);
    }
    public static int calculateCharNum(int num){ //54321
        int count = 0;
        int temp = 0;
        for (int i = 0; num > 0; i++) {
            temp = num / 10;
            num = temp;
            count++;
        }
        return count;
    }
}

class ex22{
    public static void main(String[] args) {
    int result = sumCharNumbers(5492);
        System.out.println(result);
    }
    public static int sumCharNumbers(int num){
        int sum = 0;
        int temp = 0;
        for (int i = 0; num > 0; i++) {
            temp = num % 10;
            num /= 10;
            sum += temp;
        }
        return sum;
    }
}

class ex23{
    public static void main(String[] args) {
    boolean result = isBeautifulNumber(151);
        System.out.println(result);
    }
    public static boolean isBeautifulNumber(int num){
        if(num > 0 && num < 100){
            return false;
        }
        int counterNumber = ex21.calculateCharNum(num);
        int[] arrays = new int[counterNumber];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = num % 10;
            num /= 10;
        }
        if(arrays[0] == arrays[arrays.length-1]){
            return true;
        }
        else{
            return false;
        }
    }
}

class ex24{
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int unit = i % 10;
            int meot = i / 100;
            if(unit == meot){
                System.out.println(i);
            }
        }
    }
}

class ex25{
    public static void main(String[] args) {
        int result = countNumber(3433537, 3);
        System.out.println(result);
    }
    public static int countNumber(int number , int digit){
        int count = 0;
        for (int i = 0; number > 0; i++) {
            int tempDigit = number % 10;
            if(tempDigit == digit){
               count++;
            }
            number /= 10;
        }
        return count;
    }
}

class ex26{
    public static void main(String[] args) {
    printArray(createArrayByParameters(13,21));
    }

    public static int[] createArrayByParameters(int lengthArray , int num){
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class ex27{
    public static void main(String[] args) {
        ex26.printArray(createArray(18,4));
    }

    public static int[] createArray(int lengthArray , int startNum){
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = startNum + i;
        }
        return array;
    }
}

class ex28{
    public static void main(String[] args) {
    ex26.printArray(randomArray(10));
    }
    public static int[] randomArray(int lengthArray){
        Random rnd = new Random();
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1,1000);
        }
        return array;
    }
}

class ex29{
    public static void main(String[] args) {
        int[] array = {132, 321, 234, 12, 94, 432, 323, 23};
        int result = maxNumber(array);
        System.out.println(result);
    }
    public static int maxNumber(int[] array){
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxNumber){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}

class ex30{
    public static void main(String[] args) {
        int[] array = {1,4,5,6,5,4,5};
        int result = countNumber(array,5);
        System.out.println(result);
    }
    public static int countNumber(int[] array , int number){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                count++;
            }
        }
        return count;
    }
}

class ex31{
    public static void main(String[] args) {
        int[] array = {1,5,3,4,5,2};
        ex26.printArray(fixedArrayWithoutDigit(array,5));
    }

    public static int[] fixedArrayWithoutDigit(int[] array , int number){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                count++;
            }
        }
        int[] newArray = new int[array.length-count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != number){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}

class ex32{
        public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,5};
        int[] array2 = {1,2,3,4,5,6,8};
        int result = compareAndSumTwoArray(array1,array2);
        System.out.println(result);

    }
    public static int compareAndSumTwoArray(int[] array1 , int[] array2){
        int sumArray1 = 0;
        int sumArray2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sumArray1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sumArray2 += array2[i];
        }

        if(sumArray1 > sumArray2){
            return 1;
        }
        else if (sumArray2 > sumArray1){
            return 2;
        }
        else {
            return 0;
        }
    }
}

class ex33{
    public static void main(String[] args) {
    int[] array = new int[10];
    insertNumbersInArray(array);
    insertOnlyEven(array);

    }
    public static void insertNumbersInArray(int[] array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
    }

    public static void insertOnlyEven(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}

class ex34{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[20];
        System.out.println("Enter a number: ");
        int userInput = scn.nextInt();
        multiplyArray(array,userInput);
        printArray(array);

    }
    public static void multiplyArray(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            array[i] = num * (i+1);
        }
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class ex35{
    public static void main(String[] args) {
        int[] array = {2,3,6,7,8};
        multiplyByThree(array);
        ex26.printArray(array);
    }
    public static void multiplyByThree(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                array[i] *= 3;
            }
        }
    }
}

class ex36{
    public static void main(String[] args) {
        int[] array = {2,3,6,9,11};
        boolean result = isUpArray(array);
        System.out.println(result);
    }
    public static boolean isUpArray(int[] array){
        for (int i = 1; i < array.length; i++) {
            int firstNum = array[i-1];
            if(firstNum > array[i]){
                return false;
            }
        }
        return true;
    }
}

class ex37{
    public static void main(String[] args) {
        int[] array = {2,2,2,5,1};
        int result = checkIndexSumNum(array, 9);
        System.out.println(result);

    }
    public static int checkIndexSumNum(int[] array , int num){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(sum < num){
                sum +=array[i];
            }
            if(sum > num){
                return i;
            }
        }
        return -1;
    }
}

class ex38{

}