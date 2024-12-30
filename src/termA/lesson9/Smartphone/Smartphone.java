package termA.lesson9.Smartphone;

public class Smartphone {

    private int year;
    private int battery;
    private int chargingMinutes;
    private int[] appsUsedCounter = new int[4];



    public void setYear(int year) {
        this.year = year;
    }

    public void setBattery(int battery){
        this.battery = battery;
    }

    public void setChargingMinutes(int chargingMinutes){
        this.chargingMinutes = chargingMinutes;
    }

    public boolean needsCharging() {
        if (this.battery <= 15) {
            return true;
        }
        return false;
    }

    public boolean isBatteryFull() {
        if (this.battery == 100) {
            return true;
        }
        return false;
    }

    public boolean isNewPhone() {
        if (this.year >= 2021) {
            return true;
        }
        return false;
    }

    public boolean charge(int minutes) {
        if (this.battery < 100) {
            if (this.year == 2024) {
                this.battery += minutes;
                this.chargingMinutes += minutes;
                if (this.battery > 100) {
                    this.battery = 100;
                }
                return true;
            } else if (this.year >= 2021) {
                this.battery += (int) (minutes * 0.75);
                this.chargingMinutes += minutes;
                if (this.battery > 100) {
                    this.battery = 100;
                }
                return true;
            } else {
                this.battery += (int) (minutes * 0.5);
                this.chargingMinutes += minutes;
                if (this.battery > 100) {
                    this.battery = 100;
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String newOld = "";
        if (this.year >= 2021) {
            newOld = "New";
        } else {
            newOld = "Old";
        }
        return "This phone is: " + newOld + ", charged for: " + this.chargingMinutes + " minutes and the battery is: " + this.battery + "%.";
    }

    public boolean startApp(String app, int minutes) {
        if (app.equals("Waze")) {
            int checker = this.battery - (int) (minutes * 1.2);
            if (checker >= 0) {
                this.battery -= (int) (minutes * 1.2);
                this.appsUsedCounter[0]++;
                return true;
            }
        } else if (app.equals("Gmail")) {
            int checker = this.battery - (int) (minutes * 0.3);
            if (checker >= 0) {
                this.battery -= (int) (minutes * 0.3);
                this.appsUsedCounter[1]++;
                return true;
            }
        } else if (app.equals("Instagram")) {
            int checker = this.battery - (int) (minutes * 0.5);
            if (checker >= 0) {
                this.battery -= (int) (minutes * 0.5);
                this.appsUsedCounter[2]++;
                return true;
            }
        } else {
            int checker = this.battery - minutes ;
            if (checker >= 0) {
                this.battery -= minutes;
                this.appsUsedCounter[3]++;
                return true;
            }
        }
        return false;
    }

    public String mostPopularApp(){
        int maxUsege = 0;
        int index = 0;
        for (int i = 0; i < this.appsUsedCounter.length; i++) {
           if(this.appsUsedCounter[i] > maxUsege){
               maxUsege = this.appsUsedCounter[i];
               index = i;
           }
        }
        if(index == 0){
            return "Waze";
        } else if (index == 1) {
            return "Gmail";
        } else if (index == 2) {
            return "Instagram";
        }else{
            return "Other";
        }
    }

    public int minutesToFullCharge(){
        if(isBatteryFull()){
            return 0;
        } else if (this.year == 2024) {
            return 100 - this.battery;
        } else if (isNewPhone()) {
            int checker = (int)((100 - this.battery)/ 0.75) ;
            return checker;
        }
        else{
            int checker = (int)((100 - this.battery)/ 0.5) ;
            return checker;
        }
    }

}
