import java.util.ArrayList;

public class ConferenceRoom {
    private Integer capacity;
    private String name;
    private ArrayList<Guest> guestsInConferenceRoom;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guestsInConferenceRoom = new ArrayList<>();
    }

    public int countGuests(){
        return this.guestsInConferenceRoom.size();
    }

    public void addGuest(Guest guest){
        this.guestsInConferenceRoom(guest);
    }
}

