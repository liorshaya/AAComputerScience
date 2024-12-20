package termA.lesson8.Ex1;

public class Main {
    public static void main(String[] args) {
        Child[] children = new Child[5];

        children[0] = new Child();
        children[0].boy = true;
        children[0].year = 2012;
        children[0].month = 7;

        children[1] = new Child();
        children[1].boy = false;
        children[1].year = 2012;
        children[1].month = 4;


        children[2] = new Child();
        children[2].boy = true;
        children[2].year = 2012;
        children[2].month = 7;


        children[3] = new Child();
        children[3].boy = true;
        children[3].year = 2012;
        children[3].month = 7;

        children[4] = new Child();
        children[4].boy = false;
        children[4].year = 2012;
        children[4].month = 4;


        countBoyGirlInYear(children ,2012);
        printHighestMonthBoyLowestGirlsMonth(children);

    }

    public static void countBoyGirlInYear(Child[] array , int year){
        int boyCount = 0;
        int girlCount = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].year == year){
                if(array[i].boy){
                    boyCount++;
                }
                else{
                    girlCount++;
                }
            }
        }
        System.out.println("Boys Count: " + boyCount);
        System.out.println("Girls Count: " + girlCount);

    }

    public static void printHighestMonthBoyLowestGirlsMonth(Child[] array){
        int monthHighBoy = 0;
        int monthLowGirl = 0;

        int currentHighMonthBoy = 0;
        int currentLowMonthGirl = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = 0; j < array.length; j++) {
                if(array[i].boy && i != j){
                    if (array[i].month == array[j].month){
                        counter++;
                    }
                }
            }
            if(counter > monthHighBoy){
                monthHighBoy = counter;
                currentHighMonthBoy = array[i].month;
            }
        }

        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = 0; j < array.length; j++) {
                if(!array[i].boy && i != j){
                    if (array[i].month == array[j].month){
                        counter++;
                    }
                }
            }
            if(counter > monthLowGirl){
                monthLowGirl = counter;
                currentLowMonthGirl = array[i].month;
            }
        }
        System.out.println("Month with most boys: " + currentHighMonthBoy);
        System.out.println("Month with most girls: " + currentLowMonthGirl);

    }

}
