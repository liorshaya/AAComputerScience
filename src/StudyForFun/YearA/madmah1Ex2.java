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
        int numDigit = 0;
        if(num != 1) {
            numDigit = (int) Math.pow(10, num) - 1;
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

class exes4{
    public static void main(String[] args) {
        int[] array = {1,2,5,-5,3,-7,2};
        boolean result = isZigzagArray(array);
        System.out.println(result);
        boolean result2 = isSubArrayBySize(array,4);
        System.out.println(result2);
    }
    public static boolean isZigzagArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                return false;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if((array[i-1] > 0 && array[i] > 0) || (array[i-1] < 0 && array[i] < 0)){
                return false;
            }
        }
        return true;
    }

    public static boolean isSubArrayBySize(int[] array , int size){
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if((array[i-1] > 0 && array[i] > 0) || (array[i-1] < 0 && array[i] < 0)){
                count = 1;
            }
            else{
                count++;
            }
        }
        if(count >= size){
            return true;
        }
        return false;
    }
}

class exes5{
    public static void main(String[] args) {
        int[] arr1 = {1,5,8,3,7,1,3,6,2,7,1,6,7,1,7,8,1,2,1,5,7,7,1,1,3};
        int[] arr2 = {1,6,2};
        int result = mostCommonNumNotInArr2(arr1,arr2);
        System.out.println(result);
    }
    public static int mostCommonNumNotInArr2(int[] arr1 , int[] arr2){
        int mostNum = arr1[0];
        int mostCount = 1;

        for (int i = 0; i < arr1.length; i++) {
            int tempCount = 1;
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i] == arr1[j]){
                    tempCount++;
                }
            }
            int tempNum = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if(arr2[j] != mostNum){
                    continue;
                }
            }
            if(tempCount > mostCount){
                mostCount = tempCount;
                mostNum = tempNum;

            }


        }
        return mostNum;

    }
}
