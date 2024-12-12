package StudyForFun.YearA;

import java.util.Scanner;

public class Dec24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        String[] studentsList = new String[numberOfStudents];
        scanner.nextLine();

        for (int i = 0; i < studentsList.length; i++) {
            System.out.println("Enter student name: ");
            studentsList[i] = scanner.nextLine();
        }
        System.out.println("Enter a name to search:");
        String name = scanner.nextLine();
        boolean checkStudentInList = isStudentInList(studentsList,name);
        if(checkStudentInList){
            System.out.println(name + " is in the list!");
        }
        else{
            System.out.println(name + " not in the list");
        }


        System.out.println("If you want to add another student press 1");
        int checkFlag = scanner.nextInt();
        if(checkFlag == 1){
            System.out.println("Enter a student");
            scanner.nextLine();
            String name1 = scanner.nextLine();
            System.out.println("New list:");
            printArray(addStudent(studentsList,name1));

        }


    }
    public static boolean isStudentInList(String[] students , String name){
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(name)){
                return true;
            }
        }
        return false;
    }
    public static String[] addStudent(String[] students , String name){
        String[] newArr = new String[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            newArr[i] = students[i];
        }
        newArr[students.length] = name;
        return newArr;
    }

    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
