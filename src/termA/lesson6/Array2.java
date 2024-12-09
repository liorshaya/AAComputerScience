package termA.lesson6;

public class Array2 {
    //Ex1
    public static void main(String[] args) {
        int[] array = {4,5,6,5,7,8,33};
        int[] result = arrayWithoutDuplicate(array);
        System.out.print("Old Array: ");
        printArray(array);
        System.out.print("Array without duplicates: ");
        printArray(result);

    }

    public static int[] arrayWithoutDuplicate(int[] array){
        int[] temp = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            boolean isUnique = true;

            for (int j = 0; j < count; j++) {
                if(array[i] == temp[j]){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                temp[count] = array[i];
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
       return result;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class Ex2{
    public static void main(String[] args) {
        int[] array = {1,4,3,6,7,9};
        System.out.print("Original Array: ");
        Array2.printArray(array);
        System.out.print("Boolean Array: ");
        boolean[] booleanArray = checkEvenNumbers(array);
        printBooleanArray(booleanArray);
    }

    public static boolean[] checkEvenNumbers(int[] array){

        boolean[] result = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
              result[i] = array[i] % 2 == 0;
        }
        return result;
    }

    public static void printBooleanArray(boolean[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class Ex3{

}
