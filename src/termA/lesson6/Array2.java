package termA.lesson6;

import java.util.Scanner;

public class Array2 {
    //Ex1
    public static void main(String[] args) {
        int[] array = {4,5,6,5,7,8,33};
        int[] result = arrayWithoutDuplicate(array);
        System.out.print("Old Array: ");
        printArray(array);
        System.out.print("Array without duplicates: ");
        printArray(result);

    }

    public static int[] arrayWithoutDuplicate(int[] array){
        int[] temp = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            boolean isUnique = true;

            for (int j = 0; j < count; j++) {
                if(array[i] == temp[j]){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                temp[count] = array[i];
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
       return result;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class Ex2{
    public static void main(String[] args) {
        int[] array = {1,4,3,6,7,9};
        System.out.print("Original Array: ");
        Array2.printArray(array);
        System.out.print("Boolean Array: ");
        boolean[] booleanArray = checkEvenNumbers(array);
        printBooleanArray(booleanArray);
    }

    public static boolean[] checkEvenNumbers(int[] array){

        boolean[] result = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
              result[i] = array[i] % 2 == 0;
        }
        return result;
    }

    public static void printBooleanArray(boolean[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class Ex3{
    public static void main(String[] args) {
        int[] array = {1,3,5,6,7,8,1,0};
        int peakIndex = arrayUpDown(array);
        System.out.println(peakIndex);
    }

    public static int arrayUpDown(int[] array){

        int peakIndex = -1;

        if(array.length <3){
            return -1;
        }

        for (int i = 1; i < array.length-1; i++) { //locatePeak
            if(array[i] > array[i-1] && array[i] > array[i+1]){
                peakIndex = i;
                break;
            }
        }

        for (int i = 0; i < peakIndex; i++) { //locateUpBeforePeak
            if(array[i] >= array[i+1]){
                return -1;
            }
        }

        for (int i = peakIndex; i < array.length-1; i++) {//locateDownAfterPeak
            if(array[i] <= array[i+1]){
                return -1;
            }
        }
        return peakIndex;
    }
}

class Ex4{
    public static void main(String[] args) {
       char[] board = new char[9] ;
       char[] player= {'X','O'};
       char currentPlayer;
       boolean isWinner = false;

        System.out.println("The format is:");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");


        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                currentPlayer = player[0];
            } else {
                currentPlayer = player[1];
            }

            int position = getPositionFromUser(board);
            isWinner = placeSymbolOnBoard(board, position, currentPlayer);

            if(isWinner) {
                break;
            }

        }

        if(!isWinner){
            System.out.println("Tie , Game is Over.");
        }

    }

    public static void printBoardd(char[] board){
        System.out.println("┏━━━┳━━━┳━━━┓");
        for (int i = 0; i < board.length; i++) {
            System.out.print("┃ " + (board[i] == '\u0000' ? ' ' : board[i]) + " ");

            if (i % 3 == 2) {
                System.out.println("┃");

                if (i != board.length - 1) {
                    System.out.println("┣━━━╋━━━╋━━━┫");
                }
            }
        }
        System.out.println("┗━━━┻━━━┻━━━┛");
    }

    public static void printBoard(char[] board){
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");

            if((i +1) % 3 ==0){
                System.out.println();
            }

        }
    }

    public static boolean isAvailable( char[] board , int indexNumber){
        char x = 'X';
        char o = 'O';

        if(board[indexNumber-1] == o || board[indexNumber-1] == x){
            return false;
        }
        return true;
    }

    public static int getPositionFromUser(char[] board){
        Scanner scanner = new Scanner(System.in);

        int position;

        while(true){
            System.out.println("Please enter the position you would like to enter your symbol: ");

            position = scanner.nextInt();

            if(position <1 || position > 9){
                System.out.println("Invalid position, please try again- this number out of range.");
                continue;
            }

            if(isAvailable(board, position)){
                return position;
            }
            else{
                System.out.println("Position already taken, please choose another position.");
            }

        }
    }

    public static char checkWinner(char[] board){
        for (int i = 0; i < 9; i+=3) {
            if(board[i] != ' ' && board[i] == board[i+1] && board[i] == board[i+2]){
                return board[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[i] != ' ' && board[i] == board[i+3] && board[i] == board[i+6]){
                return board[i];
            }
        }
        if(board[0] != ' ' && board[0] == board[4] && board[0] == board[8]){
            return board[0];
        }
        if(board[2] != ' ' && board[2] == board[4] && board[2] == board[6]){
            return board[2];
        }
        return '-';
    }

    public static boolean placeSymbolOnBoard(char[] board, int position , char currentPlayer){
        board[position-1] = currentPlayer;
        printBoardd(board);
        char winner = checkWinner(board);
        if(winner == 'X' || winner == 'O'){
            System.out.println("YooHoo " + winner + " is the winner!");
            return true;
        }
        return false;
    }

}
