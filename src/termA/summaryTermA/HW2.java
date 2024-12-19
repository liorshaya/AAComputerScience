package termA.summaryTermA;


import java.util.Random;
import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String randomWord = giveRandomString();

        System.out.println("Hello and welcome to Wordle game!");
        int rounds= 6;
        boolean winnerFlag = false;
        while(rounds > 0){
            System.out.println("Enter your word guess: ");
            String guessInput = scanner.nextLine();

            if(wordNot5Char(guessInput)){
                System.out.println("Your word length isn't 5 chars.");
                continue;
            }
            char[] result = getFeedback(randomWord , guessInput);
            printCharArray(result);
            System.out.println();

            rounds--;


            if(isWinner(result)){
               winnerFlag = true;
                break;
            }
            System.out.println("Remaining attempts: " + rounds);
        }

        if(winnerFlag){
            System.out.println("Yoo Hoo you found the secret word!");
        }
        else{
            System.out.println("Close one, you can try again :)");
            System.out.println("The word is: " + randomWord);
        }
    }

    public static String giveRandomString(){
        Random random = new Random();
        String[] words = {"apple", "house", "water", "table", "chair", "bread", "cloud", "plant", "dress",
                "light", "beach", "dance", "lunch", "horse", "glass", "happy", "movie", "train", "fruit", "storm"};

       return words[random.nextInt(words.length)];
    }

    public static boolean wordNot5Char(String guess){
        if(guess.length() == 5){
            return false;
        }
        return true;
    }

    public static char[] getFeedback(String word , String guess){
        char[] checkerYG_ = new char[5];
        guess = guess.toLowerCase();

        for (int i = 0; i < guess.length(); i++) {
            if(guess.charAt(i) == word.charAt(i)){
                checkerYG_[i] = 'G';
            }
            else if(word.indexOf(guess.charAt(i)) == -1 ){
                checkerYG_[i] = '_';
            }
            else{
                checkerYG_[i] = 'Y';
            }
        }
        return checkerYG_;
    }

    public static void printCharArray(char[] arrayResult){
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i]);
        }
    }

    public static boolean isWinner(char[] result){
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 'G'){
                return false;
            }
        }
        return true;
    }
}
