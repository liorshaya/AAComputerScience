package termA.lesson9.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        s1.setBattery(40);
        s1.setYear(2022);
        s1.setChargingMinutes(20);

        System.out.println(s1);
        s1.charge(20);
        System.out.println(s1);
        s1.startApp("Instagram", 10);
        s1.startApp("Instagram", 20);
        s1.startApp("Other", 5);

        System.out.println(s1);
        String b = s1.mostPopularApp();
        System.out.println(b);

        System.out.println(s1.minutesToFullCharge());
    }
}
