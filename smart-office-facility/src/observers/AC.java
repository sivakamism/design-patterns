package observers;

import core.Room;

public class AC implements Observer {
    @Override
    public void update(Room room) {
        if (room.isOccupied()) {
            System.out.println("AC in Room " + room.getId() + " turned on.");
        } else {
            System.out.println("AC in Room " + room.getId() + " turned off.");
        }
    }
}
