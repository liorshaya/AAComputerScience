package StudyForFun.YearA.lesson13_targil;

public class Main {

    //implement this
    public static String reverse (String original) {
        String reverseWord = "";
        for (int i = original.length()-1; i >= 0; i--) {
            reverseWord += original.charAt(i);
        }
        return reverseWord;
    }

    //implement this
    public static int sumArrayToDigit (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
         while (sum > 9){
             int tempSum = 0;
             while(sum > 0){
                 tempSum += sum%10;
                 sum /= 10;
             }
             sum = tempSum;
         }

        return sum;
    }

    //implement this
    public static double stringAverageSize (String[] names) {
        double sum = 0;
        int lengthArray = names.length;
        for (int i = 0; i < names.length; i++) {
            sum += names[i].length();
        }
        double beforeResult = sum/lengthArray;
        double check = Math.round(beforeResult *100)/100.0;
        return check;
    }

    //implement this
    public static String mostCommonLastName(String[] names) {
        String[] allLastNames = new String[names.length];

        for( int i = 0 ; i< names.length ; i++){
            String[] part = names[i].split(" ");
            allLastNames[i] = part[part.length-1];
        }
        String mostCommon = allLastNames[0];
        int max = 0;
        for (int i = 0; i < allLastNames.length; i++) {
            int count = 1;
            for (int j = i+1; j < allLastNames.length; j++) {
                if(allLastNames[i].equals(allLastNames[j])){
                    count++;
                }
            }
            if(count > max){
                max = count;
                mostCommon = allLastNames[i];
            }
        }


        return mostCommon;
    }


    public static void main(String[] args) {
        System.out.println("Enter your ID (only numbers!): ");
        //invoke your function for tests here.
        String[] array = {"apple","mom", "Yellow", "double", "Beautiful","leg"};
        double result = stringAverageSize(array);
        System.out.println(result);

        String word = "ABCD";

        String result1 = reverse(word);
        System.out.println(result1);

        int[] array1= {3,5,6,5,4,3,560};
        int result2 =sumArrayToDigit(array1);
        System.out.println(result2);

        String[] fullNamesArray = {"Lior Shaya", "Maya Orlov", "Nehorai Tubul", "aa Shaya",};
        String result3 = mostCommonLastName(fullNamesArray);
        System.out.println(result3);

    }

}
