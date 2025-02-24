package StudyForFun.YearA.Madmah2.Emplyee;

public class Manager extends Employee{
    private int bounsPercent;

    public Manager(String name , float hourSalary , int yearOfExperience , int bounsPercent){
        super(name, hourSalary, yearOfExperience);
        this.bounsPercent = bounsPercent;
    }

    public float calculateSalary(){
        return (this.getHourSalary() * 180 * this.bounsPercent);
    }
}
