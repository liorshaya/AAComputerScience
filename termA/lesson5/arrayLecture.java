package termA.lesson5;

public class arrayLecture {
    public static void main(String[] args) {
       int [] array= {1,2,5,2,8,11};
//        printingArray(array);
//        System.out.println(numberInsideArray(array,2));
//        System.out.println(evenIndex(array));
//        System.out.println(sumNumbers(array));
        System.out.println(duplicateNumbers(array));
    }

    public static void printingArray(int[] array){
        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean numberInsideArray(int[] array , int number){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }

    public static int evenIndex(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                sum += array[i];
            }

        }
        return sum;
    }

    public static int sumNumbers(int[] array){
        int sum = 0 ;
        for(int i = 0 ; i<array.length ; i++ ){
            if(array[i] % 2 ==0){
                sum+= array[i];
            }
        }
        return sum;
    }

    public static boolean duplicateNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = 0; j < array.length; j++) {
                if(i != j && current == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
}



