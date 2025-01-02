package termA.lesson10.Ex4;

public class Hotel {
    private String name;
    private Room[] rooms;

    public Room[] roomsThatMeetConditions(int type , int budget){
        int counter = 0;
        for (int i = 0; i < this.rooms.length; i++) {
            if(rooms[i].getAvailable() && rooms[i].getType() == type && rooms[i].calculatePrice() < budget){
                counter++;
            }
        }
        Room[] roomMeetConditionsArray = new Room[counter];
        int index = 0;
        for (int i = 0; i < counter; i++) {
            if(rooms[i].getAvailable() && rooms[i].getType() == type && rooms[i].calculatePrice() < budget){
                roomMeetConditionsArray[index] = rooms[i];
            }
        }
        return roomMeetConditionsArray;
    }

    public Room[] getRooms(){
        return this.rooms;
    }

}
