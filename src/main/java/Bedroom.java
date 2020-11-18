import java.util.ArrayList;

public class Bedroom {

    private Integer roomNumber;
    private Integer capacity;
    private String roomType;
    private ArrayList<Guest> guestsInBedroom;

    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guestsInBedroom = new ArrayList<>();
    }

    public int countGuests(){
        return this.guestsInBedroom.size();
    }

    public void addGuest(Guest guest){
        if (this.countGuests() < this.capacity ){
        this.guestsInBedroom.add(guest);
        }
    }

}
