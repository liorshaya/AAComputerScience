package termA.lesson10.Ex5;

public class Item {
    private String name;
    private double cost;
    private int count;

    public Item(String name, double cost , int count){
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public String getName(){
        return this.name;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }

    public boolean existInInventory(){
        if(this.count != 0){
            return true;
        }
        return false;
    }

    public int decrementCount(int amount){
        if(this.count >= amount){
            this.count -= amount;
            return 0;
        }
        else{
            int difference = amount - this.count;
            this.count = 0;
            return difference;
        }
    }

    public String toString(){
        return "Product name: " + this.name + " cost: " + this.cost + "₪,";
    }
}
