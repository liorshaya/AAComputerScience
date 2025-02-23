package StudyForFun.YearA.Madmah2.Shift;

public abstract class Emplyee {
    private String firstName;
    private String lastName;
    private int expYear;

    public Emplyee(String firstName , String lastName , int expYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expYear = expYear;
    }

    public int getExpYear(){
        return this.expYear;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
