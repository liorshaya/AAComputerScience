package termA.lesson8;

import java.util.Random;

public class Clock {

    int seconds;
    int minutes;
    int hours;

    void print() {
        if (this.hours < 10) {
            System.out.print(0);
        }
        System.out.print(this.hours + ":");
        if (this.minutes < 10) {
            System.out.print(0);
        }
        System.out.print(this.minutes + ":");
        if (this.seconds < 10) {
            System.out.print(0);
        }
        System.out.print(this.seconds);
    }

    void printAmPm() {
        int original = this.hours;
        int pmHours = this.hours % 12;


        if (pmHours == 0) {
            pmHours = 12;
        }
        if (original >= 12) {
            this.hours = pmHours;
            print();
            System.out.print(" PM");
        } else {
            print();
            System.out.print(" AM");
        }
        System.out.println();
        this.hours = original;

    }

    boolean isValid() {
        if (this.hours >= 0 && this.hours < 24) {
            if (this.minutes >= 0 && this.minutes <= 59) {
                if (this.seconds >= 0 && this.seconds <= 59) {
                    return true;
                }
            }
        }
        return false;
    }

    void randomize() {
        Random random = new Random();

        this.hours = random.nextInt(24);
        this.minutes = random.nextInt(60);
        this.seconds = random.nextInt(60);
        print();
        System.out.println();

    }

    boolean isMorning() {
        if (this.hours >= 8 && this.hours <= 11) {
            return true;
        }
        return false;
    }

    void tick() {
        if (this.seconds == 59 && this.minutes == 59 && this.hours == 23) {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        } else if (this.seconds == 59 && this.minutes == 59) {
            this.hours++;
            this.minutes = 0;
            this.seconds = 0;
        } else if (this.seconds == 59) {
            this.minutes++;
            this.seconds = 0;
        } else {
            this.seconds++;
        }
    }

    int compare(Clock other) {
        if (this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds) {
            return 0;
        }
        if (this.hours > other.hours) {
            return 1;
        }
        if (this.hours == other.hours && this.minutes > other.minutes) {
            return 1;
        }
        if (this.minutes == other.minutes && this.seconds > other.seconds) {
            return 1;
        }

        return -1;
    }

    int secondsDiff(Clock other) {
        int absoluteSumHours;
        int hours = this.hours - other.hours;
        if (hours < 0) {
            absoluteSumHours = -hours;
        } else {
            absoluteSumHours = hours;
        }
        int differenceHours = absoluteSumHours * 3600;


        int absoluteSumMinutes;
        int minutes = this.minutes - other.minutes;
        if (minutes < 0) {
            absoluteSumMinutes = -minutes;
        } else {
            absoluteSumMinutes = minutes;
        }
        int differenceMinutes = absoluteSumMinutes * 60;


        int absoluteSumSeconds;
        int seconds = this.seconds - other.seconds;
        if (seconds < 0) {
            absoluteSumSeconds = -seconds;
        } else {
            absoluteSumSeconds = seconds;
        }
        int differenceSeconds = absoluteSumSeconds;

        return differenceHours + differenceMinutes + differenceSeconds;
    }

    void addSeconds(int toAdd) {
        this.seconds += toAdd;

        if (this.seconds >= 60) {
            this.minutes += this.seconds / 60;
            this.seconds %= 60;
        }
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
        if (this.hours >= 24) {
            this.hours %= 24;
        }
        print();
    }

    void addMinutes(int toAdd) {
        this.minutes += toAdd;
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
        if (this.hours >= 24) {
            this.hours %= 24;
        }
        print();
    }

    void addHours(int toAdd) {
        this.hours += toAdd;

        if (this.hours >= 24) {
            this.hours %= 24;
        }
        print();
    }
}