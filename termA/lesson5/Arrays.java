package termA.lesson5;

import java.util.Random;

//Ex1
public class Arrays {

    public static void main(String[] args) {
        int[] array = {2, 4, 356, 6, 7, 8, 11, 555, 6, 6};
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
    }
}

class Ex2{
    public static void main(String[] args) {
        sizeWithNumbersArray(8);
    }
    public static void sizeWithNumbersArray(int size) {
        Random rnd = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print(rnd.nextInt(1, 101));

            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
    }
}

class Ex3{
    public static void main(String[] args) {
        sizeAndValueArray(5,3.2);
    }
    public static void sizeAndValueArray(int size, double value) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print(value);

            if (i < array.length - 1) {
                System.out.print(",");

            }
        }
    }
}

class Ex4{
    public static void main(String[] args) {
        int[] testArray = new int[10];

        arrayUntilRandomNumber(testArray,50);
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
    public static void arrayUntilRandomNumber(int[] array, int number) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(0, number + 1);
        }
    }
}

class Ex5{
    public static void main(String[] args) {
        int[] result = consecutiveNumbers(5, 1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] consecutiveNumbers(int sizeArray, int firstNumber) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = firstNumber;
            firstNumber++;
        }
        return array;
    }
}

class Ex6{
    public static void main(String[] args) {
        int[] array = {2, 4, 356, 6, 7, 8, 11, 555, 6, 6};
        System.out.println("The sum of the array is: " + sumArray(array));
    }
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

class Ex7{
    public static void main(String[] args) {
        int[] array = {2, 4, 356, 6, 7, 8, 11, 555, 6, 6};
        findMaxValue1(array);
    }
    public static void findMaxValue1(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("The maximum value is: " + maxValue);
    }
}

class Ex8{
    public static void main(String[] args) {
        int[] array = {2, 4, 356, 6, 7, 8, 11, 555, 6, 6};
        System.out.println("The highest number is: "+ findMaxValue2(array));
    }
    public static int findMaxValue2(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}

    class Ex9 {
        public static void main(String[] args) {
            System.out.println("The maximum number is: " + randomSizeArrayFindMaxNumber(4));
        }
        public static int randomSizeArrayFindMaxNumber(int sizeArray) {
            Random rnd = new Random();
            int[] array = new int[sizeArray];
            int maxValue = array[0];

            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(101);
            }
            System.out.print("Array contents: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
            return maxValue;
        }
    }

class Ex10 {
        public static void main(String[] args) {
            int[] array = {2, 4, 356, 6, 7, 8, 11, 555, 6, 6};
            System.out.println(duplicateNumber(array, 6));

        }

        public static int duplicateNumber(int[] array, int number) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    counter++;
                }
            }
            return counter;
        }
    }

class Ex11{
    public static void main(String[] args) {
    int[] array = {1,5,9,5,4,6,7,8,5,1};
        int[] result = numberRemoved(array,5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] numberRemoved(int[] array , int number){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(number == array[i]){
                count++;
            }
        }
        int[] result = new int[array.length-count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(number != array[i]){
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
}

class Ex12{
    public static void main(String[] args) {
        processArrayWithoutMostFrequent(10);
    }
    public static void processArrayWithoutMostFrequent(int sizeArray){
        Random rnd = new Random();
        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10*sizeArray);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int match = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if(i != j && array[i] == array[j]){
                    counter++;
                }
            }
            if(counter > match){
                match = counter;
                number = array[i];
            }
        }
        int newSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                newSize++;
            }
        }

        int[] newArray = new int[array.length-newSize];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != number){
                newArray[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}

class Ex13{
    public static void main(String[] args) {
        int[] array = {1,5,9,5,4,6,7,8};
        int[] secArray = {1,5,9,5,4,6,7,8};
        int result = compareArraysSum(array,secArray);

        if(result == 1){
            System.out.println("1: The sum of the first array is greater.");
        } else if (result == 2) {
            System.out.println("2: The sum of the second array is greater.");
        }
        else{
            System.out.println("0: The sums are equal.");
        }
    }

    public static int compareArraysSum(int[] array , int[] secArray){

        int sumFirstArray = 0;
        int sumSecArray = 0;

        for (int i = 0; i < array.length; i++) {
            sumFirstArray += array[i];
        }
        for (int i = 0; i < secArray.length; i++) {
            sumSecArray += secArray[i];
        }

        if(sumFirstArray > sumSecArray){
            return 1;
        }
        else if (sumSecArray > sumFirstArray) {
            return 2;
        }
        else{
            return 0;
        }
    }
}

class Ex14{
    public static void main(String[] args) {
        int[] result = splitNumberToArray(123453434);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] splitNumberToArray(int splitNumber){
        int count = 0;
        int temp = splitNumber;
        while(temp > 0){
            temp = temp/10;
            count++;
        }
        int[] array = new int[count];

        int index = count-1;
        while(splitNumber > 0){
            array[index] = splitNumber % 10;
            splitNumber/= 10;
            index--;
        }
        return array;
    }
}

class Ex15{
    public static void main(String[] args) {
    int[] array = {4,12,56,56,12,4};
    boolean result= filandromArray(array);
    System.out.println(result);
    }

    public static boolean filandromArray(int[] array) {
        int start = 0;
        int end = array.length-1;

        while(start < end){
            if(array[start] != array[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

class Ex16{
    public static void main(String[] args) {
    int[] result = filandromNumber(134321);
        System.out.println(Ex15.filandromArray(result));
    }
    public static int[] filandromNumber(int number){
        int count = 0;
        int temp = number;
        while(temp > 0){
            temp /= 10;
            count++;
        }

        int[] arrayNumber = new int[count];

        int index = count-1;
        while(number > 0){
            arrayNumber[index] = number % 10;
            number /= 10;
            index--;

        }
        return arrayNumber;
    }
}

class Ex17{
    public static void main(String[] args) {
        int[] array = {11,121,565,56,12};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            int[] temp = Ex16.filandromNumber(array[i]);
            if (Ex15.filandromArray(temp)){
                counter++;
            }
        }
        System.out.println(counter);

    }

}