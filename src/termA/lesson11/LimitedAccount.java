package termA.lesson11;

public class LimitedAccount extends BankAccount{
    private int limit;

    public LimitedAccount(String ownerFirstName , String ownerLastName, int balance , int limit){
        super(ownerFirstName , ownerLastName , balance);
        this.limit = limit;
    }

    @Override
    public boolean withdraw(int sum) {
        if(this.limit >= sum){
            return super.withdraw(sum);
        }
        return false;
    }
}
