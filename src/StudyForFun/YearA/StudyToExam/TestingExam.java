package StudyForFun.YearA.StudyToExam;

public class TestingExam {
    public static void main(String [] args){
        int[] array1 = {1,5,8,3,7,1,3,6,2,7,1,6,7,1,7,8,1,2,1,5,7,7,1,1,3};
        int[] array2 = {1,6,2};
        int result = mostCommonInArr1(array1,array2);
        System.out.println(result);
    }

    public static int mostCommonInArr1(int[] arr1 , int[] arr2){

        int mostCommonNum = arr1[0];
        int mostCount = 0;

        for(int i = 0 ; i< arr1.length ; i++){
            int currCount = 0;
            for(int j = 0 ; j < arr1.length ; j++){
                if(arr1[i] == arr1[j]){
                    currCount++;
                }
            }
            boolean isExist = false;
            for(int k = 0 ; k < arr2.length ; k++){
                if(arr1[i] == arr2[k]){
                    isExist = true;
                }
            }

            if(!isExist && currCount > mostCount){
                mostCount = currCount;
                mostCommonNum = arr1[i];
            }
        }
        return mostCommonNum;
    }
}

class exas2{
    public static void main(String [] args){
        int[] array = {10,5,8,7,3,12,10,4};
        boolean result = isDuoSeries(array);
        System.out.println(result);

        int[] array2 = {8,7,3,12,7,6,10,5};
        boolean result2 = isPartDuoSeries(array2);
        System.out.println(result2);
    }

    public static boolean isDuoSeries(int[] array){

        if(array.length == 0){
            return false;
        }

        int sumDuo = array[0] + array[1];

        for(int i = 0 ; i < array.length-1 ; i+=2){
            if(array[i] + array[i+1] != sumDuo){
                return false;
            }
        }
        return true;
    }

    public static boolean isPartDuoSeries(int[] array){


        int sumDuo = array[0] + array[1];

        int checkCount = (array.length/2/2) +1;

        int count = 1;
        for(int i = 2 ; i < array.length-1 ; i+=2){
            if(array[i] + array[i+1] == sumDuo ){
                count++;
            }
        }

        if(count >= checkCount){
            return true;
        }
        return false;

    }
}

class exas{
    public static void main(String [] args){
        String[] array = {"sadasd","dsda", "asdasdf", "dsdsd", "fgdfd", "asdsad", "sasds", " sdffdf","apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew",
                "iceberg", "jackfruit", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya",
                "quince", "raspberry", "strawberry", "tangerine", "ugli", "vanilla", "watermelon",
                "xigua", "yellowfruit", "zucchini"};
        char result = mostCommonCharInAllArrays(array);
        System.out.println(result);
    }

    public static char mostCommonCharInAllArrays(String[] array){
        char mostChar = array[0].charAt(0);
        int mostCount = 0;

        for(int i = 0 ; i < array.length ; i++){

            for(int j = 0 ; j < array[i].length() ; j++){
                int tempCount = 1;

                for(int k = 0 ; k < array.length ; k++){

                    for(int l = 0 ; l < array[k].length() ; l++){
                        if(array[i].charAt(j) == array[k].charAt(l)){
                            tempCount++;
                        }
                    }
                }
                if(tempCount > mostCount){
                    mostCount = tempCount;
                    mostChar = array[i].charAt(j);
                }
            }
        }
        return mostChar;

    }
}

class exas3{
    public static void main(String [] args){
        String[] array = {"apple","banana","cherry","date","fig"};
        String[] result = reversedArray(array);
        printArray(result);
    }

    public static String[] reversedArray(String[] array){

        String[] newArray = new String[array.length];
        int left = array.length-1;

        for(int i = 0 ; i< array.length ; i++){

            newArray[left] = array[i];
            left--;

        }
        return newArray;
    }
    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class exas4{
    public static void main(String [] args){
        String[] array = {"yello", "dfdi", "dfdfa", "dsfdi","sdsdi" , "sadsada"};
        char result = mostCommonLastChar(array);
        System.out.println(result);
    }

    public static char mostCommonLastChar(String[] array){
        char mostCommonChar = array[0].charAt(array[0].length()-1);
        int mostCount = 0;

        for(int i = 0 ; i < array.length ; i++){
            int currCount = 0;
            for(int j = 0 ; j < array.length ; j++){
                if(array[i].charAt(array[i].length()-1) == array[j].charAt(array[j].length()-1)){
                    currCount++;
                }
            }
            if(currCount > mostCount){
                mostCount = currCount;
                mostCommonChar = array[i].charAt(array[i].length()-1);
            }
        }
        return mostCommonChar;
    }
}

class exas5{
    public static void main(String [] args){
        int[] array = {5,8,1,9};
        int number = circulationArray(array,-6);
        System.out.println(number);
    }

    public static int circulationArray(int[] array , int number){
        if(number >= 0){
            return array[number % array.length];
        }
        else{
            if(number % array.length == 0){
                return array[0];
            }

            return array[(number % array.length)+ array.length];
        }
    }
}

class exas6{
    public static void main(String [] args){
        boolean result =isPrimary(96);
        System.out.println(result);

        String result2 = perukLegormim(18);
        System.out.println(result2);
    }

    public static boolean isPrimary(int number){
        for(int i = 2 ; i < number ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }


    public static String perukLegormim(int number){
        String calculation = "";
        int temp = number;

        if(isPrimary(number)){
            calculation = number + " = " + number;
            return calculation;
        }

        while(number % 2 == 0){
            calculation += "2 ";
            number /= 2;
            if(number > 1){
                calculation += "* ";
            }
        }

        for(int i = 3 ; number > 1 ; i+=2){
            if(number % i == 0){
                calculation += "3 ";
                number /= i;
                if(number > 1){
                    calculation += "* ";
                }
            }
        }

        if(number > 1){
            calculation += number;
        }
        calculation += " = " + temp;
        return calculation;
    }
}