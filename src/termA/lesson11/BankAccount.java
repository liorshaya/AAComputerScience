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

//    public String toString(){
//        return "Full name: " + getOwnerFullName() + ", Balance: " + this.balance;
//    }

    public void deposit(int sum){
        Transaction[] temp = new Transaction[this.history.length+1];
        for (int i = 0; i < this.history.length; i++) {
            temp[i] = this.history[i];
        }
        temp[this.history.length] = new Transaction(this.balance, this.balance + sum , 2);
        this.balance += sum;
        this.history = temp;
    }

    public String toString(){
        String allTransactions = "";
        for (int i = 0; i < this.history.length; i++) {
            allTransactions += i+1 + ". " + this.history[i].toString() + "\n";
        }
        return "Full name: " + getOwnerFullName() + ", Balance: " + this.balance + "." + "\n" + allTransactions;
    }

    public boolean withdraw(int sum){
        if(this.balance >= sum){
            Transaction[] temp = new Transaction[this.history.length+1];
            for (int i = 0; i < this.history.length; i++) {
                temp[i] = this.history[i];
            }
            temp[this.history.length] = new Transaction(this.balance , this.balance - sum , 1);
            this.balance -= sum;
            this.history = temp;
            return true;
        }
        return false;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public Transaction[] getHistory(){
        return this.history;
    }

    public void  setHistory(Transaction[] history){
        this.history = history;
    }

}
