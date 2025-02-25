package StudyForFun.YearA.Madmah2.Hightech;

public class Candidate {
    private int expYeat;
    private int hopeSalary;
    private String[] codeType;
    private int avgGrade;

    public int suitableApplicant(){
        if(this.avgGrade >= 80 && this.countKnowLang() >= 2 && this.hopeSalary <= 16000){
            return 1;
        }
        else if(this.expYeat >= 3 && this.countKnowLang() == 3 && this.hopeSalary <= 30000){
            return 2;
        }
        else{
            return 0;
        }
    }

    public int countKnowLang(){
        int count = 0;
        for (int i = 0; i < this.codeType.length; i++) {
            if(this.codeType[i].equals("PYTHON")|| this.codeType[i].equals("JAVA")|| this.codeType[i].equals("JAVASCRIPT")){
                count++;
            }
        }
        return count;
    }

    public int getAvgGrade(){
        return this.avgGrade;
    }

    public int getExpYear(){
        return this.expYeat;
    }

    public int getHopeSalary(){
        return this.hopeSalary;
    }



}
