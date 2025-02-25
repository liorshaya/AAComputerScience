package StudyForFun.YearA.Madmah2.Hightech;

public class Main {
    public static void main(String[] args) {

    }
    public static Candidate mostSuitable(Candidate[] candidates, int type){
        Candidate bestCandidate = candidates[0];
        if(type == 1 ){
            int maxAvg = 0;
            for (int i = 0; i < candidates.length; i++) {
                if(candidates[i].suitableApplicant() == 1){
                    if(candidates[i].getAvgGrade() > maxAvg){
                        maxAvg = candidates[i].getAvgGrade();
                        bestCandidate = candidates[i];
                    }
                }
            }
            return bestCandidate;
        }
        else if(type == 2){
            int maxExpYear = 0;
            for (int i = 0; i < candidates.length; i++) {
                if(candidates[i].suitableApplicant() == 2){
                    if(candidates[i].getExpYear() > maxExpYear){
                        maxExpYear = candidates[i].getExpYear();
                        bestCandidate = candidates[i];
                    }
                }

            }
            return bestCandidate;
        }
        else{
            int lowestHopeSalary = candidates[0].getHopeSalary();
            for (int i = 0; i < candidates.length; i++) {
                if(candidates[i].suitableApplicant() == 0){
                    if(candidates[i].getHopeSalary() < lowestHopeSalary){
                        lowestHopeSalary = candidates[i].getHopeSalary();
                        bestCandidate = candidates[i];
                    }
                }

            }
            return bestCandidate;
        }

    }
}
