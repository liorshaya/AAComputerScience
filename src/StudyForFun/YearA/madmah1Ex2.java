package StudyForFun.YearA;

import java.util.Scanner;

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
        int[] arr1 = {1,5,8,3,5,7,5,1,3,6,2,7,1,5,6,7,1,7,8,5,5,1,2,1,5,5,7,7,1,1,3};
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
            boolean foundInArr2 = false;
            for (int j = 0; j < arr2.length; j++) {
                if(arr2[j] == tempNum){
                    foundInArr2 = true;
                    break;
                }
            }
            if(!foundInArr2 && tempCount > mostCount){
                mostCount = tempCount;
                mostNum = tempNum;

            }
        }
        return mostNum;
    }
}

class exes6{
    public static void main(String[] args) {
        int[] array = {10,5,8,7,3,12,11,4};
        boolean result = isDuoArray(array);
        System.out.println(result);

        int[] array2 = {8,7,3,12,7,6,10,5};
        boolean result2 = isPartDuoArray(array2);
        System.out.println(result2);

    }
    public static boolean isDuoArray(int[] array){
        int duoSum = array[0] + array[1];

        if(array.length % 2 != 0){
            return false;
        }

        for (int i = 0; i < array.length-1; i+=2) {
            if(array[i] + array[i+1] != duoSum){
                return false;
            }
        }
        return true;
    }

    public static boolean isPartDuoArray(int[] array){
        int duoSum = array[0] + array[1];

        int count = 0;

        if(array.length % 2 != 0){
            return false;
        }

        int requiredCount = (array.length/2/2) +1;

        for (int i = 0; i < array.length-1; i+=2) {
            if(array[i] + array[i+1] == duoSum){
                count++;
            }
        }
        if(count >= requiredCount){
            return true;
        }
        return false;
    }
}

class exes7{
    public static void main(String[] args) {
        String[] array = {"sadasd","dsda", "asdasdf", "dsdsd", "fgdfd", "asdsad", "sasds", " sdffdf"};
        char result = mostCommonChar(array);
        System.out.println(result);
    }
    public static char mostCommonChar(String[] array){
        char mostCommonChar = array[0].charAt(0);
        int mostCount = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                int tempCount = 1;
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length(); l++) {
                        if(array[k].charAt(l) == array[i].charAt(j)){
                           tempCount++;
                        }
                    }

                }
                if(tempCount > mostCount){
                    mostCount = tempCount;
                    mostCommonChar = array[i].charAt(j);
                }
            }

        }
        return mostCommonChar;
    }
}

class exes8{
    public static void main(String[] args) {
        String[] array = {"apple","banana","cherry","date","fig"};
        String[] array2 = { "fig", "date","cherry","banana","apple"};
        String[] result = reversedArray(array);
        printArray(result);
        System.out.println();
        boolean result2 = isSameReversedArrays(array,array2);
        System.out.println(result2);

    }
    public static String[] reversedArray(String[] array){
        String[] newArray = new String[array.length];

        int index = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            newArray[index] = array[i];
            index++;
        }
        return newArray;
    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean isSameReversedArrays(String[] array1 , String[] array2){

        String[] newArray = reversedArray(array1);

        for (int i = 0; i < newArray.length; i++) {
            if(!newArray[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }
}

class exes9{
    public static void main(String[] args) {
        int[] array = {6,9,7,8,12,12,10,7,7,9,11};
        boolean result = isProxomityArray(array,5);
        System.out.println(result);
    }
    public static boolean isProxomityArray(int[] array, int max){

        for (int i = 0; i < array.length-2; i++) {
            int Min = Math.min(array[i],Math.min(array[i+1],array[i+2]));
            int Max = Math.max(array[i],Math.max(array[i+1],array[i+2]));

            int diff = Math.abs(Max - Min);

            if(diff > max){
                return false;
            }
        }
        return true;
    }
}

class exes10{
    public static void main(String[] args) {
        String[] array = {"yello", "dfdi", "dfdfa", "dsfdi","sdsdi" , "sadsada"};
        char result = mostCommonCharLastWordInArray(array);
        System.out.println(result);
    }
    public static char mostCommonCharLastWordInArray(String[] array){
        int mostCount = 0;
        char mostChar = array[0].charAt(array[0].length()-1);
        for (int i = 0; i < array.length; i++) {
            int currCount = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i].charAt(array[i].length()-1) == array[j].charAt(array[j].length()-1)){
                    currCount++;
                }
            }
            if(currCount > mostCount){
                mostCount = currCount;
                mostChar = array[i].charAt(array[i].length()-1);
            }
        }
        return mostChar;
    }
}

class exes11{
    public static void main(String[] args) {
        int[] array = {5,8,1,9};
        int number = circulateArray(array,-7);
        System.out.println(number);
    }
    public static int circulateArray(int[] array, int index){
        int numberInIndex = 0;
        if(index >= 0){
            numberInIndex = array[index % array.length];

        }
        else{
            int negIndex = (index % array.length)+array.length;
            numberInIndex = array[negIndex];
        }
        return numberInIndex;
    }
}

