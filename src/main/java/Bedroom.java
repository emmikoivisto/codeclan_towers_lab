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
    }
}
