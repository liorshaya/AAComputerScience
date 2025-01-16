package termA.lesson11;

public class BankAccount {
    private String ownerFirstName;
    private String ownerLastName;
    private int balance;
    private Transaction[] history;

    public BankAccount(String ownerFirstName , String ownerLastName ){
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.balance = 0;
        this.history = new Transaction[0];
    }

    public String getOwnerFullName(){
        return this.ownerFirstName + " " + this.ownerLastName;
    }

    public String toString(){
        return "Full name: " + getOwnerFullName() + ", Balance: " + this.balance;
    }

    public void deposit(int sum){
        this.balance += sum;


    }

}
