package StudyForFun.YearA.Madmah2.Emplyee;

public class Main {
    public static void main(String[] args) {

    }
    public String employeeWithHighestSalary(Employee[] employees){
        if(employees == null || employees.length == 0 ){
            return "No employees available";
        }

        float mostSalary = employees[0].calculateSalary();
        String nameMostSalary = "";

        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].calculateSalary() > mostSalary ){
                mostSalary = employees[i].calculateSalary();
                nameMostSalary = employees[i].getName();
            }
        }
        return nameMostSalary;
    }
}
