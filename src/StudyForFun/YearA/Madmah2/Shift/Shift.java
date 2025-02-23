package StudyForFun.YearA.Madmah2.Shift;

public class Shift {
    private Emplyee[] emplyees;
    private Metupal[] metupals;

    public String mostYearVetek(){
        int mostVetek = 0;
        String nameMostVetek = emplyees[0].getFullName();
        for (int i = 0; i < this.emplyees.length; i++) {
            if(this.emplyees[i].getExpYear() > mostVetek){
                mostVetek = this.emplyees[i].getExpYear();
                nameMostVetek = emplyees[i].getFullName();
            }
        }
        return nameMostVetek;
    }

    public Metupal[] onlyDahufMetupalimArray(int type){
        int counter = 0;
        for (int i = 0; i < metupals.length; i++) {
            if(metupals[i].getType() == type && metupals[i].getDahuf()){
                counter++;
            }
        }
        Metupal[] newArray = new Metupal[counter];
        int index = 0;
        for (int i = 0; i < metupals.length; i++) {
            if(metupals[i].getType() == type && metupals[i].getDahuf()){
                newArray[index] = metupals[i];
                index++;
            }
        }
        return newArray;
    }
}
