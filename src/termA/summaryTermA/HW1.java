package termA.summaryTermA;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Enter ID: ");
            int id = scanner.nextInt();

            if ( id > 999999999) {
                System.out.println("Invalid ID,this ID contains more then 9 digits.");
                continue;
            }
            if(checkID(id)){
                System.out.println("Valid ID!");
            }
            else{
                System.out.println("Invalid ID.. try again.");
            }
        }

    }
    public static boolean checkID(int id){
        int[] oneTwoArray = {1,2,1,2,1,2,1,2,1};
        int[] idArray = new int[9];


        for (int i = 8; i >=0; i--) {
            idArray[i] = id % 10;
            id /= 10;
        }

        int sum = 0;
        for (int i = 0; i < oneTwoArray.length; i++) {
            int multiplyArrays = idArray[i] * oneTwoArray[i];
            if(multiplyArrays > 9 ){
                multiplyArrays = multiplyArrays / 10 + multiplyArrays % 10;
            }
            sum += multiplyArrays;
        }
        
        return sum % 10 == 0;
    }
}
