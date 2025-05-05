package termB.OOP.lesson4;

import java.util.*;

public class Store {
    public static final List<String> DAY_OF_WEEK = Arrays.asList("Sunday",
            "Monday","Thursday", "Wednesday", "Thursday", "Friday" , "Saturday");

    private String name;
    private List<Salesman> salesmen;
    private List<Product> products;
    private Map<String, List<Product>> bonusProducts;
    private Random rnd = new Random();

    public Store(String name, List<Salesman> salesmen , List<Product> products){
        this.name = name;
        this.salesmen = salesmen;
        this.products = products;
        for(String day : DAY_OF_WEEK){
            List<Product> dailyBonus = new ArrayList<>();
            int bonusCount = rnd.nextInt(3) + 1;


        }
    }
}
