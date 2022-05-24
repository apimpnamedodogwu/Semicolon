package chapterSevenClasswork;

public class Hotel {

    private String[] room;


    public Hotel(int numberOfRooms) {

        room = new String[numberOfRooms];
    }

    public String[] getRoom() {
        return room;
    }


    public String bookARoom(String name) {
        for (int roomVar = 0; roomVar < room.length; roomVar++) {
            if (room[roomVar] == null) {
                room[roomVar] = name;
                return "Successfully booked by " + name;
            }
        }
        return "Sorry, we're completely booked";
    }

    public String guestRoomNumber(int roomNumber) {
        return room[roomNumber - 1];
    }

    public String checkOutOfRoom(int roomNumber) {
      String name = room[roomNumber - 1];
      room[roomNumber - 1] = null;
      return name + " has successfully checked out.";
        }

    }



