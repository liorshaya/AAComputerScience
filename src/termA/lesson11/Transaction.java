package termA.lesson11;

public class Transaction {
    private int before;
    private int after;
    private int type;

    public Transaction(int before, int after , int type){
        this.before = before;
        this.after = after;
        this.type = type;
    }

    public String toString(){
        String typeTran = "";
        if(this.type == 1){
            typeTran = "Withdraw";
        }
        else if(this.type == 2){
            typeTran = "Deposit";
        }
        else {
            typeTran = "Fees";
        }
        return "Transaction type: " + typeTran + ", " + "Balance before transaction: " + this.before + "$, "+ "Balance after transaction: " + this.after + "$.";
    }
}
