package StudyForFun.YearA.Madmah2.Person2;

public class Person {
    private String name;
    private int birthYear;
    private boolean male;

    public Person(String name , int birthYear , boolean male){
        this.name = name;
        this.birthYear = birthYear;
        this.male = male;
    }

    public boolean isMinor(){
        int thisYear = 2025;
        return thisYear - this.birthYear < 18;
    }

    public boolean getMale(){
        return this.male;
    }

    public int age(){
        int thisYear= 2025;
        return thisYear - this.birthYear;
    }
}
