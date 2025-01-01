package termA.lesson9.LectureEncapsulation;

public class Bucket {

    private int capacity;
    private int current;

    public Bucket(){
        this.capacity = 20;
    }

    public String toString(){
        return "The current state of the bucket: " + this.current + " of " + this.capacity + " liters.";
    }

    public boolean isEmpty(){
        if(this.current == 0){
            return true;
        }
        return false;
    }


    public boolean isFull(){
        if(this.current == this.capacity){
            return true;
        }
        return false;
    }

    public float percent(){
        return (this.current / (float) this.capacity) * 100 ;
    }

    public boolean addLiter(){
        if(!isFull()){
            this.current++;
            return true;
        }
        else{
            return false;
        }
    }

    public int addLiters(int amount){
        int tempCurrent = this.current;
        if(this.current + amount <= this.capacity){
            this.current = this.current + amount;
            return 0;
        }
        else{
            this.current = this.capacity;//20 15 10
            return tempCurrent + amount - this.capacity;
        }
    }

    public boolean spill(){
        if(isEmpty()){
            return false;
        }
        else{
            this.current = 0;
            return true;
        }
    }

    public boolean spill(int amount){
        if(this.current < amount){
            return false;
        }
        else {
            this.current -= amount;
            return true;
        }
    }

    public void fill(){
        this.current = this.capacity;
    }

    public void setCurrent(int x){
        this.current = x;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getCurrent(){
        return this.current;
    }


    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void fill(Bucket other){
        if(!isFull()){
            for (int i = this.current; i <= this.capacity; i++) {
                if(other.current > 0 && this.current != this.capacity){
                    this.current++;
                    other.current--;
                }
            }
        }
    }



}
