package termA.lesson9.Ex2;

public class Member {

    String firstName;
    String lastName;
    Team team;
    int yearsInCompany;
    int yearsInTech;

    public boolean isSenior(){
        if(yearsInCompany >= 3 || yearsInTech >= 5){
            return true;
        }
        return false;
    }
}
