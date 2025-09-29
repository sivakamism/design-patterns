package core;

import java.util.*;
import observers.*;

public class Office {
    private static Office instance;
    private Map<Integer, Room> rooms;

    private Office() { rooms = new HashMap<>(); }

    public static Office getInstance() {
        if (instance == null) instance = new Office();
        return instance;
    }

    public void configureRooms(int count) {
        rooms.clear();
        for (int i = 1; i <= count; i++) {
            Room room = new Room(i);
            room.attach(new AC());
            room.attach(new Lights());
            rooms.put(i, room);
        }
        System.out.print("Office configured with " + count + " meeting rooms: ");
        for (int i = 1; i <= count; i++) {
            System.out.print("Room " + i);
            if (i != count) System.out.print(", ");
        }
        System.out.println(".");
    }

    public Room getRoom(int id) { return rooms.get(id); }
    public Collection<Room> getRooms() { return rooms.values(); }
}
