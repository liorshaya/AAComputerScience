package termA.lesson5;

public class studyTigbur {
    public static void main(String[] args) {
        int[] array = creatingArrayWithTwoNumbers(3, 10);
        int[] newArray = {1,2,5,3,5,4};
        //printArray(array);

        int maxNumber = theBiggestNumber(newArray);
        System.out.println(maxNumber);

        int countNum = checkNumberInArray(newArray, 7);
        System.out.println(countNum);

        int[] aa = function(newArray, 5);
        printArray(aa);
    }

    public static int[] creatingArrayWithTwoNumbers(int num1, int num2) {
        int[] array = new int[num1];
        for (int i = 0; i < array.length; i++) {
            array[i] = num2;
            num2++;

        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int theBiggestNumber(int[] array){
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxNumber){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static int checkNumberInArray(int[] array , int num){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                count++;
            }

        }
        return count;
    }

    public static int[] function(int[] array , int num){
        int count = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num){
                count++;
            }
        }
        int[] newArray = new int[array.length-count];
        for (int i = 0; i < array.length; i++) {
            if(array[i] != num){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}



