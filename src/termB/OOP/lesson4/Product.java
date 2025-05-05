package termB.OOP.lesson4;

public class Product {
    private String descProd;
    private int price;
    private int count;

    public Product(String descProd , int price , int count){
        this.descProd = descProd;
        this.price = price;
        this.count = count;
    }

    public void lowQuantity(){
        if(this.count > 0){
            count--;
        }
    }
}
