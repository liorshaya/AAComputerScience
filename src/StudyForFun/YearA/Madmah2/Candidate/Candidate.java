package StudyForFun.YearA.Madmah2.Candidate;

public class Candidate {
    private String name;
    private boolean male;
    private int experienceYears;
    private String[] stack;

    public boolean isJunior(){
        if(this.experienceYears <= 2){
            return true;
        }
        return false;
    }

    public boolean isSenior(){
        if(this.experienceYears >= 5 && this.stack.length >= 10){
            return true;
        }
        return false;
    }

    public boolean getMale(){
        return this.male;
    }
}
