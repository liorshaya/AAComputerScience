package termA.lesson10.Ex4;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2006,3, true);
        Room room2 = new Room(132,2, true);



        System.out.println(room1.floor());
        System.out.println(room1.calculatePrice());

        //Room[] rooms = roomsThatMeetConditions(2, 4000);

    }
}
