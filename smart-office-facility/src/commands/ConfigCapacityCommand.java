package commands;

import core.Room;

public class ConfigCapacityCommand implements Command {
    private Room room;
    private int capacity;

    public ConfigCapacityCommand(Room r, int c) {
        this.room = r;
        this.capacity = c;
    }

    @Override
    public void execute() {
        if (room != null) room.setCapacity(capacity);
    }
}
