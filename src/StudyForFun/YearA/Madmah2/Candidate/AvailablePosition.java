package StudyForFun.YearA.Madmah2.Candidate;

public class AvailablePosition {
    private String description;
    private int count;
    private Candidate[] candidates;

    public boolean inviteForInterviews(){
        if(this.candidates.length >= 20){
            int count = 0;
            for (int i = 0; i < this.candidates.length; i++) {
                if(candidates[i].isSenior()){
                    count++;
                }
            }
            if(count >= 4){
                int counterMale = 0;
                int counterFemale = 0;
                for (int i = 0; i < this.candidates.length; i++) {
                    if(candidates[i].getMale()){
                        counterMale++;
                    }
                    else{
                        counterFemale++;
                    }
                }
                int checkDiff = Math.abs(counterMale - counterFemale);
                if(checkDiff <= 5){
                    return true;
                }
            }
        }
        return false;
    }

    public Candidate[] createSpecialInterviewsList(){
        int maleCount = 0;
        int femaleCount = 0;

        for (int i = 0; i < this.candidates.length; i++) {
            if(candidates[i].getMale()){
                maleCount++;
            }
            else{
                femaleCount++;
            }
        }

        int sizeNewArray = Math.min(maleCount,femaleCount) * 2;
        Candidate[] newArray = new Candidate[sizeNewArray];
        int index = 0;
        int maleIndex =0;
        int femaleIndex = 0;
        for (int i = 0; i < this.candidates.length && maleIndex < newArray.length/2; i++) {
            if(candidates[i].getMale()){
                newArray[index] = candidates[i];
                index++;
                maleIndex++;
            }
        }
        for (int i = 0; i < this.candidates.length && femaleIndex < newArray.length/2; i++) {
            if(!candidates[i].getMale()){
                newArray[index] = candidates[i];
                index++;
                femaleIndex++;
            }
        }
        return newArray;
    }
}
