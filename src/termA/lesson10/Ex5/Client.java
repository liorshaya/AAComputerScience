package termA.lesson10.Ex5;

public class Client {
    private String name;
    private Item[] toBuy;
    private int budget;

    public Item[] getToBuy(){
        return this.toBuy;
    }

    public void setToBuy(Item[] toBuy){
        this.toBuy = toBuy;
    }

    public void setBudget(int budget){
        this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }

    public boolean hasEnoughBudget(){
        double totalCost = 0;
        for (int i = 0; i < toBuy.length; i++) {
            totalCost += toBuy[i].getCost();
        }
        if(totalCost > budget){
            return false;
        }
        return true;
    }

}
