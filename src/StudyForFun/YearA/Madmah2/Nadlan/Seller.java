package StudyForFun.YearA.Madmah2.Nadlan;

public class Seller {
    private String firstName;
    private String lastName;
    private int phoneNumber;

    public Seller(String firstName , String lastName , int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
