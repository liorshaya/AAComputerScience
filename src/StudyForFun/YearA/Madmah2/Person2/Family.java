package StudyForFun.YearA.Madmah2.Person2;

public class Family {
    private String lastName;
    private Person[] people;

    public boolean isLargeFamily(){
        int count = 0;
        if(people == null || people.length < 4){
            return false;
        }

        for (int i = 0; i < people.length; i++) {
            if(people[i].isMinor()){
                count++;
                if(count > 3){
                    return true;
                }
            }
        }

        return false;
    }

    public double calculateAverageAge(boolean male){
        int count = 0;
        double avgAgeSum = 0;
        if(male){
            for (int i = 0; i < people.length; i++) {
                if(people[i].getMale()){
                    count++;
                    avgAgeSum+= people[i].age();
                }
            }
        }
        else {
            for (int i = 0; i < people.length; i++) {
                if(!people[i].getMale()){
                    count++;
                    avgAgeSum+= people[i].age();
                }
            }
        }
        return avgAgeSum/count;
    }

    public Person[] getPeople(){
        return this.people;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getNumOfMinorInFamily(){
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i].isMinor()){
                count++;
            }
        }
        return count;
    }
}
