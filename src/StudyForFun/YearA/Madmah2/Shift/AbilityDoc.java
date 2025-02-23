package StudyForFun.YearA.Madmah2.Shift;

public class AbilityDoc extends Emplyee{
    private int avgP;
    private String ability;

    public AbilityDoc(String firstName, String lastName , int expYear,int avgP, String ability){
        super(firstName,lastName,expYear);
        this.avgP = avgP;
        this.ability = ability;
    }
}
