package termA.lesson10.Ex6;

import java.util.Random;

public class Lottery {
    private LottoForm[] forms;
    private int[] winningNumbers;
    private int winningStrong;

    public LottoForm[] getForms(){
        return this.forms;
    }

    public void setForms(LottoForm[] forms){
        this.forms = forms;
    }

    public int[] getWinningNumbers(){
        return this.winningNumbers;
    }

    public void setWinningNumbers(int[] winningNumbers){
        this.winningNumbers = winningNumbers;
    }

    public int getWinningStrong(){
        return this.winningStrong;
    }

    public void setWinningStrong(int winningStrong){
        this.winningStrong = winningStrong;
    }

    public void randomizeWinningNumbers(){
        Random rnd = new Random();
        this.winningNumbers = new int[6];

        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = rnd.nextInt(37) + 1;
        }

        this.winningStrong = rnd.nextInt(7) + 1;
    }

//    public LottoForm[] getWinners(){
//        randomizeWinningNumbers();
//        int counter = 0;
//        for (int i = 0; i < this.forms.length; i++) {
//            if(this.forms[i].getNumbers() == winningNumbers && this.forms[i].getStrong() == winningStrong){
//                this.forms[i]
//            }
//
//        }
//    }
}
