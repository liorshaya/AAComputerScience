package termA.lesson10.Ex1;

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
        children[1].month = 2;


        children[2] = new Child();
        children[2].boy = true;
        children[2].year = 2012;
        children[2].month = 7;


        children[3] = new Child();
        children[3].boy = true;
        children[3].year = 2010;
        children[3].month = 2;

        children[4] = new Child();
        children[4].boy = false;
        children[4].year = 2012;
        children[4].month = 1;


        countBoyGirlInYear(children ,2012);
        printHighestMonthBoyLowestGirlsMonth(children);

        System.out.println(checkWhichAvgBigger(children));

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
            int boyCounter = 0;
            int girlCounter = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i].boy){
                    if (array[i].month == array[j].month){
                        boyCounter++;
                    }
                }
                else{
                    if (array[i].month == array[j].month){
                        girlCounter++;
                    }
                }
            }
            if(boyCounter > monthHighBoy){
                monthHighBoy = boyCounter;
                currentHighMonthBoy = array[i].month;
            }
            if(girlCounter > monthLowGirl){
                monthLowGirl = girlCounter;
                currentLowMonthGirl = array[i].month;
            }
        }

        System.out.println("Month with most boys: " + currentHighMonthBoy);
        System.out.println("Month with most girls: " + currentLowMonthGirl);

    }

    public static int checkWhichAvgBigger(Child[] array){
        int sumBoyYears = 0;
        int sumGirlYears = 0;

        int boyCount = 0;
        int girlCount = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].boy){
                sumBoyYears += array[i].year;
                boyCount++;
            }
            else{
                sumGirlYears += array[i].year;
                girlCount++;
            }
        }
        double avgBoy = (double) sumBoyYears /boyCount;
        double avgGirl = (double) sumGirlYears /girlCount;

        if(avgBoy < avgGirl){
            return 1;
        }
        else if (avgBoy > avgGirl){
            return -1;
        }
        else {
            return 0;
        }
    }

}
