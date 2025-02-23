package StudyForFun.YearA.Madmah2.Shift;

public class Sister extends Emplyee{
    private boolean mainSister;

    public Sister(String firstName, String lastName, int expYear ,boolean mainSister){
        super(firstName,lastName,expYear);
        this.mainSister = mainSister;
    }
}
