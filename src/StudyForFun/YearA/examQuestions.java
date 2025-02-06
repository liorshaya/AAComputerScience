package StudyForFun.YearA;

import java.util.Random;

public class examQuestions {
    public static void main(String[] args) {
        int[] array = {4, 1, 7, 2, 8, 1, 0};
        //replacedSidraArray(6);
        replacedSidraArray2(6);
        boolean result = isReplacedSeries(array);
        System.out.println(result);

    }

    public static int[] replacedSidraArray(int number) {
        Random rnd = new Random();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        int count = 0;
        int count2 = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] > array[i]) {
                count++;
            } else {
                count = 0;
            }
            if (array[i - 1] < array[i]) {
                count2++;
            } else {
                count2 = 0;
            }
            if (count == 2) {
                array[i] = rnd.nextInt(array[i - 1], 100);
                count = 0;
            }
            if (count2 == 2) {
                array[i] = rnd.nextInt(array[i - 1] - 1);
                count2 = 0;

            }

        }
        return array;
    }

    public static int[] replacedSidraArray2(int number) {
        Random rnd = new Random();

        int[] array = new int[number];
        array[0] = rnd.nextInt(1000);

        boolean isIncreasing = rnd.nextBoolean();

        for (int i = 1; i < array.length; i++) {
            int step = rnd.nextInt(100);
            if (isIncreasing) {
                array[i] = array[i - 1] + step;
            } else {
                array[i] = Math.max(1, array[i - 1] - step);
            }
            isIncreasing = !isIncreasing;
        }
        return array;
    }
    public static boolean isReplacedSeries(int[] array){
        boolean isIncreasing = array[0] < array[1];

        for (int i = 1; i < array.length-1; i++) {
            if (isIncreasing){
                if(array[i] < array[i+1]){
                    return false;
                }
            }
            else {
               if(array[i] > array[i+1]){
                   return false;
               }
            }

            isIncreasing = !isIncreasing;

        }
        return true;
    }
}

class Exe2{
    public static void main(String[] args) {
        boolean result = isEasyPassword(26345117);
        System.out.println(result);
    }
    public static boolean isEasyPassword(int password){
        int count = 0;
        int temp = password;
        while (temp > 0){
            temp /= 10;
            count++;
        }

        int[] array = new int[count];
        for (int i = array.length-1; i >= 0 ; i--) {
            array[i] = password % 10;
            password /= 10;
        }

        int helfLengthArray;
        if(count % 2 == 0){
            helfLengthArray = array.length/2;
        }
        else{
            helfLengthArray = (array.length/2) + 1;
        }

        int counterUp = 1;
        int counterDown = 1;

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] + 1 == array[i+1]){
                counterUp++;
            }
            if(array[i] == array[i+1]+1){
                counterDown++;
            }
            if(helfLengthArray == counterUp || helfLengthArray == counterDown){
                return true;
            }
        }

        int counterDupStrikeNum = 1;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == array[i+1]){
                counterDupStrikeNum++;
            }
            else{
                counterDupStrikeNum = 1;

            }
            if(counterDupStrikeNum == 3){
                return true;
            }
        }
        return false;
    }
}

class Exe3{
    public static void main(String[] args) {
        String[] array = {"Bab","Heo","Boo","Per","Ded","Del", "Pea", "Dan","Cat","Dog","Lio"};
        String[] result = stringSizeByNum(array,3);
        //printArray(result);
        char result2 = mostFirstChar(array,3);
        System.out.println(result2);
    }
    public static String[] stringSizeByNum(String[] array , int number){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() == number){
                count++;
            }
        }

        String[] newArray = new String[count];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() == number){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }

    public static void printArray (String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static char mostFirstChar(String[] array , int num){
        String[] newArray = stringSizeByNum(array,num);

        char mostChar = newArray[0].charAt(0);
        int mostCount = 1;
        for (int i = 0; i < newArray.length; i++) {
            int tempCount = 1;
            for (int j = i + 1; j < newArray.length; j++) {
                if(newArray[i].charAt(0) == newArray[j].charAt(0)){
                    tempCount++;
                }
            }
            if(tempCount > mostCount){
                mostCount = tempCount;
                mostChar = newArray[i].charAt(0);
            }
        }
        return mostChar;
    }


}
