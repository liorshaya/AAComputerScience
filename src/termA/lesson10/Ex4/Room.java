package termA.lesson10.Ex4;

public class Room {
    private int number;
    private int type;
    private boolean available;


    public Room(int number , int type , boolean available){
        this.number = number;
        this.type = type;
        this.available = available;
    }

    public int floor(){
        return this.number/100;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getType(){
        return this.type;
    }

    public void setType(int type){
        this.type = type;
    }

    public boolean getAvailable(){
        return this.available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public int calculatePrice(){
        int price = 2000;
        if(floor()> 10){
            int floorsOver10 = floor() - 10;
            price += floorsOver10 * 100;
        }

        if(this.number % 100 <= 4){
            price += 200;
        }

        if(this.type == 1){
            return price;
        }
        else if (this.type ==2) {
            return (int)(price * 1.5);
        }
        else{
            return (int)(price * 2.5);
        }

    }
}
