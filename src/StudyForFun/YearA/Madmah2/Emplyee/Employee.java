package StudyForFun.YearA.Madmah2.Emplyee;

public class Employee {
    private String name;
    private float hourSalary;
    private int yearOfExperience;

    public Employee(String name , float hourSalary , int yearOfExperience){
        this.name = name;
        this.hourSalary = hourSalary;
        this.yearOfExperience = yearOfExperience;
    }

    public float calculateSalary(){
        return this.hourSalary * 180;
    }

    public float getHourSalary(){
        return this.hourSalary;
    }

    public String getName(){
        return this.name;
    }
}
