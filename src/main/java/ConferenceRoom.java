public class ConferenceRoom {
    private Integer roomNumber;
    private Integer capacity;
    private String name;
    private ArrayList<Guest> guestsInConferenceRoom;

    public ConferenceRoom(int roomNumber, int capacity, String name){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.name = name;
    }
}

