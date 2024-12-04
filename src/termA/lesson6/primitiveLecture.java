package termA.lesson6;

import java.util.Scanner;

public class primitiveLecture {

    public static void main(String[] args) {

        int[] array = new int[10];
        initArray(array);
        printArray(array);
        System.out.println();
        reversArray(array);
        printArray(array);
    }



    public static void initArray(int[] array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }
    }

    public static void reversArray(int[] array){
    int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[i];
        }

        int index= 0;
        for (int i = array.length-1; i >= 0; i--) {
            array[i] = reversedArray[index];
            index++;
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}