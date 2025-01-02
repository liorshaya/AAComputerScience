package termA.lesson10.Ex4;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(240,1, false);
        Room room2 = new Room(132,2, true);
        Room room3 = new Room(243,2, false);
        Room room4 = new Room(1102,1, true);
        Room room5 = new Room(621,1, true);
        Room room6 = new Room(102,1, false);
        Room room7 = new Room(1937,1, false);

        Room room8 = new Room(200,3, false);
        Room room9 = new Room(246,3, true);
        Room room10 = new Room(693,3, false);
        Room room11 = new Room(394,3, true);
        Room room12 = new Room(196,3, true);
        Room room13 = new Room(390,2, false);
        Room room14 = new Room(1702,3, true);



        //System.out.println(room4.floor());
        //System.out.println(room1.calculatePrice());
        Hotel hotel1 = new Hotel();
        Hotel hotel2 = new Hotel();
        Hotel hotel3 = new Hotel();

        Room[] allRooms1 = {room1,room2,room3,room4,room5,room6, room7};
        Room[] allRooms2 = {room8,room9,room10,room11,room12,room13, room14};
        Room[] allRooms3 = {room1,room9,room3,room11,room5,room13, room7};

        hotel1.setRooms(allRooms1);
        hotel2.setRooms(allRooms2);
        hotel3.setRooms(allRooms3);

        hotel1.setName("Dan");
        hotel2.setName("Crown Plaza");
        hotel3.setName("Royal Beach");


        Hotel[] hotels = {hotel1,hotel2,hotel3};

        String hotelName = mostProfitable(hotels);
        System.out.println(hotelName);



        Room[] rooms = hotel1.roomsThatMeetConditions(2, 5000);

        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i] + " ");
        }
        System.out.println("Expected hotel1 income: " + hotel2.income());

    }

    public static String mostProfitable(Hotel[] hotels){
        int currentProfi;
        String nameHotel;
        int mostProfi = hotels[0].income();
        nameHotel = hotels[0].getName();
        for (int i = 0; i < hotels.length; i++) {
            currentProfi = hotels[i].income();
            if(currentProfi > mostProfi){
                mostProfi = currentProfi;
                nameHotel = hotels[i].getName();
            }

        }
        return nameHotel;
    }
}
