package termA.lesson10.Ex4;

public class Hotel {
    private String name;
    private Room[] rooms;

    public Room[] roomsThatMeetConditions(int type , int budget){
        int counter = 0;
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].getAvailable() && rooms[i].getType() == type && rooms[i].calculatePrice() <= budget){
                counter++;
            }
        }
        Room[] roomMeetConditionsArray = new Room[counter];
        int index = 0;
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].getAvailable() && rooms[i].getType() == type && rooms[i].calculatePrice() <= budget){
                roomMeetConditionsArray[index] = rooms[i];
                index++;
            }
        }
        return roomMeetConditionsArray;
    }

    public Room[] getRooms(){
        return this.rooms;
    }

    public void setRooms(Room[] rooms){
        this.rooms = rooms;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int income(){
        int calculateIncome = 0;
        for (int i = 0; i < rooms.length; i++) {
            if(!rooms[i].getAvailable()){
                calculateIncome += rooms[i].calculatePrice();
            }
        }
        return calculateIncome;
    }


}
