package StudyForFun.YearA.Madmah2.Shift;

public class FamilyDoc extends Emplyee {
    private int avgP;

    public FamilyDoc(String firstName , String lastName , int expYear , int avgP){
        super(firstName,lastName,expYear);
        this.avgP = avgP;
    }
}
