package StudyForFun.YearA.Madmah2.Emplyee;

public class SalesPerson extends Employee{
    private int salesSum;

    public SalesPerson(String name , float hourSalary , int yearOfExperience , int salesSum){
        super(name,hourSalary,yearOfExperience);
        this.salesSum = salesSum;
    }

    public float calculateSalary(){
        double bonus = this.salesSum*0.05;
        return (float)((180* this.getHourSalary()) + bonus);
    }
}
