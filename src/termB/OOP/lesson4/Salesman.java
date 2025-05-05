package termB.OOP.lesson4;

import java.time.DayOfWeek;
import java.util.*;

public class Salesman {
    private String firstName;
    private String lastName;
    private int salary;
    private Map<String,List<Product>> salesByDay;

    public Salesman(String firstName , String lastName , int salary ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.salesByDay = new HashMap<>();
        for(String day : Store.DAY_OF_WEEK){
            salesByDay.put(day,new ArrayList<>());
        }

    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
