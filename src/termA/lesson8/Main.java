package termA.lesson8;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 7;
        clock.minutes = 6;
        clock.seconds = 4;

        Clock clock1 = new Clock();
        clock1.hours = 7;
        clock1.minutes = 20;
        clock1.seconds = 10;

        //clock.print();
        clock.printAmPm();

        //boolean result = clock.isValid();
        //System.out.println(result);

        //clock.randomize();

        //boolean isMorning = clock.isMorning();
        //System.out.println(isMorning);

       // clock.tick();
        //clock.print();

        //System.out.println();
        //int compareClocks = clock.compare(clock1);
        //System.out.println(compareClocks);

        //int secondsDiff = clock.secondsDiff(clock1);
        //System.out.println(secondsDiff);

        //clock.addSeconds(20000);
        //clock.addMinutes(4000);
        clock.addHours(200);
    }

}
