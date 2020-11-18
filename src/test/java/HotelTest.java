import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guestEmmi;
    Guest guestJenken;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, "Double");
        conferenceRoom = new ConferenceRoom(10, "Boardroom");
        guestEmmi = new Guest("Emmi");
        guestJenken = new Guest("Jenken");
    }

    @Test
    public void canAddGuestToRoom(){
        hotel.checkIn(guestEmmi, bedroom);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void cantAddGuestsToRoom(){
        hotel.checkIn(guestEmmi, bedroom);
        hotel.checkIn(guestEmmi, bedroom);
        hotel.checkIn(guestEmmi, bedroom);
        assertEquals(2, bedroom.countGuests());
    }
}

