package termA.lesson10.Ex3;

public class Delivery {

    float price;
    String address;
    String name;

    public String getCityName(){
        return this.address.split(",")[1];
    }
}
