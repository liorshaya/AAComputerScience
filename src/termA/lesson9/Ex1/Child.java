package termA.lesson9.Ex1;

public class Child {

    String name;
    boolean boy;
    int year;
    int month;

    public boolean isOlder(Child other){
        if(this.year < other.year){
            return true;
        }
        if(this.year == other.year && this.month < other.month){
            return true;
        }
        return false;
    }
}
