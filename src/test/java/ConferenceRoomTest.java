import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guestEmmi;
    private Guest guestJenken;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom(10, "Boardroom");
        guestEmmi = new Guest("Emmi");
        guestJenken = new Guest("Jenken");
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom.addGuest(guestJenken);
        assertEquals(1, conferenceRoom.countGuests());
    }
}