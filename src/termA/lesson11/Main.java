package termA.lesson11;

public class Main {
    public static void main(String[] args) {
        Transaction tran1 = new Transaction(10000 , 4000 , 1);
        System.out.println(tran1);

        BankAccount ba1 = new BankAccount("Lior", "Shaya");
        System.out.println(ba1);
    }
}
