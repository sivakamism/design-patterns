package observers;

import core.Room;

public class Lights implements Observer {
    @Override
    public void update(Room room) {
        if (room.isOccupied()) {
            System.out.println("Lights in Room " + room.getId() + " turned on.");
        } else {
            System.out.println("Lights in Room " + room.getId() + " turned off.");
        }
    }
}
