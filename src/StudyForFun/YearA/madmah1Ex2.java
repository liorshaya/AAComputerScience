package StudyForFun.YearA;

public class madmah1Ex2 {
    public static void main(String[] args) {
        int[] array = {3, 10, 17, 24, 31, 38};
        int[] array2 = {-10,-8,-6,-4,-2,0,2,4};
        boolean result = isMathSeries(array2);
        System.out.println(result);
    }
    public static boolean isMathSeries(int[] array){
        int diff = array[1] - array[0];

        for (int i = 0; i < array.length-1; i++) {
            if(array[i + 1] - array[i] != diff ){
                return false;
            }
        }
        return true;
    }
}

class exes2{
    public static void main(String[] args) {
        int[] array = {2,0,-2,0,2,4,6,4,2,0,-2};
        boolean result = isAbsSeries(array);
        System.out.println(result);
    }
    public static boolean isAbsSeries(int[] array){
        int deff = Math.abs(array[1] - array[0]);
        int negDiff =-deff;

        for (int i = 0; i < array.length-1; i++) {
            if(array[i+1] - array[i] != deff && array[i+1] - array[i] != negDiff ){
                return false;
            }
        }
        return true;
    }
}

class exes3{
    public static void main(String[] args) {
        int[] array1 = {5435,32,355,56543,54564,323666,423,434,564,323,545};
        int[] array2 = {3434,45,365655,56767543,454,32,4,43,78,443,24344545};

        int[] result = createNewArrayWithNumDig(array1,array2,6);
        printArray(result);

    }
    public static int[] createNewArrayWithNumDig(int[] array1 , int[] array2, int num){
        double numDigit = 0;
        if(num != 1) {
            numDigit = Math.pow(10, num) - 1;
        }

        int countArray1 = 0;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] > numDigit){
                countArray1++;
            }
        }
        int countArray2 = 0;
        for (int i = 0; i < array2.length; i++) {
            if(array2[i] > numDigit){
                countArray2++;
            }
        }

        int[] newArray = new int[countArray1+countArray2];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] > numDigit){
                newArray[index] = array1[i];
                index++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if(array2[i] > numDigit) {
                newArray[index] = array2[i];
                index++;
            }
        }
        return newArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
