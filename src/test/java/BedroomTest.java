import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guestEmmi;
    private Guest guestJenken;

    @Before
    public void setUp(){
        bedroom = new Bedroom(1, 2, "Double");
        guestEmmi = new Guest("Emmi");
        guestJenken = new Guest("Jenken");

    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guestEmmi);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void cantAddGuest(){
        bedroom.addGuest(guestEmmi);
        bedroom.addGuest(guestEmmi);
        bedroom.addGuest(guestJenken);
        assertEquals(2, bedroom.countGuests());
    }
}