class exes12{
    public static void main(String[] args) {
        int[] array1 = {1,7,9,1,6,4,3,8};
        int[] array2 ={4,6,9,9,2,1,0,1};
        int[] result = binaricArray(array1,array2);
        printArray(result);
    }
    public static int[] binaricArray(int[] array1 , int[] array2){
        if(array1.length != array2.length){
            return new int[0];
        }
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] > array2[i]){
                newArray[i] = 1;
            } else if (array1[i] < array2[i]) {
                newArray[i] = -1;
            }
            else{
                newArray[i] = 0;
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

class exes13{
    public static void main(String[] args) {
        boolean result =isPrimary(96);
        System.out.println(result);

        String result2 = perukLegormin(12600);
        System.out.println(result2);
    }
    public static boolean isPrimary(int number){
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static String perukLegormin(int number){
        boolean checkPrimery = isPrimary(number);
        String calculating = "";
        if(checkPrimery){
            System.out.println("The number is primary!");
        }
        else{
            int temp = number;
            while (number % 2 == 0){
                calculating += "2 ";
                number /= 2;
                if(number > 1){
                    calculating += "* ";
                }
            }
            for (int i = 3; i < Math.sqrt(number); i+=2) {
                while (number % i == 0){
                    calculating += i + " ";
                    number /= i;
                    if(number > 1){
                        calculating += "* ";
                    }
                }
            }
            if(number > 1){
                calculating += number;
            }
            calculating += " = " + temp;
        }
        return calculating;
    }
}

class exes14{
    public static void main(String[] args) {
        String text = "רבע הלילה עבר";
        boolean result = isPolindrom(text);
        System.out.println(result);
    }
    public static boolean isPolindrom(String text){

        int left = 0;
        int right = text.length()-1;

        while(left < right){
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class exes15{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scn.nextInt();
        if(number < 100 || number > 999){
            System.out.println("System finished.");
        }
        else{
            boolean result = isSeriesUpDown(number);
            System.out.println(result);
        }

    }
    public static boolean isSeriesUpDown(int number){
        int unit = number % 10;
        int tens = (number/10) % 10;
        int hun = number/100;

        if(unit + 2 == tens + 1 && tens + 1 == hun){ //123
            return true;
        }
        else if(hun + 2 == tens + 1 && tens + 1 == unit){//321
            return true;
        }
        return false;
    }
}

class exes16{
    public static void main(String[] args) {
        int[] array1 = {2,3,5,6,7,8};
        int[] array2 = {3,5,7,8};
        double[] result = avgEachCell(array1,array2);
        printArray(result);

    }
    public static double[] avgEachCell(int[] array1 , int[] array2){
        int lenNewArray = array2.length;
        if(array1.length > array2.length){
            lenNewArray = array1.length;
        }

        double[] newArray = new double[lenNewArray];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }

        double[] tempArray = new double[lenNewArray];
        for (int i = 0; i < array2.length; i++) {
            tempArray[i] = array2[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (newArray[i] + tempArray[i]) / 2;
        }

        return newArray;
    }

    public static void printArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class exes17{
    public static void main(String[] args) {
        String text = "I want it I got it";
        String result = rasheTevotWord(text);
        System.out.println(result);
    }
    public static String rasheTevotWord(String text){
        String[] wordArray = text.split(" ");

        String orgRtw = "";

        for (int i = 0; i < wordArray.length; i++) {
            orgRtw += wordArray[i].charAt(0);

        }

        String rtwLowerCase = orgRtw.toLowerCase();

        String result = "";

        for (int i = 0; i < orgRtw.length(); i++) {
            char currChar = orgRtw.charAt(i);
            char lowerCaseChar = rtwLowerCase.charAt(i);

            if(rtwLowerCase.indexOf(lowerCaseChar) == i){
                result += currChar;
            }

        }
        return result;
    }
}

class exes18{
    public static void main(String[] args) {
        int[] array = {1,8,12,5,6};
        boolean result = canProduce(array,18);
        System.out.println(result);
    }
    public static boolean canProduce(int[] numbers, int goal){

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == goal){
                    return true;
                }
            }

        }
        return false;
    }
}

class exes19{
    public static void main(String[] args) {
        boolean result = isAnagram("aagwbagav", "abawggava");
        System.out.println(result);
    }
    public static boolean isAnagram(String text1, String text2){

        if(text1.length() != text2.length()){
            return false;
        }
        else{
            String textTemp1 = text1;
            String textTemp2 = text2;
            for (int i = 0; i < text1.length(); i++) {
                char oneChar = text1.charAt(i);
                for (int j = 0; j < text2.length(); j++) {
                    if(oneChar == text2.charAt(j)){
                        textTemp1 = textTemp1.replaceFirst(oneChar+"","");
                        textTemp2 = textTemp2.replaceFirst(oneChar+"" , "");
                    }
                }
            }
            if(textTemp1.equals(textTemp2)){
                return true;
            }
        }

        return false;
    }
}

class exes20{
    public static void main(String[] args) {

    }
}




