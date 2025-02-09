package StudyForFun.YearA;

public class exam1 {
    public static void main(String[] args) {
        String text = "I want it, I got it";
        String result =removeMostCommonWord(text);
        System.out.println(result);
    }

    public static String removeMostCommonWord(String text){
        String[] newArray = text.split(" ");
        String[] textLowerCase = text.toLowerCase().split(" ");

        String maxWord ="";
        int mostCommonCount = 0;
        for (int i = 0; i < textLowerCase.length; i++) {
            int count = 1;
            for (int j = i+1 ; j < textLowerCase.length; j++) {
                if(newArray[i].equals(newArray[j])){
                    count++;
                }
            }
            if(count > mostCommonCount){
                mostCommonCount = count;
                maxWord = newArray[i];
            }
        }
        String result = "";
        for (int i = 0; i < newArray.length; i++) {
            if(!newArray[i].equals(maxWord)){
                result += newArray[i] + " ";
            }
        }

        return result;
    }
}

class Ex_2 {
    public static void main(String[] args) {
        int result = calculateSquareRoot(15);
        System.out.println(result);
    }

    public static int calculateSquareRoot(int number) {
        int result = 0;
        for (int i = 1; i * i <= number; i++) {
            result = i;
        }
    return result;
    }
}

class Ex_3{
    public static void main(String[] args) {
    int[] result = getAllUniqueFactors(12);
        printArray(result);
    }
    public static int[] getAllUniqueFactors(int number){
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                count++;
            }
        }
        int[] resultArray = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                resultArray[index] = i;
                index++;
            }
        }
        return resultArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class Ex_4{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverseArray(arr);
        ex26.printArray(arr);
    }
    public static void reverseArray(int [] arr){
        for (int i = 0 , j = arr.length-1; i < arr.length/2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

class Ex_5{
    public static void main(String[] args) {
        String name = "Jackson";
        String name1 = "Jackson";
        String name2 = "Jaxon";
        System.out.println(encodeSoundex(name));
        System.out.println(areSoundexCodesSimilar(name1,name2));
    }
    public static String encodeSoundex(String name){
        String encoName = "";
        encoName += name.toUpperCase().charAt(0);
        for (int i = 1; i < name.length(); i++) {
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'|| name.charAt(i) == 'u'||name.charAt(i) == 'w'|| name.charAt(i) == 'h'|| name.charAt(i) == 'y'){
                encoName += "";
            }
            else if(name.charAt(i) == 'v' || name.charAt(i) == 'p' || name.charAt(i) == 'f' || name.charAt(i) == 'b'){
                encoName += "1";
            }
            else if(name.charAt(i) == 'c' || name.charAt(i) == 'g' || name.charAt(i) == 'j' || name.charAt(i) == 'k' || name.charAt(i) == 'q' || name.charAt(i) == 's' || name.charAt(i) == 'x' || name.charAt(i) == 'z'){
                encoName += "2";
            }
            else if(name.charAt(i) == 'd' || name.charAt(i) == 't' ){
                encoName += "3";
            }
            else if(name.charAt(i) == 'l'){
                encoName += "4";
            } else if (name.charAt(i) == 'm' || name.charAt(i) == 'n') {
                encoName += "5";
            }
            else if(name.charAt(i) == 'r'){
                encoName += "6";
            }
        }

        String result = encoName.charAt(0) + "";
        for (int i = 1; i < encoName.length(); i++) {
            if(i < encoName.length() - 1 && encoName.charAt(i) == encoName.charAt(i+1)){
                continue;
            }
            result += encoName.charAt(i);
        }


        while(result.length() < 4){
            result += "0";
        }


        return result;
    }

    public static boolean areSoundexCodesSimilar(String name1, String name2){
        String check1 = encodeSoundex(name1);
        String check2 = encodeSoundex(name2);

        if(check1.equals(check2)){
            return true;
        }
        return false;
    }
}



