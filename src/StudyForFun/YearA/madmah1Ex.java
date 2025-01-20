package StudyForFun.YearA;

import java.util.Scanner;

public class madmah1Ex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius for circle: ");
        double radius = scn.nextFloat();
        double pi = 3.14;

        double setah = pi*(radius*radius);
        System.out.println("Setah: " + setah);
        double area = 2*pi*radius;
        System.out.println("Area: " + area);
    }
}

class ex2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter orech malben: ");
        int orech = scn.nextInt();
        System.out.println("Etner rochav malben: ");
        int rochav = scn.nextInt();

        int area = 2 * orech + 2 * rochav;
        System.out.println("Area: " + area);
        int setach = orech * rochav;
        System.out.println("Setach: " + setach);

    }
}

class ex3{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first nitzav: ");
        double nitzav1 = scn.nextInt();
        System.out.println("Enter second nitzav: ");
        double nitzav2 = scn.nextInt();
        double yeter = (nitzav1*nitzav1)+(nitzav2*nitzav2);
        System.out.println("Yeter: " + Math.sqrt(yeter));
    }
}

class ex4{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int thisYear = 2025;
        System.out.println("Ether your age: ");
        int age = scn.nextInt();
        int addYears = 2040 - thisYear;
        System.out.println("In 2024 your age will be: " + (age+addYears));
    }
}

class ex5{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter " + (i+1)+"'s" + " number: ");
            int number = scn.nextInt();
            sum += number;
        }

        System.out.println("The average is: "+ sum/4f);
    }
}

class ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product price: ");
        int price = scanner.nextInt();
        System.out.println("Enter kg product: ");
        int weight = scanner.nextInt();
        System.out.println("Ether km from store: ");
        int kmFromStore = scanner.nextInt();
        System.out.println("Ether your floor: ");
        int floor = scanner.nextInt();

        double finalPrice = price + (5 * kmFromStore + floor * weight)*1.1;
        double feeAndShipping = (5 * kmFromStore + floor * weight)*1.1;

        System.out.println("The final price is: " + finalPrice + " for product that cost: " + price + " and the shipping cost is: "
             + feeAndShipping*0.9  +  " and the fee for the delivery is: " + feeAndShipping * 0.1 );
    }
}

class ex7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        System.out.println(num%10);
    }
}

class ex8{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        System.out.println(num/10);
    }
}

class ex9{

}