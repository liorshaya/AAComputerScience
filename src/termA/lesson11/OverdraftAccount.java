package termA.lesson11;

public class OverdraftAccount extends BankAccount{
    private int creditLine;

    public OverdraftAccount(String ownerFirstName , String ownerLastName , int creditLine){
        super(ownerFirstName,ownerLastName);
        this.creditLine = creditLine;
    }

    @Override
    public boolean withdraw(int sum) {
        if(((this.getBalance() - sum) * -1)> this.creditLine){
            return false;
        }
        Transaction[] history = this.getHistory();
        Transaction[] temp = new Transaction[history.length+1];
        for (int i = 0; i < history.length; i++) {
            temp[i] = history[i];
        }
        temp[history.length] = new Transaction(this.getBalance() , this.getBalance()-sum , 1);
        this.setBalance(this.getBalance()-sum);
        this.setHistory(temp);
        return true;
    }
}
