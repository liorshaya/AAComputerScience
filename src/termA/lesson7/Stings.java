package termA.lesson7;

import java.util.Scanner;

//Exe1
public class Stings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter first Name: ");
        String lastName = scanner.nextLine();
        String result = getFullName(firstName,lastName);
        System.out.println(result);
    }
    public static String getFullName(String firstName , String lastName){
        return (firstName + " " + lastName);
    }
}

class Exe2 {
    public static void main(String[] args) {
        String firstString = "asdfgh7";
        String secondString = "asdfghjk10";
        String result = whichStringIsHigher(firstString,secondString);
        System.out.println(result);
    }
    public static String whichStringIsHigher(String string1, String string2){
        if(string1.length() > string2.length()){
            return string1;
        }
        else{
            return string2;
        }
    }
}

class Exe3{
    public static void main(String[] args) {
        String firstString = "asdfgh7";
        System.out.println(checkLengthWithNumber(firstString, 8));
    }

    public static boolean checkLengthWithNumber(String text, int number){
        if(text.length() == number){
            return true;
        }
        else{
            return false;
        }
    }
}

class Exe4{
    public static void main(String[] args) {
        System.out.println(compareString());
    }
    public static int compareString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text1 = scanner.nextLine();
        System.out.println("Enter another text:");
        String text2 = scanner.nextLine();

        if(text1.equals(text2)){
            return 1;
        }
        else if (text1.charAt(0) == text2.charAt(0)) {
            return 2;
        }
        else{
            return 3;
        }
    }
}

class Exe5{
    public static void main(String[] args) {
    String text = "Hello";
    int counter = checkCharCount(text,'l');
    System.out.println("I found " + counter + " chars in this string");
    }
    public static int checkCharCount(String text, char toCount){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == toCount){
                count++;
            }
        }
        return count;
    }
}

class Exe6{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter string: ");
        String text1 = scn.nextLine();
        System.out.println("Enter another string:");
        String text2 = scn.nextLine();
        boolean result = equalStrings(text1,text2);
        System.out.println(result);

    }
    public static boolean equalStrings(String text1, String text2){
        if(text1.length() != text2.length()){
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if(text1.charAt(i) != text2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

class Exe7{
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "blueberry"};
        String highestString = checkHighestString(array);
        System.out.println("The string with the highest length is: " + highestString);

    }
    public static String checkHighestString(String[] array){
        String max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i].length() > max.length()){
                max = array[i];
            }
        }
        return max;
    }
}

class Exe8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String phoneNumber = scanner.nextLine();
        String fixedPhoneNumber = fixPhoneNumberFormat(phoneNumber);
        System.out.println(fixedPhoneNumber);
    }
    public static String fixPhoneNumberFormat(String phoneNumber){
        String fixedNumber = phoneNumber;
        if(fixedNumber.length() ==11 && fixedNumber.charAt(3) == '-'){
            return fixedNumber;
        }
        if(fixedNumber.length() == 12 && fixedNumber.startsWith("972")){
            fixedNumber = "0" +fixedNumber.substring(3);
        }
        if(fixedNumber.length() == 10 && fixedNumber.startsWith("05")){
            return fixedNumber.substring(0,3) + "-" + fixedNumber.substring(3);
        }
        return "";
    }
}

class Exe9{
    public static void main(String[] args) {
        String[] array = {"Apple","Banan$a","Watermelo$","Di$k"};
        System.out.println(while$PrintString(array));
    }
    public static String while$PrintString(String[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains("$")){
                return array[i];
            }
        }
        return "";
    }
}

class Exe10{
    public static void main(String[] args) {
    String[] array = {"hamburger" , "banana", "have"};
        printArray(containsStringInArray(array,"ha"));

    }
    public static String[] containsStringInArray(String[] array , String toFind){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains(toFind)){
                count++;
            }
        }
        String[] newArray = new String[count];

        int index =0;
        for (int i = 0; i < array.length; i++) {
                if(array[i].contains(toFind)){
                    newArray[index] = array[i];
                    index++;
                }
        }
        return newArray;
    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class Exe11{
    public static void main(String[] args) {
        System.out.println(replaceString("apple"));
    }
    public static String replaceString(String text){
        String reversed = "";
        for (int i = text.length() -1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }
}

class Exe12{
    public static void main(String[] args) {
        System.out.println(strongPassword("123daasd%"));
    }//apple
    public static boolean strongPassword(String password){
        if(password.length() <= 10 && password.length() >= 8){
            if(password.contains("_") || password.contains("$") || password.contains("%")){
                for (int i = 0; i < password.length(); i++) {
                    for (char j = '0'; j < '9'; j++) {
                        if(password.charAt(i) == j){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

class Exe13{
    public static void main(String[] args) {
        char[] array = {'A','I','O'};
        System.out.println(mostCommonCharInArray("I want it, I got it", array));
    }

    public static char mostCommonCharInArray(String text , char[] charCheck){
        String lowerCase = text.toLowerCase();
        char maxChar = text.charAt(0);
        String charAsString = "";

        for (int i = 0; i < charCheck.length; i++) {
            charAsString += charCheck[i];
        }
        charAsString = charAsString.toLowerCase();

        int charCounter = 0;
        for (int i = 0; i < charAsString.length(); i++) {
            int counter = 0;
            for (int j = 0; j < lowerCase.length(); j++) {
                if(lowerCase.charAt(j) == charAsString.charAt(i)){
                    counter++;
                }
                if( charCounter < counter){
                    maxChar = charAsString.charAt(i);
                    charCounter = counter;
                }
            }
        }
        return maxChar;
    }
}

class Exe14{
    public static void main(String[] args) {
    String text = "Race  .,car";
        System.out.println(flindromString(text));
    }
    public static boolean flindromString(String text){
        text = text.toLowerCase();
        String[] avoid = {" " , "\\." , ","};
        for (int i = 0; i < avoid.length; i++) {
            text = text.replaceAll(avoid[i], "");
        }

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(text.length() - i -1)){
                return false;
            }
        }
        return true;
    }
}

class Exe15{
    public static void main(String[] args) {

        //System.out.println(printFirstCharInWord("Hello from Java"));
        System.out.println(printFirstCharInWord("I want it, I got it"));
    }

    public static String printFirstCharInWord(String text){
        String newStringResult = "";
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstChar = words[i].charAt(0);
                if (newStringResult.indexOf(firstChar) == -1 ) {
                    newStringResult += firstChar;
                }
            }
        }

    return newStringResult;
    }
}

