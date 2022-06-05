import classwork.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {

    Hotel myHotel;

    @BeforeEach
    public void SetUpHotel() {
        myHotel = new Hotel(5);
    }

    @Test
    public void TestConstructor() {
        myHotel = new Hotel(5);
        int numOfRms = myHotel.getRoom().length;
        assertEquals(5, numOfRms);
    }

    @Test
    public void CheckThatWeHaveRooms() {
        String[] roomInTheHotel = myHotel.getRoom();
        assertNotNull(roomInTheHotel);
    }

    @Test
    public void CheckThatTheRoomsAreEmpty() {
        String[] roomInTheHotel = myHotel.getRoom();
        for (String room : roomInTheHotel) {
            assertNull(room);
        }
    }

    @Test
    public void CheckThatRoomsCanBeBooked() {
        String name = "Eden";
        String nameOfOccupant = myHotel.bookARoom(name);
        System.out.println(nameOfOccupant);
        String roomNumber = myHotel.guestRoomNumber(1);
        assertEquals(name, roomNumber);
        String name2 = "Abobo";
        String nameOfOccupant2 = myHotel.bookARoom(name2);
        System.out.println(nameOfOccupant2);
        String roomNumber2 = myHotel.guestRoomNumber(2);
        assertEquals(name2, roomNumber2);
    }

    @Test
    public void CheckOut() {
        String name = "Eden";
        String book = myHotel.bookARoom(name);
        String roomNumber = myHotel.guestRoomNumber(1);
        String check = myHotel.checkOutOfRoom(1);
        assertEquals("Eden has successfully checked out.", check);

    }


}
