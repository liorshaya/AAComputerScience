package StudyForFun.YearA.Madmah2.Person;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Mark" , 53);
        Person p2 = new Person("Aark" , 30);
        Person p3 = new Person("Mark" , 29);
        Person p4 = new Person("Aark" , 2);
        Person p5 = new Person("Aark" , 4);
        Person p6 = new Person("Aark" , 5);

        p1.addChild(p2);
        p1.addChild(p3);
        p2.addChild(p4);
        p2.addChild(p5);
        p3.addChild(p6);

        System.out.println(p1.isGrandFather());
        char commonLetter = p1.mostCommonStartingLetter();
        System.out.println("The most common starting letter is: " + commonLetter);

    }
}
