package StudyForFun.YearA.Madmah2.Person2;

public class Main {
    public static void main(String[] args) {

    }
    public String familyWithMostMinors(Family[] families){
        int mostCount = 0;
        String lastNameMostFamily = "";

        for (int i = 0; i < families.length; i++) {
            int currCount = families[i].getNumOfMinorInFamily();
            if(currCount > mostCount){
                mostCount = currCount;
                lastNameMostFamily = families[i].getLastName();
            }
        }
        return lastNameMostFamily;
    }
}
