package termA.lesson10.Ex5;

public class Client {
    private String name;
    private Item[] toBuy;
    private int budget;

    public Client(String name , Item[] toBuy , int budget){
        this.name = name;
        this.toBuy = toBuy;
        this.budget =budget;
    }

    public String getName(){
        return this.name;
    }

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

    public double sumItemsPriceClient(){
        double totalCost = 0;
        for (int i = 0; i < toBuy.length; i++) {
            totalCost += toBuy[i].getCost();
        }
        return totalCost;
    }

    public String toString(){
        String items = "";
        for (int i = 0; i < this.toBuy.length; i++) {
            items += toBuy[i] + " ";
        }
        return "Client name: " + this.name + ", Items to buy: " + items + "and budget: " + this.budget + "₪.";
    }

}
