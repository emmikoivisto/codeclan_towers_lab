import org.junit.Before;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, "Double");
        conferenceRoom = new ConferenceRoom(10, "Boardroom");
    }
}

