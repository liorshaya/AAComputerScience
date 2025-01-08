package termA.lesson10.Ex6;

public class Main {
    public static void main(String[] args) {
        LottoForm loto1 = new LottoForm("Moti" , true);
        LottoForm loto2 = new LottoForm("Avi" , true);
        LottoForm loto3 = new LottoForm("Or" , true);
        LottoForm loto4 = new LottoForm("Lior" , true);
        LottoForm loto5 = new LottoForm("Dor" , true);

        LottoForm[] lotoforms = {loto1, loto2, loto3 , loto4 , loto5};

        Lottery lottery = new Lottery();

    }
}
